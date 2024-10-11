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
* It contains one unit test case for the {@link Main#SaveData()} method.
*/
class MainTest {
class Test {
                        public final JmolPopup popup;
                        String file;
                        JmolPopup jmol;
			public String popupMol1 = "";
			String popupMol2 = "";
			String jmolMol1 = "";
			String jmolMol2 = "";
			public Test(String mol,JmolPopup jmol,String mol1,String mol