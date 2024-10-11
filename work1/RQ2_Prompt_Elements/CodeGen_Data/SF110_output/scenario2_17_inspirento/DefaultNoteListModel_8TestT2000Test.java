// DefaultNoteListModel_8Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elementAt(int)} method.
*/
class DefaultNoteListModel_8Test {
/**
		 * Constructs a new DefaultNoteListModel object.
		 *
		 * @param arg0 argument to be displayed to the test.
		 * @see DefaultNoteListModel#DefaultNoteListModel(List, ArrayList,
		 * ArrayList, boolean, boolean, Set, boolean, com.allenstudio.ir.core.plugins.AbstractNote,
		 * org.junit.jupiter.api.TestInfo[])
		 */
    DefaultNoteListModel_8Test(List arg0, 
			List<AbstractNote> arg1, 
			List<Integer> arg2, 
			boolean arg3, 
			boolean arg4, 
			Set<Integer> indexRange, 
			boolean indexRangeHasKeys, 
			AbstractNote arg5, 
			List<NoteListDataEvent> arg6) 
        {
            listArg0 = arg0;
            listArg1 = arg1;
            listArg2 = arg2;
            indexRangeRange = indexRange;
            indexRangeHasKeys = arg3;
            indexRangeHasKeysDefault = indexRangeHasKeys;
            arg5 = arg5;
            arg6 = arg6;
        }

	/**
	 * Constructs a new DefaultNoteListModel object.
	 *
	 * @param arg0 argument to be displayed to the test.
	 * @param arg1 argument to be displayed to the test.
	 * @param arg2 argument to be displayed to the test.
	 * @param arg3 argument to be displayed to the test.
	 * @param arg4 argument to be displayed to the test.
	 * @param arg5 argument to be displayed to the test.
	 * @param arg6 argument to be displayed to the test.
	 * @see #DefaultNoteListModel(List, ArrayList, ArrayList, boolean, boolean, Set, boolean, com.allenstudio.ir.core.plugins.AbstractNote,
	 * org.junit.jupiter.api.TestInfo)
	 */
    DefaultNoteListModel_8Test(List arg0, 
			List<AbstractNote> arg1, 
			List<Integer> arg2, 
			boolean arg3, 
			boolean arg4, 
			Set<Integer> arg5, 
			List<NoteListDataEvent> arg6, 
			List<AbstractNote> arg7) 
        {
            listArg0 = arg0;
            listArg1 = arg1;
            listArg2 = arg2;
            listArg3 = arg3;
            listArg4 = arg4;
            indexRangeRange = new HashSet();
            indexRangeRange.addAll(arg5);
            indexRangeRange.addAll(arg6);
            indexRangeHasKeys = arg4;
            indexRangeHasKeysDefault = arg4;
            arg7 = arg7;
        }

	/**
	 * Constructs a new DefaultNoteListModel object.
	 *
	 * @param arg0 argument to be presented to the test.
	 * @param arg1 argument to be presented to the test.
	 * @param arg2 argument to be presented to the test.
	 * @param arg3 argument to be presented to the test.
	 * @param arg4 argument to be presented to the test.
	 * @param arg5 argument to be presented to the test.
	 * @param arg6 argument to be presented to the test.
	 * @param listArg7 argument to be presented to the test.
	 */
    DefaultNoteListModel_8Test(List arg0, 
			List<AbstractNote> arg1, 
			List<Integer> arg2, 
			boolean arg3, 
			boolean arg4, 
			Set<Integer> arg5, 
			List<NoteListDataEvent> arg6, 
			List<AbstractNote> listArg7) 
        {
            listArg0 = arg0;
            listArg1 = arg1;
            listArg2 = arg2;
            indexRangeRange = new HashSet();
            indexRangeRange.addAll(arg5);
            indexRangeRange.addAll(arg6);
            indexRangeHasKeys = arg4;
            indexRangeHasKeysDefault = arg4;
            listArg7 = listArg7;
        }

	/**
	 * Tests the {@link DefaultNoteListModel#elementAt(int)} method's 
	 * <code>elementAt</code> method.
	 */
	@Test
    void testElementAt_1_1_8_8_8() {
        Object[] argArray1 = getArrayArguments(indexRangeRange, indexRangeHasKeys, null, null, listArg7, null, null, null);

        objectArgumentsListElementAt_1_1_8_8_8(listArg1, listArg2, listArg3, listArg4, argArray1);        
    }
     
    private static void objectArgumentsListElementAt_1_1_8_8_8(List arg1, 
		List<Integer> arg2, 
		List<Integer> arg3, 
		List<Integer> arg4, Object argArray) {
		int index = 1;
		while (index <= 8) {
			System.err.println(index + ".elementAt: " + argArray.getClass());
			objectArgumentsListElementAt_1_1_8_8_8_8(arg1, arg2, arg3, arg4, argArray, index);
			index++;
		}
	}
     
	private static void objectArgumentsListElementAt_1_1_8_8_8_8(List arg1, 
		List<Integer> arg2, 
		List<Integer> arg3, 
		List<Integer> arg4, Object argArray, 
		int index) {
		List<AbstractNote> list2 = new ArrayList<AbstractNote>();
		Object o3 = argArray.get(index);
		if (o3 instanceof Collection) {
			for(Object o1 : (Collection)o3) {
				list2.add((AbstractNote)o1);
			}
		} else {
			list2.add( (AbstractNote)o3);
		}
		
		System.err.println("inject list.get(): " + list2.getClass());
		objectArgumentsListElementAt_1_1_8_8(arg1, list2, arg2, arg3, arg4) ;
	}

    private static Object[] getArrayArguments( Set<Integer> indexRange, 
			boolean indexRangeHasKeys, Object[] argArray, Object[] result, List elementList, Object[] resultList, Object[] argArrayList