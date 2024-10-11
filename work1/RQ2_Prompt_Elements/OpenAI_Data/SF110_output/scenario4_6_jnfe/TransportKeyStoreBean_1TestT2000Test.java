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
	
	private TransportKeyStoreBean transportKeyStoreBean;
	
	private KeyManagerFactory keyManagerFactory;
	
	private KeyStore keyStore;
	
	private String keyStoreUri;
	
	private String keyStoreType;
	
	private String keyStorePassword;
	
	private String trustStoreType;
	
	private String trustStore;
	
	private String trustStorePassword;
	
	private String keyStoreUri_1;
	
	private String keyStoreType_1;
	
	private String keyStorePassword_1;
	
	private String trustStoreType_1;
	
	private String trustStore_1;
	
	private String trustStorePassword_1;
	
	private String keyStoreUri_2;
	
	private String keyStoreType_2;
	
	private String keyStorePassword_2;
	
	private String trustStoreType_2;
	
	private String trustStore_2;
	
	private String trustStorePassword_2;
	
	private String keyStoreUri_3;
	
	private String keyStoreType_3;
	
	private String keyStorePassword_3;
	
	private String trustStoreType_3;
	
	private String trustStore_3;
	
	private String trustStorePassword_3;
	
	private String keyStoreUri_4;
	
	private String keyStoreType_4;
	
	private String keyStorePassword_4;
	
	private String trustStoreType_4;
	
	private String trustStore_4;
	
	private String trustStorePassword_4;
	
	private String keyStoreUri_5;
	
	private String keyStoreType_5;
	
	private String keyStorePassword_5;
	
	private String trustStoreType_5;
	
	private String trustStore_5;
	
	private String trustStorePassword_5;
	
	private String keyStoreUri_6;
	
	private String keyStoreType_6;
	
	private String keyStorePassword_6;
	
	private String trustStoreType_6;
	
	private String trustStore_6;
	
	private String trustStorePassword_6;
	
	private String keyStoreUri_7;
	
	private String keyStoreType_7;
	
	private String keyStorePassword_7;
	
	private String trustStoreType_7;
	
	private String trustStore_7;
	
	private String trustStorePassword_7;
	
	private String keyStoreUri_8;
	
	private String keyStoreType_8;
	
	private String keyStorePassword_8;
	
	private String trustStoreType_8;
	
	private String trustStore_8;
	
	private String trustStorePassword_8;
	
	private String keyStoreUri_9;
	
	private String keyStoreType_9;
	
	private String keyStorePassword_9;
	
	private String trustStoreType_9;
	
	private String trustStore_9;
	
	private String trustStorePassword_9;
	
	private String keyStoreUri_10;
	
	private String keyStoreType_10;
	
	private String keyStorePassword_10;
	
	private String trustStoreType_10;
	
	private String trustStore_10;
	
	private String trustStorePassword_10;
	
	private String keyStoreUri_11;
	
	private String keyStoreType_11;
	
	private String keyStorePassword_11;
	
	private String trustStoreType_11;
	
	private String trustStore_11;
	
	private String trustStorePassword_11;
	
	private String keyStoreUri_12;
	
	private String keyStoreType_12;
	
	private String keyStorePassword_12;
	
	private String trustStoreType_12;
	
	private String trustStore_12;
	
	private String trustStorePassword_12;
	
	private String keyStoreUri_13;
	
	private String keyStoreType_13;
	
	private String keyStorePassword_13;
	
	private String trustStoreType_13;
	
	private String trustStore_13;
	
	private String trustStorePassword_13;
	
	private String keyStoreUri_14;
	
	private String keyStoreType_14;
	
	private String keyStorePassword_14;
	
	private String trustStoreType_14;
	
	private String trustStore_14;
	
	private String trustStorePassword_14;
	
	private String keyStoreUri_15;
	
	private String keyStoreType_15;
	
	private String keyStorePassword_15;
	
	private String trustStoreType_15;
	
	private String trustStore_15;
	
	private String trustStorePassword_15;
	
	private String keyStoreUri_16;
	
	private String keyStoreType_16;
	
	private String keyStorePassword_16;
	
	private String trustStoreType_16;
	
	private String trustStore_16;
	
	private String trustStorePassword_16;
	
	private String keyStoreUri_17;
	
	private String keyStoreType_17;
	
	private String keyStorePassword_17;
	
	private String trustStoreType_17;
	
	private String trustStore_17;
	
	private String trustStorePassword_17;
	
	private String keyStoreUri_18;
	
	private String keyStoreType_18;
	
	private String keyStorePassword_18;
	
	private String trustStoreType_18;
	
	private String trustStore_18;
	
	private String trustStorePassword_18;
	
	private String keyStoreUri_19;
	
	private String keyStoreType_19;
	
	private String keyStorePassword_19;
	
	private String trustStoreType_19;
	
	private String trustStore_19;
	
	private String trustStorePassword_19;
	
	private String keyStoreUri_20;
	
	private String keyStoreType_20;
	
	private String keyStorePassword_20;
	
	private String trustStoreType_20;
	
	private String trustStore_20;
	
	private String trustStorePassword_20;
	
	private String keyStoreUri_21;
	
	private String keyStoreType_21;
	
	private String keyStorePassword_21;
	
	private String trustStoreType_21;
	
	private String trustStore_21;
	
	private String trustStorePassword_21;
	
	private String keyStoreUri_22;
	
	private String keyStoreType_22;
	
	private String keyStorePassword_22;
	
	private String trustStoreType_22;
	
	private String trustStore_22;
	
	private String trustStorePassword_22;
	
	private String keyStoreUri_23;
	
	private String keyStoreType_23;
	
	private String keyStorePassword_23;
	
	private String trustStoreType_23;
	
	private String trustStore_23;
	
	private String trustStorePassword_23;
	
	private String keyStoreUri_24;
	
	private String keyStoreType_24;
	
	private String keyStorePassword_24;
	
	private String trustStoreType_24;
	
	private String trustStore_24;
	
	private String trustStorePassword_24;
	
	private String keyStoreUri_25;
	
	private String keyStoreType_25;
	
	private String keyStorePassword_25;
	
	private String trustStoreType_25;
	
	private String trustStore_25;
	
	private String trustStorePassword_25;
	
	private String keyStoreUri_26;
	
	private String keyStoreType_26;
	
	private String keyStorePassword_26;
	
	private String trustStoreType_26;
	
	private String trustStore_26;
	
	private String trustStorePassword_26;
