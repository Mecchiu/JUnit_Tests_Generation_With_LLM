/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.xisemele.exception.ChildNotFoundException;

@RunWith(EvoSuiteRunner.class)
public class ChildNotFoundExceptionEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.exception.ChildNotFoundException.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ChildNotFoundException childNotFoundException0 = new ChildNotFoundException("messages", "messages");
  }
}
