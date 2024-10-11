// SaveMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SaveMetadataAction}.
* It contains one unit test case for the {@link SaveMetadataAction#actionRequiresLogin()} method.
*/
class SaveMetadataActionTest {
		
	static final String INCLUDE_COURSE_HEADER = "includeCourseHeader";
	static final String REQ_CACHE_ID = "reqCacheId";
	static final String REQ_CACHE_VERSION = "reqCacheVersion";
	static final String SOURCE_CACHE_ID = "sourceCacheId";
    
	/**
	* Test method for {@link SaveMetadataAction#parameterValidator()}.
	* This method validates that the parameters for the request to the function
	* {@link #action(HttpServletRequest, HttpServletResponse, Action)} have been checked.
	*
	* The test case will be given the following parameters:
	*          {@value IncludeCoursesParameter#INCLUDE_ALL_COURSES}
	*          {@value IncludeCoursesParameter#CACHE_ID}
	*          {@value IncludeCoursesParameter#REQ_CACHE_ID}
	*          {@value IncludeCoursesParameter#REQ_CACHE_VERSION}
	*          {@value IncludeCoursesParameter#SOURCE_CACHE_ID}
	*          {@value IncludeCoursesParameter#SOURCE_CACHE_VERSION}
	*/
	@Test
	public final void actionParameterValidator() {
		CompleteMetadataBean cmb;
		String param;

		// Test case for {@value IncludeCoursesParameter#INCLUDE_ALL_COURSES}{@value true}{@value cmb}
		param = cmb.getParameter(IncludeCoursesParameter.class);
		assertTrue("Invalid parameter for IncludeCourses", param.equals(true));

		// Test case for {@value IncludeCoursesParameter#CACHE_ID}{@value null}{@value cmb}
		cmb = new CompleteMetadataBean();
		cmb.setCacheId(null);
		param = cmb.getParameter(IncludeCoursesParameter.class);
		assertTrue("Invalid parameter for IncludeCourses", param.equals("new_cache_id"));

		// Test case for {@value InclusionParameter#INCLUDE_ALL_COURSES}{@value true}{@value cmb}
		cmb = new CompleteMetadataBean();
		cmb.setInclusion(true);
		param = cmb.getParameter(InclusionParameter.class);
		assertTrue("Invalid parameter for IncludeCourses", param.equals(true));

		// Test case for {@value IncludeCoursesParameter#REQ_CACHE_ID}
		cmb = new CompleteMetadataBean();
		cmb.setCacheId(INCLUDE_COURSE_HEADER);
		param = cmb.getParameter(IncludeCoursesParameter.class);
		assertTrue("Invalid parameter for IncludeCourses", param.equals(INCLUDE_COURSE_HEADER));

		// Test case for {@value IncludeCoursesParameter#REQ_CACHE_VERSION}
		cmb = new CompleteMetadataBean();
		cmb.setCacheVersion("10");
		param = cmb.getParameter(IncludeCoursesParameter.class);
		assertTrue("Invalid parameter for IncludeCourses", param.equals(10));

		// Test case for {@value IncludeCoursesParameter#SOURCE_CACHE_ID}
		cmb = new CompleteMetadataBean();
		cmb.setSourceCacheId(INCLUDE_COURSE_HEADER);
		param = cmb.getParameter(IncludeCoursesParameter.class);
		assertTrue("Invalid parameter for IncludeCourses", param.equals(INCLUDE_COURSE_HEADER));

		// Test case for {@value IncludeCoursesParameter#SOURCE_CACHE_VERSION}
		cmb = new CompleteMetadataBean();
		cmb.setSourceCacheVersion("10");
		param = cmb.getParameter(IncludeCoursesParameter.class);
		assertTrue("Invalid parameter for IncludeCourses", param.equals(10));

	}

    /**
     * Test method for {@link SaveMetadataAction#validateParameters(boolean)}.
     * This method validates that the parameters for the request to the function
     * {@link #action(HttpServletRequest, HttpServletResponse, Action)} have been checked.
     *
     * The test case will be given the following parameters:
     *          {@value ContributorBean#CANCEL_COMMENT}{@value ContributorBean#TRASH_COMMIT}
     */
}