package core.utils;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.*;

public class StringToDateTest {

    private StringToDate calendar;
    private Calendar newCalendar;
    private Date newActualDate;
    SimpleDateFormat dateFormat;

    @BeforeTest
    public void setup() {
        calendar = new StringToDate();
        newCalendar = Calendar.getInstance();
        newActualDate = newCalendar.getTime();
        dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    }

    @Test
    public void testToday() {
        String actual = calendar.convertirString("TODAY");
        String expected = dateFormat.format(newActualDate.getTime());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testYesterday() {
        String actual = calendar.convertirString("YESTERDAY");
        newCalendar.set(Calendar.DAY_OF_MONTH, newCalendar.get(Calendar.DATE) - 1);
        String expected = dateFormat.format(newCalendar.getTime());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTomorrow() {
        String actual = calendar.convertirString("TOMORROW");
        newCalendar.set(Calendar.DAY_OF_MONTH, newCalendar.get(Calendar.DATE) + 1);
        String expected = dateFormat.format(newCalendar.getTime());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTwoDaysAgo() {
        String actual = calendar.convertirString("2 days ago");
        newCalendar.set(Calendar.DATE, newCalendar.get(Calendar.DATE) - 2);
        String expected = dateFormat.format(newCalendar.getTime());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test15MinutesFromNow() {
        String actual = calendar.convertirString("15 minutes from now");
        newCalendar.set(Calendar.MINUTE, newCalendar.get(Calendar.MINUTE) + 15);
        String expected = dateFormat.format(newCalendar.getTime());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test5monthsFromNow() {
        String actual = calendar.convertirString("5 months from now");
        newCalendar.set(Calendar.MONTH, newCalendar.get(Calendar.MONTH) + 5);
        String expected = dateFormat.format(newCalendar.getTime());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test3yearsAgo() {
        String actual = calendar.convertirString("3 years ago");
        newCalendar.set(Calendar.YEAR, newCalendar.get(Calendar.YEAR) - 3);
        String expected = dateFormat.format(newCalendar.getTime());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test1dayAgo() {
        String actual = calendar.convertirString("1 day ago");
        newCalendar.set(Calendar.DATE, newCalendar.get(Calendar.DATE) - 1);
        String expected = dateFormat.format(newCalendar.getTime());
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {RuntimeException.class})
    public void testDateNull() {
        String actual = calendar.convertirString(null);
    }

    @Test(expectedExceptions = {RuntimeException.class})
    public void testEmptyDate() {
        String actual = calendar.convertirString("");
    }
}