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

		/**
    * A constructor for the class
    *
    */
    public StopServerTest() {}

    /**
     * Test startServer
     *
     * @throws IOException
     */

    @Test
    public void createServerTest() throws IOException {
        try {

            try (Socket server = new Socket(socketURL, serverPort)) {

                try (ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream())) {

                    try {

                        out.writeObject(new StopServerMsg());

                    } catch (ClassNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }

            }

        } catch (IOException e) {
            fail(e.getMessage().toString());
        }

		}

	}
	
	
	
	
	/**
	 * socketURL, the url of the socket to send/receive objects
	 * serverPort, the port of the socket to send/receive objects
	 *
	 * @return socketURL
	 */

	private String socketURL = "pipoP4xv7mKxW9d5Q8S7xzF8pH6KZaPuDfI1J";

	private ServerSocket socket = null;
	  
	  


	private void makeSrv()
    {
        try {


			System.out.println("connecting to Server at "+socketURL);


			socket = new ServerSocket(
                    ServerSocketCreate.create((int) (socketURL.length() + 3) + 1,
                                        (int) (socketURL.length() + 3) + 1,
                                        SOCKET_NOBINDING |
                                        SERVER_SO_REUSEADDR,
                                        (int) (socketURL.length() + 3)
                                        ));
    

            System.out.println("server started");
            while (true) {
                try {

                    System.out.println("receiving data:");
                    String recvObject = null;
                    Socket client = socket.accept();
                    ObjectInputStream in = new ObjectInputStream(client.getInputStream());
                    System.out.println(in.readObject().class.getCanonicalName());

                    String outObjectClassName = in.readUTF();
                    System.out.println("received: " + outObjectClassName);
                

					recvObject = in.readUTF();
                

					outObject = in.readUTF();
                

                    System.out.println("finished recv");

                    outObject = outObject.trim();


					if(outObjectClassName.equals("StopServerMsg")) {
                        // Test object for stopServer(StopServerMsg object)
                        if (outObject.equals("") || outObject.equals("StopServerMsg")) {
                            // Send a message to the server indicating the
                            // success of the test run
                            sendMsg(
                                    new Message(
                                        MessageType.MESSAGE_STOPPED,
                                        new String[]{stopServerName}
                                    )
                            );

                        } else {
                            // Send a message indicating the failure of the test
                            sendMsg(
                                    new Message(
                                        MessageType.MESSAGE_FAILURE,
                                        new String[]{outObject}
                                    )
                            );
                        }

                    }


                    System.out.println("server closed");
                    close(client);
                    break;
                }
                catch (IOException ioe) {

                }
            }
            socket.close();
            System.out.println("server closed");
            System.out.println("all servers closed");

            return ;
        }
        catch (IOException ioe) {
        }
        catch (Exception e) {
            fail(e.getMessage().toString());
            fail("Some error");
        }

    }
    
}
