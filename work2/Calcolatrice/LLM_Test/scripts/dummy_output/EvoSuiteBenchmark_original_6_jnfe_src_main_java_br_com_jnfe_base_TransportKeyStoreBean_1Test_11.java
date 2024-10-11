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
		
	private final static String DEFAULT_TRUSTSTORE_URI = "file:#{ systemProperties['user.home'] }/jce.p12";

	private final static String DEFAULT_TRUSTSTORE_TYPE = "PKCS12";

	private String trustStoreUri;

	private String trustStoreType;

	private String trustStorePassword;


//	@BeforeMethod
	@Before
	public void setUp() throws Exception {
		SecurityUtils.reset();
	}

	/**
	* Test method for {@link TransportKeyStoreBean#openTransportStore()}.
	*/
	@Test
	void openTransportStore_ShouldOpenTheKeyStoreFromFile() throws Exception {
        KeyStore keyStore = openTransportStore();
		
        assertGetKeyStore("file#{ systemProperties['keyStore'] }").isEqualTo(keyStoreUri);
	}

	/**
	* Test method for {@link TransportKeyStoreBean#openTransportKeyManagerFactory()}.
	*/
	@Test
	void openTransportKeyManagerFactory_ShouldOpenTheKeyManagerFactoryForTrustedKeyStore() throws Exception {
		KeyManagerFactory keyManagerFactory = openTransportKeyManagerFactory();
		assertGetKeyManager(DEFAULT_TRUSTSTORE_TYPE).isEqualTo(keyManagerFactory.getKeyManagers()[0]);
	}
	
	@Test
	void init_ShouldCreateKeyStore() throws Exception {
		KeyStore keyStore = KeyStore.getInstance("PKS128", "SC");
		openTransportStore();
		KeyStore keyStore2 = KeyStore.getInstance("PKS128", DEFAULT_KEYSTORE_TYPE);
		keyStore.init(null, new String[] { getKeyStorePassword().toCharArray() }, null);
		assertGetKeyStore(DEFAULT_TRUSTSTORE_TYPE).isEqualTo(keyStoreUri);
		assertGetKeyManager(DEFAULT_TRUSTSTORE_TYPE).isEqualTo(keyManagerFactory.getKeyManagers()[0]);
		assertGetKeyStore(DEFAULT_TRUSTSTORE_TYPE).isEqualTo(keyStore2.getKey(DEFAULT_KEYSTORE_URI, new char[0]).getEncoded());
	}
}

// class
// {
//     private static final String DEFAULT_TRUSTSTORE_TYPE = "PKCS12";
//     
//     private static final String DEFAULT_KEYSTORE_TYPE = "file";
//     private static final String DEFAULT_KEYSTORE_URI = "file:#{ systemProperties['user.home'] }/jce.p12";
//     
//     private KeyStore keyStore = null;
//     
//     private KeyManagerFactory keyManagerFactory;
// }