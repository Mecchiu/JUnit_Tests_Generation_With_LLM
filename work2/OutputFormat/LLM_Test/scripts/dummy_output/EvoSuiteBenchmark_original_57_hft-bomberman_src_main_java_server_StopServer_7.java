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
		
    private ObjectOutputStream out;

    private Socket server;

    public StopServerTest() throws Exception {
        out = new ObjectOutputStream(System.out);
        out.writeObject(new StopServerMsg());
    }

    @Test
    public void testStartServerAndSendMsg() {
        try {
            new StopServer();
            String msg = "test start server and send msg";
            
            server = new Socket(serverName, serverPort);
            
            Message m = (Message) out.toByteArray();
            out = null;

            m.sendWithServer(server, msg);

            assertEquals(Server.getInstance().isConnected(), true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
	
}