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
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportKeyManagerFactory()} method.
*/
class TransportKeyStoreBean_1Test {

	private static final Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_1Test.class);
	
	private static final String DEFAULT_KEYSTORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";
	
	private static final String DEFAULT_KEYSTORE_TYPE = "pkcs12";
	
	private static final String DEFAULT_KEYSTORE_PASSWORD = "changeit";
	
	private static final String DEFAULT_TRUSTSTORE_TYPE = "jks";
	
	private static final String DEFAULT_TRUSTSTORE = "file:#{ systemProperties['java.home'] }/lib/security/cacerts";
	
	private static final String DEFAULT_TRUSTSTORE_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_ALGORITHM = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_PROVIDER = "SunJSSE";
	
	private static final String DEFAULT_TRUSTSTORE_PROVIDER = "SUN";
	
	private static final String DEFAULT_KEYSTORE_ALIAS = "jnfe";
	
	private static final String DEFAULT_KEYSTORE_KEY_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_ALGORITHM = "RSA";
	
	private static final String DEFAULT_KEYSTORE_KEY_PROVIDER = "SunJSSE";
	
	private static final String DEFAULT_KEYSTORE_KEY_TYPE = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_FORMAT = "PKCS#8";
	
	private static final String DEFAULT_KEYSTORE_KEY_ENCODING = "UTF-8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_TYPE = "jks";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_PROVIDER = "SUN";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_ALGORITHM = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_ALGORITHM = "RSA";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_PROVIDER = "SunJSSE";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_TYPE = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_FORMAT = "PKCS#8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_ENCODING = "UTF-8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_TYPE = "jks";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_PROVIDER = "SUN";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_ALGORITHM = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_ALGORITHM = "RSA";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_PROVIDER = "SunJSSE";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_TYPE = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_FORMAT = "PKCS#8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_ENCODING = "UTF-8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_TYPE = "jks";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_PROVIDER = "SUN";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_ALGORITHM = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ALGORITHM = "RSA";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_PROVIDER = "SunJSSE";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_TYPE = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_FORMAT = "PKCS#8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ENCODING = "UTF-8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_TYPE = "jks";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_PROVIDER = "SUN";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_ALGORITHM = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ALGORITHM = "RSA";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_PROVIDER = "SunJSSE";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_TYPE = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_FORMAT = "PKCS#8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ENCODING = "UTF-8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_TYPE = "jks";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_PROVIDER = "SUN";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_ALGORITHM = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ALGORITHM = "RSA";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_PROVIDER = "SunJSSE";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_TYPE = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_FORMAT = "PKCS#8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ENCODING = "UTF-8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_TYPE = "jks";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_PROVIDER = "SUN";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_ALGORITHM = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ALGORITHM = "RSA";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_PROVIDER = "SunJSSE";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_TYPE = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_FORMAT = "PKCS#8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ENCODING = "UTF-8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_TYPE = "jks";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_PROVIDER = "SUN";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_ALGORITHM = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_URI = "file:#{ systemProperties['user.home'] }/jnfe.pfx";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_PASSWORD = "changeit";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ALGORITHM = "RSA";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_PROVIDER = "SunJSSE";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_TYPE = "SunX509";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_FORMAT = "PKCS#8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ENCODING = "UTF-8";
	
	private static final String DEFAULT_KEYSTORE_KEY_STORE_KEY_STORE_KEY_STORE_KEY_ST