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
/** Test method para cria o manager de chaves do armaz�m de transporte. */
    @Test
    public void testOpenTransportKeyManagerFactory() throws Exception {
        Logger log = LoggerFactory.getLogger("test");
        KeyManagerFactory kmf = SecurityUtils.buildKeyManagerFactory(log);
        KeyManagerFactory kmf2 = SecurityUtils.buildKeyManagerFactory(log);
        assertNotNull(kmf);
        assertNotNull(kmf2);
    }
		/** Test method para abri o gerenciador de chaves do armaz�m de transporte. */
    @Test
    public void testCloneKeyManagerFactory() throws Exception {
        Logger log = LoggerFactory.getLogger("test.clone");
        KeyManagerFactory kmf = SecurityUtils.buildKeyManagerFactory(log);
        KeyManagerFactory kmf2 = SecurityUtils.buildKeyManagerFactory(log);
        assertNotNull(kmf);
        assertNotNull(kmf2);
        KeyManagerFactory kmf3 = kmf.clone();
        assertNotNull(kmf3);
        assertNotNull(kmf3);
        assertEquals(kmf, kmf3);
        assertEquals(kmf2, kmf3);
        KeyManagerFactory kmf4 = null;
        KeyManagerFactory kmf5 = null;
    }
		/** Test method o construtor da classe {@link InitialingBean}.*/
    @Test
    public void testSetBean() throws Exception {
        Logger log = LoggerFactory.getLogger("test");
        KeyManagerFactory kmf = SecurityUtils.buildKeyManagerFactory(log);
        KeyManagerFactory kmf2 = SecurityUtils.buildKeyManagerFactory(log);
        kmf2.init(null);
        kmf = SecurityUtils.buildKeyManagerFactory(log);
        log.info("Clone: {}", kmf);
        kmf = SecurityUtils.buildKeyManagerFactory(log);
        kmf3 = SecurityUtils.buildKeyManagerFactory(log);
        kmf4 = SecurityUtils.buildKeyManagerFactory(log);
        kmf5 = SecurityUtils.buildKeyManagerFactory(log);
        kmf = kmf3.clone();
        kmf2 = kmf3.clone();
        assertTrue(!isEquals(kmf, kmf2));
        assertTrue(!isEquals(kmf, kmf4));
        assertTrue(!isEquals(kmf4, kmf2));
        kmf = kmf4.clone();
        kmf = kmf3.clone();
        kmf3 = kmf;
    }

}
