// BomberClient_0Test.java
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
* It contains ten unit test cases for the {@link BomberClient#getInstance()} method.
*/
class BomberClient_0Test {

	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance_0() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance_1() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance_2() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance_3() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance_4() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance_5() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance_6() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance_7() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance_8() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()}
	*
	* @throws IOException
	*/
	@Test
	void testGetInstance_9() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
}

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
	* Test case for {@link BomberClient#connectToSrv()}
	*
	* @throws IOException
	*/
	@Test
	void testConnectToSrv() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()}
	*
	* @throws IOException
	*/
	@Test
	void testConnectToSrv_0() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()}
	*
	* @throws IOException
	*/
	@Test
	void testConnectToSrv_1() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()}
	*
	* @throws IOException
	*/
	@Test
	void testConnectToSrv_2() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()}
	*
	* @throws IOException
	*/
	@Test
	void testConnectToSrv_3() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()}
	*
	* @throws IOException
	*/
	@Test
	void testConnectToSrv_4() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()}
	*
	* @throws IOException
	*/
	@Test
	void testConnectToSrv_5() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()}
	*
	* @throws IOException
	*/
	@Test
	void testConnectToSrv_6() throws IOException {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertTrue(result);
	}
	
	/**
	* Test case