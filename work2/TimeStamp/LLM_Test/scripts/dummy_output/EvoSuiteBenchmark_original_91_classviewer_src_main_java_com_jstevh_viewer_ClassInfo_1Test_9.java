// ClassInfo_1Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {
		
	@Test
	public void test() throws Exception {
		System.out.println("Testing ClassInfo_1Test");

		JFrame frame = new JFrame();
		frame.setSize(200, 50);
		JPanel view = new JPanel();
		view.setPreferredSize(new Dimension(200, 50));
		view.setBorder(new EmptyBorder(0, 0, 0, 0));
		frame.getContentPane().add(view, BorderLayout.CENTER);
		frame.getContentPane().add(createUI(), BorderLayout.SOUTH);

		ClassManager classManager = new ClassManager(true);
		ClassManager classManager2 = new ClassManager(false);
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		frame.getJMenuBar().add(menuBar);
		frame.getJMenuBar().add(fileMenu);

		JMenuItem openMenuItem = new JMenuItem("Load classes...");
		fileMenu.add(openMenuItem);
}
}