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
		
    private static final String DOM_SETTINGS_ROOT = "settings";

    private static final String DOM_PRICE_STEPS = "priceSteps";

    private static final String DOM_CURRENCY = "currency";

    private static final String DOM_BACKGROUND_IMG = "backgound";

    private static final String DOM_STANDARD_LOGIC = "standardLogic";

    private static final String DOM_MESSAGE = "message";

    private static final String DOM_MESSAGE_SPEED = "messageSpeed";

    private static final String DOM_YES = "y";

    private static final String DOM_NO = "n";

    private static final String SETTINGS_FOLDER = Model.CONFIG_FOLDER + "settings/";

    public static final String SETTINGS_FOLDER = "settings/";

    /**
     * Test is the settings file exist after the saving the settings
     */
    @Test
    public final void fileExistsFromLoad() {
        File f = new File(SETTINGS_FOLDER + "");
        assertTrue("the settings file can not be created", f.exists());
        assertFalse("the settings file should not exist after the creation", f.exists() &&!f.delete());
    }

    /**
     * The class should read and write the default settings xml file.
     */
    @Test
    public final void saveXml() throws IOException {
        File f = new File(SETTINGS_FOLDER + "");
        assertTrue("the settings file can not be created", f.exists());
        assertFalse("the settings file should not exist after the creation", f.exists() &&!f.delete());
        File settingsXml = new File(SETTINGS_FOLDER + "default.xml");
        Document doc = new SAXBuilder().build(settingsXml);
        Element settingsEle = (Element) doc.getRootElement();
        assertNotNull("the settingsElem xml is null", settingsEle);
    }

    /**
     * Save the new settings without changing any existing properties
     */
    @Test
    public final void saveNoChange() throws IOException {
        File f = new File(SETTINGS_FOLDER + "");
        assertFalse("the settingsFile should not exist after saving the file", f.exists());
        File settingsXml = new File(SETTINGS_FOLDER + "default.xml");
        Document doc = new SAXBuilder().build(settingsXml);
        Element settingsEle = (Element) doc.getRootElement();
        assertEquals("the settingsElem and xml files should be equal", settingsEle.getName(), ELEMENT_NAME);
    }


    /**
     * Save the new settings without changing the properties that have to
     * get overwritten by the previous settings.
     * @see #saveXml()
     */
    @Test
    public final void saveNoChange2() throws IOException {
		Document doc = new SAXBuilder().build(new File(SETTINGS_FOLDER + "a.xml"));
        File settingsXml = new File(SETTINGS_FOLDER + "default.xml");
        Element settingsEle = (Element) doc.getRootElement();
        assertEquals("the settingsElem and xml files should be equal", settingsEle.getName(), ELEMENT_NAME);
    }

    /**
     * Load the current settings file
     */
    @Test
    public final void load() throws IOException {
        File f = new File(SETTINGS_FOLDER + "");
        assertTrue("the settings file can not be created", f.exists());
        assertFalse("the settings file should not exist after the creation", f.exists() &&!f.delete());
        File settingsXml = new File(SETTINGS_FOLDER + "default.xml");
        Document doc = new SAXBuilder().build(settingsXml);
        Element settingsEle = (Element) doc.getRootElement();
        assertNotNull("the settingsElem xml is null", settingsEle);
    }

    /**
     * Load the currently loaded settings
     */
    @Test
    public final void loadXml() throws IOException {
        File f = new File(SETTINGS_FOLDER + "");
        assertFalse("the settings file exists after the save", f.exists());
        assertTrue("the settings file should be created", f.createNewFile());
        File settingsXml = new File(SETTINGS_FOLDER + "default.xml");
        Document doc = new SAXBuilder().build(settingsXml);
        Element settingsEle = (Element) doc.getRootElement();
        assertNotNull("the settingsElem xml is null", settingsEle);
        assertEquals("the settingsElem should match saved settings", settingsEle.getName(), ELEMENT_NAME);
    }
}