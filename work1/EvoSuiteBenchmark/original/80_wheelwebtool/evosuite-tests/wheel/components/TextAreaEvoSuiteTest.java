/*
 * This file was automatically generated by EvoSuite
 */

package wheel.components;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.BeforeClass;
import org.xmlpull.v1.XmlSerializer;
import wheel.ErrorPage;
import wheel.components.Component;
import wheel.components.TextArea;

@RunWith(EvoSuiteRunner.class)
public class TextAreaEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea((Component) errorPage0, "+v|'0pf As?S-=", "+v|'0pf As?S-=");
      String string0 = textArea0.toString();
      assertEquals("<textarea id=\"+v|'0pf As?S-=\"/>", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea((Component) errorPage0, "+v|'0pf As?S-=", "+v|'0pf As?S-=");
      TextArea textArea1 = (TextArea)textArea0.value("+v|'0pf As?S-=");
      assertEquals("+v|'0pf As?S-=", textArea1.getFormElementName());
  }

  @Test
  public void test2()  throws Throwable  {
      TextArea textArea0 = new TextArea((Component) null, "\"suV", "\"suV");
      textArea0.addValidationError("\"suV");
      // Undeclared exception!
      try {
        textArea0.renderComponent((XmlSerializer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TextArea textArea0 = new TextArea((Component) null, "", "Failed to rename context [");
      // Undeclared exception!
      try {
        textArea0.renderComponent((XmlSerializer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
