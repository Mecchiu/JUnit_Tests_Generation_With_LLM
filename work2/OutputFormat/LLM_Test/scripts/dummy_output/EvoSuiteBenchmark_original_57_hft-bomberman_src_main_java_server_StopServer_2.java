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