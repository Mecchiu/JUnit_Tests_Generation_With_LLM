// JMenuHelperTest.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
*/
class JMenuHelperTest {

	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a normal menu.
	 */
	@Test
	void testAddMenuBarItemNormal() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test");
		assertEquals("Test", menu.getText());
		assertEquals(0, menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic.
	 */
	@Test
	void testAddMenuBarItemMnemonic() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Te_st");
		assertEquals("Test", menu.getText());
		assertEquals('s', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtEnd() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test_");
		assertEquals("Test", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginning() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test");
		assertEquals("Test", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning and at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginningAndEnd() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test_");
		assertEquals("Test", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning and at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginningAndEnd2() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test_2");
		assertEquals("Test 2", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning and at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginningAndEnd3() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test_2_");
		assertEquals("Test 2", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning and at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginningAndEnd4() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test_2_3");
		assertEquals("Test 2 3", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning and at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginningAndEnd5() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test_2_3_");
		assertEquals("Test 2 3", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning and at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginningAndEnd6() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test_2_3_4");
		assertEquals("Test 2 3 4", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning and at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginningAndEnd7() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test_2_3_4_");
		assertEquals("Test 2 3 4", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning and at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginningAndEnd8() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test_2_3_4_5");
		assertEquals("Test 2 3 4 5", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning and at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginningAndEnd9() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test_2_3_4_5_");
		assertEquals("Test 2 3 4 5", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
	
	/**
	 * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
	 * with a menu with a mnemonic at the beginning and at the end.
	 */
	@Test
	void testAddMenuBarItemMnemonicAtBeginningAndEnd10() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "_Test_2_3_4_5_6");
		assertEquals("Test 2 3 4 5 6", menu.getText());
		assertEquals('t', menu.getMnemonic());
	}
}