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
		
	FilePolicyModule mod = new FilePolicyModule();

	/**
	 * This test class is not intended to use.
	 */
	public class UnitTest extends FilePolicyModuleTest {}

	/**
	 * This class is deliberately not subclassing test suite because we don't want to run all tests in
	 * one {@link com.sun.xacml.support.FinderManagerTest} test suite.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
           
	    FilePolicyModuleTest suite = new FilePolicyModuleTest();
        suite.setUpTester();
        
        List<Security.Key> keys = new ArrayList<Security.Key>(1);
        
        Security.Key key = Security.Key.create(
            Security.Key.TYPE_XACML,
            Security.Key.DIGEST_ALGO_SHA2, 
            0, // null id is the default 
            "xacml/test/files/sign-policy", 
            getClass().getClassLoader()
        );
        
        keys.add(key);
        
		try {
			suite.run();
		} finally {
			suite.tearDownTester();
		}
	}


	@Test
	void testFindPolicy() throws MalformedURLException, ParsingException {
		Policy expected = mod.findPolicy(ResourceUtilities.getPolicyByURI(getClass().getClassLoader().getResource("test-policy.xml")), ResourceUtilities.PolicyType.XACML_2_0, null, null);
		Policy actual = mod.findPolicy(ResourceUtilities.getPolicyByURI(ResourceUtilities.getPolicyByURI(getClass().getClassLoader().getResource("test-policy-in-this-module.xml"))), ResourceUtilities.PolicyType.XACML_2_0, null, null);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFindPolicySet() throws MalformedURLException, ParsingException {
		List<com.sun.xacml.policy.PolicyReference> expectedRefs = new ArrayList<com.sun.xacml.policy.PolicyReference>(1);
		com.sun.xacml.PolicyReference ref = new com.sun.xacml.policy.PolicyReference();
}
}