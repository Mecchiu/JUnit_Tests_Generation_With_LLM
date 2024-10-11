// ClassInfo_3Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains one unit test case for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_3Test {
JFrame frame;
		Panel p1;
		Panel p2;
		Button button;
		Button button3;
		String[] data;
		String[] strData;
		int[]    intData;

		// Sets up the fixture.
		void playAndShot () {
			p1 = new Panel();
			button = new Button("Hello World");
			p2 = new Panel();
			button3 = new Button("Called by click");
			frame = new JFrame("ClassInfo_3Test");
			p1.setLayout(new BorderLayout());
			p1.add(button, BorderLayout.SOUTH);
			p1.add(button3, BorderLayout.NORTH);
			intData = new int[] { 5, 15 };
		}
		
		void clear (String test) {

			if (debug) System.out.println("************************************************");
			System.out.println("*******************"+test);

			ArrayList<Panel> panels = new ArrayList<>();
			String[] sdata = { "1", "2", "3" };
			ArrayList<Integer> ids = new ArrayList<>(Arrays.asList(new Integer[] { 1, 2, 3 }));
			Panel[] pdata = new Panel[4];
			pdata[0] = new Panel();
			pdata[1] = new Panel();
			pdata[2] = new Panel();
			pdata[3] = new Panel();

			for (int i = 0; i < ids.size(); ++i) {
				pdata[i] = new Panel();
				
				if (debug) System.out.println("*******************"+i+"");

				p1 = new Panel();
				p1.add(new JLabel(0, 0, 0, 0, Color.BLACK));
				p1.add(pdata[i]);
				p1.add(pdata[i]);
				p2 = new Panel();
				p2.add(new JLabel(0, 0, 0, 0, Color.BLACK));
				p2.add(p1);
				p2.add(new JLabel(0, 0, 0, 0, Color.BLACK));
				p1 = new Panel();
				p1.add(new JLabel(0, 0, 0, 0, Color.BLACK));
				p1.add(p2);
				p1.add(new JLabel(0, 0, 0, 0, Color.BLACK));
				p2 = new Panel();
				p2.add(new JLabel(0, 0, 0, 0, Color.BLACK));
				p2.add(p1);
				p2.add(new JLabel(0, 0, 0, 0, Color.BLACK));
				p1 = new Panel();
				p1.add(new JLabel(0, 0, 0, 0, Color.BLACK));
				p1.add(pdata[i]);
				p1.add(new JLabel(0, 0, 0, 0, Color.BLACK));

				p1.setLayout(new BorderLayout());
			
				panels.add(p1);
				
				
			}

			String className = test;

			if (debug) System.out.println("***** Classname="+className);

			panel(className)
		       .setLayout(new BoxLayout(BoxLayout.LEFT, new FlowLayout()))
		       .add(buttons(className))
		       .setLayout(new FlowLayout());

			panel(className)
		       .add(buttons(className, panel(className)))

			p2.setLayout(new BorderLayout());
			p2.add(buttons(className), BorderLayout.SOUTH);
		}

		void assertEquals (int expected[], int actual[]) {
			if (debug) System.out.println("\nexpected: ");
			for (int i = 0; i < expected.length; ++i) {
				if (debug)
					System.out.println("  i "+i+": "+expected[i]);
				assertEquals(expected[i], actual[i]);
			}
		}

		void assertEquals (Panel expected[], Panel actual[]) {
			if (debug) System.out.println("\nexpected: ");
			for (int i = 0; i < expected.length; ++i) {
				if (debug)
					System.out.println("  i "+i+": "+expected[i]);
				assertEquals(expected[i], actual[i]);
			}
		}

		void assertEquals (ArrayList<Panel> expected, ArrayList<Panel> actual) {
			if (debug) System.out.println("\nexpected: ");
			for (int i = 0; i < expected.size(); ++i) {
				if (debug)
					System.out.println("   i "+i+": "+expected.get(i));
				assertEquals(expected[i], actual.get(i));
			}
		}

		void assertEquals (ArrayList<Border> expected, ArrayList<JComponent> actual) {
			if (debug) System.out.println("\nexpected: ");
			for (int i = 0; i < expected.size(); ++i) {
				if (debug)
					System.out.println("   i "+i+": "+expected.get(i));
				assertEquals(expected[i], actual.get(i));
			}
		}

		Panel buttons (String className, Panel p) {
			if (debug) System.out.println("\n\nbuttons ");
			Panel button = new Panel(p);
			int[] ids = { 0 };

			ArrayList<Panel> panels = new ArrayList<>();

			ArrayList<Panel> p1 = new ArrayList<>();
			ArrayList<Panel> p2 = new ArrayList<>();


			ArrayList<JComponent> components = new ArrayList<>();

			ArrayList<JComponent> p1copy = new ArrayList<JComponent>(p);
			p1copy.removeAll(panels);
			ArrayList<JComponent> p2copy = new ArrayList<JComponent>(p);
			p2copy.removeAll(panels);


			p1copy.addAll(buttons(className, p1));
			p2copy.addAll(buttons(className, p2));

			ArrayList<AbstractButton> buttons = new ArrayList<AbstractButton>(p1copy + p2copy);


			ArrayList<AbstractButton> buttonP2 = buttonsCopy(buttons, p2);
			ArrayList<Abstract