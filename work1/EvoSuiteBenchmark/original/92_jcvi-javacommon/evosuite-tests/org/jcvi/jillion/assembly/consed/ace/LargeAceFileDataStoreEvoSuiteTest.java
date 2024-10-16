/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.assembly.consed.ace;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import org.jcvi.jillion.assembly.consed.ace.LargeAceFileDataStore;
import org.jcvi.jillion.core.datastore.DataStoreFilter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LargeAceFileDataStoreEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = new File(".", ".");
      LargeAceFileDataStore largeAceFileDataStore0 = (LargeAceFileDataStore)LargeAceFileDataStore.create(file0);
      assertEquals(false, largeAceFileDataStore0.isClosed());
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = new File(".", ".");
      // Undeclared exception!
      try {
        LargeAceFileDataStore.create(file0, (DataStoreFilter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * filter can not be null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        LargeAceFileDataStore.create((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * ace file can not be null
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      File file0 = new File("KgHutlm|$");
      try {
        LargeAceFileDataStore.create(file0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * ace file /mnt/fastdata/ac1gf/SF110/dist/92_jcvi-javacommon/KgHutlm|$ does not exist
         */
      }
  }
}
