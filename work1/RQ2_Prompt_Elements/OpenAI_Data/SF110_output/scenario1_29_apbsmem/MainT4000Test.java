// MainTest.java
package apbs_mem_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import com.jgoodies.forms.layout.*;
import com.jgoodies.forms.builder.*;
import org.jmol.api.JmolViewer;
import org.jmol.api.JmolAdapter;
import org.jmol.popup.JmolPopup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#SaveData()} method.
*/
class MainTest {

		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when all the input fields are filled.
		*/
		@Test
		void testSaveData_AllFieldsFilled() {
				Main main = new Main();
				main.pqrFile1.setText("pqrFile1");
				main.pqrFile2.setText("pqrFile2");
				main.gridDimx.setText("gridDimx");
				main.gridDimy.setText("gridDimy");
				main.gridDimz.setText("gridDimz");
				main.gridLen1a.setText("gridLen1a");
				main.gridLen2a.setText("gridLen2a");
				main.gridLen3a.setText("gridLen3a");
				main.gridLen1b.setText("gridLen1b");
				main.gridLen2b.setText("gridLen2b");
				main.gridLen3b.setText("gridLen3b");
				main.gridLen1c.setText("gridLen1c");
				main.gridLen2c.setText("gridLen2c");
				main.gridLen3c.setText("gridLen3c");
				main.countIon1Charge.setText("countIon1Charge");
				main.countIon1Con.setText("countIon1Con");
				main.countIon1Sz.setText("countIon1Sz");
				main.countIon2Charge.setText("countIon2Charge");
				main.countIon2Con.setText("countIon2Con");
				main.countIon2Sz.setText("countIon2Sz");
				main.proteinDi.setText("proteinDi");
				main.solventDi.setText("solventDi");
				main.srad.setText("srad");
				main.sdens.setText("sdens");
				main.temp.setText("temp");
				main.calcTypeCombo.setSelectedIndex(0);
				main.potential.setText("potential");
				main.Lmem.setText("Lmem");
				main.zmem.setText("zmem");
				main.membraneDi.setText("membraneDi");
				main.idie.setText("idie");
				main.geoFactor1.setText("geoFactor1");
				main.geoFactor2.setText("geoFactor2");
				main.geoFactor3.setText("geoFactor3");
				main.drawPot.setSelected(true);
				main.boundaryCondCombo.setSelectedIndex(0);
				main.solMethodCombo.setSelectedIndex(0);
				main.centerCombo.setSelectedIndex(0);
				main.file_loaded = true;
				main.maxfocus = 2;
				assertTrue(main.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the input fields are not filled.
		*/
		@Test
		void testSaveData_FieldsNotFilled() {
				Main main = new Main();
				main.pqrFile1.setText("");
				main.pqrFile2.setText("");
				main.gridDimx.setText("");
				main.gridDimy.setText("");
				main.gridDimz.setText("");
				main.gridLen1a.setText("");
				main.gridLen2a.setText("");
				main.gridLen3a.setText("");
				main.gridLen1b.setText("");
				main.gridLen2b.setText("");
				main.gridLen3b.setText("");
				main.gridLen1c.setText("");
				main.gridLen2c.setText("");
				main.gridLen3c.setText("");
				main.countIon1Charge.setText("");
				main.countIon1Con.setText("");
				main.countIon1Sz.setText("");
				main.countIon2Charge.setText("");
				main.countIon2Con.setText("");
				main.countIon2Sz.setText("");
				main.proteinDi.setText("");
				main.solventDi.setText("");
				main.srad.setText("");
				main.sdens.setText("");
				main.temp.setText("");
				main.calcTypeCombo.setSelectedIndex(0);
				main.potential.setText("");
				main.Lmem.setText("");
				main.zmem.setText("");
				main.membraneDi.setText("");
				main.idie.setText("");
				main.geoFactor1.setText("");
				main.geoFactor2.setText("");
				main.geoFactor3.setText("");
				main.drawPot.setSelected(true);
				main.boundaryCondCombo.setSelectedIndex(0);
				main.solMethodCombo.setSelectedIndex(0);
				main.centerCombo.setSelectedIndex(0);
				main.file_loaded = true;
				main.maxfocus = 2;
				assertFalse(main.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the input fields are not filled and the file is not loaded.
		*/
		@Test
		void testSaveData_FieldsNotFilled_FileNotLoaded() {
				Main main = new Main();
				main.pqrFile1.setText("");
				main.pqrFile2.setText("");
				main.gridDimx.setText("");
				main.gridDimy.setText("");
				main.gridDimz.setText("");
				main.gridLen1a.setText("");
				main.gridLen2a.setText("");
				main.gridLen3a.setText("");
				main.gridLen1b.setText("");
				main.gridLen2b.setText("");
				main.gridLen3b.setText("");
				main.gridLen1c.setText("");
				main.gridLen2c.setText("");
				main.gridLen3c.setText("");
				main.countIon1Charge.setText("");
				main.countIon1Con.setText("");
				main.countIon1Sz.setText("");
				main.countIon2Charge.setText("");
				main.countIon2Con.setText("");
				main.countIon2Sz.setText("");
				main.proteinDi.setText("");
				main.solventDi.setText("");
				main.srad.setText("");
				main.sdens.setText("");
				main.temp.setText("");
				main.calcTypeCombo.setSelectedIndex(0);
				main.potential.setText("");
				main.Lmem.setText("");
				main.zmem.setText("");
				main.membraneDi.setText("");
				main.idie.setText("");
				main.geoFactor1.setText("");
				main.geoFactor2.setText("");
				main.geoFactor3.setText("");
				main.drawPot.setSelected(true);
				main.boundaryCondCombo.setSelectedIndex(0);
				main.solMethodCombo.setSelectedIndex(0);
				main.centerCombo.setSelectedIndex(0);
				main.file_loaded = false;
				main.maxfocus = 2;
				assertTrue(main.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the input fields are not filled and the file is not loaded and maxfocus is 0.
		*/
		@Test
		void testSaveData_FieldsNotFilled_FileNotLoaded_MaxFocus0() {
				Main main = new Main();
				main.pqrFile1.setText("");
				main.pqrFile2.setText("");
				main.gridDimx.setText("");
				main.gridDimy.setText("");
				main.gridDimz.setText("");
				main.gridLen1a.setText("");
				main.gridLen2a.setText("");
				main.gridLen3a.setText("");
				main.gridLen1b.setText("");
				main.gridLen2b.setText("");
				main.gridLen3b.setText("");
				main.gridLen1c.setText("");
				main.gridLen2c.setText("");
				main.gridLen3c.setText("");
				main.countIon1Charge.setText("");
				main.countIon1Con.setText("");
				main.countIon1Sz.setText("");
				main.countIon2Charge.setText("");
				main.countIon2Con.setText("");
				main.countIon2Sz.setText("");
				main.proteinDi.setText("");
				main.solventDi.setText("");
				main.srad.setText("");
				main.sdens.setText("");
				main.temp.setText("");
				main.calcTypeCombo.setSelectedIndex(0);
				main.potential.setText("");
				main.Lmem.setText("");
				main.zmem.setText("");
				main.membraneDi.setText("");
				main.idie.setText("");
				main.geoFactor1.setText("");
				main.geoFactor2.setText("");
				main.geoFactor3.setText("");
				main.drawPot.setSelected(true);
				main.boundaryCondCombo.setSelectedIndex(0);
				main.solMethodCombo.setSelectedIndex(0);
				main.centerCombo.setSelectedIndex(0);
				main.file_loaded = false;
				main.maxfocus = 0;
				assertTrue(main.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the input fields are not filled and the file is not loaded and maxfocus is 1.
		*/
		@Test
		void testSaveData_FieldsNotFilled_FileNotLoaded_MaxFocus1() {
				Main main = new Main();
				main.pqrFile1.setText("");
				main.pqrFile2.setText("");
				main.gridDimx.setText("");
				main.gridDimy.setText("");
				main.gridDimz.setText("");
				main.gridLen1a.setText("");
				main.gridLen2a.setText("");
				main.gridLen3a.setText("");
				main.gridLen1b.setText("");
				main.gridLen2b.setText("");
				main.gridLen3b.setText("");
				main.gridLen1c.setText("");
				main.gridLen2c.setText("");
				main.gridLen3c.setText("");
				main.countIon1Charge.setText("");
				main.countIon1Con.setText("");
				main.countIon1Sz.setText("");
				main.countIon2Charge.setText("");
				main.countIon2Con.setText("");
				main.countIon2Sz.setText("");
				main.proteinDi.setText("");
				main.solventDi.setText("");
				main.srad.setText("");
				main.sdens.setText("");
				main.temp.setText("");
				main.calcTypeCombo.setSelectedIndex(0);
				main.potential.setText("");
				main.Lmem.setText("");
				main.zmem.setText("");
				main.membraneDi.setText("");
				main.idie.setText("");
				main.geoFactor1.setText("");
				main.geoFactor2.setText("");
				main.geoFactor3.setText("");
				main.drawPot.setSelected(true);
				main.boundaryCondCombo.setSelectedIndex(0);
				main.solMethodCombo.setSelectedIndex(0);
				main.centerCombo.setSelectedIndex(0);
				main.file_loaded = false;
				main.maxfocus = 1;
				assertTrue(main.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the input fields are not filled and the file is not loaded and maxfocus is 2.
		*/
		@Test
		void testSaveData_FieldsNotFilled_FileNotLoaded_MaxFocus2() {
				Main main = new Main();
				main.pqrFile1.setText("");
				main.pqrFile2.setText("");
				main.gridDimx.setText("");
				main.gridDimy.setText("");
				main.gridDimz.setText("");
				main.gridLen1a.setText("");