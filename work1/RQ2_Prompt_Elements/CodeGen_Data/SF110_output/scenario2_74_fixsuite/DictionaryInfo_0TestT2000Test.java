// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {
// DictionaryInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class DictionaryInfo {

    /**
     * Returns a field given a tagNumber
     *
     * @param tagNumber - a tagNumber
     * @return a field given a tagNumber
     */
    public FieldInfo getField(int tagNumber) {
        if (fieldsByTagNumber!= null) {
            return fieldsByTagNumber.get(tagNumber);
        }
        return null;
    }
}

// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {
		//FIXME - should be put into DictionaryInfo.
	@Test
    public void testGetField(){
        
		List<FieldInfo> fieldsByTagNumber = new ArrayList<>();
		TreeMap<Integer, FieldInfo> fieldsByTag = new TreeMap<>();
		Map<Integer, List<FieldInfo>> listsByTag = new TreeMap<> ();
		
		//add a few fields
		addField(FieldInfo.INVOICE_DOCUMENT_TYPE_ID, DocumentTypeId.get(DocumentTypeId.INVOICE_DOCUMENT));
		addField(FieldInfo.INVOICE_DOCUMENT_STATUS_ID, DocumentStatusId.APPROVAL);
		addField(FieldInfo.INVOICE_DOCUMENT_REQUEST_ID, DocumentRequestId.OPTIONAL);
		addField(FieldInfo.INVOICE_ID, "100");
	    addField(FieldInfo.STATUS, DocumentStatus.APPROVED);
	    addField(FieldInfo.VERSION, DocumentVersion.get(DocumentVersion.FIX5_0_1, DocumentVersion.FIX50_1_1));
	    addField(FieldInfo.MESSAGE,
		     "FIX 2.0.1, 1.27.6 (fix.28.6.1)",
		     "FIX 23.3.2, 1.26.2 (fix.26)");
	    
	    fieldsByTag.put(FieldInfo.INVOICE_DOCUMENT_TYPE_ID, DocumentTypeInfo.get(DocumentTypeId.INVOICE));
	    fieldsByTag.put(FieldInfo.INVOICE_DOCUMENT_STATUS_ID, DocumentStatusInfo.get(DocumentStatusId.APPROVAL));
	    fieldsByTag.put(FieldInfo.INVOICE_DOCUMENT_REQUEST_ID, DocumentRequestInfo.get(DocumentRequestId.OPTIONAL));
	    fieldsByTag.put(FieldInfo.INVOICE_ID, "100");
	    fieldsByTag.put(FieldInfo.STATUS, DocumentStatus.APPROVED);
	    fieldsByTag.put(FieldInfo.VERSION, DocumentVersion.get(DocumentVersion.FIX5_0_1, DocumentVersion.FIX50_1_1));
	    
	    fieldsByTag.put(FieldInfo.MESSAGE,
		     "FIX 2.0.1, 1.27.6 (fix.28.6.3);\nFIX 2.0.2, 1.27.6 (fix.28.6.2)");
	    
	    addField(FieldInfo.INVOICE_DOCUMENT_STATUS_ID, DocumentStatusInfo.get(DocumentStatusId.REOPENED));
	    
		fieldsByTag.put(FieldInfo.INVOICE_DOCUMENT_REQUEST_ID, DocumentRequestInfo.get(DocumentRequestId.APPROVED));

        
		List<FieldInfo> documentsOfType = new ArrayList<FieldInfo>(11);
		document = new Document();
		document.add(documentsOfType);

		List<DocumentStatusInfo> st = new ArrayList<DocumentStatusInfo> (23);
		st.add(DocumentStatusInfo.create(DocumentStatusId.PENDING_FOR_REOPEN));
		createDocument(st );
		
		//add a bunch of entries
		addField(FieldInfo.INVOICE_DOCUMENT_STATUS_ID,DocumentStatusId.PENDING_FOR_ACTION);
		addField(FieldInfo.INVOICE_DOCUMENT_STATUS_ID,DocumentStatusId.REQUESTED);
		addField(FieldInfo.INVOICE_DOCUMENT_REQUEST_ID,DocumentRequestId.RECONFIRM_ID);
		addField(FieldInfo.INVOICE_ID, "101");
		addField(FieldInfo.VERSION, DocumentVersion.get(DocumentVersion.FIX5_0_1, DocumentVersion.FIX50_1_1));
		addField(FieldInfo.STATUS, DocumentStatus.PENDING_FOR_ACTION);
		addField(FieldInfo.REQUEST_STATUS_REQUEST_STATUS_ID, DocumentStatusId.APPROVED);
		List<Int> statIds = new ArrayList<Int>(23);
		statIds.add(DocumentStatuses.REQUESTED);
		createRequest(statIds);
		
		
		List<FieldInfo> stt = new ArrayList<FieldInfo> (17);
		stt.add(DocumentStatusInfo.create(DocumentStatusId.ACTION_REQUIRED));
		stt.add(DocumentStatusInfo.create(DocumentStatusId.PENDING_FOR_ACTIVATION));
		createDocument(stt );
		
	}
	
		
	/**
	 * Appends fields to entries of type {@link FieldInfo}.
	 *
	 * @param fieldsByTag - a Map of types of fields to put into a list
	 */
	private void addField(TreeMap<Integer,FieldInfo> fieldsByTag) {
		
			List<FieldInfo> list = createList();
			if (list.size()!= 0) {
				field = list.get(0).copy();
				fieldsByTag.put(FieldInfo.INVOICE_DOCUMENT_REQUEST_ID, DocumentRequests.create(field));
			}
	}
	
	/**
	 * Creates a list of entries for a field's values (fields like {@link DocumentStatus}).
	 * 
	 * @param fieldsByTag - a Map of types of fields to put into a list
	 * @return the list from where the values can be found 
	 */
	private List<FieldInfo> createList() {
		
		List<FieldInfo> list = new ArrayList<FieldInfo>(10); 
		for (List.Entry<? extends DocumentField> entry : DocumentField.Entry.getList()) {
			list.add(DocumentField.create(entry.getKey(), entry.getValue()).copy());
		}
		createList(list);
		return list;
	}
	
	/**
	 * Create a list from the values of the fields of a list.
	 * 
	 * @param list - the list
	 */
	private void createList(List<FieldInfo> list) {
		list.add(addField(fieldsByTag)); 
	}
	
	/**
	 * Creates a list of entries for a field's values (fields like {@link DocumentStatus}).
	 * 
	 * @param list - the list
	 * @return the list from where the values can be found 
	 */
	private List<FieldInfo> createRequest(List<Int> stat) {
		List<FieldInfo> list = new ArrayList<FieldInfo>(3);
		for (Int statId : stat) {
			list.add(DocumentStatuses.create(statId));
		}
		return list;
	}
	
	/**
	 * Create a map from the map of entries of type {@link DocumentStatuses}.
	 * 
	 * @param stat - a map of entries of type {@link DocumentStatuses}
	 * @return the map from where the values can be found 
	 */
	private Map<Integer, DocumentStatuses> createStatMap(List<FieldInfo> stat) {
		Map<Integer, DocumentStatuses> map = new TreeMap<Integer, DocumentStatuses>();
