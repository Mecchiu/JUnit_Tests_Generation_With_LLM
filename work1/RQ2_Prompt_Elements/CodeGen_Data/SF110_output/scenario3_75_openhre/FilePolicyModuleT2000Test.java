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
 * This method provides access to the main interface of {@link FilePolicyModule}.
 *
 * @return returns the main interface of {@link FilePolicyModule}
 */
protected static FilePolicyModule getFilePolicyModule() {
        return new FilePolicyModule();
}


/**
 * This method tests finding a policy from a file that does not exist.
 *
 * @throws MalformedURLException thrown when the URL for the file cannot be
 *                   parsed into a URI.
 * @throws FileNotFoundException thrown if the file in the instance does not
 *                        exist. Also, if the file does not exist, then no
 *                        policy object is returned.
 * @throws Exception thrown if any other unknown error occures.
 */
@Test(expected= FileNotFoundException.class)
public void findPolicy_FileNotFound() throws MalformedURLException, FileNotFoundException, Exception {
        //System.setOut(new PrintStream(System.out, false));
        List<String> toRemove = new ArrayList<>();
        toRemove.add("xacml/security/policy/unused.policy");
        toRemove.add("xacml/security/policyset/unused.policySet");
        FilePolicyModuleTest.getFilePolicyModule().findPolicy(null, null, null, null);
        throw new Exception("Test PASSED");
        Iterator<String> it = toRemove.iterator();
        while(it.hasNext()) {
            String policy = it.next();
            System.out.println("Removing " + policy);
            FilePolicyParser.removePolicyFromFile(policy);
        }
}

/**
 * This method tests finding a valid policy against the supplied URL.
 *
 * @throws MalformedURLException thrown when the URL for the file cannot
 *                   be parsed into a URI.
 * @throws FileNotFoundException thrown if the file in the instance does not
 *                        exist. Also, if the file does not exist, then no
 *                        policy object is returned.
 * @throws Exception thrown if any other unknown error occures.
 */
@Test(expected= MalformedURLException.class)
public void findValidPolicy_NotAValidUrl() throws MalformedURLException, FileNotFoundException, Exception {
        //System.setOut(new PrintStream(System.out, false));
        URI