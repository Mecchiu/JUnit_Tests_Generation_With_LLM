
package org.heal.servlet.cataloger;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SaveMetadataActionTest {
  public static final long NEGATIVE_ID = -1L;
  public static final String USERNAME = "healuser";
  public static int NUMBER_METADATA = 8;
  public static int QUERY_METADATA = 2;
  @Test
        public void testActionRequiresLogin() {
         assertTrue(actionRequiresLogin() instanceof SaveMetadataAction);
        }
  @Test
        public void testConstructor() {
   assertTrue(action.getClass().getAnnotation(Action.class).requiresLogin());
         SaveMetadataAction saver = new SaveMetadataAction();
    SaveMetadataAction other = new SaveMetadataAction();
    saver.scrubMetadata(other);
    assertTrue(saver.actionRequiresLogin());
  }
    @Test
        public void testScrubMetadata() throws ServletException, SQLException, IOException {
         int numMetadataToBeSaved = QUERY_METADATA - 1;
         MetametadataIdentifierBean mib1 = new MetametadataIdentifierBean();
         cmb = new CompleteMetadataBean();
         mib1.setAuthority("nickserv");
         cmb.setAuthority(mib1);
         cmb.setIdentifier(numMetadataToBeSaved);
         Date date1 = new Date();
         cmb.setStartDate(date1);
         cmb.setEndDate(date1);
         cmb.setCreationDate(date1);
         ContributorBean cbr1 = new ContributorBean();
         ContributorBean cbr2 = new ContributorBean();
         mib1.getContributors().add(null);
         Date date2 = new Date();
         cbr1.setAuthority("nobody");
         Date date3 = new Date();
         mib1.getContributors().add(null);
         Date date4 = new Date();
         Date date5 = new Date();
         Date date6 = new Date();
         ContributorBean cbr6 = new ContributorBean();
         Date date7 = new Date();
         Date date8 = new Date(Long.parseLong("92313560000"));
         ContributorBean cbr7 = new ContributorBean();
         cbr7.setAuthority("nobody");
         ContributorBean cbr8 = new ContributorBean();
         cbr8.setAuthority("noone");
         Date date9 = new Date();
         ContributorBean cbr9 = new ContributorBean();
         cbr9.setAuthority("nonsense");
         Date date10 = new Date();
         ContributorBean cbr10 = new ContributorBean();
         cbr10.setAuthority("noseserv");
         Date date11 = new Date();
         cbr6.setContributor(cbr9);
         Date date12 = new Date();
         cbr6.setContributor(cbr8);
         Date date13 = new Date();
         Date date14 = new Date();
         Date date15 = new Date();
         ContributorBean cbr16 = new ContributorBean();
         cbr16.setContributor(cbr10);
         Date date17 = new Date();
         Date date18 = new Date(Long.parseLong("11905776522"));
         ContributorBean cbr17 = new ContributorBean();
         cbr17.setContributor(cbr16);
         Date date19 = new Date();
         ContributorBean cbr20 = new ContributorBean();
         cbr20.setContributor(cbr10);
         Date date20 = new Date();
         Date date21 = new Date(Long.parseLong("128937273600000"));
         ContributorBean cbr21 = new ContributorBean();
         cbr21.setContributor(cbr10);
         Date date22 = new Date(Long.parseLong("132864708800000"));
         ContributorBean cbr22 = new ContributorBean();
}
}