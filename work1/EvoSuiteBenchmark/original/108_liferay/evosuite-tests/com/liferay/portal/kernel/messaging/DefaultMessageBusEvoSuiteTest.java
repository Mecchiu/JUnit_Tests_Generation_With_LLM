/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.messaging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.messaging.BridgingMessageListener;
import com.liferay.portal.kernel.messaging.DefaultMessageBus;
import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.DestinationEventListener;
import com.liferay.portal.kernel.messaging.DummyMessageListener;
import com.liferay.portal.kernel.messaging.GlobalDestinationEventListener;
import com.liferay.portal.kernel.messaging.InvokerMessageListener;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.ParallelDestination;
import com.liferay.portal.kernel.messaging.SerialDestination;
import com.liferay.portal.kernel.messaging.sender.DefaultSingleDestinationMessageSender;
import com.liferay.portal.kernel.messaging.sender.SingleDestinationMessageSender;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultMessageBusEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      int int0 = defaultMessageBus0.getDestinationCount();
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      SerialDestination serialDestination0 = new SerialDestination();
      defaultMessageBus0.addDestination((Destination) serialDestination0);
      boolean boolean0 = defaultMessageBus0.hasMessageListener("");
      assertEquals(1, defaultMessageBus0.getDestinationCount());
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      // Undeclared exception!
      try {
        defaultMessageBus0.replace((Destination) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      defaultMessageBus0.destroy();
      assertEquals(0, defaultMessageBus0.getDestinationCount());
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      BridgingMessageListener bridgingMessageListener0 = new BridgingMessageListener();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      InvokerMessageListener invokerMessageListener0 = new InvokerMessageListener((MessageListener) bridgingMessageListener0, classLoader0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      GlobalDestinationEventListener globalDestinationEventListener0 = new GlobalDestinationEventListener((MessageListener) invokerMessageListener0, (List<String>) linkedList0);
      defaultMessageBus0.addDestinationEventListener((DestinationEventListener) globalDestinationEventListener0);
      SerialDestination serialDestination0 = new SerialDestination();
      defaultMessageBus0.addDestination((Destination) serialDestination0);
      boolean boolean0 = defaultMessageBus0.hasMessageListener("");
      assertEquals(1, defaultMessageBus0.getDestinationCount());
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      Collection<String> collection0 = defaultMessageBus0.getDestinationNames();
      assertEquals(true, collection0.isEmpty());
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      Destination destination0 = defaultMessageBus0.getDestination("^y $C!P~f");
      assertNull(destination0);
  }

  @Test
  public void test7()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      GlobalDestinationEventListener globalDestinationEventListener0 = new GlobalDestinationEventListener();
      defaultMessageBus0.removeDestinationEventListener((DestinationEventListener) globalDestinationEventListener0);
      assertEquals(0, defaultMessageBus0.getDestinationCount());
  }

  @Test
  public void test8()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      boolean boolean0 = defaultMessageBus0.hasDestination("");
      assertEquals(true, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      Collection<Destination> collection0 = defaultMessageBus0.getDestinations();
      assertEquals(0, collection0.size());
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      GlobalDestinationEventListener globalDestinationEventListener0 = new GlobalDestinationEventListener();
      defaultMessageBus0.addDestinationEventListener("^y $C!P~f", (DestinationEventListener) globalDestinationEventListener0);
      assertEquals(0, defaultMessageBus0.getDestinationCount());
  }

  @Test
  public void test11()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      GlobalDestinationEventListener globalDestinationEventListener0 = new GlobalDestinationEventListener();
      SerialDestination serialDestination0 = new SerialDestination();
      defaultMessageBus0.addDestination((Destination) serialDestination0);
      defaultMessageBus0.addDestinationEventListener("", (DestinationEventListener) globalDestinationEventListener0);
      assertEquals(1, defaultMessageBus0.getDestinationCount());
  }

  @Test
  public void test12()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      boolean boolean0 = defaultMessageBus0.hasMessageListener("^y $C!P~f");
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      DummyMessageListener dummyMessageListener0 = new DummyMessageListener();
      // Undeclared exception!
      try {
        defaultMessageBus0.registerMessageListener("jcifs.smb.client8useUnico_e", (MessageListener) dummyMessageListener0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Destination jcifs.smb.client8useUnico_e is not configured
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      BridgingMessageListener bridgingMessageListener0 = new BridgingMessageListener();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      InvokerMessageListener invokerMessageListener0 = new InvokerMessageListener((MessageListener) bridgingMessageListener0, classLoader0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      GlobalDestinationEventListener globalDestinationEventListener0 = new GlobalDestinationEventListener((MessageListener) invokerMessageListener0, (List<String>) linkedList0);
      defaultMessageBus0.addDestinationEventListener((DestinationEventListener) globalDestinationEventListener0);
      SerialDestination serialDestination0 = new SerialDestination();
      defaultMessageBus0.addDestination((Destination) serialDestination0);
      boolean boolean0 = defaultMessageBus0.registerMessageListener("", (MessageListener) invokerMessageListener0);
      assertEquals(1, defaultMessageBus0.getDestinationCount());
      assertEquals(false, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      Destination destination0 = defaultMessageBus0.removeDestination((String) null);
      assertNull(destination0);
  }

  @Test
  public void test16()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      ParallelDestination parallelDestination0 = new ParallelDestination();
      defaultMessageBus0.addDestination((Destination) parallelDestination0);
      assertEquals(1, defaultMessageBus0.getDestinationCount());
      
      defaultMessageBus0.removeDestination("");
      assertEquals(0, defaultMessageBus0.getDestinationCount());
  }

  @Test
  public void test17()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      GlobalDestinationEventListener globalDestinationEventListener0 = new GlobalDestinationEventListener();
      defaultMessageBus0.removeDestinationEventListener("XbtszY%C#?D>hu", (DestinationEventListener) globalDestinationEventListener0);
      assertEquals(0, defaultMessageBus0.getDestinationCount());
  }

  @Test
  public void test18()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      GlobalDestinationEventListener globalDestinationEventListener0 = new GlobalDestinationEventListener();
      SerialDestination serialDestination0 = new SerialDestination();
      defaultMessageBus0.addDestination((Destination) serialDestination0);
      defaultMessageBus0.removeDestinationEventListener("", (DestinationEventListener) globalDestinationEventListener0);
      assertEquals(1, defaultMessageBus0.getDestinationCount());
  }

  @Test
  public void test19()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      SerialDestination serialDestination0 = new SerialDestination();
      defaultMessageBus0.addDestination((Destination) serialDestination0);
      Message message0 = new Message();
      defaultMessageBus0.sendMessage("", message0);
      assertEquals(1, defaultMessageBus0.getDestinationCount());
      assertEquals("{destinationName=, response=null, responseDestinationName=null, responseId=null, payload=null, values=null}", message0.toString());
  }

  @Test
  public void test20()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      defaultMessageBus0.sendMessage("XbtszY%C#?D>hu", (Message) null);
      assertEquals(0, defaultMessageBus0.getDestinationCount());
  }

  @Test
  public void test21()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      SerialDestination serialDestination0 = new SerialDestination();
      defaultMessageBus0.addDestination((Destination) serialDestination0);
      // Undeclared exception!
      try {
        defaultMessageBus0.shutdown();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      SerialDestination serialDestination0 = new SerialDestination();
      defaultMessageBus0.addDestination((Destination) serialDestination0);
      DefaultSingleDestinationMessageSender defaultSingleDestinationMessageSender0 = new DefaultSingleDestinationMessageSender();
      BridgingMessageListener bridgingMessageListener0 = new BridgingMessageListener((SingleDestinationMessageSender) defaultSingleDestinationMessageSender0);
      defaultMessageBus0.unregisterMessageListener("", (MessageListener) bridgingMessageListener0);
      assertEquals(1, defaultMessageBus0.getDestinationCount());
  }

  @Test
  public void test23()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      BridgingMessageListener bridgingMessageListener0 = new BridgingMessageListener();
      boolean boolean0 = defaultMessageBus0.unregisterMessageListener("+Ri}YE", (MessageListener) bridgingMessageListener0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      SerialDestination serialDestination0 = new SerialDestination();
      defaultMessageBus0.addDestination((Destination) serialDestination0);
      DefaultSingleDestinationMessageSender defaultSingleDestinationMessageSender0 = new DefaultSingleDestinationMessageSender();
      BridgingMessageListener bridgingMessageListener0 = new BridgingMessageListener((SingleDestinationMessageSender) defaultSingleDestinationMessageSender0);
      defaultMessageBus0.registerMessageListener("", (MessageListener) bridgingMessageListener0);
      assertEquals(1, defaultMessageBus0.getDestinationCount());
      
      boolean boolean0 = defaultMessageBus0.unregisterMessageListener("", (MessageListener) bridgingMessageListener0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      BridgingMessageListener bridgingMessageListener0 = new BridgingMessageListener();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      InvokerMessageListener invokerMessageListener0 = new InvokerMessageListener((MessageListener) bridgingMessageListener0, classLoader0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      GlobalDestinationEventListener globalDestinationEventListener0 = new GlobalDestinationEventListener((MessageListener) invokerMessageListener0, (List<String>) linkedList0);
      defaultMessageBus0.addDestinationEventListener((DestinationEventListener) globalDestinationEventListener0);
      SerialDestination serialDestination0 = new SerialDestination();
      defaultMessageBus0.addDestination((Destination) serialDestination0);
      defaultMessageBus0.fireDestinationRemovedEvent((Destination) serialDestination0);
      boolean boolean0 = defaultMessageBus0.registerMessageListener("", (MessageListener) invokerMessageListener0);
      assertEquals(1, defaultMessageBus0.getDestinationCount());
      assertEquals(true, boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      DefaultMessageBus defaultMessageBus0 = new DefaultMessageBus();
      GlobalDestinationEventListener globalDestinationEventListener0 = new GlobalDestinationEventListener();
      defaultMessageBus0.addDestinationEventListener((DestinationEventListener) globalDestinationEventListener0);
      ParallelDestination parallelDestination0 = new ParallelDestination();
      BridgingMessageListener bridgingMessageListener0 = new BridgingMessageListener();
      defaultMessageBus0.fireMessageListenerUnregisteredEvent((Destination) parallelDestination0, (MessageListener) bridgingMessageListener0);
      assertEquals(2, parallelDestination0.getWorkersCoreSize());
  }
}
