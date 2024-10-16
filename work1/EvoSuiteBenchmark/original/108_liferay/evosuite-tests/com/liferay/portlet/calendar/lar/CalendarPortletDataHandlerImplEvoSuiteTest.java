/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.calendar.lar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.lar.PortletDataHandlerControl;
import com.liferay.portlet.calendar.lar.CalendarPortletDataHandlerImpl;
import com.liferay.portlet.calendar.model.CalEvent;
import com.liferay.portlet.calendar.model.CalEventWrapper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CalendarPortletDataHandlerImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CalendarPortletDataHandlerImpl calendarPortletDataHandlerImpl0 = new CalendarPortletDataHandlerImpl();
      PortletDataHandlerControl[] portletDataHandlerControlArray0 = calendarPortletDataHandlerImpl0.getImportMetadataControls();
      assertNotNull(portletDataHandlerControlArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      CalendarPortletDataHandlerImpl calendarPortletDataHandlerImpl0 = new CalendarPortletDataHandlerImpl();
      PortletDataHandlerControl[] portletDataHandlerControlArray0 = calendarPortletDataHandlerImpl0.getImportControls();
      assertNotNull(portletDataHandlerControlArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      CalendarPortletDataHandlerImpl calendarPortletDataHandlerImpl0 = new CalendarPortletDataHandlerImpl();
      PortletDataHandlerControl[] portletDataHandlerControlArray0 = calendarPortletDataHandlerImpl0.getExportControls();
      assertNotNull(portletDataHandlerControlArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      CalendarPortletDataHandlerImpl calendarPortletDataHandlerImpl0 = new CalendarPortletDataHandlerImpl();
      CalEventWrapper calEventWrapper0 = new CalEventWrapper((CalEvent) null);
      // Undeclared exception!
      try {
        calendarPortletDataHandlerImpl0.getEventPath((PortletDataContext) null, (CalEvent) calEventWrapper0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      CalendarPortletDataHandlerImpl calendarPortletDataHandlerImpl0 = new CalendarPortletDataHandlerImpl();
      boolean boolean0 = calendarPortletDataHandlerImpl0.isPublishToLiveByDefault();
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      CalendarPortletDataHandlerImpl calendarPortletDataHandlerImpl0 = new CalendarPortletDataHandlerImpl();
      PortletDataHandlerControl[] portletDataHandlerControlArray0 = calendarPortletDataHandlerImpl0.getExportMetadataControls();
      assertNotNull(portletDataHandlerControlArray0);
  }

  @Test
  public void test6()  throws Throwable  {
      CalendarPortletDataHandlerImpl calendarPortletDataHandlerImpl0 = new CalendarPortletDataHandlerImpl();
      boolean boolean0 = calendarPortletDataHandlerImpl0.isAlwaysExportable();
      assertEquals(true, boolean0);
  }
}
