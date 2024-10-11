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

	private static final String USER_HOME = "user.home";

	/**
	* Teste ao abrir o armaz�m do armaz�m (cacerts) de transporte.
	*
	* @throws Exception
	*/
	@Test
	public void test() throws Exception{
			
		KeyStore ks = this.delegate.openTransportStore();
		KeyManagerFactory kmf = this.delegate.openTransportKeyManagerFactory();
		
		assertNotNull("Keystore empregado",ks);
	}
	
	private static final X509TrustManager nullTrustManager = 
			SecurityUtils.nullTrustManager;
	
	/**
	* Testa ao abrir o armaz�m de transporte s/o de mensagens do web services e
	* @throws Exception 
	*/
	@Test
	public void testNullWebServices() throws Exception{
		
		if (nullTrustManager instanceof X509TrustManager) {
			System.err.println(
					"The null manager does not implement the interface X509TrustManager, a test failed");
			System.exit(-1);
		}
		
		KeyStore ks = null;
		KeyManagerFactory kmf = null;
		try {
			ks = this.delegate.openTransportStore();
			kmf = this.delegate.openTransportKeyManagerFactory();
		} catch (Exception e) {
			assertTrue(e instanceof NullPointerException);
		}
		
		assertNotNull("Keymanager empregado", kmf);
	}

}

