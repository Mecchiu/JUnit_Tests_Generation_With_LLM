/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.networkmanager.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.networkmanager.OutgoingMessageQueue;
import com.aelitis.azureus.core.networkmanager.RawMessage;
import com.aelitis.azureus.core.networkmanager.Transport;
import com.aelitis.azureus.core.networkmanager.impl.OutgoingMessageQueueImpl;
import com.aelitis.azureus.core.peermanager.messaging.Message;
import com.aelitis.azureus.core.peermanager.messaging.MessageStreamEncoder;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZBadPiece;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageEncoder;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZMetaData;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZRequestHint;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTBitfield;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTChoke;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTDHTPort;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTInterested;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageEncoder;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTPiece;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTUnchoke;
import java.io.IOException;
import org.gudy.azureus2.core3.util.DirectByteBuffer;
import org.gudy.azureus2.core3.util.DirectByteBufferPool;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OutgoingMessageQueueImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-361));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      outgoingMessageQueueImpl0.setEncoder((MessageStreamEncoder) aZMessageEncoder0);
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
  }

  @Test
  public void test1()  throws Throwable  {
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) null);
      boolean boolean0 = outgoingMessageQueueImpl0.isDestroyed();
      assertEquals(false, boolean0);
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
  }

  @Test
  public void test2()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(12);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      outgoingMessageQueueImpl0.cancelQueueListener((OutgoingMessageQueue.MessageQueueListener) null);
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
  }

  @Test
  public void test3()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(12);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      int int0 = outgoingMessageQueueImpl0.getProtocolQueuedBytes();
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(0, int0);
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
  }

  @Test
  public void test4()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(0);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      
      outgoingMessageQueueImpl0.setPriorityBoost(true);
      assertEquals(true, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(0, outgoingMessageQueueImpl0.getTotalSize());
  }

  @Test
  public void test5()  throws Throwable  {
      BTMessageEncoder bTMessageEncoder0 = new BTMessageEncoder();
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) bTMessageEncoder0);
      boolean boolean0 = outgoingMessageQueueImpl0.getPriorityBoost();
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(false, boolean0);
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
  }

  @Test
  public void test6()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-686));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      int int0 = outgoingMessageQueueImpl0.getTotalSize();
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(0, outgoingMessageQueueImpl0.getDataQueuedBytes());
      assertEquals(0, int0);
  }

  @Test
  public void test7()  throws Throwable  {
      BTMessageEncoder bTMessageEncoder0 = new BTMessageEncoder();
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) bTMessageEncoder0);
      int int0 = outgoingMessageQueueImpl0.getDataQueuedBytes();
      assertEquals(0, outgoingMessageQueueImpl0.getTotalSize());
      assertEquals(0, int0);
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
  }

  @Test
  public void test8()  throws Throwable  {
      BTMessageEncoder bTMessageEncoder0 = new BTMessageEncoder();
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) bTMessageEncoder0);
      // Undeclared exception!
      try {
        outgoingMessageQueueImpl0.setTrace(false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      BTMessageEncoder bTMessageEncoder0 = new BTMessageEncoder();
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) bTMessageEncoder0);
      outgoingMessageQueueImpl0.setTransport((Transport) null);
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
  }

  @Test
  public void test10()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(12);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      AZMessageEncoder aZMessageEncoder1 = (AZMessageEncoder)outgoingMessageQueueImpl0.getEncoder();
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      assertNotNull(aZMessageEncoder1);
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
  }

  @Test
  public void test11()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(30);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      int int0 = outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage();
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals((-1), int0);
  }

  @Test
  public void test12()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-686));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      int int0 = outgoingMessageQueueImpl0.getMssSize();
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      assertEquals(1460, int0);
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
  }

  @Test
  public void test13()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(0);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      
      outgoingMessageQueueImpl0.destroy();
      BTUnchoke bTUnchoke0 = new BTUnchoke((byte) (-84));
      outgoingMessageQueueImpl0.addMessage((Message) bTUnchoke0, true);
      assertEquals(true, outgoingMessageQueueImpl0.isDestroyed());
  }

  @Test
  public void test14()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(25);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      BTDHTPort bTDHTPort0 = new BTDHTPort(25);
      outgoingMessageQueueImpl0.addMessage((Message) bTDHTPort0, false);
      assertEquals(22, outgoingMessageQueueImpl0.getTotalSize());
      
      outgoingMessageQueueImpl0.destroy();
      assertEquals("**** OUTGOING QUEUE TRACE ****\n", outgoingMessageQueueImpl0.getQueueTrace());
  }

  @Test
  public void test15()  throws Throwable  {
      BTMessageEncoder bTMessageEncoder0 = new BTMessageEncoder();
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) bTMessageEncoder0);
      boolean boolean0 = outgoingMessageQueueImpl0.isBlocked();
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(false, boolean0);
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
  }

  @Test
  public void test16()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-361));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      BTInterested bTInterested0 = new BTInterested((byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) bTInterested0, true);
      boolean boolean0 = outgoingMessageQueueImpl0.hasUrgentMessage();
      assertEquals("**** OUTGOING QUEUE TRACE ****\n[#0 0:22]: BT_INTERESTED [BT_INTERESTED]\n", outgoingMessageQueueImpl0.getQueueTrace());
      assertEquals(true, boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(12);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      boolean boolean0 = outgoingMessageQueueImpl0.hasUrgentMessage();
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(false, boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-361));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      BTInterested bTInterested0 = new BTInterested((byte)0);
      outgoingMessageQueueImpl0.registerQueueListener((OutgoingMessageQueue.MessageQueueListener) null);
      // Undeclared exception!
      try {
        outgoingMessageQueueImpl0.addMessage((Message) bTInterested0, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-361));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      BTInterested bTInterested0 = new BTInterested((byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) bTInterested0, false);
      outgoingMessageQueueImpl0.addMessage((Message) bTInterested0, true);
      boolean boolean0 = outgoingMessageQueueImpl0.removeMessage((Message) bTInterested0, false);
      assertEquals(true, outgoingMessageQueueImpl0.hasUrgentMessage());
      assertEquals(true, boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-932));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      AZRequestHint aZRequestHint0 = new AZRequestHint((-686), (-932), (int) (byte)0, (-932), (byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) aZRequestHint0, true);
      BTChoke bTChoke0 = new BTChoke((byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) bTChoke0, false);
      assertEquals(true, outgoingMessageQueueImpl0.hasUrgentMessage());
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
  }

  @Test
  public void test21()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-1403));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte)113, 461);
      BTPiece bTPiece0 = new BTPiece((-1403), 1401, directByteBuffer0, (byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) bTPiece0, true);
      assertEquals(486, outgoingMessageQueueImpl0.getDataQueuedBytes());
      assertEquals(486, outgoingMessageQueueImpl0.getTotalSize());
  }

  @Test
  public void test22()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-932));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      BTChoke bTChoke0 = new BTChoke((byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) bTChoke0, false);
      outgoingMessageQueueImpl0.addMessage((Message) bTChoke0, false);
      assertEquals(true, outgoingMessageQueueImpl0.hasUrgentMessage());
      
      Message[] messageArray0 = new Message[9];
      messageArray0[0] = (Message) bTChoke0;
      outgoingMessageQueueImpl0.removeMessagesOfType(messageArray0, false);
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
  }

  @Test
  public void test23()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-932));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      BTChoke bTChoke0 = new BTChoke((byte)0);
      RawMessage[] rawMessageArray0 = aZMessageEncoder0.encodeMessage((Message) bTChoke0);
      outgoingMessageQueueImpl0.addMessage((Message) bTChoke0, true);
      assertEquals("**** OUTGOING QUEUE TRACE ****\n[#0 0:17]: BT_CHOKE [BT_CHOKE]\n", outgoingMessageQueueImpl0.getQueueTrace());
      
      outgoingMessageQueueImpl0.removeMessagesOfType((Message[]) rawMessageArray0, true);
      outgoingMessageQueueImpl0.doListenerNotifications();
      assertEquals(0, outgoingMessageQueueImpl0.getTotalSize());
  }

  @Test
  public void test24()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-361));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      BTInterested bTInterested0 = new BTInterested((byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) bTInterested0, false);
      assertEquals(true, outgoingMessageQueueImpl0.hasUrgentMessage());
      
      boolean boolean0 = outgoingMessageQueueImpl0.removeMessage((Message) bTInterested0, false);
      assertEquals(true, boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-686));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      BTChoke bTChoke0 = new BTChoke((byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) bTChoke0, true);
      AZBadPiece aZBadPiece0 = new AZBadPiece(0, (byte)0);
      boolean boolean0 = outgoingMessageQueueImpl0.removeMessage((Message) aZBadPiece0, true);
      assertEquals("**** OUTGOING QUEUE TRACE ****\n[#0 0:17]: BT_CHOKE [BT_CHOKE]\n", outgoingMessageQueueImpl0.getQueueTrace());
      assertEquals(false, boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-361));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      BTInterested bTInterested0 = new BTInterested((byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) bTInterested0, true);
      assertEquals("**** OUTGOING QUEUE TRACE ****\n[#0 0:22]: BT_INTERESTED [BT_INTERESTED]\n", outgoingMessageQueueImpl0.getQueueTrace());
      
      boolean boolean0 = outgoingMessageQueueImpl0.removeMessage((Message) bTInterested0, true);
      assertEquals(true, boolean0);
  }

  @Test
  public void test27()  throws Throwable  {
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) null);
      try {
        outgoingMessageQueueImpl0.deliverToTransport(1393, false);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * not ready to deliver data
         */
      }
  }

  @Test
  public void test28()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(0);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      int int0 = outgoingMessageQueueImpl0.deliverToTransport(0, false);
      assertEquals(0, int0);
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
  }

  @Test
  public void test29()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-1403));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      outgoingMessageQueueImpl0.flush();
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
  }

  @Test
  public void test30()  throws Throwable  {
      AZBadPiece aZBadPiece0 = new AZBadPiece(0, (byte)86);
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(0);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte)86, (byte)86);
      BTBitfield bTBitfield0 = new BTBitfield(directByteBuffer0, (byte)86);
      outgoingMessageQueueImpl0.addMessage((Message) bTBitfield0, true);
      outgoingMessageQueueImpl0.addMessage((Message) aZBadPiece0, true);
      outgoingMessageQueueImpl0.flush();
      assertEquals(139, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
  }

  @Test
  public void test31()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-932));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      BTChoke bTChoke0 = new BTChoke((byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) bTChoke0, true);
      outgoingMessageQueueImpl0.doListenerNotifications();
      assertEquals(true, outgoingMessageQueueImpl0.hasUrgentMessage());
      assertEquals(17, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
  }

  @Test
  public void test32()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(0);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      outgoingMessageQueueImpl0.doListenerNotifications();
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(0, outgoingMessageQueueImpl0.getDataQueuedBytes());
  }

  @Test
  public void test33()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder((-932));
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      AZRequestHint aZRequestHint0 = new AZRequestHint((-686), (-932), (int) (byte)0, (-932), (byte)0);
      outgoingMessageQueueImpl0.addMessage((Message) aZRequestHint0, true);
      String string0 = outgoingMessageQueueImpl0.getQueueTrace();
      assertEquals(76, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals("**** OUTGOING QUEUE TRACE ****\n[#0 0:24]: AZ_REQUEST_HINT [AZ_REQUEST_HINT piece #-686:-932->-933/-932]\n", string0);
  }

  @Test
  public void test34()  throws Throwable  {
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(12);
      OutgoingMessageQueueImpl outgoingMessageQueueImpl0 = new OutgoingMessageQueueImpl((MessageStreamEncoder) aZMessageEncoder0);
      AZMetaData aZMetaData0 = new AZMetaData(12, (byte)0);
      outgoingMessageQueueImpl0.notifyOfExternallySentMessage((Message) aZMetaData0);
      assertEquals(-1, outgoingMessageQueueImpl0.getPercentDoneOfCurrentMessage());
      assertEquals(0, outgoingMessageQueueImpl0.getProtocolQueuedBytes());
      assertEquals(false, outgoingMessageQueueImpl0.getPriorityBoost());
      assertEquals(false, outgoingMessageQueueImpl0.isDestroyed());
  }
}
