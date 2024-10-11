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
static class TestAction extends Action {
		    @Override
                    public void action(ServletRequest request, ServletResponse response) throws ServletException, IOException {
                        RelationBean relation = new RelationBean();
                        @SuppressWarnings("unchecked")
                        Iterator<String> i = request.getParameterNames();
                        String id = i.next();
                        relation.add(id, "test");
                        @SuppressWarnings("unchecked")
                        List<String> values = (List<String>) request.getParameterValues(id);
                        assertEquals(values.size(), 1);
                        String value = values.get(0);
						if (!(value+"").equals(Id.toString(ids.length+1))) {
                            response.sendError(HttpServletResponse.SC_CONFLICT);
                        } else {
							response.getWriter().write("true");
                        }
                    }

		    }
		    
		}
		
		static void testAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			ServerBean.beacon().beacon("test", "rel");
			
			String id = request.getParameter("id");
			
			List list = (List) RequestDispatcher.
                                     getRequestDispatcher(null).includeRequest(request, response);
			
			Iterator<String> i = list.iterator();
			
			String s;
			
			if (!i.hasNext()) {
				response.sendError(HttpServletResponse.SC_NOT_FOUND);
			} else {
				
				s = i.next();
				
				String value = s;
				
				while (i.hasNext()) {
					s = i.next();
					
					if (!(s + "").equals(value)) {
						TestAction testAction = new TestAction();
						testAction.setId(Id.toString(ids.length+1));
						testAction.setValue(value);
						
						List expected = new CompleteMetadataBean("test");
						testAction.action(request, response);
						
						CompleteMetadataBean c = new CompleteMetadataBean("value");
						List actual = c.getList();
						assertEquals(expected, actual.iterator());
						
						c.toString();
					}
				}
				
				request.getSession().setAttribute("name", s);
			}
		}
		
		static HttpServlet getServlet() {
			HttpServlet servlet = new HttpServlet() {
				@Override
                      public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                         RelationRecordModifierTest.testAction(request, response);
                                }
                                
                 };
			return servlet;
		}
}