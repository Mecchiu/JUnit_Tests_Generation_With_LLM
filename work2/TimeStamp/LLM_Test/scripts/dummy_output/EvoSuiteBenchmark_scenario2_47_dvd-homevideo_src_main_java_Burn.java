// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains ten unit test cases for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
		
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_1() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = true;
		assertTrue(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_2() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = false;
		assertFalse(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_3() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = true;
		assertTrue(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_4() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = false;
		assertFalse(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_5() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = true;
		assertTrue(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_6() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = false;
		assertFalse(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_7() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = true;
		assertTrue(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_8() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = false;
		assertFalse(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_9() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = true;
		assertTrue(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_10() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = false;
		assertFalse(burn.BurnToDVD(DVD_GUI));
	}
}