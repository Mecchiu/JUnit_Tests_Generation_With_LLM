/*
 * This file was automatically generated by EvoSuite
 */

package jigl.image.types;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import jigl.image.types.ColorImage;
import jigl.image.types.GrayImage;
import jigl.image.types.InterpolatedColorImage;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InterpolatedColorImageEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(283, 0);
      assertNotNull(interpolatedColorImage0);
      
      // Undeclared exception!
      try {
        interpolatedColorImage0.interp((float) 283, (float) 283);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 283
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try {
        interpolatedColorImage0.interp((double) 1441);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 422);
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(colorImage0);
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try {
        interpolatedColorImage0.accum((-1.0), (-108.47635333897706), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -108
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(204, 204);
      // Undeclared exception!
      try {
        interpolatedColorImage0.setPlane(1, (GrayImage) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      assertNotNull(interpolatedColorImage0);
      
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try {
        interpolatedColorImage0.accum(1.0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try {
        interpolatedColorImage0.splat(1454.6811720287312, 1454.6811720287312, intArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try {
        interpolatedColorImage0.splat((-1895.4108414404368), intArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      assertNotNull(interpolatedColorImage0);
      
      InterpolatedColorImage interpolatedColorImage1 = new InterpolatedColorImage(interpolatedColorImage0);
      assertEquals("0:0\n0:0\n0:0\n", interpolatedColorImage0.toString());
      assertEquals("0:0\n0:0\n0:0\n", interpolatedColorImage1.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(696, 204);
      // Undeclared exception!
      try {
        interpolatedColorImage0.copy();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 422);
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(colorImage0);
      assertNotNull(interpolatedColorImage0);
      
      InterpolatedColorImage interpolatedColorImage1 = (InterpolatedColorImage)interpolatedColorImage0.copy();
      assertEquals("0:422\n0:422\n0:422\n", interpolatedColorImage1.toString());
      assertNotNull(interpolatedColorImage1);
  }
}
