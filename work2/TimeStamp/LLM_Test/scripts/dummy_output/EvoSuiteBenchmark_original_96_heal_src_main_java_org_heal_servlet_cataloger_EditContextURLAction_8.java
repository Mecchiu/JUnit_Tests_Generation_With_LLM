// EditContextURLActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
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
* Test class of {@link EditContextURLAction}.
* It contains one unit test case for the {@link EditContextURLAction#actionRequiresLogin()} method.
*/
class EditContextURLActionTest {
		private final static String TEST= "/editContextURL.jsp";
        private final static HttpServlet TEST_INSTANCE = new TestAction();

        @Test
        public void testShouldFindAndEditExistingContextURL() throws IOException, ServletException {
                CompleteMetadataBean cmpbe = new CompleteMetadataBean();
                String metaName = "name";
                Integer metaURL = 12345;
				RequestDispatcher rd = testInstance.getMatch(MetaURLMatch.class, cmpbe, metaName, metaURL);
				rd.forward(null, TEST_INSTANCE);
		}

                @Test
		public void testShouldNotFindAndEditInactiveContextURL() throws IOException, ServletException {
			Action test = new EditContextURLAction();

			CompleteMetadataBean cmpbe = new CompleteMetadataBean();
			String metaName = "name";
				Integer metaURL = 12345;			
				RequestDispatcher rd = test.getMatch(MetaURLMatch.class, cmpbe, metaName, metaURL);
				rd.forward(null, TEST_INSTANCE);
		}@Test
		public void testShouldNotFindAndEditInactiveContextOfINACTIVE_URL() throws IOException, ServletException {
			Action test = new MetaURLAction();

			CompleteMetadataBean cmpbe = new CompleteMetadataBean();
			String metaName = "name";
				Integer metaURL = new Integer(12345);
				cmpbe.setMetaURL(new Integer(12345));
				cmpbe.setMetaName(metaName);
				RequestDispatcher rd = test.getMatch(MetaURLMatch.class, cmpbe, metaName, metaURL);
				rd.forward(null, TEST_INSTANCE);
		}

                @Test
		public void testShouldNotFindAndEditOfOphanedContextURL() throws IOException, ServletException {
			CompleteMetadataBean cmpbe = new CompleteMetadataBean();
			String metaName = "name";
				Integer metaURL = new Integer(12345);
				cmpbe.setMetaURL(new Integer(12345));
				cmpbe.setMetaName(metaName);
				RequestDispatcher rd = test.getMatch(MetaURLMatch.class, cmpbe, metaName, metaURL);
				rd.forward(null, TEST_INSTANCE);
		}

				@Test
		public void testShouldCheckToRemoveMetadataBeanIfContextURLIsALoadMoreURL() throws IOException, ServletException {
                  CompleteMetadataBean cmpbe = new CompleteMetadataBean();
				String metaName = "name";
				Integer metaURL = new Integer(12345);
				cmpbe.setMetaURL(new Integer(12345));
				cmpbe.setMetaName(metaName);
				RequestDispatcher rd = test.getMatch(MetaURLMatch.class, cmpbe, metaName, metaURL);
				assertNotNull("No RequestDispatcher found by the action matching the complete metadata", rd);
				rd.handle(null, TEST_INSTANCE);				
		}

                @Test
		public void testShouldReturnDefaultHandler() throws IOException, ServletException {
			MetaURLAction mua = new MetaURLAction();

			CompleteMetadataBean cmpbe = new CompleteMetadataBean();
			String metaName = "name";
			Integer metaURL = new Integer(12345);			
			cmpbe.setMetaURL(new Integer(12345));
				cmpbe.setMetaName(metaName);
				RequestDispatcher rd = mua.getDefaultHandler(cmpbe, metaName, metaURL);
				assertNotNull("No RequestDispatcher found with the action matching the complete metadata", rd);
		}
                
        private final static MetaURLMatch testMatch = new MetaURLMatch(testInstance, "test contextUrlMatcher");

        @Override
        public String getName() {
            return "Get/Edit Context URL Action Test Case";
        }

        @Override
        public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

            TestContextURLAction instance = (TestContextURLAction) servlet.getServletContext().getAttribute(TEST);

            RequestDispatcher rd = testInstance.getMatch(InstanceMatch.class, "test contextUrlMatcher", testMatch);
            rd.forward(request, response);	
        }

        @Override
        public boolean actionRequiresLogin() {
            return true;
        }

				public static class TestAction extends HttpServlet {

}
}