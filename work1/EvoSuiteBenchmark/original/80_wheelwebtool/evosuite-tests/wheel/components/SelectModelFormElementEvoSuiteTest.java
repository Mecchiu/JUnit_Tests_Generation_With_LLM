/*
 * This file was automatically generated by EvoSuite
 */

package wheel.components;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import wheel.ErrorPage;
import wheel.WheelException;
import wheel.components.CheckboxGroup;
import wheel.components.ElExpression;
import wheel.components.ISelectModel;
import wheel.components.RadioGroup;
import wheel.components.RenderableComponent;
import wheel.components.Select;
import wheel.util.DynamicSelectModel;

@RunWith(EvoSuiteRunner.class)
public class SelectModelFormElementEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      ElExpression elExpression0 = errorPage0.el("r");
      CheckboxGroup checkboxGroup0 = new CheckboxGroup(errorPage0, "r", "r", (ISelectModel) null, elExpression0);
      checkboxGroup0.preBuild();
      assertEquals("r", checkboxGroup0.getFormElementName());
  }

  @Test
  public void test1()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      ElExpression elExpression0 = errorPage0.el("r");
      RadioGroup radioGroup0 = new RadioGroup(errorPage0, "r", "r", (ISelectModel) null, elExpression0);
      radioGroup0.postBuild();
      assertEquals("r", radioGroup0.getFormElementName());
  }

  @Test
  public void test2()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      ElExpression elExpression0 = errorPage0.el("r");
      RadioGroup radioGroup0 = new RadioGroup(errorPage0, "r", "r", (ISelectModel) null, elExpression0);
      assertNotNull(radioGroup0);
      
      Select select0 = new Select(radioGroup0, "r", "r", (ISelectModel) null, "r");
      select0._setBuilt(false);
      assertEquals(false, select0._isBuilt());
  }

  @Test
  public void test3()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      ElExpression elExpression0 = errorPage0.el("r");
      RadioGroup radioGroup0 = new RadioGroup(errorPage0, "r", "r", (ISelectModel) null, elExpression0);
      assertNotNull(radioGroup0);
      
      Select select0 = new Select(radioGroup0, "r", "r", (ISelectModel) null, "r");
      boolean boolean0 = select0._isBuilt();
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      ElExpression elExpression0 = errorPage0.el("r");
      CheckboxGroup checkboxGroup0 = new CheckboxGroup(errorPage0, "r", "r", (ISelectModel) null, elExpression0);
      DynamicSelectModel dynamicSelectModel0 = checkboxGroup0.selectModel();
      Select select0 = null;
      try {
        select0 = new Select(errorPage0, "r", "r", dynamicSelectModel0, "r");
        fail("Expecting exception: WheelException");
      } catch(WheelException e) {
        /*
         * Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      ElExpression elExpression0 = errorPage0.el("r");
      CheckboxGroup checkboxGroup0 = new CheckboxGroup(errorPage0, "r", "r", (ISelectModel) null, elExpression0);
      assertNotNull(checkboxGroup0);
      
      RadioGroup radioGroup0 = new RadioGroup(errorPage0, "r", "r", (ISelectModel) null, elExpression0);
      boolean boolean0 = radioGroup0.enhance((RenderableComponent) checkboxGroup0, false, 0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      ElExpression elExpression0 = errorPage0.el("r");
      RadioGroup radioGroup0 = new RadioGroup(errorPage0, "r", "r", (ISelectModel) null, elExpression0);
      radioGroup0._clear();
      assertEquals("input", radioGroup0.defaultTagName());
  }
}
