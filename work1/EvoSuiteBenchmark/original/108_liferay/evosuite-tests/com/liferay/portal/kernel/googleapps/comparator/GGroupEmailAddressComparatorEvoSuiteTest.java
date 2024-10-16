/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.googleapps.comparator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.googleapps.GGroup;
import com.liferay.portal.kernel.googleapps.comparator.GGroupEmailAddressComparator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GGroupEmailAddressComparatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GGroupEmailAddressComparator gGroupEmailAddressComparator0 = new GGroupEmailAddressComparator();
      GGroup gGroup0 = new GGroup();
      gGroup0.setEmailAddress("");
      int int0 = gGroupEmailAddressComparator0.compare(gGroup0, gGroup0);
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      GGroup gGroup0 = new GGroup();
      gGroup0.setEmailAddress("");
      GGroupEmailAddressComparator gGroupEmailAddressComparator0 = new GGroupEmailAddressComparator(false);
      int int0 = gGroupEmailAddressComparator0.compare(gGroup0, gGroup0);
      assertEquals(0, int0);
  }
}
