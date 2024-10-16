/*
 * This file was automatically generated by EvoSuite
 */

package weka.gui.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Window;
import org.junit.BeforeClass;
import weka.core.Environment;
import weka.gui.beans.BeanCustomizer;
import weka.gui.beans.SubstringLabelerCustomizer;

@RunWith(EvoSuiteRunner.class)
public class SubstringLabelerCustomizerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SubstringLabelerCustomizer substringLabelerCustomizer0 = new SubstringLabelerCustomizer();
      Environment environment0 = Environment.getSystemWide();
      substringLabelerCustomizer0.setEnvironment(environment0);
      assertEquals(0, substringLabelerCustomizer0.getY());
  }

  @Test
  public void test1()  throws Throwable  {
      SubstringLabelerCustomizer substringLabelerCustomizer0 = new SubstringLabelerCustomizer();
      substringLabelerCustomizer0.closingCancel();
      assertEquals(false, substringLabelerCustomizer0.isPaintingTile());
  }

  @Test
  public void test2()  throws Throwable  {
      SubstringLabelerCustomizer substringLabelerCustomizer0 = new SubstringLabelerCustomizer();
      substringLabelerCustomizer0.setModifiedListener((BeanCustomizer.ModifyListener) null);
      assertEquals(0, substringLabelerCustomizer0.countComponents());
  }

  @Test
  public void test3()  throws Throwable  {
      SubstringLabelerCustomizer substringLabelerCustomizer0 = new SubstringLabelerCustomizer();
      substringLabelerCustomizer0.setParentWindow((Window) null);
      assertEquals(false, substringLabelerCustomizer0.requestFocusInWindow());
  }

  @Test
  public void test4()  throws Throwable  {
      SubstringLabelerCustomizer substringLabelerCustomizer0 = new SubstringLabelerCustomizer();
      substringLabelerCustomizer0.setObject((Object) "0 Normal Kernels. \nStandardDev = 334.6952 Precision = 2008.1709033267648  \nMean = 0\n");
      assertNull(substringLabelerCustomizer0.getName());
  }
}
