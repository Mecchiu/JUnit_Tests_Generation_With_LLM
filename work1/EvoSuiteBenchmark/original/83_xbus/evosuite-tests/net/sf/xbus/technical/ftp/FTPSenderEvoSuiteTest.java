/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xbus.technical.ftp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.xbus.base.core.XException;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.technical.ftp.FTPSender;
import org.evosuite.runtime.System;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FTPSenderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FTPSender fTPSender0 = null;
      try {
        fTPSender0 = new FTPSender((XBUSSystem) null);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      }
  }
}
