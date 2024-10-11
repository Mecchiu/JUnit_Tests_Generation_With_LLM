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
	void testFindPolicy_Found() {
		FilePolicyModule module = new FilePolicyModule();
		module.setPolicyDir("src/test/resources/");
		URI idReference = URI.create("test");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = module.findPolicy(idReference, type, constraints, parentMetaData);
		assertTrue(result.notApplicable());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is not found.
	*/
	@Test
	void testFindPolicy_NotFound() {
		FilePolicyModule module = new FilePolicyModule();
		module.setPolicyDir("src/test/resources/");
		URI idReference = URI.create("test1");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = module.findPolicy(idReference, type, constraints, parentMetaData);
		assertTrue(result.notApplicable());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the type is wrong.
	*/
	@Test
	void testFindPolicy_WrongType() {
		FilePolicyModule module = new FilePolicyModule();
		module.setPolicyDir("src/test/resources/");
		URI idReference = URI.create("test");
		int type = PolicyReference.POLICYSET_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = module.findPolicy(idReference, type, constraints, parentMetaData);
		assertTrue(result.notApplicable());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the constraints are wrong.
	*/
	@Test
	void testFindPolicy_WrongConstraints() {
		FilePolicyModule module = new FilePolicyModule();
		module.setPolicyDir("src/test/resources/");
		URI idReference = URI.create("test");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		constraints.addConstraint(1.0);
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = module.findPolicy(idReference, type, constraints, parentMetaData);
		assertTrue(result.notApplicable());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the idReference is null.
	*/
	@Test
	void testFindPolicy_NullIdReference() {
		FilePolicyModule module = new FilePolicyModule();
		module.setPolicyDir("src/test/resources/");
		URI idReference = null;
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = module.findPolicy(idReference, type, constraints, parentMetaData);
		assertTrue(result.notApplicable());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the type is wrong.
	*/
	@Test
	void testFindPolicy_WrongType1() {
		FilePolicyModule module = new FilePolicyModule();
		module.setPolicyDir("src/test/resources/");
		URI idReference = URI.create("test");
		int type = PolicyReference.POLICYSET_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = module.findPolicy(idReference, type, constraints, parentMetaData);
		assertTrue(result.notApplicable());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the constraints are wrong.
	*/
	@Test
	void testFindPolicy_WrongConstraints1() {
		FilePolicyModule module = new FilePolicyModule();
		module.setPolicyDir("src/test/resources/");
		URI idReference = URI.create("test");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		constraints.addConstraint(1.0);
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = module.findPolicy(idReference, type, constraints, parentMetaData);
		assertTrue(result.notApplicable());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the idReference is null.
	*/
	@Test
	void testFindPolicy_NullIdReference1() {
		FilePolicyModule module = new FilePolicyModule();
		module.setPolicyDir("src/test/resources/");
		URI idReference = null;
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = module.findPolicy(idReference, type, constraints, parentMetaData);
		assertTrue(result.notApplicable());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the type is wrong.
	*/
	@Test
	void testFindPolicy_WrongType2() {
		FilePolicyModule module = new FilePolicyModule();
		module.setPolicyDir("src/test/resources/");
		URI idReference = URI.create("test");
		int type = PolicyReference.POLICYSET_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult result = module.findPolicy(idReference, type, constraints, parentMetaData);
		assertTrue(result.notApplicable());
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found but the constraints are wrong.
	*/
	@Test
	void testFindPolicy_WrongConstraints2() {
		FilePolicyModule module = new FilePolicyModule();
		module.setPolicyDir("src/test/resources/");
		URI idReference = URI.create("test");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		constraints.add