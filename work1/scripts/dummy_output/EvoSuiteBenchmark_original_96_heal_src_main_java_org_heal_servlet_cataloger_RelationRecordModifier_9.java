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
		public void testActionRequiresLogin() {
				boolean test = false;
				try {
				actionRequiresLogin();
					test = true;
				}
				catch(IllegalStateException ignored){}
				assertFalse("If this failed to catch it, it should have thrown it", test);
		}

 
	/**
	* Execute any action.
	*/
	Action actionRequiresLogin() {
		return FIRST_ACTION;
	}

	@Test
	public void testRelationBean() {
		Iterator iter = RelationsBean.list();
		assertTrue(iter.hasNext());

		RelationBean b = (RelationBean) iter.next();
		assertNotNull(b);

		assertEquals(b.getID(), "c-1");
		
	}

	List addRelToTable(CompleteMetadataBean cmb1, String id, String relationID) {

			Iterator iter = cmb1.listIterator();
			while (iter.hasNext()) {
				cmb1.addItemToRelation(iter.next(), relationID);
			}

			List result = cmb1.getRelationTable();

		return result;
		
	}

	@Test
	public void testRelationBeanFindWhere() {
		Iterator iter1 = RelationsBean.list();
		Iterator iter2 = RelationsBean.list();
		Iterator iter3 = RelationsBean.list();
		Set set1 = new HashSet();
		Set set2 = new HashSet();
		Set set3 = new HashSet();
		Iterator it;
		String id;

		//Find the relation in which the first item is present
		iter1 = cmb1.findWhere((String) null, "relation_id");
		
		while(iter1.hasNext()) {
			iter = iter1.next();
			it = iter.iterator();
			while (it.hasNext()) {
				id = (String ) it.next();
			}
		}
			
		//Add the second item into the set
		set1.add(id);
		set2.add(id);

		//Find the relation in which the second item is present
		iter2 = RelationsBean.list();
		iter3 = RelationsBean.list();
		iter = iter2.findWhere((String) null, "relation_id");
		it = iter.iterator();
		
		while(iter.hasNext()) {
			iter.next();
			it = iter.iterator();
			while (it.hasNext()) {
				id = (String ) it.next();
			}
		}
		
//		System.out.println("Add: "+ id + '&'+(List)cmb1);
		set3 = RelationsBean.findFindWhere(set1, id);
		
		assertNotNull("Added relation "+id+" not found", set1);
		assertTrue("Added relation "+id+" not found", set1.size()==1);
		assertTrue("Added relation "+id+" not found", set2.size()==1);
		Iterator iterator = set1.iterator();
		Iterator iterator2;
		iterator2 = set2.iterator();
		boolean c1Found = false;
		boolean c2Found = false;
		boolean c3Found = false;
		while(iterator2.hasNext()) {
			String current1Id = (String) iterator2.next();
			String current2Id = ((CompleteMetadataBean)cmb1.getItem(current1Id)).getID();
			if(current1Id.equals(id)|| id.equals(id)) {
				iterator.next();
				c1Found = true;
			}
		}
		assertTrue("Added relation "+id+" not found", c1Found);
		assertTrue("Added relation "+id+" not found", current2Id.equals(id));
			

	}
	

	MetadataModifier nextActionModifier() throws IOException, ServletException {
		assertEquals(NEXT_ACTION, next());
		return this;
	}
	
//	@Test
	public void testAddRelAfterModifyRemovesRelWhenFirstIsModified() {
		
		Iterator iter1 = RelationsBean.findFindRelationBean();
		Iterator it;
		String id;
		it = iter1.iterator();
		Set set = new HashSet();
		HashSet cset1 = new HashSet();
		
		while(it.hasNext()) {
			id = (String ) it.next();
			set.add(id);
		}
	Set set2 = ((CompleteMetadataBean) cmb1.getItem(set2Name)).getRelationTable();
		cmb1.addRelationBean(cset1);
		assertFalse("Relation should not be present in set1 after adding relation before modification", set1.contains(set2Name));
		//Modify first item
		cmb1.deleteRel(set2);
		assertFalse("Relation should not be present in set1 after modification after adding relation", set1.contains(set2Name));
	

	}

	Map findMapOfRelationBean(List relations) {
		Iterator it = relations.iterator();
		HashSet cset1 = new HashSet();
		
		while(it.hasNext()) {
			String relationID = (String ) it.next();
			cset1.add(relationID);
		}
		return ((CompleteMetadataBean) cmb1.getItem(cmapBeanName)).getRelationTable();

	}

    private CompleteMetadataBean cmapBeanName = new CompleteMetadataBean();
    private CompleteMetadataBean cmapBean2 = new CompleteMetadataBean();
    private List relations;
}