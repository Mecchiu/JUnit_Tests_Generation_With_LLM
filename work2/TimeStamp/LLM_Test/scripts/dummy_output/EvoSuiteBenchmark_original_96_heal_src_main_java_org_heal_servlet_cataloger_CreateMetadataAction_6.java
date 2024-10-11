// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains one unit test case for the {@link CreateMetadataAction#actionRequiresLogin()} method.
*/
class CreateMetadataActionTest {
		 
    /**
     *
     */
    @Test
    public void testCreateMetadataRecord() {
        
        CompleteMetadataBean cmb = new CompleteMetadataBean();
        cmb.setDescription("Created for testing");
        MetadataDAO mdDAO = new MetadataDAO();
        
        List objects = mdDAO.findByFullNameAndType("Dummy Type",
                CompleteMetadataBean.TYPE_DUMMY_COLLECTION, cmb);
        Iterator iter = objects.iterator();
        // Since we always fill in an empty complete record, check that it
        // appears in the database by looking at the first object.
        assertTrue("Expected object: " + cmb.getDescription(), iter.hasNext());
    }
    
    /**
     * Test that we can read and write objects.
     */
    @Test
    public void testSettersAndWritesMetadata() {

        CompleteMetadataBean cmb1 = new CompleteMetadataBean();
        cmb1.setDescription("This is the first partial record.");

        CompleteMetadataBean cmb2 = new CompleteMetadataBean();
        cmb2.setDescription("This is the second partial record.");

        List objects = new List();
        objects.add(cmb1);
        objects.add(cmb2);

        CompleteMetadataBean cmb3 = new CompleteMetadataBean();
        cmb3.setDescription("This is the third partial record.");

        List objects_2 = new List();
        objects_2.add(cmb1);
        objects_2.add(cmb3);

        CompleteMetadataBean cmb4 = new CompleteMetadataBean();
        cmb4.setDescription("This is the fourth partial record.");

        List cmb_objects = new List();
        cmb_objects.add(cmb1);
        cmb_objects.add(cmb2);
        cmb_objects.add(cmb3);
        cmb_objects.add(cmb4);

        MetadataDAO mdDAO = new MetadataDAO();
        CompleteMetadataBean cmb5 = mdDAO.create(objects_2);
        CompleteMetadataBean cmb6 = mdDAO.create(objects);

        assertEquals("Expected partial objects", 2, objects_2.size());
        assertEquals("Should match partial objects", cmb2, cmb_objects.get(0));
        assertEquals("Should match partial objects", cmb1, cmb_objects.get(1));

        Iterator iter = objects_2.iterator();
        assertTrue("Expected objects: " + objects_2.size(), iter.hasNext());
        assertEquals("Expected partial object: " + cmb2, cmb2, iter.next());
        assertTrue("Expected partial object: " + cmb3, iter.hasNext());
        assertEquals("Object should be complete", cmb3, iter.next());

        iter = objects_2.iterator();
        assertTrue("Expected objects: " + objects_2.size(), iter.hasNext());
        assertEquals("Expected partial object: " + cmb6, cmb4, iter.next());
        assertFalse("Expected object: " + cmb5, iter.hasNext());

        assertTrue("Should NOT be able to read/write incomplete records",
               !AuthenticationTools.isReadPermitted("READ", cmb1));
        assertTrue("Should be able to write", AuthenticationTools.isWritePermitted("WRITE", cmb1));
    }

	@Test
	public void testMap() throws ClassNotFoundException,
			SQLException, NoSuchMethodException, IOException, Exception {

        CompleteMetadataBean cmb = new CompleteMetadataBean();
        cmb.setDescription("Created for testing");
        List objects = new List();
        objects.add(cmb);

        Map map = new Map();
        map.put("full_name", "Dummy Type");
        map.put("type", "DUMMY_COLLECTION");

        MetadataDAO mdDAO = new MetadataDAO();
        completeObject(objects, cmb, mdDAO, map);
        assertTrue("There should be metadata objects: " + map.size(), objects.size() > 0);

        CompleteMetadataBean cmb2 = completeObjects(objects, cmb);
        assertEquals("Should have created two complete objects", 2, objects.size());
	}
	
	private CompleteMetadataBean completeObject(List objects,
			CompleteMetadataBean cmb, MetadataDAO mdDAO, Map map)
			throws IOException, ClassNotFoundException,
			SQLException, NoSuchMethodException, IOException {
		CompleteMetadataBean newCmb = new CompleteMetadataBean();
}
}