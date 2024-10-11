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
		public RelationRecordModifierTest() {}
		
	@Test
    public void testNoRelationDataFromNewUser() throws Exception {
        String relationId = "jiraLink";
        System.out.println("testNoRelationDataFromNewUser");

        String entityKey = "jiraLink";
        String entityDisplayName = "jiraLink";
        String descriptionText = "JIRA Link";
        String urlKey = "jiraLink";
        String title = "Test Title"; // title not used
        String icon = "org/heal/servlet/cataloger/images/jira-link.png";
        
        System.out.println("new EntityKey: "+entityKey);
        System.out.println("new EntityDisplayName: "+entityDisplayName);
        System.out.println("new DescriptionText: "+descriptionText);
        System.out.println("new URLKey: "+urlKey);
        System.out.println("new Title: "+title);
        System.out.println("new Icon: "+icon);
    }

	@Test
	public void testEditOnlyRelationData() throws Exception {

        System.out.println("testEditOnlyRelationData");

		RelationBean relation = new RelationBean(
			"testeditId1",
			"jiraLink",
			"jiraLink1",
			"description1",
			"jiraLink1",
			"title1",
			null,
			null,
			new String[] {"url1", "title1"},
			null);
		

		RelationBean result = null;
		

		String key = "jiraLink";
		String displayName = "jiraLink";
		String descriptionText = "Description";
		String urlKey = "jiraLink";
		String title = "JIRA Link"; // title not used
		String icon = "org/heal/servlet/cataloger/images/jira-link.png";
		String relations = "jiraLink1";

		List<String> relationships = new java.util.ArrayList<>();
		List<String> relationNames = new java.util.ArrayList<>();
		Iterator iter = relations.iterator();
		while(iter.hasNext()) {
			String value = iter.next();
			relationships.add(value);
		}
		System.out.println("relationships size: "+relationships.size());

        Iterator iterator = relationshipNames.iterator();

		while(iterator.hasNext()) {
			String value = (String) iterator.next();
			System.out.println("relationship Name: "+value);
		}

		result = new CompleteMetadataBean();
		result.setId(relation.getId());
		result.setDisplayName(displayName);
        result.setKey(key);
        result.setDisplayName(displayName);
        result.setDescriptionText(descriptionText);
        result.setUrlKey(urlKey);
        result.setLabel(title);
        if(!relayableBeansHaveIcon(relation)) {
            try {
                RequestDispatcher rd = result.getHttpServletRequest().getRequestDispatcher("/jiraLink/jiraLink.jsp");
                rd.include(result, "jiraLink");
                rd.include(result, "page");
                rd.include(result, "title");
            } catch(ServletException e) {
                   throw e;
            } catch(RuntimeException e) {
                   throw e;
            }
        } else {
            try {
                RequestDispatcher rd = result.getHttpServletRequest().getRequestDispatcher("/jiraLink/jiraLink.jsp");
                rd.include(result, "jiraLink");
                rd.include(result, "page");
                rd.include(result, "title");
                rd.include(result, "relationships");
                rd.include(result, "relationsialNames");
            } catch(ServletException e) {
                   throw e;
            } catch(RuntimeException e) {
                   throw e;
            }
        }
        try {
            String url = result.getUrl();
            result.setUrlKey("URLkey");
            result.setUrl(url + "/jiraLink/");
            result.setTitle(title);
            result.setDescriptionText(descriptionText);
            responsePutToUrl(result, url);
        } catch(Exception e) {
            check(e);
        }
	}

	private void responsePutToUrl(CompleteMetadataBean result, String url) throws Exception {
        RequestDispatcher rd = result.getHttpServletRequest().getRequestDispatcher(url);
        rd.include(result, "jiraLink");
        rd.include(result, "page");
        rd.include(result, "title");
        rd.include(result, "relationships");
        rd.include(result, "relationsialNames");
        rd.include(result, "relations");

        rd.forwardToRedirect(getServletContext().getInitParameter("javahttprd"));
	}

	private boolean relayableBeansHaveIcon(RelationBean relation) {
        /*
        for(int i=0;i<relationships.length;i++){
        	if(relationships[i].equals(relation.getId()) && relation.getUrl().contains("jiraLink")){
        		return true;
        	}
        }
        return false;
*/
        return false;
    }
}