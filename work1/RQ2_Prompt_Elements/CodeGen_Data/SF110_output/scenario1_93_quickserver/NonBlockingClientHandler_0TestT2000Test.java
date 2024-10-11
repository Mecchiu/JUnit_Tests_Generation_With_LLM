// NonBlockingClientHandler_0Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterWrite()} method.
*/
class NonBlockingClientHandler_0Test {
private final Log log = LogFactory.getLog(this.getClass());

		// Constructors


		public NonBlockingClientHandler_0Test() {
			super();
		}

		private NonBlockingClientHandler_0Test(ByteBuffer buffer) {

			this.buffer = buffer;
		}

		// Instance Creation Methods

		public NonBlockingClientHandler_0Test(ByteBuffer buffer) {
			super();
			this.buffer = buffer;
		}


		// Methods

		public ByteBuffer getBuffer() {
			return this.buffer;
		}


		@Override
		public String getName() {
			return "Test NonBlockingClientHandler_0";
		}


		@Override
		public void handle(Connection c, byte level) throws IOException {

			try {
				System.out.println("Handle to Connection: " + c + " level: " + level);
				while(level > 0) {
					level--;
					System.out.println("Level not processed, sleeping for some time.");
					Thread.sleep(100);
					c.close();
				}
				c.write(getBuffer());
			} catch (InterruptedIOException e) {
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("IOException");
				e.printStackTrace();
			}

		}


		private ByteBuffer getBuffer() {
			return this.buffer;
		}

	}

// NonBlockingClientHandler_1Test.java

class NonBlockingClientHandler_1Test extends ServerTest {
		private final Log log = LogFactory.getLog(getClass());
		private final String name = "NonBlockingClientHandler_1Test";

		private final ByteBuffer data = ByteBuffer.allocate(100000);

		private Throwable exception;

		private NonBlockingClientHandler_1Test(Server s, NonBlockingServerProxy proxy) {

			super(s, proxy);
		}

		public NonBlockingClientHandler_1Test(Server s) {

			super(s);
		}

		public void run() {

			Log log = LogFactory.getLog(getClass());
			try {

				List<Server> servers = getServers();
				if(!servers.isEmpty()) {
					for (Server server : servers) {
						server.initialize(null, null);
						for (SocketChannel sc : server.getInputs()) {

							try {
								//Send data to the server.
								OutputStream os = sc.getOutputStream();
								sc.write(data);
								sc.close();
							} catch (IOException e) {
								e.printStackTrace();
								System.err.println("Failure when sending data to the server. "
									+ e.getMessage());
							}
						}
					}

					/*
					 * Send data to the server.
					 */
					List<Server> serversOutput = getServersOutput();
					for (Server server : serversOutput) {
						server.initialize(null, null);
						try {

							//Send data to the server.
							OutputStream os = server.getOutputStream();
							server.write(data);
							os.write(data);
							os.flush();
						} catch (IOException e) {
							e.printStackTrace();
							System.err.println("Failure when sending data to the output stream. "
								+ e.getMessage());
						}
					}

				}

            } catch (Exception e) {
                throw new IllegalStateException(e.getClass().getName() + "[" + e.getMessage()+ "]");
            }
		}

		public void testData() throws InterruptedException, IOException {

			Log log = LogFactory.getLog(getClass());
				log.info(getName() + " started");
				log.info("Running the " + name);

				run();
				log.info(getName() + " finished");

			}

}

// Main.
public static void main(String[] args) {

	Server server = null;
	
	/*
	 * Test cases.
	 */
	server = new ServerTest(Integer.getInteger("tests"));
	server.run();
	
}
