/*
 * This file was automatically generated by EvoSuite
 */

package edu.uiuc.ndiipp.hubandspoke.utils.jhove;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import edu.uiuc.ndiipp.hubandspoke.utils.jhove.PDFTransformer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PDFTransformerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PDFTransformer pDFTransformer0 = new PDFTransformer();
      pDFTransformer0.getSpecificApplicator();
  }

  @Test
  public void test1()  throws Throwable  {
      PDFTransformer pDFTransformer0 = new PDFTransformer();
      pDFTransformer0.getBaseApplicator();
  }
}
