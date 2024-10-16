/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.fw.completion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.Action;
import javax.swing.CellRendererPane;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JToolTip;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.text.DefaultEditorKit;
import net.sourceforge.squirrel_sql.fw.completion.PopupManager;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PopupManagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JInternalFrame jInternalFrame0 = new JInternalFrame("", true, true, true);
      PopupManager popupManager0 = new PopupManager((JComponent) jInternalFrame0);
      JScrollBar jScrollBar0 = new JScrollBar(0);
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle rectangle0 = line2D_Float0.getBounds();
      PopupManager.Placement popupManager_Placement0 = PopupManager.AbovePreferred;
      popupManager0.install((JComponent) jScrollBar0, rectangle0, popupManager_Placement0);
      assertEquals("javax.swing.JScrollBar[,0,0,0x0,invalid,layout=javax.swing.plaf.metal.MetalScrollBarUI,alignmentX=0.0,alignmentY=0.0,border=,flags=4194632,maximumSize=,minimumSize=,preferredSize=,blockIncrement=10,orientation=HORIZONTAL,unitIncrement=1]", jScrollBar0.toString());
      assertEquals(0, jScrollBar0.getHeight());
  }

  @Test
  public void test1()  throws Throwable  {
      PopupManager.Placement popupManager_Placement0 = PopupManager.Largest;
      String string0 = popupManager_Placement0.toString();
      assertEquals("Largest", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      PopupManager.Placement popupManager_Placement0 = PopupManager.Largest;
      JInternalFrame jInternalFrame0 = new JInternalFrame("", true, true, true);
      PopupManager popupManager0 = new PopupManager((JComponent) jInternalFrame0);
      JScrollBar jScrollBar0 = new JScrollBar(0);
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle rectangle0 = line2D_Float0.getBounds();
      popupManager0.install((JComponent) jScrollBar0, rectangle0, popupManager_Placement0);
      popupManager0.install((JComponent) jScrollBar0, rectangle0, popupManager_Placement0);
      assertEquals("javax.swing.JScrollBar[,0,0,0x0,invalid,layout=javax.swing.plaf.metal.MetalScrollBarUI,alignmentX=0.0,alignmentY=0.0,border=,flags=4194632,maximumSize=,minimumSize=,preferredSize=,blockIncrement=10,orientation=HORIZONTAL,unitIncrement=1]", jScrollBar0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      JTable jTable0 = new JTable(0, 0);
      JScrollPane jScrollPane0 = new JScrollPane((Component) jTable0);
      JToolTip jToolTip0 = jScrollPane0.createToolTip();
      Rectangle rectangle0 = jToolTip0.getVisibleRect();
      PopupManager.Placement popupManager_Placement0 = PopupManager.Below;
      Rectangle rectangle1 = PopupManager.computeBounds((JComponent) jToolTip0, (JComponent) jTable0, rectangle0, popupManager_Placement0);
      assertNotNull(rectangle1);
      assertEquals("java.awt.Rectangle[x=0,y=0,width=0,height=0]", rectangle1.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultEditorKit.PasteAction defaultEditorKit_PasteAction0 = new DefaultEditorKit.PasteAction();
      JMenu jMenu0 = new JMenu((Action) defaultEditorKit_PasteAction0);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem();
      JTextArea jTextArea0 = new JTextArea("9~wT#1", 0, 1360);
      Rectangle rectangle0 = jTextArea0.getVisibleRect();
      // Undeclared exception!
      try {
        PopupManager.computeBounds((JComponent) jMenu0, (JComponent) jRadioButtonMenuItem0, rectangle0, (PopupManager.Placement) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * placement cannot be null
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      PopupManager.Placement popupManager_Placement0 = PopupManager.Largest;
      JCheckBox jCheckBox0 = new JCheckBox();
      JToolTip jToolTip0 = jCheckBox0.createToolTip();
      CellRendererPane cellRendererPane0 = new CellRendererPane();
      Rectangle rectangle0 = cellRendererPane0.getBounds();
      Rectangle rectangle1 = PopupManager.computeBounds((JComponent) jToolTip0, (-1754), 726, rectangle0, popupManager_Placement0);
      assertEquals(-1754, jToolTip0.getWidth());
      assertEquals(726.0, rectangle1.getHeight(), 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem((Action) null);
      JInternalFrame jInternalFrame0 = new JInternalFrame();
      JInternalFrame.JDesktopIcon jInternalFrame_JDesktopIcon0 = jInternalFrame0.getDesktopIcon();
      Rectangle rectangle0 = jInternalFrame_JDesktopIcon0.getVisibleRect();
      PopupManager.Placement popupManager_Placement0 = PopupManager.AbovePreferred;
      Rectangle rectangle1 = PopupManager.computeBounds((JComponent) jRadioButtonMenuItem0, (JComponent) jRadioButtonMenuItem0, rectangle0, popupManager_Placement0);
      assertNotNull(rectangle1);
      assertEquals(0, rectangle1.height);
  }

  @Test
  public void test7()  throws Throwable  {
      JSlider jSlider0 = new JSlider();
      SpinnerDateModel spinnerDateModel0 = new SpinnerDateModel();
      JSpinner jSpinner0 = new JSpinner((SpinnerModel) spinnerDateModel0);
      JSpinner.DefaultEditor jSpinner_DefaultEditor0 = new JSpinner.DefaultEditor(jSpinner0);
      Rectangle rectangle0 = jSpinner_DefaultEditor0.getVisibleRect();
      PopupManager.Placement popupManager_Placement0 = PopupManager.BelowPreferred;
      Rectangle rectangle1 = PopupManager.computeBounds((JComponent) jSlider0, 1970, 1970, rectangle0, popupManager_Placement0);
      assertEquals(1970, jSlider0.getWidth());
      assertEquals(1970.0, rectangle1.getHeight(), 0.01D);
  }

  @Test
  public void test8()  throws Throwable  {
      JSpinner jSpinner0 = new JSpinner();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1811.1368F), (-1811.1368F), (-1811.1368F), (-1811.1368F));
      Rectangle rectangle0 = rectangle2D_Float0.getBounds();
      PopupManager.Placement popupManager_Placement0 = PopupManager.BelowPreferred;
      Rectangle rectangle1 = PopupManager.computeBounds((JComponent) jSpinner0, 0, 0, rectangle0, popupManager_Placement0);
      assertEquals(0, rectangle1.height);
      assertNotNull(rectangle1);
  }
}
