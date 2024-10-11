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
		* It tests the case when the nextAction parameter is null.
		*/
		@Test
		void testGetNextAction_1() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof EditMetadataAction);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is empty.
		*/
		@Test
		void testGetNextAction_2() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof EditMetadataAction);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is editContextURL.
		*/
		@Test
		void testGetNextAction_3() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "editContextURL");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof EditContextURLAction);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is editContributor.
		*/
		@Test
		void testGetNextAction_4() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "editContributor");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof EditContributorAction);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is editCopyrightHolder.
		*/
		@Test
		void testGetNextAction_5() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "editCopyrightHolder");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof EditCopyrightHolderAction);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is editControlledVocab.
		*/
		@Test
		void testGetNextAction_6() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "editControlledVocab");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof EditControlledVocabularyAction);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is editRequirement.
		*/
		@Test
		void testGetNextAction_7() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "editRequirement");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof EditRequirementAction);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is editRelation.
		*/
		@Test
		void testGetNextAction_8() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "editRelation");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof RelationRecordModifier);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is editMetametadataIdentifier.
		*/
		@Test
		void testGetNextAction_9() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "editMetametadataIdentifier");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof MetametadataIdentifierRecordModifier);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is editMetametadataContributor.
		*/
		@Test
		void testGetNextAction_10() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "editMetametadataContributor");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof MetametadataContributorRecordModifier);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is saveMetadata.
		*/
		@Test
		void testGetNextAction_11() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "saveMetadata");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof SaveMetadataAction);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
		* It tests the case when the nextAction parameter is invalid.
		*/
		@Test
		void testGetNextAction_12() {
				MetadataRecordModifier mrm = new MetadataRecordModifier();
				ServletRequest request = new MockServletRequest();
				request.setParameter("nextAction", "invalid");
				Action action = mrm.getNextAction(request);
				assertTrue(action instanceof EditMetadataAction);
		}
		
		/**
		* Test case for {@link MetadataRecordModifier#updateMetadata(CompleteMetadataBean, ServletRequest