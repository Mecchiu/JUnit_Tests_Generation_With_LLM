/*
 * This file was automatically generated by EvoSuite
 */

package de.huxhorn.lilith.engine.impl.eventproducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.huxhorn.lilith.data.eventsource.EventWrapper;
import de.huxhorn.lilith.data.eventsource.SourceIdentifier;
import de.huxhorn.lilith.engine.impl.eventproducer.SerializingMessageBasedEventProducer;
import de.huxhorn.sulky.buffers.AppendOperation;
import de.huxhorn.sulky.buffers.BlockingCircularBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Serializable;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbstractMessageBasedEventProducerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SourceIdentifier sourceIdentifier0 = new SourceIdentifier();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1739);
      SerializingMessageBasedEventProducer<Serializable> serializingMessageBasedEventProducer0 = new SerializingMessageBasedEventProducer<Serializable>(sourceIdentifier0, (AppendOperation<EventWrapper<Serializable>>) null, (InputStream) pipedInputStream0, false);
      serializingMessageBasedEventProducer0.start();
  }

  @Test
  public void test1()  throws Throwable  {
      BlockingCircularBuffer<EventWrapper<Serializable>> blockingCircularBuffer0 = new BlockingCircularBuffer<EventWrapper<Serializable>>(1);
      SerializingMessageBasedEventProducer<Serializable> serializingMessageBasedEventProducer0 = new SerializingMessageBasedEventProducer<Serializable>((SourceIdentifier) null, (AppendOperation<EventWrapper<Serializable>>) blockingCircularBuffer0, (InputStream) null, false);
      serializingMessageBasedEventProducer0.getHeartbeatTimestamp();
  }

  @Test
  public void test2()  throws Throwable  {
      BlockingCircularBuffer<EventWrapper<Serializable>> blockingCircularBuffer0 = new BlockingCircularBuffer<EventWrapper<Serializable>>(1);
      SerializingMessageBasedEventProducer<Serializable> serializingMessageBasedEventProducer0 = new SerializingMessageBasedEventProducer<Serializable>((SourceIdentifier) null, (AppendOperation<EventWrapper<Serializable>>) blockingCircularBuffer0, (InputStream) null, false);
      serializingMessageBasedEventProducer0.close();
      assertEquals(false, serializingMessageBasedEventProducer0.isCompressing());
  }
}
