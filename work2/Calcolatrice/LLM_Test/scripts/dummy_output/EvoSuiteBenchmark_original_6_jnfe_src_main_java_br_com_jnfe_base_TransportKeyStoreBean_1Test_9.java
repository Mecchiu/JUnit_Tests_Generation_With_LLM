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
     * Simple tests for {@link TransportKeyStoreBean#openTransportStore()}.
     */
    @Test
    void openTransportStoreSimple () {
        final String keyStoreUri = "file:/tmp/pass.jnfe.pfx";
        final String keyStorePassword = "file:pass.jnfe.pfx";
        final KeyStore.TrustedCertificateEntry trustStoreEntry = new KeyStore.TrustedCertificateEntry(DEFAULT_KEYSTORE_TYPE, DEFAULT_KEYSTORE_URI);
        final KeyManagerFactory kmf = SecurityUtils.getKeyManagerFactory(keyStorePassword, keyStoreUri);
        
        final KeyStore keyStore = SecurityUtils.openKeyStore(kmf, "0", false);
        keyStore.setTrustedCertificateEntry(trustStoreEntry);
        assertNotNull("keystore", keyStore);
        
        final KeyManagerFactory ckmf = SecurityUtils.getKeyManagerFactory(NULL_STRING, keyStoreUri);
        assertNotNull("keyManager.factory", ckmf);
        
        final KeyStore keyStore2 = SecurityUtils.openKeyStore(kmf, "2", false);
        assertNotNull("keystore2", keyStore2);
        
        final KeyManagerFactory cmf = SecurityUtils.getKeyManagerFactory(NULL_STRING, NULL_STRING);
        assertNotNull("kmf.factory", cmf);
    }
    
    /**
     * Simple tests for {@link TransportKeyStoreBean#openTransportKeyManagerFactory()}.
     */
    @Test
    void openTransportKeyManagerFactorySimple () {
        final String keyStoreType = "pkcs12";
        final String keyStoreUri = "file:/tmp/pass.jnfe.pfx";
        final String keyStorePassword = "file:pass.jnfe.pfx";
        final KeyStore.TrustedCertificateEntry trustStoreEntry = new KeyStore.TrustedCertificateEntry(keyStoreType, DEFAULT_KEYSTORE_TYPE);
        final KeyManagerFactory kmf = SecurityUtils.getKeyManagerFactory(keyStorePassword, keyStoreUri);
        
        final KeyManagerFactory ckmf = SecurityUtils.getKeyManagerFactory(NULL_STRING, keyStoreUri);
        assertNotNull("keyManager.factory", ckmf);
    }
    
}