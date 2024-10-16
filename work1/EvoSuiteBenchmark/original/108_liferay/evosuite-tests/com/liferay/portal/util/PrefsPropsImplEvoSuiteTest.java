/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.util.PrefsPropsImpl;
import com.liferay.portlet.PortalPreferencesImpl;
import com.liferay.portlet.PortalPreferencesWrapper;
import com.liferay.portlet.PortletPreferencesImpl;
import com.liferay.portlet.PortletPreferencesWrapper;
import com.liferay.portlet.Preference;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.portlet.PortletPreferences;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PrefsPropsImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getStringArray("", "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getContent("\b((?!ddd)d+|1dd|2[0-4]d|25[0-5]).((?!ddd)d+|1dd|2[0-4]d|25[0-5]).((?!ddd)d+|1dd|2[0-4]d|25[0-5]).((?!ddd)d+|1dd|2[0-4]d|25[0-5])\b");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getProperties("", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getBoolean(0L, "", false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getInteger((-1714L), "f)WhY");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getStringArray((PortletPreferences) null, (-1597L), "Q}qYAmhB\"@*F", "");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesWrapper portletPreferencesWrapper0 = new PortletPreferencesWrapper((PortletPreferences) null, (String) null);
      // Undeclared exception!
      try {
        prefsPropsImpl0.getShort((PortletPreferences) portletPreferencesWrapper0, (-9223372036854775807L), (String) null);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getDouble("or>4]7D`RH$Q~)SgXI");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getShort("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getString((PortletPreferences) portletPreferencesImpl0, (-64L), "c;,2Z#vZJG(lU~n9Iv:");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getShort((-1L), "", (short)16);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      HashMap<String, Preference> hashMap0 = new HashMap<String, Preference>();
      PortalPreferencesImpl portalPreferencesImpl0 = new PortalPreferencesImpl(1175L, 1175L, 0, "", (Map<String, Preference>) hashMap0, true);
      PortalPreferencesWrapper portalPreferencesWrapper0 = new PortalPreferencesWrapper(portalPreferencesImpl0);
      String string0 = prefsPropsImpl0.getString((PortletPreferences) portalPreferencesWrapper0, (long) 0, "", true);
      assertEquals("true", string0);
      assertNotNull(string0);
  }

  @Test
  public void test12()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getShort((PortletPreferences) null, (-35L), "", (short)0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getShort((String) null, (short) (-1824));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getDouble("", 714.2749175681147);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getLong("Z~KA39Vi.s", 0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getContent((PortletPreferences) portletPreferencesImpl0, 1L, "WB?");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      String[] stringArray0 = new String[10];
      // Undeclared exception!
      try {
        prefsPropsImpl0.getStringArray((PortletPreferences) null, (-963L), "", "", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getContent(0L, "8BgQNC&F%d+z");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getString((-1606L), "", "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getInteger("Rb,hlw");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getLong((PortletPreferences) null, (-1L), "u7UfkJV0.o1dmf", 0L);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getLong((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getInteger("!w`3jw6Vh_9@jLc", 1044);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      Properties properties0 = prefsPropsImpl0.getProperties((PortletPreferences) portletPreferencesImpl0, 0L, "C>", true);
      assertEquals(true, properties0.isEmpty());
  }

  @Test
  public void test25()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getBoolean("getContextClassLoader");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getPreferences();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getBoolean("G9|P}O_vX&f", false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test28()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      boolean boolean0 = prefsPropsImpl0.getBoolean((PortletPreferences) portletPreferencesImpl0, 0L, "", true);
      assertEquals(true, boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getInteger(1114L, "", (-1));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getShort(717L, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test31()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      PortletPreferencesWrapper portletPreferencesWrapper0 = new PortletPreferencesWrapper((PortletPreferences) portletPreferencesImpl0, " _5_:[q?%Fga ");
      // Undeclared exception!
      try {
        prefsPropsImpl0.getDouble((PortletPreferences) portletPreferencesWrapper0, 0L, " _5_:[q?%Fga ");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test32()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getString((PortletPreferences) portletPreferencesImpl0, 1400L, "", "En'J)x5jiC>Kx]4^J/r");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test33()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortalPreferencesWrapper portalPreferencesWrapper0 = new PortalPreferencesWrapper((PortalPreferencesImpl) null);
      // Undeclared exception!
      try {
        prefsPropsImpl0.getLong((PortletPreferences) portalPreferencesWrapper0, 0L, "\r");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test34()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getString(1000L, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test35()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getString("sM'`VuNL_E`i<0`<", "sM'`VuNL_E`i<0`<");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test36()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getDouble(560L, "Server supports hot deploy", (double) 560L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test37()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getPreferences((-229L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test38()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      String[] stringArray0 = new String[10];
      // Undeclared exception!
      try {
        prefsPropsImpl0.getStringArray("Preferences cannot be stored inside a render call", "Preferences cannot be stored inside a render call", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test39()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getLong(195L, "V&Y");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test40()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getString((PortletPreferences) portletPreferencesImpl0, 1692L, "C", 0.0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test41()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      PortletPreferencesWrapper portletPreferencesWrapper0 = new PortletPreferencesWrapper((PortletPreferences) portletPreferencesImpl0, "~n9+BF+");
      // Undeclared exception!
      try {
        prefsPropsImpl0.getInteger((PortletPreferences) portletPreferencesWrapper0, (-658L), "~n9+BF+", 1);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test42()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getLong(813L, ",3P3`9('bPDk\" u*F_", 813L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test43()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getString((PortletPreferences) portletPreferencesImpl0, 0L, "7\"Jhz6(o~w", 0L);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test44()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try {
        prefsPropsImpl0.getStringFromNames((-51L), stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test45()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getString("gS&");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test46()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getInteger((PortletPreferences) portletPreferencesImpl0, 1594L, "Rb,hlw");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test47()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getBoolean((PortletPreferences) portletPreferencesImpl0, (-1481L), "/");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test48()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getBoolean(0L, "  ");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test49()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getString((PortletPreferences) null, (long) 0, "", 0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test50()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesWrapper portletPreferencesWrapper0 = new PortletPreferencesWrapper((PortletPreferences) null, "request.shared.attributes");
      // Undeclared exception!
      try {
        prefsPropsImpl0.getString((PortletPreferences) portletPreferencesWrapper0, (-1856L), "LDTCfe6G}26Oh_d/Oj", (short) (-866));
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }

  @Test
  public void test51()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try {
        prefsPropsImpl0.getStringArray(0L, "V}j5 +", "V}j5 +", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test52()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getDouble((-1738L), "Qmh&JIym");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test53()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      // Undeclared exception!
      try {
        prefsPropsImpl0.getStringArray((-1738L), "dy8])++/~:&Yo}~hI`G", "dy8])++/~:&Yo}~hI`G");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test54()  throws Throwable  {
      PrefsPropsImpl prefsPropsImpl0 = new PrefsPropsImpl();
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl((-76L), (-867L), 0, 1520L, "", "", (Map<String, Preference>) null);
      // Undeclared exception!
      try {
        prefsPropsImpl0.getDouble((PortletPreferences) portletPreferencesImpl0, 0L, "", 146.3202135758843);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class com.liferay.portal.util.PropsUtil
         */
      }
  }
}
