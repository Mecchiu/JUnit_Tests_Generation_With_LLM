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
		
	protected final EditContributorAction action;
	
	/**
	 * Set up parameterised test cases for {@link EditContributorAction#actionRequiresLogin()}
	*/
	protected EditContributorActionTest(TestMode mode) {
		action = new EditContributorAction(mode);
	}
	
	@Test
	public void testContributorNotFound() throws ServletException, IOException {
		assertTrue(!action.actionRequiresLogin());
	}

	@Test
	public void testContributorAlreadyHaveBeenEdited() throws ServletException, IOException {
		ContributorBean bean = new ContributorBean();
		bean.setContributor_id("contributor1");
		bean.setTitle("Title1");
		bean.setDescription("Description1");
		CompleteMetadataBean completeMetadata = new CompleteMetadataBean();
		bean.setCompleteMetadata(completeMetadata);
		bean.setContributors(
					new Iterator[] {
						bean.getContributors().iterator()
					}
				      )

		assertTrue(action.actionRequiresLogin());
//		assertTrue(!action.isAcesLogin(httpServletRequest));
		assertTrue(!action.isAccountChecked(httpServletRequest));
		assertFalse(isMetadataContainsContributor(completeMetadata, bean.getContributors()));
	}

	@Test
	public void testSingleContributorBearNotFound() throws ServletException, IOException {
		ContributorBean bean = new ContributorBean();
		bean.setContributor_id(null);
		bean.setTitle("Title2");
		bean.setDescription("Description2");
		CompleteMetadataBean completeMetadata = new CompleteMetadataBean();
		bean.setCompleteMetadata(completeMetadata);
		bean.setContributors(
					new Iterator[] {
						bean.getContributors().iterator()
					}
				      )

		assertFalse(action.actionRequiresLogin());
		assertTrue(isMetadataContainsContributor(completeMetadata, bean.getContributors()));
		assertEquals(MetadataResolutionConstants.CONTIDTOR_NOT_FOUND, httpServletRequest.getRequestDispatcher("/catalogercontributorlist/editContributorAction.jsp?contributor=contributor1").forward(req, res));
	}
	@Test
	public void testSimpleMetadataResolution() throws ServletException, IOException {
		assertEquals(
				"Please make me a participant with a metadata contributor!",
				action.getActionName());
		action.actionRequiresLogin();
	}
	@Test
	public void testMultivalueContributorResolution() throws ServletException, IOException {
		ContributorBean bean = new ContributorBean();
		ContributorBean anotherBean = new ContributorBean();
		bean.setContributor_id("contributor-1");
		bean.setTitle("Title1");
		bean.setDescription("Description1");
		anotherBean.setContributor_id(bean.getContributor_id());
		anotherBean.setTitle("Title2");
		anotherBean.setDescription("Description2");

		CompleteMetadataBean completeMetadata = new CompleteMetadataBean();
		anotherBean.setCompleteMetadata(completeMetadata);
		anotherBean.setContributors(
					new Iterator[] {
						anotherBean.getContributors().iterator()
					}
				      )

		assertFalse(action.actionRequiresLogin());
		assertTrue(isMetadataContainsContributor(completeMetadata, anotherBean.getContributors()));
		assertEquals(
				MetadataResolutionConstants.CONTIDTOR_NOT_FOUND,
				httpServletRequest.getRequestDispatcher("/catalogercontributorlist/editContributorAction.jsp?contributor=contributor1&contributor=contributor-1").forward(req, res));
	}

	// Make sure that the correct metadata is in the cataloger catalog for the correct contributor/calls to the cataloger controller.
	private boolean isMetadataContainsContributor(CompleteMetadataBean completeMetadata, Iterator contributors) {
		Iterator iter = contributors;
		while(iter.hasNext()) {
			ContributorBean contrib = (ContributorBean)iter.next();
			if (completeMetadata.getContribution_title().equals(contrib.getTitle()) &&
					completeMetadata.getCompleteMetadata().getData().get(
							MetadataResolutionConstants.EXT_META_DATA_CONTRIB )
							.equals(contrib.getCompleteMetadata().getData().get(
									MetadataResolutionConstants.EXT_META_DATA_CONTRIB ) )) return true;
		}
		return false;
	}

	private boolean isMetadataContainsComment(CompleteMetadataBean completeMetadata) {
		Iterator iter = completeMetadata.getContributors();
		while(iter.hasNext()) {
			ContriberBean contrib = (ContriberBean)iter.next();
			if (contrib.getCompleteMetadata().getComments().containsKey("title")) return true;
		}
		return false;
	}
}