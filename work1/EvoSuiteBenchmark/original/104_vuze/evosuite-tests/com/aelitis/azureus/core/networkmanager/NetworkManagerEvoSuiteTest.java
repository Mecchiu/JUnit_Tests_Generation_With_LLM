/*
 * This file was automatically generated by EvoSuite
 */

package com.aelitis.azureus.core.networkmanager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.aelitis.azureus.core.AzureusCore;
import com.aelitis.azureus.core.networkmanager.ConnectionEndpoint;
import com.aelitis.azureus.core.networkmanager.EventWaiter;
import com.aelitis.azureus.core.networkmanager.LimitedRateGroup;
import com.aelitis.azureus.core.networkmanager.NetworkConnectionBase;
import com.aelitis.azureus.core.networkmanager.NetworkManager;
import com.aelitis.azureus.core.networkmanager.NetworkManagerStats;
import com.aelitis.azureus.core.networkmanager.RateHandler;
import com.aelitis.azureus.core.networkmanager.Transport;
import com.aelitis.azureus.core.networkmanager.impl.MultiPeerDownloader2;
import com.aelitis.azureus.core.networkmanager.impl.MultiPeerUploader;
import com.aelitis.azureus.core.networkmanager.impl.NetworkConnectionImpl;
import com.aelitis.azureus.core.networkmanager.impl.RateControlledEntity;
import com.aelitis.azureus.core.networkmanager.impl.SinglePeerUploader;
import com.aelitis.azureus.core.networkmanager.impl.TransferProcessor;
import com.aelitis.azureus.core.peermanager.messaging.MessageStreamDecoder;
import com.aelitis.azureus.core.peermanager.messaging.MessageStreamEncoder;
import com.aelitis.azureus.core.peermanager.messaging.MessageStreamFactory;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder;
import com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageEncoder;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageDecoder;
import com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageEncoder;
import java.net.InetSocketAddress;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NetworkManagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      RateHandler rateHandler0 = networkManager0.getRateHandler(true, true);
      assertNotNull(rateHandler0);
      
      MultiPeerUploader multiPeerUploader0 = new MultiPeerUploader(rateHandler0);
      EventWaiter eventWaiter0 = new EventWaiter();
      multiPeerUploader0.doProcessing(eventWaiter0, 254);
      assertEquals(1460, networkManager0.getMinMssSize());
      assertEquals(false, networkManager0.isSeedingOnlyUploadRate());
  }

  @Test
  public void test1()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      RateHandler rateHandler0 = networkManager0.getRateHandler((NetworkConnectionBase) null, true);
      SinglePeerUploader singlePeerUploader0 = new SinglePeerUploader((NetworkConnectionBase) null, rateHandler0);
      // Undeclared exception!
      try {
        singlePeerUploader0.getString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = NetworkManager.isLANRateEnabled();
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      InetSocketAddress inetSocketAddress0 = new InetSocketAddress("", 0);
      ConnectionEndpoint connectionEndpoint0 = new ConnectionEndpoint(inetSocketAddress0);
      BTMessageEncoder bTMessageEncoder0 = new BTMessageEncoder();
      BTMessageDecoder bTMessageDecoder0 = new BTMessageDecoder();
      byte[][] byteArray0 = new byte[8][9];
      NetworkConnectionImpl networkConnectionImpl0 = (NetworkConnectionImpl)networkManager0.createConnection(connectionEndpoint0, (MessageStreamEncoder) bTMessageEncoder0, (MessageStreamDecoder) bTMessageDecoder0, true, true, byteArray0);
      assertNotNull(networkConnectionImpl0);
      
      networkManager0.startTransferProcessing((NetworkConnectionBase) networkConnectionImpl0);
      assertEquals(1460, networkConnectionImpl0.getMssSize());
      assertEquals(1460, networkManager0.getMinMssSize());
  }

  @Test
  public void test4()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      NetworkManagerStats networkManagerStats0 = networkManager0.getStats();
      assertNotNull(networkManagerStats0);
  }

  @Test
  public void test5()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      // Undeclared exception!
      try {
        networkManager0.requestIncomingConnectionRouting((NetworkManager.ByteMatcher) null, (NetworkManager.RoutingListener) null, (MessageStreamFactory) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      // Undeclared exception!
      try {
        networkManager0.cancelIncomingConnectionRouting((NetworkManager.ByteMatcher) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      BTMessageEncoder bTMessageEncoder0 = new BTMessageEncoder();
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      // Undeclared exception!
      try {
        networkManager0.bindTransport((Transport) null, (MessageStreamEncoder) bTMessageEncoder0, (MessageStreamDecoder) aZMessageDecoder0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      // Undeclared exception!
      try {
        networkManager0.initialize((AzureusCore) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      TransferProcessor transferProcessor0 = networkManager0.getUploadProcessor();
      assertNotNull(transferProcessor0);
  }

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = NetworkManager.isSeedingOnlyUploadRate();
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = NetworkManager.getMaxUploadRateBPSNormal();
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = NetworkManager.getMaxUploadRateBPSSeedingOnly();
      assertEquals(0, int0);
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = NetworkManager.getMaxDownloadRateBPS();
      assertEquals(0, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      boolean boolean0 = NetworkManager.getCryptoRequired(1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      boolean boolean0 = NetworkManager.getCryptoRequired(0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      boolean boolean0 = NetworkManager.getCryptoRequired(66);
      assertEquals(false, boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      MultiPeerUploader multiPeerUploader0 = new MultiPeerUploader((RateHandler) null);
      networkManager0.addWriteEntity((RateControlledEntity) multiPeerUploader0, 1);
      assertEquals(false, multiPeerUploader0.getPriorityBoost());
  }

  @Test
  public void test18()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      MultiPeerDownloader2 multiPeerDownloader2_0 = new MultiPeerDownloader2((RateHandler) null);
      networkManager0.removeWriteEntity((RateControlledEntity) multiPeerDownloader2_0);
      assertEquals("MPD (0/0/0: ", multiPeerDownloader2_0.getString());
  }

  @Test
  public void test19()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      MultiPeerDownloader2 multiPeerDownloader2_0 = new MultiPeerDownloader2((RateHandler) null);
      networkManager0.addReadEntity((RateControlledEntity) multiPeerDownloader2_0, 0);
      assertEquals(0, networkManager0.getMaxDownloadRateBPS());
  }

  @Test
  public void test20()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      MultiPeerUploader multiPeerUploader0 = new MultiPeerUploader((RateHandler) null);
      networkManager0.removeReadEntity((RateControlledEntity) multiPeerUploader0);
      assertEquals(1, multiPeerUploader0.getPriority());
  }

  @Test
  public void test21()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      networkManager0.stopTransferProcessing((NetworkConnectionBase) null);
      assertEquals(false, networkManager0.OUTGOING_HANDSHAKE_FALLBACK_ALLOWED);
  }

  @Test
  public void test22()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      AZMessageEncoder aZMessageEncoder0 = new AZMessageEncoder(0);
      AZMessageDecoder aZMessageDecoder0 = new AZMessageDecoder();
      byte[][] byteArray0 = new byte[8][7];
      NetworkConnectionImpl networkConnectionImpl0 = (NetworkConnectionImpl)networkManager0.createConnection((ConnectionEndpoint) null, (MessageStreamEncoder) aZMessageEncoder0, (MessageStreamDecoder) aZMessageDecoder0, true, true, byteArray0);
      networkManager0.upgradeTransferProcessing((NetworkConnectionBase) networkConnectionImpl0, (int) (byte) (-101));
      assertEquals(false, networkConnectionImpl0.isConnected());
  }

  @Test
  public void test23()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      networkManager0.downgradeTransferProcessing((NetworkConnectionBase) null);
      assertEquals(0, networkManager0.getMaxUploadRateBPSSeedingOnly());
  }

  @Test
  public void test24()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      networkManager0.addRateLimiter((NetworkConnectionBase) null, (LimitedRateGroup) null, true);
      assertEquals(0, networkManager0.getMaxDownloadRateBPS());
  }

  @Test
  public void test25()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      networkManager0.removeRateLimiter((NetworkConnectionBase) null, (LimitedRateGroup) null, true);
      assertEquals(1460, networkManager0.getMinMssSize());
  }

  @Test
  public void test26()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      RateHandler rateHandler0 = networkManager0.getRateHandler(false, true);
      assertEquals(0, rateHandler0.getCurrentNumBytesAllowed());
  }

  @Test
  public void test27()  throws Throwable  {
      NetworkManager networkManager0 = NetworkManager.getSingleton();
      RateHandler rateHandler0 = networkManager0.getRateHandler(true, false);
      assertEquals(0, rateHandler0.getCurrentNumBytesAllowed());
  }
}
