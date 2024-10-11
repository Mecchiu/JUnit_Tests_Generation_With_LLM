// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.CopyrightTextBean;
import org.heal.module.metadata.DiseaseDiagnosisBean;
import org.heal.module.metadata.FormatBean;
import org.heal.module.metadata.KeywordBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.ThumbnailBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.servlet.Action;
import org.heal.util.DateTools;
import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MetadataRecordModifier}.
* It contains one unit test case for the {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
*/
class MetadataRecordModifierTest {
/**
		 * @return A blank, valid, test method so the {@link MetadataModifier}
		 *		returns the initial contents.
		 */
		@Test
		public void testInitialMetadata() {
			assertTrue(CompleteMetadataBean.getInstance().isEmpty());
		}
		
		/**
		 * Test method for
		 * {@link MetadataRecordModifier#getNextAction(ServletRequest) getNextAction}
		 * with null servlet request. 
		 */
		@Test
		public void testGetNextActionNoRequest(){
			MetadataRecordModifier modifiers = new MetadataRecordModifier();
			assertNull(modifiers.getNextAction(null));
		}
		/**
		 * Test method for
		 * {@link MetadataRecordModifier#getNextActionNoRequest() getNextActionNoRequest}
		 * with null servlet request. 
		 */
		@Test
		public void testGetNextActionNoRequestWithRequest(){
			ServletRequest request = new ServletRequest();
			assertNull(request.getParameter("*"));
			request.setCharacterEncoding("utf8"); // request.getParameter("%26") should be returned without the trailing '%26'
			assertNull(request.getParameter("%26"));
			request.request = request;
			List<String> nextActionKeys = new  ArrayList<String>();
			nextActionKeys.add("NextAction");
			Map<String,List<String>> nextActionMap = new  HashMap<String,List<String>>();
			nextActionMap.put("NextAction", nextActionKeys);
			assertEquals(request.getParameter("NEXTACTION"), request.getParameter(nextActionKeys.iterator().next().toString()));
			Iterator<String> nextActionIterator = request.getParameterNames().iterator();
			nextActionIterator.next();
			while(nextActionIterator.hasNext()){
				String actionKey = nextActionIterator.next().toString();
				assertTrue(request.getParameterNames().contains(actionKey));
				List<String> actionKeys = nextActionMap.get(actionKey);
				assertFalse(actionKeys.isEmpty());
				boolean found = false;
				for(String item : actionKeys){
					boolean foundItem = false;
					Iterator<Object> valueIterator = request.getParameterValues(item+"").iterator();
					valueIterator.next();
					while(valueIterator.hasNext() &&!foundItem){
						foundItem = checkStringValues(valueIterator.next());
					}
					nextActionIterator.remove();
					found = found && foundItem;
				}
				if(!found){
					nextActionIterator.remove();
				}
			}
		}
		
		/**
		 * Test method for
		 * {@link MetadataRecordModifier#getNextActionNoRequest() getNextActionNoRequest}
		 * with empty servlet request. 
		 */
		@Test
		public void testGetNextActionNoRequestWithEmptyRequest(){
			ServletRequest request = new ServletRequest();
			assertEquals(request.getParameter("NEXTACTION"), "");
			request.setCharacterEncoding("UTF8");
			assertEquals(request.getParameter("NEXTACTION"), "");
			Iterator<String> nextActionIterator = request.getParameterNames().iterator();
			while(nextActionIterator.hasNext()){
				String actionKey = nextActionIterator.next().toString();
				assertTrue(request.getParameterNames().contains(actionKey));
				List<String> actionKeys = nextActionMap.get(actionKey);
				assertFalse(actionKeys.isEmpty());
				expected = request.getParameterValues(actionKey+"");
				expected.removeAll(Collections.emptyList());
				assertTrue(expected.isEmpty());
			}
		}
		
		/**
		 * A set of data that will be compared