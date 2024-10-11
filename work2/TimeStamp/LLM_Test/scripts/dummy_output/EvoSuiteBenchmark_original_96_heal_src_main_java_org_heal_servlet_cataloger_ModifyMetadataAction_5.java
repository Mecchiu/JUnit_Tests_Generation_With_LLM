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
		 * @throws IOException exception to test the exception thrown by the
		 * {@link HttpServletRequest#getSession()}
		 */
	static void setUp() throws IOException {
		TestUtil.setupCommonConfig();
	}
	/**
	 * @throws IOException exception to test the exception thrown by the
	 * {@link HttpServletRequest#getSession(boolean)}
	 */
	static void tearDown() throws IOException {
		TestUtil.setupCommonConfig();
	}

	static Map<Map.Entry<String, MetadataModifier>, Collection<MetadataRecordModifier>> data = new HashMap<>();

	static public void testModifyMetadataAction() throws Exception {
		setUp();
		
		String metadata = "Test metadata";
		CompleteMetadataBean completeMetadata = new CompleteMetadataBean();
		completeMetadata.setMetadata(metadata);
		CompleteMetadataBean modifyMetadata = null;
		Collection<MetadataRecordModifier> modifiers = Collections.synchronizedList(new HashSet<MetadataRecordModifier>());
		modifierMap = new HashMap<>(1, 1.0F);
		modifierMap.put(new Map.Entry<String, MetadataModifier>("metadata", new MetadataRecordModifier(metadata, new ContextURLRecordModifier(null))), modifiers);
		data.put(data.entrySet().iterator().next(), modifiers);
		
		mapSession(request, response, (Map)data.get("metadata"));
		
		assertNotNull(modifyMetadata = request.getSession().get(ModifyMetadataActionTest.class.getCanonicalName() + ".modifyMetadataAction"));
		completeMetadata = modifyMetadata.getCompleteMetadata();
		assertEquals(metadata, (String)completeMetadata.getMetadata());
	}
}