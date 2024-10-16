/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.GetterUtil_IW;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GetterUtil_IWEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[10];
      float[] floatArray0 = new float[8];
      float[] floatArray1 = getterUtil_IW0.getFloatValues(stringArray0, floatArray0);
      assertNotSame(floatArray1, floatArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      double double0 = getterUtil_IW0.getDouble((Object) "");
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)DateFormat.getInstance();
      Date[] dateArray0 = getterUtil_IW0.getDateValues((Object) "-1225", (DateFormat) simpleDateFormat0);
      assertNotNull(dateArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      float float0 = getterUtil_IW0.getFloat("", (-16.377827F));
      assertEquals((-16.377827F), float0, 0.01F);
  }

  @Test
  public void test4()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Short short0 = new Short((short)0);
      Short short1 = (Short)getterUtil_IW0.getNumber((Object) "", (Number) short0);
      assertEquals(0.0, short1.doubleValue(), 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      int int0 = getterUtil_IW0.getInteger(";f");
      assertEquals(0, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      double double0 = getterUtil_IW0.getDouble("HO=ywV#", 0.0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test7()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String string0 = getterUtil_IW0.get((Object) "u#", (String) null);
      assertEquals("u#", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat();
      Date date0 = getterUtil_IW0.getDate((Object) "#,##0.###", (DateFormat) simpleDateFormat0, (Date) null);
      assertNull(date0);
  }

  @Test
  public void test9()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("");
      Date date0 = getterUtil_IW0.getDate((Object) "de_DE", (DateFormat) simpleDateFormat0);
      assertEquals(2, date0.getDate());
  }

  @Test
  public void test10()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Double double0 = new Double((-1275.58992850803));
      Double double1 = (Double)getterUtil_IW0.getNumber("", (Number) double0);
      assertEquals("-1275.58992850803", double1.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      short short0 = getterUtil_IW0.get("0", (short)479);
      assertEquals((short)0, short0);
  }

  @Test
  public void test12()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[1];
      long[] longArray0 = getterUtil_IW0.getLongValues(stringArray0);
      assertNotNull(longArray0);
  }

  @Test
  public void test13()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[8];
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = getterUtil_IW0.getDoubleValues(stringArray0, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test
  public void test14()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      long long0 = getterUtil_IW0.getLong("D<4\"6T");
      assertEquals(46L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      double[] doubleArray0 = getterUtil_IW0.getDoubleValues((Object) "-6");
      assertNotNull(doubleArray0);
  }

  @Test
  public void test16()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      short[] shortArray0 = getterUtil_IW0.getShortValues((Object) "CNY");
      assertNotNull(shortArray0);
  }

  @Test
  public void test17()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[10];
      long[] longArray0 = new long[8];
      long[] longArray1 = getterUtil_IW0.getLongValues(stringArray0, longArray0);
      assertNotSame(longArray1, longArray0);
  }

  @Test
  public void test18()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      boolean boolean0 = getterUtil_IW0.getBoolean((Object) "UP", false);
      assertEquals(false, boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      float float0 = getterUtil_IW0.getFloat((Object) "-0x1.2832fep9", 0.0F);
      assertEquals((-1.2832E9F), float0, 0.01F);
  }

  @Test
  public void test20()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[6];
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)DateFormat.getDateTimeInstance();
      Date[] dateArray0 = new Date[1];
      Date[] dateArray1 = getterUtil_IW0.getDateValues(stringArray0, (DateFormat) simpleDateFormat0, dateArray0);
      assertNotSame(dateArray0, dateArray1);
  }

  @Test
  public void test21()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String string0 = getterUtil_IW0.get(";8jpuwZO", "_[5PcGgk");
      assertEquals(";8jpuwZO", string0);
      assertNotNull(string0);
  }

  @Test
  public void test22()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[7];
      boolean[] booleanArray0 = getterUtil_IW0.getBooleanValues(stringArray0);
      assertNotNull(booleanArray0);
  }

  @Test
  public void test23()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[6];
      double[] doubleArray0 = getterUtil_IW0.getDoubleValues(stringArray0);
      assertNotNull(doubleArray0);
  }

  @Test
  public void test24()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      short short0 = getterUtil_IW0.getShort("_grL9U\"bx$vf?`");
      assertEquals((short)9, short0);
  }

  @Test
  public void test25()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Object object0 = new Object();
      Object object1 = getterUtil_IW0.getObject(object0);
      assertSame(object1, object0);
  }

  @Test
  public void test26()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      long long0 = getterUtil_IW0.getLong((Object) "E", (long) 0);
      assertEquals(0L, long0);
  }

  @Test
  public void test27()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Integer integer0 = (Integer)getterUtil_IW0.get((Object) ";f", (Number) 0.0);
      assertEquals(0, integer0.byteValue());
  }

  @Test
  public void test28()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      long[] longArray0 = new long[5];
      long[] longArray1 = getterUtil_IW0.getLongValues((Object) "", longArray0);
      assertSame(longArray1, longArray0);
  }

  @Test
  public void test29()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[9];
      int[] intArray0 = getterUtil_IW0.getIntegerValues(stringArray0);
      assertNotNull(intArray0);
  }

  @Test
  public void test30()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      boolean boolean0 = getterUtil_IW0.get("9", true);
      assertEquals(false, boolean0);
  }

  @Test
  public void test31()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Locale locale0 = new Locale("HO=ywV#");
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)DateFormat.getTimeInstance(1, locale0);
      Date date0 = getterUtil_IW0.getDate("HO=ywV#", (DateFormat) simpleDateFormat0);
      assertEquals("2 Jul 2013 05:11:08 GMT", date0.toGMTString());
  }

  @Test
  public void test32()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Integer integer0 = (Integer)getterUtil_IW0.getNumber((Object) "French");
      assertEquals(0, integer0.intValue());
  }

  @Test
  public void test33()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      double double0 = getterUtil_IW0.getDouble((Object) "-0x1.9623516b52956p10", (-1624.551844435356));
      assertEquals((-1.9623516529561), double0, 0.01D);
  }

  @Test
  public void test34()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      long long0 = getterUtil_IW0.getLong("c[s<Ko>-Rs>gq|}p", 0L);
      assertEquals(0L, long0);
  }

  @Test
  public void test35()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      short short0 = getterUtil_IW0.getShort((Object) "0");
      assertEquals((short)0, short0);
  }

  @Test
  public void test36()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      int int0 = getterUtil_IW0.getInteger("$]", 0);
      assertEquals(0, int0);
  }

  @Test
  public void test37()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      int[] intArray0 = new int[5];
      int[] intArray1 = getterUtil_IW0.getIntegerValues((Object) "zh", intArray0);
      assertSame(intArray0, intArray1);
  }

  @Test
  public void test38()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat();
      Date date0 = getterUtil_IW0.getDate("#,##0.###", (DateFormat) simpleDateFormat0, (Date) null);
      assertNull(date0);
  }

  @Test
  public void test39()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      boolean boolean0 = getterUtil_IW0.getBoolean("0", false);
      assertEquals(false, boolean0);
  }

  @Test
  public void test40()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      int int0 = getterUtil_IW0.get("k@(", (int) (short)1932);
      assertEquals(1932, int0);
  }

  @Test
  public void test41()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      int[] intArray0 = getterUtil_IW0.getIntegerValues((Object) "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Europe/Isle_of_Man\",offset=0,dstSavings=3600000,useDaylight=true,transitions=242,lastRule=java.util.SimpleTimeZone[id=Europe/Isle_of_Man,offset=0,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=124,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=124,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=124,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
      assertNotNull(intArray0);
  }

  @Test
  public void test42()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      boolean boolean0 = getterUtil_IW0.get((Object) "", false);
      assertEquals(false, boolean0);
  }

  @Test
  public void test43()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      int int0 = getterUtil_IW0.getInteger((Object) null, 0);
      assertEquals(0, int0);
  }

  @Test
  public void test44()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String string0 = getterUtil_IW0.getString("", "");
      assertEquals("", string0);
  }

  @Test
  public void test45()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[10];
      int[] intArray0 = new int[5];
      int[] intArray1 = getterUtil_IW0.getIntegerValues(stringArray0, intArray0);
      assertNotSame(intArray1, intArray0);
  }

  @Test
  public void test46()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      boolean boolean0 = getterUtil_IW0.getBoolean("");
      assertEquals(false, boolean0);
  }

  @Test
  public void test47()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      float float0 = getterUtil_IW0.get("", 1354.9069F);
      assertEquals(1354.9069F, float0, 0.01F);
  }

  @Test
  public void test48()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String string0 = getterUtil_IW0.getString("<HTML>");
      assertEquals("<HTML>", string0);
  }

  @Test
  public void test49()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Object object0 = new Object();
      short[] shortArray0 = new short[2];
      short[] shortArray1 = getterUtil_IW0.getShortValues(object0, shortArray0);
      assertSame(shortArray1, shortArray0);
  }

  @Test
  public void test50()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[4];
      float[] floatArray0 = getterUtil_IW0.getFloatValues(stringArray0);
      assertNotNull(floatArray0);
  }

  @Test
  public void test51()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      boolean[] booleanArray0 = getterUtil_IW0.getBooleanValues((Object) "Fri Oct 15 00:00:00 GMT 1582");
      assertNotNull(booleanArray0);
  }

  @Test
  public void test52()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      long long0 = getterUtil_IW0.get((String) null, (-1L));
      assertEquals((-1L), long0);
  }

  @Test
  public void test53()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      short short0 = getterUtil_IW0.getShort("c[s<Ko>-Rs>gq|}p", (short) (-1));
      assertEquals((short) (-1), short0);
  }

  @Test
  public void test54()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Number[] numberArray0 = getterUtil_IW0.getNumberValues((Object) "E");
      assertNotNull(numberArray0);
  }

  @Test
  public void test55()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      float[] floatArray0 = getterUtil_IW0.getFloatValues((Object) "");
      assertNotNull(floatArray0);
  }

  @Test
  public void test56()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      double double0 = getterUtil_IW0.getDouble((String) null);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test57()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String string0 = getterUtil_IW0.getString((Object) "0", "0");
      assertEquals("0", string0);
  }

  @Test
  public void test58()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[4];
      short[] shortArray0 = new short[2];
      short[] shortArray1 = getterUtil_IW0.getShortValues(stringArray0, shortArray0);
      assertNotSame(shortArray0, shortArray1);
  }

  @Test
  public void test59()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Object object0 = new Object();
      boolean[] booleanArray0 = new boolean[3];
      boolean[] booleanArray1 = getterUtil_IW0.getBooleanValues(object0, booleanArray0);
      assertSame(booleanArray0, booleanArray1);
  }

  @Test
  public void test60()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      double double0 = getterUtil_IW0.get("]e~+-;Xx", 545.6895047856615);
      assertEquals(545.6895047856615, double0, 0.01D);
  }

  @Test
  public void test61()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[4];
      boolean[] booleanArray0 = new boolean[8];
      boolean[] booleanArray1 = getterUtil_IW0.getBooleanValues(stringArray0, booleanArray0);
      assertNotSame(booleanArray1, booleanArray0);
  }

  @Test
  public void test62()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      float float0 = getterUtil_IW0.get((Object) "30", 0.0F);
      assertEquals(30.0F, float0, 0.01F);
  }

  @Test
  public void test63()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      float float0 = getterUtil_IW0.getFloat((Object) "E");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test64()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String string0 = (String)getterUtil_IW0.getObject((Object) "E", (Object) "\uFFFD");
      assertEquals("E", string0);
      assertNotNull(string0);
  }

  @Test
  public void test65()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      boolean boolean0 = getterUtil_IW0.getBoolean((Object) "XXX");
      assertEquals(false, boolean0);
  }

  @Test
  public void test66()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      int int0 = getterUtil_IW0.get((Object) "German (Germany)", 1);
      assertEquals(1, int0);
  }

  @Test
  public void test67()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String string0 = getterUtil_IW0.getString((Object) null);
      assertEquals("", string0);
  }

  @Test
  public void test68()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      long long0 = getterUtil_IW0.get((Object) "1123.0935277911701", (-734L));
      assertEquals((-734L), long0);
  }

  @Test
  public void test69()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Object object0 = new Object();
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)DateFormat.getInstance();
      // Undeclared exception!
      try {
        getterUtil_IW0.get(object0, (DateFormat) simpleDateFormat0, (Date) null);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.Object cannot be cast to java.util.Date
         */
      }
  }

  @Test
  public void test70()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Date[] dateArray0 = new Date[7];
      Date[] dateArray1 = getterUtil_IW0.getDateValues((Object) "0", (DateFormat) null, dateArray0);
      assertSame(dateArray1, dateArray0);
  }

  @Test
  public void test71()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      long long0 = getterUtil_IW0.getLong((Object) "CEILING");
      assertEquals(0L, long0);
  }

  @Test
  public void test72()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[5];
      Date[] dateArray0 = getterUtil_IW0.getDateValues(stringArray0, (DateFormat) null);
      assertNotNull(dateArray0);
  }

  @Test
  public void test73()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      short short0 = getterUtil_IW0.getShort((Object) "", (short)1932);
      assertEquals((short)1932, short0);
  }

  @Test
  public void test74()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Number[] numberArray0 = new Number[8];
      // Undeclared exception!
      try {
        getterUtil_IW0.getNumberValues((Object) null, numberArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test75()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      int int0 = getterUtil_IW0.getInteger((Object) null);
      assertEquals(0, int0);
  }

  @Test
  public void test76()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      float[] floatArray0 = new float[8];
      float[] floatArray1 = getterUtil_IW0.getFloatValues((Object) "E", floatArray0);
      assertSame(floatArray1, floatArray0);
  }

  @Test
  public void test77()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)DateFormat.getTimeInstance();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1, 1034, 1, 1034, 1992);
      Date date0 = gregorianCalendar0.getGregorianChange();
      Date date1 = getterUtil_IW0.get("D<4\"6T", (DateFormat) simpleDateFormat0, date0);
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date1.toString());
  }

  @Test
  public void test78()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      short short0 = getterUtil_IW0.get((Object) "-1862", (short) (-298));
      assertEquals((short) (-1862), short0);
  }

  @Test
  public void test79()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = getterUtil_IW0.getDoubleValues((Object) "", doubleArray0);
      assertSame(doubleArray1, doubleArray0);
  }

  @Test
  public void test80()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[4];
      Number[] numberArray0 = getterUtil_IW0.getNumberValues(stringArray0);
      assertNotNull(numberArray0);
  }

  @Test
  public void test81()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      // Undeclared exception!
      try {
        getterUtil_IW0.getLongValues((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test82()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[9];
      Number[] numberArray0 = new Number[7];
      Number[] numberArray1 = getterUtil_IW0.getNumberValues(stringArray0, numberArray0);
      assertNotSame(numberArray0, numberArray1);
  }

  @Test
  public void test83()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      String[] stringArray0 = new String[10];
      short[] shortArray0 = getterUtil_IW0.getShortValues(stringArray0);
      assertNotNull(shortArray0);
  }

  @Test
  public void test84()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      float float0 = getterUtil_IW0.getFloat("");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test85()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      assertNotNull(getterUtil_IW0);
      
      double double0 = getterUtil_IW0.get((Object) null, (-394.0531679195345));
      assertEquals((-394.0531679195345), double0, 0.01D);
  }

  @Test
  public void test86()  throws Throwable  {
      GetterUtil_IW getterUtil_IW0 = GetterUtil_IW.getInstance();
      Integer integer0 = (Integer)getterUtil_IW0.getNumber("de_DE");
      assertEquals(0L, integer0.longValue());
  }
}
