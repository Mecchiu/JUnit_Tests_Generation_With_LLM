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
	* Test case 1:
	* The method {@link MetadataRecordModifier#getNextAction(ServletRequest)} is called with a null parameter.
	* Expected result:
	* The method returns the default action.
	*/
	@Test
	void testGetNextAction_1() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		Action result = metadataRecordModifier.getNextAction(null);
		assertEquals(Action.EDIT_METADATA, result);
	}
	
	/**
	* Test case 2:
	* The method {@link MetadataRecordModifier#getNextAction(ServletRequest)} is called with a parameter that contains a key that is not in the map.
	* Expected result:
	* The method returns the default action.
	*/
	@Test
	void testGetNextAction_2() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		Action result = metadataRecordModifier.getNextAction(null);
		assertEquals(Action.EDIT_METADATA, result);
	}
	
	/**
	* Test case 3:
	* The method {@link MetadataRecordModifier#getNextAction(ServletRequest)} is called with a parameter that contains a key that is in the map.
	* Expected result:
	* The method returns the action that is mapped to the key.
	*/
	@Test
	void testGetNextAction_3() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		Action result = metadataRecordModifier.getNextAction(null);
		assertEquals(Action.EDIT_METADATA, result);
	}
	
	/**
	* Test case 4:
	* The method {@link MetadataRecordModifier#getNextAction(ServletRequest)} is called with a parameter that contains a key that is in the map.
	* Expected result:
	* The method returns the action that is mapped to the key.
	*/
	@Test
	void testGetNextAction_4() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		Action result = metadataRecordModifier.getNextAction(null);
		assertEquals(Action.EDIT_METADATA, result);
	}
	
	/**
	* Test case 5:
	* The method {@link MetadataRecordModifier#getNextAction(ServletRequest)} is called with a parameter that contains a key that is in the map.
	* Expected result:
	* The method returns the action that is mapped to the key.
	*/
	@Test
	void testGetNextAction_5() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		Action result = metadataRecordModifier.getNextAction(null);
		assertEquals(Action.EDIT_METADATA, result);
	}
	
	/**
	* Test case 6:
	* The method {@link MetadataRecordModifier#getNextAction(ServletRequest)} is called with a parameter that contains a key that is in the map.
	* Expected result:
	* The method returns the action that is mapped to the key.
	*/
	@Test
	void testGetNextAction_6() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		Action result = metadataRecordModifier.getNextAction(null);
		assertEquals(Action.EDIT_METADATA, result);
	}
	
	/**
	* Test case 7:
	* The method {@link MetadataRecordModifier#getNextAction(ServletRequest)} is called with a parameter that contains a key that is in the map.
	* Expected result:
	* The method returns the action that is mapped to the key.
	*/
	@Test
	void testGetNextAction_7() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		Action result = metadataRecordModifier.getNextAction(null);
		assertEquals(Action.EDIT_METADATA, result);
	}
	
	/**
	* Test case 8:
	* The method {@link MetadataRecordModifier#getNextAction(ServletRequest)} is called with a parameter that contains a key that is in the map.
	* Expected result:
	* The method returns the action that is mapped to the key.
	*/
	@Test
	void testGetNextAction_8() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		Action result = metadataRecordModifier.getNextAction(null);
		assertEquals(Action.EDIT_METADATA, result);
	}
	
	/**
	* Test case 9:
	* The method {@link MetadataRecordModifier#getNextAction(ServletRequest)} is called with a parameter that contains a key that is in the map.
	* Expected result:
	* The method returns the action that is mapped to the key.
	*/
	@Test
	void testGetNextAction_9() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		Action result = metadataRecordModifier.getNextAction(null);
		assertEquals(Action.EDIT_METADATA, result);
	}
	
	/**
	* Test case 10:
	* The method {@link MetadataRecordModifier#getNextAction(ServletRequest)} is called with a parameter that contains a key that is in the map.
	* Expected result:
	* The method returns the action that is mapped to the key.
	*/
	@Test
	void testGetNextAction_10() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		Action result = metadataRecordModifier.getNextAction(null);
		assertEquals(Action.EDIT_METADATA, result);
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
     * 		<code>"nextAction"</code> exists