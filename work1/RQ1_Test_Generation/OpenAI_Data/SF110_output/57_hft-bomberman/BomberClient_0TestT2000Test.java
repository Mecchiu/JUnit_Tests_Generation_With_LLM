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
	* Test case for {@link BomberClient#getInstance()} method.
	* This test case checks if the {@link BomberClient#getInstance()} method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance() {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* This test case checks if the {@link BomberClient#getInstance()} method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance_1() {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* This test case checks if the {@link BomberClient#getInstance()} method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance_2() {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* This test case checks if the {@link BomberClient#getInstance()} method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance_3() {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* This test case checks if the {@link BomberClient#getInstance()} method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance_4() {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* This test case checks if the {@link BomberClient#getInstance()} method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance_5() {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* This test case checks if the {@link BomberClient#getInstance()} method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance_6() {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* This test case checks if the {@link BomberClient#getInstance()} method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance_7() {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* This test case checks if the {@link BomberClient#getInstance()} method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance_8() {
		BomberClient bomberClient = BomberClient.getInstance();
		assertNotNull(bomberClient);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* This test case checks if the {@link BomberClient#getInstance()} method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance_9() {
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
	* Test case for {@link BomberClient#connectToSrv()} method.
	* This test case checks if the {@link BomberClient#connectToSrv()} method returns a {@link boolean} value.
	*/
	@Test
	void testConnectToSrv() {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* This test case checks if the {@link BomberClient#connectToSrv()} method returns a {@link boolean} value.
	*/
	@Test
	void testConnectToSrv_1() {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* This test case checks if the {@link BomberClient#connectToSrv()} method returns a {@link boolean} value.
	*/
	@Test
	void testConnectToSrv_2() {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* This test case checks if the {@link BomberClient#connectToSrv()} method returns a {@link boolean} value.
	*/
	@Test
	void testConnectToSrv_3() {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* This test case checks if the {@link BomberClient#connectToSrv()} method returns a {@link boolean} value.
	*/
	@Test
	void testConnectToSrv_4() {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberClient#connectToSrv()} method.
	* This test case checks if the {@link BomberClient#connectToSrv()} method returns a {@link boolean} value.
	*/
	@Test
	void testConnectToSrv_5() {
		BomberClient bomberClient = BomberClient.getInstance();
		boolean result = bomberClient.connectToSrv();
