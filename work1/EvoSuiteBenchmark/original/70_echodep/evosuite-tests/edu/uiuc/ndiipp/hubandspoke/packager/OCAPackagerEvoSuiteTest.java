/*
 * This file was automatically generated by EvoSuite
 */

package edu.uiuc.ndiipp.hubandspoke.packager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager;
import edu.uiuc.ndiipp.hubandspoke.packager.PackagerException;
import edu.uiuc.ndiipp.hubandspoke.profile.HaSMETSProfile;
import edu.uiuc.ndiipp.hubandspoke.profile.HaSMETSProfileException;
import java.io.File;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OCAPackagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OCAPackager oCAPackager0 = null;
      try {
        oCAPackager0 = new OCAPackager();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        OCAPackager.cleanIdForFileName("<re7r");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      OCAPackager oCAPackager0 = null;
      try {
        oCAPackager0 = new OCAPackager();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        OCAPackager.isMetadata("OiFV_xHt)Om(gov_dc.xml_marc.xml");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try {
        OCAPackager.isMetadata("g{5l_meta.xml");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try {
        OCAPackager.isMetadata("OiFV_xHt)Omgov_dc.xml");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try {
        OCAPackager.isSkippable("_mods.xml");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try {
        OCAPackager.determineMDType("_mods.xml");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try {
        OCAPackager.determineMDType("_mods.xml_marc.xml");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try {
        OCAPackager.determineMDType("g{5l_meta.xml");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try {
        OCAPackager.determineMDType("OiFV_xHt)Omgov_dc.xml");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class edu.uiuc.ndiipp.hubandspoke.packager.OCAPackager
         */
      }
  }
}
