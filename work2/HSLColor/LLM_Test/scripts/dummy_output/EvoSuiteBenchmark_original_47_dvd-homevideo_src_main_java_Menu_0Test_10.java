// Menu_0Test.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains one unit test case for the {@link Menu#init()} method.
*/
class Menu_0Test {
		static final String fName = "TestMenuXml";
		GUI m_GUI;
		String strTitle;

		@Before
		public void setUp() {
				m_GUI = new GUI();
				strTitle = "Menu";
		}

		@Test
		public void TestMenu_0() {
				runMenuTest(m_GUI,fName,Menu_0Test.class.getName(),
						MenuTestUtils.createMenu(strTitle,MenuTestUtils.PATH));
		}
		@Test
		public void TestMenu_0WithoutPNG() {
				runMenuTest(m_GUI,fName,MenuTestUtils.PATH,
						MenuTestUtils.createMenu(strTitle,MenuTestUtils.PATH));
		}

		@Test
		public void testMenu_0WithoutVideoMenu() {
				runMenuTest(m_GUI,fName,MenuTestUtils.PATH,
						MenuTestUtils.createMenu(strTitle,MenuTestUtils.PATH));
		}

		@Test
		public void testMenu_0WithoutFiles() {
				runMenuTest(m_GUI,fName,MenuTestUtils.PATH,
						MenuTestUtils.createMenu("NoFiles",MenuTestUtils.PATH));
		}

}


// menu tests

//Menu_Test.java