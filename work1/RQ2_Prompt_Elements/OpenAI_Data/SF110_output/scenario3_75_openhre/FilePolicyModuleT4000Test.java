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
		PolicyFinderResult pfr = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(pfr.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
		assertEquals(pfr.getPolicy().getId().toString(), "http://www.example.com/policy/1");
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
		PolicyFinderResult pfr = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(pfr.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
		assertEquals(pfr.getPolicy(), null);
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
		PolicyFinderResult pfr = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(pfr.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
		assertEquals(pfr.getPolicy().getId().toString(), "http://www.example.com/policy/3");
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
		PolicyFinderResult pfr = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(pfr.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
		assertEquals(pfr.getPolicy(), null);
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
		PolicyFinderResult pfr = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(pfr.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
		assertEquals(pfr.getPolicy().getId().toString(), "http://www.example.com/policy/5");
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
		PolicyFinderResult pfr = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(pfr.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
		assertEquals(pfr.getPolicy(), null);
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
		PolicyFinderResult pfr = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(pfr.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
		assertEquals(pfr.getPolicy().getId().toString(), "http://www.example.com/policy/7");
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
		PolicyFinderResult pfr = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(pfr.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
		assertEquals(pfr.getPolicy(), null);
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
		PolicyFinderResult pfr = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(pfr.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
		assertEquals(pfr.getPolicy().getId().toString(), "http://www.example.com/policy/9");
	}
	
	/**
	* Test case 10 for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is not found.
	*/
	@Test
	public void testFindPolicy10() {
		FilePolicyModule fpm = new FilePolicyModule();
		URI idReference = new URI("http://www.example.com/policy/10");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		PolicyFinderResult pfr = fpm.findPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(pfr.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
		assertEquals(pfr.getPolicy(), null);
	}
}

// FilePolicyReader.java
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

/**
 * This class is used to read policies from files. It is used by the
 * <code>FilePolicyModule</code> class, but can also be used directly
 * by applications that need to load policies from files.
 *
 * @since 1.0
 * @author Seth Proctor
 */
public class FilePolicyReader extends com.sun.xacml.support.finder.FilePolicyReader {

    /**
     * Creates a new <code>FilePolicyReader</code> that will read policies
     * from the given directory.
     *
     * @param directory the directory to read policies from
     */
    public FilePolicyReader(File directory);
}

// FilePolicyReaderTest.java
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
* Test class of {@link FilePolicyReader}.
* It contains ten unit test cases for the {@link FilePolicyReader#getPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
*/
class FilePolicyReaderTest {
		
	/**
	* Test case 1 for {@link FilePolicyReader#getPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found.
	*/
	@Test
	public void testGetPolicy1() {
		FilePolicyReader fpr = new FilePolicyReader(new File("/home/browsersoft/Desktop/xacml/policies"));
		URI idReference = new URI("http://www.example.com/policy/1");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		AbstractPolicy ap = fpr.getPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(ap.getId().toString(), "http://www.example.com/policy/1");
	}
	
	/**
	* Test case 2 for {@link FilePolicyReader#getPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is not found.
	*/
	@Test
	public void testGetPolicy2() {
		FilePolicyReader fpr = new FilePolicyReader(new File("/home/browsersoft/Desktop/xacml/policies"));
		URI idReference = new URI("http://www.example.com/policy/2");
		int type = PolicyReference.POLICY_REFERENCE;
		VersionConstraints constraints = new VersionConstraints();
		PolicyMetaData parentMetaData = new PolicyMetaData();
		AbstractPolicy ap = fpr.getPolicy(idReference, type, constraints, parentMetaData);
		assertEquals(ap, null);
	}
	
	/**
	* Test case 3 for {@link FilePolicyReader#getPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy is found.
	*/
	@Test
	public void testGetPolicy3() {
		FilePolicyReader fpr = new FilePolicyReader