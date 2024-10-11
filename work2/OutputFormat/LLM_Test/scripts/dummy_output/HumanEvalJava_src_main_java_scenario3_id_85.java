// Add1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains ten unit test cases for the {@link Add1#add(List)} method.
*/
class Add1Test {
			@Test
			void testAdd() {
				List<Integer> lst = List.of(4, 2, 6, 7);
				assertEquals(2, Add1.add(lst));
			}

			@Test
			void testAdd2() {
				List<Integer> lst = List.of(4, 88);
				assertEquals(88, Add1.add(lst));
			}

			@Test
			void testAdd3() {
				List<Integer> lst = List.of(4, 5, 6, 7, 2, 122);
				assertEquals(122, Add1.add(lst));
			}

			@Test
			void testAdd4() {
				List<Integer> lst = List.of(4, 0, 6, 7);
				assertEquals(0, Add1.add(lst));
			}

			@Test
			void testAdd5() {
				List<Integer> lst = List.of(4, 4, 6, 8);
				assertEquals(12, Add1.add(lst));
			}

			@Test
			void testAdd6() {
				List<Integer> lst = List.of(4, 2, 6, 7, 2, 122);
				assertEquals(2, Add1.add(lst));
			}

			@Test
			void testAdd7() {
				List<Integer> lst = List.of(4, 2, 6, 7, 2, 122, 4, 5, 6, 7, 2, 122);
				assertEquals(124, Add1.add(lst));
			}

			@Test
			void testAdd8() {
				List<Integer> lst = List.of(4, 2, 6, 7, 2, 122, 4, 5, 6, 7, 2, 122, 4, 2, 6, 7, 2, 122);
				assertEquals(126, Add1.add(lst));
			}

			@Test
			void testAdd9() {
				List<Integer> lst = List.of(4, 2, 6, 7, 2, 122, 4, 5, 6, 7, 2, 122, 4, 2, 6, 7, 2, 122, 4, 2, 6, 7, 2, 122);
				assertEquals(128, Add1.add(lst));
			}

			@Test
			void testAdd10() {
				List<Integer> lst = List.of(4, 2, 6, 7, 2, 122, 4, 5, 6, 7, 2, 122, 4, 2, 6, 7, 2, 122, 4, 2, 6, 7, 2, 122, 4, 2, 6, 7, 2, 122);
				assertEquals(130, Add1.add(lst));
			}
}