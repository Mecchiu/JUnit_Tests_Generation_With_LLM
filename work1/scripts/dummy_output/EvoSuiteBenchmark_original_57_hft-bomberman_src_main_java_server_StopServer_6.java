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
		public void sendingMessage()throws IOException{
		//Send a msg
			ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
			Message msg = new Message("msg");
			out.writeObject(msg);
			out.flush();
			out.close();
			System.out.println("Message sent");
		}


		public void callingStopServerFromCaller(StopServer stop)throws IOException{
			/**
			 * Connect to the Server
			 */
			System.out.println("Connecting Server");
			server = new Socket("194.196.141.182",serverPort);
	//		while(! server.isClosed()){
			/**
			 * Loop through the connections
			 */
					while(! stop.connectToSrv()){
						/**
						 * loop through the connections
						 */
								Thread.sleep(250);
					}

					/**
					 * Stop Server
					 */
					System.out.println("Server.stop");

					
				}catch(IOException ioE){
					ioE.printStackTrace();
				}
		}

		public void closingServer() throws IOException {
		    /**
                      * Receive the server close message from the sender
                      */
					ObjectInputStream in = new ObjectInputStream(server.getInputStream());
					Message m = (Message) in.readObject();
					/**
                      * close the socket
                      */
					server.close();
		 }
}