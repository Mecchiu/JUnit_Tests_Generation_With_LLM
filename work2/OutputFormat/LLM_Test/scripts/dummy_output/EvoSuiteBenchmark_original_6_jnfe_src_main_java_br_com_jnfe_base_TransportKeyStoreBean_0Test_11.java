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
		private static final Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_0Test.class);
    private final String keyStoreFileUri = "file:src/test/resources/jnfe.pki-keys.jceks";
    private final String keyStoreType = "jceks";
    private final String keyStorePassword = "password";
    private final String trustStoreUri = "file:src/test/resources/jnfe.pki-trust-caveats.jceks";
    private final String trustStoreType = "jceks";
    private final String trustStorePassword = "password";
    private KeyStore keystore;

    /**
     * Test method for 'TransportKeyStoreBean_0Test().openTransportStore()'
     */
    @Test (expected = Exception.class)
    public void testConstructor() throws Exception {
        assertNotNull(SecurityUtils.getKeyStore(keyStoreFileUri, keyStoreType, keyStorePassword, trustStoreUri, trustStoreType, trustStorePassword));
    }

    /**
     * Test method for 'TransportKeyStoreBean_0Test().openTransportStore()'
     */
    @Test (expected = Exception.class)
    public void testReadDefaultKeyStore() throws Exception {
        keystore = SecurityUtils.getKeyStore(keyStoreFileUri, keyStoreType, keyStorePassword, keyStoreUri, trustStoreType, trustStorePassword);
        keystore.load(null, null);
        SecurityUtils.getKeyStore(SecurityUtils.getDefaultUri(), keyStoreType, keyStorePassword, securityProperties);
    }

    /**
     * Test method for 'TransportKeyStoreBean_0Test().openTransportStore()'
     */
    @Test (expected = Exception.class)
    public void testReadTrustStore() throws Exception {
        SecurityUtils.getKeyStore(keyStoreFileUri, keyStoreType, keyStorePassword, trustStoreUri, trustStoreType, trustStorePassword);
    }

    /**
     * Test method for 'TransportKeyStoreBean_0Test()'.
     *
     * @throws Exception
     */
    @Test
    public void testOpenTransportStore() throws Exception {
        keystore = SecurityUtils.getKeyStore(keyStoreFileUri, keyStoreType, keyStorePassword, keyStoreUri, trustStoreType, trustStorePassword);
    }
	
}