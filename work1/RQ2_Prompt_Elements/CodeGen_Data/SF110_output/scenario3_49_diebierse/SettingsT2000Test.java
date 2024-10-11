// SettingsTest.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Settings}.
* It contains one unit test case for the {@link Settings#save()} method.
*/
class SettingsTest {

	/**
	* Save the settings.
	*/
	@Test
    public void testSaveSettings() {
        try {		
            // TODO make sure this doesn't throw anything yet!
            Settings.save();
            File file = File.createTempFile("SettingsTest", ".xml");
            FileOutputStream stream = new FileOutputStream(file);
            Document xml = new SAXBuilder().build(Settings.class.getResourceAsStream("Settings.xml"));	
            xml.serialize(stream);
            //xml.write("bierseSettings.xml");// TODO FIXME
        } catch (IOException | ClassNotFoundException ex) {
            fail("Not expected");
        }
    }
}