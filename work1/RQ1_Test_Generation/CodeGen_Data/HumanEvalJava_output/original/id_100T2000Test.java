// MakeAPileTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains one unit test case for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {

		/**
		* Example of {@link MakeAPile#makeAPile(int)} method.
		* It calls {@link List#get(int)}.
		*/
		@Test
		public void shouldReturnListOfLenghtN() {
			int n = 3;
			List<Integer> result = listOfLenghtN(n);
			assertNotEmpty(result);
			assertEquals(n, result.get(0));
			assertEquals(n, result.get(1));
			assertEquals(n, result.get(2));
		}
		
		/**
		* Example of {@link List#get(int)(int)}.
		* It calls {@link List#get(int)},
		* and it calls {@link Integer#valueOf((int) (int))}.
		* */
		@Test
		public void shouldReturnListOfNOfLenghtNWithGet() {
			int n = 3;
			List<Integer> result = listOfNOfLenghtN(n);
			assertEquals(n, result.get(getListOfNOfLenghtNLenght(result)));
		}
		
		/**
		* Example of {@link List#getAll(int)} method, to test the implementation of {@link List#getAll(int)}.
		* It calls {@link List#getAll(int)}.
		*/
		@Test
		public void shouldReturnListOfLenghtNWithGetAll() {
			int n = 3;
			List<Integer> result = listOfLenghtN(n);
			assertEquals(n, result.getAll(getListOfNOfLenghtNLenght(result)));
		}
		
		/**
		* Example of {@link List#add(int, int)}.
		* It calls {@link List#add(int, int)}.
		*/
		@Test
		public void shouldAddListNOfLenghtNAndAdd() {
			int n = 3;
			int count = listOfLenghtN(n).size();
			assertEquals(n, listOfLenghtN(n).size());
			listOfLenghtN(n).add(10);
			assertEquals(n, listOfLenghtN(n).get(listOfLenghtN(n).size() - 1));
			List<Integer> result = listOfLenghtN(n);
			assertEquals(count, result.size());
			assertEquals(n, result.get(listOfLenghtN(n).get(4)));
		}

		@Test
		public void shouldBeAbleToCreateEmptyList() {
			assertNotNull(listOfLenghtN(0));
		}
		
		@Test
		public void shouldBeAbleToCreateListOfEmptyObject() {
			assertNull(listOfLenghtN(0));
		}
}