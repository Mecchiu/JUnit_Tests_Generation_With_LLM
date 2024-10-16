/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 20:58:39 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.CountDistinctCharacters;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CountDistinctCharacters_ESTest extends CountDistinctCharacters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        CountDistinctCharacters.countDistinctCharacters((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.CountDistinctCharacters", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = CountDistinctCharacters.countDistinctCharacters("Wcg\"sjNLw=)'+TmH%=");
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = CountDistinctCharacters.countDistinctCharacters("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CountDistinctCharacters countDistinctCharacters0 = new CountDistinctCharacters();
  }
}
