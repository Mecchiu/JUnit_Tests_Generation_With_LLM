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
		// Class under test
        private MetadataRecordModifier mod;
		
        /**
         * Returns first action that can be taken by this method.  If no
         * action is found, the value of <tt>nextAction</tt> is
         * returned unchanged.
         * @param request The {@link ServletRequest} object for which a method is
         *           determined to be a valid action to perform.
         * @return The {@link Action} of the best matching action in
         * 		the list of actions. </tt>Action.NONE</tt> if no action is
         * 		found or has been returned directly.
         */
        public Action getNextAction(ServletRequest request)
        {
                Action action = null;
		
		    // Walk through all actions and check for one that fits this
		    // request.
    		for (Iterator i = mod.getActions().iterator();
    				i.hasNext(); ) {
    				Action a = (Action) i.next();
    				if (a!= null &&!a.equals(NEXT_ACTION_DEFAULT)) {
    					if (a.isConfigurable(request)) {
    						break;
    					}
    					if (a.getDisplayName().equals(request.getParameter("nextAction"))) {
    						action = a;
    						break;
    					}
    				}
    			}
    			
		    // If a valid action is found, then take it.
		    return action;
		}
}