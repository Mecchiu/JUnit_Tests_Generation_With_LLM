// DefaultNoteListModel_3Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
*/
class DefaultNoteListModel_3Test {

    test_3 mainTest
    {
        setUp();

        try {
            for (int i = 0; i < 30; i++)
                new Test2().test();
            System.out.println("Passed!");
        } finally {
            tearDown();
        }
        
    }

    static interface Test2 {
        static void test() {
            String test;
            test = "Hello";
            System.out.println(test);
            String test2;
            test = "Hello, I am the first test";
            System.out.println(test2);
            }
    }
			
}

// DefaultNoteListModel_4Test.java
