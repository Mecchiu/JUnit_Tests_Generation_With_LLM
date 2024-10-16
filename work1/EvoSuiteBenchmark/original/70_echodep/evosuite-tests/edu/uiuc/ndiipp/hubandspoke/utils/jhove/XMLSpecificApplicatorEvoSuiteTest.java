/*
 * This file was automatically generated by EvoSuite
 */

package edu.uiuc.ndiipp.hubandspoke.utils.jhove;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import edu.harvard.hul.ois.mets.Mdtype;
import edu.uiuc.ndiipp.hubandspoke.utils.jhove.XMLSpecificApplicator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class XMLSpecificApplicatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XMLSpecificApplicator xMLSpecificApplicator0 = new XMLSpecificApplicator();
      Mdtype mdtype0 = xMLSpecificApplicator0.specificMetadataType();
      assertEquals("OTHER", mdtype0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      XMLSpecificApplicator xMLSpecificApplicator0 = new XMLSpecificApplicator();
      String string0 = xMLSpecificApplicator0.XSLName();
      assertEquals("xml-to-textmd.xsl", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      XMLSpecificApplicator xMLSpecificApplicator0 = new XMLSpecificApplicator();
      String string0 = xMLSpecificApplicator0.specificMetadataOtherMDType();
      assertEquals("TEXTMD", string0);
  }
}
