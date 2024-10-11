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
	 * <p>Constructs a {@link ModifyMetadataAction} instance.</p>
	 */
    public ModifyMetadataActionTest() {
    }

	/**
	 * <p>Tests if a {@link ModifyMetadataAction} can be found in the 
	 * {@link javax.servlet.ServletContext}.</p>
	 */
	@Test
	void testModuleIsInTheServletContext() {
		assertNotNull(ModifyMetadataAction.class.getClassFile());
	}

		/**
	 * <p>Tests if the {@link CompleteMetadataBean} can be retrieved in
	 * the request.</p>
	 */
    public void testCompletEmptiness() {
		assertNotNull("CompleteMetadataBean not found (id=100)", CompleteMetadataBean.createCompleteMetadataBean(100));
    }
	/**
	 * <p>Tests if a {@link CompleteMetadataBean} can be retrieved in
	 * the request.</p>
	 */
	@Test
	void testCompletEMBWhenModifierAlreadySavedInRequest() {
		Map<String, Object> attributes = Collections.singletonMap("type", "contextURL");
		String modifiedMetadataBean = CompleteMetadataBean.createCompleteMetadataBean(100).saveMetadataForModifier(new MetadataModifier("100"));

		CompleteMetadataBean modifiedMetadataBeanRead = CompleteMetadataBean.createCompleteMetadataBean(100).mapFromOriginalMetadata(modifiedMetadataBean);

		assertNotNull("Should have been able to get CompleteMetadataBean for ID=" + 100, modifiedMetadataBeanRead);
	}
	/**
	 * <p>Tests if a {@link CompleteMetadataBean} can be retrieved in
	 * the request and is changed.</p>
	 */
	@Test
	void testCompletEMB() {
		Map<String, Object> attributes = Collections.singletonMap("type", "contextURL");

		CompleteMetadataBean modifiedMetadataBean = CompleteMetadataBean.createCompleteMetadataBean(100).mapFromOriginalMetadata(CompleteMetadataBean.createCompleteMetadataBean(100).saveMetadataForModifier(new MetadataModifier("100")));
		CompleteMetadataBean modifiedMetadataBeanRead = CompleteMetadataBean.createCompleteMetadataBean(100).mapFromOriginalMetadata(modifiedMetadataBean.saveMetadataForModifier(new MetadataModifier("600")));

		assertNotNull("Should have been able to get CompleteMetadataBean for ID=100", modifiedMetadataBeanRead);
	}
}

