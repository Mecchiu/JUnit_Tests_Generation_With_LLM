// ClientPoolTest.java
package org.quickserver.util.pool.thread;

import java.util.*;
import org.quickserver.util.pool.*;
import org.apache.commons.pool.*;
import org.quickserver.net.server.*;
import org.quickserver.util.xmlreader.PoolConfig;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPool}.
* It contains one unit test case for the {@link ClientPool#shouldNioWriteHappen()} method.
*/
class ClientPoolTest {
		
	/**
	 * Test method to test if NIO (Non-Buffered) write should be sent for processing.
	 *
	 * @since 1.4.6
	 */
	@Test
	public void testShouldNioWriteHappen() {
		/* Set Configuration */
        final PoolConfig config = new PoolConfig();
                                     config.setMaxTotal(1);
                                     config.setMinIdle(1);
                                     config.setMaxWait(5000);
                                     config.setWhenExhaustedAction(PoolConfig.WHEN_EXHAUSTED_FAIL);
                                     config.setMaxWait(5000);
        Pool pool = new GenericPool(config);

        try {
            Server server = new Server();
            server.start();
           
            ServerSocket serverSocket = new ServerSocket(2200);


            BufferedReader in = new BufferedReader(new InputStreamReader(serverSocket.accept()));
            String clientName = in.readLine();
            assertTrue(in.readLine().startsWith("<Client "));
            String client = in.readLine();

            String clientPoolName = client.replace("<Client ", "").replace("/> ", "");
            Connection connection = pool.getConnection(clientPoolName, client.length() );
            connection.setReadTimeout(60 *1000);
            connection.setWriteTimeout(60*1000);

            serverSocket.close();
        }
        catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
		assertTrue("The server has not been started. ", true);
	}


	
}