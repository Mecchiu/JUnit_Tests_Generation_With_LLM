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
    * Tests a basic use of the {@link PolicyFinder} class.
    */
    @Test
    void basicTest()
		throws MalformedURLException, ParsingException, FileNotFoundException {
        // create a file that is empty
		String path = "/some/missing/path/xacml.policy";
        File f = File.createTempFile("PolicyTest", path);

        // create the finder object
		String file = "policy." + file(f);
        FilePolicyModule.findPolicy(file, Policy.ID_VERSION_1_1,
				VersionConstraints.ALL, new PolicyMetaData());
        String content = readContent(f);
        assertFalse("Incorrect content of the file \"" + f.getName() + "\"",
			content.equals(readContent(f)));
		
        // create the finder object
		String p1 = "policy(" + file + '(' + path + ")');";
		String p2 = "p1(\"policy1\", \"" + file + '(' + path + ")\");";
        FilePolicyModule.findPolicy(p1, Policy.ID_VERSION_1_1,
				VersionConstraints.ALL, new PolicyMetaData());
        String content1 = readContent(f);
        assertFalse("Missing '(' at end", content1.endsWith(")"));
        String content2 = readContent(f);
        assertFalse("Missing '(' at end", content2.endsWith("("));
        assertFalse("Too long key", content1.endsWith(".("));
        assertTrue("Expected version 1, got " + content1.substring(0,content1.length()-2) + ')',
                "Expected a '((') but got " + content1.substring(0,content1.length()-2) + ')',
				content2.substring(0,content1.length() -2));
        // ensure the policy was loaded
		assertNotNull("Could not load policy '" + file + '(' + path + ")'",
				findPolicy(new File(f, file), Policy.ID_VERSION_1_1,
				            VersionConstraints.ALL, null));
        
        // verify the result of loading a policy that doesn't explicitly match an
        // abstract class
}
}