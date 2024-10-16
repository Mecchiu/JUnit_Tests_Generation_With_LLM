/*
 * This file was automatically generated by EvoSuite
 */

package client.network;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.BomberClient;
import client.network.ClientMsgReceiver;
import java.net.Proxy;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;
import messages.session.SessionParticipationMsg;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ClientMsgReceiverEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        BomberClient.getInstance();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class client.BomberClient
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      Socket socket0 = new Socket(proxy0);
      // Undeclared exception!
      try {
        BomberClient.getInstance();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class client.BomberClient
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        BomberClient.getInstance();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class client.BomberClient
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      Socket socket0 = new Socket(proxy0);
      // Undeclared exception!
      try {
        BomberClient.getInstance();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class client.BomberClient
         */
      }
  }
}
