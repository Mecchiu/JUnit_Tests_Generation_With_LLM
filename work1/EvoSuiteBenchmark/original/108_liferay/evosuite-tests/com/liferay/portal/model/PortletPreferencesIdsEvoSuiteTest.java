/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.model.PortletPreferencesIds;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PortletPreferencesIdsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds();
      portletPreferencesIds0.setCompanyId(0L);
      assertEquals(0L, portletPreferencesIds0.getPlid());
  }

  @Test
  public void test1()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds();
      int int0 = portletPreferencesIds0.getOwnerType();
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds();
      portletPreferencesIds0.setPortletId("=RKaS#DHIijt@ozO3-");
      assertEquals("=RKaS#DHIijt@ozO3-", portletPreferencesIds0.getPortletId());
  }

  @Test
  public void test3()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds();
      portletPreferencesIds0.setOwnerId(0L);
      assertEquals(0L, portletPreferencesIds0.getPlid());
  }

  @Test
  public void test4()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds();
      long long0 = portletPreferencesIds0.getPlid();
      assertEquals(0L, long0);
  }

  @Test
  public void test5()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds(0L, 1L, 1308, 0L, "");
      assertEquals(0L, portletPreferencesIds0.getCompanyId());
      assertEquals(1L, portletPreferencesIds0.getOwnerId());
      assertEquals(0L, portletPreferencesIds0.getPlid());
      assertEquals(1308, portletPreferencesIds0.getOwnerType());
  }

  @Test
  public void test6()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds();
      String string0 = portletPreferencesIds0.getPortletId();
      assertNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds();
      long long0 = portletPreferencesIds0.getOwnerId();
      assertEquals(0L, long0);
  }

  @Test
  public void test8()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds();
      portletPreferencesIds0.setPlid((-969L));
      assertEquals((-969L), portletPreferencesIds0.getPlid());
  }

  @Test
  public void test9()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds();
      portletPreferencesIds0.setOwnerType(0);
      assertEquals(0, portletPreferencesIds0.getOwnerType());
  }

  @Test
  public void test10()  throws Throwable  {
      PortletPreferencesIds portletPreferencesIds0 = new PortletPreferencesIds();
      long long0 = portletPreferencesIds0.getCompanyId();
      assertEquals(0L, long0);
  }
}
