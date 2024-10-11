// FilePolicyModuleTest.java
package com.browsersoft.aacs.xacml;

import com.sun.xacml.AbstractPolicy;
import com.sun.xacml.ParsingException;
import com.sun.xacml.Policy;
import com.sun.xacml.PolicyReference;
import com.sun.xacml.PolicySet;
import com.sun.xacml.VersionConstraints;
import com.sun.xacml.ctx.Status;
import com.sun.xacml.finder.PolicyFinderResult;
import com.sun.xacml.support.finder.PolicyReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test class of {@link FilePolicyModule}.
 * It contains ten unit test cases for the {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
 */
class FilePolicyModuleTest {

    private FilePolicyModule filePolicyModule;

    @BeforeEach
    void setUp() {
        filePolicyModule = new FilePolicyModule();
        filePolicyModule.setPolicyDir("src/test/resources/policies/");
        filePolicyModule.setReader(new PolicyReader());
    }

    @Test
    void testFindPolicyWithValidPolicyReference() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("sample-policy");
        int type = PolicyReference.POLICY_REFERENCE;
        VersionConstraints constraints = new VersionConstraints();
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        AbstractPolicy policy = result.getPolicy();
        assertEquals(Policy.class, policy.getClass());
    }

    @Test
    void testFindPolicyWithValidPolicySetReference() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("sample-policy-set");
        int type = PolicyReference.POLICY_SET_REFERENCE;
        VersionConstraints constraints = new VersionConstraints();
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        AbstractPolicy policy = result.getPolicy();
        assertEquals(PolicySet.class, policy.getClass());
    }

    @Test
    void testFindPolicyWithInvalidReference() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("invalid-policy-reference");
        int type = PolicyReference.POLICY_REFERENCE;
        VersionConstraints constraints = new VersionConstraints();
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        assertNull(result.getPolicy());
    }

    @Test
    void testFindPolicyWithInvalidSetReference() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("invalid-policy-set-reference");
        int type = PolicyReference.POLICY_SET_REFERENCE;
        VersionConstraints constraints = new VersionConstraints();
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        assertNull(result.getPolicy());
    }

    @Test
    void testFindPolicyWithInvalidVersion() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("sample-policy");
        int type = PolicyReference.POLICY_REFERENCE;
        VersionConstraints constraints = new VersionConstraints("2.0");
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        assertNull(result.getPolicy());
    }

    @Test
    void testFindPolicyWithInvalidSetVersion() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("sample-policy-set");
        int type = PolicyReference.POLICY_SET_REFERENCE;
        VersionConstraints constraints = new VersionConstraints("2.0");
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        assertNull(result.getPolicy());
    }

    @Test
    void testFindPolicyWithInvalidURL() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("invalid-url");
        int type = PolicyReference.POLICY_REFERENCE;
        VersionConstraints constraints = new VersionConstraints();
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        assertNull(result.getPolicy());
    }

    @Test
    void testFindPolicyWithInvalidPolicy() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("invalid-policy");
        int type = PolicyReference.POLICY_REFERENCE;
        VersionConstraints constraints = new VersionConstraints();
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        assertNull(result.getPolicy());
    }

    @Test
    void testFindPolicyWithInvalidSet() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("invalid-policy-set");
        int type = PolicyReference.POLICY_SET_REFERENCE;
        VersionConstraints constraints = new VersionConstraints();
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        assertNull(result.getPolicy());
    }

    @Test
    void testFindPolicyWithNullConstraints() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("sample-policy");
        int type = PolicyReference.POLICY_REFERENCE;
        VersionConstraints constraints = null;
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        AbstractPolicy policy = result.getPolicy();
        assertEquals(Policy.class, policy.getClass());
    }

    @Test
    void testFindPolicyWithNullMetaData() throws MalformedURLException, ParsingException {
        URI idReference = URI.create("sample-policy");
        int type = PolicyReference.POLICY_REFERENCE;
        VersionConstraints constraints = new VersionConstraints();
        PolicyFinderResult result = filePolicyModule.findPolicy(idReference, type, constraints, null);
        AbstractPolicy policy = result.getPolicy();
        assertEquals(Policy.class, policy.getClass());
    }
}