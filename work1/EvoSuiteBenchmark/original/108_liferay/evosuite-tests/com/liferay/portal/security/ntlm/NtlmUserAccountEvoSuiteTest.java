/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.security.ntlm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.security.ntlm.NtlmUserAccount;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NtlmUserAccountEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NtlmUserAccount ntlmUserAccount0 = new NtlmUserAccount("v");
      String string0 = ntlmUserAccount0.getUserName();
      assertEquals("v", string0);
  }
}
