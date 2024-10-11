// NonBlockingClientHandler_1Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterRead()} method.
*/
class NonBlockingClientHandler_1Test {
/**
* Prints in-formated output:
*/
final Logging logging = Logger.getLogger("org.quickserver.net.server.impl.NonBlockingClientHandler_1Test");

	// NonBlackingClientHandler.java
	public NonBlockingClientHandler_1Test() {
		System.out.println("NonBlockingClientHandler_1Test");
	}

//
// public void testNonBlockingClientHandler_1() {}
//
//
public Object checkSelectorAfterRegisterRead(ClientSessionChannel clientChannel,
    ClientSession clientSession, int expectedWakeupId) throws IOException, java.io.UnsupportedEncodingException {
    return checkSelectorAfterRegisterRead(clientChannel, clientSession, true);

}
public Object checkSelectorAfterRegisterRead(ClientSessionChannel clientChannel,
    ClientSession clientSession, boolean expectedWakeupId) throws IOException, java.io.UnsupportedEncodingException {
  byte[] buf;
  ClientChannelInfo clientChannelInfo = clientChannel.getInfo();
  int selectorsSize = (buf = clientChannelInfo.getSelectorsSizeData())[0];
  //System.out.println("selectorsSize ="+selectorsSize);
  
int wakeupId = clientSession.getSelector().getAfterRegisterReadSelector().getNextAfterRegisterReadSelector().getNextSelector()+1;

logging.finest("selectorsSize = "+(selectorsSize));

//System.out.println("selectorsSize = "+selectorsSize+" ");
  if(selectorsSize > 0)  {
        selectorsSize--;
    }

logging.finest("selectorsSize = "+selectorsSize+" ");
    
  if(selectorsSize == 0) {
    if(expectedWakeupId) {
      logging.fine("expectedWakeupId = true");
    }
    logging.fine("selectorsSize = 0 ");
    int selectorNo = getSelectorNo(clientSession.getSelector());
    int wakeupIdNo = getWakeupId(clientSession, clientChannel, selectorNo);
    if(wakeupIdNo > 0) {
      return wakeupIdNo;
    } else {
      return wakeupId; // default value
    }
  } else {
    return 0; // else default value
  }
}

// NonBlockingClientHandler_2.java

public class NonBlockingClientHandler_2Test {
		/**
* Prints in-formated output:
*/
 final Logging logging = Logger.getLogger("org.quickserver.net.server.impl.NonBlockingClientHandler_2Test");
			
	// NonBlindingClientHandler.java
	public NonBlockingClientHandler_2Test() {
		System.out.println("NonBlockingClientHandler_2Test");
	}

//
// public void testSelectorAfterRegisterReadWakingup() throws IOException {
    logging.fine("Testing NonBlockingClientHandler_2.selectorsWakeup()");
   ClientSession clientSession = ServerImpl.testAllocateClientSession(getSocket());
    logging.fine("clientSession.getInfo().getSelectorsSizeData() = "+clientSession.getInfo().getSelectorsSizeData());
    logging.finest("connecting to server");
    try {

      NonBlockingClientHandler nbh = new NonBlockingClientHandler(InetAddress.getByName("0.0.0.0"));
      assertNotNull(nbh);

      // connect to server
      ServerSessionChannel serverSessionChannel = nbh.connect(clientSession, getSocket());
      assertNotNull(serverSessionChannel);

      final ClientSession clientSession2 = ServerImpl.testAllocateClientSession(getSocket());
      logging.fine("clientSession2.getInfo().getSelectorsSizeData() = "+clientSession2.getInfo().getSelectorsSizeData());
      logging.finest("connecting to server");
      final NonBlockingClientHandler nbh2 = new NonBlockingClientHandler(InetAddress.getByName("0.0.0.0"));
      assertNotNull(nbh2);

      // connect to server
      serverSessionChannel.send(nbh2);

      logging.fine("selectorsWakeup = true");
      ServerMessage message = serverSessionChannel.receive(5).castTo(ServerMessage.class);
      logging.finest("selectorsWakeup = "+message);

      // receive all message
      int numMessage = message.getSelectorsNumber();
      for(int i = 0; i < numMessage; ++i) {
        ServerMessage m = ServerImpl.testAllocateServerMessage(getSocket());
        assertNotNull(m);

        m.setSelectorsNumber(i);
        ClientSession clientSession3 = ServerImpl.testAllocateClientSession(getSocket());

        ServerSessionChannel serverSessionChannel3 = nbh2.connect(clientSession3, getSocket());
        assertNotNull(serverSessionChannel3);
        logging.finest("clientSession3.getInfo().getSelectorsSizeData() = "+clientSession3.getInfo().getSelectorsSizeData());

        serverSessionChannel3.send(m);
      }

      // we should receive messages from the server 3 times once
      numMessage = message.getSelectorsNumber();
      for(int i = 0; i < numMessage; ++i) {
        ServerMessage m = ServerImpl.testAllocateServerMessage(getSocket());
        assertNotNull(m);

        ServerMessage message2 = ServerImpl.testAllocateServerMessage(getSocket());
        assertNotNull(message2);

        m.setSelectorsNumber(i);
        ServerSession channelServerSession = ServerImpl.testAllocateServerSession(getSocket());

        ServerSessionChannel channelServerSessionChannel = ServerImpl.testAllocateServerSession(getSocket());
        assertNotNull(channelServerSessionChannel);

        for(int s=0; s <2 ; s++) {
          ClientChannel clientChannel = channelServerSessionChannel.getInfo().getSelectorsByChannel(s).getNext();
          clientChannel.send(nbh2);

          ServerMessage messageServer = message.castTo(ServerMessage.class);
          ServerMessage message2Server = message2.castTo(ServerMessage.class);

          logging.println("server.send: "+ServerImpl.printMessage(m));

          logging.println("server.send(message)");

          logging.println("server.send(message2)");

          assertSame(ServerImpl.printMessage(message2Server), ServerImpl.printMessage(m));

          logging.println("server.send(messageServer)");
          logging.println("server.send(message2Server)");
          assertSame(ServerImpl.printMessage(messageServer), ServerImpl.printMessage(m));

          ServerSessionChannel clientSessionChannelServer = ServerImpl.testAllocateClientSession(getSocket());
          logging.finest