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
		/**
		 * This unit test case checks for the case when a
		 * request that requires login is made with a
		 * Parameter = "nextAction" argument that
		 * isn't specified in the "nextMetadata" argument.
		 */

        @Test
        public void actionRequiresLoginAndNextMetadataOtherElementSpecifiedThenCheckedForInjection() {
                assertFalse("Wrong action: " + NEXT_ACTION.getAsString(), NEXT_ACTION.validate(RelationBean.class, null));
                assertFalse("Wrong action: " + NEXT_ACTION.getAsString(), NEXT_ACTION.validate(List.class, null));
        }

        /**
		 * This unit test case checks that a {@link RelationBean}
		 * can be saved correctly.
		 */

		@Test
        public void actionShouldBeAbleToSaveRelationBean() {
                List<RelationBean> relations = findRelationBeanFactory().find("test", 1);
                RelationBean relation = getRelation(relations.get(0));
                RelationBean updated = updateRelationBean(relation, 1, true);
                assertEquals(related, updated);
        }



        /**
		 * This unit test case checks that a {@link MetadataBean}
		 * can be saved correctly.
		 */

		@Test
        public void actionShouldBeAbleCreateCompleteMetadataBean() {
                CompleteMetadataBean completeMetadata = getCompleteMetadata(1);
                CompleteMetadataBean updated = updateMetadata(completeMetadata, 1);
                assertEquals(completeMetadata, updated);
        }

}