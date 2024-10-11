// StopServer.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;

/**
 * Sends a Message to the Server, that he should closed
 *
 * @author Bj�rn
 */
public class StopServer {

    /**
     * Connect to the Server
     */
    public boolean connectToSrv() {
        try {
            Socket socket = new Socket("localhost", 8080);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(new StopServerMsg());
            out.flush();
            socket.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}

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
    
    @Test
    void testConnectToSrv() {
        StopServer stopServer = new StopServer();
        assertTrue(stopServer.connectToSrv());
    }
    
    @Test
    void testConnectToSrvWithWrongPort() {
        StopServer stopServer = new StopServer();
        assertFalse(stopServer.connectToSrv("localhost", 1234));
    }
    
    @Test
    void testConnectToSrvWithWrongHost() {
        StopServer stopServer = new StopServer();
        assertFalse(stopServer.connectToSrv("wronghost", 8080));
    }
    
    @Test
    void testConnectToSrvWithNullHost() {
        StopServer stopServer = new StopServer();
        assertFalse(stopServer.connectToSrv(null, 8080));
    }
    
    @Test
    void testConnectToSrvWithNegativePort() {
        StopServer stopServer = new StopServer();
        assertFalse(stopServer.connectToSrv("localhost", -1));
    }
    
    @Test
    void testConnectToSrvWithZeroPort() {
        StopServer stopServer = new StopServer();
        assertFalse(stopServer.connectToSrv("localhost", 0));
    }
    
    @Test
    void testConnectToSrvWithIOException() {
        StopServer stopServer = new StopServer();
        assertFalse(stopServer.connectToSrv("localhost", 8081));
    }
    
    @Test
    void testConnectToSrvWithNullMsg() {
        StopServer stopServer = new StopServer();
        assertFalse(stopServer.connectToSrv("localhost", 8080, null));
    }
    
    @Test
    void testConnectToSrvWithClosedSocket() {
        StopServer stopServer = new StopServer();
        assertFalse(stopServer.connectToSrv("localhost", 8080, new StopServerMsg()));
    }
    
    @Test
    void testConnectToSrvWithNullOutputStream() {
        StopServer stopServer = new StopServer();
        assertFalse(stopServer.connectToSrv("localhost", 8080, new StopServerMsg(), null));
    }
}