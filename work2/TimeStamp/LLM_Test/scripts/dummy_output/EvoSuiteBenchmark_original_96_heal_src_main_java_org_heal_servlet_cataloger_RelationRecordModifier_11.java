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
		
	/** test case to make sure that if a RelationBean is edited, it can be found
	to edit */
    @Test
    public void testEditMetadata() throws IOException {
        
        final String s1 = "One edit";
        final String s2 = "Two edits";
        final String s3 = "Three edits";

System.out.println("Start test");
        
        RelationBean b1 = new RelationBean(s1);
        RelationBean b2 = new RelationBean(s2);
        RelationBean b3 = new RelationBean(s3);
        
      // List<RelationBean> rels =
            new RelationHelper().updateAll(b1, b2, b3);
        
        assertTrue(cmb.contains(s1));
        assertTrue(cmb.contains(s2));
        assertTrue(cmb.contains(s3));
        
        // Now we have a list of Relations which need to be updated
        List relations = cmb.getRelationIds(b1);
        assertEquals(b1.getId(), relations.iterator().next().getId());
        assertEquals(s3, relations.iterator().next().getId());
        
    }
    
    /**
    * If there is also an existing ID to edit, it should return it.
    */
    @Test
    public void testGetRelationId() {

        final String s1 = "1 edit";
        final String s2 = "2 edit";
        final String s3 = "3 edit";
        
        final String r1 = "1 edit";
        final String r2 = "2 edit";
        final String r3 = "3 edit";

                System.out.println("Start test");
                
        List<RelationBean> relations = new RelationHelper().getRelationIds(b1);
        
        if (relations.size() > 0) {
            return  relations.iterator().next().getId();
        } else {
            fail("No relation found.");
        }

        
        throw new IllegalArgumentException(
                "Shouldn't come here - the test failed to assert as 
                if there is an existing Relation. "
                );
    }
	/**
	* Edit a Relation.
	*/
    @Test
    public void testEditAndGetRelation() throws IOException{

        final String s1 = "One edit";
        final String s2 = "Two edits";
        final String s3 = "Three edits";
        final String r1 = "1 edit";
        final String r2 = "2 edit";
        final String r345 = "345 edits";
        
        RelationBean b1 = new RelationBean(r1);
        RelationBean b2 = new RelationBean(r2);
        RelationBean b5 = new RelationBean(r345);

        List<RelationBean> relations = new RelationHelper().getRelation(b1,b2,b5,b5.getId());

        if (relations.size() > 0) {
            return  relations.iterator().next().getId();
        } else {
            fail("Shouldn't come here - the test failed to assert as the Relation is not editable.");
        }

    }
}