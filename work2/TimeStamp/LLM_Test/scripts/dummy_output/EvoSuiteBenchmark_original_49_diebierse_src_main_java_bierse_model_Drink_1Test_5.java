// Drink_1Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains one unit test case for the {@link Drink#save()} method.
*/
class Drink_1Test {
		static {
	        System.loadLibrary(Model.MODEL);
	    }

	public static void main(String[] args) throws Exception
	{
		File testFile = new File(Drink_1Test.class.getClassLoader().getResource("Drink_1_test.xml").toURI());

		if (!testFile.canWrite())
		{
			throw new IllegalStateException("Cannot write to output file: " + testFile);
		}

	      XMLOutputter x = new XMLOutputter();
	      x.setFormat(XMLOutputter.FORMAT_NONE);

	      x.output(new SAXBuilder().fillFrom(new FileOutputStream(testFile)), new Document());

	}

	@Test
	public void test() throws Exception{

	}
}