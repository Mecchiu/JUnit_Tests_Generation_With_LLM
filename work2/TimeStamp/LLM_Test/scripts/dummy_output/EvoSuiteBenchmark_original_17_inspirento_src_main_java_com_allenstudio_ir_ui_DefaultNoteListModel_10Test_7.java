// DefaultNoteListModel_10Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastElement()} method.
*/
class DefaultNoteListModel_10Test {
		DefaultNoteListModel test;
    
    @Test
    public void test() {
      defaultNoteListModelTest();
      
      assertNotNull( test.lastElement() );
      
    }

    void defaultNoteListModelTest() {
        Collection<AbstractNote> noteCollection = new ArrayList<AbstractNote>();
        noteCollection.add( new Note("name","1") );
        
        test = new DefaultNoteListModel( noteCollection );
        
        
        test.addNoteListDataListener( new TestNoteListDataListener( this ) );
        test.addNotSelectedListener( new TestNotSelectedListener() );
        
        test.setFirstAvailable( new ArrayList<AbstractNote>() );
        test.addFirstAvailable( new DefaultNote() );
        
        test.addNote( new TestNote() );
        test.remove( new DefaultNote() );
        test.setEmpty( true );
        
        test.removeNote( new DefaultNote() );
		
        assertEquals( 0, test.getSize() );
    }
	
	void assertNotNull(AbstractNote not) {
	assertNotNull( not );
    }
	
	void assertTrue(boolean b) {
	assertTrue(b);
  }
	
	void assertEquals( Collection expected, Collection actual ) {
	assertEquals( expected.size(), actual.size() );
    }
	void assertNotEquals( Collection notExpected, Collection notActual ) {
	assertNotEquals( notExpected.size(), notActual.size() );
    }
	void assertEquals( AbstractNote expected, AbstractNote actual ) {
	assertEquals( expected.getNote(), actual.getNote() );
    }
    void runTest() throws NoSuchElementException, ClassNotFoundException, InterruptedException {
    	Runnable setNote = new Runnable() {
				@Override
    		public void run() {
    			test.addFirstAvailable( new DefaultNoteListModel_10Test_1_8() );
			}
    		};
    	Thread t = new Thread( setNote );
    	t.start();
    	t.join();
    	System.out.println( test );
    }
	
	public static final class TestNoteListDataListener implements NoteListDataListener {

		TestNoteListDataListener testListener;
    
 		public TestNoteListDataListener( TestNoteListModel testModel) {
			testListener = this;
			testModel.addNoteListDataListener( this );
		}

		@Override
		public void noteListDataChanged( NoteListDataEvent event ) {
			System.out.println( "event: " + event );
			testListener.noteListDataChanged( event );
		}

		@Override
		public void noteDataAdded( NoteListDataEvent event ) {
			System.out.println( "event: " + event );
			testListener.noteDataAdded( event );
		}

		@Override
		public void noteDataRemoved( NoteListDataEvent event ) {
			System.out.println( "event: " + event );
			testListener.noteDataRemoved( event );
		}

		@Override
		public void setEnabled( boolean enabled ) {
			testListener.setEnabled( enabled );
		}
 	};


  public static class TestNote extends AbstractNote {
		int index = 0;

		protected TestNote( String name, int index ) {
			super( name );
			this.index = index;
		}
		
		@Override
    	public int compareTo( Note n ) {
			return 0;
  	}

		@Override
		public int getIndex() {
			return index;
		}

		@Override
		public int getIndex_name() {
			return index;
		}
  }


	public static class TestNoteListModel_10Test_1_8 implements NoteListModel {

		boolean empty;

    	public int add( AbstractNote note ) {
        	return 1;
    	}

    	public void remove( Object note ) {
    		System.out.println( note );
    	}

  	  public List<AbstractNote> getFirstAvailable() {
  	    return new ArrayList<AbstractNote>();
  	  }

  	  public List<AbstractNote> getLastAvailable() {
  	    return new ArrayList<AbstractNote>();
  	  }

  	  public AbstractNote lastElement() throws NoSuchElementException {
  	    return null;
  	  }

  	  public void clear() {
  	    empty = true;
  	  }

    	public void setEmpty( boolean empty ) {
     	  	this.empty = empty;
     	  }
    	public boolean isEmpty() {
     	  	return empty;
     	  }

		@Override
		public List<AbstractNote> getNotSelected() {
			return isEmpty()? null : Collections.<AbstractNote> emptyList();
		}
    }
	
}