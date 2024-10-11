// HorizontalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains one unit test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_0Test {

	final static Position TWEEN_PAL_POS = new Position(4.92839, 4.92839);

	// Test cases
	final static UnitTester tester1 = 
			new UnitTester("Test1.java", "test1");
	// final static Unit Tester tester2 = 
	// new UnitTester("Test2.java", "test2");
	// final static Unit Tester tester3 = 
	// new UnitTester("Test3.java", "test3");
	// final static Unit Tester tester4 =
	// new UnitTester("Test4.java", "test4");
	// final static UnitTester tester5 =
	// new UnitTester("Test5.java", "test5");

	// Tests for extractSequentialSubblocks
	// Test cases
	@Test
	public void test00_HorizontalBlock_ExtractSequentialSubblock() {
				tester1.invokeMethod(HorizontalBlock.class, "extractSequentialSubblocks", new Object[]{});
	}

	// Test for isTrivial
	@Test
	public void test01_isTrivial() {
		tester1.invokeMethod(new Class<HorizontalBlock>() {
			
		}, "isTrivial");
	}
	// Test cases
 	final static UnitTester tester20 = 
			new UnitTester("Test20.java", "test20");
	// final static UnitTester tester21 = 
	// new UnitTester("Test21.java", "test21");
	// final static UnitTester tester22 = 
	// new UnitTester("Test22.java", "test22");
	// final static UnitTester tester23 = 
	// new UnitTester("Test23.java", "test23");
	
}