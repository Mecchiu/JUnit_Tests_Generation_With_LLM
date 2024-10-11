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
		 * Create a valid edit
		*/
	public static contributorBean createEdit(String title, String description, String location) {
		contributorBean newContributorBean = new contributorBean();
		newContributorBean.setTitle(title);		
		newContributorBean.setDescription(description);
		newContributorBean.setLocation(location);
		RequestDispatcher dispatcher = null;
		try {
			dispatcher = RequestDispatcher.getInstance("editContributor");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/contributor-edit.jsp");
			final Iterator contributors = newContributorBean.getContributors().iterator();
			while (contributors.hasNext()) {
				contributorBean contributor = (contributorBean)contributors.next();
				dispatcher.include(request, response, contributor);
			}
		} 
		catch (IOException | ServletException| RuntimeException e) 
		{
			throw new IllegalStateException("Exception in creating view from editContributors", e);
		}
		return newContributorBean;
	}

}