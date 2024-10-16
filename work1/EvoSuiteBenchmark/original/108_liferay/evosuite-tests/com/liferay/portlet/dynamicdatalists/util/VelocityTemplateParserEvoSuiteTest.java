/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.dynamicdatalists.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.dynamicdatalists.util.VelocityTemplateParser;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class VelocityTemplateParserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      VelocityTemplateParser velocityTemplateParser0 = new VelocityTemplateParser();
      // Undeclared exception!
      try {
        velocityTemplateParser0.getErrorTemplateId();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsValues
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      VelocityTemplateParser velocityTemplateParser0 = new VelocityTemplateParser();
      // Undeclared exception!
      try {
        velocityTemplateParser0.getTemplateContext();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * com/liferay/portal/kernel/template/StringTemplateResource
         */
      }
  }
}
