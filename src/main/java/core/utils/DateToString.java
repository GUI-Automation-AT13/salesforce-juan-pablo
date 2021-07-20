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
}
