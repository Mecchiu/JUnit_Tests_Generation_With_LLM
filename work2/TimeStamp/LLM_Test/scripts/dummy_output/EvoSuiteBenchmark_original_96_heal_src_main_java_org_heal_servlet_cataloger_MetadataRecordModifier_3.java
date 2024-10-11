// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.CopyrightTextBean;
import org.heal.module.metadata.DiseaseDiagnosisBean;
import org.heal.module.metadata.FormatBean;
import org.heal.module.metadata.KeywordBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.ThumbnailBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.servlet.Action;
import org.heal.util.DateTools;
import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MetadataRecordModifier}.
* It contains one unit test case for the {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
*/
class MetadataRecordModifierTest {
		static {
			try {
				System.loadLibrary("com.sun.jna");
			} catch ( UnsatisfiedLinkError e ) {
				fail(e.getMessage());
			}
        }
        String cwd;
        final PrintWriter out;
    private static final Object lock = new Object();
    private static boolean nextActionIsDefault = true;
    private static final SortedSet contexts = new TreeSet(new KeywordBean.Filter());
    private static final List testActionList = new ArrayList();
    private static final String USER = "admin";
    private static final String DEFAULT = "DEFAULT";
    
    MetadataRecordModifierTest() {
        cwd = System.getProperty("user.dir");
        testActionList.add(NEXT_ACTION_DEFAULT);

        StringBuffer sb = new StringBuffer();
        for (Iterator it = contexts.iterator(); it.hasNext(); ) {
            Map.Entry e = (Map.Entry) (it.next());
            sb.append(e.getKey());
            sb.append(":");
            sb.append((String) (e.getValue()).clone());
            sb.append("\n");
        }
        testActionList.add(new String[] {NEXT_ACTION_DEFAULT, sb.toString().trim()});
    }
    
    private static final List<String> testActionListForFile = new ArrayList();
    static {
        testActionListForFile.add(NEXT_ACTION_DEFAULT);
        testActionListForFile.add(NEXT_ACTION_DEFAULT);
    }
    private static String getNextAction(ServletRequest request) {
        TestContext tc = new TestContext(request);
        String s = "";
        synchronized(lock) {
            while(contexts.isEmpty()){
                try {
                    lock.wait();
                } catch (InterruptedException x) {/*ignore*/}
            }
            s = testActionListForFile.get(testActionListForFile.indexOf(request.getParameter("action")));
            System.out.println("Test action: " + s);
        }
        return s;
    }
    void testEditEditMetadata(CompleteMetadataBean cmb) {
        if(nextActionIsDefault){
            assertTrue(cmb.equals(getNextAction(request)));
        } else {
            assertEquals("Should be same", cmb, getNextAction(request));
        }
    }
    void testGetMetadata(CompleteMetadataBean cmb) {
        SortedSet.Entry entry = (SortedSet.Entry) contexts.first();
        CompleteMetadataBean tmb = (CompleteMetadataBean) entry.getValue();
        assertEquals("Should be same", entry.toString(), cmb.getName());
        assertSame("Should be same", tmb, cmb);
        assertEquals("Should be equal", cmb.getValue(), tmb.getValue());
    }
    List editMetadata(String action, CompleteMetadataBean cmb) {
}
}