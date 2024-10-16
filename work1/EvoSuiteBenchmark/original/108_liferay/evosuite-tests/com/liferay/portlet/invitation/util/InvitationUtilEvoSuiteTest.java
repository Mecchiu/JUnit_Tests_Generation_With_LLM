/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.invitation.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.PortletPreferencesImpl;
import com.liferay.portlet.invitation.util.InvitationUtil;
import javax.portlet.PortletPreferences;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InvitationUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        InvitationUtil.getEmailMessageMaxRecipients();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      InvitationUtil invitationUtil0 = new InvitationUtil();
      assertNotNull(invitationUtil0);
  }

  @Test
  public void test2()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try {
        InvitationUtil.getEmailMessageBody((PortletPreferences) portletPreferencesImpl0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try {
        InvitationUtil.getEmailMessageSubject((PortletPreferences) portletPreferencesImpl0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }
}
