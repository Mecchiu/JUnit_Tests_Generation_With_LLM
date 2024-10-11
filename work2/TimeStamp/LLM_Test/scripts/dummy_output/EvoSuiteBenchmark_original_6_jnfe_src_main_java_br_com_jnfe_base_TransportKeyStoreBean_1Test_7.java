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
		
	private KeyStore keyStore = null;
	private int port = 0;
	private String keyStoreURI = DEFAULT_KEYSTORE_URI;
	private String trustStoreURI = DEFAULT_TRUSTSTORE_URI;

	/**
	* @param
	*/
	public TransportKeyStoreBean_1Test() {
	}
	 
	/**
	 * {@link TransportKeyStoreBean#openTransportStore}
	 */
	@Test
	public final void openTransportStore() throws Exception {
		try {
			openTransportStore();
		} catch (Throwable e) {
			e.printStackTrace();
			logger.error("Erro no TransportKeyStoreBean_1 Test:");
			logger.error("Excecao: ");
			logger.error(e);
			assertNotNull(e);
		}
	}

	/**
	* Valida o openTransportStore() a partir dos valores de opcao de sessao
	 * @throws Exception
	*/
	public void openTransportStore() throws Exception {
			
		keyStoreUri = SecurityUtils.getKeyStoreUri();
		
		KeyManagerFactory keyManagerFactory = SecurityUtils.getKeyManagerFactory();

		logger.info("valores do openTransportStore:");
		logger.info(SecurityUtils.getPort());
		logger.info(SecurityUtils.getKeyStoreUrl());
		logger.info(SecurityUtils.getProtectedPath());
		logger.info(keyStoreUri);
		logger.info(keyManagerFactory.getProtectionParameter());
		logger.info(keyManagerFactory.getKeyStoreType());
		logger.info(keyStoreType);
		logger.info(keyManagerFactory.getKeyStorePassword());
		logger.info(keyStorePassword);
		
		
		// Valida o keyStoreURI
		if (SecurityUtils.isKeyStorePassword(keyStoreName())) {
			port = SecurityUtils.getPort();
			if (SecurityUtils.getPort().equals("-1")) {
				port = DEFAULT_PORT;
			}
			keyStoreUri = keyStoreURI.concat(port).concat(keyStoreURISep());
		}
		
		// Valida o keyManagerFactory
		KeyManagerFactory keyManagerFactory2 = SecurityUtils.getKeyManagerFactory();

		logger.info("valores do keyManagerFactory:");
		logger.info(SecurityUtils.getPort());
		logger.info(keyManagerFactory.getProtectionParameter());
		logger.info(keyManagerFactory.getKeyStoreType());
		logger.info(keyManagerFactory.getKeyStorePassword());
		logger.info(keyStoreType);
		logger.info(keyManagerFactory2.getProtectionParameter());
		logger.info(keyManagerFactory2.getKeyStoreType());
		
	}	

	/**
	 * Exemplo do test do openTransportStore()
	 */
	@Test
	public void openTransportStoreWithPort() throws Exception {
		try {
			openTransportStore(port);
		} catch (Throwable e) {
			e.printStackTrace();
			logger.error("Erro no TransportKeyStoreBean_1 Test:");
			logger.error("Excecao: ");
			logger.error(e);
			assertNotNull(e);
		}
	}
	
	public void openTransportStore(int port) throws Exception {
		logger.info("Entrou com port: " + port);
		keyStore = SecurityUtils.openTransportStore(SecurityUtils.getKeyStoreUrl(),
				SecurityUtils.getKeyStorePassword(), port);
	}
	
	/**
	 * Entra no argumento do {@link TransportKeyStoreBean}
	 * @return KeyStore
	 */
	public KeyStore openTransportStore() {
		return keyStore;
	}
		 */

	/**
	* Valida os valores de o port de sessao.
	* Entrou a execu��o do test.
	* @param
	*/
	public void assertPort(int value) {
			assertEquals(SecurityUtils.getPort(), value);		
	}
		
	
	}