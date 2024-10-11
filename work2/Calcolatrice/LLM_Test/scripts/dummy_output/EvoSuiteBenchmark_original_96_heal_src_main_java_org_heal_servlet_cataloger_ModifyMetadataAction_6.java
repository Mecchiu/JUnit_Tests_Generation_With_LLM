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
		
    @Test
    public void testConstructor() {
    	// noinspection UnnecessaryLocalVariableHiding
    	Map<String,String> modifierMap = new HashMap<String,String>();
    	ModifyMetadataAction modAction = new ModifyMetadataAction();
        assertNotNull(modAction);
        assertTrue(modAction.actionRequiresLogin());
        assertNotNull(modAction.modifierMap);
    }

	@Test
	public void testCreateContextURL() throws IOException, ServletException {
		CompleteMetadataBean mdbean = new CompleteMetadataBean();
		CompleteMetadataBean mdbeanF = new CompleteMetadataBean();
		mdbean.setContributionLabel(new ContributionLabel(CompleteMetadataBean.CONT_LABEL));

		MetadataModifier<CompleteMetadataBean,CompleteMetadataBean> metMod = new MetadataModifier<CompleteMetadataBean,CompleteMetadataBean>(null);
		mdbeanF.setModificationResult(metMod);
		mdbeanF.setMetadata(mdbean);
		assertEquals(CompleteMetadataBean.CONT_LABEL, mdbean.getContributionLabel().getLabel());
		assertEquals(CompleteMetadataBean.CONT_LABEL, metMod.getModToModify().getMetadata().getContributionLabel().getLabel());

		CompleteMetadataBean mdbeanNew = new CompleteMetadataBean();
		mdbeanNew._id = mdbeanF._id;
		mdbeanNew.setContributionLabel(new ContributionLabel("newLabel"));

		assertEquals("newLabel", metMod.getModToModify().getMetadata().getContributionLabel().getLabel());
		assertEquals(CompleteMetadataBean.CONT_LABEL, mdbean.getContributionLabel().getLabel());

		ModifyMetadataAction modAction = new ModifyMetadataAction();
		modifierMap = modAction.actionRequiresLogin(mdbeanF);
		assertEquals(EmptyMetadataBean.EMPTY_METADATA,modifierMap.get(mdbeanF.getMetadata().getContributionLabel().getLabel()));
		assertEquals("newLabel", mdbeanNew.getContributionLabel().getLabel());
		assertEquals("newLabel", metMod.getModToModify().getMetadata().getContributionLabel().getLabel());

		// test that it can change the modification result, and not return that result
		CompleteMetadataBean mdbeanModify = new CompleteMetadataBean();
		mdbeanModify._id = mdbeanNew._id;
		CompletionStatus cstat = metMod.actionRequiresLogin(mdbeanModify);
		assertNotEquals(COMPLETE_STATUS, cstat);
		assertEquals(CompleteMetadataBean.CONT_LABEL, mdbean.getContributionLabel().getLabel());
		assertEquals("newLabel", mdbeanModify.getMetadata().getContributionLabel().getLabel());
	}
	
	@Test
	public void testCreateCopyrightHolder() throws IOException, ServletException {
		CompleteMetadataBean mdbean = new CompleteMetadataBean();
		mdbean.setContributionLabel(new ContributionLabel(CompleteMetadataBean.CONT_LABEL));

		CompletionStatus copyrightHolder = metMod.actionRequiresLogin(mdbean);
		CompletionStatus copyright = metMod.actionRequiresLogin(mdbean);
		assertNotEquals(CompletionStatus.SUCCESS,copyrightHolder);
		assertNotEquals(CompletionStatus.SUCCESS,copyright);
		assertEquals("<no copyright holder>",copyrightHolder.getMessage());

		ModifyMetadataAction modAction = new ModifyMetadataAction();
		modifierMap = modAction.actionRequiresLogin(mdbean);
		assertEquals(CompleteMetadataBean.CONT_LABEL, mdbean.getContributionLabel().getLabel());
		assertEquals(CompleteMetadataBean.CONT_LABEL, metMod.getModToModify().getMetadata().getContributionLabel().getLabel());
	}
	
	@Test
	public void testCreateContributor() throws IOException, ServletException {
		CompleteMetadataBean mdbean = new CompleteMetadataBean();
		mdbean.setContributionLabel(new ContributionLabel(CompleteMetadataBean.CONT_LABEL));

		CompletionStatus contributor = metMod.actionRequiresLogin(mdbean);
		assertNotEquals(COMPLETE_STATUS,contributor);
		assertNotEquals(CompletionStatus.SUCCESS,contributor);
		assertEquals("<no contributor>",contributor.getMessage());
	}
	
	private Map<String,String> actionMap;
}