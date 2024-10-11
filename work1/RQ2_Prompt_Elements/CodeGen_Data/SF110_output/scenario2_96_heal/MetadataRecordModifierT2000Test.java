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

	@Test
	void testGetNextActionNoAction() {
		assertNull(MetadataRecordModifier.getNextAction(new ServletRequest()));
	}
	
	@Test
	void testGetNextActionValidAction() {
		ServletRequest req = new ServletRequest();
		Map<String, Object> ret = null;
		String nextActionKey = "nextAction";
		Action action = MetadataRecordModifier.getNextAction(req);
		assertNotNull(action);
		assertNotNull(String.valueOf(ret));
		ret = (Map) action;
		Map retMap = (Map) ret;
		Iterator iter = retMap.entrySet().iterator();
		assertEquals(MetadataRecordModifier.NEXT_ACTION_VALID_ACTION, nextActionKey);
		iter.next();
		assertEquals(MetadataRecordModifier.NEXT_ACTION_VALID_ACTION, iter.next() );
		assertNotNull(iter.next());
		assertEquals(MetadataRecordModifier.NEXT_ACTION_VALID_ACTION, iter.next());
	}
	
	@Test
	void testGetNextActionDefault() {
		assertEquals(MetadataRecordModifier.NEXT_ACTION_DEFAULT, MetadataRecordModifier.getNextAction(new ServletRequest()).toString());
	}
	
	@Test
	void testGetNextActionDefaultNoAction() {
		assertEquals("", MetadataRecordModifier.getNextAction(new ServletRequest()).toString());
	}
	
	@Test
	void testGetNextActionNotFoundAction() {
		ServletRequest req = null;
		Map<String, Object> ret = null;
		String nextActionKey = "nextAction";
		Action action = MetadataRecordModifier.getNextAction(req);
		assertNotNull(action);
		assertNotNull(nextActionKey);
		assertNotNull(ret);
		ret = (Map) action;
		Map retMap = (Map) ret;
		assertNotNull(retMap);
		assertFalse(retMap.containsKey("notFoundAction"));
	}
	
	@Test
	void testGetNextActionInvalidAction() {
		ServletRequest req = null;
		Map<String, Object> ret = null;
		String nextActionKey = "nextAction";
		Action action = MetadataRecordModifier.getNextAction(req);
		assertNull(action);
		HashMap<String, String> params = new HashMap<String, String>();
		ret = new HashMap<String, String>();
		ret.put(MetadataRecordModifier.NEXT_ACTION_VALID_ACTION, nextActionKey);
		params.put(MetadataRecordModifier.NEXT_ACTION_VALID_ACTION, "notFound");
		Action actionParam = new Action(params);
		errUnexpectedValue(actionParam);
	}
	
	@Test
	void testGetNextActionInvalidActionNoAction() {
		ServletRequest req = new ServletRequest();
		Map<String, Object> ret = null;
		String nextActionKey = "nextAction";
		Action action = MetadataRecordModifier.getNextAction(req);
		assertNull(action);
		HashMap<String, String> params = new HashMap<String, String>();
		ret = new HashMap<String, String>();
		params.put(MetadataRecordModifier.NEXT_ACTION_VALID_ACTION, "notFound");
		Action actionParam =