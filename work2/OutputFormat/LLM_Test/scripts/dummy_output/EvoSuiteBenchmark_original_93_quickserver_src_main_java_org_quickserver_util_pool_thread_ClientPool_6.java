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
		 
    public static int TEN = 10;

    // test all possible combinations to assert that PoolConfig class is working
    // this uses 'testPool' of this class to check the pooling configuration of
    @Test
    public void shouldBeApplicableWhenPoolingIsEnabled() {
        PoolFactory pf = newPoolFactory();
        ClientPool p = new ClientPool(pf, Ten);
        assertNotNull(p);
    }

    @Test
    public void shouldNotBeApplicableWhenPoolingIsNotEnabled() {
        ClientPool p = new ClientPool(null, Ten);
        assertFalse(p.isEnabled());
    }

    // test all possible combinations to assert that PoolConfig class is working
    /**
     * Test if default thread attributes are taken in case of NIO write.
     */
    public void shouldNioWriteHappen() {
    	log.info("shouldNioWriteHappen: false");
    	ClientPool p = new ClientPool();
    	log.info("shouldNioWriteHappen: true");
    	assertFalse(p.shouldNioWriteHappen());
    	log.info("shouldNioWriteHappen: true");
    }
    
    // test all possible combinations to assert that PoolConfig class is working
    /**
     * Test if it can be used as a singleton even if there is not pool configuration.
     * Also the key class used to store server configuration is 'ServerConfigImpl.  serverConfig'
     * @since 1.4.6
     */
    @Test
    public void shouldBeApplicableToOneServer() {
        ClientPool p = new ClientPool();
        PoolConfig pc = new ServerConfigImpl(10, 10);
        // we should not be able to create a singleton as there is not pool configuration
        assertFalse(p.equals(p));
        ServerPool sPool = p.getPool().getServerPool();
        assertNotNull(sPool);
        assertNotNull(sPool.getAttribute("ServerConfig"));// ServerConfigImpl has a special attribute to store pool configuration
        assertTrue(sPool.getAttribute("ServerConfig") instanceof PoolConfig);
        ClientPool p2 = p.clone();
        assertNotNull(p2);
        assertNotNull(p2.getClientPool());
        assertTrue(p.equals(p2));
    }

	//Test if the PoolConfig is created with the pool configuration attribute
    /**
     * Test if pool properties with the same name are the same.
     * Currently PoolConfig is created when it is created from XML by XMLReader.
     */
    private void testPool(PoolConfig p, PoolConfig oldP) {
        log.info("ServerName: {}", p.getServerName());
        log.info("ServerFactory: {}", p.getServerFactory());
        log.info("ServerFactory Class: {}", p.getServerFactoryClass());
        log.info("Max Size: {}", p.getMaxSize());
        log.info("Min Size: {}", p.getMinSize());
        log.info("Min Load: {}", p.getMinLoad());
        log.info("Max Load (sleepingTime: {})",p.getMaxLoad());
        log.info("Max Max Load: {}", p.getMaxMaxLoad());
        log.info("Max Min Load (sleepingTime: {})",p.getMaxMinLoad());
        log.info("Max Pool Size (sleepingTime: {})", p.getMaxSize());
        log.info("Max Pool Timeout (sleeping: {})", p.getMaxTimeout());
        log.info("Max Timeout Max Load: {}", p.getMaxTimeoutMaxLoad());
        log.info("Max Remaining time: {}", p.getMaxRemainingTime());
        log.info("Max Idle seconds: {}", p.getMaxIdleSeconds());
        log.info("Max Idle Interval: {}", p.getMaxIdleTime());
        log.info("Min Idle seconds: {}", p.getMinIdleSeconds());
        log.info("Min Idle Interval: {}", p.getMinIdleTime());
        log.info("Max Pool Wait interval [ms]: {}", p.getMaxWait());
        log.info("Max Pool Wait time [ms ]: {}", p.getMaxWait());
        assertEquals(p, oldP);
    }   
    
    public void testOne() {
    	testPool(new PoolConfig());
    }
    
    public void testTwo() {
    	testPool(new PoolConfig(), new PoolConfig());
    }

    /**
     * Test the creation of a pool with no configuration.
     * The configuration attribute should be set to null.
     * {@link PoolConfig} is a singleton.
     * @since 1.5.0
     */
    public void testOneWithNoPoolConfig() throws Exception {
    	testPool(new PoolConfig(),null);
    }

    
    /*
    @Test
    public void testClone() {
    	ClientPool p = new ClientPoolFactory().newClientPool(null, 10);
    	ClientPool p2 = p.clone();
    	assertSame(p, p2);
    }
    */
    public void testCloneSelf() {
    	ClientPool p = new ClientPoolFactory().newClientPool(null, 10);
    	ClientPool p2 = p.clone();
    	PoolFactory pf = newPoolFactory();
    	ClientPool p3 = pf.newClientPool(null, 10);
    	assertEquals(p.getSelf(),p2.getSelf());
    	assertEquals(p.getSelf(),p3.getSelf());
    }

    public void testClonePool() {
    	ClientPool p = new ClientPoolFactory().newClientPool(null, 10);
    	ClientPool p2 = p.clone();
    	assertNotSame(p,p2);
    }

    public void testPoolConfigFromXml() {
        /*
        * <configuration-attributes>
        * <ServerName>Example Name</ServerName>
        * <ServerFactory>jnx.jnx.ServerFactoryImpl</ServerFactory>
        *...
        * </configuration-attributes>
        */
        PoolFactory pf = newPoolFactory();
        ConfigParser cfgParser = new ConfigParser(null,null);
        ClientPool cClientPool = new ClientPoolFactory().newClientPool(null, 3);
        PoolConfig cfg = new ServerConfigImpl(50, 5);
        PoolConfig cConfig = new PoolConfig(50,50);

        // configure Pool
        cfgParser.configure(cfg);
        ClientPool pClientPool = cfgClientPoolFactory.newClientPool(pf, 3);
        ClientPool pCPClientPool = cfgClientPoolFactory.newClientPool(pf, 3);
        cClientPool.setAttribute("ServerConfig", cfg);
        cClientPool.setAttribute("ServerConfig", cfg);

        // configure the Pool with new configurations to test clonning
        cClientPool.configure(null, cConfig);
        PoolConfig pConfig = new PoolConfig(50,50);
}
}