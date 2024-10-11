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
		/**
		 * A default keystore.
		 */
		private final KeyStore defaultKeyStore = SecurityUtils.getDefaultKeyStore();

		/**
        * Test of openTransportStore() method, of class TransportKeyStoreBean.
        */
        @Test
        public void openTransportStore() {
            assertNull(SecurityUtils.getTransportKeyStore());

            System.setProperty("user.home", null);
            System.setProperty("user.dir", null);
            System.setProperty("java.security.policy", null);
            System.setProperty("jnfe.pfx", null);
            System.setProperty("keystore.password", null);
            System.setProperty("keystore.type", null);
            System.setProperty("keystore.password.pfx", null);
            System.setProperty("keystore.uri", null);
            System.setProperty("SSL_CLIENT_AUTH_SERVER_NEGOTIATION", null);

            try (KeyStore keyStore = openTransportStore()) {
            }
        }

        /**
        * @throws Exception
        * @see
        */
        private void assertExpected(String description) throws Exception {
            assertNotNull("Transport key store must be not null", defaultKeyStore);
            //logger.info("Default Keystore: {}", defaultKeyStore);

            if (description == null) {
                throw new AssertionError("Description must not be null.");
            }
            Iterator<String> iterator = SecurityUtils.getTransportKeyStore().getKeys().iterator();
            iterator.next();
            iterator.iterator();
            assertEquals(description, iterator.next());
            assertEquals(description, SecurityUtils.getTransportKeyStore().getCertificate(iterator.next()).
            getSubjectDN().toString());
        }
    }