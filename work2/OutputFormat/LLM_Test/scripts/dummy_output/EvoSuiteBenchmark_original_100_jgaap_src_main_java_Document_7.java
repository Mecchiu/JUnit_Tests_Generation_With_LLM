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
		static String filename;
		
	public DocumentTest() {}

	static void main(String []args){
		DocumentTest.main (null,true);
	}

	static void main(String []args,boolean autoParseDocument_) {
		DocumentTest.main (args,autoParseDocument_);
	}
	
	String filename;

	public static void main (String args[]) {
    DocumentTest doc = new DocumentTest();
	}
	
	DocumentTest(String filename) {
   this.filename = filename;
  }
}