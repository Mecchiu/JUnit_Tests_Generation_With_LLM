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

	/**
	 * Constructor.
	*/
	public RelationRecordModifierTest(){}
	
	/**
	 * @see RelationRecordModifier#actionRequiresLogin()
	 */
	@Robots(value="robot.who")
	@Test
	public void test_actionRequiresLogin() throws IOException, ServletException, InterruptedException{
		
		// get session by invoking HttpSession.getCurrent()
		
		final HttpServletRequest req = mock(HttpServletRequest.class);
		
		final HttpServletResponse res = mock(HttpServletResponse.class);
		
		
		assertNotNull(res);
    
		final RequestDispatcher rd = mock(RequestDispatcher.class);
		
		final List<String> methods = mockList();
		
		doReturn(methods).when(res).getMethods();
			
		doReturn(rd).when(req).getAttribute(anyString());
				
		this.action(req,res);
	}
	
	/**
	 * The return mocked List to mock the list of methods allowed to GET.
	 */
	private List<String> mockList() {
		List<String> list = null;
		if (actionRequiresLogin()) {
			list = mock(List.class);
			when(list.isEmpty()).thenReturn(true);
			doReturn(list).when(req).getAttribute(RelationBean.SESSION_ACTION);
		}
		return list;
	}
}
