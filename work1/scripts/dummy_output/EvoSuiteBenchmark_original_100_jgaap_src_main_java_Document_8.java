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
		public DocumentTest() {
		}

		public void test() {
			Character origChar = 0;
			String origText = "";
			String origStr = "";
			Vector<Character> origList = new Vector<>();
			
			Document doc = new Document("Test") ;
			System.out.println("Testing " + origStr) ;
			
			origChar = origStr.charAt(origStr.length() - 1);
			origText = "Here is an unqualified test word from the world!" ;
			doc.setAuthor(origText) ;
			
			System.out.println("Initial string: " + origStr) ;
			
			doc.processText(origText) ;
			System.out.println("processed text: " + origStr) ;
			
			assertEquals(origText, doc.getOriginalText()) ;
			System.out.println("String is: " + origStr) ;
			
			origStr = origText ;
			origList.clear() ;
			
			// test no text string
			doc.processText(null) ;
			System.out.println("process text with null object=" + doc.toString()) ;
			
			if(doc.procText == origList) {
			    System.out.println("Not a mismatch!") ;
			} else {
			    System.out.println("The wrong process list.") ;
			}
		}
	}