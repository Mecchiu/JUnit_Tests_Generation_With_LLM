/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.remit.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.remit.element.ContactName;

@RunWith(EvoSuiteRunner.class)
public class ContactNameEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ContactName contactName0 = new ContactName();
      contactName0.equals((Object) null);
  }
}
