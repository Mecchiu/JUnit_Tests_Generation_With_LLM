// TransportKeyStoreBeanTest.java
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
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportStore()} method.
*/
class TransportKeyStoreBeanTest {
		
	@Test
	void testOpenTransportStore() throws Exception {
		TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
		transportKeyStoreBean.setKeyStoreType("PKCS12");
		transportKeyStoreBean.setKeyStoreUri("/home/user/certificado.pfx");
		transportKeyStoreBean.setKeyStorePassword("123456");
		KeyStore keyStore = transportKeyStoreBean.openTransportStore();
		assertNotNull(keyStore);
	}
}