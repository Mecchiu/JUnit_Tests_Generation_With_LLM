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
		
	public static final String XML_FILE = "SettingsTest.xml";
	public static final String DOM_MESSAGE = "Settings";
	public static final String DOM_STANDARD_LOGIC = "standardLogic";
	public static final String DOM_MESSAGE_SPEED = "messageSpeed";
	public static final String DOM_BACKGROUND_IMG = "backgound";
	private Settings settings = new Settings(null);

	/**
	* Test if setTimeInterval function return true.
	* It is called in the start method.
	*/
	@Test
	public void testGetTimeInterval() {

		// save
		assertEquals(1, settings.getTimeInterval());
	}

	/**
	* Test if setPriceSteps function returns the correct value.
	* It is called in the start method.
	*/
	@Test
	public void testGetPriceSteps() {

		// save
		settings = new Settings(null);
		assertEquals(1, settings.getPriceSteps());
	}

	/**
	* Test if getCurrency function returns the correct value.
	* It is called in the start method.
	*/
	@Test
	public void testGetCurrency() {

		// save
		settings = new Settings(null);
		java.lang.String expected = "�";
		assertEquals(expected, settings.getCurrency());
	}

	/**
	* Test the getBackgroundImagePath function.
	* It is called in the start method.
	*/
	@Test
	public void testGetBackgroundImagePath() {

	}

	/**
	* Test if setStandardLogic function returns the true.
	* It is called in the start method.
	*/
	@Test
	public void testSetStandardLogic() {
		// test if setStandardLogic function return true
		settings.setStandardLogic(true);
		assertTrue(settings.isStandardLogic());

	}

	/**
	* Test the setStandardLogic function to false.
	* It was called in the start method.
	*/
	@Test
	public void testSetStandardLogic() throws IOException {
		// setStandardLogic is called in start method
		settings.setStandardLogic(false);
		assertFalse(settings.isStandardLogic());

	}

	/**
	* Test of save method, of class {@link Settings}.
	*/
	@Test
	public void testSave() {

		// test if save function returns value set in the constructor.
		// First call to save() is the start method.
		settings.save();
		assertEquals(SETTINGS_FOLDER + XML_FILE, new File(SettingsTest.class.getName())
				.toString());
	}

	/**
	* Test if XMLOutputter function.
	*/
	@Test
	public void testXMLOutputter() {

		// save
		settings = new Settings(null);
		XMLOutputter outputter = new XMLOutputter();
		File outDir = new File(SETTINGS_FOLDER + XML_FILE);
		try {
			FileOutputStream fos = new FileOutputStream(outDir);
			outputter.output(new Document(new SAXBuilder().build(new SAXBuilder().build(settings
					.getModel().getFileContents()))), fos);
			fos.flush();
		} finally {
			fos.close();
		}
		// test if XMLOutputter function return value set in the constructor.
		// Second call to XMLOutputter.
		Element xmlElem = new Document(new SAXBuilder().build(settings
				.getModel().getFileContents())).getRootElement();
		assertNotNull(xmlElem);
		assertEquals("SettingsTestxml", xmlElem.getName());
	}
	
	/**
	* Test if XMLOutputter function.
	*/
	@Test
	public void testXMLOutputterWithEncoding() {

		// save
		settings.save();

		String output = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
				+ "<Settings xmlns=\"http://bierse.ch/model/\">\n"
				+ "<messages version=\"5.1\">\n"
				+ "<message value=\"0€\">\n"
				+ "<message-speed value=\"0€\">0€\n</message-speed>\n"
				+ "<message speed=\"100\">\n"
				+ "<message-speed value=\"100\">100\n</message-speed>\n"
				+ "</message>\n"
				+ "</messages>\n"
				+ "</Settings>";

		// test
		SAXBuilder saxBuilder = new SAXBuilder();
		Document document = new Document(saxBuilder.build(new String(output)));
		Element xmlElem = document.getRootElement();
		
		// check XML for the encoding name: UTF-8
		assertEquals("UTF-8", xmlElem.getAttributeValue("encoding"));

	}
}