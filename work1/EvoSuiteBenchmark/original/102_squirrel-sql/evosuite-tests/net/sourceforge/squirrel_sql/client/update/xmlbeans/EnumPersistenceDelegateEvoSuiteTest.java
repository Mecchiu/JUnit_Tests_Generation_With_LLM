/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.client.update.xmlbeans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.beans.Encoder;
import net.sourceforge.squirrel_sql.client.update.xmlbeans.EnumPersistenceDelegate;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EnumPersistenceDelegateEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EnumPersistenceDelegate enumPersistenceDelegate0 = new EnumPersistenceDelegate();
      Encoder encoder0 = new Encoder();
      // Undeclared exception!
      try {
        enumPersistenceDelegate0.instantiate((Object) encoder0, encoder0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.beans.Encoder cannot be cast to java.lang.Enum
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = EnumPersistenceDelegate.class;
      EnumPersistenceDelegate.installFor(class0);
  }
}
