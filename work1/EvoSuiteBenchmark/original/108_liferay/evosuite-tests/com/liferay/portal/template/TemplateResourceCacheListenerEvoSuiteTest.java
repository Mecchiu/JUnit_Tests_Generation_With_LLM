/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.template.TemplateResourceCacheListener;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TemplateResourceCacheListenerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TemplateResourceCacheListener templateResourceCacheListener0 = null;
      try {
        templateResourceCacheListener0 = new TemplateResourceCacheListener((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
