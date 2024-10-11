// JMenuHelperTest.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains one unit test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
*/
class JMenuHelperTest {
		JMenuHelperTest() throws Exception {
	}

	@Test
	public void testAddMenuBarItem() throws Exception {
		JMenu m = new JMenu("Menu");
		m.add(new JMenuItem("Menu item 1"));

		JMenuItem m1 = new JMenuItem("Menu item 2");
		m.add(m1);

		assertEquals(2, m.getItemCount());

	}

	@Test
	public void testAddMenuItem() {
		JMenuItem m1 = new JMenuItem("Menu item 2");
		JMenu m2 = new JMenu("Menu 2");

		m2.add(m1);
		m2.add(m1);

		assertEquals(2, m2.getItemCount());

	}

	@Test
	public void testAddMenuItem() throws Exception {
		JMenu m = new JMenu("Menu");
		m.add(new JMenuItem("Menu item 1"));

		JMenuItem m1 = new JMenuItem("Menu item 2");
		m.add(m1);

		assertEquals(1, m.getItemCount());

	}

	@Test
	public void testProcessAction() throws Exception {
		JMenu m = new JMenu("Menu");
		JMenuItem m1 = new JMenuItem("Menu item 1");
		JMenuItem m2 = new JMenuItem("Menu item 2");

		assertEquals(new Action() {
		
			
			public void actionPerformed(ActionEvent e) {

				JMenuItem m3 = (JMenuItem) e.getSource();

				processAction(m3.getAction());

				processMnemonic(m3, "Key");
				processMnemonic(m1, "Key");

				processMnemonic(m2, "Key");
			}
			
		}, m1);

		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				JMenuItem m3 = (JMenuItem) ae.getSource();
				processAction(m3.getAction());
				processMnemonic(m3, "Key");
				processMnemonic(m2, "Key");

				processMnemonic(m1, "Key");
			}};

		assertEquals(new Action() {
			
			
			
			public void actionPerformed(ActionEvent ae) {

				JMenuItem m3 = (JMenuItem) ae.getSource();
				processAction(m3.getAction());
				processMnemonic(m3, "Key");
				processMnemonic(m1, "Key");

				processMnemonic(m2, "Key");
			}}, al);

	}

	@Test
	public void testAddMenuItem() throws Exception {
		JMenu m = new JMenu("Menu");
		
		JMenuItem m1 = new JMenuItem("Menu item 2");

		assertEquals(2, m.getItemCount());

		m.add(m1);
		assertEquals(3, m.getItemCount());


	}

	@Test
	public void testProcessMnemonic() throws Exception {
		JMenu m = new JMenu("Menu");
		JMenuItem m1 = new JMenuItem("Menu item 1");
		JMenuItem m2 = new JMenuItem("Menu item 2");


		assertEquals(new Mnemonic(new Action() {

			
			
			
			public void actionPerformed(ActionEvent e) {

				JMenuItem m3 = (JMenuItem) e.getSource();

				processMnemonic(m3, "Key");
				processMnemonic(m2, "Key");

				processMnemonic(m1, "Key");
			}}), m2);

		assertEquals(new Mnemonic(new Action() {
			
			
			
			
			public void actionPerformed(ActionEvent e) {

				JMenuItem m3 = (JMenuItem) e.getSource();
				processMnemonic(m3, "Key");
				processMnemonic(m1, "Key");

				processMnemonic(m2, "Key");
			}}), m1);
	}
	 
	@Test
	public void testProcessMnemonic_Action() throws Exception {
		JMenu m = new JMenu("Menu");
		JMenuItem m1 = new JMenuItem("Menu item 1");
		JMenuItem m2 = new JMenuItem("Menu item 2");
		
		assertEquals(2, m.getItemCount());
		
		m.add(m1);
		m.add(m1);

		assertEquals(3, m.getItemCount());
		
		m.add(m2);
		m.add(m1);

		assertEquals(4, m.getItemCount());
		
		m.add(m2);
		m.add(m1);

		assertEquals(5, m.getItemCount());
		
		m.add(m1);
		m.add(m2);
		
		assertEquals(6, m.getItemCount());
		
		m.add(m1);
		m.add(m2);
		
		assertEquals(7, m.getItemCount());
		
		m.add(m2);

		assertEquals(8, m.getItemCount());

	}

}