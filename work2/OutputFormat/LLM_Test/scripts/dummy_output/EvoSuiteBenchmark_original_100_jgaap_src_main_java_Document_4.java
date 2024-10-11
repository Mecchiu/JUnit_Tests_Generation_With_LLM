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
		/**
		* Creates a new {@link DocumentTest} as a given
		*  {@link Document}.
		*/
    public DocumentTest(Document doc) {
        this.document  = doc;
    }

		/**
		* Calls {@link #document#stringify()} directly for
		* checking. It will return null or the error message that
		* was detected.
		*/
    @Test
	public void testStringify() {
        try {
            document.stringify();
        } catch ({@link Exception}) (document = null) {
            System.out.println("testStringify() - exception thrown" );
            return;
        } catch (Exception error) {
            return "";
        }
        return "";
    }

		/**
		* Convenience method to call stringify on Document
		* which will convert it to a String
		*/
    public String documentStringify() {
        return document.stringify().toString();
    }

    /**
     * Document instance is passed to the constructor of its
     * child classes, as it can hold processText if the current
     * document type is a processText type.
     */
	private Document document;
}