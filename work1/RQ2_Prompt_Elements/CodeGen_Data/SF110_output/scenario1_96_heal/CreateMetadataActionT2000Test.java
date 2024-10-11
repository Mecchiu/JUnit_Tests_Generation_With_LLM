// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains one unit test case for the {@link CreateMetadataAction#actionRequiresLogin()} method.
*/
class CreateMetadataActionTest {
private CreateMetadataAction action;
    	
		/** CreateMetadataActionTest.java
		 * Setup for the unit test.
		 */
    	@Before
		public void before(){
    		action = new CreateMetadataAction();
    		action.action = true;
    		action.init();
    	}

		/** Test the request is created and the action is called the first time.
		* The request should not be cached.
		*/
		@Test
	    public void testStarted() throws Exception {
	    	HttpServletRequest request = new MockHttpServletRequest();
	    	HttpServletResponse response = new MockHttpServletResponse();
	    	request.setParameter("query", "{}");
	    	RequestDispatcher dispatcher =
	    		getServletContext().getRequestDispatcher("/cataloger/metadata");
	    	action.init(request, response, true);
	    	assertEquals("No catalog should be created in the response", 0, response.getStatus());
	    	assertNull("The catalog should not be created", response.getAttribute("catalog"));
	    	
	    	try{
	    		// Set the parameter
	    		request.setParameter("query", "{<CATALOG_PATH/>}&<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>");
	    	}catch(Exception e){
	    		fail("Problem setting parameter 'query'.");
	    	}
	    	
	    	List<CompleteMetadataBean> catalog = action.createMetadata();
	    	Iterator<CompleteMetadataBean> catIter = catalog.iterator();
	    	CompleteMetadataBean catalogBean = (CompleteMetadataBean)catIter.next();
	    	assertEquals("The catalog should be a set of instances", 2, catalog.size());
	    	
	    	assertEquals("The catalog should contain the correct number of taxonomy fields", 4, catalogBean.getTaxonomy().size());
	    	assertEquals("The catalog should contain the correct number of taxonomy taxonomies", 1, catalogBean.getTaxonomies().size());
	    	assertEquals("The catalog should contain the correct number of taxonomies taxonomies", 1, catalogBean.getTaxonomies().iterator().next().getChildren().size());
	    	
	    	// Now check the parameters
	    	request.setParameter("query", "{<CATALOG_PATH/>}&<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>");
	    	catIter = catalog.iterator();
	    	catalogBean = (CompleteMetadataBean)catIter.next();
	    	
	    	assertEquals("The catalog should contain the correct name", "CATOLOGY", catalogBean.getName());
	    	assertEquals("The catalog should contain the correct date", new Date(), catalogBean.getCreated());
	    	assertEquals("The catalog should contain the correct number of taxonomies", 1, catalogBean.getTaxonomies().size());
	    	taxonomies = catalogBean.getTaxonomies().iterator();
	    	assertEquals("The taxonomies should contain the correct name", "PROTEIN_NAMESPACE", taxonomies.next());
	    	assertEquals("The taxonomies should contain the correct number of taxonomies", 1, taxonomies.next().getChildren().size());
	    	
	    	assertEquals("The taxonomy should contain the correct name", "AUTH_TOKEN", taxonomies.next().getChildren().get(0).getName());
	    	
	    	// And now check the category field
	    	request.setParameter("query", "{<CATALOG_PATH/>}&<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>");
	    	catIter = catalog.iterator();
	    	catalogBean = (CompleteMetadataBean)catIter.next();
	    	
	    	assertEquals("The category should contain the correct name", "CATOLOGY", catalogBean.getName());
	    	// Check the value
	    	assertEquals("The category should contain the correct number of taxonomies", 1, catalogBean.getTaxonomies().size());
	    	taxonomies = catalogBean.getTaxonomies().iterator();
	    	assertEquals("The taxonomies should contain the correct name", "PROTEIN_NAMESPACE", taxonomies.next().getName());
	    	
	    	
	    	// There should be two queries in the request
	    	assertEquals("A typical use of a query is to set and select a catalog.", 3, request.getParameterValues("query").length);
	    	assertEquals("The search for the path must match", "{<CATALOG_PATH/>}", request.getParameter("query"));
	    	assertEquals("A typical use of a query is to set and select a taxonomy.", 1,
	    		    	request.getParameterValues("query").length);
	    	assertEquals("The taxonomy must match.", "{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>{<AUTH_TOKEN>>>>",
	    				request.getParameter("query"));
	    	
	    	
	    	// Check that the query is not