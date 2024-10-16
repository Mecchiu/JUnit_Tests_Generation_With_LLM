/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.softwarecatalog.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.softwarecatalog.model.SCLicense;
import com.liferay.portlet.softwarecatalog.model.SCLicenseSoap;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SCLicenseSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LinkedList<SCLicense> linkedList0 = new LinkedList<SCLicense>();
      linkedList0.add((SCLicense) null);
      // Undeclared exception!
      try {
        SCLicenseSoap.toSoapModels((List<SCLicense>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      long long0 = sCLicenseSoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test2()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      String string0 = sCLicenseSoap0.getName();
      assertNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      boolean boolean0 = sCLicenseSoap0.isOpenSource();
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      sCLicenseSoap0.setName((String) null);
      assertEquals(false, sCLicenseSoap0.getRecommended());
  }

  @Test
  public void test5()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      sCLicenseSoap0.setRecommended(false);
      assertEquals(false, sCLicenseSoap0.getRecommended());
      assertEquals(false, sCLicenseSoap0.isRecommended());
  }

  @Test
  public void test6()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      boolean boolean0 = sCLicenseSoap0.getOpenSource();
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      boolean boolean0 = sCLicenseSoap0.isActive();
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      long long0 = sCLicenseSoap0.getLicenseId();
      assertEquals(0L, long0);
  }

  @Test
  public void test9()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      boolean boolean0 = sCLicenseSoap0.getActive();
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      sCLicenseSoap0.setPrimaryKey((-723L));
      assertEquals((-723L), sCLicenseSoap0.getLicenseId());
      assertEquals((-723L), sCLicenseSoap0.getPrimaryKey());
  }

  @Test
  public void test11()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      boolean boolean0 = sCLicenseSoap0.isRecommended();
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      sCLicenseSoap0.setUrl((String) null);
      assertEquals(false, sCLicenseSoap0.getRecommended());
  }

  @Test
  public void test13()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      sCLicenseSoap0.setActive(false);
      assertEquals(false, sCLicenseSoap0.getActive());
      assertEquals(false, sCLicenseSoap0.isActive());
  }

  @Test
  public void test14()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      sCLicenseSoap0.setOpenSource(false);
      assertEquals(false, sCLicenseSoap0.isOpenSource());
      assertEquals(false, sCLicenseSoap0.getOpenSource());
  }

  @Test
  public void test15()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      String string0 = sCLicenseSoap0.getUrl();
      assertNull(string0);
  }

  @Test
  public void test16()  throws Throwable  {
      SCLicenseSoap sCLicenseSoap0 = new SCLicenseSoap();
      boolean boolean0 = sCLicenseSoap0.getRecommended();
      assertEquals(false, boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      SCLicense[][] sCLicenseArray0 = new SCLicense[1][3];
      // Undeclared exception!
      try {
        SCLicenseSoap.toSoapModels(sCLicenseArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      LinkedList<SCLicense> linkedList0 = new LinkedList<SCLicense>();
      SCLicenseSoap[] sCLicenseSoapArray0 = SCLicenseSoap.toSoapModels((List<SCLicense>) linkedList0);
      assertNotNull(sCLicenseSoapArray0);
  }
}
