// MetadataRecordModifier.java
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

/**
 * A {@link MetadataModifier} which fills the basic metadata information
 * from a <code>ServletRequest</code> into a {@link CompleteMetadataBean}.
 */
public class MetadataRecordModifier implements MetadataModifier {

    private static final Map<String, Action> nextActionMap;

    private static final Action NEXT_ACTION_DEFAULT = new EditMetadataAction();

    static {
        nextActionMap = new HashMap<>();
        nextActionMap.put("save", new EditMetadataAction());
        nextActionMap.put("saveAndExit", new ExitAction());
        nextActionMap.put("saveAndCreateNew", new CreateNewAction());
    }

    public MetadataRecordModifier() {
    }

    /**
     * Fills the basic metadata information from a <code>ServletRequest</code>
     * into a {@link CompleteMetadataBean}.
     *
     * @param cmb      The {@link CompleteMetadataBean} to fill.
     * @param request  The <code>ServletRequest</code> containing the metadata
     *                 information.
     */
    public void updateMetadata(CompleteMetadataBean cmb, ServletRequest request) {
        // implementation
    }

    /**
     * Gets the next {@link Action} to take after saving the metadata from the form.
     *
     * @param request The <code>ServletRequest</code> containing the parameter
     *                <code>"nextAction"</code>, which determines what the next
     *                {@link Action} to take will be. If no <code>"nextAction"</code>
     *                exists, a valid {@link Action} will still be returned.
     * @return The next {@link Action} to take after saving the metadata from the form.
     */
    public Action getNextAction(ServletRequest request) {
        String nextAction = request.getParameter("nextAction");
        if (nextAction != null && nextActionMap.containsKey(nextAction)) {
            return nextActionMap.get(nextAction);
        }
        return NEXT_ACTION_DEFAULT;
    }
}

// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.junit.jupiter.api.Test;

import javax.servlet.ServletRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Test class of {@link MetadataRecordModifier}.
 * It contains ten unit test cases for the {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
 */
class MetadataRecordModifierTest {

    @Test
    void testGetNextAction_Save() {
        ServletRequest request = mock(ServletRequest.class);
        when(request.getParameter("nextAction")).thenReturn("save");
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action expected = new EditMetadataAction();
        Action actual = modifier.getNextAction(request);
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    void testGetNextAction_SaveAndExit() {
        ServletRequest request = mock(ServletRequest.class);
        when(request.getParameter("nextAction")).thenReturn("saveAndExit");
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action expected = new ExitAction();
        Action actual = modifier.getNextAction(request);
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    void testGetNextAction_SaveAndCreateNew() {
        ServletRequest request = mock(ServletRequest.class);
        when(request.getParameter("nextAction")).thenReturn("saveAndCreateNew");
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action expected = new CreateNewAction();
        Action actual = modifier.getNextAction(request);
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    void testGetNextAction_Null() {
        ServletRequest request = mock(ServletRequest.class);
        when(request.getParameter("nextAction")).thenReturn(null);
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action expected = new EditMetadataAction();
        Action actual = modifier.getNextAction(request);
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    void testGetNextAction_EmptyString() {
        ServletRequest request = mock(ServletRequest.class);
        when(request.getParameter("nextAction")).thenReturn("");
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action expected = new EditMetadataAction();
        Action actual = modifier.getNextAction(request);
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    void testGetNextAction_InvalidAction() {
        ServletRequest request = mock(ServletRequest.class);
        when(request.getParameter("nextAction")).thenReturn("invalidAction");
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action expected = new EditMetadataAction();
        Action actual = modifier.getNextAction(request);
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    void testGetNextAction_SaveAndExitCaseInsensitive() {
        ServletRequest request = mock(ServletRequest.class);
        when(request.getParameter("nextAction")).thenReturn("SAVEANDEXIT");
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action expected = new ExitAction();
        Action actual = modifier.getNextAction(request);
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    void testGetNextAction_SaveAndCreateNewCaseInsensitive() {
        ServletRequest request = mock(ServletRequest.class);
        when(request.getParameter("nextAction")).thenReturn("SAVEANDCREATENEW");
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action expected = new CreateNewAction();
        Action actual = modifier.getNextAction(request);
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    void testGetNextAction_NullRequest() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action expected = new EditMetadataAction();
        Action actual = modifier.getNextAction(null);
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    void testGetNextAction_InvalidActionCaseInsensitive() {
        ServletRequest request = mock(ServletRequest.class);
        when(request.getParameter("nextAction")).thenReturn("INVALIDACTION");
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        Action expected = new EditMetadataAction();
        Action actual = modifier.getNextAction(request);
        assertEquals(expected.getClass(), actual.getClass());
    }
}