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
         * Localiza�� o arquivo deste test.
         *
         * @throws Exception
         */
        @Test
        public void setUp() throws Exception {
                KeyManagerFactory kmf = null;
                KeyStore ks = null;
                KeyManager[] km = null;
                try {
                        kmf = KeyManagerFactory.getInstance("SunX509");
                        km = kmf.getKeyManagers();
                        logger.info("key store type = {}", System.getProperty("keyStore.type"));
                        KeyStoreManager manager = (KeyStoreManager)km[0];
                        KeyStore ks2 = manager.getKeyStore();
                        KeyStore ks3 = SecurityUtils.getKeyStore(DEFAULT_KEYSTORE_TYPE, DEFAULT_KEYSTORE_URI);
                        SecurityUtils.setKeyStore(DEFAULT_KEYSTORE_TYPE, DEFAULT_KEYSTORE_URI, DEFAULT_KEYSTORE_PASSWORD, DEFAULT_X509_TRUSTSTORE_TYPE, DEFAULT_X509_TRUSTSTORE_PASSWORD);
                        KeyStore ks4 = SecurityUtils.getKeyStore(DEFAULT_KEYSTORE_TYPE, DEFAULT_KEYSTORE_URI);
                } finally {
                        if (ksc!=null) {
                                ks.close();
                                ks = null;
                        }
                        SecurityUtils.setKeyStore(DEFAULT_KEYSTORE_TYPE, DEFAULT_KEYSTORE_URI, DEFAULT_KEYSTORE_PASSWORD, DEFAULT_X509_TRUSTSTORE_TYPE, DEFAULT_X509_TRUSTSTORE_PASSWORD);
                        if (kmf==null) {
                                ks2 = ks3;
                                ks3 = null;
                        }
                }
        }
        
        /**
         * Test of close method, of type default in the {@link TransportKeyStoreBean}.
         */
        @Test
        public void testClose_1() {
                TransportKeyStoreBean b = null;

                try {
                        if (logger.isDebugEnabled()) logger.debug("close");
                        KeyStore ks = null;
                                  ks = ((KeyStoreManager)ks3).getKeyStore();
                        b = new TransportKeyStoreBean();
                        b.setKeyStoreUri(DEFAULT_KEYSTORE_URI);
                        b.setKeyStoreType(DEFAULT_KEYSTORE_TYPE);
                        b.setKeyStorePassword(DEFAULT_KEYSTORE_PASSWORD);
                        b.setTrustStoreType(DEFAULT_X509_TRUSTSTORE_TYPE);
                        b.setTrustStorePassword(DEFAULT_X509_TRUSTSTORE_PASSWORD);
                        b.openTransportStore();
                        assertNotNull("KeyStore instance", ks);
                        assertEquals("getCertificate", 2, SecurityUtils.getCertificateCount(ks));
                } finally {
                        b.close();
                        SecurityUtils.setKeyStore(DEFAULT_KEYSTORE_TYPE, keyStoreType, keyStorePassword, keyStoreUri,trustStore, trustStorePassword); //,trustStorePassword);
                }
        }
        
        /**
         * Test of initialize method, of type default in the {@link TransportKeyStoreBean}.
         */
        @Test
        public void testInitialized() {
                TransportKeyStoreBean b = null;

}
}