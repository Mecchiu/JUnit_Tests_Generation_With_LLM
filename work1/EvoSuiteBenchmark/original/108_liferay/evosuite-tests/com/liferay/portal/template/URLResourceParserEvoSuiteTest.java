/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.template.TemplateException;
import com.liferay.portal.kernel.template.TemplateResource;
import com.liferay.portal.template.ThemeResourceParser;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class URLResourceParserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ThemeResourceParser themeResourceParser0 = new ThemeResourceParser();
      TemplateResource templateResource0 = themeResourceParser0.getTemplateResource("Af");
      assertNull(templateResource0);
  }
}
