package core.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToDate {

    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    public String convertirString(final String value) {
        String valor = value.toLowerCase();
        Calendar calendar = Calendar.getInstance();
        Date actualDate = calendar.getTime();
        try {

            if (valor.equals("today")) {
                return dateFormat.format(actualDate);
            } else if (valor.equals("yesterday")) {
                calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DATE) - 1);
                return dateFormat.format(calendar.getTime());
            } else if (valor.equals("tomorrow")) {
                calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DATE) + 1);
                return dateFormat.format(calendar.getTime());
            }
            String[] actions = cutString(valor);
            if(actions[actions.length-1].contains("ago")) {
                return calculateDate(Integer.parseInt(actions[0]) * -1, actions[1], calendar);
            } else {
                return calculateDate(Integer.parseInt(actions[0]), actions[1], calendar);
            }

        } catch (RuntimeException e) {
            throw new RuntimeException("It is not a Date Valid");
        }
    }

    public String[] cutString(final String value) {
        return value.split(" ");
    }

    public String calculateDate(final int value, final String property, final Calendar calendar) {
        if (property.contains("year")) {
            calendar.add(Calendar.YEAR, value);
            return dateFormat.format(calendar.getTime());
        }
        if (property.contains("month")) {
            calendar.add(Calendar.MONTH, value);
            return dateFormat.format(calendar.getTime());
        }
        if (property.contains("day")) {
            calendar.add(Calendar.DATE, value);
            return dateFormat.format(calendar.getTime());
        }
        if (property.contains("hour")) {
            calendar.add(Calendar.HOUR, value);
            return dateFormat.format(calendar.getTime());
        }
        if (property.contains("min")) {
            calendar.add(Calendar.MINUTE, value);
            return dateFormat.format(calendar.getTime());
        }
        if (property.contains("seg")) {
            calendar.add(Calendar.SECOND, value);
            return dateFormat.format(calendar.getTime());
        }
        return null;
    }
}
