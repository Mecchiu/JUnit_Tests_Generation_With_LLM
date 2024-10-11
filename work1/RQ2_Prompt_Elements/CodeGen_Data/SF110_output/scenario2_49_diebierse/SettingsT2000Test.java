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
	 * Create the unit test.
	 */
	public SettingsTest() {
	}

	/**
	 * Test method for {@link Settings#save()} - the method which takes a settings node
	 * and a JDOM document and output the settings to a JDOM document. The settings can
	 * be saved using the {@link Settings#save As} method.
	 * @throws Throwable the throwable
	 */
	@Test
	public void testSave() throws Exception {
	    System.out.println("Start test");
		
		this.testSave();
		
		// Clean up
	    File outputFile = new File(this.getClass().getSimpleName());
	    System.out.println("Outputfile name:" + outputFile.getAbsolutePath());
		
		//Delete test file
		File directory = new File(SETTINGS_FOLDER);
		if (directory.exists()) {
		    //delete file
			File file = new File(directory, "settings.xml");
			System.out.println("File:" + file);
			delete(file, directory);
			System.out.println();
		}
	}
	
	
	/**
	 * Test method for {@link Settings#save()}. The tests create JDOM document with
	 * an attribute named testName where the value is a string with the name of the
	 * configuration. The value is a string with the number of configuration
	 * parameters. The text of the attribute is given by a string, given using
	 * {@link Settings#createEmptyDocument(String)} which is then used to create
	 * a document from a JDOM string which is then used to construct an {@link
	 * Element} object using it.
	 * @throws Throwable the throwable
	 */
	@SuppressWarnings("static-method")
	@Test
	public void testCreateEmptyDocumentNoSettings() throws Exception {
		System.out.println("Start test");
		
		XMLOutputter serializer = new XMLOutputter();
		serializer.output(createEmptyDocumentWithTestSetting(), new FileOutputStream(new File(SETTINGS_FOLDER, "NoSettingsElem.xml")));
		
		Document document = new Document(createEmptyDocumentWithTestSetting());
		try {
			serializer.output(document, new FileOutputStream(new File(SETTINGS_FOLDER, "NoSettingsElem.xml")));
			fail("A specification error occured");
		} catch (IOException e) {
			assertThat(true, "A specification error occured");
		}
		
	}
	
	
	/**
	 * Create an empty document which is used as an example, created by a different 
	 * code.
	 * @param testSettingNameName
	 * @return an created empty configuration element with the name of testSettingNameName
	 */
	public Element createEmptyDocumentWithTestSetting(String testSettingNameName) {
		Element newConfigSettingElem = new Element(testSettingNameName);
		return createEmptyDocument(newConfigSettingElem);
	}
	
	/**
	 * Create an empty document. It is designed to be used for unit tests.
	 * @return an empty configuration element
	 */
	public Element createEmptyDocumentWithoutSettings() {
		return createEmptyDocument(new Element("NoSettingsElem"));
	}
	
	/**
	 * Test method for {@link Settings#save()}. The tests creates a document
	 * with an attribute named "testXML" that is given the value given by the
     * {@link #createEmptyDocumentWithTestSetting(String)} method. The value
     * is given by the given {@link #createEmptyDocumentWithoutSettings()} method.
	 * @throws Throwable the throwable
	 */
	@SuppressWarnings("static-method")
	@Test
	public void testSaveWithNoSettings() throws Exception {
		System.out.println("Start test");
		
		Document document = new Document(createEmptyDocumentWithoutSettings());
		
		//Create XML document with no content from the empty document
		this.save(document);
		
		//Create XML document without content from the empty document
		try {
			this.save(document);
			fail("A specification error occured");
		} catch (IOException e) {
			assertThat(true, "A specification error occured");
		}
	}
	
	
	/**
	 * Test method for {@link Settings#createXMLWithSettings(Element)}.
	 * @throws Throwable the throwable
	 */
	@SuppressWarnings("static-method")
	@Test
	public void testCreateXMLWithSettings() throws Exception {
		System.out.println("Start test");
		
		Document document = new Document(createEmptyDocumentWithoutSettings());
		
		//Set elements
		Element testXMLElem = new Element("NoSettingsElem");
		Element textElem = createEmptyDocumentWithoutSettings();
		Element testNAMEText = createEmptyDocumentWithoutSettings