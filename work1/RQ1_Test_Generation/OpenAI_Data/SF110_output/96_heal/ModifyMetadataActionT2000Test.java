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
import javax.servlet.http.HttpServletRequest;

/**
 * <p>An interface for classes that modify the metadata in a
 * {@link CompleteMetadataBean}.</p>
 *
 * <p>The {@link ModifyMetadataAction} uses this interface to determine
 * the next {@link Action} to execute.</p>
 */
public interface MetadataModifier {

    /**
     * <p>Modifies the metadata in the <code>CompleteMetadataBean</code>
     * based on the parameters in the <code>request</code>.</p>
     *
     * @param cmb the <code>CompleteMetadataBean</code> to modify
     * @param request the <code>HttpServletRequest</code> that contains the
     * parameters to modify the <code>CompleteMetadataBean</code>
     */
    public void updateMetadata(CompleteMetadataBean cmb, HttpServletRequest request);

    /**
     * <p>Returns the next {@link Action} to execute.</p>
     *
     * @param request the <code>HttpServletRequest</code> that contains the
     * parameters to determine the next <code>Action</code>
     * @return the next <code>Action</code> to execute
     */
    public Action getNextAction(HttpServletRequest request);
}

// MetadataModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import javax.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MetadataModifier}.
* It contains ten unit test cases for the {@link MetadataModifier#updateMetadata(CompleteMetadataBean, HttpServletRequest)} method.
*/
class MetadataModifierTest {
		
		/**
		* Test case for {@link MetadataModifier#updateMetadata(CompleteMetadataBean, HttpServletRequest)} method.
		* This test case checks if the method returns null.
		*/
		@Test
		void testUpdateMetadata() {
				MetadataModifier metadataModifier = new MetadataModifier() {
						@Override
						public void updateMetadata(CompleteMetadataBean cmb, HttpServletRequest request) {
						}

						@Override
						public Action getNextAction(HttpServletRequest request) {
								return null;
						}
				};
				assertNull(metadataModifier.updateMetadata(null, null));
		}
}

// MetadataRecordModifier.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.servlet.cataloger.actions.AddContextURLAction;
import org.heal.servlet.cataloger.actions.AddContributorAction;
import org.heal.servlet.cataloger.actions.AddCopyrightHolderAction;
import org.heal.servlet.cataloger.actions.AddControlledVocabularyAction;
import org.heal.servlet.cataloger.actions.AddRequirementAction;
import org.heal.servlet.cataloger.actions.AddRelationAction;
import org.heal.servlet.cataloger.actions.AddMetametadataIdentifierAction;
import org.heal.servlet.cataloger.actions.AddMetametadataContributorAction;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>An implementation of {@link MetadataModifier} that modifies the
 * metadata in a {@link CompleteMetadataBean} based on the parameters
 * in a <code>HttpServletRequest</code>.</p>
 *
 * <p>This class is used to modify the metadata in the
 * <code>CompleteMetadataBean</code> when the form that is submitted
 * has a <code>type</code> parameter with a value of
 * <code>"metadata"</code>.</p>
 */
public class MetadataRecordModifier implements MetadataModifier {

    /**
     * <p>Modifies the metadata in the <code>CompleteMetadataBean</code>
     * based on the parameters in the <code>request</code>.</p>
     *
     * <p>This method sets the following metadata fields:</p>
     *
     * <ul><li>{@link CompleteMetadataBean#setTitle(String)}
     * <li>{@link CompleteMetadataBean#setDescription(String)}
     * <li>{@link CompleteMetadataBean#setLanguage(String)}
     * <li>{@link CompleteMetadataBean#setKeyword(String)}
     * <li>{@link CompleteMetadataBean#setCoverage(String)}
     * <li>{@link CompleteMetadataBean#setStructure(String)}
     * <li>{@link CompleteMetadataBean#setAggregationLevel(String)}
     * </ul>
     *
     * @param cmb the <code>CompleteMetadataBean</code> to modify
     * @param request the <code>HttpServletRequest</code> that contains the
     * parameters to modify the <code>CompleteMetadataBean</code>
     */
    public void updateMetadata(CompleteMetadataBean cmb, HttpServletRequest request) {
        cmb.setTitle(request.getParameter("title"));
        cmb.setDescription(request.getParameter("description"));
        cmb.setLanguage(request.getParameter("language"));
        cmb.setKeyword(request.getParameter("keyword"));
        cmb.setCoverage(request.getParameter("coverage"));
        cmb.setStructure(request.getParameter("structure"));
        cmb.setAggregationLevel(request.getParameter("aggregationLevel"));
    }

    /**
     * <p>Returns the next {@link Action} to execute.</p>
     *
     * <p>This method returns the {@link AddContextURLAction}.</p>
     *
     * @param request the <code>HttpServletRequest</code> that contains the
     * parameters to determine the next <code>Action</code>
     * @return the next <code>Action</code> to execute
     */
    public Action getNextAction(HttpServletRequest request) {
        return new AddContextURLAction();
    }
}

// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.servlet.cataloger.actions.AddContextURLAction;
import org.heal.servlet.cataloger.actions.AddContributorAction;
import org.heal.servlet.cataloger.actions.AddCopyrightHolderAction;
import org.heal.servlet.cataloger.actions.AddControlledVocabularyAction;
import org.heal.servlet.cataloger.actions.AddRequirementAction;
import org.heal.servlet.cataloger.actions