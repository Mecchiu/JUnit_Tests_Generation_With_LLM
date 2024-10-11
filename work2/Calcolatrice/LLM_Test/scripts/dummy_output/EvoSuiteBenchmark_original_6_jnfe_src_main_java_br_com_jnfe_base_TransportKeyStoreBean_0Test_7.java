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
* It contains one unit test case for the {@link TransportKeyStoreBean#openTransportStore()} method.
*/
class TransportKeyStoreBean_0Test {
		
    @Test
    public void testTransportStore() throws Exception {
        KeyStore keyStore = openTransportStore();
        try {
            String storeUri = System.setProperty("user.home", "C:/Users/Paulo");
            logger.info("keyStoreURI: "+ storeUri);
            assertNotNull(storeUri);
            assertEquals(5, keyStore.size());
        } finally {
            SecurityUtils.cleanse(keyStore);
        }
    }
    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
}
/**
* Test of createTransportSecurity.
*/
public class TransportKeyStoreBean_1Test {

    @Test
    public void transportKeyStoreTest() {
        KeyStore keyStore = openTransportStore();
        try {
            SecurityUtils.cleanse(keyStore);
            System.out.println("transportKeyStoreTest");
            logger.info("transportKeyStoreTest");
        } finally {
            SecurityUtils.cleanse(keyStore);
        }
    }
}