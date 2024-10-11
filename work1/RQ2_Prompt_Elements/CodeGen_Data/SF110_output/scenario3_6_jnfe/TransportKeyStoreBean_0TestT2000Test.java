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

    private final static Logger LOG = LoggerFactory.getLogger(TransportKeyStoreBean_0Test.class);
    
    /**
     * Test method for {@link br.com.jnfe.base.TransportKeyStoreBean#openTransportStore()}.
    */
    @Test
    public void testOpenTransportStore() throws Exception {
    	
		// Valida o sistema que ser�o utilizado por NFe
			KeyStore transstore = SecurityUtils.transStore;
			
		// Verifica o sistema que com o key manager esse
        KeyManagerFactory keyMf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        int defaultDepth = keyMf.getDefaultKeyManager().getKeyLoadPathname.charAt(0);
        if (defaultDepth!= 1) {
            LOG.error("Sistema de transmiss�o se n�o acept�o o sistema de acertar. Depende da chave especifica");
        }
			
        // Verifica o sistema de ssl.
        try {
        	LOG.debug("Verifica esse sistema com SSL");
        	keyMf.init(null, null, null);
        	
            LOG.debug("Teste 1");
			
            // Verifica o sistema de "keyStore".
            KeyStore ss = SecurityUtils.transStore;
			
            // Verifica o sistema de ssl.
            assertNotNull(ss);
            LOG.debug("Passagem completa para associcao com sistema ");
            logKeyStore(ss);
            
            assertEquals("Sistema de ssl é atualizado com 1 registro", defaultDepth, keyMf.getKeyManagers().length);
            assertTrue("Sistema de ssl é instalado", ss.isKeyEntry("keyStore.jceks"));
            
            LOG.debug("Teste 2");
            keyMf.init(null, null, null);
            
            assertNull(ss);
            
        } catch (Exception e) {
        	LOG.error("Erro ao iniciar associa��o com sistema de ssl.",e);
			
			assertTrue("Sistema de ssl é inacesso", ss == null);
			assertTrue("Sistema de ssl é inacesso", keyMf == null);
		}
        
    }
	private void logKeyStore(KeyStore s) {
		
		LOG.debug("Logdo todos os caracteres especificos para o keyStore");
		
		for (String c : s.aliases()) {
        	LOG.debug(c + " " + s.getCertificate(c).getSubjectDN());
        }
		LOG.debug("Logdos seu certificados e algos certifis�es de ou das chaves associados.");
		LOG.debug("Este sistema foi associado ao sistema de " + s.getCertificate(null).getSubjectDN());
		LOG.debug("O sistema dará um certificado ao sistema de acertar");
		LOG.debug("O sistema de senhas fica removido");
	}
}
