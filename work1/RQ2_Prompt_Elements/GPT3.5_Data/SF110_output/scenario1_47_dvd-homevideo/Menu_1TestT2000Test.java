// Menu_1Test.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;

/**
 * Test class of {@link Menu}.
 * It contains ten unit test cases for the {@link Menu#createXML()} method.
 */
class Menu_1Test {

    /**
     * Test case for creating an XML file with default titles.
     * Expected result: The XML file should be created without errors.
     */
    @Test
    void testCreateXMLWithDefaultTitles() {
        Menu menu = new Menu();
        menu.m_GUI.strOutputDir = "test_output";
        menu.titles = new String[1];
        boolean result = menu.createXML();
        File xmlFile = new File("test_output/vmgm.xml");
        assertTrue(xmlFile.exists());
        assertFalse(result);
    }

    /**
     * Test case for creating an XML file with custom titles.
     * Expected result: The XML file should be created without errors.
     */
    @Test
    void testCreateXMLWithCustomTitles() {
        Menu menu = new Menu();
        menu.m_GUI.strOutputDir = "test_output";
        menu.titles = new String[]{"Title 1", "Title 2", "Title 3"};
        boolean result = menu.createXML();
        File xmlFile = new File("test_output/vmgm.xml");
        assertTrue(xmlFile.exists());
        assertFalse(result);
    }

    /**
     * Test case for creating an XML file with no video files.
     * Expected result: The XML file should be created without errors.
     */
    @Test
    void testCreateXMLWithNoVideoFiles() {
        Menu menu = new Menu();
        menu.m_GUI.strOutputDir = "test_output";
        menu.video_files = new String[0];
        boolean result = menu.createXML();
        File xmlFile = new File("test_output/vmgm.xml");
        assertTrue(xmlFile.exists());
        assertFalse(result);
    }

    /**
     * Test case for creating an XML file with a menu.vob file.
     * Expected result: The XML file should be created without errors.
     */
    @Test
    void testCreateXMLWithMenuVobFile() {
        Menu menu = new Menu();
        menu.m_GUI.strOutputDir = "test_output";
        menu.video_files = new String[]{"video1.vob", "video2.vob"};
        File menuVobFile = new File("test_output/menu.vob");
        try {
            menuVobFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean result = menu.createXML();
        File xmlFile = new File("test_output/vmgm.xml");
        assertTrue(xmlFile.exists());
        assertFalse(result);
        menuVobFile.delete();
    }

    /**
     * Test case for creating an XML file with an IOException.
     * Expected result: The method should return true.
     */
    @Test
    void testCreateXMLWithIOException() {
        Menu menu = new Menu();
        menu.m_GUI.strOutputDir = "test_output";
        menu.titles = new String[1];
        boolean result = menu.createXML();
        assertTrue(result);
    }

    /**
     * Test case for creating an XML file with a null GUI object.
     * Expected result: The method should return true.
     */
    @Test
    void testCreateXMLWithNullGUI() {
        Menu menu = new Menu();
        menu.m_GUI = null;
        menu.titles = new String[1];
        boolean result = menu.createXML();
        assertTrue(result);
    }

    /**
     * Test case for creating an XML file with null titles.
     * Expected result: The XML file should be created without errors.
     */
    @Test
    void testCreateXMLWithNullTitles() {
        Menu menu = new Menu();
        menu.m_GUI.strOutputDir = "test_output";
        menu.titles = null;
        boolean result = menu.createXML();
        File xmlFile = new File("test_output/vmgm.xml");
        assertTrue(xmlFile.exists());
        assertFalse(result);
    }

    /**
     * Test case for creating an XML file with a null video files array.
     * Expected result: The XML file should be created without errors.
     */
    @Test
    void testCreateXMLWithNullVideoFiles() {
        Menu menu = new Menu();
        menu.m_GUI.strOutputDir = "test_output";
        menu.video_files = null;
        boolean result = menu.createXML();
        File xmlFile = new File("test_output/vmgm.xml");
        assertTrue(xmlFile.exists());
        assertFalse(result);
    }

    /**
     * Test case for creating an XML file with an empty output directory.
     * Expected result: The method should return true.
     */
    @Test
    void testCreateXMLWithEmptyOutputDirectory() {
        Menu menu = new Menu();
        menu.m_GUI.strOutputDir = "";
        menu.titles = new String[1];
        boolean result = menu.createXML();
        assertTrue(result);
    }

    /**
     * Test case for creating an XML file with a null output directory.
     * Expected result: The method should return true.
     */
    @Test
    void testCreateXMLWithNullOutputDirectory() {
        Menu menu = new Menu();
        menu.m_GUI.strOutputDir = null;
        menu.titles = new String[1];
        boolean result = menu.createXML();
        assertTrue(result);
    }
}