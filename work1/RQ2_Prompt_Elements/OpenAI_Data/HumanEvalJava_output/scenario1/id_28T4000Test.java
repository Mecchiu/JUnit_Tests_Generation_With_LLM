// ConcatenateTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

	@Test
	void testConcatenate_EmptyList() {
		List<Object> list = List.of();
		String expected = "";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_OneElement() {
		List<Object> list = List.of("Hello");
		String expected = "Hello";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_TwoElements() {
		List<Object> list = List.of("Hello", "World");
		String expected = "HelloWorld";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_ThreeElements() {
		List<Object> list = List.of("Hello", " ", "World");
		String expected = "Hello World";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_FourElements() {
		List<Object> list = List.of("Hello", " ", "World", "!");
		String expected = "Hello World!";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_FiveElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ");
		String expected = "Hello World! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_SixElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!");
		String expected = "Hello World! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_SevenElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ");
		String expected = "Hello World! ! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_EightElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ", "!");
		String expected = "Hello World! ! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_NineElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ", "!", " ");
		String expected = "Hello World! ! ! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_TenElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ", "!", " ", "!");
		String expected = "Hello World! ! ! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
}

// ConcatenateTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {
		
	@Test
	void testConcatenate_EmptyList() {
		List<Object> list = List.of();
		String expected = "";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_OneElement() {
		List<Object> list = List.of("Hello");
		String expected = "Hello";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_TwoElements() {
		List<Object> list = List.of("Hello", "World");
		String expected = "HelloWorld";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_ThreeElements() {
		List<Object> list = List.of("Hello", " ", "World");
		String expected = "Hello World";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_FourElements() {
		List<Object> list = List.of("Hello", " ", "World", "!");
		String expected = "Hello World!";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_FiveElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ");
		String expected = "Hello World! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_SixElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!");
		String expected = "Hello World! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_SevenElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ");
		String expected = "Hello World! ! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_EightElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ", "!");
		String expected = "Hello World! ! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_NineElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ", "!", " ");
		String expected = "Hello World! ! ! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_TenElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ", "!", " ", "!");
		String expected = "Hello World! ! ! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
}

// ConcatenateTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {
		
	@Test
	void testConcatenate_EmptyList() {
		List<Object> list = List.of();
		String expected = "";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_OneElement() {
		List<Object> list = List.of("Hello");
		String expected = "Hello";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_TwoElements() {
		List<Object> list = List.of("Hello", "World");
		String expected = "HelloWorld";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_ThreeElements() {
		List<Object> list = List.of("Hello", " ", "World");
		String expected = "Hello World";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_FourElements() {
		List<Object> list = List.of("Hello", " ", "World", "!");
		String expected = "Hello World!";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_FiveElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ");
		String expected = "Hello World! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_SixElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!");
		String expected = "Hello World! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_SevenElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ");
		String expected = "Hello World! ! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_EightElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ", "!");
		String expected = "Hello World! ! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_NineElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ", "!", " ");
		String expected = "Hello World! ! ! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_TenElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ", "!", " ", "!");
		String expected = "Hello World! ! ! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
}

// ConcatenateTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {
		
	@Test
	void testConcatenate_EmptyList() {
		List<Object> list = List.of();
		String expected = "";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_OneElement() {
		List<Object> list = List.of("Hello");
		String expected = "Hello";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_TwoElements() {
		List<Object> list = List.of("Hello", "World");
		String expected = "HelloWorld";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_ThreeElements() {
		List<Object> list = List.of("Hello", " ", "World");
		String expected = "Hello World";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_FourElements() {
		List<Object> list = List.of("Hello", " ", "World", "!");
		String expected = "Hello World!";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_FiveElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ");
		String expected = "Hello World! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_SixElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!");
		String expected = "Hello World! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_SevenElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ");
		String expected = "Hello World! ! ";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected, actual);
	}
	
	@Test
	void testConcatenate_EightElements() {
		List<Object> list = List.of("Hello", " ", "World", "!", " ", "!", " ", "!");
		String expected = "Hello World! ! !";
		String actual = Concatenate.concatenate(list);
		assertEquals(expected,