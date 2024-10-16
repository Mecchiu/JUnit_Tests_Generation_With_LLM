/*
 * This file was automatically generated by EvoSuite
 */

package org.fixsuite.message.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import org.fixsuite.message.Library;
import org.fixsuite.message.view.TreeView;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TreeViewEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      TreeView treeView0 = new TreeView(library0);
      assertNotNull(treeView0);
      
      KeyEvent keyEvent0 = new KeyEvent((Component) treeView0, 0, 0L, 0, 0, '/');
      treeView0.keyReleased(keyEvent0);
      assertEquals("java.awt.event.KeyEvent[unknown type,keyCode=0,keyText=Unknown keyCode: 0x0,keyChar='/',keyLocation=KEY_LOCATION_UNKNOWN,rawCode=0,primaryLevelUnicode=0,scancode=0] on org.fixsuite.message.view.TreeView[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", keyEvent0.toString());
      assertEquals(2, treeView0.countComponents());
      assertEquals(2, treeView0.getComponentCount());
  }

  @Test
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      TreeView treeView0 = new TreeView(library0);
      assertNotNull(treeView0);
      
      KeyEvent keyEvent0 = new KeyEvent((Component) treeView0, 1407, (-1443L), (-961), (-961), 'w');
      treeView0.keyTyped(keyEvent0);
      assertEquals("org.fixsuite.message.view.TreeView[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", treeView0.toString());
      assertEquals(2, treeView0.getComponentCount());
      assertEquals(2, treeView0.countComponents());
  }

  @Test
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      TreeView treeView0 = new TreeView(library0);
      assertNotNull(treeView0);
      
      ActionEvent actionEvent0 = new ActionEvent((Object) library0, 2047, "&t3OED-4oM", (long) 2047, 889);
      treeView0.actionPerformed(actionEvent0);
      assertEquals("org.fixsuite.message.view.TreeView[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", treeView0.toString());
      assertEquals(2, treeView0.getComponentCount());
  }

  @Test
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      TreeView treeView0 = new TreeView(library0);
      assertNotNull(treeView0);
      
      KeyEvent keyEvent0 = new KeyEvent((Component) treeView0, 0, 0L, 0, 0, 'G', 0);
      treeView0.keyPressed(keyEvent0);
      assertEquals(2, treeView0.countComponents());
      assertEquals("org.fixsuite.message.view.TreeView[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", treeView0.toString());
      assertEquals(2, treeView0.getComponentCount());
  }
}
