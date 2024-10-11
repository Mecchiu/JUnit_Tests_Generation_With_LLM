// Menu_1Test.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Menu}.
 * It contains ten unit test cases for the {@link Menu#createXML()} method.
 */
class Menu_1Test {

    /**
     * Test case to check if createXML() method returns true when xml file is created successfully.
     */
    @Test
    void testCreateXMLSuccess() {
        Menu menu = new Menu("Test DVD", "test.xml", true, null);
        assertTrue(menu.createXML());
    }

    /**
     * Test case to check if createXML() method returns false when xml file creation fails.
     */
    @Test
    void testCreateXMLFail() {
        Menu menu = new Menu("Test DVD", "invalid/path/test.xml", true, null);
        assertFalse(menu.createXML());
    }

    /**
     * Test case to check if createXML() method returns false when title is null.
     */
    @Test
    void testCreateXMLNullTitle() {
        Menu menu = new Menu(null, "test.xml", true, null);
        assertFalse(menu.createXML());
    }

    /**
     * Test case to check if createXML() method returns false when xml file path is null.
     */
    @Test
    void testCreateXMLNullXMLPath() {
        Menu menu = new Menu("Test DVD", null, true, null);
        assertFalse(menu.createXML());
    }

    /**
     * Test case to check if createXML() method returns false when video files array is null.
     */
    @Test
    void testCreateXMLNullVideoFiles() {
        Menu menu = new Menu("Test DVD", "test.xml", true, null);
        menu.setVideoFiles(null);
        assertFalse(menu.createXML());
    }

    /**
     * Test case to check if createXML() method returns false when video files array is empty.
     */
    @Test
    void testCreateXMLEmptyVideoFiles() {
        Menu menu = new Menu("Test DVD", "test.xml", true, null);
        menu.setVideoFiles(new String[0]);
        assertFalse(menu.createXML());
    }

    /**
     * Test case to check if createXML() method returns false when PAL menu is false and video format is NTSC.
     */
    @Test
    void testCreateXMLInvalidPAL() {
        Menu menu = new Menu("Test DVD", "test.xml", false, null);
        menu.setVideoFiles(new String[]{"video1.mpg", "video2.mpg"});
        assertFalse(menu.createXML());
    }

    /**
     * Test case to check if createXML() method returns false when title file path is invalid.
     */
    @Test
    void testCreateXMLInvalidTitleFile() {
        Menu menu = new Menu("Test DVD", "test.xml", true, null);
        menu.setTitleFilePath("invalid/path/titles.txt");
        assertFalse(menu.createXML());
    }

    /**
     * Test case to check if createXML() method returns false when background picture path is invalid.
     */
    @Test
    void testCreateXMLInvalidPicPath() {
        Menu menu = new Menu("Test DVD", "invalid/path/pic.jpg", "audio.mp3", "test.xml", true, null);
        assertFalse(menu.createXML());
    }

    /**
     * Test case to check if createXML() method returns false when background audio path is invalid.
     */
    @Test
    void testCreateXMLInvalidAudioPath() {
        Menu menu = new Menu("Test DVD", "pic.jpg", "invalid/path/audio.mp3", "test.xml", true, null);
        assertFalse(menu.createXML());
    }

    /**
     * Test case to check if createXML() method returns false when dvd-menu command fails.
     */
    @Test
    void testCreateXMLInvalidDVDMenu() {
        Menu menu = new Menu("Test DVD", "test.xml", true, null);
        menu.setDvdMenuCommand("invalid-command");
        assertFalse(menu.createXML());
    }
}