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
		
				
	/**
	 * Test that only "admin" can be modified.
	 * @throws Exception
	 * @see <a href="https://issues.jboss.org/browse/HAL-1326">https://issues.jboss.org/browse/HAL-1326</a>
	 */
	@Test
	public void testOnlyAdminCanModify() throws Exception {
		try {
			HttpServlet servlet = new HttpServlet() {
				public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
					Action.perform(this, request, response);				
				}
			};
			// TODO: We should make this test throw a 500, since the servlet can't check
			// if the request is "admin"
			assertTrue(EditContextURLAction.actionRequiresLogin());
			// In this case we allow editing only authenticated users, so we expect our
			// request method to be "PUT"
			// But we need to assert that we send an empty body. I don't know
			assertEquals(Action.POST_REQUEST_METHOD, request.getMethod());
		} 
		catch (ServletException | IOException e) {
			assertTrue("Servlet throws the right error", e.getCause() instanceof  ServletException);
		} 
	
	}

		
	/**
	 * This test ensures that when we have a catalog of ContextURLBean, our
	 * action should be invoked on that catalog
	 * @throws Exception
	 */
	@Test
	public void testContextURLBeanWithNoCache() throws Exception {
		
		CompleteMetadataBean bean = new CompleteMetadataBean();
		bean.setTitle("No cache");
		bean.setDescription("No cache");
		bean.setDateCreated(System.currentTimeMillis());
//////		bean.setTimezone("America/New_York");

//		BeanWrapper wrapper = new BeanWrapperImpl();
//		bean.addProperty("title", "I don't want a cache");
//		String encoded = wrapper.writeValueAsString(bean);
//////		System.out.println(encoded);
//		assertNotNull(encoded);
//////		assertTrue(encoded.contains("I don't want a cache"));

	}


}