/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.xisemele.exception.ParseXMLException;

@RunWith(EvoSuiteRunner.class)
public class ParseXMLExceptionEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.exception.ParseXMLException.<init>(Ljava/lang/Throwable;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Throwable throwable0 = new Throwable();
      ParseXMLException parseXMLException0 = new ParseXMLException(throwable0);
  }
}
