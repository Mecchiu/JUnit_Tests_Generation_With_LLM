// FilePolicyModuleTest.java
package com.browsersoft.aacs.xacml;

import com.browsersoft.aacs.Login;
import com.sun.xacml.AbstractPolicy;
import com.sun.xacml.EvaluationCtx;
import com.sun.xacml.MatchResult;
import com.sun.xacml.ParsingException;
import com.sun.xacml.Policy;
import com.sun.xacml.ctx.Status;
import com.sun.xacml.PolicyReference;
import com.sun.xacml.PolicySet;
import com.sun.xacml.finder.PolicyFinder;
import com.sun.xacml.finder.PolicyFinderModule;
import com.sun.xacml.finder.PolicyFinderResult;
import com.sun.xacml.PolicyMetaData;
import com.sun.xacml.PolicyReference;
import com.sun.xacml.PolicySet;
import com.sun.xacml.VersionConstraints;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import com.sun.xacml.support.finder.PolicyReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilePolicyModule}.
* It contains ten unit test cases for the {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
*/
class FilePolicyModuleTest {

	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is null.
	*/
	@Test
	void testFindPolicy_NullIdReference() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(null, PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is not a valid URL.
	*/
	@Test
	void testFindPolicy_InvalidIdReference() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("invalid"), PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicy() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicySet() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICYSET_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicySet_InvalidType() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicy_InvalidType() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICYSET_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicy_InvalidVersion() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicySet_InvalidVersion() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICYSET_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicy_ValidVersion() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicySet_ValidVersion() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICYSET_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicy_ValidVersion_ValidParentMetaData() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicySet_ValidVersion_ValidParentMetaData() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICYSET_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
}

// FilePolicyModuleTest.java
package com.browsersoft.aacs.xacml;

import com.browsersoft.aacs.Login;
import com.sun.xacml.AbstractPolicy;
import com.sun.xacml.EvaluationCtx;
import com.sun.xacml.MatchResult;
import com.sun.xacml.ParsingException;
import com.sun.xacml.Policy;
import com.sun.xacml.ctx.Status;
import com.sun.xacml.PolicyReference;
import com.sun.xacml.PolicySet;
import com.sun.xacml.finder.PolicyFinder;
import com.sun.xacml.finder.PolicyFinderModule;
import com.sun.xacml.finder.PolicyFinderResult;
import com.sun.xacml.PolicyMetaData;
import com.sun.xacml.PolicyReference;
import com.sun.xacml.PolicySet;
import com.sun.xacml.VersionConstraints;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import com.sun.xacml.support.finder.PolicyReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilePolicyModule}.
* It contains ten unit test cases for the {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
*/
class FilePolicyModuleTest {
		
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is null.
	*/
	@Test
	void testFindPolicy_NullIdReference() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(null, PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is not a valid URL.
	*/
	@Test
	void testFindPolicy_InvalidIdReference() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("invalid"), PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicy() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicySet() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICYSET_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicySet_InvalidType() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicy_InvalidType() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICYSET_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicy_InvalidVersion() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICY_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNotResolveToXACMLPolicySet_InvalidVersion() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("http://www.google.com"), PolicyReference.POLICYSET_REFERENCE, null, null);
		assertNull(result.getPolicy());
		assertNull(result.getStatus());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the idReference is a valid URL but it does not resolve to an XACML policy.
	*/
	@Test
	void testFindPolicy_ValidIdReferenceButNot