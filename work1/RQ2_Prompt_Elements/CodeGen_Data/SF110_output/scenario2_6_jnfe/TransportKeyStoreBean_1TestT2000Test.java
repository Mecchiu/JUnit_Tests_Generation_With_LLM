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

    private long time = System.currentTimeMillis();
    
private  Logger logger = LoggerFactory.getLogger(TransportKeyStoreBean_1Test.class.getName());
    
    /**
     * @throws Exception
     */
    @Test
    public final void testOpenTransportKeyManagerFactory() throws Exception {
        assertNotNull(KeyStore.getInstance("keystore"));
        assertTrue(KeyStore.getInstance("keyStore") instanceof KeyManagerFactory);    
    }
    
    /**
     * @throws Exception
     */
    public void testOpenTransportKeyManagerFactoryExceptions() throws Exception {
        SecurityUtils.setKeyStorePassword(this.logger, "12345");
        logger.error("Open keyManagerFactory exceptions at testOpenTransportKeyManagerFactory()");
        assertNull(KeyStore.getInstance("keystore"));
        assertFalse(KeyStore.getInstance("keyStore") instanceof KeyManagerFactory);    
    }
   /**
     * @throws Exception
     */
    @Test
    public final void testGetKeyStorePassword() throws Exception {
        assertSame(keyStorePassword, (String) SecurityUtils.getKeyManagerFactory().getDefaultKeyManager().getPassword());
    }
    
    /**
     * @throws Exception
     */
    @Test
    public final void testGetKeyStorePwdExceptions() throws Exception {
      SecurityUtils.setKeyStorePassword(logger, "12345");
      logger.error("Open keystore password exceptions at testGetKeyStorePassword()");
      assertNull(keyStorePassword);
    }
}