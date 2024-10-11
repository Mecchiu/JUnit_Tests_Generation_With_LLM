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
	* It tests the case when the policy is found.
	*/
	@Test
	public void testFindPolicy_Found() {
		FilePolicyModule fpm = new FilePolicyModule();
		PolicyFinderResult pfr = fpm.findPolicy(new URI("http://www.browsersoft.com/policy/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(pfr.getStatus().getCode(), Status.STATUS_OK);
		assertEquals(pfr.getStatus().getMessage(), "Policy found");
		assertEquals(pfr.getStatus().getMinorCode(), 0);
		assertEquals(pfr.getStatus().getStatusType(), null);
		assertEquals(pfr.getPolicy(), new Policy(new URI("http://www.browsersoft.com/policy/policy.xml")));
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is not found.
	*/
	@Test
	public void testFindPolicy_NotFound() {
		FilePolicyModule fpm = new FilePolicyModule();
		PolicyFinderResult pfr = fpm.findPolicy(new URI("http://www.browsersoft.com/policy/policy1.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(pfr.getStatus().getCode(), Status.STATUS_OK);
		assertEquals(pfr.getStatus().getMessage(), "Policy not found");
		assertEquals(pfr.getStatus().getMinorCode(), 0);
		assertEquals(pfr.getStatus().getStatusType(), null);
		assertEquals(pfr.getPolicy(), null);
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the type is not supported.
	*/
	@Test
	public void testFindPolicy_TypeNotSupported() {
		FilePolicyModule fpm = new FilePolicyModule();
		PolicyFinderResult pfr = fpm.findPolicy(new URI("http://www.browsersoft.com/policy/policy.xml"), PolicyReference.POLICYSET_REFERENCE, null, null);
		assertEquals(pfr.getStatus().getCode(), Status.STATUS_OK);
		assertEquals(pfr.getStatus().getMessage(), "Policy not found");
		assertEquals(pfr.getStatus().getMinorCode(), 0);
		assertEquals(pfr.getStatus().getStatusType(), null);
		assertEquals(pfr.getPolicy(), null);
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the version is not supported.
	*/
	@Test
	public void testFindPolicy_VersionNotSupported() {
		FilePolicyModule fpm = new FilePolicyModule();
		PolicyFinderResult pfr = fpm.findPolicy(new URI("http://www.browsersoft.com/policy/policy.xml"), PolicyReference.POLICY_REFERENCE, new VersionConstraints(new URI("http://www.browsersoft.com/policy/policy.xml"), null, null), null);
		assertEquals(pfr.getStatus().getCode(), Status.STATUS_OK);
		assertEquals(pfr.getStatus().getMessage(), "Policy not found");
		assertEquals(pfr.getStatus().getMinorCode(), 0);
		assertEquals(pfr.getStatus().getStatusType(), null);
		assertEquals(pfr.getPolicy(), null);
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the version is not supported.
	*/
	@Test
	public void testFindPolicy_VersionNotSupported1() {
		FilePolicyModule fpm = new FilePolicyModule();
		PolicyFinderResult pfr = fpm.findPolicy(new URI("http://www.browsersoft.com/policy/policy.xml"), PolicyReference.POLICY_REFERENCE, new VersionConstraints(new URI("http://www.browsersoft.com/policy/policy1.xml"), null, null), null);
		assertEquals(pfr.getStatus().getCode(), Status.STATUS_OK);
		assertEquals(pfr.getStatus().getMessage(), "Policy not found");
		assertEquals(pfr.getStatus().getMinorCode(), 0);
		assertEquals(pfr.getStatus().getStatusType(), null);
		assertEquals(pfr.getPolicy(), null);
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the version is not supported.
	*/
	@Test
	public void testFindPolicy_VersionNotSupported2() {
		FilePolicyModule fpm = new FilePolicyModule();
		PolicyFinderResult pfr = fpm.findPolicy(new URI("http://www.browsersoft.com/policy/policy.xml"), PolicyReference.POLICY_REFERENCE, new VersionConstraints(new URI("http://www.browsersoft.com/policy/policy.xml"), new Integer(1), null), null);
		assertEquals(pfr.getStatus().getCode(), Status.STATUS_OK);
		assertEquals(pfr.getStatus().getMessage(), "Policy not found");
		assertEquals(pfr.getStatus().getMinorCode(), 0);
		assertEquals(pfr.getStatus().getStatusType(), null);
		assertEquals(pfr.getPolicy(), null);
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the version is not supported.
	*/
	@Test
	public void testFindPolicy_VersionNotSupported3() {
		FilePolicyModule fpm = new FilePolicyModule();
		PolicyFinderResult pfr = fpm.findPolicy(new URI("http://www.browsersoft.com/policy/policy.xml"), PolicyReference.POLICY_REFERENCE, new VersionConstraints(new URI("http://www.browsersoft.com/policy/policy.xml"), null, new Integer(1)), null);
		assertEquals(pfr.getStatus().getCode(), Status.STATUS_OK);
		assertEquals(pfr.getStatus().getMessage(), "Policy not found");
		assertEquals(pfr.getStatus().getMinorCode(), 0);
		assertEquals(pfr.getStatus().getStatusType(), null);
		assertEquals(pfr.getPolicy(), null);
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the version is not supported.
	*/
	@Test
	public void testFindPolicy_VersionNotSupported4() {
		FilePolicyModule fpm = new FilePolicyModule();
		PolicyFinderResult pfr = fpm.findPolicy(new URI("http://www.browsersoft.com/policy/policy.xml"), PolicyReference.POLICY_REFERENCE, new VersionConstraints(new URI("http://www.browsersoft.com/policy/policy.xml"), new Integer(1), new Integer(1)), null);
		assertEquals(pfr.getStatus().getCode(),