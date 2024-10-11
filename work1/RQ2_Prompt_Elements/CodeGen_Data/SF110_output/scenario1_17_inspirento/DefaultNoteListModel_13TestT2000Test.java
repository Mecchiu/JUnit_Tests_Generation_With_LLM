// DefaultNoteListModel_13Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#get(int)} method.
*/
class DefaultNoteListModel_13Test {

    private DefaultNoteListModel _model;
	private DefaultNote _first;
	private DefaultNote _second;
	private int _index;

	/**
	 * DefaultNoteListModel_13Test constructor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DefaultNoteListModel_13Test() {
    }

	/**
	 * Creates new DefaultNoteListModel with the element for the test.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param index integer test index.
	 * <!-- assert index >=0 -->
	 * @param element defaultNote element to add.
	 * <!-- assert element!= null -->
	 * <!-- assert element instanceof Note -->
	 */
    public DefaultNoteListModel_13Test(int index, Object element) {
        _index = index;
        _model = new DefaultNoteListModel();
		_model.add(element);
		_model.add(null);
		_first = get(index);
		assertNull(null);
		_second = get(index);
		assertNull(_first);
		assertNull(_second);
	}

	///////////////////////////////////////////////////////
	// Interface <NoteListModel>
	///////////////////////////////////////////////////////

    /**
	 * @see JUnit4TestAdapter for test logic
	 */
	public static junit.framework.Test suite() {
        return new DefaultNoteListModel_13Test.Class1TestSuite();
	}

	/**
	 * Executes all preparations.
    @Test
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void testPreparation() {
    }

    // Implementation details
    private static class Class1TestSuite extends BaseTestCase {
        // Test of constructor.
		public Class1TestSuite() {
			super("Test of class DefaultNoteListModel.<"+getFullClassName()+">");
		}
		// Implementation of abstract <String, NoteListModel>.
		protected void setUp() throws Exception{
			super.setUp();
        }

        // Implementation of setElement.
		public TestElement setElement(Object o) {
		    return _model = 	((DefaultNoteListModel)o);
		}
		public String getElementName() {
		    return TestElement.class.getName();
		}
        public String getClassName() {
            return getElementName();
        }
        protected Object getDefaultObject() {
            return _model;
        }
        protected Object[] createDefaultArray() {
            return new Object[] {};
        }
    }

}