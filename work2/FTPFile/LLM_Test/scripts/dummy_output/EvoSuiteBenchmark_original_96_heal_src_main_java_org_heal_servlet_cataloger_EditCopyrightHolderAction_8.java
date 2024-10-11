// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
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
* Test class of {@link EditCopyrightHolderAction}.
* It contains one unit test case for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {
		
	// An action which is called if there is an existing copyright holder and it should
    // create a new one with no previous copyright holder.
    private String editRequest = 
      "<root id=\"root\"><editId id=\"editId\" name=\"editName\" label=\"Edit Name: \">"+
        "<comment>" +
        "<string>Test</string>" +
        "</comment>" +
      "</editId></root>";

	// An action which is called if there is an existing copyright holder and it should
    // create a new one with null before edition.
    private String createRequest="<root id=\"root\"><editId id=\"editId\" name=\"editName\" label=\"Edit Name: \">"+
            "<comment>" +
            "<string>New Author</string>" +
            "</comment>" +
            "<copyright holder=\"Tester 2.0.0.0: http://www.heal.org\" newVersion=\"1.0.0.0\" /></editId></root>";

	// An action which is called if there is an existing copyright holder and the new license
    // should be set to "1.0.0" (instead of "1.0.0.0").
    private String changeDefaultLicenseRequest  ="<root id=\"root\"><editId id=\"editId\" name=\"editName\" label=\"Edit Name: \">"+
            "<comment>" +
            "<string>New License</string>" +
            "</comment>" +
            "<copyright holder=\"Tester 2.0.0.0: http://www.heal.org\" newVersion=\"1.0.0.0\" defaultVersion=\"1.0.0\" /></editId></root>";

    /**
     * Set up the test.
     */
    @Test
    public void testDefaultCopyrightLicense() {
    	
    	CompleteMetadataBean metadata = new CompleteMetadataBean();
    	metadata.addCopyrightHolder(new CopyrightHolderBean(new String[] { new String[] { "Tester 2.0.0.0: http://www.heal.org" } }));
    	metadata.addCopyrightHolder(new CopyrightHolderBean(new String[] { new String[] { "Tester 2.2.0.0: http://www.heal.org" } }));
        // Create an existing copyright holder.

        Iterator<CopyrightHolderBean> ic;
        ic = metadata.copyCopyrightHolderMap().keySet().iterator();
        CopyrightHolderBean cb = ic.next();
    	
        assertNotNull(cb.getCopyrightValue());
	    assertEquals("Tester 2.0.0.0", cb.getAuthor());
	    assertEquals("Tester 2.0.0.0", cb.getCopyrightValue());
    }
	
	/**
	 * Test {@link EditCopyrightHolderAction#perform(HttpServlet, HttpServletRequest, HttpServletResponse)}.
	 */
    @Test
    public void testPerform() {

        Action result = null;
        try {
            Iterator<CopyrightHolderBean> ic = metadata.copyCopyrightHolderMap().keySet().iterator();
            CopyrightHolderBean cb = ic.next();
            result = (EditCopyrightHolderAction)metadata.getAction(EditCopyrightHolderAction.class);
            result.perform(servlet, request, response);
            // Check that we got both a new and unchanged copy of a copyright holder.

            Iterator<CopyrightHolderBean> uic = metadata.getLatestCopies().iterator();
        	assertTrue(!uic.hasNext());

        	CopyrightHolderBean ab = cb;
        	assertNotNull(cb.getCopyrightValue());
            assertEquals("Tester 2.0.0.0", ab.getCopyrightValue());
            result = null;
            metadata.deleteCopyrightHolder(cb);
        } catch (Exception e) {
            assertEquals("Unexpected exception", e.getClass(), e.getClass());
        }
        assertNotNull(result);
        assertNotNull(result.parameters());
		
		// This throws an exception if no new action was created.
		result.perform(servlet, request, response);

	}

	/**
	 * Test request attribute.
	 */
	@Test
	public void testRequestAttribute() {

    	EditCopyrightHolderAction result = new EditCopyrightHolderAction();
    	System.out.println("start test for request attribute");
    	request = new HttpServletRequest();
    	request.setAttribute("request", request);

        assertEquals("Edit Copyright Holder", 
                    EditCopyrightHolderAction.class.getSimpleName());
        result = new EdmAction();
        System.out.println("end test for request attribute");
    	
        assertEquals("Edit Copyright Holder", 
                    EditCopyrightHolderAction.class.getSimpleName());
        result.perform(servlet, request, response);
 		assertEquals("Edit Copyright Holder", 
                    EditCopyrightHolderAction.class.getSimpleName());
 		
	}
	
}