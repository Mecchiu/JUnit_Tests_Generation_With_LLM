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
		
  //
  // Tests

  @Test
  public void testClone() throws Exception {
    KeyStore s = createTestStore("/trustedkey.jks");
    TransportKeyStoreBean tb = new TransportKeyStoreBean();
    tb.setKeyStoreUri("file:/trustedkey.jks");
    tb.setKeyStoreType(TrustStoreType.JKS);
    tb.setTrustStore(s);
    tb.setTrustStorePassword("abcd");
    tb.setKeyStorePassword(SecurityUtils.PW);
    tb.setTrustStoreType(KeyStoreType.JKS);
    tb.setTrustStoreType(TrustStoreType.TRUSTSTORE_PASSWORD);
    tb.setTrustStorePassword("abcd");
    tb.setProperty(SecurityUtils.USER_PROPERTY, "value");
    tb.setProperty(SecurityUtils.KEY_PROPERTY, "pass");
    assertNotNull(tb.getCopy());
  }
	
}