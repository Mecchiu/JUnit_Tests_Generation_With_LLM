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

    /**
     * Constructor for {@link StopServerTest} class
     *
     * @throws IOException
     */
    public void startStopServerTest() throws IOException {
    	
    	server = new Socket(serverName, serverPort);
    	ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
    	out.writeObject(new StopServerMsg(((Message)this.getClass().getEnclosingMethod().invoke(this, new Object[0])))).flush();
    	try {
    		server.setSoTimeout(5000);
    		final ObjectOutputStream out1 = new ObjectOutputStream(server.getOutputStream());
    	    out.close();
    		while (true) {
    			synchronized (this) {
    				try {
    					this.wait();
    				} catch (InterruptedException intExc) {
    					continue;
    				}
    			}
    			if (out == null) {
    				continue;
    			}
    			final ObjectOutputStream out2 = new ObjectOutputStream(server.getInputStream());
			    out1.flush();
			    ByteArrayOutputStream baos = new ByteArrayOutputStream();
			    out2.writeObject(Message.class.getEnclosingMethod().invoke(out1)+"\n").flush();
			    // out2.flush();
			    if (baos.length() == Message.length()) {
					final byte[] test = baos.toByteArray();
					assert(test[TestSocket.WRITABLE_SIZE] == 'w');
					assert(test[TestSocket.READABLE_SIZE] == 'r');
					out2.close();
					out1.close();
					server.close();
					return;
				}
			}
			// continue with the while() loop
		}
	}

	/**
     * Test method for {@link StopServer#connectionToSrv()}
     *
     * @throws IOException
     */
    @Test
    public void testConnectionToSrv() throws IOException {
        this.startStopServerTest();
        server.close();
        server = new Socket(serverName, serverPort);
        new Message(new StopServerMsg(((Message)this.getClass().getEnclosingMethod().invoke(this, new Object[0])))).send(server);
    }

    /**
     * @throws IOException
     */
    @Test
    public void testReceiveNothing() throws IOException {
        this.startStopServerTest();
        server.close();
        server = new Socket(serverName, serverPort);
        new Message(new StopServerMsg(new Message[0])).send(server);
		/**
		 * I don't know why this test works, but it doesn't.
		 * And I forget about the test case.
		 */
        while (true) {
            synchronized (this) {
                this.wait();
            }
            if (server == null) {
                return;
            }
            final ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
            out.writeObject(new StopServerMsg(new Message[0])).flush();
            if (server.getRemoteSocketAddress().getAddress().getHostAddress().equals(serverName) &&!server.getRemoteSocketAddress().getPort() == serverPort) {
                break;
            }
        }
        server.close();
        server = new Socket(serverName, serverPort);
        new Message(new StopServerMsg(new Message[0])).send(server);
    }
}