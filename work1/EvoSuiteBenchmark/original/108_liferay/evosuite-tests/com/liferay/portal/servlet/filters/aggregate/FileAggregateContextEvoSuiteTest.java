/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.servlet.filters.aggregate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.servlet.filters.aggregate.FileAggregateContext;
import java.io.File;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FileAggregateContextEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("");
      FileAggregateContext fileAggregateContext0 = new FileAggregateContext(file0);
      // Undeclared exception!
      try {
        fileAggregateContext0.getFullPath("Qwp=fP#fD7.f[X");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = new File((String) null, "@`1B%C");
      FileAggregateContext fileAggregateContext0 = new FileAggregateContext(file0);
      // Undeclared exception!
      try {
        fileAggregateContext0.getContent("@`1B%C");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      File file0 = new File("");
      FileAggregateContext fileAggregateContext0 = new FileAggregateContext(file0);
      fileAggregateContext0.popPath("");
  }

  @Test
  public void test3()  throws Throwable  {
      File file0 = new File("W9=D", "W9=D");
      FileAggregateContext fileAggregateContext0 = new FileAggregateContext(file0);
      fileAggregateContext0.popPath("W9=D");
  }

  @Test
  public void test4()  throws Throwable  {
      File file0 = new File("");
      FileAggregateContext fileAggregateContext0 = new FileAggregateContext(file0);
      fileAggregateContext0.pushPath("");
  }

  @Test
  public void test5()  throws Throwable  {
      File file0 = new File("W9=D", "W9=D");
      FileAggregateContext fileAggregateContext0 = new FileAggregateContext(file0);
      fileAggregateContext0.pushPath("W9=D");
  }
}
