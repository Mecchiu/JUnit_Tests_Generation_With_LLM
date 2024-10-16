/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.peermanager.messaging.azureus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.networkmanager.impl.RawMessageImpl;
import com.aelitis.azureus.core.peermanager.messaging.Message;
import com.aelitis.azureus.core.peermanager.messaging.MessageException;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZHave;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageFactory;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTHaveAll;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTKeepAlive;
import org.gudy.azureus2.core3.util.DirectByteBuffer;
import org.gudy.azureus2.core3.util.DirectByteBufferPool;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AZMessageFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Message[] messageArray0 = new Message[1];
      AZMessageFactory.LegacyData aZMessageFactory_LegacyData0 = new AZMessageFactory.LegacyData(0, false, messageArray0);
      assertNotNull(aZMessageFactory_LegacyData0);
  }

  @Test
  public void test1()  throws Throwable  {
      AZMessageFactory aZMessageFactory0 = new AZMessageFactory();
      assertNotNull(aZMessageFactory0);
  }

  @Test
  public void test2()  throws Throwable  {
      try {
        AZMessageFactory.registerGenericMapPayloadMessageType("j5GCnmEeb<gQF%[dotl");
        fail("Expecting exception: MessageException");
      } catch(MessageException e) {
        /*
         * message type [j5GCnmEeb<gQF%[dotl] already registered!
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      AZMessageFactory.init();
  }

  @Test
  public void test4()  throws Throwable  {
      DirectByteBuffer directByteBuffer0 = DirectByteBufferPool.getBuffer((byte)48, (byte)48);
      try {
        AZMessageFactory.createAZMessage(directByteBuffer0);
        fail("Expecting exception: MessageException");
      } catch(MessageException e) {
        /*
         * invalid AZ id length given: 0, stream_payload.remaining(): 44, BT id?=0
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      BTKeepAlive bTKeepAlive0 = new BTKeepAlive((byte)0);
      RawMessageImpl rawMessageImpl0 = (RawMessageImpl)AZMessageFactory.createAZRawMessage((Message) bTKeepAlive0, (-572));
      assertEquals("BT1", rawMessageImpl0.getFeatureID());
  }

  @Test
  public void test6()  throws Throwable  {
      BTHaveAll bTHaveAll0 = new BTHaveAll((byte)3);
      RawMessageImpl rawMessageImpl0 = (RawMessageImpl)AZMessageFactory.createAZRawMessage((Message) bTHaveAll0, (int) (byte)3);
      assertEquals(true, rawMessageImpl0.isNoDelay());
  }

  @Test
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[5];
      AZHave aZHave0 = new AZHave(intArray0, (byte)98);
      RawMessageImpl rawMessageImpl0 = (RawMessageImpl)AZMessageFactory.createAZRawMessage((Message) aZHave0, 1113);
      assertEquals("AZ_HAVE 0,0,0,0,0", rawMessageImpl0.getDescription());
  }
}
