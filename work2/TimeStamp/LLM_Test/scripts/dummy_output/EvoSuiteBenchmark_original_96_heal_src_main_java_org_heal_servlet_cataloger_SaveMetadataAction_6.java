// SaveMetadataActionTest.java
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

/**
* Test class of {@link SaveMetadataAction}.
* It contains one unit test case for the {@link SaveMetadataAction#actionRequiresLogin()} method.
*/
class SaveMetadataActionTest {
		public SaveMetadataActionTest() {
					 }

	/**
	* @throws Classnotfound
	* @throws Classnotfound
	*/
	@Test
    public void testSimple() throws Classnotfound, ServletException, IOException {
        System.err.println("Start SimpleAction with no data");
        MetadataDAO metadataDAO = PublishMetadataAction.getDatabase();
        Iterator<MetametadataIdentifierBean> it = metadataDAO.findMetametadataIdentifiers(CompleteMetadataBean.class);
        MetametadataIdentifierBean id;
        while(it.hasNext()) {
            id = it.next();
            System.err.println(id.getId() + " -- " + id);
        }
        System.err.println("Start SimpleAction");
        SaveMetadataAction sa = new SaveMetadataAction();

        ContextURLBean c = new ContextURLBean();
        c.setId(99);
        c.setStart(CompleteMetadataBean.class.getSimpleName());
        c.setClassname(CompleteMetadataBean.class.getName());
        it = metadataDAO.newFullRequirement(c);
        System.err.println("FindFull req - " + it.next().getId());

        MetametadataIdentifierBean id3 = (MetametadataIdentifierBean)it.next();
        id3 = metadataDAO.newMetametadataIdentifier(id3);
        System.err.println("Find Full Id3 - " + id3.getId());

        System.err.println("Start Saving Metadata using the id");
        CompleteMetadataBean cmb = metadataDAO.findCompleteMetadata(id3);
        cmb = metadataDAO.saveCompleteMetadata(cmb);
        System.err.println("Save complete Metadata");

        System.err.println("Start Saving Metadata with two new records using the id");
        cmb = metadataDAO.findCompleteMetadata(id3);
        cmb = metadataDAO.saveCompleteMetadata(cmb);
        System.err.println("Save complete Metadata with two new records using the id");

        System.err.println("Start saving a metadata record from id99 to some id100");
        c = new ContextURLBean();
        c.setId(99);
        c.setStart(CompleteMetadataBean.class.getSimpleName());
        c.setClassname(CompleteMetadataBean.class.getName());
        c.setId("100");

        it = metadataDAO.newFullRequirement(c);
        System.err.println("FindFull req - " + it.next().getId());

        id = (MetametadataIdentifierBean)it.next();

        System.out.println("Creating id: " + id.getId() + " From: " + id);
        it = metadataDAO.newMetametadataIdentifier(id);
        c = new ContextURLBean();
        c.setId(99);
        c.setStart(CompleteMetadataBean.class.getSimpleName());
        c.setClassname(CompleteMetadataBean.class.getName());
        c.setId("100");
        c = metadataDAO.saveCompleteMetadata(c);
        System.err.println("Save complete metadata from " + c.getCp().getId() + " to " + c.getCp().getClassname());
        System.err.println("Now find it");
        cmb = metadataDAO.findCompleteMetadata(id);
        cmb = metadataDAO.saveCompleteMetadata(cmb);
        System.err.println("Save complete metadata");

        System.err.println("Now find it");
        cmb = metadataDAO.findCompleteMetadata(100);
        cmb = metadataDAO.saveCompleteMetadata(cmb);
        System.err.println("Save complete metadata");
        assertTrue("Error finding complete from " + c.getCp().getId() + " to " + c.getCp().getClassname(), cmb.getCp().getId() == c.getCp().getId());

        System.err.println("Start another save with a valid id");
        id = (MetametadataIdentifierBean)metadataDAO.newCompleteMetadataIdentifier(-1, c.getId());

        System.err.println("Save complete metadata from " + c.getId() + " to " + c.getCp().getClassname());
}
}