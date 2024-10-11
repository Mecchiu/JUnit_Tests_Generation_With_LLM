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
		
    private static List<File> files;
    
    final List<URI> ids = new ArrayList<>();
    
    final List<VersionConstraints> constraints = new ArrayList<>();

    private FilePolicyModuleTest() {
    }
    
    public static void addFiles(List<File> files) {
        FilePolicyModuleTest.files = files;
    }

    @Test
    public void testFindPolicy() throws Exception {
        FilePolicyModule module;
        try {
            // module = new FilePolicyModule();
            // module.addFiles(files);
            module = new FilePolicyModule();
            module.addFiles(files);
            module.load();
            module.findPolicy(ids, 1, null, new PolicyMetaData());
            assertTrue(true);
        } catch(MalformedURLException e) {
            fail("URL couldn't be converted into a valid URI");
        } catch(ParsingException e) {
            fail("Couldn't parse URL");
        } catch(Exception e) {
            fail("Couldn't load policy in " + files.size());
        } finally {
            files.clear();
            module.removeFiles();
        }
    }

    @Test
    public void testFindPolicyNoFilesSet() throws Exception {
        FilePolicyModule module;
        try {
            // module = new FilePolicyModule();
            module = new FilePolicyModule();
            module.load();
            module.findPolicy(ids, 1, null, new PolicyMetaData());
            assertTrue(true);
        } catch(MalformedURLException e) {
            fail("URL couldn't be converted into a valid URI");
        } catch(ParsingException e) {
            fail("Couldn't parse URL");
        } catch(Exception e) {
            fail("Couldn't load policy in " + files.size());
        } finally {
            ids.clear();
            module.removeFiles();
        }
    }
    
    @Test
    public void testFindPolicyFail() {
        FilePolicyModule module;
}
}