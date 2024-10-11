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
		
    /**
     * This class is used to test the getInstance method.
     */
    private static final class TestBomberServer extends BomberServer {
      private static Server newServer() {
        return new Server("localhost", port);
      }
      private ServerServer serverServer = null;
      public TestBomberServer() {
        super();

//        addClient(newClient("DUMB"));
      }

      /**
       * This method checks the constructor, sets up appropriate environment and calls
       * createSession().
       *
       * @throws Exception in case any error occurs.
       */
        public void initialize() {
//            serverServer.start();
            serverServer.create();
        }
            /**
             * This method checks that the getInstance method returns an instance of the
             * bomber server.
             */
               public void checkGetInstance() {
        	  assertTrue(serverServer instanceof BomberServer);
        }
      }

      public TestBomberServer(String url, String defaultTableName) {
        super(newServer(), url, defaultTableName);
      }
}