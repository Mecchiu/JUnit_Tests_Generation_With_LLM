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
		
	private final static String DEFAULT_KEYSTORE_URI = "file:#{ systemProperties['user.home'] }/test.pfx";

	private final static String DEFAULT_KEYSTORE_TYPE = "jks";

	private final static String DEFAULT_KEYSTORE_PASSWORD = "jnfe";

	private final static String DEFAULT_TRUSTSTORE_TYPE = "jnfe";

	private final static String DEFAULT_TRUSTSTORE_ALIAS = "test1";

    private final static String DEFAULT_TRUSTSTORE_PASSWORD = "jnfe";

    private final static String DEFAULT_SECURITY_ALGORITHM = "PKCS12";

	private final static String[] DEFAULT_TRUSTSTORE_PASSWORD_FILELISTS = { "test.pem",
			"another.pem" };

	
	private String keyStoreUri;

	private String keyStoreType;

	private String keyStorePassword;

	private String trustStoreType;
	
	private String trustStore;

	private String trustStorePassword;

	
    
    public TransportKeyStoreBean_1Test() throws Exception {

		initialize(DEFAULT_TRUSTSTORE_PASSWORD_FILELISTS);
    }

    /**
    * Exemplar de teste.
    */
    @Test
    public void testExemplante() throws Exception {
			
		logger.trace("testExemplante");
		KeyManagerFactory kfm = SecurityUtils.createKeyManagerFactory(
				SecurityUtils.ALGORITHM_NONE,
				SecurityUtils.ALGORITHM_ALIAS_DIGEST);
		logger.trace(kfm.getProvider().getName());
		KeyStore keyStore = kfm.getKeyStore(this.getClass().getClassLoader(),  this.getKeyStoreType());
			
		keyStoreUri = this.getClass().getClassLoader().getResource(DEFAULT_KEYSTORE_URI).getFile();
			
		logger.trace("keyStoreUri: " + keyStoreUri);
		logger.trace("keyStoreType: " + this.getClass().getClassLoader().getResource(DEFAULT_KEYSTORE_TYPE).getFile());
		logger.trace("keyStorePassword: " + this.getClass().getClassLoader().getResource(DEFAULT_KEYSTORE_PASSWORD).getFile());
		logger.trace("trustStoreType: " + trustStoreType);
		logger.trace("trustStorePassword: " + this.getClass().getClassLoader().getResource(DEFAULT_TRUSTSTORE_PASSWORD).getFile());
		logger.trace("trustStore: " + trustStore);
		logger.trace("trustStorePassword: " + this.getClass().getClassLoader().getResource(DEFAULT_TRUSTSTORE_PASSWORD).getFile());
	}
	
	private void initialize(String[] passwods) throws Exception {
			
		logger.debug("keyStoreUri: " + this.getClass().getClassLoader().getResource(DEFAULT_KEYSTORE_URI).getFile());
		logger.debug("keyStoreType: " + this.getClass().getClassLoader().getResource(DEFAULT_KEYSTORE_TYPE).getFile());
		logger.debug("keyStorePassword: " + this.getClass().getClassLoader().getResource(DEFAULT_KEYSTORE_PASSWORD).getFile());
		logger.debug("trustStoreUri: " + this.getClass().getClassLoader().getResource(DEFAULT_TRUSTSTORE_URI).getFile());
		logger.debug("trustStoreType: " + this.getClass().getClassLoader().getResource(DEFAULT_TRUSTSTORE_TYPE).getFile());
		logger.debug("trustStorePassword: " + this.getClass().getClassLoader().getResource(DEFAULT_TRUSTSTORE_PASSWORD).getFile());
		logger.debug("trustStorePasswordFileList: " + this.getClass().getClassLoader().getResource(DEFAULT_TRUSTSTORE_PASSWORD_FILELIST).getFile());

		
}
}