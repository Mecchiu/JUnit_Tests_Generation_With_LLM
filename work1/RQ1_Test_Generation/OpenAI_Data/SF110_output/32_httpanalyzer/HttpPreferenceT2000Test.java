// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {

	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_1() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_2() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_3() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_4() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_5() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_6() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_7() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_8() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_9() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_10() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
}

// HttpFileUtils.java
/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 3, 29 June 2007
 * 
 * Copyright (C) 2010, vlad
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package httpanalyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author vlad
 */
public class HttpFileUtils {

    /**
     * Save properties to file
     * @param properties Properties
     * @param parentFrame JFrame
     */
    public void savePreferenceToFile(Properties properties, JFrame parentFrame) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setDialogTitle("Save preferences");
        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
        fileChooser.setFileFilter(new HttpFileFilter("properties", "Properties files"));
        int result = fileChooser.showSaveDialog(parentFrame);
