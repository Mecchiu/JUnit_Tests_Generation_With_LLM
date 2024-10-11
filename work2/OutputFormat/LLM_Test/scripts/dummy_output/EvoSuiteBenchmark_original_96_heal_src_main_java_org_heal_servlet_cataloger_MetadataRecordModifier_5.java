// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.CopyrightTextBean;
import org.heal.module.metadata.DiseaseDiagnosisBean;
import org.heal.module.metadata.FormatBean;
import org.heal.module.metadata.KeywordBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.ThumbnailBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.servlet.Action;
import org.heal.util.DateTools;
import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MetadataRecordModifier}.
* It contains one unit test case for the {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
*/
class MetadataRecordModifierTest {
		

}

class EditMetadataAction implements Action<CompleteMetadataBean> {}
	
@SuppressWarnings("serial")
public final class EditMetadataActionTest extends ServletContextTestBase {

    @Test
    void test_one_element() {
        final MetadataRecordModifier modifier = new MetadataRecordModifier();
        final CompleteMetadataBean cmb = new CompleteMetadataBean();

        final Action nextAction = modifier.getNextAction(new MetametadataIdentifierBean());

        assertEquals(NEXT_ACTION.getName(), nextAction.getName());
        //
        // The next action will also default to EDIT
        //
        assertNull(nextAction.getNextAction());
        //
        // Check with an element
        //
        final MetametadataIdentifierBean v1 = new MetametadataIdentifierBean();
        cmb.addComponent(v1);
        final Action nextAction1 = modifier.getNextAction(v1);
        assertNotNull(nextAction1);
        assertEquals(NEXT_ACTION.getName()+" (v1)", nextAction1.getName());
        //
        // And another element
        //
        final MetametadataIdentifierBean v2 = new MetametadataIdentifierBean();
        cmb.addComponent(v2);
        final Action nextAction2 = modifier.getNextAction(v2);
        assertNotNull(nextAction2);
        assertEquals(NEXT_ACTION.getName()+" (v2)", nextAction2.getName());
    }
	
    @Test
    void test_one_element_using_multiple_components() {
        final MetadataRecordModifier modifier = new MetadataRecordModifier();
        final CompleteMetadataBean cmb = new CompleteMetadataBean();

        final Iterator<ResourceBean<?>> ite1 = cmb.resourceIterator();
        final Action nextAction1 = modifier.getNextAction(new MetametadataIdentifierBean(), ite1);
        fail("next action should not be a valid first action");
    }

	@Test
	void test_two_element() {
		final MetadataRecordModifier modifier = new MetadataRecordModifier();
		final CompleteMetadataBean cmb = new CompleteMetadataBean();

		final Iterator<ResourceBean<?>> ite1 = cmb.resourceIterator();
		final Action nextAction1 = modifier.getNextAction(new MetametadataIdentifierBean(), ite1);
		assertEquals("next action should be an edit on 1 resource",
				NEXT_ACTION.getName()+" (v1)", nextAction1.getName());

		final Iterator<MetametadataIdentifierBean> ite2 =
				cmb.resourceIterator();
		final Action nextAction2 = modifier.getNextAction(new MetametadataIdentifierBean(), ite2);
		assertNotNull("first action should not be an edit on 2 resources", nextAction2);
		assertEquals("edit on 2 resources",
				NEXT_ACTION.getName()+" (v2)", nextAction2.getName());
	}

	@Test
	void test_multiple_element_using_multiple_components() {
}
}