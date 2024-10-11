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
	 * Test case for
	 * {@link EditContributorAction#actionRequiresLogin()}
	 */
	@Test
	void actionRequiresLogin1() throws InstantiationException, IllegalAccessException, ServletException, IOException, IllegalArgumentException {
	    ContributorBean aBean = new ContributorBean("jcr:type", "jcr:mimeTopic", "foo", null, "bar");
	    CompleteMetadataBean completeMetadata = new CompleteMetadataBean();
	    contributorBeanFromServlet(aBean, completeMetadata);

	    HttpServletRequest request = new FakeRequest(actionRequiresLogin(), "foo", "bar", completeMetadata);

	    assertTrue(contributorBeanFromServlet(aBean, completeMetadata) instanceof ContributorBean);
	    assertFalse(contributorBeanFromServlet(aBean, completeMetadata.getJcrMetadata()));
	    assertFalse(contributorBeanFromServlet(aBean, completeMetadata.getLifecycleMetadata()));
	}

	@Test
	void actionMustHaveOnlyOneJcrMetadata() throws IOException, ServletException {
    	Exception thrown = expectThrows(ServletException.class, () -> contributorBeanFromServlet(null,
                new CompleteMetadataBean()));
    	assertNotNull(thrown);
    	assertThat(thrown, instanceOf(ServletException.class));
    }

    private static class FakeRequest extends HttpServletRequest {
    	private final boolean requiresLogin;
    	private final String jcrMetadata;
    	private final String lifecycleMetadata;
		private boolean isJcrMetadataSet = false;
		private boolean isLifecycleMetadataSet = false;

		FakeRequest(boolean requiresLogin, String jcrMetadata, String lifecycleMetadata, CompleteMetadataBean completeMetadata) {
			this.requiresLogin = requiresLogin;
			this.jcrMetadata = jcrMetadata;
			this.lifecycleMetadata = lifecycleMetadata;
			StringBuilder jcrMetadataBuilder = new StringBuilder();
    		if (this.requiresLogin) {
        		String metadata = this.jcrMetadata;
        		jcrMetadataBuilder.append(metadata);
        		isJcrMetadataSet = true;
    		} else {
    			jcrMetadataBuilder.append("none");
    		}
    		this.jcrMetadata = jcrMetadataBuilder.toString();
			this.lifecycleMetadata = lifecycleMetadata;
		}

		public boolean isJcrMetadataSet() {
			return isJcrMetadataSet;
		}

		public String getJcrMetadata() {
			return jcrMetadata;
		}

		public String getLifecycleMetadata() {
			return lifecycleMetadata;
		}
    } 
}