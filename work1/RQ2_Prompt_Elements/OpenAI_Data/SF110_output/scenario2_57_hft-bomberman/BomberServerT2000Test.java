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
		BomberServer bs = BomberServer.getInstance();
		assertNotNull(bs);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance2() {
		BomberServer bs = BomberServer.getInstance();
		BomberServer bs2 = BomberServer.getInstance();
		assertEquals(bs, bs2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance3() {
		BomberServer bs = BomberServer.getInstance();
		BomberServer bs2 = BomberServer.getInstance();
		assertSame(bs, bs2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance4() {
		BomberServer bs = BomberServer.getInstance();
		BomberServer bs2 = BomberServer.getInstance();
		assertSame(bs, bs2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance5() {
		BomberServer bs = BomberServer.getInstance();
		BomberServer bs2 = BomberServer.getInstance();
		assertSame(bs, bs2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance6() {
		BomberServer bs = BomberServer.getInstance();
		BomberServer bs2 = BomberServer.getInstance();
		assertSame(bs, bs2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance7() {
		BomberServer bs = BomberServer.getInstance();
		BomberServer bs2 = BomberServer.getInstance();
		assertSame(bs, bs2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance8() {
		BomberServer bs = BomberServer.getInstance();
		BomberServer bs2 = BomberServer.getInstance();
		assertSame(bs, bs2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance9() {
		BomberServer bs = BomberServer.getInstance();
		BomberServer bs2 = BomberServer.getInstance();
		assertSame(bs, bs2);
	}
	
	/**
	* Test case for the {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance10() {
		BomberServer bs = BomberServer.getInstance();
		BomberServer bs2 = BomberServer.getInstance();
		assertSame(bs, bs2);
	}
}