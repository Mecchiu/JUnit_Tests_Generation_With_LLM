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
     * Set up a unit test.
     */
    @Test
    public void test() {
        final MetadataRecordModifier.MetadataRecordBean mrb = new MetadataRecordModifier.MetadataRecordBean(
                "name", "desc", "http://example.ch",
                false, DateTools.getNextYearMonthDay("2014-01"), "2007/06");
        final List<CompleteMetadataBean> cbs = new ArrayList<CompleteMetadataBean>(10);
        cbs.add(new CompleteMetadataBean(
                "Contrib1",
                "Contrib Name1",
                null));
        cbs.add(new CompleteMetadataBean(
                "Contrib2",
                "Contrib Name 2",
                null));
        final List<TaxonPathBean> tpb = new ArrayList<TaxonPathBean>(3);
        tpb.add(new TaxonPathBean(
                             "Taxon Name1",
                             "Taxon Name 2",
                             null));
        tpb.add(new TaxonPathBean(
                             "Taxon Name2",
                             "Taxon Name 3",
                             null));
        final List<ThumbnailBean> tb = new ArrayList<ThumbnailBean>(2);
        tb.add(new ThumbnailBean(
                             "Image URL1",
                             "SVG",
                             150));
        tb.add(new ThumbnailBean(
                             "Image URL2",
                             "SVG",
                             100));
        final List<String> cts = new ArrayList<String>(2);
        cts.add("Author Name");
        cts.add(null);
        final SortedSet<Source> ss = new TreeSet<Source>();
        ss.add(new Source("Author URL", "Image URL1", 30.0));
        ss.add(new Source("Author URL", "Image URL2", -20.0));
        ss.add(new Source("Original", "Original URL", 25.0));
        tpb.add(new TaxonPathBean(
                             "Taxon Name2",
                             "",
                             Collections.singleton(MetametadataIdentifierBean.TAXON_PATH_URL_SENTIR)));
        final List<SortedSet<TargetUserGroupBean>> ass = new ArrayList<SortedSet<TargetUserGroupBean>>(3);
        final SortedSet<TargetUserGroupBean> ags1 = new TreeSet<TargetUserGroupBean>();
        ags1.add(new TargetUserGroupBean(
                             "TG1",
                             "TG Name 1",
                             "TG Group 1"));
        ags1.add(new TargetUserGroupBean(
                             "TG1",
                             "TG Name 1",
                             "TG Group 2"));
        ags1.add(new TargetUserGroupBean(
                             "TG1",
                             "TG Name 1",
                             "TG Group A"));
        final SortedSet<TargetUserGroupBean> ags2 = new TreeSet<TargetUserGroupBean>();
        ags2.add(new TargetUserGroupBean(
                             "TG2",
                             "TG Name 2",
                             "TG Group 1"));
        ags2.add(new TargetUserGroupBean(
                             "TG2",
                             "TG Name 2",
                             "TG Group 2"));
        final SortedSet<TargetUserGroupBean> ags3 = new TreeSet<TargetUserGroupBean>();
        ags3.add(new TargetUserGroupBean(
                             "TG