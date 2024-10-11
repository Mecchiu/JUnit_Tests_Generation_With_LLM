// DefaultNoteListModel_9Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#firstElement()} method.
*/
class DefaultNoteListModel_9Test {
		
	/**
	 * Tests that the {@link #addElement(AbstractNote)} method works properly.
	 */
    @Test
    public void addAddElement( )
    {
    	DefaultNoteListModel list = new DefaultNoteListModel();

		// Add a simple element to the end of the list
		list.addElement( new FakeNote() );

        assertEquals( "There are no elements at this list.", 1, list.getSize() );
        assertTrue( "The first element was not added to the list.", list.getElementAt( 0 ) == list.firstElement() );
    }

	/**
	 * Tests that the {@link #removeElementAt(int, int)} method works properly.
	 */
    @Test
    public void removeRemoveElementAt(int first, int last)
    {
        Iterator iter = list.iterator();
        DefaultNoteListModel list = new DefaultNoteListModel();
        AbstractNote removed = null;

        while ( iter.hasNext() )
        {
            AbstractNote note = (AbstractNote) iter.next();
            list.removeElementAt( first - 1, last - 1 );
            assertSame( "The first element was not removed from the list.", first - 1, list.firstElement() );
            assertFalse( "The last element was removed from the list.", list.elementAt( last - 1) == note );

            if (removed!= null)
			{
				list.removeElementAt( removed.getIndex(), removed.getIndex() + 1 );
				assertFalse( "The last element was removed from the list.", list.elementAt( last - 1) == note );
			}

            removed = note;

            list.add( note );
        }
        assertTrue( "The last element was not added to the list.", list.elementAt( last - 1) == removed );

        // Check that the list itself is still empty
        assertEquals( "Size of the list did not change.", 0, list.size() );
    }

	/**
	 * Tests that the {@link #getElementAt(int)} method works properly.
	 */
    @Test
    public void getElementAt(int index) {
    	Iterator iter = list.iterator();
        DefaultNoteListModel list = new DefaultNoteListModel();
        boolean found = false;

        while ( iter.hasNext() )
        {
            try
            {
                AbstractNote note = (AbstractNote) iter.next();
                list.getElementAt( index - 1 );
                found = true;
            }
            catch ( IndexOutOfBoundsException e )
            {

            }

            if ( found && list.getSize() <= index )
            {
			found = false;
			list.remove( note );
			assertTrue( "The last element was removed from the list.", list.elementAt( index - 1) == note );
            }
        }

        assertTrue( "The list was not at the expected position.", found );
    }
}

/**
 * Implementation of the {@link DefaultNoteListModel} interface containing the
 * {@link AbstractNote List} type.
 */
class DefaultNoteListModel_9Test_1 {
    public abstract Object[] getListData();

    /**
     * Add a new element to the end of the list. It has to be added with this
     * method, and also to the list itself, as a list may not be used for
     * sorting.
     */
    public static boolean addElement(AbstractNote note) {
        DefaultNoteListModel list = new DefaultNoteListModel_1();

        assertTrue( "The list cannot be added to the list.", list.getSize() == list.size() );
        list.addElement( note );

        return true;
    }
}

/**
 * Implementation of the {@link DefaultNoteListModel} interface containing the
 * {@link AbstractNote List} type.
 */
class DefaultNoteListModel_9Test_2 extends DefaultNoteListModel_9Test_1 {
    final static int size = 5;
    public Object[] getListData() {
        return new Object[size];
    }

    public boolean addElement(AbstractNote note) {
        for ( int i = 0; i < size; i++ ) {
            list.addElement(note);
        }

        return true;
    }
}

class FakeNote {
	public void addData( ) {
		data = new Object();
	}

    public Object[] getData()
    {
        return new Object[] { data };
    }
    public String data;
}

class AbstractNoteListModel_9Test_3 implements NoteListModel
{
    public final static boolean USE_LIST = true;

    final Object[] data;

    public FakeNote getElement(int index)
    {
        return new FakeNote();
    }

    public Object getData()
    {
		try
		{
			return data[0];
		}
		catch (IndexOutOfBoundsException e)
		{
			
		}
		return null;
    }

    public int getSize()
    {
		return data.length;
    }

    public boolean addElement(final AbstractNote note)
    {
        if ( USE_LIST ) {
			return list.add( note );
		}
        return true;
    }

    public void removeElement(final AbstractNote note)
    {
        try
        {
            list.remove( note );
        }
        catch (javax.swing.ArrayIndexOutOfBoundsException e) {}
    }


    public void updateElement(int index, final Object object) { }
    public void updateElement(int index, final Object object, int dataLength) { }

    /**
    * Get the list data held in this object.
    */
    public final Object[] getListData() {
        return data;
    }

    public void getListData(int index, Object listData[]) {
        Object obj = data[index];
        data[index] = new Object[] { listData[0] };

        int n = data.length;
        for ( int i = 1; i < n; i++ )
        {
            obj = new Object[] {obj};
            data[i] = data[i - 1];
        }

        data[0] = obj;
    }
}