// BomberClient_1Test.java
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.JoinSessionMsg;
import messages.global.MapInfo;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import org.apache.log4j.Logger;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import client.network.ClientMsgSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberClient}.
* It contains ten unit test cases for the {@link BomberClient#connectToSrv()} method.
*/
class BomberClient_1Test {

	/**
	* Test case 1 for method {@link BomberClient#connectToSrv()}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testConnectToSrv_1() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		// when
		boolean result = bomberClient.connectToSrv();
		// then
		assertTrue(result);
	}
		
	/**
	* Test case 2 for method {@link BomberClient#connectToSrv()}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testConnectToSrv_2() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		// when
		boolean result = bomberClient.connectToSrv();
		// then
		assertTrue(result);
	}
		
	/**
	* Test case 3 for method {@link BomberClient#connectToSrv()}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testConnectToSrv_3() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		// when
		boolean result = bomberClient.connectToSrv();
		// then
		assertTrue(result);
	}
		
	/**
	* Test case 4 for method {@link BomberClient#connectToSrv()}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testConnectToSrv_4() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		// when
		boolean result = bomberClient.connectToSrv();
		// then
		assertTrue(result);
	}
		
	/**
	* Test case 5 for method {@link BomberClient#connectToSrv()}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testConnectToSrv_5() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		// when
		boolean result = bomberClient.connectToSrv();
		// then
		assertTrue(result);
	}
		
	/**
	* Test case 6 for method {@link BomberClient#connectToSrv()}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testConnectToSrv_6() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		// when
		boolean result = bomberClient.connectToSrv();
		// then
		assertTrue(result);
	}
		
	/**
	* Test case 7 for method {@link BomberClient#connectToSrv()}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testConnectToSrv_7() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		// when
		boolean result = bomberClient.connectToSrv();
		// then
		assertTrue(result);
	}
		
	/**
	* Test case 8 for method {@link BomberClient#connectToSrv()}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testConnectToSrv_8() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		// when
		boolean result = bomberClient.connectToSrv();
		// then
		assertTrue(result);
	}
		
	/**
	* Test case 9 for method {@link BomberClient#connectToSrv()}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testConnectToSrv_9() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		// when
		boolean result = bomberClient.connectToSrv();
		// then
		assertTrue(result);
	}
		
	/**
	* Test case 10 for method {@link BomberClient#connectToSrv()}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testConnectToSrv_10() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		// when
		boolean result = bomberClient.connectToSrv();
		// then
		assertTrue(result);
	}
}

// BomberClient_2Test.java
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.JoinSessionMsg;
import messages.global.MapInfo;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import org.apache.log4j.Logger;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import client.network.ClientMsgSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberClient}.
* It contains ten unit test cases for the {@link BomberClient#sendMsg(Message)} method.
*/
class BomberClient_2Test {
		
	/**
	* Test case 1 for method {@link BomberClient#sendMsg(Message)}.
	*
	* @throws IOException
	* @throws RuntimeException
	*/
	@Test
	void testSendMsg_1() throws IOException, RuntimeException {
		// given
		BomberClient bomberClient = new BomberClient("playerName");
		bomberClient.serverName = "localhost";
		bomberClient.serverPort = 6666;
		bomberClient.connectToSrv();
		Message msg = new InfoRequestMsg();