/*
 * This file was automatically generated by EvoSuite
 */

package org.quickserver.net.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import org.junit.BeforeClass;
import org.quickserver.net.qsadmin.CommandHandler;
import org.quickserver.net.server.ClientAuthenticationHandler;
import org.quickserver.net.server.ClientBinaryHandler;
import org.quickserver.net.server.ClientCommandHandler;
import org.quickserver.net.server.ClientData;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientEventHandler;
import org.quickserver.net.server.ClientExtendedEventHandler;
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;

@RunWith(EvoSuiteRunner.class)
public class TheClientEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getServer();
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("");
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientCommandHandler();
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test3()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test4()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setSocketChannel((SocketChannel) null);
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test5()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxConnectionMsg();
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test6()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocket();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test7()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(false);
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals(false, theClient0.getTrusted());
  }

  @Test
  public void test8()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      int int0 = theClient0.getMaxAuthTry();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals(false, theClient0.getTrusted());
      assertEquals(0, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(1947);
      assertEquals(1947, theClient0.getTimeout());
      assertEquals(false, theClient0.getTrusted());
  }

  @Test
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
  }

  @Test
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, boolean0);
      assertEquals(false, theClient0.getTrusted());
  }

  @Test
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("");
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientData();
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
  }

  @Test
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      
      ClientEvent clientEvent0 = ClientEvent.CLOSE_CON;
      theClient0.setClientEvent(clientEvent0);
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      int int0 = theClient0.getTimeout();
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
      assertEquals(0, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals(false, theClient0.getTrusted());
  }

  @Test
  public void test18()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientData((ClientData) null);
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
  }

  @Test
  public void test19()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) commandHandler0);
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals(false, theClient0.getTrusted());
  }

  @Test
  public void test20()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setServer((QuickServer) null);
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test21()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setCommunicationLogging(true);
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test22()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxAuthTryMsg();
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
  }

  @Test
  public void test23()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("qc#N#+SFW4");
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test24()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientWriteHandler();
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test25()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = theClient0.getClientEvent();
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertNotNull(clientEvent0);
  }

  @Test
  public void test26()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test27()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getTimeoutMsg();
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
  }

  @Test
  public void test28()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getTrusted();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, boolean0);
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test29()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler((ClientEventHandler) commandHandler0);
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals(false, theClient0.getTrusted());
  }

  @Test
  public void test30()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Socket socket0 = new Socket();
      theClient0.setSocket(socket0);
      String string0 = theClient0.toString();
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertNotNull(string0);
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", string0);
  }

  @Test
  public void test31()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
  }

  @Test
  public void test32()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocketChannel();
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
  }

  @Test
  public void test33()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test34()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test35()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
  }

  @Test
  public void test36()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(0);
      assertEquals(false, theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertEquals(true, theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
  }

  @Test
  public void test37()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEventHandler();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", theClient0.toString());
      assertEquals(false, theClient0.getTrusted());
      assertEquals(true, theClient0.getCommunicationLogging());
  }

  @Test
  public void test38()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = theClient0.toString();
      assertEquals(false, theClient0.getTrusted());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertEquals(true, theClient0.getCommunicationLogging());
      assertNotNull(string0);
  }
}
