/*
 * This file was automatically generated by EvoSuite
 */

package map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import map.TileMap;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TileMapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TileMap tileMap0 = null;
      try {
        tileMap0 = new TileMap("Vg0^U*un", 1094);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * Vg0^U*un (No such file or directory)
         */
      }
  }
}
