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
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns a {@link BomberClient} object.
	*/
	@Test
	void testGetInstance() {
		BomberClient instance = BomberClient.getInstance();
		assertNotNull(instance);
	}
	
	/**
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same {@link BomberClient} object.
	*/
	@Test
	void testGetInstanceSame() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same {@link BomberClient} object.
	*/
	@Test
	void testGetInstanceSame2() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same {@link BomberClient} object.
	*/
	@Test
	void testGetInstanceSame3() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same {@link BomberClient} object.
	*/
	@Test
	void testGetInstanceSame4() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same {@link BomberClient} object.
	*/
	@Test
	void testGetInstanceSame5() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same {@link BomberClient} object.
	*/
	@Test
	void testGetInstanceSame6() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same {@link BomberClient} object.
	*/
	@Test
	void testGetInstanceSame7() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same {@link BomberClient} object.
	*/
	@Test
	void testGetInstanceSame8() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same {@link BomberClient} object.
	*/
	@Test
	void testGetInstanceSame9() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for the {@link BomberClient#getInstance()} method.
	* It tests if the method returns the same {@link BomberClient} object.
	*/
	@Test
	void testGetInstanceSame10() {
		BomberClient instance1 = BomberClient.getInstance();
		BomberClient instance2 = BomberClient.getInstance();
		assertSame(instance1, instance2);
	}
}