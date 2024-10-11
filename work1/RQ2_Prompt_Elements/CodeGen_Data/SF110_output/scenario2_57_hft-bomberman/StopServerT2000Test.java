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
	 *  Create a new instance of this class.
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
	
		// Create a new instance of the Test class
		StopServerTest tester = new StopServerTest();
	
		/**
		* Iterate through all other units test classes, and for each unit test class,
		* compare the result of the two instances to one another
		*/
		// ConnectToSrv - send a Message to the server
		tester.connectToSrv();
		System.out.println("Send a message to the server has been started");

		// Receive a message from the client
	        Message message = null;
	        try {
	            // TODO: add timeout
	            System.out.println("Receive your message ");

	            //Receive a message from the client
	            out.writeObject(new TestMessage(StopServerMsg.STOP));
	            message = (Message) in.readObject();
	            // The second message is expected to be read on success

	        } catch (IOException e) {
	            // TODO: add timeout
	            e.printStackTrace();
	        }
	
	        assertNull(message);
	        //Close the connection
	        out.flush();
	        System.out.println("Send a message to the server has been finished");
	        tester.stop();


	}
	
	/**
	 * An unit test class for the class {@link StopServer}
	  */
	private class StopServer extends Thread{
		
		/**
		 * Initialize the thread
		 */
		public StopServer(){
			setName("StopServer-" + nextTestNumber());
		}

		/**
		 * Receive a message from the server. This is the method that it should
		 * execute in the main loop of the test suite.
		 * @param message Object The object, whose type can be the class
		 * 			of the message
		 * @throws IOException
		 */
		@Override
		public void run () {
		     
			// Wait until the message is received
			while (!(out.getDataVersion()==out.getDataVersion(0))) {
				try {
					out.wait();
				} catch (InterruptedException e) {
				    System.out.println("The main message loop failed!");
				    e.printStackTrace();					
				}
			}
			
		}
		
	}

	/**
	 * A unit test class for the message {@link StopServerMsg}
	  */
	private class TestMessage implements Message{
		public boolean on = true;
		public int value = 1;
		
		public TestMessage () {
			setText("StopServerTestMessage");
			setDataVersion(1);
		}
	
		
		/**
		 * Class constructor for test message
		 */
		public TestMessage(StopServerMsg message) {
			setDataVersion(message.getDataVersion());
			setText(message.getString());
		}

	public static final long currentTestNumber=0;			
	
		@Override
		public void receive(Object obj) {		
			System.out.println("Message received from " + obj);
			if(obj.equals(new StopServer())){
				setDataVersion(2);
				setText("Close");
			}
		}

		@Override
		public void send(Object obj) {		
			System.out.println("Sending "+ obj);
			ObjectOutputStream out = null;
			try {
				out = new ObjectOutputStream(server.getOutputStream());
				System.out.println("Send a message ");
				
				out.writeObject(new TestMessage(StopServerMsg.STOP));
				setDataVersion(2);
				setText("Close");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					if(out!=null ){
						out.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
				
			}
		}
		
		
		
	}

}