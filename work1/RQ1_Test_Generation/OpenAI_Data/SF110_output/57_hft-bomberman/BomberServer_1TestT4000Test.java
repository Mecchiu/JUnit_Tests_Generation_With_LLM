// BomberServer_1Test.java
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
class BomberServer_1Test {

	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_1() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_2() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_3() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_4() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_5() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_6() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_7() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_8() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_9() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
}

// BomberServer_2Test.java
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
class BomberServer_2Test {
		
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_1() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_2() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_3() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_4() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_5() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_6() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_7() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_8() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_9() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
}

// BomberServer_3Test.java
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
class BomberServer_3Test {
		
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_1() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_2() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_3() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_4() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_5() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_6() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_7() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_8() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance_9() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
}

// BomberServer_4Test.java
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
class BomberServer_4Test {
		
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {@link BomberServer#getInstance()} method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* This test case checks if the {