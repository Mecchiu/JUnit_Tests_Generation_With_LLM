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
		* @jest-category logging
		*/
    @Test
    public void testSave() {
        Drink_1.setUp();
        try {
            Drink_1.setUp();
            Drink drink = new Drink(name);
            assertNotNull("Should store a Drink!", drink);
            assertNotNull("Should set the ID of the Drink!", drink.getID());
            assertNotNull("Should store the name of the Drink!", drink.getName());
            assertEquals(name, drink.getName());
            assertEquals(name, drink.getName());
            assertEquals(name, drink.getID());
            assertEquals(new Drink("Test", new DrinkDescription_1()), drink);
        } catch (AssertionError e) {
            return;
        }
    }

    public void setUp() {
        model = new Drink();
        model.setName(name);
        model.setDescription(new DrinkDescription_1());
        model.setID("");
        model.setUsed(false);
    }
	
	/**
	* Test for the following JDOM file: 
	* <xmpLiteral name="${drink.name}" type="text/plain" content="Testing drink description.</xmp>
	*/
    @Test
    public void testDRINK_1() {
		Drink_1 test = new Drink_1();
        // Build JDOM document representing the settings
        Document doc = new Document("<xmpLiteral name=\"${drink.name}"
                + "\n      type=\"text/plain\""
                + "\n                content=\"Testing drink description.</xmp>" + "</xmpLiteral>");
        // Save JDOM document to file system
        File file = test.save();
        // Build DOM object representing the content of the DOM document
        Document result = new SAXBuilder().build(new File(file.getAbsolutePath()));
        assertNotNull("Should store a Drink!", result);

	}  
    
	/**
	* Test for the following XML file: 
	* <xmpLiteral name="${drink.name}" type="xsl" content="&lt;"&gt;&lt;title&gt;&lt;body&gt;&lt;p&gt;Testing ${drink.name}: ${drink.description}&lt;/p&gt;&lt;/body&gt;&lt;/title&gt;&lt;/body&gt;&lt;/xmpLiteral>
	*/
    @Test
    public void testDRINK_N_2() {
		
        // Build JDOM document representing the settings
        Document doc = new Document("<xmpLiteral name=\"${drink.name}"
                + "\n      type=\"xsl\""
                + "\n                content=\"&lt;" 
                + "<body><p>"+ new DrinkDescription_2().getName() +"</p></body>" + "</xmpLiteral>");
        assertNotNull("Should store a Drink!", doc);
        assertNotNull("Should set the ID of the Drink!", doc.getRootElement().getAttribute("id"));
        assertEquals(name, doc.getRootElement().getAttribute("id"));
        assertNotNull("Should store the name of the Drink!", doc.getRootElement().getAttribute("name"));
        assertEquals(name, doc.getRootElement().getAttribute("name"));
        // Build XML document object
        Document result = new SAXBuilder().build(new File(
                this.getClass().getResource("Drink_N_2.xml").getFile()));
        assertNotNull("Should store a Drink!", result);
        assertEquals("Drink Description",
                result.getRootElement().getContent());
        assertEquals("Drink Description", result.getRootElement().getContent());
    }
       /**
	* Test for the following XML file: 
	* <xmpLiteral name={{drink.name}} id={{drink.ID}} />
	*
	*/
    @Test
    public void testDRINK_N_3() {
		
        // Build JDOM document representing the settings
        Document doc = new Document("<xmpLiteral name={{drink.name}}"
                + "\n      type=\"xsl\""
                + "\n                content=\"&lt;" 
                + "<body><p>"+ new DrinkDescription_2().getName() +"</p></body>" + "</xmpLiteral>" + "</xmpL