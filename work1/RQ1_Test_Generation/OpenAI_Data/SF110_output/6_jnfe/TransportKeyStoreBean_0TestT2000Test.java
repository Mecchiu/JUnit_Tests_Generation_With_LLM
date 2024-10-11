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
* It contains ten unit test cases for the {@link TransportKeyStoreBean#openTransportStore()} method.
*/
class TransportKeyStoreBean_0Test {

	private static final Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_0Test.class);
	
	private TransportKeyStoreBean transportKeyStoreBean;
	
	@Test
	void testOpenTransportStore_0() throws Exception {
		transportKeyStoreBean = new TransportKeyStoreBean();
		transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
		transportKeyStoreBean.setKeyStoreType("pkcs12");
		transportKeyStoreBean.setKeyStorePassword("changeit");
		transportKeyStoreBean.setTrustStoreType("jks");
		transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
		transportKeyStoreBean.setTrustStorePassword("changeit");
		transportKeyStoreBean.afterPropertiesSet();
		KeyStore result = transportKeyStoreBean.openTransportStore();
		assertNotNull(result);
	}
	
	@Test
	void testOpenTransportStore_1() throws Exception {
		transportKeyStoreBean = new TransportKeyStoreBean();
		transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
		transportKeyStoreBean.setKeyStoreType("pkcs12");
		transportKeyStoreBean.setKeyStorePassword("changeit");
		transportKeyStoreBean.setTrustStoreType("jks");
		transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
		transportKeyStoreBean.setTrustStorePassword("changeit");
		transportKeyStoreBean.afterPropertiesSet();
		KeyStore result = transportKeyStoreBean.openTransportStore();
		assertNotNull(result);
	}
	
	@Test
	void testOpenTransportStore_2() throws Exception {
		transportKeyStoreBean = new TransportKeyStoreBean();
		transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
		transportKeyStoreBean.setKeyStoreType("pkcs12");
		transportKeyStoreBean.setKeyStorePassword("changeit");
		transportKeyStoreBean.setTrustStoreType("jks");
		transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
		transportKeyStoreBean.setTrustStorePassword("changeit");
		transportKeyStoreBean.afterPropertiesSet();
		KeyStore result = transportKeyStoreBean.openTransportStore();
		assertNotNull(result);
	}
	
	@Test
	void testOpenTransportStore_3() throws Exception {
		transportKeyStoreBean = new TransportKeyStoreBean();
		transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
		transportKeyStoreBean.setKeyStoreType("pkcs12");
		transportKeyStoreBean.setKeyStorePassword("changeit");
		transportKeyStoreBean.setTrustStoreType("jks");
		transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
		transportKeyStoreBean.setTrustStorePassword("changeit");
		transportKeyStoreBean.afterPropertiesSet();
		KeyStore result = transportKeyStoreBean.openTransportStore();
		assertNotNull(result);
	}
	
	@Test
	void testOpenTransportStore_4() throws Exception {
		transportKeyStoreBean = new TransportKeyStoreBean();
		transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
		transportKeyStoreBean.setKeyStoreType("pkcs12");
		transportKeyStoreBean.setKeyStorePassword("changeit");
		transportKeyStoreBean.setTrustStoreType("jks");
		transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
		transportKeyStoreBean.setTrustStorePassword("changeit");
		transportKeyStoreBean.afterPropertiesSet();
		KeyStore result = transportKeyStoreBean.openTransportStore();
		assertNotNull(result);
	}
	
	@Test
	void testOpenTransportStore_5() throws Exception {
		transportKeyStoreBean = new TransportKeyStoreBean();
		transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
		transportKeyStoreBean.setKeyStoreType("pkcs12");
		transportKeyStoreBean.setKeyStorePassword("changeit");
		transportKeyStoreBean.setTrustStoreType("jks");
		transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
		transportKeyStoreBean.setTrustStorePassword("changeit");
		transportKeyStoreBean.afterPropertiesSet();
		KeyStore result = transportKeyStoreBean.openTransportStore();
		assertNotNull(result);
	}
	
	@Test
	void testOpenTransportStore_6() throws Exception {
		transportKeyStoreBean = new TransportKeyStoreBean();
		transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
		transportKeyStoreBean.setKeyStoreType("pkcs12");
		transportKeyStoreBean.setKeyStorePassword("changeit");
		transportKeyStoreBean.setTrustStoreType("jks");
		transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
		transportKeyStoreBean.setTrustStorePassword("changeit");
		transportKeyStoreBean.afterPropertiesSet();
		KeyStore result = transportKeyStoreBean.openTransportStore();
		assertNotNull(result);
	}
	
	@Test
	void testOpenTransportStore_7() throws Exception {
		transportKeyStoreBean = new TransportKeyStoreBean();
		transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
		transportKeyStoreBean.setKeyStoreType("pkcs12");
		transportKeyStoreBean.setKeyStorePassword("changeit");
		transportKeyStoreBean.setTrustStoreType("jks");
		transportKeyStoreBean.setTrustStore("file:#{ systemProperties['java.home'] }/lib/security/cacerts");
		transportKeyStoreBean.setTrustStorePassword("changeit");
		transportKeyStoreBean.afterPropertiesSet();
		KeyStore result = transportKeyStoreBean.openTransportStore();
		assertNotNull(result);
	}
	
	@Test
	void testOpenTransportStore_8() throws Exception {
		transportKeyStoreBean = new TransportKeyStoreBean();
		transportKeyStoreBean.setKeyStoreUri("file:#{ systemProperties['user.home'] }/jnfe.pfx");
		transportKeyStoreBean.setKeyStoreType("pkcs12");
		transportKeyStoreBean.setKeyStorePassword("changeit");
		transportKeyStoreBean.setTrustStoreType("jks");
	