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
	 * Test method for {@link Settings#load()}.
	 */
	@Test
	public void testLoad() {
		File path = new File(Settings.CONFIG_FOLDER);
		System.out.println("Load settings file: " + path);
		File target = new File(Settings.CONFIG_FOLDER + path.getName() + ".xml");
		Settings.save();
		assertEquals(Model.SETTINGS_FOLDER, target);
	}
	
	@Test
	public void testSaved() throws IOException {
		Settings.save();
		File path = new File(Settings.CONFIG_FOLDER);
		System.out.println("Load settings file: " + path);
		File target = new File(Settings.CONFIG_FOLDER + path.getName() + ".xml");
		FileOutputStream fos = new FileOutputStream(this.getClass().getResource("/settings.xml").getFile());
		SAXBuilder saxBuilder = new SAXBuilder();
		Document document = null;
		try {
			document = (Document)saxBuilder.build(fos);
		}
		catch(Exception e){
			throw new AssertionError(e.getMessage());
		}
		System.out.println("Load settings document: " + target);
		fos.close();
		assertEquals(target, document.getRootElement());
	}

	/*
	* Test method for {@link Settings#saved(File)}.
	*/
	@Test
	public void testOldSave() throws IOException {
		Settings.save();
		Thread.sleep(1000);
		Thread.sleep(1000);
		File path = new File(Settings.CONFIG_FOLDER);
		System.out.println("Load settings file: " + path);
		Settings.save();
		File target = new File(Settings.CONFIG_FOLDER + path.getName() + ".xml");
		FileOutputStream fos = new FileOutputStream(target);
		SAXBuilder saxBuilder = new SAXBuilder();
		Document document = null;
		try {
			document = (Document)saxBuilder.build(fos);
		}
		catch(Exception e){
			throw new AssertionError(e.getMessage());
		}
		System.out.println("Load settings document: " + target);
		fos.close();
		assertNotNull(document);
	}
}