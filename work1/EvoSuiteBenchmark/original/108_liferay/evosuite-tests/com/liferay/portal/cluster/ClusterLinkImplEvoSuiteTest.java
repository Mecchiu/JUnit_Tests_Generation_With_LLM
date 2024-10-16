/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.cluster;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.cluster.ClusterLinkImpl;
import com.liferay.portal.kernel.cluster.Priority;
import com.liferay.portal.kernel.cluster.messaging.ClusterForwardMessageListener;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ClusterLinkImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ClusterLinkImpl clusterLinkImpl0 = new ClusterLinkImpl();
      ClusterForwardMessageListener clusterForwardMessageListener0 = new ClusterForwardMessageListener();
      clusterLinkImpl0.setClusterForwardMessageListener(clusterForwardMessageListener0);
  }

  @Test
  public void test1()  throws Throwable  {
      ClusterLinkImpl clusterLinkImpl0 = new ClusterLinkImpl();
      Priority priority0 = Priority.LEVEL3;
      // Undeclared exception!
      try {
        clusterLinkImpl0.getChannel(priority0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
