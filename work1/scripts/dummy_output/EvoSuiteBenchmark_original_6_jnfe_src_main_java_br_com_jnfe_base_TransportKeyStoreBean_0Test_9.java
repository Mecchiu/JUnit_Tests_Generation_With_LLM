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
     * To string.
     */
    private static final Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_0Test.class);

    /**
     * Unit test of abstract class {@link TransportKeyStoreBean}.
     */
    @Test
    public void testAbstractClass1() {
        
        // A ssl utl.
        String keyStoreUri = SecurityUtils.buildKeyStoreUrl(SecurityUtils.buildUrl(SecurityUtils.buildKeyStoreUri("127.0.0.1")), "MYPKI", "myPKI", DEFAULT_KEYSTORE_TYPE, DEFAULT_KEYSTORE_SIGALG);
                
        assertNotNull(keyStoreUri);
        assertTrue(SecurityUtils.isKeyStoreUriPermitted(keyStoreUri));
                
        // Abre a localizacao do ssl
        KeyStore keyStore = SecurityUtils.buildKeyStore(SecurityUtils.buildUrl(SecurityUtils.buildUrl(SecurityUtils.buildUrl(SecurityUtils.buildKeyStoreUri("127.0.0.1")), "MYPKI", "myPKI"), keyStoreUri, DEFAULT_KEYSTORE_TYPE, DEFAULT_KEYSTORE_SIGALG));
        KeyManagerFactory kmFactory = SecurityUtils.buildKeyManFactory("MYPKI", "myPKI", "MYPKI");
        KeyManagerFactory.getInstance(kmFactory);
        SecurityUtils.removeKeyStore(keyStore, keyStoreUri);
    }
        
}