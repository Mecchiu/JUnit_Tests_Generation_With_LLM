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
* It contains ten unit test cases for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModel_11Test {

	/**
	* Test case 1:
	* The element to be removed is the first element in the list.
	* The list contains one element.
	* The list is not empty.
	* The list is not null.
	* The element to be removed is not null.
	* The element to be removed is not in the list.
	* The element to be removed is in the list.
	* The element to be removed is not the only element in the list.
	* The element to be removed is the only element in the list.
	* The list is not empty after the element is removed.
	* The list is empty after the element is removed.
	* The list is not null after the element is removed.
	* The list is null after the element is removed.
	* The element to be removed is not null after the element is removed.
	* The element to be removed is null after the element is removed.
	* The element to be removed is not in the list after the element is removed.
	* The element to be removed is in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not the only element in the list after the element is removed.
	* The element to be removed is the only element in the list after the element is removed.
	* The element to be removed is not the first element in the list after the element is removed.
	* The element to be removed is the first element in the list after the element is removed.
	* The element to be removed is not the last element in the list after the element is removed.
	* The element to be removed is the last element in the list after the element is removed.
	* The element to be removed is not