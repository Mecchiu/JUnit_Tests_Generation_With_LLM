// QuickServer_11Test.java
package org.quickserver.net.server;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link QuickServer}.
 * It contains ten unit test cases for the {@link QuickServer#getSSLContext(String)} method.
 */
class QuickServer_11Test {

    /**
     * Test case for getting SSLContext with default protocol.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithDefaultProtocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        SSLContext sslContext = server.getSSLContext(null);
        assertNotNull(sslContext);
    }

    /**
     * Test case for getting SSLContext with TLSv1.2 protocol.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithTLSv12Protocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        SSLContext sslContext = server.getSSLContext("TLSv1.2");
        assertNotNull(sslContext);
    }

    /**
     * Test case for getting SSLContext with TLSv1.1 protocol.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithTLSv11Protocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        SSLContext sslContext = server.getSSLContext("TLSv1.1");
        assertNotNull(sslContext);
    }

    /**
     * Test case for getting SSLContext with TLSv1 protocol.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithTLSv1Protocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        SSLContext sslContext = server.getSSLContext("TLSv1");
        assertNotNull(sslContext);
    }

    /**
     * Test case for getting SSLContext with SSLv3 protocol.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithSSLv3Protocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        SSLContext sslContext = server.getSSLContext("SSLv3");
        assertNotNull(sslContext);
    }

    /**
     * Test case for getting SSLContext with invalid protocol.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithInvalidProtocol() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        assertThrows(NoSuchAlgorithmException.class, () -> server.getSSLContext("InvalidProtocol"));
    }

    /**
     * Test case for getting SSLContext with null protocol and invalid keystore path.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithNullProtocolAndInvalidKeystorePath() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        server.setSecureConfig("invalid_keystore_path.properties");
        assertThrows(IOException.class, () -> server.getSSLContext(null));
    }

    /**
     * Test case for getting SSLContext with null protocol and invalid keystore password.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithNullProtocolAndInvalidKeystorePassword() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        server.setSecureConfig("invalid_keystore_password.properties");
        assertThrows(IOException.class, () -> server.getSSLContext(null));
    }

    /**
     * Test case for getting SSLContext with null protocol and invalid key password.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithNullProtocolAndInvalidKeyPassword() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        server.setSecureConfig("invalid_key_password.properties");
        assertThrows(IOException.class, () -> server.getSSLContext(null));
    }

    /**
     * Test case for getting SSLContext with null protocol and invalid truststore path.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithNullProtocolAndInvalidTruststorePath() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        server.setSecureConfig("invalid_truststore_path.properties");
        assertThrows(IOException.class, () -> server.getSSLContext(null));
    }

    /**
     * Test case for getting SSLContext with null protocol and invalid truststore password.
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    @Test
    void testGetSSLContextWithNullProtocolAndInvalidTruststorePassword() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        QuickServer server = new QuickServer();
        server.setSecureConfig("invalid_truststore_password.properties");
        assertThrows(IOException.class, () -> server.getSSLContext(null));
    }
}