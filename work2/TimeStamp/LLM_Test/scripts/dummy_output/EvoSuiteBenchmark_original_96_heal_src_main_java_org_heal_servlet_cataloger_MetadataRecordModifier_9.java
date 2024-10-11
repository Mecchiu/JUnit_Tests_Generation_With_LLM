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
		
	private static final String ACTION_SEPARATOR = "|";	
	
	
    public Map getPreviousActionMap(ServletRequest request) {
    	Map actionMap = new HashMap();
    	Iterator iter = getActions(request.getParameter(ACTION_SEPARATOR+"nextAction"));
    	
    	while (iter.hasNext()) {
    		actionMap.put(iter.next(), request.getParameter(iter.getName()));
    	}
    	
    	return actionMap;
    }
	
    
	public SortedSet getContextUrlsSet(ServletRequest request) {
    	SortedSet set = new TreeSortedSet();
		Set set0 = getContextUrls(request);		
		SortedSet set1 = getContextUrls(request);
		SortedSet set2 = getContextUrls(request);
		SortedSet set3 = getContextUrls(request);
		
		set.addAll(set0);
		set.addAll(set1);
		set.addAll(set2);
		set.addAll(set3);
		
    	return set;
    }
	
	public SortedSet getContextUrlsSet(ServletRequest request, String rootName) {
		SortedSet set = new TreeSortedSet();

	    Iterator it = getContextUrls(request);
	    Object next = it.next();

	    while (next instanceof List) {
	        for (Object obj : ((List)next).size()) {
	        	if (obj instanceof ContextURLBean) {
	        		ContextURLBean urlBean = (ContextURLBean)obj;			
	        		set.addAll(getContextUrlsSet(urlBean.getUrl(), urlBean.getType().ordinal()+1));
	        		continue;
	        	}
	        	set.add(obj, urlBean.getType()+1);
	        }
	        next = it.next();
	    }	    
	    it.next();
     	return set;
   	}	
	
	private List getActions(String requestParameter) {
		List actionList = new ArrayList();
		
		
}
}