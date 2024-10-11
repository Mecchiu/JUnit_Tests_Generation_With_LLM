// TransportKeyStoreBean_1Test.java
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
* It contains one unit test case for the {@link TransportKeyStoreBean#openTransportKeyManagerFactory()} method.
*/
class TransportKeyStoreBean_1Test {
		
	/**
	* Test of init().
	*
	* @throws Exception
	*/
	@Test
	public void testInit() throws Exception {
		logger.debug("# init()");
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
		instance.init();
		assertNotNull(instance);
		assertNotNull(instance.trustStore);
		assertNotNull(instance.trustStorePassword);
		assertNotNull(instance.keyStore);
	}
	
	@Test
	public void testCloseTransportStore() throws Exception {
		logger.debug("# testCloseTransportStore");
        SecurityUtils.SecurityUtils = null;
		TransportKeyStoreBean instance = new TransportKeyStoreBean();
		instance.init();
		instance.trustStoreUri = DEFAULT_KEYSTORE_URI;
		instance.trustStoreType = DEFAULT_KEYSTORE_TYPE;
		instance.trustStorePassword = null;
		instance.keyStoreUri = System.getProperty("user.home") + "/.jnfe";
		instance.keyStoreType = DEFAULT_KEYSTORE_TYPE;
		instance.keyStorePassword = null;
		instance.trustStoreUri = "file:#{ System.getProperty('user.home') }/jnfe.pfx";
		instance.trustStoreType = "pkcs12";
		instance.trustStorePassword = null;

		instance.trustStore = SecurityUtils.SecurityUtils.unwrap(instance.trustStore);
		System.setProperty("user.home", "file:");
		instance.trustStore = SecurityUtils.SecurityUtils.unwrap(instance.trustStore);
		assertEquals(instance.trustStoreUri,DEFAULT_KEYSTORE_URI);
		logger.debug("# closeTransportStore #");
		instance.trustStore = null;
	}

	@Test
	public void testGetKeyStore() throws Exception {
		logger.debug("# testGetKeyStore");
        TransportKeyStoreBean instance = new TransportKeyStoreBean();
		instance.init();
		instance.trustStoreUri = DEFAULT_KEYSTORE_URI;
		instance.trustStoreType = DEFAULT_KEYSTORE_TYPE;
		instance.trustStorePassword = null;
		instance.keyStoreUri = System.getProperty("user.home") + "/.jnfe";
		instance.keyStoreType = DEFAULT_KEYSTORE_TYPE;
		instance.keyStorePassword = null;

		instance.keyStore = SecurityUtils.SecurityUtils.unwrap(instance.keyStore);
		System.setProperty("user.home", "file:");
		instance.keyStore = SecurityUtils.SecurityUtils.unwrap(instance.keyStore);
		assertEquals(instance.keyStoreUri,DEFAULT_KEYSTORE_URI);
		logger.debug("# closeTransportStore #");
		instance.trustStore = null;
	}

}