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
		private static final String CONTRIBUTOR_ID = "contrib";
        private static final String CONTRIBUTOR_FIRST_NAME = "John";
        private static final String CONTRIBUTOR_LAST_NAME = "Adams";
        private static final String CONTRIBUTOR_DISTRIBNAME = "Adams";
        private static final String CONTRIBUTOR_MAIL = "abc@gmail.com";
        private static final String CONTRIBUTOR_FIRSTFOUND = "JohnFirstFound";
        private static final String CONTRIBUTOR_LASTFOUND = "JohnLastFound";
        private static final String CONTRIBUTOR_EMAIL = "abc@gmail.com";

        private final EditContributorAction action;

		/**
        * Constructor.
        * @param action The {@link Action} to test.
        */
        public EditContributorActionTest(final EditContributorAction action) {
            this.action = action;
        }

		/**
		* Test that the method {@link #actionRequiresLogin()} returns <code>true</code>.
		*/
		@Test
		public void testRequiresLoginReturnWithTrue() {
			assertTrue(action.actionRequiresLogin());
		}

		/**
		* Test that the method {@link #getContributor(HttpServletRequest)} does not return an incorrect value.
		*/
		@Test
		public void testGetContributorWithValidRequestAndId() throws ServletException, IOException {
			String id = "myContributor";
			Iterator<ContributorBean> iter = action.getContributor(new HttpServletRequest(id));
			assertNotNull(iter);
			assertTrue(iter.hasNext());
			assertEquals(iter.next().getContributorId(), CONTRIBUTOR_ID);
		}

		/**
		* Test that the method {@link #getContributor(HttpServletRequest)} does not return an incorrect value.
		*/
		@Test
		public void testGetContributorWithInvalidRequestAndId() throws ServletException, IOException {
			String id = CONTRIBUTOR_ID;
			Iterator<ContributorBean> iter = action.getContributor(new HttpServletRequest(id));
			assertNotNull(iter);
			assertFalse(iter.hasNext());
		}

		/**
		* Test that the method {@link #getContributor(HttpServletRequest)} does not return an incorrect value.
		*/
		@Test
		public void testGetContributorWithValidRequestAndFirstName() throws ServletException, IOException {
			String firstName = CONTRIBUTOR_FIRST_NAME;
			Iterator<ContributorBean> iter = action.getContributor(new HttpServletRequest(firstName));
			assertNotNull(iter);
			assertTrue(iter.hasNext());
			assertEquals(iter.next().getContributorId(), CONTRIBUTOR_ID);
			assertNotNull(iter.next());
			assertEquals(iter.next().getContributorId(), CONTRIBUTOR_ID);
			assertEquals(iter.next().getContributorFirstName(), firstName);
			assertFalse(iter.hasNext());
		}

		/**
		* Test that the method {@link #getContributor(HttpServletRequest)} does not return an incorrect value.
		*/
		@Test
		public void testGetContributorWithInvalidRequestAndFirstName() throws ServletException, IOException {
			String firstName = CONTRIBUTOR_FIRST_NAME;
			Iterator<ContributorBean> iter = action.getContributor(new HttpServletRequest(ContributorBean.NULL));
			assertNotNull(iter);
			assertFalse(iter.hasNext());
		}

		/**
		* Test that the method {@link #getContributor(HttpServletRequest)} does not return an incorrect value.
		*/
		@Test
		public void testGetContributorWithValidRequestAndLastName() throws ServletException, IOException {
			String lastName = CONTRIBUTOR_LAST_NAME;
			Iterator<ContributorBean> iter = action.getContributor(new HttpServletRequest(lastName));
			assertNotNull(iter);
			assertTrue(iter.hasNext());
			assertEquals(iter.next().getContributorId(), CONTRIBUTOR_ID);
			assertNotNull(iter.next());
			assertEquals(iter.next().getContributorId(), CONTRIBUTOR_ID);
			assertEquals(iter.next().getContributorFirstName(), CONTRIBUTOR_FIRST_NAME);
			assertNotNull(iter.next());
			assertEquals(iter.next().getContributorId(), CONTRIBUTOR_ID);
			assertEquals(iter.next().getContributorLastName(), lastName);
			assertFalse(iter.hasNext());
		}

		/**
		* Test that the method {@link #getContributor(HttpServletRequest)} does not return an incorrect value.
		*/
		@Test
		public void testGetContributorWithInvalidRequestAndLastName() throws ServletException, IOException {
			String lastName = CONTRIBUTOR_LAST_NAME;
			Iterator<ContributorBean> iter = action.getContributor(new HttpServletRequest(ContributorBean.NULL));
			assertNotNull(iter);
			assertFalse(iter.hasNext());
		}

		/**
		* Test that the method {@link #getContributor(HttpServletRequest)} does not return an incorrect value.
		*/
		@Test
		public void testGetContributorWithInvalidRequestAndEmail() throws ServletException, IOException {
			String email = CONTRIBUTOR_EMAIL;
			Iterator<ContributorBean> iter = action.getContributor(new HttpServletRequest(email));
			assertNotNull(iter);
			assertTrue(iter.hasNext());
			assertEquals(iter.next().getContributorId(), CONTRIBUTOR_ID);
			assertNotNull(iter.next());
			assertEquals(iter.next().getContributorId(), CONTRIBUTOR_ID);
			assertEquals(iter.next().getContributorFirstName(), CONTRIBUTOR_FIRST_NAME);
			assertNotNull(iter.next());
			assertEquals(iter.next().getContributorId(), CONTRIBUTOR_ID);
}
}