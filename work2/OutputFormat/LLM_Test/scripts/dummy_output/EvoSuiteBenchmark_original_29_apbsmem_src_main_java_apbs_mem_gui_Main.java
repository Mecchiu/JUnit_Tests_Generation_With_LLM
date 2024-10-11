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
		@Test
void testSaveDataEmptyFields() {
    Main main = new Main();
    main.pqrFile1.setText("");
    main.gridDimx.setText("");
    main.gridDimy.setText("");
    main.gridDimz.setText("");
    main.gridLen1a.setText("");
    main.gridLen2a.setText("");
    main.gridLen3a.setText("");
    main.countIon1Charge.setText("");
    main.countIon1Con.setText("");
    main.countIon1Sz.setText("");
    main.countIon2Charge.setText("");
    main.countIon2Con.setText("");
    main.countIon2Sz.setText("");
    main.proteinDi.setText("");
    main.solventDi.setText("");
    main.membraneDi.setText("");
    main.srad.setText("");
    main.sdens.setText("");
    main.temp.setText("");
    assertFalse(main.SaveData());
}

@Test
void testSaveDataMissingFieldsForFocus1() {
    Main main = new Main();
    main.pqrFile1.setText("protein.pqr");
    main.gridDimx.setText("97");
    main.gridDimy.setText("97");
    main.gridDimz.setText("97");
    main.gridLen1a.setText("300");
    main.gridLen2a.setText("300");
    main.gridLen3a.setText("300");
    main.countIon1Charge.setText("1.0");
    main.countIon1Con.setText("0.1");
    main.countIon1Sz.setText("2.0");
    main.gridLen1b.setText("");
    main.gridLen2b.setText("");
    main.gridLen3b.setText("");
    assertFalse(main.SaveData());
}

@Test
void testSaveDataMissingFieldsForFocus2() {
    Main main = new Main();
    main.pqrFile1.setText("protein.pqr");
    main.gridDimx.setText("97");
    main.gridDimy.setText("97");
    main.gridDimz.setText("97");
    main.gridLen1a.setText("300");
    main.gridLen2a.setText("300");
    main.gridLen3a.setText("300");
    main.countIon1Charge.setText("1.0");
    main.countIon1Con.setText("0.1");
    main.countIon1Sz.setText("2.0");
    main.countIon2Charge.setText("-1.0");
    main.countIon2Con.setText("0.1");
    main.countIon2Sz.setText("2.0");
    main.gridLen1b.setText("200");
    main.gridLen2b.setText("200");
    main.gridLen3b.setText("200");
    main.gridLen1c.setText("");
    main.gridLen2c.setText("");
    main.gridLen3c.setText("");
    assertFalse(main.SaveData());
}

@Test
void testSaveDataValidFields() {
    Main main = new Main();
    main.pqrFile1.setText("protein.pqr");
    main.gridDimx.setText("97");
    main.gridDimy.setText("97");
    main.gridDimz.setText("97");
    main.gridLen1a.setText("300");
    main.gridLen2a.setText("300");
    main.gridLen3a.setText("300");
    main.countIon1Charge.setText("1.0");
    main.countIon1Con.setText("0.1");
    main.countIon1Sz.setText("2.0");
    main.countIon2Charge.setText("-1.0");
    main.countIon2Con.setText("0.1");
    main.countIon2Sz.setText("2.0");
    main.proteinDi.setText("2.0");
    main.solventDi.setText("80.0");
    main.membraneDi.setText("2.0");
    main.srad.setText("1.4");
    main.sdens.setText("10.0");
    main.temp.setText("298.15");
    assertTrue(main.SaveData());
}

@Test
void testSaveDataValidFieldsWithFocus1() {
    Main main = new Main();
    main.pqrFile1.setText("protein.pqr");
    main.gridDimx.setText("97");
    main.gridDimy.setText("97");
    main.gridDimz.setText("97");
    main.gridLen1a.setText("300");
    main.gridLen2a.setText("300");
    main.gridLen3a.setText("300");
    main.countIon1Charge.setText("1.0");
    main.countIon1Con.setText("0.1");
    main.countIon1Sz.setText("2.0");
    main.gridLen1b.setText("200");
    main.gridLen2b.setText("200");
    main.gridLen3b.setText("200");
    main.proteinDi.setText("2.0");
    main.solventDi.setText("80.0");
    main.membraneDi.setText("2.0");
    main.srad.setText("1.4");
    main.sdens.setText("10.0");
    main.temp.setText("298.15");
    assertTrue(main.SaveData());
}

@Test
void testSaveDataValidFieldsWithFocus2() {
    Main main = new Main();
    main.pqrFile1.setText("protein.pqr");
    main.gridDimx.setText("97");
    main.gridDimy.setText("97");
    main.gridDimz.setText("97");
    main.gridLen1a.setText("300");
    main.gridLen2a.setText("300");
    main.gridLen3a.setText("300");
    main.countIon1Charge.setText("1.0");
    main.countIon1Con.setText("0.1");
    main.countIon1Sz.setText("2.0");
    main.countIon2Charge.setText("-1.0");
    main.countIon2Con.setText("0.1");
    main.countIon2Sz.setText("2.0");
    main.gridLen1b.setText("200");
    main.gridLen2b.setText("200");
    main.gridLen3b.setText("200");
    main.gridLen1c.setText("100");
    main.gridLen2c.setText("100");
    main.gridLen3c.setText("100");
    main.proteinDi.setText("2.0");
    main.solventDi.setText("80.0");
    main.membraneDi.setText("2.0");
    main.srad.setText("1.4");
    main.sdens.setText("10.0");
    main.temp.setText("298.15");
    assertTrue(main.SaveData());
}  
}