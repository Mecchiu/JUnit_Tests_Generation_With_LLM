/*
 * This file was automatically generated by EvoSuite
 */

package freemind.modes.mindmapmode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import freemind.modes.mindmapmode.MindMapHTMLWriter;
import freemind.modes.mindmapmode.MindMapNodeModel;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Writer;
import java.util.List;
import java.util.Vector;
import javax.help.DefaultHelpHistoryModel;
import javax.help.DefaultHelpModel;
import javax.help.JHelp;
import javax.help.JHelpContentViewer;
import javax.help.TextHelpModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MindMapHTMLWriterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      MindMapHTMLWriter mindMapHTMLWriter0 = new MindMapHTMLWriter((Writer) charArrayWriter0);
      assertNotNull(mindMapHTMLWriter0);
      
      // Undeclared exception!
      try {
        mindMapHTMLWriter0.saveHTML((MindMapNodeModel) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(1497);
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      MindMapHTMLWriter mindMapHTMLWriter0 = new MindMapHTMLWriter((Writer) pipedWriter0);
      // Undeclared exception!
      try {
        mindMapHTMLWriter0.hasHtml((MindMapNodeModel) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(0);
      MindMapHTMLWriter mindMapHTMLWriter0 = new MindMapHTMLWriter((Writer) charArrayWriter0);
      JHelpContentViewer jHelpContentViewer0 = new JHelpContentViewer();
      DefaultHelpModel defaultHelpModel0 = (DefaultHelpModel)jHelpContentViewer0.getModel();
      JHelp jHelp0 = new JHelp((TextHelpModel) defaultHelpModel0);
      DefaultHelpHistoryModel defaultHelpHistoryModel0 = new DefaultHelpHistoryModel(jHelp0);
      Vector<Object> vector0 = defaultHelpHistoryModel0.getForwardHistory();
      mindMapHTMLWriter0.saveHTML((List) vector0);
      assertEquals("<html>\n<head>\n<style type=\"text/css\">\n    li { list-style: none;  margin: 0; }\n    p { margin: 0; }\n\n    span.l { color: red; font-weight: bold; }\n\n    a.mapnode:link {text-decoration: none; color: black; }\n    a.mapnode:visited {text-decoration: none; color: black; }\n    a.mapnode:active {text-decoration: none; color: black; }\n    a.mapnode:hover {text-decoration: none; color: black; background: #eeeee0; }\n\n</style>\n<!-- ^ Position is not set to relative / absolute here because of Mozilla -->\n</head>\n<body>\n</body>\n</html>\n", charArrayWriter0.toString());
      assertEquals(530, charArrayWriter0.size());
  }
}
