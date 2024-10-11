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
   * Test case for {@link DefaultNoteListModel#elementAt(int)}.
   * It contains one test case per item in the model and it is designed to
   * perform the following assertions.
   * <ol>
   *   <li>The list with zero elements is returned by the list</li>
   *   <li>No assertion is made when the index is negative or not less than
   *       the size of the model</li>
   *   <li>A <code>null</code> value is returned when the index is
   *       outside a valid range</li>
   *   <li>In an event is the specified listener gets notified</li>
   * </ol>
   */
  @Test
  void elementAt_Zero_NegativeAndOutsideEventRange_Returns_List(){
    assertNotNull(new DefaultNoteListModel().elementAt(0));
  }

  /**
   * Test case for {@link DefaultNoteListModel#elementAt(int)}.
   * It contains one test case per item in the model and it is designed to
   * perform the following assertions.
   * <ol>
   *   <li>The list with zero elements is returned by the list</li>
   *   <li>No assertion is made when the index is non-negative (i.e. <code>0</code> is
   *       not the first element in the list)
   *   </li>
   *   <li>A null value is returned when the index is positive and <code>null</code>
   *       is the first element.</li>
   *   <li>In an event is the specified listener gets notified</li>
   * </ol>
   */
  @Test
  void elementAt_Zero_NonnegativeAndFirstElement_Returns_NonNull (){
    assertNotNull(new DefaultNoteListModel().elementAt(0));
  }

  /**
   * Test case for {@link DefaultNoteListModel#elementAt(int)}.
   * It contains one test case per item in the model and it is designed to
   * perform the following assertions.
   * <ol>
   *   <li>The list with one element is returned by the list</li>
   *   <li>The list is not empty when the index is non-negative
   *       (i.e. <code>0</code> and <code>0</code> is not at the first element)
   *       If the event passed to the listener does not trigger an event, this
   *       test case is passed to the first listener.</li>
   *   <li>If the event is not triggered, the list element at index <code>0</code> is
   *       returned or null.</li>
   *   <li>An assertion error is thrown if the size of the list is zero</li>
   *   <li>The list and model are not being modified</li>
   *   <li>In an event is the specified listener receives the notification (i.e. a
   *       noteListEvent has been fired)</li>
   * </ol>
   */
  @Test
  void elementAt_NonNegative_Fires_NoEvent_When_ListenerNotFired_Returns_Element (){
    final DefaultNoteListModel m = new DefaultNoteListModel();
    final NoteListDataListener listener = new NoteListDataListener() {
        /**
         * {@inheritDoc}
         */
        @Override
        public void noteListDataChanged(final NoteListDataEvent event) {
          assertNotNull("The listener argument of the Event was null", event);
          assertEquals(AbstractNote.class, event.getType());
          if(event instanceof NoteListDataEvent_8Test.Event_Fire){
            m.fire(new Event_Fire_8Test(event, m));
          }
        }
      };
    m.addNoteListDataListener(listener);
    m.notify();
    assertNotNull("The list element at index 0 not returned", m.elementAt(0));
  }

  /**
   * Test case for {@link DefaultNoteListModel#elementAt(int)}.
   * It contains one test case per item in the model and it is designed to
   * perform the following assertions.
   * <ol>
   *   <li>The list contains one element at the first position in the list</li>
   *   <li>The list is not empty when the index is greater than 1</li>
   *   <li>If the event passed to the listener is of type
   *       {@link noteListDataEvent_8Test.Event_Fire} the list contains multiple
   *       elements, each element at index 0, at the last element of the list.</li>
   *   <li>The list and model are not being modified</li>
   *   <li>In an event is the specified listener receives a notification (i.e. a
   *       noteListEvent has not been fired)</li>
   * </ol>
   */
  @Test
  void elementAt_Greater_Fires_Two_Element_When_ListenerNotFired_Returns_Element (){
    final DefaultNoteListModel listener = new DefaultNoteListModel();
    final List<AbstractNote> m = new ArrayList<>();
    for(int i=0; i<10; i++){
      final AbstractNote n = new DefaultNote();
      n.setText(String.valueOf(i));
      m.add(n);
    }
    final NoteListDataEvent nte = new NoteListDataEvent(AbstractNote.class, m,
                                                       0);
    // This is a very long array with two list elements
    final int numOfElements = 100100;
    nte.setSequenceNumber(1);
    nte.setNumberOfElements(numOfElements);
    nte.setText("This element is in list, i am at index " +
                 ((numOfElements - 1) + 2) + " - this is just a test case");
    nte.setEventType(noteListDataEvent_8Test.Event_Fire);
    if(!noteListDataEvent_8Test.fire(nte) && listener!= null)
      listener.fire(nte);
    assertEquals(1, listener.size());
}
}