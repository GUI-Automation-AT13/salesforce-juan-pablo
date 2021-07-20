package core.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

    /**
     * .
     * @return .
     */
    public static String dateToString() {
        Date fecha = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MMddyyyyhhmmss");
        return df.format(fecha);
    }

    /**
     * .
     * @return .
     */
    public static String currentDateToString() {
        Date fecha = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/M/yyyy HH:mm");
        return df.format(fecha);
    }
}
