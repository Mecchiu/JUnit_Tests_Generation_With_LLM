/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.MethodParameter;
import com.liferay.portal.util.MethodParametersResolverImpl;
import java.lang.reflect.Method;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MethodParametersResolverImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MethodParametersResolverImpl methodParametersResolverImpl0 = new MethodParametersResolverImpl();
      MethodParameter[] methodParameterArray0 = methodParametersResolverImpl0.resolveMethodParameters((Method) null);
      assertNull(methodParameterArray0);
  }
}
