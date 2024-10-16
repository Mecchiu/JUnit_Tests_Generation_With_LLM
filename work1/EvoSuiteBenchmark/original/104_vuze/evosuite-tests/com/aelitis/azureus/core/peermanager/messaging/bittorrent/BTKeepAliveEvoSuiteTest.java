/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.peermanager.messaging.bittorrent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.peermanager.messaging.MessageException;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTKeepAlive;
import org.gudy.azureus2.core3.util.DirectByteBuffer;
import org.gudy.azureus2.core3.util.DirectByteBufferPool;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BTKeepAliveEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-27));
      String string0 = bTKeepAlive0.getDescription();
      assertEquals("BT_KEEP_ALIVE", string0);
      assertEquals(-27, bTKeepAlive0.getVersion());
      assertEquals(false, bTKeepAlive0.isNoDelay());
  }

  @Test
  public void test1()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-27));
      assertEquals(false, bTKeepAlive0.isNoDelay());
      
      bTKeepAlive0.setNoDelay();
      assertEquals(true, bTKeepAlive0.isNoDelay());
      assertEquals(-27, bTKeepAlive0.getVersion());
  }

  @Test
  public void test2()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-3));
      BTKeepAlive bTKeepAlive1 = (BTKeepAlive)bTKeepAlive0.getBaseMessage();
      assertEquals(false, bTKeepAlive0.isNoDelay());
      assertEquals(-3, bTKeepAlive0.getVersion());
      assertEquals(-3, bTKeepAlive1.getVersion());
  }

  @Test
  public void test3()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-27));
      int int0 = bTKeepAlive0.getType();
      assertEquals(0, int0);
      assertEquals(false, bTKeepAlive0.isNoDelay());
      assertEquals(-27, bTKeepAlive0.getVersion());
  }

  @Test
  public void test4()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-27));
      int int0 = bTKeepAlive0.getPriority();
      assertEquals(false, bTKeepAlive0.isNoDelay());
      assertEquals(-27, bTKeepAlive0.getVersion());
      assertEquals(0, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte)65);
      int int0 = bTKeepAlive0.getFeatureSubID();
      assertEquals(65, bTKeepAlive0.getVersion());
      assertEquals(false, bTKeepAlive0.isNoDelay());
      assertEquals(11, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-27));
      boolean boolean0 = bTKeepAlive0.isNoDelay();
      assertEquals(false, boolean0);
      assertEquals(-27, bTKeepAlive0.getVersion());
  }

  @Test
  public void test7()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte)22);
      byte byte0 = bTKeepAlive0.getVersion();
      assertEquals((byte)22, byte0);
      assertEquals(false, bTKeepAlive0.isNoDelay());
  }

  @Test
  public void test8()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-27));
      bTKeepAlive0.messagesToRemove();
      assertEquals(-27, bTKeepAlive0.getVersion());
      assertEquals(false, bTKeepAlive0.isNoDelay());
  }

  @Test
  public void test9()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte)0);
      byte[] byteArray0 = bTKeepAlive0.getIDBytes();
      assertEquals(0, bTKeepAlive0.getVersion());
      assertNotNull(byteArray0);
      assertEquals(false, bTKeepAlive0.isNoDelay());
  }

  @Test
  public void test10()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-3));
      bTKeepAlive0.getData();
      assertEquals(false, bTKeepAlive0.isNoDelay());
      assertEquals(-3, bTKeepAlive0.getVersion());
  }

  @Test
  public void test11()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-27));
      String string0 = bTKeepAlive0.getFeatureID();
      assertEquals(-27, bTKeepAlive0.getVersion());
      assertEquals("BT1", string0);
      assertEquals(false, bTKeepAlive0.isNoDelay());
  }

  @Test
  public void test12()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-27));
      BTKeepAlive bTKeepAlive1 = (BTKeepAlive)bTKeepAlive0.deserialize((DirectByteBuffer) null, (byte) (-1));
      assertEquals(-1, bTKeepAlive1.getVersion());
      assertEquals(false, bTKeepAlive1.isNoDelay());
      assertNotNull(bTKeepAlive1);
  }

  @Test
  public void test13()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-3));
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte)99, (byte)99);
      try {
        bTKeepAlive0.deserialize(directByteBuffer0, (byte) (-3));
        fail("Expecting exception: MessageException");
      } catch(MessageException e) {
        /*
         * [BT_KEEP_ALIVE] decode error: payload not empty
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte) (-3));
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte)99, (byte)99);
      directByteBuffer0.flip((byte)99);
      BTKeepAlive bTKeepAlive1 = (BTKeepAlive)bTKeepAlive0.deserialize(directByteBuffer0, (byte) (-3));
      assertEquals(false, bTKeepAlive1.isNoDelay());
      assertEquals(-3, bTKeepAlive1.getVersion());
      assertNotNull(bTKeepAlive1);
  }

  @Test
  public void test15()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte)22);
      DirectByteBuffer[] directByteBufferArray0 = bTKeepAlive0.getRawData();
      assertNotNull(directByteBufferArray0);
      
      DirectByteBuffer[] directByteBufferArray1 = bTKeepAlive0.getRawData();
      assertEquals(22, bTKeepAlive0.getVersion());
      assertSame(directByteBufferArray1, directByteBufferArray0);
      assertEquals(false, bTKeepAlive0.isNoDelay());
  }

  @Test
  public void test16()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte)0);
      bTKeepAlive0.destroy();
      assertEquals(0, bTKeepAlive0.getVersion());
      assertEquals(false, bTKeepAlive0.isNoDelay());
  }

  @Test
  public void test17()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte)22);
      DirectByteBuffer[] directByteBufferArray0 = bTKeepAlive0.getRawData();
      assertNotNull(directByteBufferArray0);
      
      bTKeepAlive0.destroy();
      assertEquals(false, bTKeepAlive0.isNoDelay());
      assertEquals(22, bTKeepAlive0.getVersion());
  }
}
