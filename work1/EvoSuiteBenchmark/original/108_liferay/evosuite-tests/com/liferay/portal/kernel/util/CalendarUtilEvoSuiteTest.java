/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.CalendarUtil;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CalendarUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        CalendarUtil.isFuture(1552, 1552, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(4, 4, 4);
      Date date0 = CalendarUtil.getGTDate((Calendar) gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=-62030448000000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GB\",offset=0,dstSavings=3600000,useDaylight=true,transitions=242,lastRule=java.util.SimpleTimeZone[id=GB,offset=0,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=4,MONTH=4,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=4,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", gregorianCalendar0.toString());
      assertEquals(0, date0.getDay());
  }

  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = CalendarUtil.isJulianDate(0, 0, 0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      boolean boolean0 = CalendarUtil.isGregorianDate(1367, 1367, 30);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try {
        CalendarUtil.getDays(locale0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 0, 0, 0, 0);
      int int0 = CalendarUtil.getDaysInMonth((Calendar) gregorianCalendar0);
      assertEquals(31, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try {
        CalendarUtil.isBroadcastDate(0, 31, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int[] intArray0 = CalendarUtil.getMonthIds();
      assertNotNull(intArray0);
  }

  @Test
  public void test8()  throws Throwable  {
      Date date0 = new Date();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 0, 0);
      TimeZone timeZone0 = gregorianCalendar0.getTimeZone();
      // Undeclared exception!
      try {
        CalendarUtil.getAge(date0, timeZone0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(941, 941, 941, 941, 941, 941);
      Date date0 = CalendarUtil.getLTDate((Calendar) gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=-29912468599000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GB\",offset=0,dstSavings=3600000,useDaylight=true,transitions=242,lastRule=java.util.SimpleTimeZone[id=GB,offset=0,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1022,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=4,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=56,SECOND=41,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", gregorianCalendar0.toString());
      assertEquals((-29912457600010L), date0.getTime());
  }

  @Test
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try {
        CalendarUtil.getMonths(locale0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try {
        CalendarUtil.isAfter(2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021, timeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try {
        CalendarUtil.isFuture(1244, 1244);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Date date0 = new Date((-17L));
      // Undeclared exception!
      try {
        CalendarUtil.afterByDay(date0, date0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try {
        CalendarUtil.isFuture(0, 0, 0, (-576973), 0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      CalendarUtil calendarUtil0 = new CalendarUtil();
      assertNotNull(calendarUtil0);
  }

  @Test
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try {
        CalendarUtil.getDays(locale0, "0");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = CalendarUtil.getDaysInMonth(0, 0);
      assertEquals(31, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 0, 0, 1552, 0, 0);
      int int0 = CalendarUtil.getDaysInMonth((Calendar) gregorianCalendar0);
      assertEquals(31, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(400, 400, 23, 59, 59, 23);
      int int0 = CalendarUtil.getDaysInMonth((Calendar) gregorianCalendar0);
      assertEquals(31, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = (GregorianCalendar)Calendar.getInstance();
      int int0 = CalendarUtil.getDaysInMonth((Calendar) gregorianCalendar0);
      assertEquals(1372741887181L, gregorianCalendar0.getTimeInMillis());
      assertEquals(31, int0);
  }

  @Test
  public void test21()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-318), (-318), (-318));
      int int0 = CalendarUtil.getDaysInMonth((Calendar) gregorianCalendar0);
      assertEquals(31, int0);
  }

  @Test
  public void test22()  throws Throwable  {
      int int0 = CalendarUtil.getDaysInMonth(9, 9);
      assertEquals(31, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      int int0 = CalendarUtil.getDaysInMonth((-1), 0);
      assertEquals(29, int0);
  }

  @Test
  public void test24()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(106, 16, 16, (-381), (-381), 16);
      int int0 = CalendarUtil.getDaysInMonth((Calendar) gregorianCalendar0);
      assertEquals(30, int0);
  }

  @Test
  public void test25()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1367, 1367, 191, 30, 191);
      int int0 = CalendarUtil.getDaysInMonth((Calendar) gregorianCalendar0);
      assertEquals(30, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1620, 339, 1620, 339, 339);
      int int0 = CalendarUtil.getDaysInMonth((Calendar) gregorianCalendar0);
      assertEquals(30, int0);
  }

  @Test
  public void test27()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1367, 1367, (-1));
      int int0 = CalendarUtil.getDaysInMonth((Calendar) gregorianCalendar0);
      assertEquals(30, int0);
  }

  @Test
  public void test28()  throws Throwable  {
      int int0 = CalendarUtil.getDaysInMonth((-1122), (-1122));
      assertEquals(28, int0);
  }

  @Test
  public void test29()  throws Throwable  {
      int int0 = CalendarUtil.getDaysInMonth(1244, 1244);
      assertEquals(29, int0);
  }

  @Test
  public void test30()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 0, 0, 0, 0);
      int int0 = CalendarUtil.getGregorianDay((Calendar) gregorianCalendar0);
      assertEquals((-576973), int0);
  }

  @Test
  public void test31()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(106, 16, 16, (-381), (-381), 16);
      gregorianCalendar0.clear();
      int int0 = CalendarUtil.getGregorianDay((Calendar) gregorianCalendar0);
      assertEquals(141824, int0);
  }

  @Test
  public void test32()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-1122), (-1122), 28, 28, 28);
      gregorianCalendar0.setFirstDayOfWeek(28);
      int int0 = CalendarUtil.getLastDayOfWeek((Calendar) gregorianCalendar0);
      assertEquals(6, int0);
  }

  @Test
  public void test33()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(400, 400, 23, 59, 59, 23);
      int int0 = CalendarUtil.getLastDayOfWeek((Calendar) gregorianCalendar0);
      assertEquals(7, int0);
  }

  @Test
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      GregorianCalendar gregorianCalendar0 = (GregorianCalendar)Calendar.getInstance(locale0);
      int int0 = CalendarUtil.getLastDayOfWeek((Calendar) gregorianCalendar0);
      assertEquals(1372741988502L, gregorianCalendar0.getTimeInMillis());
      assertEquals(1, int0);
  }

  @Test
  public void test35()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1244, 1244, 5, 5, 5);
      gregorianCalendar0.setFirstDayOfWeek(5);
      int int0 = CalendarUtil.getLastDayOfWeek((Calendar) gregorianCalendar0);
      assertEquals(4, int0);
  }

  @Test
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try {
        CalendarUtil.getMonths(locale0, "_{VHK$6qP4#;mqi");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test37()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMAN;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0, locale0);
      Date date0 = gregorianCalendar0.getGregorianChange();
      Timestamp timestamp0 = CalendarUtil.getTimestamp(date0);
      assertEquals("java.util.GregorianCalendar[time=1372741999900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GB\",offset=0,dstSavings=3600000,useDaylight=true,transitions=242,lastRule=java.util.SimpleTimeZone[id=GB,offset=0,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2013,MONTH=6,WEEK_OF_YEAR=27,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=183,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=13,SECOND=19,MILLISECOND=900,ZONE_OFFSET=0,DST_OFFSET=3600000]", gregorianCalendar0.toString());
      assertEquals("Oct 15, 1582 12:00:00 AM", timestamp0.toLocaleString());
  }

  @Test
  public void test38()  throws Throwable  {
      Timestamp timestamp0 = CalendarUtil.getTimestamp((Date) null);
      assertNull(timestamp0);
  }

  @Test
  public void test39()  throws Throwable  {
      boolean boolean0 = CalendarUtil.isBroadcastDate(1244, 1244, 1244);
      assertEquals(false, boolean0);
  }

  @Test
  public void test40()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-1122), (-1122), 28, 28, 28);
      CalendarUtil.roundByMinutes((Calendar) gregorianCalendar0, 6);
      assertEquals((-100523273400000L), gregorianCalendar0.getTimeInMillis());
      assertEquals("java.util.GregorianCalendar[time=-100523273400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GB\",offset=0,dstSavings=3600000,useDaylight=true,transitions=242,lastRule=java.util.SimpleTimeZone[id=GB,offset=0,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1217,MONTH=6,WEEK_OF_YEAR=31,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=211,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=30,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test
  public void test41()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1367, 1367, (-1));
      GregorianCalendar gregorianCalendar1 = (GregorianCalendar)CalendarUtil.roundByMinutes((Calendar) gregorianCalendar0, 1367);
      assertEquals("java.util.GregorianCalendar[time=-15433372800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GB\",offset=0,dstSavings=3600000,useDaylight=true,transitions=242,lastRule=java.util.SimpleTimeZone[id=GB,offset=0,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1480,MONTH=10,WEEK_OF_YEAR=49,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=334,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertEquals((-15433372800000L), gregorianCalendar1.getTimeInMillis());
  }
}
