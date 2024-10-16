/*
 * This file was automatically generated by EvoSuite
 */

package de.huxhorn.lilith.consumers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.huxhorn.lilith.consumers.UserNotificationLoggingEventConsumer;
import de.huxhorn.lilith.data.eventsource.EventWrapper;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import java.util.LinkedList;
import java.util.List;
import org.simplericity.macify.eawt.Application;

@RunWith(EvoSuiteRunner.class)
public class UserNotificationLoggingEventConsumerEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 de.huxhorn.lilith.consumers.UserNotificationLoggingEventConsumer.consume(Ljava/util/List;)V: I4 Branch 1 IFNULL L40 - true
   * 2 de.huxhorn.lilith.consumers.UserNotificationLoggingEventConsumer.<init>(Lorg/simplericity/macify/eawt/Application;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      UserNotificationLoggingEventConsumer userNotificationLoggingEventConsumer0 = new UserNotificationLoggingEventConsumer((Application) null);
      LinkedList<EventWrapper<LoggingEvent>> linkedList0 = new LinkedList<EventWrapper<LoggingEvent>>();
      userNotificationLoggingEventConsumer0.consume((List<EventWrapper<LoggingEvent>>) linkedList0);
      assertEquals(true, linkedList0.isEmpty());
  }
}
