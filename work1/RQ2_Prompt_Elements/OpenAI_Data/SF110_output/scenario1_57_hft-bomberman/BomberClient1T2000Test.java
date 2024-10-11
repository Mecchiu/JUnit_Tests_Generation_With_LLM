// BomberClientTest.java
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
class BomberClientTest {

	/**
	* Test case 1 for {@link BomberClient#connectToSrv()}.
	* It tests the connection to the server.
	*/
	@Test
	void testConnectToSrv1() {
		BomberClient client = new BomberClient();
		assertTrue(client.connectToSrv());
	}
	
	/**
	* Test case 2 for {@link BomberClient#connectToSrv()}.
	* It tests the connection to the server.
	*/
	@Test
	void testConnectToSrv2() {
		BomberClient client = new BomberClient();
		assertTrue(client.connectToSrv());
	}
	
	/**
	* Test case 3 for {@link BomberClient#connectToSrv()}.
	* It tests the connection to the server.
	*/
	@Test
	void testConnectToSrv3() {
		BomberClient client = new BomberClient();
		assertTrue(client.connectToSrv());
	}
	
	/**
	* Test case 4 for {@link BomberClient#connectToSrv()}.
	* It tests the connection to the server.
	*/
	@Test
	void testConnectToSrv4() {
		BomberClient client = new BomberClient();
		assertTrue(client.connectToSrv());
	}
	
	/**
	* Test case 5 for {@link BomberClient#connectToSrv()}.
	* It tests the connection to the server.
	*/
	@Test
	void testConnectToSrv5() {
		BomberClient client = new BomberClient();
		assertTrue(client.connectToSrv());
	}
	
	/**
	* Test case 6 for {@link BomberClient#connectToSrv()}.
	* It tests the connection to the server.
	*/
	@Test
	void testConnectToSrv6() {
		BomberClient client = new BomberClient();
		assertTrue(client.connectToSrv());
	}
	
	/**
	* Test case 7 for {@link BomberClient#connectToSrv()}.
	* It tests the connection to the server.
	*/
	@Test
	void testConnectToSrv7() {
		BomberClient client = new BomberClient();
		assertTrue(client.connectToSrv());
	}
	
	/**
	* Test case 8 for {@link BomberClient#connectToSrv()}.
	* It tests the connection to the server.
	*/
	@Test
	void testConnectToSrv8() {
		BomberClient client = new BomberClient();
		assertTrue(client.connectToSrv());
	}
	
	/**
	* Test case 9 for {@link BomberClient#connectToSrv()}.
	* It tests the connection to the server.
	*/
	@Test
	void testConnectToSrv9() {
		BomberClient client = new BomberClient();
		assertTrue(client.connectToSrv());
	}
	
	/**
	* Test case 10 for {@link BomberClient#connectToSrv()}.
	* It tests the connection to the server.
	*/
	@Test
	void testConnectToSrv10() {
		BomberClient client = new BomberClient();
		assertTrue(client.connectToSrv());
	}
}