// EditControlledVocabularyActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditControlledVocabularyAction}.
* It contains one unit test case for the {@link EditControlledVocabularyAction#actionRequiresLogin()} method.
*/
class EditControlledVocabularyActionTest {

	@Test
	/** 
	 * Test case for the constructor of an action.
	 * The constructor is not null-checked.
	 */
	public void testConstructor() throws ServletException {
		
		assertNotNull(new EditControlledVocabularyAction());

		// Test for action parameter validity checks
		assertNotNull(new EditControlledVocabularyAction(""));

		final String v = "newVocab";
		assertNotNull(new EditControlledVocabularyAction(v));
	}


	@Test
	/** 
	 * Test case for the case when a parameter is missing.
	 * We use {@link #testConstructor()}
	 */
	public void testMissingParam() {
		
		assertNotNull(new EditControlledVocabularyAction());
		
		// If the parameter is missing, an exception should be raised after the action is completed.
		String v = null;
		try {
			new EditControlledVocabularyAction(v);
		} catch (IllegalArgumentException e) { 
			assertNull(e);
		}
	}
	
	// ===================================================================================
	
	/** Test data. */
	private final static String SPECIFIED_PARAM = "--specified--";
	
	/** Test data for a {@link CompleteMetadataBean} with the {@link #specifiedParam}. */ 
	private final static String SPECIFIED_VAL = "some specific data";
	

	/** Test data where the final data is a complete {@link CompleteMetadataBean}, but where the specified 
	 * {@link #specifiedParam} is the prefix of the current {@link CompleteMetadataBean}. <br>
	 * If a {@link #specifiedParam} is absent, the current {@link CompleteMetadataBean} will be returned. 
	 * @see #SPECIFIED_PARAM
	 */
	public final static String SPECIFIED_VAL_COMPLETE_METADATA = ".complete-metadata";

	/** Test data where the final data is a complete {@link CompleteMetadataBean}, but where the current 
	 * {@link CompleteMetadataBean} is not a complete {@link CompleteMetadataBean}. 
	 * @see #SPECIFIED_VAL
	 */
	public final static String NONE_SPECIFIED_VAL = "--NONE--";

	/** Test data where the final data is null. */
	public final static String NULL_VAL = "null";
	
	/** Test data where the final data is an empty string. */
	public final static String EMPTY_VAL = "";


	/** Test data where the final data is the specified {@link CompleteMetadataBean}. */
	private final static String SPECIFIED_VAL_COMMON_METADATA = ".common-metadata";

	/** Test data where the specified {@link CompleteMetadataBean}. */
	private final static String SPECIFIED_SOMETHING_COMPLEMETADATA = "some-other-metadata-something";
	
	/** Test data where the {@link CompleteMetadataBean} has metadata but it is not a valid key. */
	private final static String SPECIFIED_KEY_MALFORMED_COMMON_METADATA = "--specified-malformed--";

	/** Test data where the {@link CompleteMetadataBean} has no metadata except {@link #SPECIFIED_KEY_MALFORMED_COMMON_METADATA}. */
	private final static String SPECIFIED_KEY_MALFORMED_SPECIFIED_COMMON_METADATA = "--some_specified_malformed--";


	/** Test data where the {@link CompleteMetadataBean} has no metadata. */
	private final static String NONE_VAL_COMPLETE_METADATA = ".complete-metadata-none";
	
	

	/** Test data where the complete metadata is missing because the current metadata has the key 
	 * "{@link #SPECIFIED_KEY_MALFORMED_SPECIFIED_COMMON_METADATA}". */ 
	private final static String SAME_VAL_SOMETHING_COMPLEMETADATA = "--same-something--";
	
	// ===================================================================================
	
	@Test
	public void testActionRequiresLogin() throws ServletException, IOException {
		
		EditControlledVocabularyAction action = new EditControlledVocabularyAction("test", null, "", false, true);
		assertFalse(action.requiresLogin());
		
		// We should not fail here if an action requires a login.
		//action.setRequiresLogin(true);

		try{
			action.actionRequiresLogin();
			fail("An error has been expected.");
		} catch (ServletException e) { 
			assertNotNull(e); 
		}
	}
	
	@Test
	public void testNoAuthUserWithNoSpecifiedMetadata() throws ServletException, IOException {	
		EditControlledVocabularyAction action = new EditControlledVocabularyAction(null, null, "", false, true);
		assertTrue(action.requiresLogin());
		assertTrue(action.actionRequiresLogin());
	}
	
	@Test
	public void testNoAuthAuthenticatedUserWithNoSpecifiedMetadata() throws ServletException, IOException {
		EditControlledVocabularyAction action = new EditControlledVocabularyAction("", null, "", false, true);
		assertTrue(action.requiresLogin());
		assertTrue(action.actionRequiresLogin());
	}	
	
	@Test
	public void testNoAuthUserWithNoSpecifiedValue() throws ServletException, IOException {
		EditControlledVocabularyAction action = new EditControlledVocabularyAction("", null, "", false, false);
		assertFalse(action.requiresLogin());
		assertFalse(action.actionRequiresLogin());
	}
	
	@Test
	public void testNoAuthUserWithNoSpecifiedMetadataValue() throws ServletException, IOException { 
		EditControlledVocabularyAction action = new EditControlledVocabularyAction("", null, null, false, false);
		assertFalse(action.requiresLogin());
		assertFalse(action.actionRequiresLogin());
	}	
	
	@Test
	public void testNoAuthAuthUserMissing() throws ServletException, IOException {
		EditControlledVocabularyAction action = new EditControlledVocabularyAction("someKey", "", "", false, false);
		assertFalse(action.