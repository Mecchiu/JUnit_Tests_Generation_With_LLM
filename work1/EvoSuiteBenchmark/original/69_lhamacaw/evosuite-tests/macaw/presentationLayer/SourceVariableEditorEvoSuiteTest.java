/*
 * This file was automatically generated by EvoSuite
 */

package macaw.presentationLayer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import macaw.businessLayer.AliasFilePath;
import macaw.businessLayer.DerivedVariable;
import macaw.presentationLayer.SourceVariableEditor;
import macaw.system.MacawException;
import macaw.system.SessionProperties;
import macaw.system.UserInterfaceFactory;
import macaw.util.Displayable;
import macaw.util.DisplayableList;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SourceVariableEditorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      SourceVariableEditor sourceVariableEditor0 = new SourceVariableEditor(sessionProperties0, false);
      // Undeclared exception!
      try {
        sourceVariableEditor0.isEditingCancelled();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      SourceVariableEditor sourceVariableEditor0 = new SourceVariableEditor(sessionProperties0, false);
      Displayable displayable0 = sourceVariableEditor0.getItem();
      assertNull(displayable0);
  }

  @Test
  public void test2()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      SourceVariableEditor sourceVariableEditor0 = new SourceVariableEditor(sessionProperties0, false);
      AliasFilePath aliasFilePath0 = new AliasFilePath();
      // Undeclared exception!
      try {
        sourceVariableEditor0.viewListItem((Displayable) aliasFilePath0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      SourceVariableEditor sourceVariableEditor0 = new SourceVariableEditor(sessionProperties0, false);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      UserInterfaceFactory userInterfaceFactory0 = sessionProperties0.getUserInterfaceFactory();
      DisplayableList displayableList0 = new DisplayableList(userInterfaceFactory0);
      // Undeclared exception!
      try {
        sourceVariableEditor0.editListItem("", (Displayable) derivedVariable0, displayableList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
