// EditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import org.heal.util.VCardBean;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditMetadataAction}.
* It contains one unit test case for the {@link EditMetadataAction#actionRequiresLogin()} method.
*/
class EditMetadataActionTest {

	@Test
    public void testEditMetadataSuccessfully() throws Exception {

    		List<CompleteMetadataBean> metadatas = this.service.findCompleteMetadata();

    		// Test the list
    		Map<String, String> metadataChangedMap = new HashMap<>();
    		metadataChangedMap.put("updatedby", "foo");
    		metadataChangedMap.put("updatedbygroup", "bar");
    		metadataChangedMap.put("updatedbyuser", "baz");
    		metadataChangedMap.put("updatedbygroupuser", "quux");
    		metadataChangedMap.put("updatedbyuseruser", "baz");
    		metadataChangedMap.put("updatedbygroupuser", "quux");
    		// Test that it doesn't return a 404
    		assertEquals(true, this.service.editMetadata(new CompleteMetadataBean(metadatas), metadataChangedMap).isSuccess());
    	}

    @Test
    public void testEditMetadataMissingFields() throws Exception {

    		// Test that an IllegalArgumentException occurs if a required field
    		// is not set
    		Exception invalidTestException = new IllegalArgumentException("Missing required field: updatedbyuser group");

    		this.service.editMetadata(new CompleteMetadataBean(), null);
    		assertEquals(invalidTestException.getClass(), Exception.class);
    		assertEquals("Missing required field: updatedby", invalidTestException.getMessage());
    	}

    @Test
    public void testEditMetadataFailure() throws Exception {
    		// Test the list
    		List<CompleteMetadataBean> metadatas = this.service.findCompleteMetadata();

    		// Test that there is no success
    		assertEquals(true, this.service.editMetadata(new CompleteMetadataBean(), new HashMap<String, String>()).isSuccess());
    }

    @Test
    public void testEditMetadataFailureWithEmptyValues() throws Exception {
    	Map<String, String> metadataChangedMap = new HashMap<>();
    	metadataChangedMap.put("updatedby", "");
    	metadataChangedMap.put("updatedbyuser", "");
    	metadataChangedMap.put("updatedbyusergroup", "");
		this.service.editMetadata(new CompleteMetadataBean(), metadataChangedMap);
		assertEquals(false, this.service.editMetadata(new CompleteMetadataBean(), metadataChangedMap).isSuccess());
    }

    @Test
    public void testEditMetadataFailureWithInvalidValues() throws Exception {
    	Map<String, String> metadataChangedMap = new HashMap<>();
    	metadataChangedMap.put("updatedby", "foo");
    	metadataChangedMap.put("updatedbygroup", "foo");
		this.service.editMetadata(new CompleteMetadataBean(), metadataChangedMap);
		assertEquals(false, this.service.editMetadata(new CompleteMetadataBean(), metadataChangedMap).isSuccess());
    }

    @Test
    public void testEquality() throws Exception {

    	// Test that each object has the same hash code
    	Map<String, String> map1 = new HashMap<>();
    	Map<String, String> map2 = new HashMap<>();

    	metadata1: {
    	    	CompleteMetadataBean metadata = new CompleteMetadataBean();
    	    	metadata.setName("This metadata should not change!");
    	    	map1.put("updatedbygroup", "foo");
    	    	map1.put("updatedbygroupgroup", "bar");
    	        map1.put("updatedbyuser", "baz");
    	    	map1.put("updatedbyusergroup", "quux");
    	        map1.put("updatedbyuseruser", "baz");
    	    	map1.put("updatedbyuseruser", "quux");
    	    	map1.put("updatedbyuserusergroup", "quux");
    	        map1.put("updatedbygroupuser", "quux");
    	        map1.put("updatedbyusergroupuser", "quux");
    	        map1.put("updatedbygroupuseruser", "quux");
    	        map2.put("updatedbygroup", "bar");
    	        map2.put("updatedbygroup", "");
    	        map2.put("updatedby", "baz");
    	        map2.put("updatedbyuser", "baz");
    	        map2.put("updatedbyusergroup", "bar");
    	    	map2.put("updatedbyuseruser", "baz");
    	    	map2.put("updatedbyuserusergroup", "bar");
    	        map2.put("updatedbygroupuser", "quux");
    	        map2.put("updatedbygroupuser", "baz");
    	    	map2.put("updatedbygroupuseruser", "quux");
    	        map2.put("updatedbygroupuseruser", "baz");
    	        map2.put("updatedbygroupuserusergroup", "quux");
    	    	map2.put("updatedby", "");
    	        map2.put("updatedbygroup", "");
    	        map2.put("updatedbygroupuser", "");
    	        map2.put("updatedbyuseruser", "");
    	        map2.put("updatedbyuserusergroup", "");
    	        map2.put