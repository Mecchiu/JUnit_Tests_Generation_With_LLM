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
		
	private final Map<String, MetadataModifier> mockMap = new HashMap();
	private final Map<String, MetadataModifier> inProgressMap = new HashMap();

	@Test
	public void test() {
		assertEquals("Incorrect number of mock requests", 17, mockMap.size());
		assertEquals("Incorrect number of inprogress requests", 17, inProgressMap.size());
		
		// test success, no modification of metadata
		
		CompleteMetadataBean response = new CompleteMetadataBean();		
		
		Action modified = new ModifyMetadataAction();
		modified.perform(null, null, response);
		
		assertNull("Modification of metadata should be done by the ModifyMetadataAction",
				mockMap.get("metadata"));
		
		modified = new ModifyMetadataAction();
		modified.perform(response, null);
		
		assertTrue("Modification of metadata should be done by the ModifyMetadataAction",
				mockMap.get("metadata"));
		
		modified = new ModifyMetadataAction();
		modified.perform(response, null);
		assertTrue("Modification of metadata should be done by the ModifyMetadataAction",
				inProgressMap.get("metadata"));
		
		// test failure, invalid modification of metadata
		
		response = new CompleteMetadataBean();
		mockMap.put("metadata", new MetadataRecordModifier("test"));
		
		modified = new ModifyMetadataAction();
		modified.perform(response, null);
		
		assertTrue("Modification of metadata should be done by the ModifyMetadataAction",
				mockMap.get("metadata"));
		
		modified = new ModifyMetadataAction();
		modified.perform(response, null);
		
		assertTrue("Modification of metadata should be done by the ModifyMetadataAction",
				inProgressMap.get("metadata"));

		// test failure, invalid modification of metadata
		
		response = new CompleteMetadataBean();
		mockMap.put("metadata", new MetadataRecordModifier("test"));
		
		modified = new ModifyMetadataAction();
		modified.perform(response, null);
		
		assertTrue("Modification of metadata should be done by the ModifyMetadataAction",
				inProgressMap.get("metadata"));
		
		modified = new ModifyMetadataAction();
		modified.perform(new HttpServletRequest(), response, null);
		
		assertTrue("Modification of metadata should be done by the ModifyMetadataAction",
				inProgressMap.get("metadata"));
		
		// test success, valid modification of metadata
		
}
}