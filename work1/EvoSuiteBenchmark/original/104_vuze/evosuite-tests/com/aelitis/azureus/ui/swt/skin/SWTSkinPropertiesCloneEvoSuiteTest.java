/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.ui.swt.skin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.ui.swt.skin.SWTColorWithAlpha;
import com.aelitis.azureus.ui.swt.skin.SWTSkinProperties;
import com.aelitis.azureus.ui.swt.skin.SWTSkinPropertiesClone;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.eclipse.swt.graphics.Color;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SWTSkinPropertiesCloneEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "Wn;LjE`L", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getClassLoader();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.hasKey((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[9];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "", stringArray0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PropertyResourceBundle propertyResourceBundle0 = new PropertyResourceBundle((InputStream) byteArrayInputStream0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.addResourceBundle((ResourceBundle) propertyResourceBundle0, "", classLoader0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "sH2^t\"", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.clearCache();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      SWTSkinProperties sWTSkinProperties0 = sWTSkinPropertiesClone0.getOriginalProperties();
      assertNull(sWTSkinProperties0);
  }

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[10];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "@PGC^,IB4", stringArray0);
      String[] stringArray1 = sWTSkinPropertiesClone0.getParamValues();
      assertSame(stringArray0, stringArray1);
  }

  @Test
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.addProperty((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "AXURLDock";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "~}FZ!L4IikhS~}FZ!L4IikhS.", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getColorValue(".type.type");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getIntValue("", 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[7];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      SWTColorWithAlpha sWTColorWithAlpha0 = sWTSkinPropertiesClone0.getColorWithAlpha((String) null);
      assertNull(sWTColorWithAlpha0);
  }

  @Test
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getColorWithAlpha("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "|K=aj\"SH-";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "|K=aj\"SH-", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getColorWithAlpha("AXURLDockItem");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = ".badV+^kt9^{T_g27ky";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, ".badV+^kt9^{T_g27ky", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getColorWithAlpha(".badV+^kt9^{T_g27ky");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "T{Y'l%5M[f";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "T{Y'l%5M[f", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getColor("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "$@:x%tt+F~y,l0<n.i";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "$@:x%tt+F~y,l0<n.i", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getColor("AXURLDock.type.type");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Checking ";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "Checking ", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getColor(".PmxE`&");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      int[] intArray0 = sWTSkinPropertiesClone0.getColorValue((String) null);
      assertNotNull(intArray0);
  }

  @Test
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Kc,CtqEA^ut~5vfIFz";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "Kc,CtqEA^ut~5vfIFz", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getColorValue("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "eKa~wY";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "eKa~wY", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getColorValue("eKa~wY");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      int int0 = sWTSkinPropertiesClone0.getIntValue((String) null, 1);
      assertEquals(1, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "@PGC^,IB4";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "@PGC^,IB4", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getIntValue("@PGC^,IB4", 2008);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = ".";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, ".", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getIntValue(".", 1717791858);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      String[] stringArray1 = sWTSkinPropertiesClone0.getStringArray((String) null);
      assertNull(stringArray1);
  }

  @Test
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringArray("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = ".type";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, ".type", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringArray(".type");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = ">>x{:vJ5D}]_*d";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, ">>x{:vJ5D}]_*d", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringArray("Up");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      String string0 = sWTSkinPropertiesClone0.getStringValue((String) null, (String) null);
      assertNull(string0);
  }

  @Test
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue("", "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "U";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "U", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue(".type.type", ".type.type");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = ">>x{:vJ5D}]_*d>>x{:vJ5D}]_*d";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, ">>x{:vJ5D}]_*d>>x{:vJ5D}]_*d", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue(">>x{:vJ5D}]_*d>>x{:vJ5D}]_*d", ">>x{:vJ5D}]_*d>>x{:vJ5D}]_*d");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      String string0 = sWTSkinPropertiesClone0.getStringValue((String) null);
      assertNull(string0);
  }

  @Test
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Yc)E%Gkw";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "Yc)E%Gkw", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "~}FZ!L4IikhS~}FZ!L4IikhS";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "~}FZ!L4IikhS~}FZ!L4IikhS", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue("~}FZ!L4IikhS~}FZ!L4IikhS");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[21];
      stringArray0[0] = "~}FZ!L4IikhS~}FZ!L4IikhS.";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "~}FZ!L4IikhS~}FZ!L4IikhS.", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue(".");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[9];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "isVisible", stringArray0);
      String[] stringArray1 = sWTSkinPropertiesClone0.getStringArray((String) null, stringArray0);
      assertNull(stringArray1);
  }

  @Test
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringArray("", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[24];
      stringArray0[0] = ">>x{:vJ5D}]_*d";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, ">>x{:vJ5D}]_*d", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringArray(">>x{:vJ5D}]_*d", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "._classic";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "._classic", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringArray("._classic", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[4];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "ConsoleInput: starting...ConsoleInput: starting...Ip Filter Enable Banning", stringArray0);
      String string0 = sWTSkinPropertiesClone0.getStringValue((String) null, stringArray0, "ConsoleInput: starting...ConsoleInput: starting...Ip Filter Enable Banning");
      assertEquals("ConsoleInput: starting...ConsoleInput: starting...Ip Filter Enable Banning", string0);
  }

  @Test
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue("", stringArray0, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "2E3>";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "not supported right now, implement it yourself :P", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue("2E3>", stringArray0, "sH2^t");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "`}";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, ".PmxE`&", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue(".PmxE`&", stringArray0, ".PmxE`&");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      String string0 = sWTSkinPropertiesClone0.getStringValue((String) null, stringArray0);
      assertNull(string0);
  }

  @Test
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "T{Y'l%5M[f[E!2wJ|@J[{?:?rDisVisible";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "T{Y'l%5M[f[E!2wJ|@J[{?:?rDisVisible", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue("", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[12];
      stringArray0[0] = "T{Y'l%5M[f";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "T{Y'l%5M[f", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue("T{Y'l%5M[f", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[18];
      stringArray0[0] = "Save Dir: ";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "Save Dir: ", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getStringValue(".type", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      boolean boolean0 = sWTSkinPropertiesClone0.getBooleanValue((String) null, false);
      assertEquals(false, boolean0);
  }

  @Test
  public void test47()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getBooleanValue("", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = ".bad";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, ".bad", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getBooleanValue(".bad", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "sk";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "sk", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getBooleanValue("sk", false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      Color color0 = sWTSkinPropertiesClone0.getColor((String) null, (Color) null);
      assertNull(color0);
  }

  @Test
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, (String) null, stringArray0);
      String string0 = sWTSkinPropertiesClone0.getReferenceID((String) null);
      assertNull(string0);
  }

  @Test
  public void test52()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getReferenceID("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "%YFqlE(";
      SWTSkinPropertiesClone sWTSkinPropertiesClone0 = new SWTSkinPropertiesClone((SWTSkinProperties) null, "%YFqlE(", stringArray0);
      // Undeclared exception!
      try {
        sWTSkinPropertiesClone0.getReferenceID("-s.Xy*u]SFf");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
