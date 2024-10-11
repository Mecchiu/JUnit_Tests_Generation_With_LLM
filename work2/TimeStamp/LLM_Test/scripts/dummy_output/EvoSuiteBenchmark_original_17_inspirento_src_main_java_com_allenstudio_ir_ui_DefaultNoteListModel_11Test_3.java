// DefaultNoteListModel_11Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModel_11Test {
		
	/** The array of components. */
	ArrayList<AbstractNote> arr;
	/** Creates an empty copy of <code>arr</code>. */
	public DefaultNoteListModel_11Test(){
		arr = new ArrayList<AbstractNote>();
	}
	
	/** Creates a copy of <code>arr</code> with its elements cleared. */
	void setArrayFromArrays(){
		arr = new ArrayList<AbstractNote>(new ArrayList<AbstractNote>(0));
		for(int i=0; i < arr.size(); i++){
			AbstractNote obj = arr.get(i);
			if(obj instanceof AbstractNoteListModel.AbsNoteListModel){
				((AbstractNoteListModel.AbsNoteListModel) obj).setArrayFromArrays().clear();
			}
		}
	}
	
	/** Creates a copy of <code>arr</code> with all elements cleared. */
	void clearArrayFromArray(){
		arr.clear();
	}
	
    /**
     * Tests to check if the model is empty.
     */
    @Test
    public void testEmpty(){
        DefaultNoteListModel.AbsNoteListModel aobj = new DefaultNoteListModel.AbsNoteListModel();
        //assertTrue(aobj.size() == 0);
        assertNull(aobj.getArray(0));
        aobj.removeElement(arr.get(0));
        assertNull(aobj.getArray(0));
    }
	
	/**
	 * Tests removing one element from the model of a specified component.
	 *
	 * @param obj the component to be removed
	 */
    @Test
    public void testRemove(AbstractNote obj){
        DefaultNoteListModel.AbsNoteListModel aobj = new DefaultNoteListModel.AbsNoteListModel();
        aobj.addElement(obj);
        //aobj.removeElement(obj);
        Set<AbstractNote> set = aobj.getArray();
        assertTrue(set.size() == 1);
        assertTrue(set.contains(obj));
        set.remove(obj);
    }
	
	/**
	 * Tests adding one occurrence of a specified component.
	 *
	 * @param obj the component to be added
	 * @param i the index of the desired occurrence
    */
    @Test
    public void testAddIndex(AbstractNote obj, int i){
        DefaultNoteListModel.AbsNoteListModel aobj = new DefaultNoteListModel.AbsNoteListModel();
        if(i < 100){
            aobj.addElement(obj);
        }else{
            aobj.removeElement(obj);
        }
        Set<AbstractNote> set1 = aobj.getArray();
        assertTrue(set1.size() == 100);
        assertTrue(set1.contains(obj));
        set1.add(obj);
        set1.remove(obj);
        set1.contains(i);
    }
	
	/**
	 * Tests removing one occurrence of a specified component.
	 *
	 * @param obj the component to be removed
	 */
    @Test
    public void testRemoveOne(AbstractNote obj){
        DefaultNoteListModel.AbsNoteListModel aobj = new DefaultNoteListModel.AbsNoteListModel();
        aobj.addElement(obj);
        if(aobj.size() == 1){
            aobj.removeElement(obj);
        }
        Set<AbstractNote> set = aobj.getArray();
        assertTrue(set.size() == 0);
    }
	
    /**
     * Tests adding all the occurrences of multiple components.
     */
    @Test
    public void testAddMoreElements(AbstractNote obj[]){
        DefaultNoteListModel.AbsNoteListModel aobj = new DefaultNoteListModel.AbsNoteListModel();
        for(int i=0; i < obj.length; i++){
            aobj.addElement(obj[i]);
        }
        Set<AbstractNote> set = aobj.getArray();
        assertTrue(set.size() == 10);
    }
    
    /**
     * Tests removing all occurrences of multiple instances of the same element.
     */
    @Test
    public void testRemoveMoreElements(){
        DefaultNoteListModel.AbsNoteListModel aobj = new DefaultNoteListModel.AbsNoteListModel();
        for(int i=0; i < aobj.size(); i++){
            aobj.removeElement(aobj.get(i));
            Set<AbstractNote> set = aobj.getArray();
            assertTrue(set.size() == 0);
        }
    }
    
    /**
     * Tests removing occurrences of multiple instances of the same component.
     */
    @Test
    public void testRemoveMoreElements(){
        DefaultNoteListModel.AbsNoteListModel aobj = new DefaultNoteListModel.AbsNoteListModel();
        for(int i=0; i < aobj.size(); i++){
            aobj.removeElement(aobj.get(i));
            Set<AbstractNote> set = aobj.getArray();
            assertTrue(set.size() == 0);
        }
    }
    
	/**
	 * Tests to ensure that the model can contain any number of elements.
	 *
     */
	@Test
	public void testContains(){
		Arrays.asList(new Integer[]{10,11,12,13,14,16,20,22,24}).contains(new Integer[]{8,9,10,11,12,13,14,19,21,22,23,24});
	}
}