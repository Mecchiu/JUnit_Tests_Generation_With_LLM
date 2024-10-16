/*
 * This file was automatically generated by EvoSuite
 */

package com.gbshape.dbe.struts.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.gbshape.dbe.struts.bean.ViewStructureBean;
import java.util.ArrayList;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ViewStructureBeanEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ViewStructureBean viewStructureBean0 = new ViewStructureBean();
      String string0 = viewStructureBean0.getViewName();
      assertEquals("", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ViewStructureBean viewStructureBean0 = new ViewStructureBean();
      viewStructureBean0.setViewName("");
      assertEquals("", viewStructureBean0.getViewName());
  }

  @Test
  public void test2()  throws Throwable  {
      ViewStructureBean viewStructureBean0 = new ViewStructureBean();
      String string0 = viewStructureBean0.getDefinition();
      assertEquals("", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      ViewStructureBean viewStructureBean0 = new ViewStructureBean();
      ArrayList<Object> arrayList0 = viewStructureBean0.getColumns();
      viewStructureBean0.setColumns(arrayList0);
      assertEquals("[]", arrayList0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      ViewStructureBean viewStructureBean0 = new ViewStructureBean();
      viewStructureBean0.setDefinition("j'zK-!x?/S");
      assertEquals("", viewStructureBean0.getViewName());
  }
}
