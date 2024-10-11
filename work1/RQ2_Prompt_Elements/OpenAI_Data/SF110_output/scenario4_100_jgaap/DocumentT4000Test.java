// DocumentTest.java


import java.io.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains ten unit test cases for the {@link Document#stringify()} method.
*/
class DocumentTest {

	/**
	* Test case for {@link Document#stringify()} method.
	* It tests the stringify method with a document that contains only one word.
	*/
	@Test
	void testStringifyOneWord() {
		Document doc = new Document("test.txt");
		doc.readText("test.txt");
		doc.procText = new Vector<Character>();
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('s');
		doc.procText.add('t');
		assertEquals("test", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()} method.
	* It tests the stringify method with a document that contains only one sentence.
	*/
	@Test
	void testStringifyOneSentence() {
		Document doc = new Document("test.txt");
		doc.readText("test.txt");
		doc.procText = new Vector<Character>();
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('s');
		doc.procText.add('t');
		doc.procText.add(' ');
		doc.procText.add('s');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('c');
		doc.procText.add('e');
		assertEquals("test sentence", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()} method.
	* It tests the stringify method with a document that contains only one paragraph.
	*/
	@Test
	void testStringifyOneParagraph() {
		Document doc = new Document("test.txt");
		doc.readText("test.txt");
		doc.procText = new Vector<Character>();
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('s');
		doc.procText.add('t');
		doc.procText.add(' ');
		doc.procText.add('s');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('c');
		doc.procText.add('e');
		doc.procText.add(' ');
		doc.procText.add('p');
		doc.procText.add('a');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('g');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('h');
		assertEquals("test sentence paragraph", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()} method.
	* It tests the stringify method with a document that contains only one chapter.
	*/
	@Test
	void testStringifyOneChapter() {
		Document doc = new Document("test.txt");
		doc.readText("test.txt");
		doc.procText = new Vector<Character>();
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('s');
		doc.procText.add('t');
		doc.procText.add(' ');
		doc.procText.add('s');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('c');
		doc.procText.add('e');
		doc.procText.add(' ');
		doc.procText.add('p');
		doc.procText.add('a');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('g');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('h');
		doc.procText.add(' ');
		doc.procText.add('c');
		doc.procText.add('h');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('r');
		assertEquals("test sentence paragraph chapter", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()} method.
	* It tests the stringify method with a document that contains only one book.
	*/
	@Test
	void testStringifyOneBook() {
		Document doc = new Document("test.txt");
		doc.readText("test.txt");
		doc.procText = new Vector<Character>();
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('s');
		doc.procText.add('t');
		doc.procText.add(' ');
		doc.procText.add('s');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('c');
		doc.procText.add('e');
		doc.procText.add(' ');
		doc.procText.add('p');
		doc.procText.add('a');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('g');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('h');
		doc.procText.add(' ');
		doc.procText.add('c');
		doc.procText.add('h');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('r');
		doc.procText.add(' ');
		doc.procText.add('b');
		doc.procText.add('o');
		doc.procText.add('o');
		doc.procText.add('k');
		assertEquals("test sentence paragraph chapter book", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()} method.
	* It tests the stringify method with a document that contains only one library.
	*/
	@Test
	void testStringifyOneLibrary() {
		Document doc = new Document("test.txt");
		doc.readText("test.txt");
		doc.procText = new Vector<Character>();
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('s');
		doc.procText.add('t');
		doc.procText.add(' ');
		doc.procText.add('s');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('c');
		doc.procText.add('e');
		doc.procText.add(' ');
		doc.procText.add('p');
		doc.procText.add('a');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('g');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('h');
		doc.procText.add(' ');
		doc.procText.add('c');
		doc.procText.add('h');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('r');
		doc.procText.add(' ');
		doc.procText.add('b');
		doc.procText.add('o');
		doc.procText.add('o');
		doc.procText.add('k');
		doc.procText.add(' ');
		doc.procText.add('l');
		doc.procText.add('i');
		doc.procText.add('b');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('r');
		doc.procText.add('y');
		assertEquals("test sentence paragraph chapter book library", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()} method.
	* It tests the stringify method with a document that contains only one city.
	*/
	@Test
	void testStringifyOneCity() {
		Document doc = new Document("test.txt");
		doc.readText("test.txt");
		doc.procText = new Vector<Character>();
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('s');
		doc.procText.add('t');
		doc.procText.add(' ');
		doc.procText.add('s');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('c');
		doc.procText.add('e');
		doc.procText.add(' ');
		doc.procText.add('p');
		doc.procText.add('a');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('g');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('h');
		doc.procText.add(' ');
		doc.procText.add('c');
		doc.procText.add('h');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('r');
		doc.procText.add(' ');
		doc.procText.add('b');
		doc.procText.add('o');
		doc.procText.add('o');
		doc.procText.add('k');
		doc.procText.add(' ');
		doc.procText.add('l');
		doc.procText.add('i');
		doc.procText.add('b');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('r');
		doc.procText.add('y');
		doc.procText.add(' ');
		doc.procText.add('c');
		doc.procText.add('i');
		doc.procText.add('t');
		doc.procText.add('y');
		assertEquals("test sentence paragraph chapter book library city", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()} method.
	* It tests the stringify method with a document that contains only one country.
	*/
	@Test
	void testStringifyOneCountry() {
		Document doc = new Document("test.txt");
		doc.readText("test.txt");
		doc.procText = new Vector<Character>();
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('s');
		doc.procText.add('t');
		doc.procText.add(' ');
		doc.procText.add('s');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('n');
		doc.procText.add('c');
		doc.procText.add('e');
		doc.procText.add(' ');
		doc.procText.add('p');
		doc.procText.add('a');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('g');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('h');
		doc.procText.add(' ');
		doc.procText.add('c');
		doc.procText.add('h');
		doc.procText.add('a');
		doc.procText.add('p');
		doc.procText.add('t');
		doc.procText.add('e');
		doc.procText.add('r');
		doc.procText.add(' ');
		doc.procText.add('b');
		doc.procText.add('o');
		doc.procText.add('o');
		doc.procText.add('k');
		doc.procText.add(' ');
		doc.procText.add('l');
		doc.procText.add('i');
		doc.procText.add('b');
		doc.procText.add('r');
		doc.procText.add('a');
		doc.procText.add('r');
		doc.procText.add('y');
		doc.procText.add(' ');
		doc.procText.add('c');
		doc.procText.add('i');
		doc.procText.add('t');
		doc.procText.add('y');
		doc.procText.add(' ');
		doc.procText.add('c');
		doc.procText.add('o');
		doc.procText.add('u');
		doc.procText.add('n');
		doc.procText.add('t');
		doc.procText.add('r');
		doc.procText.add('y');
		assertEquals("test