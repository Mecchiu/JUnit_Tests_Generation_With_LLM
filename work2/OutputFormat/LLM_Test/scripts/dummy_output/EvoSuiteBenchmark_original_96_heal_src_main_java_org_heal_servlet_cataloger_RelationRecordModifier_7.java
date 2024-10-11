// RelationRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.CompleteMetadataBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RelationRecordModifier}.
* It contains one unit test case for the {@link RelationRecordModifier#actionRequiresLogin()} method.
*/
class RelationRecordModifierTest {
		
	@Test
	public void testNonExistingRelation() {
		assertNotNull(findRelationBean(null));
	}
	
		/** Test the case where not logged in. */
	@Test
	public void testNotLoggedIn() {
		assertNull(findRelationBean(null));
	}

	@Test
	public void testNonExistingRelationNonAuth() {
		assertNull(findRelationBean(null, "NonAuthRelationId"));
	}
	
	@Test
	public void testNonExistingRelationNoSuchAction() {
		assertNotNull(findRelationBean(null, "NonExistingAction"));
	}
	
	@Test
	public void testNonExistingActionDoesNotExist() {
		assertNull(findRelationBean(null, "NonExistingActionId"));
	}
        
        /** Test the case of a relation with an existing action. */
	@Test
	public void testNonExistingAction() {
		assertNotNull(findRelationBean(null, "NonExistingActionId"));
        }
        
        /** Test the case of an updated with no action. */
	@Test
	public void testNonExistingActionNonAuth() {
		assertNotNull(findRelationBean(null, "NonExistingActionId"));
	}
        
        /** Test the case where no action exists. */
	@Test
	public void testNonExistingActionWithNoAction() {
		assertNull(findRelationBean(null, "NonExistingActionId"));
	}

        /** Test the case where no action exists. */
	@Test
	public void testNonExistingActionNonAuthWithNoAction() {
		assertNotNull(findRelationBean(null, "NonExistingActionId"));
	}

        
	/**
	* Test the case where the Relation to be updated exists.
	*/
	@Test
	public void testNonExistingRelationNonAuth() {
		assertNull(findRelationBean(null, "NonExistingActionId"));
	}

	/**
	* Test the case where the Relation to be updated exists.
	* We assume that the given action does not exist in the list.
	*/
	@Test
	public void testNonExistingRelationWithNoAction() {
                assertNotNull(findRelationBean(null, "NonExistingActionId"));
	}

	/**
	* Test the case where the Relation to be updated exists.
	* We assume that the given action does not exist in the list.
	*/
	@Test
	public void testNonExistingRelationWithNoActionNonAuth() {
                assertNotNull(findRelationBean(null, "NonExistingActionId"));
	}
        
        /**
	* Test the case where the Relation to be updated has an action.
	*/
	@Test
	public void testNonExistingRelationHasNonAuthAction() {
		assertNotNull(findRelationBean(null, "NonExistingActionId"));
	}
        
		/**
	* Test the case where the relation contains an existing action.
	*/
        @Test
	public void testNonExistingRelationHasExistingAction() {
		assertNotNull(findRelationBean("", "NonExistingActionId"));
	}

	@Override
	public void modify(final HttpServlet servlet, final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
		List<RelationBean> rels = null;
		String actionId = null;
		try {
			rels = getRelationBeans();
			Iterable<String> actionIds = request.getParameterValues("actionId");
			if (actionIds == null) {
				actionId = request.getParameter("id");
			}
			actionId = actionIds.iterator().next();
		} catch (Exception e) {
			e.printStackTrace();
			servlet.getResponse().sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		
		CompleteMetadataBean newMetadata = new CompleteMetadataBean();
		boolean result = true;
		RelationBean rel;
		
		for (int i = 0; i < rels.size(); i++) {
	        final Iterator<CompleteMetadataBean> it = ((List)rels.get(i)).iterator();
	        while (it.hasNext()) {
	            final CompleteMetadataBean metadata = it.next();
	            
	            assertNotNull("The 'id' must not be null.", metadata.getId());
	            if (metadata.getId().equals(actionId)) {
	                break;
	            }

	            rel = findRelationBean(rels, metadata.getId());
	            if (rel!= null) {
	                newMetadata.addMetadata(metadata.getTitle(), rel.getTitle());
		            newMetadata.addMetadata(metadata.getDescription(), rel.getDescription());
	            }
	        }
	    }
		try {
			CompleteMetadataBean metadata = new CompleteMetadataBean(actionId, newMetadata);
			
            RequestDispatcher dispatcher = servlet.getRequestDispatcher(Integer.toString(metadata.getId()));
            dispatcher.forward(request, response);
		} catch (Exception e) {
			servlet.getResponse().sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
	}

}