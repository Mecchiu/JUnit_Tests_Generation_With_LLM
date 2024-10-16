/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.CST_COFINS;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CST_COFINSEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_04;
      boolean boolean0 = cST_COFINS0.isIsento();
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_06;
      String string0 = cST_COFINS0.getDesc();
      assertEquals("Al\u00EDquota zero", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_02;
      String string0 = cST_COFINS0.getGroup();
      assertEquals("Aliq", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_02;
      String string0 = cST_COFINS0.getValue();
      assertEquals("02", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_02;
      boolean boolean0 = cST_COFINS0.isRequiredTag("02");
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      CST_COFINS cST_COFINS0 = CST_COFINS.COFINS_03;
      boolean boolean0 = cST_COFINS0.isRequiredTag("vAliqProd");
      assertEquals(true, boolean0);
  }
}
