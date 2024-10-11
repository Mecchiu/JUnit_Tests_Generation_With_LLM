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
	 * A URI para a keystore usada para autenticar o transporte.
	 */
	String keyStoreUri;
	
	/**
	 * O tipo de keystore empregado para o transporte.
        */                        
	String keyStoreType;
    
	/**
	 * A senha para acesso ao keystore empregado para o transporte.
	 */
	String keyStorePassword;
	
	/**
	 * Localiza��o do aramz�m seguro (cacerts).
	 */
	KeyStore keyStore;
	
	/**
	 * Uma chave para ser armazenada na localizacao do Armaz�m da nfe
	 *
	 */
	String keyStorePassword;
	
	@Test
	public void getKeyStore() throws Exception {
		SecurityUtils.testKeyStoreCreation();
		
		keyStore = TransportKeyStoreBean.openTransportStore();
		
		assertNotNull(keyStore);
		keyStorePassword = (String) keyStore.getProperty("COPY");
		assertNotNull(keyStorePassword);
		keyStorePassword = keyStorePassword.toLowerCase();
		assertTrue("keyStorePassword do Servi�o n�o aleyado", keyStorePassword.length()>3);
	}

	@Test
	public void getKeyStoreType() throws Exception {
		SecurityUtils.testKeyStoreCreation();
		
		keyStoreType = TransportKeyStoreBean.openTransportStoreType();
		
		assertNotNull(keyStoreType);
		keyStoreType = keyStoreType.toLowerCase();
		assertTrue("keyStoreType do Servi�o n�o aleyado", keyStoreType.length()>2);
	}
	
	@Test
	public void trustStore() throws Exception {
		SecurityUtils.testKeyStoreCreation();
		
		keyStore = TransportKeyStoreBean.openTransportStore();
		
		assertNotNull(keyStore);
		
		logger.info("Retornado KeyStore UMA CHE LO QUE FOI REMOVIDO: " + SecurityUtils.toByteArray(keyStore));
		
		keyStorePassword = keyStore.getProperty("COPY");
		assertNotNull(keyStorePassword);
	}

	@Test
	public void trustStoreType() throws Exception {
		SecurityUtils.testKeyStoreCreation();
		
		keyStoreType = TransportKeyStoreBean.openTransportStoreType();
		
		assertNotNull(keyStoreType);
		keyStoreType = keyStoreType.toLowerCase();
		assertTrue("keyStoreType do Servi�o n�o aleyado", keyStoreType.length()>3);
	}
	
	@Test
	public void trustStorePassword() throws Exception {
		SecurityUtils.testKeyStoreCreation();
		
		keyStorePassword = keyStore.getProperty("COPY");
		assertNotNull(keyStorePassword);
		
		securityUtil = new SecurityUtils();
		logger.info("Usuario foi: " + keyStorePassword);
		assertEquals(keyStorePassword,securityUtil.obtWidwPwd(keyStorePassword));
	}

	private Logger logger;
	private KeyManagerFactory keyManagerFactory;
	private KeyManagerFactory badKeyManagerFactory;
	private KeyManagerFactory badKeyManagerFactory2;

	private SecurityUtils securityUtil;


}