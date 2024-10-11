// DocumentTest.java


import java.io.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains one unit test case for the {@link Document#stringify()} method.
*/
class DocumentTest {
		private Document document;
    
      /**
       * It is a unit test method
       */
      void setUp() throws Exception {
              document = new Document("some.docfile.txt");
      }

      /**
       * Test readText()
       */
      @Test
      void test2 () throws Exception {
              Vector<Character> text = document.getProcessedText();
      }

      @Test
      void test3 () throws Exception {
              assertEquals ("some.docfile.txt", document.getFilename());
      }

      @Test
      void test4 () throws Exception {
              assertEquals (0, text.size());
      }

      @Test
      void test5 () throws Exception {
              Vector<Character> text = document.getProcessedText();
              assertEquals (45, text.size());
      }

      @Test
      void test6 () throws Exception {
              Vector<Character> text = document.getProcessedText();
      }


}