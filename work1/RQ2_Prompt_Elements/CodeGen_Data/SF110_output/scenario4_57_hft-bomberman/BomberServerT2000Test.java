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
* It contains one unit test case for the {@link BomberServer#getInstance()} method.
*/
class BomberServerTest {
private static int port = Constants.DEFAULT_SERVER_PORT;
		//the new server
		private Server server;
		private jdbcDataSource dataSource;

		/**
		 * Test method for
		 * {@link org.apache.log4j.helpers.LogLog#getLogger()}
		 */
		@Test
		public void testLogger() {
			logger.info("here");
			assertNotNull("the logger is not set",logger);
			assertNotNull("the logger is null",logger.getLogger());
		}

		/**
		 * Test method for
		 * {@link org.apache.log4j.helpers.LogLog#addBomberInterface(java.lang.Class)}
		 */
		@Test
		public void testInterfaceAdding() {
			logger.warn("this is just a test");
			List<Message> msgs;
			try {
				connection = getConnection();
				msgs = prepareSession("test");
				drop(msgs);
				connection.close();
				getConnection().startConnect();
				getConnection().close();
				msgs = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			logger.warn("a strange problem happened");
		}

}

