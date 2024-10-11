package bierse.model;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SettingsTest {

    @Test
    void testSaveSettings() {
        // Test saving settings
        Settings settings = new Settings(new Model());
        File savedFile = settings.save();
        assertTrue(savedFile.exists());
    }

    @Test
    void testLoadSettings() {
        // Test loading settings
        Settings settings = new Settings(new Model());
        settings.load();
        assertNotNull(settings.getTimeInterval());
        assertNotNull(settings.getPriceSteps());
        assertNotNull(settings.getCurrency());
        assertNotNull(settings.isStandardLogic());
        assertNotNull(settings.getBackgroundImagePath());
        assertNotNull(settings.getMessage());
        assertNotNull(settings.getMessageSpeed());
    }

    @Test
    void testSetTimeInterval() {
        // Test setting time interval
        Settings settings = new Settings(new Model());
        settings.setTimeInterval(20);
        assertEquals(20, settings.getTimeInterval());
    }

    @Test
    void testSetPriceSteps() {
        // Test setting price steps
        Settings settings = new Settings(new Model());
        settings.setPriceSteps(50);
        assertEquals(50, settings.getPriceSteps());
    }

    @Test
    void testSetCurrency() {
        // Test setting currency
        Settings settings = new Settings(new Model());
        settings.setCurrency("$");
        assertEquals("$", settings.getCurrency());
    }

    @Test
    void testSetStandardLogic() {
        // Test setting standard logic
        Settings settings = new Settings(new Model());
        settings.setStandardLogic(false);
        assertFalse(settings.isStandardLogic());
    }

    @Test
    void testSetBackgroundImagePath() {
        // Test setting background image path
        Settings settings = new Settings(new Model());
        settings.setBackgroundImagePath("/path/to/image.jpg");
        assertEquals("/path/to/image.jpg", settings.getBackgroundImagePath());
    }

    @Test
    void testSetMessage() {
        // Test setting message
        Settings settings = new Settings(new Model());
        settings.setMessage("This is a test message");
        assertEquals("This is a test message", settings.getMessage());
    }

    @Test
    void testSetMessageSpeed() {
        // Test setting message speed
        Settings settings = new Settings(new Model());
        settings.setMessageSpeed(15);
        assertEquals(15, settings.getMessageSpeed());
    }
}
