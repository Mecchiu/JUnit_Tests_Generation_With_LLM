/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.remit.element;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.remit.element.TaxType;

@RunWith(EvoSuiteRunner.class)
public class TaxTypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TaxType taxType0 = new TaxType();
      taxType0.equals((Object) null);
  }
}
