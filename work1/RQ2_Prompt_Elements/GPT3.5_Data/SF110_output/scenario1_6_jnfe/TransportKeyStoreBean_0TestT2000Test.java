// Test class of TransportKeyStoreBean
package br.com.jnfe.base;

import java.security.KeyStore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for TransportKeyStoreBean.
 */
class TransportKeyStoreBeanTest {

    /**
     * Test case for opening transport store with correct parameters.
     */
    @Test
    void testOpenTransportStoreWithCorrectParameters() throws Exception {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType("JKS");
        transportKeyStoreBean.setKeyStoreUri("src/test/resources/keystore.jks");
        transportKeyStoreBean.setKeyStorePassword("password");
        KeyStore keyStore = transportKeyStoreBean.openTransportStore();
        assertNotNull(keyStore);
    }

    /**
     * Test case for opening transport store with incorrect password.
     */
    @Test
    void testOpenTransportStoreWithIncorrectPassword() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType("JKS");
        transportKeyStoreBean.setKeyStoreUri("src/test/resources/keystore.jks");
        transportKeyStoreBean.setKeyStorePassword("wrongpassword");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportStore());
    }

    /**
     * Test case for opening transport store with incorrect URI.
     */
    @Test
    void testOpenTransportStoreWithIncorrectURI() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType("JKS");
        transportKeyStoreBean.setKeyStoreUri("src/test/resources/wrongkeystore.jks");
        transportKeyStoreBean.setKeyStorePassword("password");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportStore());
    }

    /**
     * Test case for opening transport store with incorrect type.
     */
    @Test
    void testOpenTransportStoreWithIncorrectType() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType("PKCS12");
        transportKeyStoreBean.setKeyStoreUri("src/test/resources/keystore.jks");
        transportKeyStoreBean.setKeyStorePassword("password");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportStore());
    }

    /**
     * Test case for opening transport store with null type.
     */
    @Test
    void testOpenTransportStoreWithNullType() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType(null);
        transportKeyStoreBean.setKeyStoreUri("src/test/resources/keystore.jks");
        transportKeyStoreBean.setKeyStorePassword("password");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportStore());
    }

    /**
     * Test case for opening transport store with null URI.
     */
    @Test
    void testOpenTransportStoreWithNullURI() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType("JKS");
        transportKeyStoreBean.setKeyStoreUri(null);
        transportKeyStoreBean.setKeyStorePassword("password");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportStore());
    }

    /**
     * Test case for opening transport store with null password.
     */
    @Test
    void testOpenTransportStoreWithNullPassword() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType("JKS");
        transportKeyStoreBean.setKeyStoreUri("src/test/resources/keystore.jks");
        transportKeyStoreBean.setKeyStorePassword(null);
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportStore());
    }

    /**
     * Test case for opening transport store with empty type.
     */
    @Test
    void testOpenTransportStoreWithEmptyType() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType("");
        transportKeyStoreBean.setKeyStoreUri("src/test/resources/keystore.jks");
        transportKeyStoreBean.setKeyStorePassword("password");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportStore());
    }

    /**
     * Test case for opening transport store with empty URI.
     */
    @Test
    void testOpenTransportStoreWithEmptyURI() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType("JKS");
        transportKeyStoreBean.setKeyStoreUri("");
        transportKeyStoreBean.setKeyStorePassword("password");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportStore());
    }

    /**
     * Test case for opening transport store with empty password.
     */
    @Test
    void testOpenTransportStoreWithEmptyPassword() {
        TransportKeyStoreBean transportKeyStoreBean = new TransportKeyStoreBean();
        transportKeyStoreBean.setKeyStoreType("JKS");
        transportKeyStoreBean.setKeyStoreUri("src/test/resources/keystore.jks");
        transportKeyStoreBean.setKeyStorePassword("");
        assertThrows(Exception.class, () -> transportKeyStoreBean.openTransportStore());
    }
}