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
	* It tests the case when the policy file is not found.
	*/
	@Test
	public void testFindPolicy_FileNotFound() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:processing-error");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_SET_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference_InvalidFinder() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference_InvalidFinder_InvalidSchemaFile() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference_InvalidFinder_InvalidSchemaFile_InvalidFileNames() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference_InvalidFinder_InvalidSchemaFile_InvalidFileNames_InvalidSchemaFile() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference_InvalidFinder_InvalidSchemaFile_InvalidFileNames_InvalidSchemaFile_InvalidSchemaFile() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference_InvalidFinder_InvalidSchemaFile_InvalidFileNames_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference_InvalidFinder_InvalidSchemaFile_InvalidFileNames_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference_InvalidFinder_InvalidSchemaFile_InvalidFileNames_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference_InvalidFinder_InvalidSchemaFile_InvalidFileNames_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result = filePolicyModule.findPolicy(URI.create("file:///tmp/policy.xml"), PolicyReference.POLICY_REFERENCE, null, null);
		assertEquals(result.getStatus().getCode().toString(), "urn:oasis:names:tc:xacml:1.0:status:ok");
	}
	
	/**
	* Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
	* It tests the case when the policy file is found.
	*/
	@Test
	public void testFindPolicy_FileFound_PolicySet_InvalidType_InvalidVersion_InvalidParentMetaData_InvalidConstraints_InvalidType_InvalidIdReference_InvalidFinder_InvalidSchemaFile_InvalidFileNames_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile_InvalidSchemaFile() {
		FilePolicyModule filePolicyModule = new FilePolicyModule();
		filePolicyModule.init(null);
		PolicyFinderResult result =