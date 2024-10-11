// ModifyMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyMetadataAction}.
* It contains one unit test case for the {@link ModifyMetadataAction#actionRequiresLogin()} method.
*/
class ModifyMetadataActionTest {
		
	/**
	 * This test case performs a POST to the login page; without valid
	 * <code>CompleteMetadataBean</code>.  After the session is invalidated,
	 * this test ensures that when the logged in user attempts to access the
	 * next page is handled correctly.
	 * @throws Exception
	 *
	 */
	@Test
	public void testWithValidMetadata() throws Exception {
		CompleteMetadataBean completeMetaBeanVal = new CompleteMetadataBean();
		completeMetaBeanVal.setMetadataModifierName("metadata");
		completeMetaBeanVal.setMetadataType(CompleteMetadataBean.MetadataType.CONTROLLED);
        completeMetaBeanVal.setConstrain(false); 
		
		// Login the user.
		String user =AuthenticationTools.getCurrentUser();
		completeMetaBeanVal.setUserID(user);
		
		// Perform action
		ModifyMetadataAction.perform(this.getClass().getResource("/modify-metadata-action-with-valid-metadata.xhtml"), 
				this.createRequest(completeMetaBeanVal), this.createResponse(200));
	

		assertNotNull(CompleteMetadataBean.DEFAULT_CONTROLLED_METADATA);
		
		CompleteMetadataBean completeMetaBeanVal2 = CompleteMetadataBean.DEFAULT_CONTROLLED_METADATA;
		
		
		CompleteMetadataBean completeMetaBean = completeMetaBeanVal2.createCompleteMetadataBean();
		Map<MetadataModifier,String> modifierMap = completeMetaBean.getMetadataModifierMap();
				
		
		assertEquals(CompleteMetadataBean.METADATA_MODIFIER_NAME, completeMetaBean.getMetadataModifierName());
		assertEquals(CompleteMetadataBean.METADATA_TYPE_CONTROLLED, completeMetaBean.getMetadataType().value());
		assertFalse(CompleteMetadataBean.isContainValidValue(null));
		assertNotNull(modifierMap);
		assertEquals(1, modifierMap.size());
		assertTrue(modifierMap.get(CompleteMetadataBean.CONTROLLED_METADATA_MODIFIER) == completeMetaBeanVal2.getName());
		System.out.println("Completed test using mock.");
	}
	
	/**
	 * This test test a GET after POST to the login page; without valid
	 * <code>CompleteMetadataBean</code>.  After the session is invalidated,
	 * this test ensures that when the logged in user attempts to access the
	 * next page is handled correctly.
	 * @throws Exception
	 *
	 */
	@Test
	public void testNoValidMetadata() throws Exception {
		
		// Login the user.
		String user =AuthenticationTools.getCurrentUser();
		CompleteMetadataBean completeMetaBeanVal = new CompleteMetadataBean();
		completeMetaBeanVal.setMetadataModifierName("metadata");
		completeMetaBeanVal.setMetadataType(CompleteMetadataBean.UnspecifiedMetadataType);
		completeMetaBeanVal.setConstrain(false); 
		
		// Perform action
		ModifyMetadataAction.perform(this.getClass().getResource("/modify-metadata-action-without-valid-metadata.xhtml"), 
				this.createRequest(completeMetaBeanVal), this.createResponse(200));
		
		assertNull(completeMetaBeanVal.getName());
		assertNull(CompleteMetadataBean.DEFAULT_CONTROLLED_METADATA);
	}
	
	
	/**
	 * This test test a POST for the login page; with an invalid
	 * <code>MetadataModifier</code>.  After the session is invalidated,
	 * this test ensures that when the logged in user attempts to access the
	 * next page is handled correctly.
	 * @throws Exception
	 *
	 */
	@Test
	public void testInvalidMetadataModifier() throws Exception {
		CompleteMetadataBean completeMetaBeanVal = new CompleteMetadataBean();
		completeMetaBeanVal.setMetadataModifier(new CompleteMetadataModifier("error-message"));
		completeMetaBeanVal.setMetadataType(CompleteMetadataBean.UnspecifiedMetadataType);
		completeMetaBeanVal.setConstrain(false); 
		
		// Login the user.
		String user =AuthenticationTools.getCurrentUser();
		completeMetaBeanVal.setUserID(user);

		// Perform action
}
}