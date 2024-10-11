// TransportKeyStoreBean_0Test.java
package br.com.jnfe.base;

import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import br.com.jnfe.base.util.SecurityUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TransportKeyStoreBean}.
* It contains one unit test case for the {@link TransportKeyStoreBean#openTransportStore()} method.
*/
class TransportKeyStoreBean_0Test {
		public static final String TYPE = "test.type";
		
void testOpenTransportStore(){
		
	}
	
	@Test
    public void shouldOpenKeyStore() throws Exception {
    	
		KeyStore keyStore = openTransportStore();
		assertNotNull(keyStore);
		
	}
	
	@Test
	public void shouldNotOpenKeyStoreUsingType("test.type") {
		
		try {
			
			LoggerFactory.getLogger(TransportKeyStoreBean_0Test.class).info(TransportKeyStoreBean_0Test.class+"::testNotOpenKeyStoreUsingType(\"test.type\")");
			
			openTransportStore();
			
		    fail("Exception not thrown");
			
		} catch (Exception e){
			
			assertTrue("Exception thrown", e instanceof SecurityException);
		}
	
	}
	
	@Test
	public void shouldNotOpenKeyStoreUsingTypeNull() {
		
		try {
		
			LoggerFactory.getLogger(TransportKeyStoreBean_0Test.class).info(TransportKeyStoreBean_0Test.class+"::testNotOpenKeyStoreUsingTypeNull");
			
			openTransportStore();
			
		    fail("Exception not thrown");
			
		} catch (Exception e){
			
			assertTrue("Exception thrown", e instanceof NullPointerException);
		}
	
	}
}