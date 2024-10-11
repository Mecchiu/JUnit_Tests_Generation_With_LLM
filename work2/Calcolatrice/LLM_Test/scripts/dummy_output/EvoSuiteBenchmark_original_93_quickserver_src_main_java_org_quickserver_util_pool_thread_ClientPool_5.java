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
		
        static final Logger Log = Logger.getLogger(ClientPoolTest.class.getName());
	String data;
    final ThreadPoolExecutor threadPool;
    ThreadPoolExecutor pool;
    int maxIdleCount;
    int maxActiveCount;
    int activeCount;
    final static int poolThreadFactory = 1;
    final static int maxThreadFactory = 1;
    final static int poolKey = 1313;

        public ClientPoolTest(PoolConfig poolConfig) {
        	poolConfig = new PoolConfig(poolConfig);
        }

        public void setUp() throws Exception {
        	
					threadPool = new ThreadPoolExecutor(1, 1,  // This is a number of minutes. 
						5000,  // This is how many threads are used. For example, when we're doing 1 second work between threads at 5 seconds
						"", // This is the queue to be used. 
						new ThreadPoolExecutor.CallerRunsPolicy(
							   poolThreadFactory,
							   poolThreadFactory,
							   poolKey,
							   pool));
     		pool = new ThreadPoolExecutor(1, 1,  // This is a number of minutes. 
							   5000,  // This is how many threads are used. For example, when we're doing 1 second work between threads at 5 seconds
							   "", // This is the queue to be used. 
							   new ThreadPoolExecutor.CallerRunsPolicy(
								   poolThreadFactory,
								   poolThreadFactory,
								   poolKey,
								   pool));
     		maxIdleCount = 16;
        	maxActiveCount = 10;

        	synchronized (pool) {
       			synchronized (threadPool) {
        				activeCount = 1;// Set this to 1 so max and active will be the same.
        				threadPool.getQueue().add("test");
        				threadPool.setRejectedExecutionHandler(new DiscardExceptionHandler());
			    }
		    }

		}

        public ClientPoolTest testCreateClientPool() {
        	this.data = "data";

        	final PooledReference<XMLReader> serverInstance = new PooledReference<>();
        	final XMLReaderFactory xfrFactory = new XMLReaderFactory();

        	final PoolConfigurationClient pconfClient =
    			 new PoolConfigurationClient()
    			{
    				  private XMLReaderFactory factory = xfrFactory;             	
			        public Client createClient(String clientName, XMLEventReader reader) throws XMLReaderException {
			  			PooledReference<XMLReader> resRef = new PooledReference<>();
			        	
			        	resRef = new PooledReference<>(factory.getPooled(logg));
			        	resRef.setReference("serverInstance", serverInstance);
			        	
			        	XMLReader server = resRef.getReference();
			        	
			        	Server s = new Server();
					s.init(server);
					return new Client(server);                           	
			        }
    			};
        	PoolConfigurationClient pooledConfig =
				 new PoolConfigurationClient()
				{
						 public ConfigurationClient createConfigurationClient(String name) {
        					System.err.println("Creating configuration client for " + getThreadFactoryName(pooledConfig) + "/" + name);
							ConfigurationClient clientConfig = 
									new ConfigurationClient(getThreadFactoryName(pooledConfig),  name);
									return clientConfig;
						 }               
		    };

    		XMLReaderFactory mfr = new XMLReaderFactory();
            final  PoolConfigurationClientPool poolConfig = new PoolConfigurationClientPool(mfr, pooledConfig, pooledConfig);

            ClientPool configClientPool = new   ClientPool()
            {
            	public Client createClient(String name, XMLReaderReader reader) {

					Client client = new Client(serverInstance.getReference());
					configClientPool.addClient(configClientPool, client);
					return client;
            	}
            };

    		XMLReader server = mfr.getXMLReader();
    		xfrFactory.removeWorkLoad(server.getRoot().getNode(), null);

            final XMLReader mfrReader = mfr.createXMLReader();
    		final int mfrReaderCount = mfrReader.getHandlers().length;
    		mfrReader.reset();

            Thread t = new Thread(new Runnable(){

                  public void run() {
                      server.addHandler(logg);
                      configClientPool.addClient(pool, mfrReader);
                  }
                  
            });
            t.start();
    		//t.join();

    		final XMLEventReader childReader = server.getRoot().getChild(data);    		
    		// System.out.println("Child reader: " + childReader.getText());
    		return configClientPool;                      
       }
       
}