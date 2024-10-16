/*
 * This file was automatically generated by EvoSuite
 */

package com.gbshape.dbe.struts.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.gbshape.dbe.struts.bean.SequenceStructureBean;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SequenceStructureBeanEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SequenceStructureBean sequenceStructureBean0 = new SequenceStructureBean();
      sequenceStructureBean0.setName("");
      assertEquals("0", sequenceStructureBean0.getMaxValue());
      assertEquals(0, sequenceStructureBean0.getIncrementBy());
      assertEquals(0, sequenceStructureBean0.getLastNumber());
      assertEquals(0, sequenceStructureBean0.getMinValue());
  }

  @Test
  public void test1()  throws Throwable  {
      SequenceStructureBean sequenceStructureBean0 = new SequenceStructureBean();
      sequenceStructureBean0.setLastNumber(0);
      assertEquals(0, sequenceStructureBean0.getMinValue());
      assertEquals(0, sequenceStructureBean0.getIncrementBy());
      assertEquals("0", sequenceStructureBean0.getMaxValue());
      assertEquals(0, sequenceStructureBean0.getLastNumber());
  }

  @Test
  public void test2()  throws Throwable  {
      SequenceStructureBean sequenceStructureBean0 = new SequenceStructureBean();
      String string0 = sequenceStructureBean0.getName();
      assertEquals(0, sequenceStructureBean0.getIncrementBy());
      assertEquals(0, sequenceStructureBean0.getLastNumber());
      assertNotNull(string0);
      assertEquals("0", sequenceStructureBean0.getMaxValue());
      assertEquals(0, sequenceStructureBean0.getMinValue());
  }

  @Test
  public void test3()  throws Throwable  {
      SequenceStructureBean sequenceStructureBean0 = new SequenceStructureBean();
      int int0 = sequenceStructureBean0.getMinValue();
      assertEquals(0, sequenceStructureBean0.getLastNumber());
      assertEquals(0, sequenceStructureBean0.getIncrementBy());
      assertEquals(0, int0);
      assertEquals("0", sequenceStructureBean0.getMaxValue());
  }

  @Test
  public void test4()  throws Throwable  {
      SequenceStructureBean sequenceStructureBean0 = new SequenceStructureBean();
      sequenceStructureBean0.setMinValue((-1));
      assertEquals(-1, sequenceStructureBean0.getMinValue());
  }

  @Test
  public void test5()  throws Throwable  {
      SequenceStructureBean sequenceStructureBean0 = new SequenceStructureBean();
      assertEquals("0", sequenceStructureBean0.getMaxValue());
      
      sequenceStructureBean0.setMaxValue("0");
      assertEquals(0, sequenceStructureBean0.getIncrementBy());
      assertEquals(0, sequenceStructureBean0.getLastNumber());
      assertEquals(0, sequenceStructureBean0.getMinValue());
  }

  @Test
  public void test6()  throws Throwable  {
      SequenceStructureBean sequenceStructureBean0 = new SequenceStructureBean();
      String string0 = sequenceStructureBean0.getMaxValue();
      assertEquals(0, sequenceStructureBean0.getLastNumber());
      assertEquals(0, sequenceStructureBean0.getMinValue());
      assertNotNull(string0);
      assertEquals(0, sequenceStructureBean0.getIncrementBy());
      assertEquals("0", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      SequenceStructureBean sequenceStructureBean0 = new SequenceStructureBean();
      sequenceStructureBean0.setIncrementBy((-50));
      assertEquals(-50, sequenceStructureBean0.getIncrementBy());
  }

  @Test
  public void test8()  throws Throwable  {
      SequenceStructureBean sequenceStructureBean0 = new SequenceStructureBean();
      int int0 = sequenceStructureBean0.getIncrementBy();
      assertEquals(0, int0);
      assertEquals(0, sequenceStructureBean0.getMinValue());
      assertEquals(0, sequenceStructureBean0.getLastNumber());
      assertEquals("0", sequenceStructureBean0.getMaxValue());
  }

  @Test
  public void test9()  throws Throwable  {
      SequenceStructureBean sequenceStructureBean0 = new SequenceStructureBean();
      int int0 = sequenceStructureBean0.getLastNumber();
      assertEquals("0", sequenceStructureBean0.getMaxValue());
      assertEquals(0, sequenceStructureBean0.getIncrementBy());
      assertEquals(0, sequenceStructureBean0.getMinValue());
      assertEquals(0, int0);
  }
}
