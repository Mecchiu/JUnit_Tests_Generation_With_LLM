/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xbus.technical.ldap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.technical.ldap.LDAPSender;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LDAPSenderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LDAPSender lDAPSender0 = new LDAPSender((XBUSSystem) null);
      String string0 = lDAPSender0.getType();
      assertEquals("Object", string0);
  }
}
