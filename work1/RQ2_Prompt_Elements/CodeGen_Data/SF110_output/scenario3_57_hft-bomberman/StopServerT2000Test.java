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
	 * Test method for {@link StopServer#connectToSrv()}.
	 * The test case includes one exception, the following test cases:
	 * 	<ol>
	 *		<li>{@link StopServerTest#connectToSrv()} should return {@code false}</li>
	 *		<li>{@link StopServerTest#connectToSrv()} should throw {@link SocketClosedException}}</li>
	 *		<li>{@link StopServerTest#connectToSrv()} should throw {@link IOException}}</li>
	 *		<li>{@link StopServerTest#connectToSrv()} should throw {@link ClassNotFoundException  }}</li>
	 * 	</ol>
	 */
	@Test
	public void testConnectToSrvReturnFalse() throws IOException {
		try {
	        Socket temp = new Socket(TestServerClass.TESTING_IP, TestServerClass.TESTING_PORT);
	        OutputStream out = temp.getOutputStream();
	        ObjectOutputStream oos = new ObjectOutputStream(out);

	        ObjectOutputStream oos2 = new ObjectOutputStream(out);
	        oos2.writeObject(new  StopServerMsg());

	        oos2.close();
	        oos.close();
	        oos.flush();
	
	        assertEquals(false,  connectToSrv());
		}
		catch (ClassNotFoundException | SocketClosedException | IOException e) {
	        ExceptionManager.err(e.getMessage());
			fail(e.getMessage());
		}
	}
	
	/**
	 * Test method for {@link StopServer#connectToSrv(int)}.
	 * The test case includes one exception, the following test cases:
	 * 	<ul>
	 *
	 *		<li>{@link StopServerTest#connectToSrv()} should return {@code false}</li>
	 *		<li>{@link StopServerTest#connectToSrv()} should throw {@link IOFailure}}</li>
	 *		<li>{@link StopServerTest#connectToSrv(int)} should throw {@link SocketClosedException}}</li>
	 *		<li>{@link StopServerTest#connectToSrv(int)} should throw {@link IOException}}</li>
	 *		<li>{@link StopServerTest#connectToSrv(int)} should throw {@link ClassNotFoundException  }}</li>
	 *	</ul>
	 */
	@Test
	public void testConnectToSrvException(int port) throws IOException,  SocketClosedException, ClassNotFoundException {
	        final TestServerClass testClass = TestServerClass.getInstance();
	        
	        ObjectOutputStream oos = new ObjectOutputStream(new ObjectOutputStream(testClass.testSrvUDPHost.getOutputStream()));
	        TestServerClass.TESTING_SERVER_PORT = port;

	        try {
	        oos.writeObject(new  Message());
	        }
	        catch(IOException e) {
	        oos.close();
	        ClassNotFoundException.check(e);
	        throw e;
	        }

		try {
			connectToSrv();
		}
		catch (SocketClosedException e) {
	        oos.close();
			oops.close();
			oos.flush();
			oos.writeObject(new  ClassNotFoundException("The socket wasn't closed"));
			throw e;
		}

		try {
			oos.close();
		} catch (IOException e) { //do nothing
		}

		try {
			oos.writeObject(new  IOFailure());
		} catch (IOException e) { //do nothing
		}

		try {
			connectToSrv(port + 10);
		}
		catch (IOException e) {
			IOGlobal.LOG_ALL.log(e);

			ExceptionManager.err(e.getMessage());
			oos.close();
			oops.close();
			oos.flush();
			oos.writeObject(new  ClassNotFoundException("The socket wasn't closed"));
			throw e;
		}

		if (port!=  TestServerClass.TESTING_SERVER_PORT) {
			oos.close();
			oops.close();
			oos.flush();

			IOException e;
			e = ClassNotFoundException.check(new IOException("We already closed a port"));
			try {
				connectToSrv(0);
			}
			catch (IOException e2) {
				e = e2;
			}
			
			oos.close();
			oops.close();
			oos.flush();
			oos.writeObject(new  ClassNotFoundException("The socket wasn't closed"));
			
		
			
		}
		
	}

}

