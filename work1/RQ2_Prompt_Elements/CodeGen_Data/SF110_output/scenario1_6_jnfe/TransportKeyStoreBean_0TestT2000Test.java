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

    /** Logger. */
    private final Logger LOG = LoggerFactory.getLogger(TransportKeyStoreBean_0Test.class);
    
    private final String keyStoreUri = "test.jks";
    private final String keyStoreType = "JKS";
    private final String keyStorePassword = "kms";
    
    /**
     * Inits the static fields to initialize.
     * @throws Exception
     */
	@Test
    public void initialiseDefault() throws Exception {
    	LOG.info("default constructor");
        TransportKeyStoreBean transport = new TransportKeyStoreBean();
        assertNotNull(transport.getKeyStore());
        assertNotNull(transport.getKeyStoreUri());
        assertNotNull(transport.getKeyStoreType());
        assertNotNull(transport.getKeyStorePassword());
        assertNotNull(transport.openTransportStore());

        LOG.info("Initializing SSL context with new key store.");

        KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
        kmf.init(keyStore, keyStorePassword.toCharArray());
		KeyStore keyStore2 = kmf.getKeyManagers().get(0).getKeyStore();
        assertNotNull(keyStore2);
        //assertNotNull("Keystore is null.",keyStore);

        LOG.info("Keystore is: {}", keyStore);
        LOG.info("Keystore type is: {}", keyStore.getType());
        LOG.info("Keystore password is: {}", keyStore.getPassword());

        // assertEquals("Keystore has not the same type", "JKS", keyStore.getType());
        // assertEquals("Keystore has not the same password", "kms", keyStore.getPassword());

        assertNotNull(keyStore2);
        assertEquals("Keystore is wrong type", "JKS", keyStore2.getType()); 
        assertEquals("Password is wrong", keyStorePassword, keyStore2.getPassword());


    }

    /**
     * Tear down.
     */
    @Test
    public void tearDown() {
        TransportKeyStoreBean transport = new TransportKeyStoreBean();
        transport.closeTransportStore();
        
    }
    
    /**
     * Test of save and setProperty method, of class TransportKeyStore.
     *
     * @throws Exception
     */
    @Test
    public void testSaveAndSetProperty() throws Exception {
        LOG.info("test save and set property");
        try{
            TransportKeyStoreBean instance = new TransportKeyStoreBean();
            instance.setKeyStorePassword("kms");
            instance.setKeyStorePassword("kms");
            instance.openTransportStore();
            Object[] values = { instance.getKeyStorePassword().toCharArray() };
            instance.setProperty("keystorepassword",values);
            
            assertNull("Unable to store the property",instance.getProperty("somekey"));
            instance.setProperty("keystorepassword",values);
            
            assertNotNull("Unable to find the property",instance.getPropertie("somekey"));
            assertNotNull("Property not set",instance.getProperty("keystorepassword"));

        }
        catch (Exception ex) {
            LOG.error("Unexpected exception.", ex);
            fail("Exception in testSaveAndSetProperty");
        }
    }

})
