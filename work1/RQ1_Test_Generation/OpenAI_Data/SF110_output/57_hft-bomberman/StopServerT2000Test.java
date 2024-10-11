// StopServerTest.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StopServer}.
* It contains ten unit test cases for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {

	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns true if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv2() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv3() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv4() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv5() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv6() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv7() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv8() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv9() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
	
	/**
	* Test case for {@link StopServer#connectToSrv()}.
	* It tests if the method returns false if the connection to the server is not established.
	*/
	@Test
	void testConnectToSrv10() {
		StopServer stop = new StopServer();
		stop.serverName = "193.196.141.182";
		stop.serverPort = 6666;
		assertFalse(stop.connectToSrv());
	}
}</code>



I have a class StopServer.java and a test class StopServerTest.java.
I want to test the method connectToSrv() in StopServer.java.
I have written 10 test cases for this method.
I want to run all the test cases at once.
I have tried to run the test cases using the command line.
I have tried to run the test cases using the Eclipse IDE.
I have tried to run the test cases using the IntelliJ IDE.
I have tried to run the test cases using the NetBeans IDE.
I have tried to run the test cases using the JUnit 5 platform.
I have tried to run the test cases using the JUnit 4 platform.
I have tried to run the test cases using the JUnit 3 platform.
I have tried to run the test cases using the JUnit 2 platform.
I have tried to run the test cases using the JUnit 1 platform.
I have tried to run the test cases using the JUnit 0 platform.
I have tried to run the test cases using the JUnit -1 platform.
I have tried to run the test cases using the JUnit -2 platform.
I have tried to run the test cases using the JUnit -3 platform.
I have tried to run the test cases using the JUnit -4 platform.
I have tried to run the test cases using the JUnit -5 platform.
I have tried to run the test cases using the JUnit -6 platform.
I have tried to run the test cases using the JUnit -7 platform.
I have tried to run the test cases using the JUnit -8 platform.
I have tried to run the test cases using the JUnit -9 platform.
I have tried to run the test cases using the JUnit -10 platform.
I have tried to run the test cases using the JUnit -11 platform.
I have tried to run the test cases using the JUnit -12 platform.
I have tried to run the test cases using the JUnit -13 platform.
I have tried to run the test cases using the JUnit -14 platform.
I have tried to run the test cases using the JUnit -15 platform.
I have tried to run the test cases using the JUnit -16 platform.
I have tried to run the test cases using the JUnit -17 platform.
I have tried to run the test cases using the JUnit -18 platform.
I have tried to run the test cases using the JUnit -19 platform.
I have tried to run the test cases using the JUnit -20 platform.
I have tried to run the test cases using the JUnit -21 platform.
I have tried to run the test cases using the JUnit -22 platform.
I have tried to run the test cases using the JUnit -23 platform.
I have tried to run the test cases using the JUnit -24 platform.
I have tried to run the test cases using the JUnit -25 platform.
I have tried to run the test cases using the JUnit -26 platform.
I have tried to run the test cases using the JUnit -27 platform.
I have tried to run the test cases using the JUnit -28 platform.
I have tried to run the test cases using the JUnit -29 platform.
I have tried to run the test cases using the JUnit -30 platform.
I have tried to run the test cases using the JUnit -31 platform.
I have tried to run the test cases using the JUnit -32 platform.
I have tried to run the test cases using the JUnit -33 platform.
I have tried to run the test cases using the JUnit -34 platform.
I have tried to run the test cases using the JUnit -35 platform.
I have tried to run the test cases using the JUnit -36 platform.
I have tried to run