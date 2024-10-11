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
    
    private static final String KEY_STORE_PASSWORD = "password";
    
    @Test
    void testOpenTransportKeyManagerFactory() throws Exception {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStorePassword(KEY_STORE_PASSWORD);
        KeyManagerFactory keyManagerFactory = transportKeyStoreBean.openTransportKeyManagerFactory();
        assertNotNull(keyManagerFactory);
    }
    
    @Test
    void testOpenTransportKeyManagerFactoryWithInvalidPassword() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStorePassword("invalid_password");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportKeyManagerFactory());
    }
    
    @Test
    void testOpenTransportKeyManagerFactoryWithNullPassword() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStorePassword(null);
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportKeyManagerFactory());
    }
    
    @Test
    void testOpenTransportKeyManagerFactoryWithEmptyPassword() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStorePassword("");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportKeyManagerFactory());
    }
    
    @Test
    void testOpenTransportKeyManagerFactoryWithInvalidKeyStore() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStorePassword(KEY_STORE_PASSWORD);
        transportKeyStoreBean.setTransportKeyStore(null);
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportKeyManagerFactory());
    }
    
    @Test
    void testOpenTransportKeyManagerFactoryWithInvalidKeyStoreType() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStorePassword(KEY_STORE_PASSWORD);
        transportKeyStoreBean.setTransportKeyStoreType("invalid_type");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportKeyManagerFactory());
    }
    
    @Test
    void testOpenTransportKeyManagerFactoryWithInvalidKeyManagerFactoryAlgorithm() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStorePassword(KEY_STORE_PASSWORD);
        transportKeyStoreBean.setKeyManagerFactoryAlgorithm("invalid_algorithm");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportKeyManagerFactory());
    }
    
    @Test
    void testOpenTransportKeyManagerFactoryWithInvalidKeyStoreProvider() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStorePassword(KEY_STORE_PASSWORD);
        transportKeyStoreBean.setTransportKeyStoreProvider("invalid_provider");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportKeyManagerFactory());
    }
    
    @Test
    void testOpenTransportKeyManagerFactoryWithValidKeyStoreType() throws Exception {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStorePassword(KEY_STORE_PASSWORD);
        transportKeyStoreBean.setTransportKeyStoreType("JKS");
        KeyManagerFactory keyManagerFactory = transportKeyStoreBean.openTransportKeyManagerFactory();
        assertNotNull(keyManagerFactory);
    }
    
    @Test
    void testOpenTransportKeyManagerFactoryWithValidKeyManagerFactoryAlgorithm() throws Exception {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStorePassword(KEY_STORE_PASSWORD);
        transportKeyStoreBean.setKeyManagerFactoryAlgorithm("SunX509");
        KeyManagerFactory keyManagerFactory = transportKeyStoreBean.openTransportKeyManagerFactory();
        assertNotNull(keyManagerFactory);
    }
}