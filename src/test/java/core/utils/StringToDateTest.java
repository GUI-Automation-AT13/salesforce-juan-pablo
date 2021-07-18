package core.utils;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToDateTest {

    private StringToDate calendar;
    private Calendar newCalendar;
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    @Test
    public void testToday() {
        calendar = new StringToDate();
        newCalendar = Calendar.getInstance();
        Date actual = calendar.convertirString("TODAY");
        Date expected = newCalendar.getTime();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testYesterday() {
        calendar = new StringToDate();
        newCalendar = Calendar.getInstance();
        Date actual = calendar.convertirString("YESTERDAY");
        newCalendar.add(Calendar.DAY_OF_MONTH, -1);
        Date expected = newCalendar.getTime();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTomorrow() {
        calendar = new StringToDate();
        newCalendar = Calendar.getInstance();
        Date actual = calendar.convertirString("TOMORROW");
        newCalendar.add(Calendar.DAY_OF_MONTH, +1);
        Date expected = newCalendar.getTime();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTwoDaysAgo() {
        calendar = new StringToDate();
        newCalendar = Calendar.getInstance();
        Date actual = calendar.convertirString("2 days ago");
        newCalendar.add(Calendar.DATE, -2);
        Date expected = newCalendar.getTime();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test15MinutesFromNow() {
        calendar = new StringToDate();
        newCalendar = Calendar.getInstance();
        Date actual = calendar.convertirString("15 minutes from now");
        newCalendar.add(Calendar.MINUTE, 15);
        Date expected = newCalendar.getTime();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test5monthsFromNow() {
        calendar = new StringToDate();
        newCalendar = Calendar.getInstance();
        Date actual = calendar.convertirString("5 months from now");
        newCalendar.add(Calendar.MONTH, 5);
        Date expected = newCalendar.getTime();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test3yearsAgo() {
        calendar = new StringToDate();
        newCalendar = Calendar.getInstance();
        Date actual = calendar.convertirString("3 years ago");
        newCalendar.add(Calendar.YEAR, -3);
        Date expected = newCalendar.getTime();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test1dayAgo() {
        calendar = new StringToDate();
        newCalendar = Calendar.getInstance();
        Date actual = calendar.convertirString("1 day ago");
        newCalendar.add(Calendar.DATE, -1);
        Date expected = newCalendar.getTime();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testValidDate() throws ParseException {
        calendar = new StringToDate();
        Date actual = calendar.convertirString("7/14/2021");
        System.out.println(actual);
        Date expected = dateFormat.parse("7/14/2021");
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {RuntimeException.class, ParseException.class})
    public void testDateNull() {
        Date actual = calendar.convertirString(null);
    }

    @Test(expectedExceptions = {RuntimeException.class, ParseException.class})
    public void testEmptyDate() {
        Date actual = calendar.convertirString("");
    }
}