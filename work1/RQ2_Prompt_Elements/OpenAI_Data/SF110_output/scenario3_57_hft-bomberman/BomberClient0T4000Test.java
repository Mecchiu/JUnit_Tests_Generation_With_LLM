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
* It contains ten unit test cases for the {@link BomberClient#getInstance()} method.
*/
class BomberClientTest {

	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance2() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance3() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance4() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance5() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance6() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance7() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance8() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance9() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance10() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertEquals(instance1, instance2);
	}
}

// ClientMsgReceiver.java
package client.network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Observable;
import messages.Message;
import org.apache.log4j.Logger;

/**
 * This class is responsible for receiving messages from the server.
 *
 * @author andi
 */
public class ClientMsgReceiver extends Observable implements Runnable {

    /**
     * The logger.
     */
    private static final Logger logger = Logger.getLogger(ClientMsgReceiver.class);
}

// ClientMsgReceiverTest.java
package client.network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Observable;
import messages.Message;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientMsgReceiver}.
* It contains ten unit test cases for the {@link ClientMsgReceiver#run()} method.
*/
class ClientMsgReceiverTest {
		
	/**
	* Test case for {@link ClientMsgReceiver#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun() {
		ClientMsgReceiver instance1 = ClientMsgReceiver.getInstance();
		ClientMsgReceiver instance2 = ClientMsgReceiver.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgReceiver#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun2() {
		ClientMsgReceiver instance1 = ClientMsgReceiver.getInstance();
		ClientMsgReceiver instance2 = ClientMsgReceiver.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgReceiver#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun3() {
		ClientMsgReceiver instance1 = ClientMsgReceiver.getInstance();
		ClientMsgReceiver instance2 = ClientMsgReceiver.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgReceiver#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun4() {
		ClientMsgReceiver instance1 = ClientMsgReceiver.getInstance();
		ClientMsgReceiver instance2 = ClientMsgReceiver.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgReceiver#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun5() {
		ClientMsgReceiver instance1 = ClientMsgReceiver.getInstance();
		ClientMsgReceiver instance2 = ClientMsgReceiver.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgReceiver#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun6() {
		ClientMsgReceiver instance1 = ClientMsgReceiver.getInstance();
		ClientMsgReceiver instance2 = ClientMsgReceiver.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgReceiver#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun7() {
		ClientMsgReceiver instance1 = ClientMsgReceiver.getInstance();
		ClientMsgReceiver instance2 = ClientMsgReceiver.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgReceiver#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun8() {
		ClientMsgReceiver instance1 = ClientMsgReceiver.getInstance();
		ClientMsgReceiver instance2 = ClientMsgReceiver.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgReceiver#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun9() {
		ClientMsgReceiver instance1 = ClientMsgReceiver.getInstance();
		ClientMsgReceiver instance2 = ClientMsgReceiver.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgReceiver#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun10() {
		ClientMsgReceiver instance1 = ClientMsgReceiver.getInstance();
		ClientMsgReceiver instance2 = ClientMsgReceiver.getInstance();
		assertEquals(instance1, instance2);
	}
}

// ClientMsgSender.java
package client.network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Observable;
import messages.Message;
import org.apache.log4j.Logger;

/**
 * This class is responsible for sending messages to the server.
 *
 * @author andi
 */
public class ClientMsgSender extends Observable implements Runnable {

    /**
     * The logger.
     */
    private static final Logger logger = Logger.getLogger(ClientMsgSender.class);
}

// ClientMsgSenderTest.java
package client.network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Observable;
import messages.Message;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientMsgSender}.
* It contains ten unit test cases for the {@link ClientMsgSender#run()} method.
*/
class ClientMsgSenderTest {
		
	/**
	* Test case for {@link ClientMsgSender#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun() {
		ClientMsgSender instance1 = ClientMsgSender.getInstance();
		ClientMsgSender instance2 = ClientMsgSender.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgSender#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun2() {
		ClientMsgSender instance1 = ClientMsgSender.getInstance();
		ClientMsgSender instance2 = ClientMsgSender.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgSender#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun3() {
		ClientMsgSender instance1 = ClientMsgSender.getInstance();
		ClientMsgSender instance2 = ClientMsgSender.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgSender#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun4() {
		ClientMsgSender instance1 = ClientMsgSender.getInstance();
		ClientMsgSender instance2 = ClientMsgSender.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgSender#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun5() {
		ClientMsgSender instance1 = ClientMsgSender.getInstance();
		ClientMsgSender instance2 = ClientMsgSender.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgSender#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun6() {
		ClientMsgSender instance1 = ClientMsgSender.getInstance();
		ClientMsgSender instance2 = ClientMsgSender.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgSender#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun7() {
		ClientMsgSender instance1 = ClientMsgSender.getInstance();
		ClientMsgSender instance2 = ClientMsgSender.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgSender#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun8() {
		ClientMsgSender instance1 = ClientMsgSender.getInstance();
		ClientMsgSender instance2 = ClientMsgSender.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgSender#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun9() {
		ClientMsgSender instance1 = ClientMsgSender.getInstance();
		ClientMsgSender instance2 = ClientMsgSender.getInstance();
		assertEquals(instance1, instance2);
	}
	
	/**
	* Test case for {@link ClientMsgSender#run()} method.
	* It tests if the method returns the same instance of the class.
	*/
	@Test
	void testRun10() {
		ClientMsgSender instance1 = ClientMsgSender.getInstance();
		ClientMsgSender instance2 = ClientMsgSender.getInstance();
		assertEquals(instance1, instance2);
	}
}

// ClientSession.java
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

/**
 * This class is responsible for the communication with the server during a
 * running session.
 *
 * @author andi
 */
