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
		
	private final Action action = FIRST_ACTION_DEFAULT;
    private final MetametadataIdentifierBean metadataIdentifierBean = new MetametadataIdentifierBean();
    private final MetametadataIdentifierBean templateMetadataIdentifierBean = new MetametadataIdentifierBean();
	private final MetametadataIdentifierBean metadataIdentifier1 = new MetametadataIdentifierBean();
    private final String currentTaxonPath = "RHEY";
	private final SortedSet currentTaxonPathSet = Collections.singleton(currentTaxonPath);
	private final MetametadataIdentifierBean templateMetadataIdentifier2 = new MetametadataIdentifierBean();
	private final ContentTypeBean templateContentType = ContentTypeBean.ofMediaType(".xhtml");
	private final ContributorBean templateContributorBean = new ContributorBean();
    private final ContributorBean creatorContributorBean = new ContributorBean();
    private final ContributorBean commenterContributorBean = new ContributorBean();
    private final ContributorBean adminContributorBean = new ContributorBean();
	private final ContributorBean commenterToCreatorContributorBean = new ContributorBean();
    private final ContributorBean commenterToCommenterContributorBean = new ContributorBean();
    
	private final MetadataBean template = new MetadataBean();
	private final MetadataBean creator = new MetadataBean();
	private final MetadataBean commenterToCreator = new MetadataBean();
	private final MetadataBean commenterToCommenter = new MetadataBean();
	
	@Test
	public void whenGettingAllMetadataBeansFromTheServletRequest_ThenItReturnsTheContentTypesAndContributorsOfItsTodos() {
		
		List<MetadataBean> result0 = new ArrayList<>();
		List<MetadataBean> result1 = new ArrayList<>();
		setValues(result0, result1);
		
		SortedSet result = getMetadataBeansFromTheServletRequest(NEXT_ACTION_DEFAULT.toString());
		assertTrue("After step one, we should find the same result", result.equals(result0));
		
		result0 = getMetadataBeansFromTheServletRequest(NEXT_ACTION.toString());
		assertTrue("After step two, we should find the same result", result.equals(result0));		
	}
	
	

	@Test
	public void whenGettingTheContentTypesInADealMetadataRecordThenTheCorrectNumberOfContentTypes() {
		List<MetadataBean> result = new ArrayList<>();
		setValues(result, result);
		
		List<MetadataBean> result0 = getMetadataBeansFromTheServletRequest(NEXT_ACTION_DEFAULT.toString());
		assertTrue("After step one, we should find the same result", result.equals(result0));
		
		List<MetadataBean> result1 = getMetadataBeansFromTheServletRequest(NEXT_ACTION.toString());
		assertTrue("After step two, we should find the correct number of content types", result.size() == 2);
	}
	
	private void setValues(List<MetadataBean> expectedResults0, List<MetadataBean> expectedResults1) {
		expectedResults0.add(activityBean());
		expectedResults1.add(contentTypeBean());
		expectedResults0.add(authorBean());
}
}