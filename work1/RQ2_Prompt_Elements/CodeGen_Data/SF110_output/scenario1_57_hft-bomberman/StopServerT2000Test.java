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
* It contains one unit test case for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {
private final int port = 8765;
    	private Server server;
        private Socket conn;

        public StopServerTest  () throws IOException{
			// Create the server and start listening.
            ServerSocketFactory socketFactory = new JsServerSocketFactory();
            // Create a server socket, which binds to the given port, on its own thread.
			conn= socketFactory.createSocket(serverName,port);

            // And start the server listening to this client socket.
            server= new TcpServer("TcpServer",conn);
        }
		
		@Test
    	public void receiveMessage(){
    		// Connect to the client.
        	server.join();
            
    		// Open the connection:
            conn.connect();
            
            // Read a message:
            Message message = new TcpReceiver().receive(conn,new ObjectInputStream(conn.getInputStream()) );
            message.send(conn);
            
            // Close the connection:
            conn.close();
            
            // Try to connect to the same socket again..
            assertNull("Connect to the same socket again.",conn);
    		
    		// Connect to the same server again..
    		assertFalse("Connect to same server again.",conn));
    	}
}