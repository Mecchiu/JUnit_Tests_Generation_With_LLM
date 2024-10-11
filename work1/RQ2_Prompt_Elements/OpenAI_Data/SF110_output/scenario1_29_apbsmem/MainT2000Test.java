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
		* It tests the case when all the fields are filled.
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
				assertTrue(main.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when pqrFile1 is not filled.
		*/
		@Test
		void testSaveData_pqrFile1NotFilled() {
				Main main = new Main();
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
				assertFalse(main.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when pqrFile2 is not filled.
		*/
		@Test
		void testSaveData_pqrFile2NotFilled() {
				Main main = new Main();
				main.pqrFile1.setText("pqrFile1");
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
				main.countIon1Con.set