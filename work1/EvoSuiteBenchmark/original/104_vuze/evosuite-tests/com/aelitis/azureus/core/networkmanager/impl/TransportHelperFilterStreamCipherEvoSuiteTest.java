/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.networkmanager.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.networkmanager.impl.TransportCipher;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelper;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterStreamCipher;
import com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportHelper;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TransportHelperFilterStreamCipherEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterStreamCipher transportHelperFilterStreamCipher0 = new TransportHelperFilterStreamCipher((TransportHelper) tCPTransportHelper0, (TransportCipher) null, (TransportCipher) null);
      // Undeclared exception!
      try {
        transportHelperFilterStreamCipher0.getName(false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TransportHelperFilterStreamCipher transportHelperFilterStreamCipher0 = new TransportHelperFilterStreamCipher((TransportHelper) null, (TransportCipher) null, (TransportCipher) null);
      boolean boolean0 = transportHelperFilterStreamCipher0.isEncrypted();
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      TransportHelperFilterStreamCipher transportHelperFilterStreamCipher0 = new TransportHelperFilterStreamCipher((TransportHelper) null, (TransportCipher) null, (TransportCipher) null);
      // Undeclared exception!
      try {
        transportHelperFilterStreamCipher0.cryptoIn((ByteBuffer) null, (ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TransportHelperFilterStreamCipher transportHelperFilterStreamCipher0 = new TransportHelperFilterStreamCipher((TransportHelper) null, (TransportCipher) null, (TransportCipher) null);
      BTMessageDecoder bTMessageDecoder0 = new BTMessageDecoder();
      ByteBuffer byteBuffer0 = bTMessageDecoder0.destroy();
      // Undeclared exception!
      try {
        transportHelperFilterStreamCipher0.cryptoOut(byteBuffer0, byteBuffer0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      TCPTransportHelper tCPTransportHelper0 = new TCPTransportHelper((SocketChannel) null);
      TransportHelperFilterStreamCipher transportHelperFilterStreamCipher0 = new TransportHelperFilterStreamCipher((TransportHelper) tCPTransportHelper0, (TransportCipher) null, (TransportCipher) null);
      // Undeclared exception!
      try {
        transportHelperFilterStreamCipher0.getName(true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
