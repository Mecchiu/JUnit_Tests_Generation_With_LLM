// RelationRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.CompleteMetadataBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RelationRecordModifier}.
* It contains one unit test case for the {@link RelationRecordModifier#actionRequiresLogin()} method.
*/
class RelationRecordModifierTest {
RelationRecordModifierTest() {
	}

	/**
 * Test method for {@link RelationRecordModifier#actionRequiresLogin()}.
 */
	@Test
	void actionRequiresLogin_Test()  {
		boolean result = true;
				
		// test without login: this will do nothing
		result = actionRequiresLogin();
		assertTrue(result);
	}

	@Test
    void testRelationNotExists() throws Exception {
        // create a relation
        RelationBean relation = new RelationBean();
        // should fail
        if (relation.getID() == 9) {
            fail("CWWKZ0002E");
        }
        // create new relation
        if (relation.getID() == 10) {
            // should fail
            if (relation.getRelation() == null) {
                fail("CWWKZ0002E");
            }
        }
        // edit the relation
        relation.setRelation("myRelation");
        // should success
        relation.setID(11);
        // test
        relation.setTitle("title");
        relation.setDescription("description");
        result = relation.isModified();
        assertFalse(result); // not modify it for an existing relation
        // test
        if (relation.getID() == 11) {
            // should fail
            if (relation.getRelation() == null) {
                fail("CWWKZ0002D");
            }
        }
    }

	@Test
    public void testGet() throws Exception {
        // test without login: this will do nothing
        CompleteMetadataBean completeMetadataBean = new CompleteMetadataBean();
        if (completeMetadataBean.isModified()) {
            fail("CWWKZ0014E");
        }
        if (completeMetadataBean.getMetadata().isModified()) {
            fail("CWWKZ0015E");
        }
        if (completeMetadataBean.getRelationBean().getRelatedRelations().isModified("Relation")) {
            fail("CWWKZ0016E");
        }
        
        CompleteMetadataBean completeMetadataBean1 = new CompleteMetadataBean();
        completeMetadataBean1.setRelationBean(new CompleteMetadataBean());
        List<CompleteMetadataBean> list = completeMetadataBean.getMetadata().addAll(completeMetadataBean1.getMetadata());
        assertEquals(1, list.size());
		CompleteMetadataBean meta = completeMetadataBean.getMetadata().get(0);
		CompleteMetadataBean completeMetadataBean2 = completeMetadataBean1.getMetadata().get(0);
		assertEquals("title", meta.getValue());
		assertEquals("description", completeMetadataBean2.getValue());
		assertEquals("myRelation", meta.getRelation().getID());
        // test
        CompleteMetadataBean completeMetadataBean3 = new CompleteMetadataBean();
        list = completeMetadataBean.getMetadata().addAll(completeMetadataBean3.getMetadata());
        assertEquals(2, list.size());
		CompleteMetadataBean meta2 = completeMetadataBean.getMetadata().get(1);
		CompleteMetadataBean completeMetadataBean4 = completeMetadataBean3.getMetadata().get(0);
		assertEquals("title", meta2.getValue());
		assertEquals("description", completeMetadataBean4.getValue());
		assertEquals("myRelation", completeMetadataBean4.getRelation().getID());
    }

    @Test
    public void testEdit() throws Exception {
        // test without login: this will do nothing
        CompleteMetadataBean completeMetadataBean = new CompleteMetadataBean();
        String editedTitle = "titleEdit";
        completeMetadataBean.setTitle(editedTitle);
        String editedDescription = "descriptionEdit";
        completeMetadataBean.setDescription(editedDescription);
        String editedRelation = "RelationEdit";
        CompleteMetadataBean completeMetadataBean6 = new CompleteMetadataBean();
        completeMetadataBean6.setRelationBean(new CompleteMetadataBean());
        completeMetadataBean6.getRelationBean().setID("RelationEdit");
        completeMetadataBean6.getRelationBean().getRelatedRelations().add(new CompleteMetadataBean(1,1));
        completeMetadataBean6.getMetadata().addAll(completeMetadataBean.getMetadata());
        completeMetadataBean6.getMetadata().get(0).setValue(completeMetadataBean.getMetadata().get(0).getValue());
        CompleteMetadataBean completeMetadataBean7 = completeMetadataBean.getMetadata().get(0);
        list = completeMetadataBean.getMetadata().addAll(completeMetadataBean7.getMetadata());
        int pos = list.indexOf(completeMetadataBean7);
        list.set(pos, completeMetadataBean6);
        list.addAll(list, completeMetadataBean5.getMetadata());
        pos = list.lastIndexOf(completeMetadataBean7);
        list.set(pos, list.remove(pos, 1));
        list.addAll(list, completeMetadataBean.getMetadata());
    }

}