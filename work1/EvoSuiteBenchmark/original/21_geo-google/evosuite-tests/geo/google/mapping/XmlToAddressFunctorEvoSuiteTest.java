/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.mapping;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import geo.google.GeoException;
import geo.google.mapping.XmlToAddressFunctor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class XmlToAddressFunctorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XmlToAddressFunctor xmlToAddressFunctor0 = new XmlToAddressFunctor();
      assertNotNull(xmlToAddressFunctor0);
  }

  @Test
  public void test1()  throws Throwable  {
      XmlToAddressFunctor xmlToAddressFunctor0 = XmlToAddressFunctor.getInstance();
      // Undeclared exception!
      try {
        xmlToAddressFunctor0.execute("The filters must not be null");
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * Unable to parse xml string using JAXB
         */
      }
  }
}
