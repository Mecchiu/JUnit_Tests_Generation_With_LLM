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
		
	@Test
	void testSave() throws IOException {
		SettingsTest.testSave();
	}

	private static File testSave();
	
	@Test
	void testSave() throws IOException {

		Settings settings = new Settings(new Model());

		settings.save();
		
		File testPath = settings.listSettingsFolder();
		assertNotNull(testPath); // Test that the class can be located
		assertTrue(testPath.canRead()); // There are settings folders.

		settings = new Settings();
		settings.load();

		File testPath2 = settings.listSettingsFolder();
		assertNotNull(testPath2); // Test that the class can be located
		assertTrue(testPath2.canRead()); // There are settings folders.

		settings.save();
		
		File testPath3 = settings.listSettingsFolder();
		assertNotNull(testPath3); // Test that the class can be located
		assertTrue(testPath3.canRead()); // There are settings folders.

	}

}