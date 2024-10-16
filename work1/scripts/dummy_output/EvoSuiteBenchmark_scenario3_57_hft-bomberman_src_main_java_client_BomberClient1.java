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
	* Test case for {@link BomberClient#connectToSrv()} method.
	* It tests the case when the connection attempt was not successful.
	*/
	@Test
	void testConnectToSrv_1() {
		BomberClient bomberClient = new BomberClient();
		boolean result = bomberClient.connectToSrv();
		assertFalse(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* It tests the case when the connection attempt was not successful.
	*/
	@Test
	void testConnectToSrv_2() {
		BomberClient bomberClient = new BomberClient();
		boolean result = bomberClient.connectToSrv();
		assertFalse(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* It tests the case when the connection attempt was not successful.
	*/
	@Test
	void testConnectToSrv_3() {
		BomberClient bomberClient = new BomberClient();
		boolean result = bomberClient.connectToSrv();
		assertFalse(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* It tests the case when the connection attempt was not successful.
	*/
	@Test
	void testConnectToSrv_4() {
		BomberClient bomberClient = new BomberClient();
		boolean result = bomberClient.connectToSrv();
		assertFalse(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* It tests the case when the connection attempt was not successful.
	*/
	@Test
	void testConnectToSrv_5() {
		BomberClient bomberClient = new BomberClient();
		boolean result = bomberClient.connectToSrv();
		assertFalse(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* It tests the case when the connection attempt was not successful.
	*/
	@Test
	void testConnectToSrv_6() {
		BomberClient bomberClient = new BomberClient();
		boolean result = bomberClient.connectToSrv();
		assertFalse(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* It tests the case when the connection attempt was not successful.
	*/
	@Test
	void testConnectToSrv_7() {
		BomberClient bomberClient = new BomberClient();
		boolean result = bomberClient.connectToSrv();
		assertFalse(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* It tests the case when the connection attempt was not successful.
	*/
	@Test
	void testConnectToSrv_8() {
		BomberClient bomberClient = new BomberClient();
		boolean result = bomberClient.connectToSrv();
		assertFalse(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* It tests the case when the connection attempt was not successful.
	*/
	@Test
	void testConnectToSrv_9() {
		BomberClient bomberClient = new BomberClient();
		boolean result = bomberClient.connectToSrv();
		assertFalse(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* It tests the case when the connection attempt was not successful.
	*/
	@Test
	void testConnectToSrv_10() {
		BomberClient bomberClient = new BomberClient();
		boolean result = bomberClient.connectToSrv();
		assertFalse(result);
	}
}