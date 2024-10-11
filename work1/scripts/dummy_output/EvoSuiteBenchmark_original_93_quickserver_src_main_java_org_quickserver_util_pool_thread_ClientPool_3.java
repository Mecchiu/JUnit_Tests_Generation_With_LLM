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
    * @since 1.3
    */
    private final static Log _log = LogFactory.getLog(Lecture.class.getName());
    /**
    * The name of the XML config file that specifies what configuration to use if possible.
    */
    private static final String CURRENT_CONFIG =
            "./src/test/resources/conf/pool/Server.xml";
    /**
    * The name of the XML config file that specifies what configuration to use if not possible.
    */
    private static final String CURRENT_CONFIG_NO_DEFAULT =
            "./src/test/resources/conf/pool/ClientPool.xml";
    
    public static final String CLIENT_PANEL =
            "./src/test/resources/configs/panel/sock/serversocketpanel.xml";
    
    @Test
    public void testCanAddClient() {
        _log.fine("Clients: " + new HashSet(ClientPoolTest.get()));
        _log.fine("Clients: " + ClientPoolTest.get());
        _log.fine("Clients: " + ClientPoolTest.get());
        _log.fine("Clients: " + ClientPoolTest.get());
        _log.fine("Clients: " + ClientPoolTest.get());
        _log.fine("Clients: " + ClientPoolTest.get());
        
        assertEquals(3, ClientPoolTest.get().size());
        assertEquals(0, ClientPoolTest.get().removeAll());
        assertEquals(1, ClientPoolTest.get().size());
        assertTrue(ClientPoolTest.get().add("testClientToAllConfigs"));
        
        assertEquals(3, ClientPoolTest.get().size());
        assertFalse(ClientPoolTest.get().add("testClientToAllConfigs"));
        assertTrue(ClientPoolTest.get().add("testClientToServerConfig"));
        assertFalse(ClientPoolTest.get().add("testClientToServerConfig"));
        assertTrue(ClientPoolTest.get().add("testClientToServerConfig"));
        assertFalse(ClientPoolTest.get().add("testClientToServerConfig"));
        _log.fine("Clients after :");
        assertEquals(2, ClientPoolTest.get().size());
    }
    
    @Test
    public void testCanAddClientToServerConfig() {
        _log.fine("Clients: " + new HashSet(ClientPoolTest.get()));
        _log.fine("Clients: " + ClientPoolTest.get());
        _log.fine("Clients: " + ClientPoolTest.get());
        _log.fine("Clients: " + ClientPoolTest.get());
        _log.fine("Clients: " + ClientPoolTest.get());
        assertEquals(3, ClientPoolTest.get().size());
        assertEquals(0, ClientPoolTest.get().removeAll());
        assertEquals(1, ClientPoolTest.get().size());
        assertTrue(ClientPoolTest.get().add("testClientToServerConfigToServerConfig"));
        
        ClientPoolTest.get().add("testClientToAllConfigsToServerConfig");
        assertEquals(3, ClientPoolTest.get().size());
    }
    
    public static final class ServerSocketConfig extends PoolConfig {
        public static int MAX_CONN = 3;
        public static int MIN_CONN = 1;
        public static int MAX_TRACES = 1;
        public static int MIN_TRACE = 1;
        public static int MAX_TRACE_TIME = 3;
        public static int MIN_TRACE_TIME = 1;
    }
    
    public final static String CURRENT_CONFIG =
            "net.foo.foo = (\n"
                    + "\t${pools}\n," 
                    + "\t${pools}\n," 
                    + "\t${pools}\n)" 
                    + "\n" 
                    + "\t${nioWriteThresholds}\n" 
                    + "net.foo.foo = 10;"
            ;
    
    public final static String A_NIO_THRESHOLD = 
            "net.foo.foo = 100;"
                    + "${pools}";
    
    @Test
    public void testGetMaxNioWriteThresholdValue() {
        _log.fine("Threshold : " + new ClientSocketConfig().getMaxNioWriteThresholdValue());
        _log.fine("Threshold : " + new ClientSocketConfig().getMinNioWriteThresholdValue());
        Set<Integer> values = new HashSet<Integer>(); 
        values.add(2);
        values.add(4);
        values.add(8);
        values.add(10);
        
        _log.fine(values);
        assertEquals(0, values.size());
        values.add(10);
        assertEquals(3, values.size());
        ClientQueueConfig mq = new ClientQueueConfig();
        ClientPool.setMaxNioWriteThreshold(mq);
        assertEquals(10, values.size());
    }
    
    public final SocketConfig SOCKET_CONF = 
            new SocketConfig()
                   .setMaxConnections(2)
                   .setKeepAliveInterval(1)
                   .setTimeBetweenKeepAliveRetries(500)
                   .setIdleTimeout(0)
                   .setLocalTimeout(2000)
                   .setSendTimeout(1000)
                   .setSocketBufferSize(0)
                   .setMaxSocketRetries(2)
                   .setMaxSocketSendFailureRetries(1000)
                   .setMaxSocketTimeout(250);    
    
    @Test
    public void testCreateSocketConfig() {
        _log.fine("Clients: " + new HashSet(ClientPool.get()));
        _log.fine("Clients: " + ClientPool.get());
        _log.fine("Clients: " + ClientPool.get());
        _log.fine("Clients: " + ClientPool.get());
        
        int s = ClientPool.createSocketConfig(SOCKET_CONF);
        assertEquals(1, s);
        assertFalse(ClientPool.createSocketConfig(SOCKET_CONF));
    }
    
}