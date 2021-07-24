/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package core.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

    /**
     * Gets the current date to transform a String.
     *
     * @return String a current with the established format.
     */
    public static String dateToString() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MMddyyyyhhmmss");
        return df.format(date);
    }

    /**
     * Gets the current date to transform a String.
     *
     * @return String a current with the established format.
     */
    public static String currentDateToString() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/M/yyyy HH:mm");
        return df.format(date);
    }
}
