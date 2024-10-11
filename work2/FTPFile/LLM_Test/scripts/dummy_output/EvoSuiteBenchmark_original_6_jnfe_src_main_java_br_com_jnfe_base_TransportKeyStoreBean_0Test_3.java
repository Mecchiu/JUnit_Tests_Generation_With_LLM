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
		private final KeyStore keyStore = new JNFEKeyStore();
		private final KeyManagerFactory keyManagerFactory = new JNFEKeyManagerFactory();
		private final KeyStore trustedKeyStore = new JNFEKeyStore();
		private final KeyManagerFactory trustedKeyManagerFactory = new JNFEKeyManagerFactory();

        private JNFEKeyStore_0 testKeyStore;
        private JNFEKeyManager_0 testKeyManagerFactory;

        /**
         * Test of openTransportStore method, of class javax.net.ssl.TrustManagerFactoryImpl.
         *
         */
        @Test
        public void testOpenTransportStore() throws Exception {

        	trustedKeyManagerFactory = new JNFEKeyManagerFactory();
        	trustedKeyManagerFactory.init(SecurityUtils.getPass(SecurityUtils.PASS));

        	keyManagerFactory.init(SecurityUtils.DEFAULT_KEYMANAGER_PASS);
        	TrustedTrustManager trustManager = new TrustedTrustManager();
        	trustManager.init(trustedKeyManagerFactory);
        	
        	/**
         	 * Test of openTransportStore method, of class javax.net.ssl.TrustManagerFactoryImpl.
         	 *
         	 * @throws Exception
         	 */

        	testKeyStore.init(testKeyManagerFactory, DEFAULT_KEYSTORE_URI, DEFAULT_KEYSTORE_PASS);
        	assertTrue("keyStore is not open yet",!TestTrustManager.isOpen(trustManager));
        	assertTrue("keyManager factory is not open yet",!TestTrustManager.isOpen(trustManagerFactory));
        	assertEquals("trust manager instance is not of type " + JNFEKeyManagerFactory.TYPE + " " + trustManager.toString(),
        			  TestTrustManager.JNFE_TYPE, trustManager.getClass().getName());
        	assertEquals("keyManager factory instance is not of type " + JNFEKeyManagerFactory.TYPE + " " + trustManagerFactory.toString(),
        			  TestTrustManager.JNFE_TYPE, trustedKeyManagerFactory.getClass().getName());
        	
        	testKeyManagerFactory.deInit();
        	testKeyManagerFactory.deInit();

        	/**
         	 * Test of openTransportStore method, of class javax.net.ssl.TrustManagerFactoryImpl.
         	 *
         	 */
        	keyManagerFactory.deInit();
        	keyManagerFactory.deInit();
        	keyManagerFactory.deInit();

}
}