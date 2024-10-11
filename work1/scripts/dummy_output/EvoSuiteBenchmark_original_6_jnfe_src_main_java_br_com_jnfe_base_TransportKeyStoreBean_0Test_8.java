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
		
	private final static String PASSWORD1_ENCODE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * @throws java.lang.Exception
     */
    @Test
    void initTransportKeyStore() throws Exception {
        KeyStore keyStore = SecurityUtils.setPassPassword(DEFAULT_KEYSTORE_TYPE, DEFAULT_KEYSTORE_PASSWORD);
        KeyManagerFactory keyManagerFactory = SecurityUtils.setKeyPassword(DEFAULT_KEYSTORE_TYPE, PASSWORD1_ENCODE);

        // open transport store
        KeyStore openedStore = SecurityUtils.openTransportStore(DEFAULT_KEYSTORE_TYPE, DEFAULT_KEYSTORE_PASSWORD, keyManagerFactory);

        assertNotNull(openedStore);
        logger.debug( openedStore.toString() );

        // ensure security info is preserved
        assertEquals(keyStore.getCertificateEntry(SecurityUtils.CRYPTO_CERT_NAME).getSubjectDN().toString(),
                    keyManagerFactory.getKeyManagers().iterator().next().getTrustedCertificates().iterator()
                           .next().getSubjectDN().toString());
    }
}