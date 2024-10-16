/*
 * This file was automatically generated by EvoSuite
 */

package accessories.plugins;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import accessories.plugins.FormularEditor;
import freemind.main.XMLElement;
import freemind.view.mindmapview.NodeView;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FormularEditorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FormularEditor formularEditor0 = new FormularEditor();
      formularEditor0.onLostFocusNode((NodeView) null);
      assertNull(formularEditor0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      FormularEditor formularEditor0 = new FormularEditor();
      formularEditor0.shutdownMapHook();
      assertNull(formularEditor0.getName());
  }

  @Test
  public void test2()  throws Throwable  {
      FormularEditor formularEditor0 = new FormularEditor();
      XMLElement xMLElement0 = new XMLElement();
      formularEditor0.loadFrom(xMLElement0);
      assertNull(formularEditor0.getName());
  }

  @Test
  public void test3()  throws Throwable  {
      FormularEditor formularEditor0 = new FormularEditor();
      formularEditor0.setName("UndeclaredElementInContentSpec");
      XMLElement xMLElement0 = new XMLElement(false);
      formularEditor0.save(xMLElement0);
      assertEquals("", xMLElement0.getContent());
  }

  @Test
  public void test4()  throws Throwable  {
      FormularEditor formularEditor0 = new FormularEditor();
      // Undeclared exception!
      try {
        formularEditor0.onFocusNode((NodeView) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
