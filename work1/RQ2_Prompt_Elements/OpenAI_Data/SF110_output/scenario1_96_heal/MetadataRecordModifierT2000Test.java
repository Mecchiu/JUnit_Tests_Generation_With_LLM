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
		* The nextAction parameter is null.
		* The expected result is the default action.
		*/
		@Test
		void testGetNextAction1() {
				ServletRequest request = new MockServletRequest();
				MetadataRecordModifier modifier = new MetadataRecordModifier();
				Action action = modifier.getNextAction(request);
				assertEquals(action, Action.NEXT);
		}
		
		/**
		* Test case 2:
		* The nextAction parameter is "".
		* The expected result is the default action.
		*/
		@Test
		void testGetNextAction2() {
				ServletRequest request = new MockServletRequest();
				((MockServletRequest) request).setParameter("nextAction", "");
				MetadataRecordModifier modifier = new MetadataRecordModifier();
				Action action = modifier.getNextAction(request);
				assertEquals(action, Action.NEXT);
		}
		
		/**
		* Test case 3:
		* The nextAction parameter is "next".
		* The expected result is the next action.
		*/
		@Test
		void testGetNextAction3() {
				ServletRequest request = new MockServletRequest();
				((MockServletRequest) request).setParameter("nextAction", "next");
				MetadataRecordModifier modifier = new MetadataRecordModifier();
				Action action = modifier.getNextAction(request);
				assertEquals(action, Action.NEXT);
		}
		
		/**
		* Test case 4:
		* The nextAction parameter is "previous".
		* The expected result is the previous action.
		*/
		@Test
		void testGetNextAction4() {
				ServletRequest request = new MockServletRequest();
				((MockServletRequest) request).setParameter("nextAction", "previous");
				MetadataRecordModifier modifier = new MetadataRecordModifier();
				Action action = modifier.getNextAction(request);
				assertEquals(action, Action.PREVIOUS);
		}
		
		/**
		* Test case 5:
		* The nextAction parameter is "save".
		* The expected result is the save action.
		*/
		@Test
		void testGetNextAction5() {
				ServletRequest request = new MockServletRequest();
				((MockServletRequest) request).setParameter("nextAction", "save");
				MetadataRecordModifier modifier = new MetadataRecordModifier();
				Action action = modifier.getNextAction(request);
				assertEquals(action, Action.SAVE);
		}
		
		/**
		* Test case 6:
		* The nextAction parameter is "cancel".
		* The expected result is the cancel action.
		*/
		@Test
		void testGetNextAction6() {
				ServletRequest request = new MockServletRequest();
				((MockServletRequest) request).setParameter("nextAction", "cancel");
				MetadataRecordModifier modifier = new MetadataRecordModifier();
				Action action = modifier.getNextAction(request);
				assertEquals(action, Action.CANCEL);
		}
		
		/**
		* Test case 7:
		* The nextAction parameter is "delete".
		* The expected result is the delete action.
		*/
		@Test
		void testGetNextAction7() {
				ServletRequest request = new MockServletRequest();
				((MockServletRequest) request).setParameter("nextAction", "delete");
				MetadataRecordModifier modifier = new MetadataRecordModifier();
				Action action = modifier.getNextAction(request);
				assertEquals(action, Action.DELETE);
		}
		
		/**
		* Test case 8:
		* The nextAction parameter is "edit".
		* The expected result is the edit action.
		*/
		@Test
		void testGetNextAction8() {
				ServletRequest request = new MockServletRequest();
				((MockServletRequest) request).setParameter("nextAction", "edit");
				MetadataRecordModifier modifier = new MetadataRecordModifier();
				Action action = modifier.getNextAction(request);
				assertEquals(action, Action.EDIT);
		}
		
		/**
		* Test case 9:
		* The nextAction parameter is "view".
		* The expected result is the view action.
		*/
		@Test
		void testGetNextAction9() {
				ServletRequest request = new MockServletRequest();
				((MockServletRequest) request).setParameter("nextAction", "view");
				MetadataRecordModifier modifier = new MetadataRecordModifier();
				Action action = modifier.getNextAction(request);
				assertEquals(action, Action.VIEW);
		}
		
		/**
		* Test case 10:
		* The nextAction parameter is "search".
		* The expected result is the search action.
		*/
		@Test
		void testGetNextAction10() {
				ServletRequest request = new MockServletRequest();
				((MockServletRequest) request).setParameter("nextAction", "search");
				MetadataRecordModifier modifier = new MetadataRecordModifier();
				Action action = modifier.getNextAction(request);
				assertEquals(action, Action.SEARCH);
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
* It contains ten unit test cases for the {@link MetadataRecord