// Settings.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class Settings {

    private static final String DOM_SETTINGS_ROOT = "settings";

    private static final String DOM_TIME_INTERVAL = "timeInterval";

    private static final String DOM_PRICE_STEPS = "priceSteps";

    private static final String DOM_CURRENCY = "currency";

    private static final String DOM_BACKGROUND_IMG = "backgound";

    private static final String DOM_STANDARD_LOGIC = "standardLogic";

    private static final String DOM_MESSAGE = "message";

    private static final String DOM_MESSAGE_SPEED = "messageSpeed";

    private static final String DOM_YES = "y";

    private static final String DOM_NO = "n";

    public static final String SETTINGS_FOLDER = Model.CONFIG_FOLDER + "settings/";

    /**
     * Time interval(seconds) in which the current prices are recalculated.
     */
    private int timeInterval = 10;

    /**
     * The steps that are available for the prices, e.g. 10, 20 or 50 cents
     */
    private int priceSteps = 10;

    /**
     * The currency symbol used
     */
    private java.lang.String currency = "€";

    private boolean standardLogic = true;

    private String backgroundImagePath = null;

    private String message = "Das ist eine Standard-Nachricht für das Laufband!";

    private int messageSpeed = 10;

    /**
     * Model that uses these settings
     */
    private Model model;

    public Settings(Model m) {
        this.model = m;
    }

    /**
     * Save the settings
     */
    public File save() {
        File settingsFile = new File(SETTINGS_FOLDER + model.getName() + ".xml");
        Element root = new Element(DOM_SETTINGS_ROOT);
        Document doc = new Document(root);

        Element timeIntervalElement = new Element(DOM_TIME_INTERVAL);
        timeIntervalElement.setText(Integer.toString(timeInterval));
        root.addContent(timeIntervalElement);

        Element priceStepsElement = new Element(DOM_PRICE_STEPS);
        priceStepsElement.setText(Integer.toString(priceSteps));
        root.addContent(priceStepsElement);

        Element currencyElement = new Element(DOM_CURRENCY);
        currencyElement.setText(currency);
        root.addContent(currencyElement);

        Element standardLogicElement = new Element(DOM_STANDARD_LOGIC);
        standardLogicElement.setText(standardLogic ? DOM_YES : DOM_NO);
        root.addContent(standardLogicElement);

        Element backgroundElement = new Element(DOM_BACKGROUND_IMG);
        if (backgroundImagePath != null) {
            backgroundElement.setText(backgroundImagePath);
        }
        root.addContent(backgroundElement);

        Element messageElement = new Element(DOM_MESSAGE);
        messageElement.setText(message);
        root.addContent(messageElement);

        Element messageSpeedElement = new Element(DOM_MESSAGE_SPEED);
        messageSpeedElement.setText(Integer.toString(messageSpeed));
        root.addContent(messageSpeedElement);

        try {
            XMLOutputter outputter = new XMLOutputter();
            FileOutputStream fos = new FileOutputStream(settingsFile);
            outputter.output(doc, fos);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return settingsFile;
    }

    /**
     * Load the settings
     */
    public void load() {
        File settingsFile = new File(SETTINGS_FOLDER + model.getName() + ".xml");
        if (!settingsFile.exists()) {
            return;
        }

        SAXBuilder builder = new SAXBuilder();
        try {
            Document doc = builder.build(settingsFile);
            Element root = doc.getRootElement();

            Element timeIntervalElement = root.getChild(DOM_TIME_INTERVAL);
            if (timeIntervalElement != null) {
                timeInterval = Integer.parseInt(timeIntervalElement.getText());
            }

            Element priceStepsElement = root.getChild(DOM_PRICE_STEPS);
            if (priceStepsElement != null) {
                priceSteps = Integer.parseInt(priceStepsElement.getText());
            }

            Element currencyElement = root.getChild(DOM_CURRENCY);
            if (currencyElement != null) {
                currency = currencyElement.getText();
            }

            Element standardLogicElement = root.getChild(DOM_STANDARD_LOGIC);
            if (standardLogicElement != null) {
                standardLogic = standardLogicElement.getText().equals(DOM_YES);
            }

            Element backgroundElement = root.getChild(DOM_BACKGROUND_IMG);
            if (backgroundElement != null) {
                backgroundImagePath = backgroundElement.getText();
            }

            Element messageElement = root.getChild(DOM_MESSAGE);
            if (messageElement != null) {
                message = messageElement.getText();
            }

            Element messageSpeedElement = root.getChild(DOM_MESSAGE_SPEED);
            if (messageSpeedElement != null) {
                messageSpeed = Integer.parseInt(messageSpeedElement.getText());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(int timeInterval) {
        this.timeInterval = timeInterval;
    }

    public int getPriceSteps() {
        return priceSteps;
    }

    public void setPriceSteps(int priceSteps) {
        this.priceSteps = priceSteps;
    }

    public java.lang.String getCurrency() {
        return currency;
    }

    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }

    public boolean isStandardLogic() {
        return standardLogic;
    }

    public void setStandardLogic(boolean standardLogic) {
        this.standardLogic = standardLogic;
    }

    public String getBackgroundImagePath() {
        return backgroundImagePath;
    }

    public void setBackgroundImagePath(String backgroundImagePath) {
        this.backgroundImagePath = backgroundImagePath;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMessageSpeed() {
        return messageSpeed;
    }

    public void setMessageSpeed(int messageSpeed) {
        this.messageSpeed = messageSpeed;
    }
}

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
* It contains ten unit test cases for the {@link Settings#save()} method.
*/
class SettingsTest {

    @Test
    void testSave() {
        Model model = new Model("test");
        Settings settings = new Settings(model);
        settings.setTimeInterval(20);
        settings.setPriceSteps(50);
        settings.setCurrency("$");
        settings.setStandardLogic(false);
        settings.setBackgroundImagePath("background.jpg");
        settings.setMessage("Test message");
        settings.setMessageSpeed(5);

        File settingsFile = settings.save();

        assertTrue(settingsFile.exists());

        SAXBuilder builder = new SAXBuilder();
        try {
            Document doc = builder.build(settingsFile);
            Element root = doc.getRootElement();

            Element timeIntervalElement = root.getChild(Settings.DOM_TIME_INTERVAL);
            assertNotNull(timeIntervalElement);
            assertEquals("20", timeIntervalElement.getText());

            Element priceStepsElement = root.getChild(Settings.DOM_PRICE_STEPS);
            assertNotNull(priceStepsElement);
            assertEquals("50", priceStepsElement.getText());

            Element currencyElement = root.getChild(Settings.DOM_CURRENCY);
            assertNotNull(currencyElement);
            assertEquals("$", currencyElement.getText());

            Element standardLogicElement = root.getChild(Settings.DOM_STANDARD_LOGIC);
            assertNotNull(standardLogicElement);
            assertEquals(Settings.DOM_NO, standardLogicElement.getText());

            Element backgroundElement = root.getChild(Settings.DOM_BACKGROUND_IMG);
            assertNotNull(backgroundElement);
            assertEquals("background.jpg", backgroundElement.getText());

            Element messageElement = root.getChild(Settings.DOM_MESSAGE);
            assertNotNull(messageElement);
            assertEquals("Test message", messageElement.getText());

            Element messageSpeedElement = root.getChild(Settings.DOM_MESSAGE_SPEED);
            assertNotNull(messageSpeedElement);
            assertEquals("5", messageSpeedElement.getText());

        } catch (Exception e) {
            e.printStackTrace();
        }

        settingsFile.delete();
    }

    @Test
    void testSaveNoBackground() {
        Model model = new Model("test");
        Settings settings = new Settings(model);
        settings.setTimeInterval(20);
        settings.setPriceSteps(50);
        settings.setCurrency("$");
        settings.setStandardLogic(false);
        settings.setMessage("Test message");
        settings.setMessageSpeed(5);

        File settingsFile = settings.save();

        assertTrue(settingsFile.exists());

        SAXBuilder builder = new SAXBuilder();
        try {
            Document doc = builder.build(settingsFile);
            Element root = doc.getRootElement();

            Element timeIntervalElement = root.getChild(Settings.DOM_TIME_INTERVAL);
            assertNotNull(timeIntervalElement);
            assertEquals("20", timeIntervalElement.getText());

            Element priceStepsElement = root.getChild(Settings.DOM_PRICE_STEPS);
            assertNotNull(priceStepsElement);
            assertEquals("50", priceStepsElement.getText());

            Element currencyElement = root.getChild(Settings.DOM_CURRENCY);
            assertNotNull(currencyElement);
            assertEquals("$", currencyElement.getText());

            Element standardLogicElement = root.getChild(Settings.DOM_STANDARD_LOGIC);
            assertNotNull(standardLogicElement);
            assertEquals(Settings.DOM_NO, standardLogicElement.getText());

            Element backgroundElement = root.getChild(Settings.DOM_BACKGROUND_IMG);
            assertNull(backgroundElement);

            Element messageElement = root.getChild(Settings.DOM_MESSAGE);
            assertNotNull(messageElement);
            assertEquals("Test message", messageElement.getText());

            Element messageSpeedElement = root.getChild(Settings.DOM_MESSAGE_SPEED);
            assertNotNull(messageSpeedElement