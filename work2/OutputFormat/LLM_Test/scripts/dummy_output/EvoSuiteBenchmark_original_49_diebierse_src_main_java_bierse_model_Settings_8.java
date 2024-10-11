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
  * Verify if file saving is called correctly during setting.
  */
    @Test
    void saveFailsForInvalidSettings() throws IOException{
        String invalidSetting = "Invalid setting";
        File f = new File(SETTINGS_FOLDER, invalidSetting);
        assertEquals(f.createNewFile(), false);

    }
    
 /**
  * Verify setting of time interval and price steps in configuration.
  */
  @Test
  void saveConfigure() throws IOException, IllegalArgumentException{
    setUp();
    File f = getFile();
				 
    this.model.saveSettings();
    File newf = getFile();
    
    assertEquals(newf, f);
		
    // Check model after setting
		
    assertNotEquals(model.getTimeInterval(), timeInterval);
    assertEquals(model.getPriceSteps(), priceSteps);
    assertEquals("�" + currency, model.getCurrency());
		
    // Check file content
    SAXBuilder builder = new SAXBuilder();
    Document doc = builder.build(newf);
    
    assertEquals(documentContent("settings" + fileSeparator, documentElement(doc)), documentContent("settings" + fileSeparator, documentElement(doc)));
	
  }
 
 /**
  * Check if file was saved properly without exceptions.
  */
  @Test
  void check() throws IOException{
   this.model.saved.get();
   assertEquals(0, model.saved.get());
  }
 
 /**
  * Check if file was saved properly.
  */
  @SuppressWarnings( {"unchecked"})
  private File getFile() throws IOException{
	   File f = new File(SETTINGS_FOLDER, "settings" + fileSeparator + DOM_TIME_INTERVAL + fileSeparator + DOM_PRICE_STEPS);
	   
	   if ("".equals(backgroundImagePath)) {
		   f = new File(SETTINGS_FOLDER + "settings" + fileSeparator + DOM_TIME_INTERVAL + fileSeparator + DOM_PRICE_STEPS);
		   if (!f.exists()) {
			   f = new File(SETTINGS_FOLDER + DOM_TIME_INTERVAL + fileSeparator + DOM_PRICE_STEPS);
		   }
	   }
		
	   return f;
  }
 
 /**
  * Check file content
  */
  private String documentContent(String testFile, Element element) throws IOException{
		
   File f = new File(SETTINGS_FOLDER, testFile);
   Document doc = XMLOutputter.outputString(documentBuilder().build(f), true);
       
	   SAXBuilder builder = new SAXBuilder();
	   System.out.println("document is: " + doc.getRootElement().getName());
		
	   return builder.outputString(doc);
  }
 
/**
  *  Check that XML builder is used with the correct arguments.
  */
  private DocumentBuilder documentBuilder() {
    return new SAXBuilder();
  }



    @Test
    void XMLPersistence() throws IOException{
        String path = Model.CONFIG_FOLDER + "settings/" + DOM_SETTINGS_ROOT;
        Document doc = DocumentFactory.createTestDoc(path);
        Element root = doc.getRootElement();
        assertNull(root.getAttribute("title"));
        Element element1 = root.getChild("section1");
        assertEquals("settings" + fileSeparator + "title", element1.getName());
        Element element2 = root.getChild("section2");
        assertEquals("settings" + fileSeparator + "title", element2.getName());

        assertEquals(Settings.SETTINGS_FOLDER, Paths.POP_FOLDER.getAbsolutePath());
        assertNull(Settings.getFileContent(Paths.POP_FOLDER));

        Settings settings = new Settings(Model.load(Settings.class));
        
        documentContent("settings" + fileSeparator + "title", element1);
        documentContent("settings" + fileSeparator + "title", element2);
        assertEquals(path.substring(path.lastIndexOf(fileSeparator)), settings.getFileContent(Paths.POP_FOLDER));
    }
}