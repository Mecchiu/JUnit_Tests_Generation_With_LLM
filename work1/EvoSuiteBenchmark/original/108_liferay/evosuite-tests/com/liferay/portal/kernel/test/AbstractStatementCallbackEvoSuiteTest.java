/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.test.ExecutionTestListeners;
import com.liferay.portal.kernel.test.RunAfterTestClassesCallback;
import com.liferay.portal.kernel.test.TestContextHandler;
import org.junit.BeforeClass;
import org.junit.runners.model.Statement;

@RunWith(EvoSuiteRunner.class)
public class AbstractStatementCallbackEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = ExecutionTestListeners.class;
      TestContextHandler testContextHandler0 = new TestContextHandler(class0);
      RunAfterTestClassesCallback runAfterTestClassesCallback0 = new RunAfterTestClassesCallback((Statement) null, testContextHandler0);
      runAfterTestClassesCallback0.evaluate();
  }
}
