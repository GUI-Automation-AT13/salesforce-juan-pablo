package junittest;

import core.utils.StringToDate;
import org.testng.annotations.Test;

public class StringToDateTest {

    @Test
    public void testConvertStringToDate() {
        StringToDate stringToDate = new StringToDate();
        stringToDate.convertStringToDate("hola");
    }
}
