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
 * Test method for {@link ModifyMetadataAction#actionRequiresLogin()}.
 * @throws Exception
*/
@Test
  public void testRequiresLogin() throws Exception {
    assertEquals(true, this.actionRequiresLogin());
  }
	
	/** Test {@link ModifyMetadataAction} to complete the Form, and the Map of metadata fields. */
	@Test
  public void completeSectionsAndFieldsTest() throws IOException {
		MetadataModifier m = new MetadataModifier();
		m.setFormName("Form name");
		m.setFormType("Form type");
		m.setContextURL("ContextURL");
		m.setCopyableVocabulary("Copyable vocabulary");
		m.setControlledVocabulary(3, true);
		m.setIncludeContributionVocabulary(true);
		Map  record = m.createMetadata();
		CompleteMetadataBean completeBean = (CompleteMetadataBean) record.get("completeData");
		assertEquals("Form name", completeBean.getFieldValue("name"));
		assertEquals("Form type", completeBean.getFieldValue("type"));
		
		//TODO: verify the Map
//		Map<String, Map<String, String>> fieldsMap = new HashMap<String, Map<String, String>>();
//		fieldsMap.put("value1", createMap("v1", "value1", "v2"));
//		fieldsMap.put("value2", createMap("v3", "value1", "v2"));
//		fieldsMap.put("value3", createMap("v4", "value2", "v4"));
//		completeBean.setFieldsMap(fieldsMap);
	}
}
