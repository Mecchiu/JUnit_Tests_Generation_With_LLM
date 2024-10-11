// TotalMatchTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {

	@Test
	void testTotalMatch() {
		List<Object> lst1 = List.of();
		List<Object> lst2 = List.of();
		assertEquals(List.of(), TotalMatch.totalMatch(lst1, lst2));
		
		lst1 = List.of("hi", "admin");
		lst2 = List.of("hi", "hi");
		assertEquals(List.of("hi", "hi"), TotalMatch.totalMatch(lst1, lst2));
		
		lst1 = List.of("hi", "admin");
		lst2 = List.of("hi", "hi", "admin", "project");
		assertEquals(List.of("hi", "admin"), TotalMatch.totalMatch(lst1, lst2));
		
		lst1 = List.of("4");
		lst2 = List.of("1", "2", "3", "4", "5");
		assertEquals(List.of("4"), TotalMatch.totalMatch(lst1, lst2));
		
		lst1 = List.of("hi", "admin");
		lst2 = List.of("hI", "Hi");
		assertEquals(List.of("hI", "Hi"), TotalMatch.totalMatch(lst1, lst2));
		
		lst1 = List.of("hi", "admin");
		lst2 = List.of("hI", "hi", "hi");
		assertEquals(List.of("hI", "hi", "hi"), TotalMatch.totalMatch(lst1, lst2));
		
		lst1 = List.of("hi", "admin");
		lst2 = List.of("hI", "hi", "hii");
		assertEquals(List.of("hi", "admin"), TotalMatch.totalMatch(lst1, lst2));
		
		lst1 = List.of();
		lst2 = List.of("this");
		assertEquals(List.of(), TotalMatch.totalMatch(lst1, lst2));
		
		lst1 = List.of("this");
		lst2 = List.of();
		assertEquals(List.of(), TotalMatch.totalMatch(lst1, lst2));
		
		lst1 = List.of("hi", "admin");
		lst2 = List.of("hI", "hi", "hi");
		assertEquals(List.of("hI", "hi", "hi"), TotalMatch.totalMatch(lst1, lst2));
	}
}