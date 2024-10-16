/*
 * This file was automatically generated by EvoSuite
 */

package org.heal.servlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.heal.servlet.ControllerServlet;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ControllerServletEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ControllerServlet controllerServlet0 = new ControllerServlet();
      // Undeclared exception!
      try {
        controllerServlet0.doGet((HttpServletRequest) null, (HttpServletResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ControllerServlet controllerServlet0 = new ControllerServlet();
      // Undeclared exception!
      try {
        controllerServlet0.destroy();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
