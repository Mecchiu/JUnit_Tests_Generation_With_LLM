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

    /** Constructor. */
    public TransportKeyStoreBean_0Test() {
    }

    /**
     * Teste ao efetuar a execu��o de uma transporta uma chave que ser�
     * salvo com uma senha no senha.
     */
    @Test
    public void testUnaSala() throws Exception {
        try {
            // Setar os parâmetros do transporte (opç�o da sessao) para o arquivo de sala
            System.setProperty("file.separator", "/");
            String uri = SecurityUtils.getServerContext().getRealm()
               .getKeyStoreFile()
               .toString()
               .substring(0,
                    SecurityUtils.getServerContext().getRealm()
                       .getKeyStoreFile().toString()
                       .length());
            SecurityUtils.setServerContext(
                    new KeyStore.Builder().setKeyStoreType(keyStoreType)
                       .setKeyStoreResource(uri)
                       .setKeyStore(SecurityUtils.getTransportSecurityInfo()
                    ).build());
            // Executa uma chave na sess�o que o envio ao ser de caminho
            KeyManagerFactory kmf = SecurityUtils.getTransportSecurityInfo()
                   .getKeyManagerFactory();
            
            // Setar "keyStoreUri" para ser usado como "keyStoreType"
            uri = String.format("file:%s",
                    keyStoreUri);
            KeyStore keyStore = SecurityUtils.getServerContext()
                   .getRealm()
                   .getKeyStore(keyStoreType);
            assertNotNull("Failed to add key", keyStore);
            
            // Executa o comando "TrustStore", mas aparece que verificar se
            // uma chave de senha n�o se pode gerar uma chave.
            KeyManagerFactory kmfTrustStore = keyManagerFactory(
                        trustStoreType, trustStorePassword);
            
            Object keyStorePass = SecurityUtils.getTransportSecurityInfo()
                   .getTransportKeyStorePassword();
            assertTrue("Secretar keyStorePassword é n�o igual ao que a password ser encontrado no envio",
                    keyStorePassword.equals(keyStorePass));
            
            TrustManagerFactory tmfTrustStore = trustManagerFactory(
                    keyManagerFactories, "");
            
            KeyManager[] keyManagers = KeyManagerFactory.getInstance(
                    kmf.getDefaultAlgorithm())
                   .getKeyManagers();
            ArrayList<TrustManagerFactory> all = new ArrayList<>();
            all.addAll(Arrays.asList(keyManagers));
            
            // Executa o comando "TrustAll", que inexcluir a lista de gera��ors.
            Boolean val = keyManagerFactory(
                    trustStoreType, trustStorePassword)
                    .hasTrustManager(""/* all */);
            assertFalse("Failed to have a manager for trustStore type",
                    val);
            
            // Executa a execu��o da chave no cliente tudo
            Object keyStoreUri = SecurityUtils.getTransportSecurityInfo().getKeyStoreFile();
            keyStoreUri = SecurityUtils.getServerContext().getAuthenticationUri()
                   .resolve(uri, keyStoreUri);
            TrustManagerFactory tmfKeyManager = trustManagerFactory(
                    keyStoreType, trustStorePassword);
            keyManagerFactory(kmfStore, keyStoreUri).deleteKeyManager(keyStoreUri);
            kmfTrustStore.deleteTrustManager(""/* keyManagers */);
            
            // Executa a execu��o da chave no cliente tudo.
            Object keyStoreUri2 =
                    SecurityUtils.getServerContext().getAuthenticationUri()
                           .resolve(uri, keyStoreUri);
            KeyManagerFactory kmfTrustManager = trustManagerFactory(
                    keyStoreType, trustStorePassword);
            kmfTrustManager.getTrustManager(""/* keyManagers */)
            		.loadTrustMaterial(kmfKeyManager, true)
            		.checkServerTrusted(kmfTrustManager, kmfCertificateFile);
            
            // Executa a execu��o da chave no cliente tudo com "keyStorePassword :"
            keyStoreUri = SecurityUtils.getServerContext().getAuthenticationUri()
                   .resolve(uri, keyStoreUri);
            keyManagerFactory(kmfStore, keyStoreUri)
                   .loadKeyMan