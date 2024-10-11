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
	void testSettingsExists() {
		try {
			File settingsFolder = SettingsTest.class.getClassLoader().getResource(SETTINGS_FOLDER).getFile();
			File settings = new File(settingsFolder, DOM_SETTINGS_ROOT);
			if (!settings.exists()) {
				settings.mkdirs();
			}
			
			SettingsModel model = new SettingsModel(settings);
			assertNotNull(model);
			assertEquals(true, model.create());
			

		}
		catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	void testSave() {
		
		SettingsModel m = new SettingsModel(new File(SettingsTest.class.getResource(SETTINGS_FOLDER).getFile()));
		assertNotNull(m);
		assertEquals(true, m.create());
		
		try {
			m.save();
		} catch (Exception e) {
			// nothing, so we just want to go on.
			
		}
	}
 
	@Test
	void testOpen() throws IOException {
		
	}
	

	@Test
	void testGetTimeInterval() {
		
	}
	
	@Test
	void testGetPriceSteps() {
		
		SettingsModel m = null;
		m = new SettingsModel(new File(SettingsTest.class.getResource(SETTINGS_FOLDER).getFile()));
		assertEquals(true, m.create());
		SettingsModel model = m;
		model.save();
		
		
		m = new SettingsModel(new File(SettingsTest.class.getResource(SETTINGS_FOLDER).getFile()));
		assertNotNull(model);
		assertEquals(true, model.create());
		
		
		m = new SettingsModel("settings");
		assertNotNull(model);
		assertEquals(true, model.create());
		
	}
	
	@Test
	void testGetCurrency() {
		SettingsModel model = new SettingsModel(new File(SettingsTest.class.getResource(SETTINGS_FOLDER).getFile()));
		assertNotNull(model);
		assertEquals(true, model.create());
		
		String result = model.getCurrency();
		System.out.println("\nGet Currency: "+result);

		assertNotEquals(false, result.equals(JT400Constants.CURRENCY));
	}

	@Test
	void testIsShowStandardLogic() {
		SettingsModel.setStandardLogic(true);
		SettingsModel m = new SettingsModel(new  File(SettingsTest.class.getResource(SETTINGS_FOLDER).getFile()));
		assertEquals(true, m.isShowStandardLogic());
		
		SettingsModel.setStandardLogic(false);
		SettingsModel m2 = new SettingsModel(new  File(SettingsTest.class.getResource(SETTINGS_FOLDER).getFile()));
		assertEquals(false, m2.isShowStandardLogic());
		
	}
	
	@Test
	void testIsBackgoundImg() throws IOException {
		
	}

	@Test
	void testGetBackgroundImagePath() {
		Map<String, Object> root = new java.util.HashMap<String, Object>(2, 0.75f);
		root.put("backgroundImagePath", "settingsbackground");
	
		SettingsModel m = new SettingsModel(new  File(SettingsTest.class.getResource(SETTINGS_FOLDER).getFile()),root);
		m.save();
		
		File settingsDir = new File(SETTINGS_FOLDER);
		File modelDir = new File(SettingsTest.class.getResource(SETTINGS_FOLDER).getFile().substring(0, SETTINGS_FOLDER.length()));
		File modelFile = new File(modelDir, SETTINGS_FOLDER+ DOM_SETTINGS_ROOT+DOM_MESSAGE);
		File dataDir = new File(modelDir + "/data");
		File settings = new File(settingsDir, DOM_MESSAGE);
		File dataFile = new File(dataDir, DATA_FILE);
		File targetDir = new File(settingsDir+ "/model");
		File imgDir = new File(targetDir, DOM_MESSAGE_SPEED);
		File imgSettings = new File(imgDir, DOM_MESSAGE_SPEED + ".settings");
		
		assertEquals(true, new File(settings.getParentFile(), "data").exists());
		assertFileHasContent("Settings",settings);
		assertFileHasContent("Model",modelFile);
		assertFileHasContent("Background Image",settingsFile);
		
		m.load();
		
		assertEquals("Data File",dataFile.getName()); //modelFile.getName());
//		assertEquals("Data Settings",imgSettings.getName());  
		assertEquals(settingsFile.getName(), imgSettings.get