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
	* It tests the case when all the text fields are filled.
	*/
	@Test
	void testSaveData_AllFilled() {
		Main main = new Main();
		main.pqrFile1.setText("pqrFile1");
		main.pqrFile2.setText("pqrFile2");
		main.gridDimx.setText("1");
		main.gridDimy.setText("2");
		main.gridDimz.setText("3");
		main.gridLen1a.setText("4");
		main.gridLen2a.setText("5");
		main.gridLen3a.setText("6");
		main.gridLen1b.setText("7");
		main.gridLen2b.setText("8");
		main.gridLen3b.setText("9");
		main.gridLen1c.setText("10");
		main.gridLen2c.setText("11");
		main.gridLen3c.setText("12");
		main.countIon1Charge.setText("13");
		main.countIon1Con.setText("14");
		main.countIon1Sz.setText("15");
		main.countIon2Charge.setText("16");
		main.countIon2Con.setText("17");
		main.countIon2Sz.setText("18");
		main.proteinDi.setText("19");
		main.solventDi.setText("20");
		main.srad.setText("21");
		main.sdens.setText("22");
		main.temp.setText("23");
		main.calcTypeCombo.setSelectedIndex(0);
		main.potential.setText("24");
		main.Lmem.setText("25");
		main.zmem.setText("26");
		main.membraneDi.setText("27");
		main.idie.setText("28");
		main.geoFactor1.setText("29");
		main.geoFactor2.setText("30");
		main.geoFactor3.setText("31");
		main.drawPot.setSelected(true);
		main.boundaryCondCombo.setSelectedIndex(0);
		main.solMethodCombo.setSelectedIndex(0);
		main.centerCombo.setSelectedIndex(0);
		main.maxfocus = 2;
		main.file_loaded = false;
		assertTrue(main.SaveData());
	}
	
	/**
	* Test case for {@link Main#SaveData()} method.
	* It tests the case when the text field pqrFile1 is empty.
	*/
	@Test
	void testSaveData_pqrFile1Empty() {
		Main main = new Main();
		main.pqrFile1.setText("");
		main.pqrFile2.setText("pqrFile2");
		main.gridDimx.setText("1");
		main.gridDimy.setText("2");
		main.gridDimz.setText("3");
		main.gridLen1a.setText("4");
		main.gridLen2a.setText("5");
		main.gridLen3a.setText("6");
		main.gridLen1b.setText("7");
		main.gridLen2b.setText("8");
		main.gridLen3b.setText("9");
		main.gridLen1c.setText("10");
		main.gridLen2c.setText("11");
		main.gridLen3c.setText("12");
		main.countIon1Charge.setText("13");
		main.countIon1Con.setText("14");
		main.countIon1Sz.setText("15");
		main.countIon2Charge.setText("16");
		main.countIon2Con.setText("17");
		main.countIon2Sz.setText("18");
		main.proteinDi.setText("19");
		main.solventDi.setText("20");
		main.srad.setText("21");
		main.sdens.setText("22");
		main.temp.setText("23");
		main.calcTypeCombo.setSelectedIndex(0);
		main.potential.setText("24");
		main.Lmem.setText("25");
		main.zmem.setText("26");
		main.membraneDi.setText("27");
		main.idie.setText("28");
		main.geoFactor1.setText("29");
		main.geoFactor2.setText("30");
		main.geoFactor3.setText("31");
		main.drawPot.setSelected(true);
		main.boundaryCondCombo.setSelectedIndex(0);
		main.solMethodCombo.setSelectedIndex(0);
		main.centerCombo.setSelectedIndex(0);
		main.maxfocus = 2;
		main.file_loaded = false;
		assertFalse(main.SaveData());
	}
	
	/**
	* Test case for {@link Main#SaveData()} method.
	* It tests the case when the text field pqrFile1 is null.
	*/
	@Test
	void testSaveData_pqrFile1Null() {
		Main main = new Main();
		main.pqrFile1.setText(null);
		main.pqrFile2.setText("pqrFile2");
		main.gridDimx.setText("1");
		main.gridDimy.setText("2");
		main.gridDimz.setText("3");
		main.gridLen1a.setText("4");
		main.gridLen2a.setText("5");
		main.gridLen3a.setText("6");
		main.gridLen1b.setText("7");
		main.gridLen2b.setText("8");
		main.gridLen3b.setText("9");
		main.gridLen1c.setText("10");
		main.gridLen2c.setText("11");
		main.gridLen3c.setText("12");
		main.countIon1Charge.setText("13");
		main.countIon1Con.setText("14");
		main.countIon1Sz.setText("15");
		main.countIon2Charge.setText("16");
		main.countIon2Con.setText("17");
		main.countIon2Sz.setText("18");
		main.proteinDi.setText("19");
		main.solventDi.setText("20");
		main.srad.setText("21");
		main.sdens.setText("22");
		main.temp.setText("23");
		main.calcTypeCombo.setSelectedIndex(0);
		main.potential.setText("24");
		main.Lmem.setText("25");
		main.zmem.setText("26");
		main.membraneDi.setText("27");
		main.idie.setText("28");
		main.geoFactor1.setText("29");
		main.geoFactor2.setText("30");
		main.geoFactor3.setText("31");
		main.drawPot.setSelected(true);
		main.boundaryCondCombo.setSelectedIndex(0);
		main.solMethodCombo.setSelectedIndex(0);
		main.centerCombo.setSelectedIndex(0);
		main.maxfocus = 2;
		main.file_loaded = false;
		assertFalse(main.SaveData());
	}
	
	/**
	* Test case for {@link Main#SaveData()} method.
	* It tests the case when the text field gridDimx is empty.
	*/
	@Test
	void testSaveData_gridDimxEmpty() {
		Main main = new Main();
		main.pqrFile1.setText("pqrFile1");
		main.pqrFile2.setText("pqrFile2");
		main.gridDimx.setText("");
		main.gridDimy.setText("2");
		main.gridDimz.setText("3");
		main.gridLen1a.setText("4");
		main.gridLen2a.setText("5");
		main.gridLen3a.setText("6");
		main.gridLen1b.setText("7");
		main.gridLen2b.setText("8");
		main.gridLen3b.setText("9");
		main.gridLen1c.setText("10");
		main.gridLen2c.setText("11");
		main.gridLen3c.setText("12");
		main.countIon1Charge.setText("13");
		main.countIon1Con.setText("14");
		main.countIon1Sz.setText("15");
		main.countIon2Charge.setText("16");
		main.countIon2Con.setText("17");
		main.countIon2Sz.setText("18");
		main.proteinDi.setText("19");
		main.solventDi.setText("20");
		main.srad.setText("21");
		main.sdens.setText("22");
		main.temp.setText("23");
		main.calcTypeCombo.setSelectedIndex(0);
		main.potential.setText("24");
		main.Lmem.setText("25");
		main.zmem.setText("26");
		main.membraneDi.setText("27");
		main.idie.setText("28");
		main.geoFactor1.setText("29");
		main.geoFactor2.setText("30");
		main.geoFactor3.setText("31");
		main.drawPot.setSelected(true);
		main.boundaryCondCombo.setSelectedIndex(0);
		main.solMethodCombo.setSelectedIndex(0);
		main.centerCombo.setSelectedIndex(0);
		main.maxfocus = 2;
		main.file_loaded = false;
		assertFalse(main.SaveData());
	}
	
	/**
	* Test case for {@link Main#SaveData()} method.
	* It tests the case when the text field gridDimx is null.
	*/
	@Test
	void testSaveData_gridDimxNull() {
		Main main = new Main();
		main.pqrFile1.setText("pqrFile1");
		main.pqrFile2.setText("pqrFile2");
		main.gridDimx.setText(null);
		main.gridDimy.setText("2");
		main.gridDimz.setText("3");
		main.gridLen1a.setText("4");
		main.gridLen2a.setText("5");
		main.gridLen3a.setText("6");
		main.gridLen1b.setText("7");
		main.gridLen2b.setText("8");
		main.gridLen3b.setText("9");
		main.gridLen1c.setText("10");
		main.gridLen2c.setText("11");
		main.gridLen3c.setText("12");
		main.countIon1Charge.setText("13");
		main.countIon1Con.setText("14");
		main.countIon1Sz.setText("15");
		main.countIon2Charge.setText("16");
		main.countIon2Con.setText("17");
		main.countIon2Sz.setText("18");
		main.proteinDi.setText("19");
		main.solventDi.setText("20");
		main.srad.setText("21");
		main.sdens.setText("22");
		main.temp.setText("23");
		main.calcTypeCombo.setSelectedIndex(0);
		main.potential.setText("24");
		main.Lmem.setText("25");
		main.zmem.setText("26");
		main.membraneDi.setText("27");
		main.idie.setText("28");
		main.geoFactor1.setText("29");
		main.geoFactor2.setText("30");
		main.geoFactor3.setText("31");
		main.drawPot.setSelected(true);
		main.boundaryCondCombo.setSelectedIndex(0);
		main.solMethodCombo.setSelectedIndex(0);
		main.centerCombo.setSelectedIndex(0);
		main.maxfocus = 2;
		main.file_loaded = false;
		assertFalse(main.SaveData());
	}
	
	/**
	* Test case for {@link Main#SaveData()} method.
	* It tests the case when the text field gridDimy is empty.
	*/
	@Test
	void testSaveData_gridDimyEmpty() {
		Main main = new Main();
		main.pqrFile1.setText("pqrFile1");
		main.pqrFile2.setText("pqrFile2");
		main.gridDimx.setText("1");
		main.gridDimy.setText("");
		main.gridDimz.setText("3");
		main.gridLen1a.setText("4");
		main.gridLen2a.setText("5");
		main.gridLen3a.setText("6");
		main.gridLen1b.setText("7");
		main.gridLen2b.setText("8");
		main.gridLen3b.setText("9");
		main.gridLen1c.setText("10");
		main.gridLen2c.setText("11");
		main.gridLen3c.setText("12");
		main.countIon1Charge.setText("13");
		main.countIon1Con.setText("14");
		main.countIon1Sz.setText("15");
		main.countIon2Charge.setText("16");
		main.countIon2Con.setText("17");
		main.countIon2Sz.setText("18");
		main.proteinDi.setText("19");
		main.solventDi.setText("20");
		main.srad.setText("21");
		main.sdens.setText("22");
		main.temp.setText("23");
		main.calcTypeCombo.setSelectedIndex(0);
		main.potential.setText("24");
		main.Lmem.setText("25");
		main.zmem.setText("26");
		main.membraneDi.setText("27");
		main.idie.setText("28");
		main.geoFactor1.setText("29");
		main.geoFactor2.setText("30");
		main.geoFactor3.setText("31");
		main.drawPot.setSelected(true);
		main.boundaryCondCombo.setSelectedIndex(0);
		main.solMethodCom