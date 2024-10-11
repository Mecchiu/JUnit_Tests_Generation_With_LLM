// BomberServerTest.java
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.GlobalServerMsg;
import messages.global.SessionDetailsMsg;
import messages.global.SessionListMsg;
import org.apache.log4j.Logger;
import org.hsqldb.Server;
import org.hsqldb.jdbc.jdbcDataSource;
import common.Constants;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberServer}.
* It contains ten unit test cases for the {@link BomberServer#getInstance()} method.
*/
class BomberServerTest {

	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance() {
		BomberServer server = BomberServer.getInstance();
		assertNotNull(server);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance2() {
		BomberServer server = BomberServer.getInstance();
		BomberServer server2 = BomberServer.getInstance();
		assertEquals(server, server2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance3() {
		BomberServer server = BomberServer.getInstance();
		BomberServer server2 = BomberServer.getInstance();
		assertSame(server, server2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance4() {
		BomberServer server = BomberServer.getInstance();
		BomberServer server2 = BomberServer.getInstance();
		assertTrue(server == server2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance5() {
		BomberServer server = BomberServer.getInstance();
		BomberServer server2 = BomberServer.getInstance();
		assertFalse(server != server2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance6() {
		BomberServer server = BomberServer.getInstance();
		BomberServer server2 = BomberServer.getInstance();
		assertFalse(server.equals(server2));
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance7() {
		BomberServer server = BomberServer.getInstance();
		BomberServer server2 = BomberServer.getInstance();
		assertFalse(server.equals(null));
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance8() {
		BomberServer server = BomberServer.getInstance();
		BomberServer server2 = BomberServer.getInstance();
		assertFalse(server.equals(new Object()));
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance9() {
		BomberServer server = BomberServer.getInstance();
		BomberServer server2 = BomberServer.getInstance();
		assertFalse(server.equals(new BomberServer()));
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance10() {
		BomberServer server = BomberServer.getInstance();
		BomberServer server2 = BomberServer.getInstance();
		assertFalse(server.equals(new BomberServer()));
	}
}