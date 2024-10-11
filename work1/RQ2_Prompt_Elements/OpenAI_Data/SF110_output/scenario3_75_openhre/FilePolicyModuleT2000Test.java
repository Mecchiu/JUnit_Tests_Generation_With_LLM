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
	* Test case 1 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found.
	*/
	@Test
	public void testFindPolicy1() {
		FilePolicyModule fpm = new FilePolicyModule();
		URI idReference = new URI("http://www.example.com/policy/1");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(result.getStatus(), Status.STATUS_OK);
		assertEquals(result.getPolicy(), new Policy());
	}
	
	/**
	* Test case 2 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is not found.
	*/
	@Test
	public void testFindPolicy2() {
		FilePolicyModule fpm = new FilePolicyModule();
		URI idReference = new URI("http://www.example.com/policy/2");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(result.getStatus(), Status.STATUS_OK);
		assertEquals(result.getPolicy(), null);
	}
	
	/**
	* Test case 3 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found.
	*/
	@Test
	public void testFindPolicy3() {
		FilePolicyModule fpm = new FilePolicyModule();
		URI idReference = new URI("http://www.example.com/policy/3");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(result.getStatus(), Status.STATUS_OK);
		assertEquals(result.getPolicy(), new Policy());
	}
	
	/**
	* Test case 4 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is not found.
	*/
	@Test
	public void testFindPolicy4() {
		FilePolicyModule fpm = new FilePolicyModule();
		URI idReference = new URI("http://www.example.com/policy/4");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(result.getStatus(), Status.STATUS_OK);
		assertEquals(result.getPolicy(), null);
	}
	
	/**
	* Test case 5 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found.
	*/
	@Test
	public void testFindPolicy5() {
		FilePolicyModule fpm = new FilePolicyModule();
		URI idReference = new URI("http://www.example.com/policy/5");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(result.getStatus(), Status.STATUS_OK);
		assertEquals(result.getPolicy(), new Policy());
	}
	
	/**
	* Test case 6 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is not found.
	*/
	@Test
	public void testFindPolicy6() {
		FilePolicyModule fpm = new FilePolicyModule();
		URI idReference = new URI("http://www.example.com/policy/6");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(result.getStatus(), Status.STATUS_OK);
		assertEquals(result.getPolicy(), null);
	}
	
	/**
	* Test case 7 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found.
	*/
	@Test
	public void testFindPolicy7() {
		FilePolicyModule fpm = new FilePolicyModule();
		URI idReference = new URI("http://www.example.com/policy/7");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(result.getStatus(), Status.STATUS_OK);
		assertEquals(result.getPolicy(), new Policy());
	}
	
	/**
	* Test case 8 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is not found.
	*/
	@Test
	public void testFindPolicy8() {
		FilePolicyModule fpm = new FilePolicyModule();
		URI idReference = new URI("http://www.example.com/policy/8");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(result.getStatus(), Status.STATUS_OK);
		assertEquals(result.getPolicy(), null);
	}
	
	/**
	* Test case 9 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found.
	*/
	@Test
	public void testFindPolicy9() {
		FilePolicyModule fpm = new FilePolicyModule();
		URI idReference = new URI("http://www.example.com/policy/9");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(result.getStatus(), Status.STATUS_OK);
		assertEquals(result.getPolicy(), new Policy());
	}
	
	/**
	* Test case 10 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is not found.
	*/
	@Test
	public void testFindPolicy10() {
		FilePolicyModule fpm = new FilePolicyModule();
		