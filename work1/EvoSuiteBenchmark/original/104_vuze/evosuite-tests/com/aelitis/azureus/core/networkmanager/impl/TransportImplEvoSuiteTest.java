/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.networkmanager.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.networkmanager.ConnectionEndpoint;
import com.aelitis.azureus.core.networkmanager.EventWaiter;
import com.aelitis.azureus.core.networkmanager.NetworkConnection;
import com.aelitis.azureus.core.networkmanager.impl.NetworkConnectionImpl;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilter;
import com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterInserter;
import com.aelitis.azureus.core.networkmanager.impl.tcp.ProtocolEndpointTCP;
import com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportImpl;
import com.aelitis.azureus.core.peermanager.messaging.MessageStreamDecoder;
import com.aelitis.azureus.core.peermanager.messaging.MessageStreamEncoder;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageDecoder;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageEncoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.gudy.azureus2.core3.util.DirectByteBuffer;
import org.gudy.azureus2.core3.util.DirectByteBufferPool;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TransportImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      byte[][] byteArray0 = new byte[1][3];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, false, false, byteArray0);
      // Undeclared exception!
      try {
        tCPTransportImpl0.readFailed((Throwable) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      tCPTransportImpl0.setTrace(true);
      tCPTransportImpl0.setFilter((TransportHelperFilter) null);
      assertEquals(false, tCPTransportImpl0.isEncrypted());
  }

  @Test
  public void test2()  throws Throwable  {
      byte[][] byteArray0 = new byte[4][2];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, true, byteArray0);
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      NetworkConnectionImpl networkConnectionImpl0 = new NetworkConnectionImpl((ConnectionEndpoint) null, (MessageStreamEncoder) null, (MessageStreamDecoder) aZMessageDecoder0, false, false, byteArray0);
      tCPTransportImpl0.unbindConnection((NetworkConnection) networkConnectionImpl0);
      assertEquals("TCP", tCPTransportImpl0.getProtocol());
  }

  @Test
  public void test3()  throws Throwable  {
      byte[][] byteArray0 = new byte[10][2];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, false, true, byteArray0);
      tCPTransportImpl0.connectedInbound();
      assertEquals(1460, tCPTransportImpl0.getMssSize());
  }

  @Test
  public void test4()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][2];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, false, false, byteArray0);
      // Undeclared exception!
      try {
        tCPTransportImpl0.writeFailed((Throwable) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      byte[][] byteArray0 = new byte[10][2];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, false, true, byteArray0);
      tCPTransportImpl0.close("Ktc5_EEaHB");
      assertEquals(false, tCPTransportImpl0.isEncrypted());
  }

  @Test
  public void test6()  throws Throwable  {
      byte[][] byteArray0 = new byte[9][10];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      BTMessageEncoder bTMessageEncoder0 = new BTMessageEncoder();
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      NetworkConnectionImpl networkConnectionImpl0 = new NetworkConnectionImpl((ConnectionEndpoint) null, (MessageStreamEncoder) bTMessageEncoder0, (MessageStreamDecoder) aZMessageDecoder0, false, true, byteArray0);
      tCPTransportImpl0.bindConnection((NetworkConnection) networkConnectionImpl0);
      assertEquals(true, tCPTransportImpl0.isTCP());
  }

  @Test
  public void test7()  throws Throwable  {
      byte[][] byteArray0 = new byte[10][2];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, false, true, byteArray0);
      tCPTransportImpl0.connectedOutbound();
      assertEquals("TCP", tCPTransportImpl0.getProtocol());
  }

  @Test
  public void test8()  throws Throwable  {
      byte[][] byteArray0 = new byte[4][4];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, false, true, byteArray0);
      tCPTransportImpl0.setAlreadyRead((ByteBuffer) null);
      assertEquals(0, tCPTransportImpl0.getTransportMode());
  }

  @Test
  public void test9()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte) (-1), (byte)109);
      ByteBuffer byteBuffer0 = directByteBuffer0.getBuffer((byte) (-39));
      tCPTransportImpl0.setAlreadyRead(byteBuffer0);
      tCPTransportImpl0.setAlreadyRead(byteBuffer0);
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(false, byteBuffer0.hasRemaining());
  }

  @Test
  public void test10()  throws Throwable  {
      byte[][] byteArray0 = new byte[1][6];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, true, byteArray0);
      BTMessageDecoder bTMessageDecoder0 = new BTMessageDecoder();
      ByteBuffer byteBuffer0 = bTMessageDecoder0.destroy();
      tCPTransportImpl0.setAlreadyRead(byteBuffer0);
      assertEquals(true, tCPTransportImpl0.isTCP());
  }

  @Test
  public void test11()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      TransportHelperFilterInserter transportHelperFilterInserter0 = new TransportHelperFilterInserter((TransportHelperFilter) null, (ByteBuffer) null);
      tCPTransportImpl0.setFilter((TransportHelperFilter) transportHelperFilterInserter0);
      // Undeclared exception!
      try {
        tCPTransportImpl0.getEncryption(true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      byte[][] byteArray0 = new byte[9][10];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      String string0 = tCPTransportImpl0.getEncryption(true);
      assertEquals("", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      byte[][] byteArray0 = new byte[8][3];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, true, byteArray0);
      boolean boolean0 = tCPTransportImpl0.isEncrypted();
      assertEquals(false, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      byte[][] byteArray0 = new byte[9][10];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      boolean boolean0 = tCPTransportImpl0.isReadyForWrite((EventWaiter) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      EventWaiter eventWaiter0 = new EventWaiter();
      tCPTransportImpl0.isReadyForWrite(eventWaiter0);
      boolean boolean0 = tCPTransportImpl0.readyForWrite(true);
      assertEquals(true, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      tCPTransportImpl0.setTrace(true);
      boolean boolean0 = tCPTransportImpl0.readyForWrite(true);
      assertEquals(true, boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      boolean boolean0 = tCPTransportImpl0.readyForWrite(true);
      assertEquals(true, boolean0);
      
      boolean boolean1 = tCPTransportImpl0.readyForWrite(true);
      assertEquals(false, boolean1);
  }

  @Test
  public void test18()  throws Throwable  {
      byte[][] byteArray0 = new byte[4][4];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, false, true, byteArray0);
      long long0 = tCPTransportImpl0.isReadyForRead((EventWaiter) null);
      assertEquals(1L, long0);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[][] byteArray0 = new byte[8][3];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, true, byteArray0);
      EventWaiter eventWaiter0 = new EventWaiter();
      tCPTransportImpl0.isReadyForRead(eventWaiter0);
      tCPTransportImpl0.setReadyForRead();
      assertEquals(false, tCPTransportImpl0.isEncrypted());
  }

  @Test
  public void test20()  throws Throwable  {
      byte[][] byteArray0 = new byte[8][3];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, true, byteArray0);
      EventWaiter eventWaiter0 = new EventWaiter();
      tCPTransportImpl0.setReadyForRead();
      long long0 = tCPTransportImpl0.isReadyForRead(eventWaiter0);
      assertEquals(0L, long0);
  }

  @Test
  public void test21()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte)9, (byte)109);
      ByteBuffer byteBuffer0 = directByteBuffer0.getBuffer((byte)1);
      tCPTransportImpl0.setAlreadyRead(byteBuffer0);
      tCPTransportImpl0.setReadyForRead();
      assertEquals("TCP", tCPTransportImpl0.getProtocol());
  }

  @Test
  public void test22()  throws Throwable  {
      byte[][] byteArray0 = new byte[4][2];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, true, byteArray0);
      ByteBuffer[] byteBufferArray0 = new ByteBuffer[2];
      long long0 = tCPTransportImpl0.write(byteBufferArray0, 0, 49);
      assertEquals(0L, long0);
  }

  @Test
  public void test23()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      ByteBuffer[] byteBufferArray0 = new ByteBuffer[1];
      try {
        tCPTransportImpl0.read(byteBufferArray0, (int) (byte)0, 1460);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Transport not ready
         */
      }
  }

  @Test
  public void test24()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte) (-1), (byte)109);
      ByteBuffer byteBuffer0 = directByteBuffer0.getBuffer((byte) (-39));
      tCPTransportImpl0.setAlreadyRead(byteBuffer0);
      ByteBuffer[] byteBufferArray0 = new ByteBuffer[1];
      byteBufferArray0[0] = byteBuffer0;
      // Undeclared exception!
      try {
        tCPTransportImpl0.read(byteBufferArray0, (int) (byte)0, 1460);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte) (-1), (byte)109);
      ByteBuffer byteBuffer0 = directByteBuffer0.getBuffer((byte) (-39));
      tCPTransportImpl0.setAlreadyRead(byteBuffer0);
      DirectByteBuffer directByteBuffer1 = DirectByteBufferPool.getBuffer((byte) (-2), (byte)1);
      ByteBuffer byteBuffer1 = directByteBuffer1.getBuffer((byte)1);
      ByteBuffer[] byteBufferArray0 = new ByteBuffer[1];
      byteBufferArray0[0] = byteBuffer1;
      // Undeclared exception!
      try {
        tCPTransportImpl0.read(byteBufferArray0, (int) (byte)0, 1460);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1
         */
      }
  }

  @Test
  public void test26()  throws Throwable  {
      byte[][] byteArray0 = new byte[6][1];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, false, byteArray0);
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte)9, (byte)1);
      ByteBuffer byteBuffer0 = directByteBuffer0.getBuffer((byte)1);
      tCPTransportImpl0.setAlreadyRead(byteBuffer0);
      ByteBuffer[] byteBufferArray0 = new ByteBuffer[1];
      byteBufferArray0[0] = byteBuffer0;
      try {
        tCPTransportImpl0.read(byteBufferArray0, (int) (byte)1, 0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Transport not ready
         */
      }
  }

  @Test
  public void test27()  throws Throwable  {
      byte[][] byteArray0 = new byte[8][3];
      TCPTransportImpl tCPTransportImpl0 = new TCPTransportImpl((ProtocolEndpointTCP) null, true, true, byteArray0);
      BTMessageDecoder bTMessageDecoder0 = new BTMessageDecoder();
      ByteBuffer byteBuffer0 = bTMessageDecoder0.destroy();
      TransportHelperFilterInserter transportHelperFilterInserter0 = new TransportHelperFilterInserter((TransportHelperFilter) null, byteBuffer0);
      tCPTransportImpl0.setFilter((TransportHelperFilter) transportHelperFilterInserter0);
      // Undeclared exception!
      try {
        tCPTransportImpl0.setTrace(true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
