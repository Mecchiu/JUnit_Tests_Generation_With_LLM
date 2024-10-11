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
		
	/**
	 * Save
	 * @see Drink
	 */
	@Test
    void save_correct_file() {
        String path = DRINKS_FOLDER + NEW_DRINK_NAME;
        System.out.println("create test test file " + path);
        File testFile = new File(path);
        assertTrue("Can not create test file " + path, testFile.isFile());
        Document document = new Document(new Element("test").addContent("Test1"));
        Element testElement = document.getRootElement();
        testElement.setName(NEW_DRINK_NAME);
        Element test1Element = new Element("test1").addContent("Test1");
        testElement.addContent(test1Element);

        FileWriter fileWriter = new FileWriter(testFile);
        XMLOutputter outputter = new XMLOutputter();

        document.write(fileWriter, outputter.outputKeys());
        fileWriter.flush();
        fileWriter.close();
        
        String correctOutput = fileWriter.toString();
        
        assertTrue("Wrong output in test file",!correctOutput.isEmpty());
        testFile.delete();
        
        File cleanFile = new File(DRINKS_FOLDER);
        assertTrue("Can not delete test file", cleanFile.exists()); 
    }    
}