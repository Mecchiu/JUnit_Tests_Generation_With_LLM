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
		* It tests the case when the user enters a valid value for the grid dimension.
		*/
		@Test
		public void testSaveData1() {
				Main m = new Main();
				m.gridDimx.setText("10");
				m.gridDimy.setText("10");
				m.gridDimz.setText("10");
				assertTrue(m.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the user enters a valid value for the grid dimension.
		*/
		@Test
		public void testSaveData2() {
				Main m = new Main();
				m.gridDimx.setText("10");
				m.gridDimy.setText("10");
				m.gridDimz.setText("10");
				assertTrue(m.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the user enters a valid value for the grid dimension.
		*/
		@Test
		public void testSaveData3() {
				Main m = new Main();
				m.gridDimx.setText("10");
				m.gridDimy.setText("10");
				m.gridDimz.setText("10");
				assertTrue(m.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the user enters a valid value for the grid dimension.
		*/
		@Test
		public void testSaveData4() {
				Main m = new Main();
				m.gridDimx.setText("10");
				m.gridDimy.setText("10");
				m.gridDimz.setText("10");
				assertTrue(m.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the user enters a valid value for the grid dimension.
		*/
		@Test
		public void testSaveData5() {
				Main m = new Main();
				m.gridDimx.setText("10");
				m.gridDimy.setText("10");
				m.gridDimz.setText("10");
				assertTrue(m.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the user enters a valid value for the grid dimension.
		*/
		@Test
		public void testSaveData6() {
				Main m = new Main();
				m.gridDimx.setText("10");
				m.gridDimy.setText("10");
				m.gridDimz.setText("10");
				assertTrue(m.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the user enters a valid value for the grid dimension.
		*/
		@Test
		public void testSaveData7() {
				Main m = new Main();
				m.gridDimx.setText("10");
				m.gridDimy.setText("10");
				m.gridDimz.setText("10");
				assertTrue(m.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the user enters a valid value for the grid dimension.
		*/
		@Test
		public void testSaveData8() {
				Main m = new Main();
				m.gridDimx.setText("10");
				m.gridDimy.setText("10");
				m.gridDimz.setText("10");
				assertTrue(m.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the user enters a valid value for the grid dimension.
		*/
		@Test
		public void testSaveData9() {
				Main m = new Main();
				m.gridDimx.setText("10");
				m.gridDimy.setText("10");
				m.gridDimz.setText("10");
				assertTrue(m.SaveData());
		}
		
		/**
		* Test case for {@link Main#SaveData()} method.
		* It tests the case when the user enters a valid value for the grid dimension.
		*/
		@Test
		public void testSaveData10() {
				Main m = new Main();
				m.gridDimx.setText("10");
				m.gridDimy.setText("10");
				m.gridDimz.setText("10");
				assertTrue(m.SaveData());
		}
}

// Run.java
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

/**
 * @author Keith Callenberg, Gabriel de Forest
 */
public class Run implements Runnable {

    private Main m;

    private InFile inFile;

    private File ofile;

    private JmolViewer viewer;

    private JProgressBar pBar;

    private boolean preview;

    private boolean drawPot;

    private String potcontour;

    /**
     * @param m
     * @param inFile
     * @param ofile
     * @param viewer
     * @param pBar
     * @param drawPot
     * @param potcontour
     * @param preview
     */
    public Run(Main m, InFile inFile, File ofile, JmolViewer viewer, JProgressBar pBar, boolean drawPot, String potcontour, boolean preview) {
        this.m = m;
        this.inFile = inFile;
        this.ofile = ofile;
        this.viewer = viewer;
        this.pBar = pBar;
        this.drawPot = drawPot;
        this.potcontour = potcontour;
        this.preview = preview;
    }

    /**
     * @param m
     * @param inFile
     * @param ofile
     * @param viewer
     * @param pBar
     * @param drawPot
     * @param potcontour
     * @param preview
     */
    public Run(Main m, InFile inFile, File ofile, JmolViewer viewer, JProgressBar pBar, boolean drawPot, String potcontour, boolean preview) {
        this.m = m;
        this.inFile = inFile;
        this.ofile = ofile;
        this.viewer = viewer;
        this.pBar = pBar;
        this.drawPot = drawPot;
        this.potcontour = potcontour;
        this.preview = preview;
    }

    /**
     * @param m
     * @param in