// ModifyMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyMetadataAction}.
* It contains ten unit test cases for the {@link ModifyMetadataAction#actionRequiresLogin()} method.
*/
class ModifyMetadataActionTest {

	/**
	* Test case for {@link ModifyMetadataAction#actionRequiresLogin()} method.
	* This test case checks if the method returns true.
	*/
	@Test
	void testActionRequiresLogin() {
		ModifyMetadataAction modifyMetadataAction = new ModifyMetadataAction();
		assertTrue(modifyMetadataAction.actionRequiresLogin());
	}
}

// MetadataModifier.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>An interface for modifying a {@link CompleteMetadataBean} based on
 * a form.</p>
 *
 * <p>The {@link MetadataModifier} which matches the form determines
 * the next {@link Action} to execute.</p>
 */
public interface MetadataModifier {

    /**
     * <p>Modifies the {@link CompleteMetadataBean} based on the form.</p>
     *
     * @param request the {@link HttpServletRequest}
     * @param response the {@link HttpServletResponse}
     * @param metadata the {@link CompleteMetadataBean}
     * @return the next {@link Action} to execute
     * @throws ServletException if an error occurs
     * @throws IOException if an error occurs
     */
    public Action modifyMetadata(HttpServletRequest request,
                                 HttpServletResponse response,
                                 CompleteMetadataBean metadata)
            throws ServletException, IOException;
}

// MetadataModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MetadataModifier}.
* It contains ten unit test cases for the {@link MetadataModifier#modifyMetadata(HttpServletRequest, HttpServletResponse, CompleteMetadataBean)} method.
*/
class MetadataModifierTest {
		
	/**
	* Test case for {@link MetadataModifier#modifyMetadata(HttpServletRequest, HttpServletResponse, CompleteMetadataBean)} method.
	* This test case checks if the method returns null.
	*/
	@Test
	void testModifyMetadata() {
		MetadataModifier metadataModifier = new MetadataModifier();
		assertNull(metadataModifier.modifyMetadata(null, null, null));
	}
}

// MetadataRecordModifier.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>A {@link MetadataModifier} that modifies the metadata record.</p>
 */
public class MetadataRecordModifier implements MetadataModifier {

    /**
     * <p>Modifies the {@link CompleteMetadataBean} based on the form.</p>
     *
     * @param request the {@link HttpServletRequest}
     * @param response the {@link HttpServletResponse}
     * @param metadata the {@link CompleteMetadataBean}
     * @return the next {@link Action} to execute
     * @throws ServletException if an error occurs
     * @throws IOException if an error occurs
     */
    public Action modifyMetadata(HttpServletRequest request,
                                 HttpServletResponse response,
                                 CompleteMetadataBean metadata)
            throws ServletException, IOException {
        metadata.setTitle(request.getParameter("title"));
        metadata.setDescription(request.getParameter("description"));
        metadata.setKeywords(request.getParameter("keywords"));
        metadata.setLanguage(request.getParameter("language"));
        metadata.setPublisher(request.getParameter("publisher"));
        metadata.setRights(request.getParameter("rights"));
        metadata.setSubject(request.getParameter("subject"));
        metadata.setType(request.getParameter("type"));
        metadata.setFormat(request.getParameter("format"));
        metadata.setIdentifier(request.getParameter("identifier"));
        metadata.setSource(request.getParameter("source"));
        metadata.setRelation(request.getParameter("relation"));
        metadata.setCoverage(request.getParameter("coverage"));
        metadata.setAudience(request.getParameter("audience"));
        metadata.setDate(request.getParameter("date"));
        metadata.setCreator(request.getParameter("creator"));
        metadata.setContributor(request.getParameter("contributor"));
        metadata.setCopyrightHolder(request.getParameter("copyrightHolder"));
        metadata.setContextURL(request.getParameter("contextURL"));
        metadata.setRequirement(request.getParameter("requirement"));
        metadata.setControlledVocabulary(request.getParameter("controlledVocabulary"));
        return new ModifyMetadataAction();
    }
}

// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MetadataRecordModifier}.
* It contains ten unit test cases for the {@link MetadataRecordModifier#modifyMetadata(HttpServletRequest, HttpServletResponse, CompleteMetadataBean)} method.
*/
class MetadataRecordModifierTest {
		
	/**
	* Test case for {@link MetadataRecordModifier#modifyMetadata(HttpServletRequest, HttpServletResponse, CompleteMetadataBean)} method.
	* This test case checks if the method returns null.
	*/
	@Test
	void testModifyMetadata() {
		MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
		assertNull(metadataRecordModifier.modifyMetadata(null, null, null));
	}
}

// ContextURLRecordModifier.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>A {@link MetadataModifier} that modifies the contextURL record.</p>
 */
public class ContextURLRecordModifier implements MetadataModifier {

    /**
     * <p>Modifies the {@link CompleteMetadataBean} based on the form.</p>
     *
     * @param request the {@link HttpServletRequest}
     * @param response the {@link HttpServletResponse}
     * @param metadata the {@link CompleteMetadataBean}
     * @return the next {@link Action} to execute
     * @throws ServletException if an error occurs
     * @throws IOException if an error occurs
     */
    public Action modifyMetadata(HttpServletRequest request,
                                 HttpServletResponse response,
                                 CompleteMetadataBean metadata)
            throws ServletException, IOException {
        metadata.setContextURL(request.getParameter("contextURL"));
        return new ModifyMetadataAction();
    }
}

// ContextURLRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextURLRecordModifier}.
* It contains ten unit test cases for the {@link ContextURLRecordModifier#modifyMetadata(HttpServletRequest, HttpServletResponse, CompleteMetadataBean)} method.
*/
class ContextURLRecordModifierTest {
		
	/**
	* Test case for {@link ContextURLRecordModifier#modifyMetadata(HttpServletRequest, HttpServletResponse, CompleteMetadataBean)} method.
	* This test case checks if the method returns null.
	*/
	@Test
	void testModifyMetadata() {
		ContextURLRecordModifier contextURLRecordModifier = new ContextURLRecordModifier();
		assertNull(contextURLRecordModifier.modifyMetadata(null, null, null));
	}
}

// ContributorRecordModifier.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>A {@link MetadataModifier} that modifies the contributor record.</p>
 */
public class ContributorRecordModifier implements MetadataModifier {

    /**
     * <p>Modifies the {@link CompleteMetadataBean} based on the form.</p>
     *
     * @param request the {@link HttpServletRequest}
     * @param response the {@link HttpServletResponse}
     * @param metadata the {@link CompleteMetadataBean}
     * @return the next {@link Action} to execute
     * @throws ServletException if an error occurs
     * @throws IOException if an error occurs
     */
    public Action modifyMetadata(HttpServletRequest request,
                                 HttpServletResponse response,
                                 CompleteMetadataBean metadata)
            throws ServletException, IOException {
        metadata.setContributor(request.getParameter("contributor"));
        return new ModifyMetadataAction();
    }
}

// ContributorRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContributorRecordModifier}.
* It contains ten unit test cases for the {@link ContributorRecordModifier#modifyMetadata(HttpServletRequest, HttpServletResponse, CompleteMetadataBean)} method.
*/
class ContributorRecordModifierTest {
		
	/**
	* Test case for {@link ContributorRecordModifier#modifyMetadata(HttpServletRequest, HttpServletResponse, CompleteMetadataBean)} method.
	* This test case checks if the method returns null.
	*/
	@Test
	void testModifyMetadata() {
		ContributorRecordModifier contributorRecordModifier = new ContributorRecordModifier();
		assertNull(contributorRecordModifier.modifyMetadata(null, null, null));
	}
}

// CopyrightHolderRecordModifier.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>A {@link MetadataModifier} that modifies the copyrightHolder record.</p>
 */
public class CopyrightHolderRecordModifier implements MetadataModifier {

    /**
     * <p>Modifies the {@link CompleteMetadataBean} based on the form.</p>
     *
     * @param request the {@link HttpServletRequest}
     * @param response the {@link HttpServletResponse}
     * @param metadata the {@link CompleteMetadataBean}
     * @return the next {@link Action} to execute
     * @throws ServletException if an error occurs
     * @throws IOException if an error occurs
     */
    public Action modifyMetadata(HttpServletRequest request,
                                 HttpServletResponse response,
                                 CompleteMetadataBean metadata)
            throws ServletException, IOException {
        metadata.setCopyrightHolder(request.getParameter("copyrightHolder"));
        return new ModifyMetadataAction();
    }
}

// CopyrightHolderRecordModifierTest.java