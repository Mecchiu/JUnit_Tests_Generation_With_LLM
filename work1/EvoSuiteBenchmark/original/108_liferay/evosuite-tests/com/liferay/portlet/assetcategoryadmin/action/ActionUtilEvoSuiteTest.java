/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.assetcategoryadmin.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.assetcategoryadmin.action.ActionUtil;
import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ActionUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ActionUtil actionUtil0 = new ActionUtil();
      assertNotNull(actionUtil0);
  }

  @Test
  public void test1()  throws Throwable  {
      try {
        ActionUtil.getVocabularies((HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      try {
        ActionUtil.getCategory((PortletRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      try {
        ActionUtil.getVocabularies((PortletRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      try {
        ActionUtil.getVocabulary((PortletRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
