/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.security.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.security.auth.AuthSettingsUtil;
import java.util.Set;
import java.util.TreeSet;
import javax.servlet.http.HttpServletRequest;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AuthSettingsUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AuthSettingsUtil authSettingsUtil0 = new AuthSettingsUtil();
      assertNotNull(authSettingsUtil0);
  }

  @Test
  public void test1()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("yrdmJmDtWT^tyT[B");
      // Undeclared exception!
      try {
        AuthSettingsUtil.isAccessAllowed((HttpServletRequest) null, (Set<String>) treeSet0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      boolean boolean0 = AuthSettingsUtil.isAccessAllowed((HttpServletRequest) null, (Set<String>) treeSet0);
      assertEquals(true, boolean0);
  }
}
