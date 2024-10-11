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
		private KeyManagerFactory openTransportKeyManagerFactory;

		private KeyStore openTransportStore;

		/**
		 * To initialize the unit test.
		 */
		public TransportKeyStoreBean_1Test() throws Exception {

			KeyStore keyStore = openTransportStore = new KeyStore(getClass().getResourceAsStream(DEFAULT_KEYSTORE_TYPE + ".crt"));
			keyStorePassword = SecurityUtils.loadPassword(getClass().getResourceAsStream(DEFAULT_KEYSTORE_TYPE + ".pass"));
			trustStore = getClass().getClassLoader().getResource(DEFAULT_KEYSTORE_URI).getFile();

		}

		@Test
		public void test() throws Exception {

			assertNotNull(openTransportKeyManagerFactory);

			KeyManagerFactory keyManagerFactory = openTransportKeyManagerFactory;
			logger.info("keyManagerFactory="+keyManagerFactory);

		}
}