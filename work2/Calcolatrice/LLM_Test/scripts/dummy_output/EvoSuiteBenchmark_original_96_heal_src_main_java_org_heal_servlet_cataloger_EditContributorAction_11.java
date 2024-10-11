// EditContributorActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContributorBean;
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
* Test class of {@link EditContributorAction}.
* It contains one unit test case for the {@link EditContributorAction#actionRequiresLogin()} method.
*/
class EditContributorActionTest {
		
		/**
		* Test method of {@link EditContributorAction#actionRequiresLogin()}.
		*/
		@Test
    public void testActionRequiresLogin() {
        assertFalse(EditContributorAction.actionRequiresLogin());
    }

    /**
     * @return Test data for the 'Edit Contributor' page.
     */
    private static String testData() {
        return "editContrib.jsp";
    }

    /**
     * JUnit to test the creation of test data for the 'Edit Contributor'
     * page.
     */
     @Test
    public void testEditContribCreation() {
     	CompleteMetadataBean newContrib = new CompleteMetadataBean(CompleteMetadataBean.CONTENT_TYPE_TEXT_HTML
     			,CompleteMetadataBean.CONTENT_MIMETYPE_IMMEDIATELY,testData());
     	CompleteMetadataBean editContributor = new ContribBean("test", testData());
    	
    	EditContributorAction testData = EditContributorAction.create(newContrib,editContributor);

    	
    	
        assertFalse(testData.actionRequiresLogin());
        assertEquals("EditContributorActionTest.testEditContribCreation",testData.getTestID());
   		assertEquals("EditContributorActionTest.testEditContribCreation", testData.getTestType());
   		assertEquals("EditContributorActionTest.testEditContribCreation", testData.getTestText());
   		assertEquals("EditContributorActionTest.testEditContribCreation", testData.getTestTitle());
   		assertEquals("EditContributorActionTest.testEditContribCreation", testData.getTestTags());
   		assertNull(testData.getTestAuth());
       
        // EditContributorAction.setTestData(newContrib,editContributor); //Test the value of TestData is set by "newContrib" from "EditContributorAction.create"

        assertNull(testData.getTestAuth());
        assertTrue(testData.getTestResult().length() > 0);
    	
    }

	/**
	* Test the getTestID method of the class.
	*/
        private static RequestDispatcher.Forward testReturn = new RequestDispatcher.Forward("TestReturn");
    
    @Test
     public void testGetTestID() {
        assertEquals(testReturn,EditContributorAction.getTestID());
    }

    @Test
    public void testGetTestType() {
        assertEquals(testReturn,EditContributorAction.getTestType());
    }

    @Test
    public void testGetTestText() {
        assertEquals(testReturn,EditContributorAction.getTestText());
    }

    @Test
    public void testGetTestTitle() {
        assertEquals(testReturn,EditContributorAction.getTestTitle());
    }

    @Test
    public void testGetTestTags() {
        assertEquals(testReturn,EditContributorAction.getTestTags());
    }

    @Test
    public void testRemoveContrib() {
        assertEquals(testReturn,EditContributorAction.removeContrib(newContrib));
    }

    @Test
    public void testGetResult() {
        assertEquals(testReturn,EditContributorAction.getResult(newContrib));
    }

    @Test
    public void testSetTestData() {
        newContrib.setTestData(new ArrayList(testData()));
        testData = new ArrayList();
        assertEquals("newContrib.getTestData().size() ", testData.size());
    }

}