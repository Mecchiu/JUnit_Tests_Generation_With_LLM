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
   static class JMenuBarTest {
			 	public JMenuBarTest(JMenuBar menuBar, final JMenu menu) {
				JMenu menuBarItem = menuBar.getComponent(0);
                          menuBarItem.setMnemonic(menu.getMnemonic());
                          assertTrue(menuBar.concrete(0));
			            menuBarItem.setShowDropDownMenu(false);
			            menuBarItem.setToolTipText(menu.getToolTipText());
                          assertTrue(menu.getIcon() == JMenu.LARGE);
			            assertNotNull(menu.getTitle());
			            assertEquals(menu.getTitle(), menuBarItem.getTitle());
			            menu.setAlignmentY(0.99);
			            assertEquals(menu, menuBarItem.getContentPane());
		        }
		   }
		   static class TestEventHandler extends KeyAdapter {
  static {
    try {
      init();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
		  public JMenuHelperTest(){
		   }
    static final String testClassName = "testclass";
    private static final String testMenuName = testClassName + "menu";
    static final String testMenuIconName = testClassName + ".png";
    static void init(){
        final TestEventHandler testEventHandler = new TestEventHandler();
        new JMenuBarTest(new JMenuBarTest(new CustomMenuBar()), new JMenu("JMenu"));
        new JMenu("JMenu", new CustomMenu()).addKeyListener(testEventHandler);
        new JMenu("JMenu", new CustomMenu()).addMouseListener(testEventHandler);
        new JMenu("JMenu", new CustomMenu()).addMouseMotionListener(testEventHandler);        
  }
		public JMenu addMenuItem (final JMenuBar menuBar, final String string) {
            return addMenuItem(menuBar, 0, string);
        }
		public JMenu addMenuItem (final JMenuBar menuBar, final int i, final String pString) {
            menuBar.add(new JMenuItem(pString));
            return new JMenu(pString); 
        }
		public JMenu addMenuItem (final JMenuBar menuBar, final String string, final int i) {
            return addMenuItem(menuBar, i, string);
        }
		public JMenu addMenuItem (final JMenuBar menuBar, final int i, final String pString, final int j) {
            return addMenuItem(menuBar, i, pString);
        }
		public JMenu addMenuItem (final JMenuBar menuBar, final int i, final String pString, final String pString2) {
            return addMenuItem(menuBar, i, pString, pString2);
        }
		public JMenu addMenuItem (final JMenuBar menuBar, final int i, final String pString, final String pString2, final int j) {
            return addMenuItem(menuBar, i, pString, pString2);
        }
		public JMenu addMenuItem (final JMenuBar menuBar, final Icon icon) {
            return addMenuItem(menuBar, icon, "a");
        }
		public JMenu addMenuItem (final JMenuBar menuBar, final Icon icon, final String pString) {
            return addMenuItem(menuBar, icon, pString, icon);
        }
		public JMenu addMenuItem (final JMenuBar menuBar, final Icon icon, final String pString, final Icon icon2) {
            return addMenuItem( menuBar, icon, pString, icon2, "j");
        }
		public JMenu addMenuItem (final JMenuBar menuBar, final Icon icon, final String pString, final Icon icon2, final String pString2) {
            return addMenuItem( menuBar, icon, pString, icon2, pString2);
        }
	public JMenu addMenuItem (final JMenuBar menuBar, final int icon, final String pString, final Icon icon2) {
            return addMenuItem( menuBar, icon, pString, icon2, "j");
        }
			public JMenu addMenuItem (final JMenuBar menuBar, final int icon, final String pString, final Icon icon2, final String pString2) {
            return addMenuItem( menuBar, icon, pString, icon2, pString2);
        }
	public JMenu addMenuItem (final JMenuBar menuBar, final int icon, final String pString, final Icon icon2, final String pString2, final int i) {
            return addMenuItem( menuBar, icon, pString, icon2, pString2, i);
        }
		public JMenu addMenuItem (final JMenuBar menuBar, final int icon, final String pString, final Icon icon2, final String pString2, final int j) {
            return addMenuItem(menuBar, icon, pString, icon2, pString2, j);
        }
 
            public void buttonListener (final int id, final MouseEvent e) {
                if (id == 5)
                      onActionPerformed(e);
            }
    public JMenu addMenuItem (final JMenuMenu menu, final String string) {
            return addMenuItem(menu, 0, string);
        }
    public JMenu addMenuItem (final JMenu menu, final int i) {
    return addMenuItem(menu, i, "a");
    }
        public JMenu addMenuItem (final JMenu menu, final Icon icon) {
            return addMenuItem(menu, icon, "a");
        }
        public JMenu addMenuItem (final JMenu menu, final Icon icon, final String pString) {
            return addMenuItem(menu, icon, pString, icon);
        }
        public JMenu addMenuItem (final JMenu menu, final String pString, final Icon icon) {
            return addMenuItem(menu, pString, icon, icon);
        }
        public JMenu addMenuItem (final JMenu menu, final String pString, final Icon icon2) {
            return addMenuItem( menu, pString, icon2, icon);
        }
        public JMenu addMenuItem (final JMenu menu, final Icon icon, final String pString, final Icon icon2) {
            return addMenuItem( menu, icon, pString, icon2, icon);
        }
		public JMenu addMenuItem (final JMenu menu, final Icon icon, final String pString, final Icon icon2, final String pString2) {
            return addMenuItem( menu, icon, pString, icon2, pString2, icon);
        }
}
