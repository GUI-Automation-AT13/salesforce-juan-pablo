/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToDate {

    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    /**
     * Transforms a string in a date type.
     *
     * @param value string with dates information.
     * @return a Date value.
     */
    public Date convertirString(final String value) {
        String valor = value.toLowerCase();
        Calendar calendar = Calendar.getInstance();
        Date actualDate = calendar.getTime();
        try {
            if (valor.contains("/")) {
                return dateFormat.parse(valor);
            }
            if (valor.equals("today")) {
                return actualDate;
            } else if (valor.equals("yesterday")) {
                calendar.add(Calendar.DAY_OF_MONTH, -1);
                return calendar.getTime();
            } else if (valor.equals("tomorrow")) {
                calendar.add(Calendar.DAY_OF_MONTH, +1);
                return calendar.getTime();
            }
            String[] actions = cutString(valor);
            if (actions[actions.length - 1].contains("ago")) {
                return calculateDate(Integer.parseInt(actions[0]) * -1, actions[1], calendar);
            } else {
                return calculateDate(Integer.parseInt(actions[0]), actions[1], calendar);
            }
        } catch (RuntimeException | ParseException exception) {
            throw new RuntimeException("It is not a Date Valid");
        }
    }

    /**
     * Divides the string value.
     *
     * @param value String with the phrases date.
     * @return a array String.
     */
    public String[] cutString(final String value) {
        return value.split(" ");
    }

    /**
     * Calculates the correct date.
     *
     * @param value    time for the new date.
     * @param property of time.
     * @param calendar instance of Calendar.
     * @return a Date with de time modified.
     */
    public Date calculateDate(final int value, final String property, final Calendar calendar) {
        if (property.contains("year")) {
            calendar.add(Calendar.YEAR, value);
            return calendar.getTime();
        }
        if (property.contains("month")) {
            calendar.add(Calendar.MONTH, value);
            return calendar.getTime();
        }
        if (property.contains("day")) {
            calendar.add(Calendar.DATE, value);
            return calendar.getTime();
        }
        if (property.contains("hour")) {
            calendar.add(Calendar.HOUR, value);
            return calendar.getTime();
        }
        if (property.contains("min")) {
            calendar.add(Calendar.MINUTE, value);
            return calendar.getTime();
        }
        if (property.contains("sec")) {
            calendar.add(Calendar.SECOND, value);
            return calendar.getTime();
        }
        return null;
    }
}
