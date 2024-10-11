// FilePolicyModuleTest.java
package com.browsersoft.aacs.xacml;

import com.sun.xacml.PolicyMetaData;
import com.sun.xacml.VersionConstraints;
import com.sun.xacml.finder.PolicyFinderResult;
import org.junit.jupiter.api.Test;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test class of {@link FilePolicyModule}.
 * It contains ten unit test cases for the {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
 */
class FilePolicyModuleTest {

    /**
     * Test case when the policy reference is null.
     */
    @Test
    void testFindPolicyWithNullReference() {
        FilePolicyModule module = new FilePolicyModule();
        PolicyFinderResult result = module.findPolicy(null, PolicyReference.POLICY_REFERENCE, new VersionConstraints(), new PolicyMetaData());
        assertNull(result.getPolicy());
    }

    /**
     * Test case when the policy reference is not a valid URL.
     */
    @Test
    void testFindPolicyWithInvalidURL() {
        FilePolicyModule module = new FilePolicyModule();
        URI reference = URI.create("invalid-url");
        PolicyFinderResult result = module.findPolicy(reference, PolicyReference.POLICY_REFERENCE, new VersionConstraints(), new PolicyMetaData());
        assertNull(result.getPolicy());
    }

    /**
     * Test case when the policy reference does not resolve to an XACML policy.
     */
    @Test
    void testFindPolicyWithNonXACMLPolicy() {
        FilePolicyModule module = new FilePolicyModule();
        URI reference = URI.create("https://www.google.com");
        PolicyFinderResult result = module.findPolicy(reference, PolicyReference.POLICY_REFERENCE, new VersionConstraints(), new PolicyMetaData());
        assertNull(result.getPolicy());
    }

    /**
     * Test case when the policy reference is a valid URL that resolves to an XACML policy.
     */
    @Test
    void testFindPolicyWithValidURL() {
        FilePolicyModule module = new FilePolicyModule();
        URI reference = URI.create("https://www.example.com/policy.xml");
        PolicyFinderResult result = module.findPolicy(reference, PolicyReference.POLICY_REFERENCE, new VersionConstraints(), new PolicyMetaData());
        assertEquals("policy", result.getPolicy().getId().toString());
    }

    /**
     * Test case when the policy reference is a valid file path that does not exist.
     */
    @Test
    void testFindPolicyWithNonExistingFile() {
        FilePolicyModule module = new FilePolicyModule();
        URI reference = URI.create("file:///non-existing-file.xml");
        PolicyFinderResult result = module.findPolicy(reference, PolicyReference.POLICY_REFERENCE, new VersionConstraints(), new PolicyMetaData());
        assertNull(result.getPolicy());
    }

    /**
     * Test case when the policy reference is a valid file path that exists but does not contain an XACML policy.
     */
    @Test
    void testFindPolicyWithNonXACMLFile() {
        FilePolicyModule module = new FilePolicyModule();
        URI reference = URI.create("file:///non-xacml-file.txt");
        PolicyFinderResult result = module.findPolicy(reference, PolicyReference.POLICY_REFERENCE, new VersionConstraints(), new PolicyMetaData());
        assertNull(result.getPolicy());
    }

    /**
     * Test case when the policy reference is a valid file path that exists and contains an XACML policy.
     */
    @Test
    void testFindPolicyWithValidFile() {
        FilePolicyModule module = new FilePolicyModule();
        URI reference = URI.create("file:///xacml-policy.xml");
        PolicyFinderResult result = module.findPolicy(reference, PolicyReference.POLICY_REFERENCE, new VersionConstraints(), new PolicyMetaData());
        assertEquals("policy", result.getPolicy().getId().toString());
    }

    /**
     * Test case when the policy reference is a valid file path that exists and contains an XACML policy set.
     */
    @Test
    void testFindPolicySetWithValidFile() {
        FilePolicyModule module = new FilePolicyModule();
        URI reference = URI.create("file:///xacml-policy-set.xml");
        PolicyFinderResult result = module.findPolicy(reference, PolicyReference.POLICYSET_REFERENCE, new VersionConstraints(), new PolicyMetaData());
        assertEquals("policy-set", result.getPolicySet().getId().toString());
    }

    /**
     * Test case when the policy reference is a valid file path that exists and contains an XACML policy set with a reference to another policy.
     */
    @Test
    void testFindPolicySetWithReference() {
        FilePolicyModule module = new FilePolicyModule();
        URI reference = URI.create("file:///xacml-policy-set-with-reference.xml");
        PolicyFinderResult result = module.findPolicy(reference, PolicyReference.POLICYSET_REFERENCE, new VersionConstraints(), new PolicyMetaData());
        assertEquals("policy-set-with-reference", result.getPolicySet().getId().toString());
        assertEquals("policy", result.getPolicy().getId().toString());
    }

    /**
     * Test case when the policy reference is a valid file path that exists and contains an XACML policy set with a reference to a non-existing policy.
     */
    @Test
    void testFindPolicySetWithNonExistingReference() {
        FilePolicyModule module = new FilePolicyModule();
        URI reference = URI.create("file:///xacml-policy-set-with-non-existing-reference.xml");
        PolicyFinderResult result = module.findPolicy(reference, PolicyReference.POLICYSET_REFERENCE, new VersionConstraints(), new PolicyMetaData());
        assertNull(result.getPolicySet());
    }
}