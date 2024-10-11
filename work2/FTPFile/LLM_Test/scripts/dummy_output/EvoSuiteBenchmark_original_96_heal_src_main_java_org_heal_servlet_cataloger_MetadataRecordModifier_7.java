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
		    /**
		     * @testValidate  the metadata record is set correctly to default action of EDIT metadata.
		     */
		    @Test
		    public void verifyDefaultActionEditingMetadata() {
		        final Action action = this.getNextAction(this.getRequest());
		        assertSame(Action.EDIT, action);
		        assertTrue(null!= this.getRequest().getParameters().getValue("nextAction"));
		    }
		    
		    /**
		     * @testValidate  the metadata record is set correctly to EDIT metadata.
		     */
		    @Test
		    public void verifyChangeMetadataToEdit() {
		        final Action action = this.getNextAction(this.getRequest());
		        assertSame(Action.CHANGE, action);
		        assertNull(this.getRequest().getParameters().getValue("nextAction"));
		    }
		        
		    /**
		     * @testValidate  the metadata record is set correctly to add all metadata to the record.
		     */
		    @Test
		    public void changeToAdd() {
		        final Action action = this.getNextAction(this.getRequest());
		        assertSame(Action.ADD, action);
		        assertNotNull(this.getRequest().getParameters().getValue("nextAction"));
		    }
}