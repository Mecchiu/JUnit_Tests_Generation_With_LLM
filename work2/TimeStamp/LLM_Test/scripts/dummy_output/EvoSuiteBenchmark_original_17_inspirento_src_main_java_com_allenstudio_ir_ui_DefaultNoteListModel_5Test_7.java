// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {
		
    
    /**
     * This test case tests both the <code>indexOf()</code> and <code>listIterator()</code>
     * methods of <code>DefaultNoteListModel</code>. As the test case consists of a single
     * test case containing a single <code>listIterator()</code> test, it is to verify the 
     * behavior of methods in <code>AbstractNote</code> as if the test case was taken, but made a local
     * copy of the test set of <code>AbstractNote</code>s contained within it (see  
     * {@link DefaultNoteListModel#toObjectSorted()}
     *
     */
    @Test
    public void testCase5SubsetSize6()
    {
        // test case description : Local test case
        // test description : Contains a list that corresponds to the case-sensitivity-sensitive
        // collection of the test object set with which the subList is initialized
        AbstractNote[] case_5_Subset = new AbstractNote[4];
        
        case_5_Subset[0] = new DefaultNote(1, 5, 2, 4, null); // Note is not in the array
        case_5_Subset[1] = new DefaultNote(2, 2, 1, 2, null); // Note is not in the array
        case_5_Subset[2] = new DefaultNote(1, 5, 3, 4, null); // Note is not in the array
        case_5_Subset[3] = new DefaultNote(4, 3, 4, 2, null); // Note is not in the array
        

        // initial size of the internal case subset of the test set is: 3 + 1
        assertEquals(3, ((DefaultNoteListModel_5Test) case_5_Subset).toObjectSorted().size());

        // when the test case is sorted, the index of the first occurrence of the test case
        // is returned
        int i_5 = ((DefaultNoteListModel_5Test) case_5_Subset).indexOf(case_5_Subset[0], 0);
        assertEquals(-1, (case_4.size() + case_5.size()) / 2);  // test case is already sorted
        assertTrue(case_5.subList(0,1).equals(case_4.subList(0,1)));
        assertTrue(case_5.subList(0,1).subList(1,2).equals(case_4.subList(0,1).subList(1,2)));
        assertTrue(case_4.subList(0,1).subList(0,2).equals(case_5.subList(0,1).subList(0,2)));

        // test case description : The case subList is not sorted (this is an internal case subset)
        // test description : The list is not sorted
        // test case description : The internal case subset is not sorted
        AbstractNote[] case_sublist = new AbstractNote[2];
        case_sublist[0] = case_5_Subset[0];
        case_sublist[1] = case_5_Subset[1];
        // test case description : Case-sensitive test case is not sorted
        // test case description : Test case is already sorted
        // test case description : Sublist of case_sublist is sorted
        // test case description : Last element of case_sublist is not sorted
        // test case description : This test is a subtest of its own case subtest
        // test case description : Case-sensitive test case is not sorted
        // test case description : Test case is already sorted
        // test case description : Last element of case_sublist is sorted
        // test case description : This is a test case for sorted cases
        assertTrue(! ((DefaultNoteListModel_5Test) case_sublist).toObjectSorted().subList(0,1).equals(case_5_Subset[1]),
            "The sorted list of case-sensitivity-sensitive sublist of the test case is not sorted");
        
        // test case description : Case-sensitivity sensitive test-case is not sorted
        // test case description : Last element of case_sublist is not sorted
        // test case description : This test is not sorted
        assertTrue(! ((DefaultNoteListModel_5Test) case_sublist).toObjectSorted().subList(1,1).equals(case_4.subList(0,1)),
            "This sorted list of case-sensitivity-sensitive sublist of the test case is not sorted");
        
        // test case description : Case-sensitivity sensitive test-case is sorted
        // test case description : Last element of case_sublist is sorted
        assertTrue(case_sublist[0].compareTo(case_sublist[1])==0,
            "case_sublist[0]: "+case_sublist[0]+"!= "+case_sublist[1]);
        assertTrue(case_sublist[1].compareTo(case_5_Subset[1])==0,
            "case_sublist[1]: "+case_sublist[1]+"!= "+case_5_Subset[1]);
    }
    
    /**
     * Returns the internal list of this object set as a sorted vector of AbstractNote's
     * The first element is the case, second is case and so on
     *
     * @return the contents of the internal list
     */
    Collection<AbstractNote> toObjectSorted()
    {
    	Collection<AbstractNote> list = new ArrayList<>();
    	for (AbstractNote item : toArray())
        {
            list.add(item);
        }
    	return list;
    }

	/**
	 * The test object set is contained in this vector of objects <code>Case_Sub-List</code>
	 */
	 Collection<AbstractNote> toArray() {
		return  new ArrayList<>(toCollection(case_2_SubList));
	}

	public Collection<AbstractNote> toCollection(Collection<AbstractNote> collection){
		if(collection instanceof ArrayList<AbstractNote>)
		{
			return collection;
		}
		
		AbstractNote[] case_5_SubsetNew = new AbstractNote[collection.size()];
    	System.arraycopy(collection.toArray(), 0, case_4.toArray(),0, case_4.size());

        case_5_SubsetNew[0] = case_5_Subset[0];
        case_5_SubsetNew[1] = case_5_Subset[1];
        case_5_SubsetNew[2] = case_5_Subset[2];
        case_5_SubsetNew[3] = case_5_Subset[3];

}
}