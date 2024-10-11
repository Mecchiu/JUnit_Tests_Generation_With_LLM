// QuickServerTest.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains ten unit test cases for the {@link QuickServer#getSSLSocketFactory(String)} method.
*/
class QuickServerTest {

	@Test
	void testGetSSLSocketFactory() throws IOException, NoSuchAlgorithmException, KeyManagementException {
		QuickServer qs = new QuickServer();
		qs.setSSLConfigFile("src/test/resources/test-ssl.xml");
		qs.setSSLConfigFilePassword("test");
		qs.setSSLConfigFileType("JKS");
		qs.setSSLConfigFileKeyStorePassword("test");
		qs.setSSLConfigFileKeyPassword("test");
		qs.setSSLConfigFileTrustStorePassword("test");
		qs.setSSLConfigFileKeyStore("src/test/resources/test-keystore.jks");
		qs.setSSLConfigFileTrustStore("src/test/resources/test-truststore.jks");
		qs.setSSLConfigFileKeyStoreType("JKS");
		qs.setSSLConfigFileTrustStoreType("JKS");
		qs.setSSLConfigFileProtocol("TLS");
		qs.setSSLConfigFileProvider("SunJSSE");
		qs.setSSLConfigFileCipherSuites("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
		qs.setSSLConfigFileClientAuth("false");
		qs.setSSLConfigFileNeedClientAuth("false");
		qs.setSSLConfigFileWantClientAuth("false");
		qs.setSSLConfigFileEnabledProtocols("TLSv1.2");
		qs.setSSLConfigFileSessionCacheSize(100);
		qs.setSSLConfigFileSessionTimeout(100);
		qs.setSSLConfigFileKeyManagerAlgorithm("SunX509");
		qs.setSSLConfigFileTrustManagerAlgorithm("SunX509");
		qs.setSSLConfigFileSecureRandomAlgorithm("SHA1PRNG");
		qs.setSSLConfigFileSecureRandomProvider("SUN");
		qs.setSSLConfigFileSecureRandomSeed("test");
		qs.setSSLConfigFileSecureRandomSeedLength(100);
		qs.setSSLConfigFileSecureRandomSeedFile("src/test/resources/test-seed.txt");
		qs.setSSLConfigFileSecureRandomSeedFileLength(100);
		qs.setSSLConfigFileSecureRandomSeedFileProvider("SUN");
		qs.setSSLConfigFileSecureRandomSeedFileAlgorithm("SHA1PRNG");
		qs.setSSLConfigFileSecureRandomSeedFilePassword("test");
		qs.setSSLConfigFileSecureRandomSeedFileType("JKS");
		qs.setSSLConfigFileSecureRandomSeedFileKeyStore("src/test/resources/test-keystore.jks");
		qs.setSSLConfigFileSecureRandomSeedFileKeyStorePassword("test");
		qs.setSSLConfigFileSecureRandomSeedFileKeyStoreType("JKS");
		qs.setSSLConfigFileSecureRandomSeedFileKeyPassword("test");
		qs.setSSLConfigFileSecureRandomSeedFileTrustStore("src/test/resources/test-truststore.jks");
		qs.setSSLConfigFileSecureRandomSeedFileTrustStorePassword("test");
		qs.setSSLConfigFileSecureRandomSeedFileTrustStoreType("JKS");
		qs.setSSLConfigFileSecureRandomSeedFileProtocol("TLS");
		qs.setSSLConfigFileSecureRandomSeedFileProvider("SunJSSE");
		qs.setSSLConfigFileSecureRandomSeedFileCipherSuites("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
		qs.setSSLConfigFileSecureRandomSeedFileClientAuth("false");
		qs.setSSLConfigFileSecureRandomSeedFileNeedClientAuth("false");
		qs.setSSLConfigFileSecureRandomSeedFileWantClientAuth("false");
		qs.setSSLConfigFileSecureRandomSeedFileEnabledProtocols("TLSv1.2");
		qs.setSSLConfigFileSecureRandomSeedFileSessionCacheSize(100);
		qs.setSSLConfigFileSecureRandomSeedFileSessionTimeout(100);
		qs.setSSLConfigFileSecureRandomSeedFileKeyManagerAlgorithm("SunX509");
		qs.setSSLConfigFileSecureRandomSeedFileTrustManagerAlgorithm("SunX509");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomAlgorithm("SHA1PRNG");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomProvider("SUN");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeed("test");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedLength(100);
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFile("src/test/resources/test-seed.txt");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileLength(100);
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileProvider("SUN");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileAlgorithm("SHA1PRNG");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFilePassword("test");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileType("JKS");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileKeyStore("src/test/resources/test-keystore.jks");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileKeyStorePassword("test");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileKeyStoreType("JKS");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileKeyPassword("test");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileTrustStore("src/test/resources/test-truststore.jks");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileTrustStorePassword("test");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileTrustStoreType("JKS");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileProtocol("TLS");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileProvider("SunJSSE");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileCipherSuites("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileClientAuth("false");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileNeedClientAuth("false");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileWantClientAuth("false");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileEnabledProtocols("TLSv1.2");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileSessionCacheSize(100);
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileSessionTimeout(100);
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileKeyManagerAlgorithm("SunX509");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileTrustManagerAlgorithm("SunX509");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileSecureRandomAlgorithm("SHA1PRNG");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileSecureRandomProvider("SUN");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileSecureRandomSeed("test");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileSecureRandomSeedLength(100);
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileSecureRandomSeedFile("src/test/resources/test-seed.txt");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileSecureRandomSeedFileLength(100);
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileSecureRandomSeedFileProvider("SUN");
		qs.setSSLConfigFileSecureRandomSeedFileSecureRandomSeedFileSecureRandomSeedFileAlgorithm("SHA1PRNG");
		