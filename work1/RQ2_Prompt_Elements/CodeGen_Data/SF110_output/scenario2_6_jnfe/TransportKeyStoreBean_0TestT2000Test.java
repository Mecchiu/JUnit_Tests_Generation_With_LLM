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

	/** The Constant LOG. */
	private final static transient Logger LOG = LoggerFactory.getLogger(TransportKeyStoreBean_0Test.class);
	
	/**
	* Test null keystoreType.
	*/
	@Test
	public void testJNFE_01NullKeystoreType() {
		
		assertNull(SecurityUtils.getKeyStoreType(null));
	}
	
	/**
	* Test null keystoreUri.
	*/
	@Test(expected=IllegalArgumentException.class)
	public void testJNFE_02NullKeystoreUri() {
		
		SecurityUtils.buildKeyStore(null, null);
	}
	
	/**
	* Test null keystorePassword.
	*/
	@Test(expected=IllegalArgumentException.class)
	public void testJNFE_03NullKeystorePassword() {
		
		SecurityUtils.buildKeyStore(null, null);
	}
	
	/**
	* Test keystoreUri.
	*/
	@Test
	public void testJNFE_04KeystoreUri() {
		
		String keystoreUri = "jndi";
		String keystorePassword = "password";
		KeyStore keyStore;

		
		try {
			keyStore = SecurityUtils.buildKeyStore(keystoreType, keystoreUri, keystorePassword.toCharArray());
		} catch (Exception e) {
			LOG.error("Invalid keystore", e);
			fail();
		}
		assertEquals("The type of keystore is not correct", keystoreType, keyStore.getType());
		assertEquals("The uri of keystore is not correct", keystoreUri, keyStore.getKeyManagers().get(0).getKeyAlias());
		assertEquals("The password of keystore is not correct", keystorePassword, SecurityUtils.getKeyStorePassword(keyStore));
		
	}
	
	/**
	* Test keystorePassword.
	*/
	@Test
	public void testJNFE_05KeystorePassword() {
		
		String keystorePassword = "password";
		KeyStore keyStore;
		try {
			keyStore = SecurityUtils.buildKeyStore(keyStoreType, "jndiname", keystorePassword.toCharArray());
		} catch (Exception e) {
			LOG.error("Invalid keystore", e);
			fail();
		}
		assertEquals("The type of keystore is not correct", keyStoreType, keyStore.getType());
		assertEquals("The password of keystore is not correct", keystorePassword, SecurityUtils.getKeyStorePassword(keyStore));

	}
	/**
	* Test keyStore.
	*/
	@Test
	public void testJNFE_06KeyStore() {
		
		KeyStore keyStore;
		String keyStoreUri;
		
		try {
			keyStore = SecurityUtils.buildKeyStore("JNFE", null, null);
		} catch (Exception e) {
			LOG.error("Invalid keystore", e);
			fail();
		}
		try {
			keyStoreUri = SecurityUtils.buildKeyStore(keyStoreType, "", keyStorePassword.toCharArray());
		} catch (Exception e) {
			LOG.error("Invalid keystore", e);
			fail();
		}
		assertEquals("The type of keystore is not correct", keyStoreType, keyStore.getType());
		assertNull("The uri of the keystore is not valid", keyStoreUri);

	}
	
	/**
	* Test keyStorePassword.
	*/
	@Test
	public void testJNFE_07KeyStorePassword() {
		KeyStore keyStore;
		String keyStoreUri;
		
		try {
			keyStore = SecurityUtils.buildKeyStore(null, null, null);
		} catch (Exception e) {
			LOG.error("Invalid keystore", e);
			fail();
		}
		try {
			keyStoreUri = SecurityUtils.buildKeyStore(null, null, null);
		} catch (Exception e) {
			LOG.error("Invalid keystore", e);
			fail();
		}
		assertEquals("The type of keystore is not correct", keyStoreType, keyStore.getType());
		assertNull("Keystore password is null", SecurityUtils.getKeyStorePassword(keyStore));
		
	}
	/**
	* Test keyStoreType.
	*/
	@Test
	public void testJNFE_08KeystoreType() {
		
		SecurityUtils.buildKeyStore("JNFE", keyStoreType, keyStorePassword.toCharArray());
	}
	/**
	* Test null keystoreUri.
	*/
	@Test(expected=IllegalArgumentException.class)
	public void testJNFE_09NullKeystoreUri() {
		
		SecurityUtils.buildKeyStore(null, keyStoreType, keyStorePassword.toCharArray());
	}
	/**
	* Test null keystorePassword.
	*/
	@Test(expected=IllegalArgumentException.class)
	public void testJNFE_10NullKeystorePassword() {
		
		SecurityUtils.buildKeyStore(null, null, null);
	}
	/**
	* Test null keystoreUri.
	*/
	@Test(expected=IllegalArgumentException.class)
	public void testJNFE_11NullKeystoreUri() {
		
		SecurityUtils.buildKeyStore(null, null);
	}
	/**
	* Test null keystorePassword.
	*/
	@Test(expected=IllegalArgumentException.class)
	public void testJNFE_12NullKeystorePassword() {
		
		SecurityUtils.buildKeyStore(null, keyStoreType, "password");
	}
}
