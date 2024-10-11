// DefaultNoteListModel_0Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_0Test {
		
/*
 * Test method for
 * {@link DefaultNoteListModel#capacity()}
   * @Test
  */
  @Test
  public void test_capacity() {
    assertNotNull("Expected 1 element", CollectionUtils.findElement(this.newNoteVector, this.newNoteData));
    final AbstractNote newNote = (AbstractNote) CollectionUtils.findElement(this.newNoteVector, this.newNoteData);
    assertEquals("1 element - Expected default capacity", DefaultNoteListModel.DEFAULT_NOTE_LIST_SIZE, new NoteListModel().capacity());
    assertEquals("2 element - Expected 2 default capacity", 2, new NoteListModel().capacity());
  }

  @Test
  public void test_addNoteData() {
    int newNoteListSize = DefaultNoteListModel.DEFAULT_NOTE_LIST_SIZE + 1;
    DefaultNoteListModel newNoteListModel = new DefaultNoteListModel(this.newNoteVector, newNoteListSize);
    Vector<Object> oldData = new Vector<Object>();
    oldData.addElement(this.newNoteData);
    newNoteListModel.addAll(oldData);
    assertEquals("Adding 2 objects", (newNoteListSize - 1), newNoteListModel.size());
    assertEquals("Should have size 2", (newNoteListSize - 1), newNoteListModel.capacity());
    assertEquals("Old size", 2, (newNoteListSize - 1), oldData.elementAt(0));
  }

  @Test
  public void test_addNoteVector() {
    int newNoteListSize = DefaultNoteListModel.DEFAULT_NOTE_LIST_SIZE + 1;
    Vector newNoteVector = new Vector(newNoteListSize);
    DefaultNoteListModel newNoteVectorModel = new DefaultNoteListModel(newNoteVector, newNoteListSize);
    assertEquals("Adding 2 objects", (newNoteListSize - 1), newNoteVectorModel.size());
    assertEquals("Should have size 2", (newNoteListSize - 1), newNoteVectorModel.capacity());
    assertEquals("Old size", 2, (newNoteListSize - 1), newNoteVector.getElementAt(0));
  }

  @Test
  public void test_addNoteDataToVector() {
    int newNoteListSize = DefaultNoteListModel.DEFAULT_NOTE_LIST_SIZE + 1;
    DefaultNoteVectorVector newNoteVector = new DefaultNoteVector(newNoteListSize);
    newNoteVector.addElement(this.newNoteData);
    DefaultNoteListModel newNoteListModel = new DefaultNoteListModel(newNoteVector, newNoteListSize);
    assertEquals("Return expected", newNoteVector, newNoteListModel.getVecteR(), 0., 2.);
  }

  @Test
  public void test_replaceNoteData() {
    DefaultNote newNote = (DefaultNote) this.newNoteVector.elementAt(0);
    this.newNoteVector.elementAt(0).setFirstData(this.newNoteData);
    this.newNoteVector.removeElementAt(0);
    final DefaultNoteListModel newNoteListModel = new DefaultNoteListModel(this.newNoteVector, DefaultNoteListModel.DEFAULT_NOTE_LIST_SIZE);
    Vector<Object> oldData = new Vector<Object>();
    oldData.addElement(this.newNoteData);
    this.newNoteListModel.addAll(oldData);
    assertEquals("Return expected", newNote, newNoteListModel.getList().elementAt(0));
  }

  @Test
  public void test_remove() {
    final DefaultNoteVector newNoteVector = new DefaultNoteVector();
    DefaultNote newNote = new DefaultNote();
    newNote.setFirstData(this.newNoteData);
    newNoteVector.addElement(newNote);
    assertEquals("Remove item by index", null, newNoteVector.elementAt(0));
    newNoteVector.removeElementAt(0);
    assertEquals("Return expected", null, newNoteVector.elementAt(0));
  }

  public Vector<Object> newNoteVector() {
    return new ArrayList<Object>();
  }

  private Vector<Object> newNoteVector(int i) {
    Vector<Object> v = new NoteVector();
    if (i == 0) v.addAll(this.newNoteVector);
    return v;
  }

  private NoteListDataModel newNoteListModel() {
    return newNoteListModel(newNoteVector(), ((DefaultNoteVector) this.newNoteVector()).vectorSize());
  }

  private NoteListModel newNoteListModel(Vector<Object> newNoteData, int newNoteVectorSize) {
    final DefaultNoteListModel newNoteListModel = new DefaultNoteListModel(newNoteVector(newNoteVectorSize), newNoteVectorSize);
    return new NoteListDataListener() {
        public void notify(NoteListDataEvent event) {
            assertNull("Should have no data", newNoteData);
            newNoteData = event.getNewData();
            newNoteVectorSize = newNoteVectorSize - 1;
            newNoteListModel.addAll(newNoteData);
        }
      }, newNoteListSize;
  }

  private abstract class AbstractNoteListModel implements NoteListModel {
    protected Vector<Object> newNoteVector;
    protected int newNoteVectorSize;

    public AbstractNoteListModel(Vector<Object> newNoteVector, int newNoteVectorSize) {
      assertTrue("Size of new vector cannot be greater than the current total", (newNoteVectorSize > this.newNoteVector.size()));

      this.newNoteVector = newNoteVector;
      this.newNoteVectorSize = newNoteVectorSize;
      newNoteVector.removeAllElements();
    }

    public Vector<Object> getNewNoteVector() {
      return newNoteVector;
    }

    public int getNewNoteVectorSize() {
      return newNoteVectorSize;
    }
  } //class DefaultNoteListModel_0Test

}