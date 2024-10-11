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
* It contains one unit test case for the {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
*/
class FilePolicyModuleTest {
		
	final FilePolicyModule module;
	
	public FilePolicyModuleTest() {
		module = new FilePolicyModule();
	}
	
	/**
	* It tests the {@link FilePolicyModule#findPolicy(URI, boolean, boolean, PolicyMetaData)} method.
	*/
	@Test
	public void testFindPolicy() {
		PolicyMetaData parentMetaData = new HashPolicyMetaData();
		parentMetaData.setName("Example");
		
		// test a policy with the "basic" criteria
		List<PolicyReference> policyRefs = new ArrayList<>();
		
		PolicyReference childPolicy = new PolicyReference(
			new Policy(
				new PolicyReference(new VersionConstraints(VersionConstraints.VERSION_ONEOCTET), null)),
			new FilePolicyMetaData("Basic"));
		policyRefs.add(childPolicy);
		parentMetaData.setChildren(policyRefs);
		
		List<PolicyReference> childPolicyRefs = new ArrayList<>();
		childPolicyRefs.add(new PolicyReference(new PolicyReference(new VersionConstraints(VersionConstraints.VERSION_ONEOCTET)), 'basic' ));
		parentMetaData.setChildren(childPolicyRefs);
		parentMetaData.setName("X");
		List<PolicyReference> policyRefsAllOther = new ArrayList<>();
		policyRefsAllOther.add(new PolicyReference(new PolicyReference(new VersionConstraints(VersionConstraints.VERSION_ONEOCTET)), 'basic'));
		policyRefsAllOther.add(new PolicyReference(new PolicyReference(new VersionConstraints(VersionConstraints.VERSION_TENTHEX)), 'other'));
		parentMetaData.setChildrenOther(policyRefsAllOther);
		parentMetaData.setName("X");
		List<PolicyReference> policyRefsAllOthr = new ArrayList<>();
		policyRefsAllOthr.add(new PolicyReference(new PolicyReference(new VersionConstraints(VersionConstraints.VERSION_TWOOINTZEROS)), 'other'));
		parentMetaData.setChildrenOthr(policyRefsAllOthr);
		parentMetaData.setName("X");
		
		// this needs a fresh version
}
}