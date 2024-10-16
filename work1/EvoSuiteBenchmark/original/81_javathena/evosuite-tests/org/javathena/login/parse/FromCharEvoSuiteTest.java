/*
 * This file was automatically generated by EvoSuite
 */

package org.javathena.login.parse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.net.Socket;
import org.evosuite.runtime.System;
import org.javathena.core.data.IParse;
import org.javathena.core.data.Socket_data;
import org.javathena.login.parse.FromChar;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FromCharEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FromChar fromChar0 = new FromChar();
      Socket socket0 = new Socket();
      Socket_data socket_data0 = new Socket_data(socket0);
      byte[] byteArray0 = new byte[5];
      fromChar0.parse(socket_data0, byteArray0);
      assertEquals(0, socket_data0.getEof());
  }

  @Test
  public void test1()  throws Throwable  {
      FromChar fromChar0 = new FromChar();
      Socket socket0 = new Socket();
      Socket_data socket_data0 = new Socket_data(socket0, (IParse) fromChar0);
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte)20;
      byteArray0[1] = (byte)39;
      // Undeclared exception!
      try {
        fromChar0.parse(socket_data0, byteArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      FromChar fromChar0 = new FromChar();
      Socket_data socket_data0 = new Socket_data((Socket) null, (IParse) fromChar0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)39;
      byteArray0[1] = (byte)39;
      // Undeclared exception!
      try {
        fromChar0.parse(socket_data0, byteArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      FromChar fromChar0 = new FromChar();
      Socket_data socket_data0 = new Socket_data((Socket) null, (IParse) fromChar0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)45;
      byteArray0[1] = (byte)39;
      fromChar0.parse(socket_data0, byteArray0);
      assertEquals(0, socket_data0.getEof());
  }

  @Test
  public void test4()  throws Throwable  {
      FromChar fromChar0 = new FromChar();
      Socket socket0 = new Socket();
      Socket_data socket_data0 = new Socket_data(socket0);
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-1);
      // Undeclared exception!
      try {
        fromChar0.parse(socket_data0, byteArray0);
        fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      }
  }
}
