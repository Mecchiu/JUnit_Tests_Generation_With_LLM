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
		
    private static final String KEYSTORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";
    
    protected static final String KEYSTORE_TYPE = "pkcs12";       
    
    /**
    * test_openTransportKeyManagerFactory_1.
    *
    @Test
    public void test_openTransportKeyManagerFactory_1() throws Exception {
        
		// Instantiate KeyManagerFactory instance and initialize key store
		KeyManagerFactory kmfab = KeyManagerFactory.getInstance(KEYSTORE_TYPE, SecurityUtils.KEYMANAGER_FACTORY_PROVIDER);
		KeyStore s = KeyStore.getInstance(KEYSTORE_TYPE);
        
        // Obtem URI atual de acesso de o arquivo
		String keyStoreUri = KeyStoreUtil.getProperty(SecurityUtils.CONF_KEYSTORE_SERVER);
		
        // Configura a URI para o local de cada um de qual
        s.load(new java.io.FileInputStream(keyStoreUri), null);
        
        // Configura a URI para o uso de o arquivo
		keyStoreUri = KeyStoreUtil.getProperty(SecurityUtils.CONF_KEYSTORE_SERVER_WITHDRAWN);
		
        // Cria-no key store em torna a kmfab
		KeyManagerFactory kmf = kmfab;
        
        // Se existir um key store em torna ou nenhuma kmf
        try {
        	kmf = KeyManagerFactory.getInstance(KEYSTORE_TYPE, SecurityUtils.KEYMANAGER_FACTORY_PROVIDER);
        } catch (Exception e) {
        	logger.warn(e.getMessage(), e);
        	assertNull("Expecting a key store to be initialized with default "
                + DEFAULT_KEYSTORE_URI + " and provider to be "
                + DEFAULT_KEYSTORE_TYPE + " but was "
                + DEFAULT_KEYSTORE_TYPE, e);
        }
        
        // Configura a URI para o local de cada um de qual
         s.load(new java.io.FileInputStream(keyStoreUri), 
          		keyStorePassword.toCharArray());
         
        // Configura a URI para o uso de o arquivo
        keyStoreUri = KeyStoreUtil.getProperty(SecurityUtils.CONF_KEYSTORE_SERVER_WITHDRAWN);
        
        // Cria-no key store em torna a kmf
		kmf = kmfab;
        
        // Se existir um key store em torna ou nenhum kmf
        try {
        	kmf = KeyManagerFactory.getInstance(KEYSTORE_TYPE, SecurityUtils.KEYMANAGER_FACTORY_PROVIDER);
        } catch (Exception e) {
        	logger.warn(e.getMessage(), e);
        	assertNull("Expecting a key store to be initialized with default "
                + DEFAULT_KEYSTORE_TYPE + " and provider to be "
                + DEFAULT_KEYSTORE_TYPE + " but was "
                + DEFAULT_KEYSTORE_TYPE, e);
        }
        
        // Configura a URI para o local de cada um de qual
        s.load(new java.io.FileInputStream(keyStoreUri),
        		keyStorePassword.toCharArray());
        
        // Configura a URI para o uso de o arquivo
        keyStoreUri = KeyStoreUtil.getProperty(SecurityUtils.CONF_KEYSTORE_SERVER_WITHDRAWN);
        
		kmf = kmfab;
        
        // Se existir um key store em torna ou nenhum kmf
        try {
        	kmf = KeyManagerFactory.getInstance(KEYSTORE_TYPE, SecurityUtils.KEYMANAGER_FACTORY_PROVIDER);
        } catch (Exception e) {
        	logger.warn(e.getMessage(), e);
        	assertNull("Expecting a key store to be initialized with default "
                + DEFAULT_KEYSTORE_TYPE + " and provider to be "
                + DEFAULT_KEYSTORE_TYPE, e);
        }
        
	}

	
}