// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains one unit test case for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
		String html;
		String pref;
		String pref2;
		HttpAnalyzerView analyseView;

		/**
		 * Test if the method works correctly
		 * @throws Exception
		 */
		@Test
		public void testLoadPreference() throws Exception {
			Properties prop = new Properties();

			// We can't use a non-empty text field, because HttpPreference cannot open it's text field.
			// So we'll use the HTML text box and set the properties to contain 'note'.
			html = new String("pref");
			prop.put("html", html);
			// test if value gets loaded correctly

			// The second parameter of this method is the HTML text box's text field
			prop.remove("html");
			prop.remove("html");
			// test if value gets loaded correctly

			// The third parameter of this method is the previous preferences text field's text field
			prop.remove("pref");
			prop.remove("pref");
			// test if value gets loaded correctly

			if (prop.equals(analysView.getConfig().getLastSave())) {
				/*
				 * Second parameter property must be cleared
				 */
				prop.remove("pref");
				prop.remove("pref");
				// test if the properties are loaded correctly
				prop.remove("html");
				prop.remove("title");
				prop.remove("note");

				prop.put("html", "note again");
				prop.put("pref2", "note again again");
				// test if the properties are loaded correctly
				prop.put("html", "note"); // set to value of HTML text box

				prop.clear();
				prop.put("html", "note again again again again again again twice");  // set to value of HTML text box again
				prop.remove("html");
				prop.remove("title");

				/*
				 * Second property must be cleared
				 */
				prop.put("pref2", "note again again again again again again again twice");
				prop.put("pref2", "note again again again again again twice again"); // set to value of PREFERENCE again

				prop.put("pref2", "pref2 again");
				prop.put("note again again again again again again three times");
				prop.put("note again again again again again again again again three times"); // set to value of PREFERENCE

				// test if the properties can't be loaded correctly. 
				prop.put("html", "#"); // clear the HTML text box and set new pref2 to html
				prop.remove("title");
				// value of the HTML text box again must be set to empty string, and set new pref2 to note
				prop.remove("note");
				prop.remove("note2");
				prop.clear();

				props2.put(analysView.getConfig().getName(), true);
				HttpAnalyzerViewMain.currentAnalyzeView = analyseView;
				String val = pref2;
				prop.put("pref",val);
				prop.put("pref2=".equals(val)? "" : "pref", val);
				String savePath = props2.get("prefPath");
				assertTrue(savePath!= null);
				prop.remove("pref2");
				prop.put("pref3", "test"); // set prefPath to pref3, because it is not defined in the Properties object
				prop.put("pref3","pref1"); // set prefPath to pref1 and pref3 == pref3, because pref3 < pref1
				String testProp = prop.getProperty("pref1").toString();
				prop.put("pref1", "pref1"); // set pref1 to pref1 and pref3 == pref3, because pref3 < pref1
				String testProp2 = prop.getProperty("pref3").toString();
				// the previous property must not be cleared
				assertTrue(testProp2!= null);
				// the property that value in the Properties object should be stored 
				assertEquals(prop.getProperty("pref3").toString(), testProp);
				// remove the Properties object from the Properties object
				prop.clear();
				prop.put("pref1", pref);
				prop.put("pref3", pref);
				prop.put("pref3", pref2);

				prop.put("pref3=pref3", pref2);
		}

		/**
		 * Test if the method works correctly
		 * Set to empty string again
		 * @throws Exception
		 */
		@Test
		public void testSavePreference() throws Exception {
			FileUtil.loadPreference(analysView, null);

			prop.put("pref1", "pref1 again");
			prop.put("pref1", "pref1"); // set pref1 to pref1 again
			prop.put("pref3", "pref3 again"); // set pref3 to pref3 again
			String savePath = props.get("prefPath");
			assertTrue(savePath!= null);
			String savePath2 = props.get("testSavePath");
			// test if the propert is set
			assertEquals(savePath, savePath2);
			// test if pref1 was set
			assertTrue(pref.equals(prop.getProperty("pref1")));
		}

		@Test
		public void testSavePref() throws Exception {
			FileUtil.loadPreferences(analysView);

			prop.put("pref1", "pref1"); // set pref1 to pref1 again
			prop.put("pref2", "pref2"); // set pref2 to pref2 again
			prop.put("pref1.testSavePath", "pref1");
			prop.put("testSavePath", "testSavePath");
			prop.put("testSavePath.pref1", "pref1.testSavePath");
			prop.put("testSavePath.pref1.pref1", "pref1.testSavePath.pref1");
			prop.remove("pref1.testSavePath");
			prop.remove("pref1");
			prop.remove("pref1.testSavePath");
			prop.put("pref1.testSavePath", "pref1.testSavePath");
			prop.add("prefs", "testSavePath2");
			prop.commit("savePrefs");
			// test if prefs is committed to the database
			assertFalse(prop.getProperty("prefs").equals(prop.getProperty("testSavePath2")));
			// if property value is set correctly, it must not be committed
			prop.add("prefs", "anotherSavePath2");
			prop.commit("savePrefs");
			// test if pref was committed to the database
			assertEquals(prop.getProperty("prefs"), prop.getProperty("anotherSavePath2"));
		}

		FileUtil.clearPrefs(analysView);

	}

}