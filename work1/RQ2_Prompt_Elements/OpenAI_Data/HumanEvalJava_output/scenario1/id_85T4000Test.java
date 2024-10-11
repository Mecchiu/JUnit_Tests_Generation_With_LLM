// Add1Test.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains ten unit test cases for the {@link Add1#add(List)} method.
*/
class Add1Test {

	@Test
	void testAdd_1() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(30, Add1.add(lst));
	}
	
	@Test
	void testAdd_2() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		assertEquals(30, Add1.add(lst));
	}
	
	@Test
	void testAdd_3() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		assertEquals(42, Add1.add(lst));
	}
	
	@Test
	void testAdd_4() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		assertEquals(42, Add1.add(lst));
	}
	
	@Test
	void testAdd_5() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		assertEquals(56, Add1.add(lst));
	}
	
	@Test
	void testAdd_6() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		assertEquals(56, Add1.add(lst));
	}
	
	@Test
	void testAdd_7() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		assertEquals(70, Add1.add(lst));
	}
	
	@Test
	void testAdd_8() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
		assertEquals(70, Add1.add(lst));
	}
	
	@Test
	void testAdd_9() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
		assertEquals(84, Add1.add(lst));
	}
	
	@Test
	void testAdd_10() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
		assertEquals(84, Add1.add(lst));
	}
}

// Add2.java
package scenario2;

import java.util.List;

class Add2 {

    public static int add(List<Integer> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 1 && lst.get(i) % 2 == 0) {
                result += lst.get(i);
            }
        }
        return result;
    }
}

// Add2Test.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add2}.
* It contains ten unit test cases for the {@link Add2#add(List)} method.
*/
class Add2Test {
		
	@Test
	void testAdd_1() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(30, Add2.add(lst));
	}
	
	@Test
	void testAdd_2() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		assertEquals(30, Add2.add(lst));
	}
	
	@Test
	void testAdd_3() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		assertEquals(42, Add2.add(lst));
	}
	
	@Test
	void testAdd_4() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		assertEquals(42, Add2.add(lst));
	}
	
	@Test
	void testAdd_5() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		assertEquals(56, Add2.add(lst));
	}
	
	@Test
	void testAdd_6() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		assertEquals(56, Add2.add(lst));
	}
	
	@Test
	void testAdd_7() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		assertEquals(70, Add2.add(lst));
	}
	
	@Test
	void testAdd_8() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
		assertEquals(70, Add2.add(lst));
	}
	
	@Test
	void testAdd_9() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
		assertEquals(84, Add2.add(lst));
	}
	
	@Test
	void testAdd_10() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
		assertEquals(84, Add2.add(lst));
	}
}

// Add3.java
package scenario3;

import java.util.List;

class Add3 {

    public static int add(List<Integer> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 1 && lst.get(i) % 2 == 0) {
                result += lst.get(i);
            }
        }
        return result;
    }
}

// Add3Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add3}.
* It contains ten unit test cases for the {@link Add3#add(List)} method.
*/
class Add3Test {
		
	@Test
	void testAdd_1() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(30, Add3.add(lst));
	}
	
	@Test
	void testAdd_2() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		assertEquals(30, Add3.add(lst));
	}
	
	@Test
	void testAdd_3() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		assertEquals(42, Add3.add(lst));
	}
	
	@Test
	void testAdd_4() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		assertEquals(42, Add3.add(lst));
	}
	
	@Test
	void testAdd_5() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		assertEquals(56, Add3.add(lst));
	}
	
	@Test
	void testAdd_6() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		assertEquals(56, Add3.add(lst));
	}
	
	@Test
	void testAdd_7() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		assertEquals(70, Add3.add(lst));
	}
	
	@Test
	void testAdd_8() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
		assertEquals(70, Add3.add(lst));
	}
	
	@Test
	void testAdd_9() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
		assertEquals(84, Add3.add(lst));
	}
	
	@Test
	void testAdd_10() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
		assertEquals(84, Add3.add(lst));
	}
}

// Add4.java
package scenario4;

import java.util.List;

class Add4 {

    public static int add(List<Integer> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 1 && lst.get(i) % 2 == 0) {
                result += lst.get(i);
            }
        }
        return result;
    }
}

// Add4Test.java
package scenario4;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add4}.
* It contains ten unit test cases for the {@link Add4#add(List)} method.
*/
class Add4Test {
		
	@Test
	void testAdd_1() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(30, Add4.add(lst));
	}
	
	@Test
	void testAdd_2() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		assertEquals(30, Add4.add(lst));
	}
	
	@Test
	void testAdd_3() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		assertEquals(42, Add4.add(lst));
	}
	
	@Test
	void testAdd_4() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		assertEquals(42, Add4.add(lst));
	}
	
	@Test
	void testAdd_5() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		assertEquals(56, Add4.add(lst));
	}
	
	@Test
	void testAdd_6() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		assertEquals(56, Add4.add(lst));
	}
	
	@Test
	void testAdd_7() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		assertEquals(70, Add4.add(lst));
	}
	
	@Test
	void testAdd_8() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
		assertEquals(70, Add4.add(lst));
	}
	
	@Test
	void testAdd_9() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
		assertEquals(84, Add4.add(lst));
	}
	
	@Test
	void testAdd_10() {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
		assertEquals(84, Add4.add(lst));
	}
}

// Add5.java
package scenario5;

import java.util.List;

class Add5 {

    public static int add(List<Integer> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 1 && lst.get(i) % 2 == 0) {
                result += lst.get(i);
            }
        }
        return result;
    }
}

// Add5Test.java
package scenario5;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add5}.
* It contains ten unit test cases for the {@link Add5#add(List)} method.
*/
class Add5Test {
		
	@Test