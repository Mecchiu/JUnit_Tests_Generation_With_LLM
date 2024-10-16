/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.RenderParametersPool;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RenderParametersPoolEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RenderParametersPool renderParametersPool0 = new RenderParametersPool();
      assertNotNull(renderParametersPool0);
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        RenderParametersPool.clear((HttpServletRequest) null, 262L, "7Z|)=0{n#");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        RenderParametersPool.clear((HttpServletRequest) null, 6L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        RenderParametersPool.put((HttpServletRequest) null, (-1853L), "@h?m3GI{q=R^~RGo", (Map<String, String[]>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
