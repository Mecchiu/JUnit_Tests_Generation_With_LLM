/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.dynamicdatamapping.util.comparator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.dynamicdatamapping.util.comparator.StructureIdComparator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class StructureIdComparatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StructureIdComparator structureIdComparator0 = new StructureIdComparator();
      boolean boolean0 = structureIdComparator0.isAscending("DDMStructure.structureId DESC");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      StructureIdComparator structureIdComparator0 = new StructureIdComparator();
      // Undeclared exception!
      try {
        structureIdComparator0.getOrderByConditionValues((Object) "DDMStructure.structureId DESC");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      StructureIdComparator structureIdComparator0 = new StructureIdComparator();
      String string0 = structureIdComparator0.toString();
      assertEquals("DDMStructure.structureId DESC", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      StructureIdComparator structureIdComparator0 = new StructureIdComparator(true);
      String string0 = structureIdComparator0.toString();
      assertEquals(true, structureIdComparator0.isAscending());
      assertEquals("DDMStructure.structureId ASC", string0);
  }
}
