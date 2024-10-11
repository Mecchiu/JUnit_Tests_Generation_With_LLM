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
		// -----------------------------------------------
		private final JMenuBar JMenuBar = new JMenuBar();
		private final String menuName = "menuName";
		private final JMenuItem menuItem1 = new JMenuItem("menuItem1");
		private final JMenuItem menuItem2 = new JMenuItem("menuItem2");
		private final JMenuItem menuItem3 = new JMenuItem("menuItem3");
		private final JMenuItem menuItem4 = new JMenuItem("menuItem4");
		private final JMenuItem menuItem5 = new JMenuItem("menuItem5");
		private final JMenuItem menuItem6 = new JMenuItem("menuItem6");
		private final JMenuItem menuItem7 = new JMenuItem("menuItem7");
		private final JMenuItem menuItem8 = new JMenuItem("menuItem8");
        private final Action a1 = new AbstractAction(){
            // -----------------------------------------------
         public void actionPerformed(ActionEvent e)
         {
         }
        };
        // -----------------------------------------------
		private final Action a2 = new AbstractAction(){
			// -----------------------------------------------
		public void actionPerformed(ActionEvent e)
		{
			menuBar.setEnabled(true);
		}
        };
        // -----------------------------------------------
        private final Action a3 = new AbstractAction(){
            // -----------------------------------------------
         public void actionPerformed(ActionEvent e)
         {
         }
        };
        // -----------------------------------------------
        private final Action a4 = new AbstractAction(){
            // -----------------------------------------------
         public void actionPerformed(ActionEvent e)
         {
         }
        };
		
		private ActionManager actMgr = new ActionManager1();
		
		@Test
		public void testAddMenuBarItem()
								throws Exception
		{
			actMgr.addMenuBarItem(JMenuBar,menuName);
			assertMenuItem(menuName,
					menuItem1,
					a1,
					Boolean.TRUE);
		}
		
		@Test
		public void testAddMenuBarItemNoActionNoAction()
								throws Exception
		{
			actMgr.addMenuBarItem(JMenuBar,menuName, (short) keyChar,null,a3);
			assertMenuItem(menuName,
					menuItem6,
							a6,
                            Boolean.TRUE);
		}
		
		@Test
		public void testAddMenuBarItemNoAction()
								throws Exception
		{
			actMgr.addMenuBarItem(JMenuBar,menuName, (short) keyChar,a2,null);
			assertMenuItem(menuName,
					menuItem3,
							a4,
                            Boolean.TRUE);
		}
		
		@Test
		public void testAddMenuBarItemWithMenuItem1()
								throws Exception
		{
			actMgr.addMenuBarItem(JMenuBar,menuName, (short) keyChar,menuItem1);
			assertMenuItem(menuName,
					menuItem2,
							a1,
							Boolean.TRUE);
		}
		
		@Test
		public void testAddMenuBarItemWithMenuItem1NoAction()
								throws Exception
		{
			actMgr.addMenuBarItem(JMenuBar,menuName, (short) keyChar,menuItem1,null);
			assertMenuItem(menuName,
					menuItem2,
							a1,
                            Boolean.TRUE);
		}
		
		@Test
		public void testAddMenuBarItemWithMenuItem1NoAction2()
								throws Exception
		{
			actMgr.addMenuBarItem(JMenuBar,menuName, (short) keyChar,menuItem1,a2);
			assertMenuItem(menuName,
							menuItem2,
							a1,
							Boolean.TRUE);
		}
		
		@Test
		public void testAddMenuBarItemWithMenuItem1NoAction3()
								throws Exception
		{
			actMgr.addMenuBarItem(JMenuBar,menuName, (short) keyChar,menuItem1,a3);
			assertMenuItem(menuName,
					menuItem2,
							a1,
							Boolean.TRUE);
		}
		
		@Test
		public void testAddMenuBarItemWithMenuItem4()
								throws Exception
		{
			actMgr.addMenuBarItem(JMenuBar,menuName, (short) keyChar,menuItem4);
			assertMenuItem(menuName,
							menuItem3,
							a1,
                            Boolean.TRUE);
		}
		
		@Test
		public void testProcessEventActionsWithMenuItemsMenuBarMenuItemNotPresent()
								throws Exception
		{
			menuItem4.addActionListener(a2);
			menuItem4.addActionListener(a2);
			menuItem4.addActionListener(a2);
			menuItem4.addActionListener(a4);
			menuItem4.addActionListener(a4);
			menuItem4.addActionListener(a4);
			menuItem4.addActionListener(a6);
			menuItem4.addActionListener(a6);
			menuItem3.addActionListener(a1);
			menuItem3.addActionListener(a1);
			menuItem1.addActionListener(a1);
			menuItem1.addActionListener(a1);
			menuItem1.addActionListener(a1);
			actMgr.addActionListener(a2);
			menuItem3.addActionListener(a1);
			menuItem3.addActionListener(a1);
			menuItem3.addActionListener(a1);
			menuItem3.addActionListener(a1);
			menuItem3.addActionListener(a1);
			menuItem1.addActionListener(a5);
			menuItem1.addActionListener(a5);
			menuItem1.addActionListener(a5);
			menuItem1.addActionListener(a5);
			menuItem1.addActionListener(a5);
			menuItem1.addActionListener(a5);
			menuItem1.addActionListener(a1);
			menuItem4.addActionListener(a5);
			menuItem4.addActionListener(a5);
			menuItem4.addActionListener(a5);
			menuItem4.addActionListener(a1);
}
}