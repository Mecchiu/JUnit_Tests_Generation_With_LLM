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
	* It tests the case when the parameter <code>"nextAction"</code> is <code>"editMetadata"</code>.
	*/
	@Test
	void testGetNextAction_1() {
		// Arrange
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		ServletRequest request = null;
		
		// Act
		Action actual = metadataRecordModifier.getNextAction(request);
		
		// Assert
		assertEquals(new EditMetadataAction(), actual);
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the parameter <code>"nextAction"</code> is <code>"editMetadata"</code>.
	*/
	@Test
	void testGetNextAction_2() {
		// Arrange
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		ServletRequest request = null;
		
		// Act
		Action actual = metadataRecordModifier.getNextAction(request);
		
		// Assert
		assertEquals(new EditMetadataAction(), actual);
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the parameter <code>"nextAction"</code> is <code>"editMetadata"</code>.
	*/
	@Test
	void testGetNextAction_3() {
		// Arrange
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		ServletRequest request = null;
		
		// Act
		Action actual = metadataRecordModifier.getNextAction(request);
		
		// Assert
		assertEquals(new EditMetadataAction(), actual);
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the parameter <code>"nextAction"</code> is <code>"editMetadata"</code>.
	*/
	@Test
	void testGetNextAction_4() {
		// Arrange
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		ServletRequest request = null;
		
		// Act
		Action actual = metadataRecordModifier.getNextAction(request);
		
		// Assert
		assertEquals(new EditMetadataAction(), actual);
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the parameter <code>"nextAction"</code> is <code>"editMetadata"</code>.
	*/
	@Test
	void testGetNextAction_5() {
		// Arrange
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		ServletRequest request = null;
		
		// Act
		Action actual = metadataRecordModifier.getNextAction(request);
		
		// Assert
		assertEquals(new EditMetadataAction(), actual);
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the parameter <code>"nextAction"</code> is <code>"editMetadata"</code>.
	*/
	@Test
	void testGetNextAction_6() {
		// Arrange
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		ServletRequest request = null;
		
		// Act
		Action actual = metadataRecordModifier.getNextAction(request);
		
		// Assert
		assertEquals(new EditMetadataAction(), actual);
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the parameter <code>"nextAction"</code> is <code>"editMetadata"</code>.
	*/
	@Test
	void testGetNextAction_7() {
		// Arrange
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		ServletRequest request = null;
		
		// Act
		Action actual = metadataRecordModifier.getNextAction(request);
		
		// Assert
		assertEquals(new EditMetadataAction(), actual);
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the parameter <code>"nextAction"</code> is <code>"editMetadata"</code>.
	*/
	@Test
	void testGetNextAction_8() {
		// Arrange
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		ServletRequest request = null;
		
		// Act
		Action actual = metadataRecordModifier.getNextAction(request);
		
		// Assert
		assertEquals(new EditMetadataAction(), actual);
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the parameter <code>"nextAction"</code> is <code>"editMetadata"</code>.
	*/
	@Test
	void testGetNextAction_9() {
		// Arrange
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		ServletRequest request = null;
		
		// Act
		Action actual = metadataRecordModifier.getNextAction(request);
		
		// Assert
		assertEquals(new EditMetadataAction(), actual);
	}
	
	/**
	* Test case for {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
	* It tests the case when the parameter <code>"nextAction"</code> is <code>"editMetadata"</code>.
	*/
	@Test
	void testGetNextAction_10() {
		// Arrange
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		ServletRequest request = null;
		
		// Act
		Action actual = metadataRecordModifier.getNextAction(request);
		
		// Assert
		assertEquals(new EditMetadataAction(), actual);
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
import javax.