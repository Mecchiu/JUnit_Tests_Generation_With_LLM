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
	* Test case for {@link BomberServer#getInstance()} method.
	* It checks if the method returns a new instance of the {@link BomberServer} class.
	*/
	@Test
	void testGetInstance() {
		BomberServer instance = BomberServer.getInstance();
		assertNotNull(instance);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It checks if the method returns the same instance of the {@link BomberServer} class.
	*/
	@Test
	void testGetInstance2() {
		BomberServer instance = BomberServer.getInstance();
		BomberServer instance2 = BomberServer.getInstance();
		assertEquals(instance, instance2);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It checks if the method returns the same instance of the {@link BomberServer} class.
	*/
	@Test
	void testGetInstance3() {
		BomberServer instance = BomberServer.getInstance();
		BomberServer instance2 = BomberServer.getInstance();
		assertSame(instance, instance2);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It checks if the method returns the same instance of the {@link BomberServer} class.
	*/
	@Test
	void testGetInstance4() {
		BomberServer instance = BomberServer.getInstance();
		BomberServer instance2 = BomberServer.getInstance();
		assertTrue(instance == instance2);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It checks if the method returns the same instance of the {@link BomberServer} class.
	*/
	@Test
	void testGetInstance5() {
		BomberServer instance = BomberServer.getInstance();
		BomberServer instance2 = BomberServer.getInstance();
		assertFalse(instance != instance2);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It checks if the method returns the same instance of the {@link BomberServer} class.
	*/
	@Test
	void testGetInstance6() {
		BomberServer instance = BomberServer.getInstance();
		BomberServer instance2 = BomberServer.getInstance();
		assertFalse(instance != instance2);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It checks if the method returns the same instance of the {@link BomberServer} class.
	*/
	@Test
	void testGetInstance7() {
		BomberServer instance = BomberServer.getInstance();
		BomberServer instance2 = BomberServer.getInstance();
		assertFalse(instance != instance2);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It checks if the method returns the same instance of the {@link BomberServer} class.
	*/
	@Test
	void testGetInstance8() {
		BomberServer instance = BomberServer.getInstance();
		BomberServer instance2 = BomberServer.getInstance();
		assertFalse(instance != instance2);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It checks if the method returns the same instance of the {@link BomberServer} class.
	*/
	@Test
	void testGetInstance9() {
		BomberServer instance = BomberServer.getInstance();
		BomberServer instance2 = BomberServer.getInstance();
		assertFalse(instance != instance2);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It checks if the method returns the same instance of the {@link BomberServer} class.
	*/
	@Test
	void testGetInstance10() {
		BomberServer instance = BomberServer.getInstance();
		BomberServer instance2 = BomberServer.getInstance();
		assertFalse(instance != instance2);
	}
}