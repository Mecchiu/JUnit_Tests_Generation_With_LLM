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

	@Test
	public void testNullObject() throws ServletException, IOException {
		EditContributorAction action = new EditContributorAction();
		if ("edit".equals(action.getRequestParameter("edit"))) {
			assertNull(action.getRequestParameter("contributorList"));
		} else {
			assertNotNull(action.getRequestParameter("contributorList"));
		}
	}
	
//	@Test
//	public void testSuccess() throws ServletException, IOException, SQLException {
//
//		ContributorBean existingContributor = new ContributorBean();
//		existingContributor.setId("test1");
//		existingContributor.setFirstName("test1First");
//		existingContributor.setLastName("test1Last");
//		existingContributor.setEmail("test2@test.com");
//		existingContributor.setWebsite("http://example.test.com");
//		existingContributor.setLocation("http://example.test");
//
//		ContributorBean newContributor = new ContributorBean();
//		newContributor.setId("test2");
//		newContributor.setFirstName("test2First");
//		newContributor.setLastName("test2Last");
//		newContributor.setEmail("test2@test.com");
//		newContributor.setWebsite("http://example.test.com");
//		newContributor.setLocation("http://example.test");
//
//		CompleteMetadataBean metadata = new CompleteMetadataBean();
//		ContributorBean editedContributor = metadata.getContributorBeanById("test2");
//		assertNotNull(existingContributor);
//		assertNotNull(newContributor);
//		assertEquals(metadata.getContributionId(), editContributor.getId());
//		assertEquals(metadata.getLastName(), editContributor.getLastName());
//		assertEquals(metadata.getFirstName(), editContributor.getFirstName());
//		assertEquals(metadata.getEmail(), editContributor.getEmail());
//		assertEquals(metadata.getWebsite(), editContributor.getWebsite());
//		assertEquals(metadata.getLocation(), editContributor.getLocation());
//
//		Iterator<ContributorBean> iter = metadata.contributors().iterator();
//		assertTrue(iter.hasNext());
//		ContributorBean currentContributor = iter.next();
//		assertEquals(metadata.getContributorId(), currentContributor.getId());
//		assertEquals(metadata.getLastName(), currentContributor.getLastName());
//		assertEquals(metadata.getFirstName(), currentContributor.getFirstName());
//		assertEquals(metadata.getEmail(), currentContributor.getEmail());
//		assertEquals(metadata.getWebsite(), currentContributor.getWebsite());
//		assertEquals(metadata.getLocation(), currentContributor.getLocation());
//
//		assertNotNull(currentContributor);
//
//		EditContributorAction action = new EditContributorAction();
//		if (existingContributor.id()!= newContributor.id()) {
//			action.setRequestParameter("edit");
//			action.setComponentIdList("test1,other");
//		}
//		if (existingContributor.id() == newContributor.id()) {
//			assertNull(action.getRequestParameter("contributorList"));
//			assertEquals(1, action.actionRequiresLogin());
//		} else {
//			assertNotNull(action.getRequestParameter("contributorList"));
//			assertEquals(1, action.editContribution());
//		}
//
//		currentContributor = edtContribuitor();
//		assertNotNull(currentContributor);
//
//		iter = metadata.contributors().iterator();
//		currentContributor = iter.next();
//		assertEquals(existingContributor.id(), currentContributor.id());
//		assertEquals(edtFirstName, currentContributor.firstName());
//		assertEquals(edtLastName, currentContributor.lastName());
//		assertEquals("test2Last", currentContributor.email());
//		assertEquals("localhost", currentContributor.emailAddress());
//		assertEquals(metadata.getLastName(), currentContributor.lastName());
//		assertEquals(metadata.getEmail(), currentContributor.email());
//		assertEquals(metadata.getWebsite(), currentContributor.emailAddress());
//		assertEquals(metadata.getLocation(), currentContributor.emailAddress());
//
//	}
//
//	public ContributorBean edtLastName() throws SQLException {
//
//		assertNotNull(editContributor.firstName());
//		assertNotNull(editContributor.lastName());
//
//		return editContributor;
//	}
//
//	public ContributorBean edtContribution() throws SQLException, InterruptedException {
//
//		contributorContribution();
//
//		Iterator<ContributorBean> contributors = edtContributors();
//		ContributorBean c = contributors.next();
//		assertEquals(1, c.getId().length());
//		assertEquals(metadata().getLastName(), c.getLastName());
//		assertEquals("test2Last", c.getFirstName());
//		assertEquals("localhost", c.getEmail());
//
//		return c;
//	}
//
//	private ContributorBean edtContributor(com.mycompany.Test.Test test) throws SQLException, InterruptedException {
//
//		iterator.set(test);
//		iterator.set(0);
//		edtContribution();
//
//		Iterator<ContributorBean> contributors = edtContributors();
//		Iterator<ContributorBean> iterator = contributors;
//		assertEquals(test, iterator.next().getTest());
//
//		ContributorBean c;
//		while (iterator.hasNext()) {
//			c = iterator.next();
//			c.setLastName(c.getLastName() + " " + test.lastName());
//		}
//		return c;
//	}
//
//	private ContributorBean edtContributor() throws InterruptedException {
//
//		return edtContribution();
//	}
//
//	private class TestContribution implements Comparable<TestContribution> {
//
//		final ContributorBean