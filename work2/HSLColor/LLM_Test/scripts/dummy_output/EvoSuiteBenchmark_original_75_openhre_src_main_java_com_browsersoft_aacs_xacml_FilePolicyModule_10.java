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
		/** The logger to use for this test */
		private static final Logger LOGGER = Logger.getLogger(FilePolicyModuleTest.class.getName());

		/**
		* Test that policy reference is not resolved to a known policy
		* when using standard policy finder.
		*/
		@Test
		@TestInstance(TestInstance.LOW)
		public void policyReference() {
			List<String> testStrings = new ArrayList<>();
			String[] testArray = {
					"XACML",
					"1.1",
					"AOS-TACML",
					"AOS-TACML-2.2",
					"Mock-TACML-1.1-2-iCAD",
					"Mock-TACML-2.2-iCAD",
					"Mock-TACML-3.0-iCAD",
					"Mock-TACML-3.1-iCAD",
					"Mock-TACML-3.2-iCAD",
					"Mock-TACML-3.3-iCAD",
					"Mock-TACML-3.4-iCAD",
					"Mock-TACML-4.0-iCAD",
					"Mock-TACML-4.1-iCAD",
					"Mock-TACML-4.2-iCAD",
					"Mock-TACML-4.3-iCAD"
			};
			HashSet<String> hashSet = new HashSet<>();
			hashSet.add(testArray[0]);
			hashSet.add(testArray[1]);
			hashSet.add(testArray[2]);
			hashSet.add(testArray[3]);
			hashSet.add(testArray[4]);
			hashSet.add(testArray[5]);
			hashSet.add(testArray[6]);
			hashSet.add(testArray[7]);
			hashSet.add(testArray[8]);
			hashSet.add(testArray[9]);
			hashSet.add(testArray[10]);
			hashSet.add(testArray[11]);
			hashSet.add(testArray[12]);
			hashSet.add(testArray[13]);
			hashSet.add(testArray[14]);
}
}