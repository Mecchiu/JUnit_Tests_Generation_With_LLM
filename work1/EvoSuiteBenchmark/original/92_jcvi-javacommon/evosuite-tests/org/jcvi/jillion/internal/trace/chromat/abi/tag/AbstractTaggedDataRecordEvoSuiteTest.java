/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.internal.trace.chromat.abi.tag;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.Ab1LocalDate;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultAsciiTaggedDataRecord;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultDateTaggedDataRecord;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultIntegerArrayTaggedDataRecord;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultPascalStringTaggedDataRecord;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultShortArrayTaggedDataRecord;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultTaggedDataRecord;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultTimeTaggedDataRecord;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultUserDefinedTaggedDataRecord;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.TaggedDataName;
import org.jcvi.jillion.internal.trace.chromat.abi.tag.TaggedDataType;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbstractTaggedDataRecordEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.DATA;
      TaggedDataType taggedDataType0 = TaggedDataType.CHAR;
      DefaultAsciiTaggedDataRecord defaultAsciiTaggedDataRecord0 = new DefaultAsciiTaggedDataRecord(taggedDataName0, 0L, taggedDataType0, 0, 1184L, 0L, 0L, 0L);
      DefaultTimeTaggedDataRecord defaultTimeTaggedDataRecord0 = new DefaultTimeTaggedDataRecord(taggedDataName0, 0L, taggedDataType0, 0, (-963L), 0L, (long) 0, 1223L);
      boolean boolean0 = defaultAsciiTaggedDataRecord0.equals((Object) defaultTimeTaggedDataRecord0);
      assertEquals(0L, defaultTimeTaggedDataRecord0.getRecordLength());
      assertEquals((-963L), defaultTimeTaggedDataRecord0.getNumberOfElements());
      assertEquals(false, boolean0);
      assertEquals(0, defaultTimeTaggedDataRecord0.getElementLength());
      assertEquals("org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultTimeTaggedDataRecord[DATA(0) 0]", defaultTimeTaggedDataRecord0.toString());
      assertEquals(1223L, defaultTimeTaggedDataRecord0.getCrypticValue());
  }

  @Test
  public void test1()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.DATA;
      TaggedDataType taggedDataType0 = TaggedDataType.CHAR;
      DefaultAsciiTaggedDataRecord defaultAsciiTaggedDataRecord0 = new DefaultAsciiTaggedDataRecord(taggedDataName0, (-66L), taggedDataType0, 0, (-66L), (long) 0, 0L, (long) 0);
      DefaultUserDefinedTaggedDataRecord defaultUserDefinedTaggedDataRecord0 = new DefaultUserDefinedTaggedDataRecord(taggedDataName0, (-66L), taggedDataType0, 0, (-66L), (long) 0, 0L, (long) 0);
      boolean boolean0 = defaultAsciiTaggedDataRecord0.equals((Object) defaultUserDefinedTaggedDataRecord0);
      assertEquals("org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultAsciiTaggedDataRecord[DATA(-66) 0]", defaultAsciiTaggedDataRecord0.toString());
      assertEquals(true, boolean0);
      assertEquals((-66L), defaultAsciiTaggedDataRecord0.getNumberOfElements());
      assertEquals(0L, defaultAsciiTaggedDataRecord0.getRecordLength());
      assertEquals(0, defaultAsciiTaggedDataRecord0.getElementLength());
      assertEquals(0L, defaultAsciiTaggedDataRecord0.getCrypticValue());
  }

  @Test
  public void test2()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.DATA;
      TaggedDataType taggedDataType0 = TaggedDataType.CHAR;
      DefaultDateTaggedDataRecord defaultDateTaggedDataRecord0 = new DefaultDateTaggedDataRecord(taggedDataName0, (-1L), taggedDataType0, 0, (long) 0, (long) 0, 0L, 0L);
      String string0 = defaultDateTaggedDataRecord0.toString();
      assertEquals(0L, defaultDateTaggedDataRecord0.getRecordLength());
      assertNotNull(string0);
      assertEquals("org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultDateTaggedDataRecord[DATA(-1) 0]", string0);
      assertEquals(0L, defaultDateTaggedDataRecord0.getNumberOfElements());
      assertEquals(0L, defaultDateTaggedDataRecord0.getCrypticValue());
      assertEquals(0, defaultDateTaggedDataRecord0.getElementLength());
  }

  @Test
  public void test3()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.OfSc;
      TaggedDataType taggedDataType0 = TaggedDataType.DATE;
      DefaultUserDefinedTaggedDataRecord defaultUserDefinedTaggedDataRecord0 = new DefaultUserDefinedTaggedDataRecord(taggedDataName0, (-456L), taggedDataType0, 0, 5L, 5L, (-456L), 1054L);
      int int0 = defaultUserDefinedTaggedDataRecord0.hashCode();
      assertEquals((-264572072), int0);
  }

  @Test
  public void test4()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.OfSc;
      TaggedDataType taggedDataType0 = TaggedDataType.DATE;
      DefaultUserDefinedTaggedDataRecord defaultUserDefinedTaggedDataRecord0 = new DefaultUserDefinedTaggedDataRecord(taggedDataName0, (-456L), taggedDataType0, 0, 5L, 5L, (-456L), 1054L);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try {
        defaultUserDefinedTaggedDataRecord0.parseDataRecordFrom(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.OFFS;
      TaggedDataType taggedDataType0 = TaggedDataType.PASCAL_STRING;
      DefaultDateTaggedDataRecord defaultDateTaggedDataRecord0 = new DefaultDateTaggedDataRecord(taggedDataName0, 1104L, taggedDataType0, (-685), (-752L), (-2027L), (-1410L), (long) (-685));
      byte[] byteArray0 = new byte[1];
      Ab1LocalDate ab1LocalDate0 = defaultDateTaggedDataRecord0.parseDataRecordFrom(byteArray0);
      assertEquals((-2027L), defaultDateTaggedDataRecord0.getRecordLength());
      assertEquals((-685L), defaultDateTaggedDataRecord0.getCrypticValue());
      assertEquals("org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultDateTaggedDataRecord[OFFS(1104) -1410]", defaultDateTaggedDataRecord0.toString());
      assertEquals(-685, defaultDateTaggedDataRecord0.getElementLength());
      assertEquals(-7, ab1LocalDate0.getMonth());
      assertEquals((-752L), defaultDateTaggedDataRecord0.getNumberOfElements());
      assertNotNull(ab1LocalDate0);
  }

  @Test
  public void test6()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.RESULTS_GROUP_NAME;
      TaggedDataType taggedDataType0 = TaggedDataType.PASCAL_STRING;
      DefaultPascalStringTaggedDataRecord defaultPascalStringTaggedDataRecord0 = new DefaultPascalStringTaggedDataRecord(taggedDataName0, 30L, taggedDataType0, (-423), 30L, 30L, 30L, 30L);
      boolean boolean0 = defaultPascalStringTaggedDataRecord0.equals((Object) null);
      assertEquals(30L, defaultPascalStringTaggedDataRecord0.getNumberOfElements());
      assertEquals(-423, defaultPascalStringTaggedDataRecord0.getElementLength());
      assertEquals(false, boolean0);
      assertEquals(30L, defaultPascalStringTaggedDataRecord0.getRecordLength());
      assertEquals(30L, defaultPascalStringTaggedDataRecord0.getCrypticValue());
      assertEquals("org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultPascalStringTaggedDataRecord[RGNm(30) 30]", defaultPascalStringTaggedDataRecord0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.JTC_TEMPERATURE;
      TaggedDataType taggedDataType0 = TaggedDataType.TIME;
      DefaultPascalStringTaggedDataRecord defaultPascalStringTaggedDataRecord0 = new DefaultPascalStringTaggedDataRecord(taggedDataName0, 981L, taggedDataType0, 389, 981L, 1144L, (long) 389, 0L);
      boolean boolean0 = defaultPascalStringTaggedDataRecord0.equals((Object) "PEAK_POSITIONS");
      assertEquals(981L, defaultPascalStringTaggedDataRecord0.getNumberOfElements());
      assertEquals(false, boolean0);
      assertEquals("org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultPascalStringTaggedDataRecord[Tmpr(981) 389]", defaultPascalStringTaggedDataRecord0.toString());
      assertEquals(0L, defaultPascalStringTaggedDataRecord0.getCrypticValue());
      assertEquals(1144L, defaultPascalStringTaggedDataRecord0.getRecordLength());
      assertEquals(389, defaultPascalStringTaggedDataRecord0.getElementLength());
  }

  @Test
  public void test8()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.EVENT;
      TaggedDataType taggedDataType0 = TaggedDataType.TIME;
      DefaultIntegerArrayTaggedDataRecord defaultIntegerArrayTaggedDataRecord0 = new DefaultIntegerArrayTaggedDataRecord(taggedDataName0, 1L, taggedDataType0, 52, 1L, 0L, (long) 52, (long) 52);
      TaggedDataName taggedDataName1 = TaggedDataName.RevC;
      DefaultDateTaggedDataRecord defaultDateTaggedDataRecord0 = new DefaultDateTaggedDataRecord(taggedDataName1, 1L, taggedDataType0, 960, (long) 960, 5L, 1L, 1L);
      boolean boolean0 = defaultIntegerArrayTaggedDataRecord0.equals((Object) defaultDateTaggedDataRecord0);
      assertEquals(false, boolean0);
      assertEquals(5L, defaultDateTaggedDataRecord0.getRecordLength());
      assertEquals(1L, defaultDateTaggedDataRecord0.getTagNumber());
      assertEquals("org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultIntegerArrayTaggedDataRecord[EVNT(1) 52]", defaultIntegerArrayTaggedDataRecord0.toString());
      assertEquals(960, defaultDateTaggedDataRecord0.getElementLength());
      assertEquals(960L, defaultDateTaggedDataRecord0.getNumberOfElements());
      assertEquals(52L, defaultIntegerArrayTaggedDataRecord0.getCrypticValue());
  }

  @Test
  public void test9()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.DYE_PRIMER_CORRECTION_FILE;
      TaggedDataType taggedDataType0 = TaggedDataType.TYPE_5;
      DefaultShortArrayTaggedDataRecord defaultShortArrayTaggedDataRecord0 = new DefaultShortArrayTaggedDataRecord(taggedDataName0, (-1190L), taggedDataType0, 1587, (-1190L), (-1190L), 30L, (long) 1587);
      DefaultDateTaggedDataRecord defaultDateTaggedDataRecord0 = new DefaultDateTaggedDataRecord(taggedDataName0, (-810L), taggedDataType0, (-961), 936L, 936L, 0L, (-810L));
      boolean boolean0 = defaultShortArrayTaggedDataRecord0.equals((Object) defaultDateTaggedDataRecord0);
      assertEquals((-1190L), defaultShortArrayTaggedDataRecord0.getTagNumber());
      assertEquals(936L, defaultDateTaggedDataRecord0.getNumberOfElements());
      assertEquals(1587L, defaultShortArrayTaggedDataRecord0.getCrypticValue());
      assertEquals(-961, defaultDateTaggedDataRecord0.getElementLength());
      assertEquals("org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultDateTaggedDataRecord[PDMF(-810) 0]", defaultDateTaggedDataRecord0.toString());
      assertEquals("org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultShortArrayTaggedDataRecord[PDMF(-1190) 30]", defaultShortArrayTaggedDataRecord0.toString());
      assertEquals(false, boolean0);
      assertEquals(936L, defaultDateTaggedDataRecord0.getRecordLength());
  }

  @Test
  public void test10()  throws Throwable  {
      TaggedDataName taggedDataName0 = TaggedDataName.OFFS;
      TaggedDataType taggedDataType0 = TaggedDataType.PASCAL_STRING;
      DefaultUserDefinedTaggedDataRecord defaultUserDefinedTaggedDataRecord0 = new DefaultUserDefinedTaggedDataRecord(taggedDataName0, 0L, taggedDataType0, (-685), 1104L, 1455L, (-1410L), (-1857L));
      TaggedDataType taggedDataType1 = TaggedDataType.FLOAT;
      DefaultTaggedDataRecord defaultTaggedDataRecord0 = new DefaultTaggedDataRecord(taggedDataName0, 0L, taggedDataType1, (-685), (-2027L), (long) (-685), (-2027L), 1104L);
      boolean boolean0 = defaultUserDefinedTaggedDataRecord0.equals((Object) defaultTaggedDataRecord0);
      assertEquals(-685, defaultTaggedDataRecord0.getElementLength());
      assertEquals("org.jcvi.jillion.internal.trace.chromat.abi.tag.DefaultUserDefinedTaggedDataRecord[OFFS(0) -1410]", defaultUserDefinedTaggedDataRecord0.toString());
      assertEquals(false, boolean0);
      assertEquals((-685L), defaultTaggedDataRecord0.getRecordLength());
      assertEquals(1104L, defaultUserDefinedTaggedDataRecord0.getNumberOfElements());
      assertEquals(1104L, defaultTaggedDataRecord0.getCrypticValue());
  }
}
