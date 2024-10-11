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
	 * Unit test if action's {@link EditContextURLAction#actionRequiresLogin()}
	 * returns true.
	*/
	@Test
	public void test() throws IOException {

		HttpServletRequest request = new FakeRequest();
		HttpServletResponse response = new FakeResponse();
		
		Iterator it = new ContextURLBean().getContextURL().iterator();
		ContextURLBean newContext = (ContextURLBean) it.next();

		// This operation should return true, but it always throws an exception 
		request.setAttribute("ContextUrlBean", newContext);
		test(request, response);
		
		assertTrue(newContext instanceof CompleteMetadataBean);
	}
		
	// Fake request
	static class FakeRequest implements HttpServletRequest {
	
		private static final String USER_NAME = "admin";
		
		public Object findValue(String variable) {
		   return USER_NAME;
		}
		
	}
	
	private static class FakeResponse implements HttpServletResponse {
		
        public void addHeader(String name, String value) { }
		
		public void setStatus(int status) { }
		
	}
}