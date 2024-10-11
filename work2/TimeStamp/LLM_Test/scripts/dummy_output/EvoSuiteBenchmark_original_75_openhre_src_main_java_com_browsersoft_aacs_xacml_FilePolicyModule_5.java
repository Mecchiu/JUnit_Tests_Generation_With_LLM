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
		
	private static final Logger logger = Logger.getLogger(String.format("%s.%s", FilePolicyModule.class.getName(), FilePolicyModuleTest.class.getName()));
	
	private static final Object NO_USER = null;	// make this possible to use in the unit tests
	private static final Object NO_PASSWORD = null;
	
	@Test
	void testEmptyLoadPolicy() throws MalformedURLException, Exception {
		FilePolicyModule mod = new FilePolicyModule();
		mod.initModule();
		assertNotNull("An empty policy could not be loaded from resources", mod.loadPolicy(new File("noprompt"), 0, null, null));
	}

//	@Test
    public void testLoadPolicy() throws MalformedURLException, Exception {
		FilePolicyModule mod = new FilePolicyModule();
		mod.initModule();
		assertNotNull("No policy could be loaded from resources", mod.loadPolicy(new File("noprompt"), 0, null, null));
    }
	
	/**
	 * Test case for {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)}.
	 * @throws Exception
	 */
	@Test
	void testFindPolicy() throws MalformedURLException, PolicyFinderModuleException, Exception {
		FilePolicyModule mod = new FilePolicyModule();
}
}