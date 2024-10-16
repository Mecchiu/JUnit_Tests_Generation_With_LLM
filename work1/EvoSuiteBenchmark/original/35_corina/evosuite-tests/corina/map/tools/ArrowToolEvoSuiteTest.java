/*
 * This file was automatically generated by EvoSuite
 */

package corina.map.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import corina.map.LabelSet;
import corina.map.MapFrame;
import corina.map.MapPanel;
import corina.map.View;
import corina.map.tools.ArrowTool;
import corina.map.tools.ToolBox;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ArrowToolEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MapPanel mapPanel0 = new MapPanel((MapFrame) null, (LabelSet) null);
      View view0 = new View();
      ArrowTool arrowTool0 = new ArrowTool(mapPanel0, view0, (ToolBox) null);
      assertNotNull(arrowTool0);
      
      String string0 = arrowTool0.getTooltip();
      assertEquals("Info", arrowTool0.getName());
      assertEquals("Selection Tool", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      MapPanel mapPanel0 = new MapPanel((MapFrame) null, (LabelSet) null);
      View view0 = new View();
      ArrowTool arrowTool0 = new ArrowTool(mapPanel0, view0, (ToolBox) null);
      assertNotNull(arrowTool0);
      
      Cursor cursor0 = arrowTool0.getCursor();
      assertEquals("Default Cursor", cursor0.getName());
      assertEquals("Info", arrowTool0.getName());
  }

  @Test
  public void test2()  throws Throwable  {
      MapPanel mapPanel0 = new MapPanel((MapFrame) null, (LabelSet) null);
      View view0 = new View();
      ArrowTool arrowTool0 = new ArrowTool(mapPanel0, view0, (ToolBox) null);
      assertNotNull(arrowTool0);
      
      arrowTool0.getFastKey();
      assertEquals("Info", arrowTool0.getName());
  }

  @Test
  public void test3()  throws Throwable  {
      MapPanel mapPanel0 = new MapPanel((MapFrame) null, (LabelSet) null);
      View view0 = new View();
      ArrowTool arrowTool0 = new ArrowTool(mapPanel0, view0, (ToolBox) null);
      assertNotNull(arrowTool0);
      
      Character character0 = arrowTool0.getKey();
      assertEquals('v', (char)character0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) mapPanel0, 10111, (long) 10111, 10111, 10111, 10111, 1514, (int) character0, 10111, false, 1514, 10111, (int) character0);
      // Undeclared exception!
      try {
        arrowTool0.mouseClicked((MouseEvent) mouseWheelEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MapPanel mapPanel0 = new MapPanel((MapFrame) null, (LabelSet) null);
      View view0 = new View();
      ArrowTool arrowTool0 = new ArrowTool(mapPanel0, view0, (ToolBox) null);
      assertNotNull(arrowTool0);
      
      Character character0 = arrowTool0.getKey();
      assertEquals('v', (char)character0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) mapPanel0, 10111, (long) 10111, 10111, 10111, 10111, 1514, (int) character0, 10111, false, 1514, 10111, (int) character0);
      arrowTool0.mouseReleased((MouseEvent) mouseWheelEvent0);
      assertEquals("Info", arrowTool0.getName());
      assertEquals('v', character0.charValue());
  }

  @Test
  public void test5()  throws Throwable  {
      MapPanel mapPanel0 = new MapPanel((MapFrame) null, (LabelSet) null);
      View view0 = new View();
      ArrowTool arrowTool0 = new ArrowTool(mapPanel0, view0, (ToolBox) null);
      assertNotNull(arrowTool0);
      
      arrowTool0.decorate((Graphics) null);
      assertEquals("Info", arrowTool0.getName());
  }
}
