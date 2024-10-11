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
* It contains ten unit test cases for the {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
*/
class MetadataRecordModifierTest {

	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"save"</code>.
	*/
	@Test
	void testGetNextAction_save() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndAdd"</code>.
	*/
	@Test
	void testGetNextAction_saveAndAdd() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndEdit"</code>.
	*/
	@Test
	void testGetNextAction_saveAndEdit() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndView"</code>.
	*/
	@Test
	void testGetNextAction_saveAndView() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndSearch"</code>.
	*/
	@Test
	void testGetNextAction_saveAndSearch() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndBrowse"</code>.
	*/
	@Test
	void testGetNextAction_saveAndBrowse() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndHome"</code>.
	*/
	@Test
	void testGetNextAction_saveAndHome() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndLogout"</code>.
	*/
	@Test
	void testGetNextAction_saveAndLogout() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>null</code>.
	*/
	@Test
	void testGetNextAction_null() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is empty.
	*/
	@Test
	void testGetNextAction_empty() {
		// TODO: implement this test
	}
}

// MetadataRecordModifier.java
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

/**
 * <p>A {@link MetadataModifier} which fills the basic metadata information
 * from a <code>ServletRequest</code> into a {@link CompleteMetadataBean}.</p>
 */
public class MetadataRecordModifier implements MetadataModifier {

    /**
     * @param request Used to get the parameter <code>"nextAction"</code>, which
     * 		determines what the next {@link Action} to take will be.  If no
     * 		<code>"nextAction"</code> exists, a valid {@link Action} will still
     * 		be returned.
     * @return The next {@link Action} to take after saving the metadata from
     * 		the form.
     */
    public Action getNextAction(ServletRequest request) {
        String nextAction = request.getParameter("nextAction");
        if (nextAction == null) {
            return Action.SAVE;
        } else if (nextAction.equals("save")) {
            return Action.SAVE;
        } else if (nextAction.equals("saveAndAdd")) {
            return Action.SAVE_AND_ADD;
        } else if (nextAction.equals("saveAndEdit")) {
            return Action.SAVE_AND_EDIT;
        } else if (nextAction.equals("saveAndView")) {
            return Action.SAVE_AND_VIEW;
        } else if (nextAction.equals("saveAndSearch")) {
            return Action.SAVE_AND_SEARCH;
        } else if (nextAction.equals("saveAndBrowse")) {
            return Action.SAVE_AND_BROWSE;
        } else if (nextAction.equals("saveAndHome")) {
            return Action.SAVE_AND_HOME;
        } else if (nextAction.equals("saveAndLogout")) {
            return Action.SAVE_AND_LOGOUT;
        } else {
            return Action.SAVE;
        }
    }
}

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
* It contains ten unit test cases for the {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
*/
class MetadataRecordModifierTest {
		
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"save"</code>.
	*/
	@Test
	void testGetNextAction_save() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndAdd"</code>.
	*/
	@Test
	void testGetNextAction_saveAndAdd() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndEdit"</code>.
	*/
	@Test
	void testGetNextAction_saveAndEdit() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndView"</code>.
	*/
	@Test
	void testGetNextAction_saveAndView() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndSearch"</code>.
	*/
	@Test
	void testGetNextAction_saveAndSearch() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndBrowse"</code>.
	*/
	@Test
	void testGetNextAction_saveAndBrowse() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndHome"</code>.
	*/
	@Test
	void testGetNextAction_saveAndHome() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>"saveAndLogout"</code>.
	*/
	@Test
	void testGetNextAction_saveAndLogout() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is <code>null</code>.
	*/
	@Test
	void testGetNextAction_null() {
		// TODO: implement this test
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the <code>"nextAction"</code> parameter is empty.
	*/
	@Test
	void testGetNextAction_empty() {
		// TODO: implement this test
	}
}

// MetadataRecordModifier.java
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

/**
 * <p>A {@link MetadataModifier} which fills the basic metadata information
 * from a <code>ServletRequest</code> into a {@link CompleteMetadataBean}.</p>
 */
public class MetadataRecordModifier implements MetadataModifier {

    /**
     * @param request Used to get the parameter <code>"nextAction"</code>, which
     * 		determines what the next {@link Action} to take will be.  If no
     * 		<code>"nextAction"</code> exists, a valid {@link Action} will still
     * 		be returned.
     * @return The next {@link Action} to take after saving the metadata from
     * 		the form.
     */
    public Action getNextAction(ServletRequest request) {
        String nextAction = request.getParameter("nextAction");
        if (nextAction == null) {
            return Action.SAVE;
        } else if (nextAction.equals("save")) {
            return Action.SAVE;
        } else if (nextAction.equals("saveAndAdd")) {
            return Action.SAVE_AND_ADD;
        } else if (nextAction.equals("saveAndEdit")) {
            return Action.SAVE_AND_EDIT;
        } else if (nextAction.equals