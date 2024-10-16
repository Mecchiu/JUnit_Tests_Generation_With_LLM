/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.mfw.bundle.server.plugins.rest.resources;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.mfw.bundle.server.plugins.rest.resources.SubscriptionRequest;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SubscriptionRequestEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SubscriptionRequest subscriptionRequest0 = new SubscriptionRequest();
      subscriptionRequest0.setInterval(172L);
      assertEquals(172L, subscriptionRequest0.getInterval());
  }

  @Test
  public void test1()  throws Throwable  {
      SubscriptionRequest subscriptionRequest0 = new SubscriptionRequest();
      long long0 = subscriptionRequest0.getInterval();
      assertEquals(0L, long0);
  }
}
