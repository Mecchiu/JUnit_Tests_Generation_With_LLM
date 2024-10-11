// AACSLoginModule_3Test.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AACSLoginModule}.
* It contains one unit test case for the {@link AACSLoginModule#logout()} method.
*/
class AACSLoginModule_3Test {
		@Test 
	public void test_login_successfully_cancels_logout() throws Exception {
		final PrincipalImpl testPrincipal = new PrincipalImpl("testUser");

		Subject subject = new Subject();
		Login login = Login.getInstance();
		//login.setLoginConfig(new LoginConfig(login, testPrincipal));
		//login.setConfirmationCredentials(new UsernamePasswordCredential("test","test"));

		//test = 1 for test
		Principal principal =
		    new NullPrincipalImpl(1);	//login is not used for test
		login.login(subject, principal);
		assertEquals(0, login.getTotalAttempts());
	}

	@Test 
	public void test_login_successfully_cancels_login() throws Exception {
		final PrincipalImpl testPrincipal = new PrincipalImpl("testUser");

		subject = new Subject();
		Login login = Login.getInstance();
		//login.setLoginConfig(new LoginConfig(login, testPrincipal));
		//login.setConfirmationCredentials(new UsernamePasswordCredential("test", "test"));

		//int test = 1 for test
		Principal principal =
		    new NullPrincipalImpl(1);	//login is not used for test
		login.login(subject, principal);
		assertEquals(0, login.getTotalAttempts());
	}

    @Test
    public void test_login() throws Exception {
		// login is disabled so test will fail
        Login login = Login.getInstance();
        login.setConfirmationCredentials(TestUtils.getUsernamePasswordCredential());
        boolean result = login.login(new Subject(), new User("testUser"));
        assertTrue("Test login returned false since not enabled", result);
    }
}

// class containing one test suite.
final class TestSuite {

    private List<LoginModuleTestCase> testCases = new ArrayList<>();
    private String configName;

    TestSuite(String configName) {
        this.configName = configName;
    }

    public void addTestCase(LoginModuleTestCase testCase) {
        testCases.add(testCase);
    }

    public List<LoginModuleTestCase> getTestCases() {
        return testCases;
    }

    public String getConfigName() {
        return configName;
    }
}

/**
 * Test class of {@link CodecFactory} used by the {@link AuthProvider#getLoginContext(
 * String, Map)}
 * method.
 */
final class CodecFactoryTest extends TestCase {

    @Override
    public void runTest() throws Exception {
        final CodecFactoryTestable testable = TestUtils.getTestable(CodecFactoryTestable.class);
        testable.initialize(configName);
        return;
    }
}

/**
 * Test class of {@link CertFactory} used by the {@link AuthProvider#getLoginContext(
 * String, Map)}
 * method, to create a keystore entry.
 */
final class CertFactoryTest extends TestCase {

    @Override
    public void runTest() throws Exception {
        final CertFactoryTestable testable = TestUtils.getTestable(CertFactoryTestable.class);
        testable.initialize(configName);

        final KeyStore store =
            (KeyStore)
            new NullKeyStore(new KeyEntry("keystore",
                                          "secret","password"));
        testable.createKeyStore(store, "keystore2");
    }
}

/**
 * Test class of {@link KeyFactory} used by the
 * {@link AuthProvider#getLoginContext(String, Map)}
 * method, created by the
 * {@link CodecFactoryTestable#initialize(Configuration)} method.
 */
final class KeyFactoryTest extends TestCase {
    private final int keySize = 100;
    private final String providerID = "test-provider";
    private final String providerName = "test-provider";

    private final byte[] secret;
    private final byte[] masterkey;
    private final KeyStore.SecretKeyEntry entry;

    private final String provider;
    private final String providerName;

    KeyFactoryTest() {
        secret = new byte[keySize];

        masterkey =
        new BCECipherSpec.MacKey(new KeyDigest.DigestScheme(
                                            new KeySpec.RC4(secret)));
        entry = new KeyStore.SecretKeyEntry
        (
                KeyStore.getInstance(KeyStore.getDefaultType())
               , masterkey
        );
        Map<String,?> properties = new HashMap<>();
        properties.put("ProviderID", providerID);
        properties.put("ProviderName", providerName);

        provider =
        new KeyFactory(
                new SecretKeyFactory(
                            new SecretKeySpec(secret, "DESEDE")
                        ).generateSecret(null))
           .configure(properties);
        providerName = provider.getClass().getName();

        providerID =
        provider.getClass().getName().substring(
                provider.getClass().getName().indexOf(".") + 1);
        log.info("ProviderID configured to " + providerID);
    }

    public int getKeySize() {
        return keySize;
    }

    public String getProviderID() {
        return providerID;
    }

    public String getProviderName() {
        return providerName;
    }

    public KeyStore.SecretKeyEntry getEntry() {
        return entry;
    }

    private class KeyStoreTestable extends Testable {
        private final Map<String,Object> properties;

        private KeyStoreTestable() {
            properties = new HashMap<>();
        }

}
}