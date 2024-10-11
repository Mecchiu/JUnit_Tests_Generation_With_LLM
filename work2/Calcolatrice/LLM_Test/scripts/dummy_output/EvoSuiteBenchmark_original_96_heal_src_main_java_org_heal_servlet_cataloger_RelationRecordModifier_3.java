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
		
	@Test // Check if the action is executed
	public void doesNotAllowModifyMetadata() throws IOException, ServletException {
        List relations = new RelationBean() {
            {
			name = "";
            }
        };
		
        RelationBean expected = new RelationBean();
        expected.addRelation(relationId);
        
        List result = new RelationBean() {
            {
			name = "";
			
			RelationBean old = new RelationBean();
	            name = old.getName()+" edited";
	            old.setName("Relation name");
	            old.setTitle("Title");

	            List editable = new List();
	            List editables = new List();

	            old.setEditable(editable);
	            editable.add(expected);

	            editable.add(new List());
			
	            List metadata = new List();
	            metadata.add(1);
	            List relationsMetadata = new List();
	            relationsMetadata.add(1);
			
	            editing = new List();
	            editing.add(old);
	            editing.add(editable);
	            editing.add(relationsMetadata);
	            editing.add(0);
	            metadata.add(editing);
			
	            setMetadata(metadata);
            }
        };
				
        // We expect that only 1 modification is expected
		RelationBean modifiable = new RelationBean();
		expected.setEditable(new List());
		expected.setName("Relation name edited");
		expected.setTitle("Title edited");
		
		modifiable = expected;
		
		List response = new List();
		response.add(modifiable);

		response = modifyMetadata(response, relations, new ArrayList());

		List modified = new ArrayList();
		List modifiedList = new ArrayList();
		
		modified.add(expected);

		List relList = new ArrayList();
		relList.add(modifiable);
		
		List metadataMetadata = new ArrayList();
		metadataMetadata.add(metadata);
		
		relList.add(metadataMetadata);
		
		List relationList = new ArrayList();
		relationsList.add(relations);
		
		List editedList = new ArrayList();
		editedList.add(modifiable);
		editedList.add(editing);
		editedList.add(relationList);
		
		updated = new ArrayList();
		updated.add(modified);
		updated.add(modifiedList);
		updated.add(relationList);
		updated.add(editedList);
		updated.add(relList);
		updated.add(metadataMetadata);
	}
	
	protected List modifyMetadata(List response, List relations, List editedMetadata) {
        for (Iterator iterator = response.iterator(); iterator.hasNext(); ) {
            Object rawData = iterator.next();
            if (rawData instanceof List) {
                    response.addAll((List) rawData);
            } else {
			response.add(response.get(0));
			}
        }
					
        for (Iterator iterator = relations.iterator(); iterator.hasNext(); ) {
            Object rawData = iterator.next();
            if (rawData instanceof List) {
                    relations.addAll((List) rawData);
            } else {
			relations.add(relations.get(0));
			}
        }

        for (Iterator iterator = editedMetadata.iterator(); iterator.hasNext(); ) {
            Object rawData = iterator.next();
            if (rawData instanceof List) {
                    editedMetadata.addAll((List) rawData);
            } else {
			editedMetadata.add(editedMetadata.get(0));
			}
        }
        
        for (Iterator iterator = editedMetadata.iterator(); iterator.hasNext(); ) {
            Object rawData = iterator.next();
            if (rawData instanceof List) {
                    editedMetadata.addAll((List) rawData);
            } else {
			editedMetadata.add(editedMetadata.get(0));
			}
        }
        
        Iterator it = relationList.iterator();
        List resultList = new ArrayList();
        for (int i = 0; i < resultList.size(); i++) {
            resultList.add(it.next().toString());
        }
        return resultList;
	}

	protected void setMetadata(List edited) {
		for (Iterator iterator = edited.iterator(); iterator.hasNext(); ) {
			String value = (String) iterator.next();
			CompleteMetadataBean meta = new CompleteMetadataBean();
			meta.setVersion(value);
			
			this.setMetadata(meta);
		}
	}
	
	protected void setMetadata(CompleteMetadataBean meta) {
		RelationBean relation = null;
		for (int i = 0; i < meta.getRelationList().size(); i++) {
			RelationBean r = meta.getRelationList().get(i);
			if (r.getName().equals("Modified")) {
                relation = r; 
				break;
            }
		}
		assertNotNull(relation);
		relation.setEditable(new ArrayList());
		relation.setName("New Name");
		relation.setTitle("New Title");
		relation.setEdit(true);
		relation.setNew(false);
	}

	protected void setMetadata(RelationBean relation) {
		relation.setEdit(true); // We only add the edit and the new one.
		relation.setNew(false);  // And the new ones are in the edited list.
}
}