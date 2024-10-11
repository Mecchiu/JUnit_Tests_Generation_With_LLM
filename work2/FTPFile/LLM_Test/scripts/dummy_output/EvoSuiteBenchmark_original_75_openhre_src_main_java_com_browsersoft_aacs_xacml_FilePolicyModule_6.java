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
		/**
		 * Test method for
		 * {@link com.browsersoft.aacs.xacml.FilePolicyModule#findPolicy(java.lang.String, com.browsersoft.aacs.xacml.VersionConstraints, com.browsersoft.aacs.xacml.PolicyMetaData)}
		 * @throws com.browsersoft.aacs.xacml.ParsingException
		 */
		@Test
		public void testFindPolicyWithNonURL() throws ParsingException {
				// Get a reference to its URI
				Logger log = getLogger(this.getClass().getName());
				URI myURI = new URI(
						"xacml",
						null,
						"com.browsersoft.aacs.xacml",
						"FilePolicyModuleTest",
				null);
				PolicyReference ref = PolicyResolver.resolvePolicyURI(
						myURI);
				// Get its type code,
				int typeCode = ref.getTypeCode();
				// Load it again, with the same type code
				Policy loadPolicy = PolicyResolver.resolvePolicy(
						myURI,
						typeCode);
				// Load the policy references again, just for
				ReferencedRefPolicy otherRef = (ReferencedRefPolicy) PolicyResolver.resolvePolicy(loadPolicy.getIdentifier(), typeCode);
				Set referencedRefs = new HashSet();
				referencedRefs.add(otherRef);
				Policy otherRefPolicy;
				// Ensure no two identical policy references
				Iterator sameListIterator = referencedRefs.iterator();
}
}