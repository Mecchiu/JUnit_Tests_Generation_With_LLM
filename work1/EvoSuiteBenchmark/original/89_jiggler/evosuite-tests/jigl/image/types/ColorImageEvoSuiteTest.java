/*
 * This file was automatically generated by EvoSuite
 */

package jigl.image.types;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Image;
import java.awt.image.ImageProducer;
import java.awt.image.MemoryImageSource;
import javax.swing.Icon;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.tree.DefaultTreeCellRenderer;
import jigl.image.ROI;
import jigl.image.types.ColorImage;
import jigl.image.types.ImageKernel;
import jigl.image.types.InterpolatedColorImage;
import org.evosuite.testcase.TestCaseExecutor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ColorImageEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(7, 0);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.max(0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1992, 0);
      // Undeclared exception!
      try {
        interpolatedColorImage0.add(0, 0, 1992, (-1181), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(324, 324);
      colorImage0.copy();
  }

  @Test
  public void test3()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.add(0, 0, 0, (-211), (-211), rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(316, 0);
      int[] intArray0 = new int[9];
      InterpolatedColorImage interpolatedColorImage1 = (InterpolatedColorImage)interpolatedColorImage0.add(intArray0);
      assertSame(interpolatedColorImage1, interpolatedColorImage0);
  }

  @Test
  public void test5()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      Integer[] integerArray0 = new Integer[9];
      // Undeclared exception!
      try {
        interpolatedColorImage0.set(1, 1, integerArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      InterpolatedColorImage interpolatedColorImage1 = (InterpolatedColorImage)interpolatedColorImage0.add(0, 1298);
      assertEquals(0, interpolatedColorImage1.Y());
  }

  @Test
  public void test7()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try {
        interpolatedColorImage0.multiply((ColorImage) interpolatedColorImage0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      ROI rOI0 = new ROI(1, 16, 1, 16);
      // Undeclared exception!
      try {
        interpolatedColorImage0.subtract(1, 16, 1, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 16
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try {
        interpolatedColorImage0.divide(0, 0, 0, 32779, 32779);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.add(0, 0, rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI(0, (-142), (-1636), (-142));
      // Undeclared exception!
      try {
        interpolatedColorImage0.get((-32768), 1382, rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.copy(rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI(2045, (-520), 2045, (-1506));
      // Undeclared exception!
      try {
        interpolatedColorImage0.divide((-520), 845, (-16777216), 845, (-520), rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      int[] intArray0 = new int[8];
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.subtract(1475, 128, intArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 128
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      int[] intArray0 = interpolatedColorImage0.addSum();
      assertNotNull(intArray0);
  }

  @Test
  public void test16()  throws Throwable  {
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("", (Icon) null, true);
      int[] intArray0 = new int[4];
      MemoryImageSource memoryImageSource0 = new MemoryImageSource(16, 13, intArray0, 16, 0);
      Image image0 = jRadioButtonMenuItem0.createImage((ImageProducer) memoryImageSource0);
      ColorImage colorImage0 = new ColorImage(image0);
      assertNotNull(colorImage0);
      
      // Undeclared exception!
      try {
        colorImage0.subtract(0, 0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 5);
      assertNotNull(interpolatedColorImage0);
      
      int[] intArray0 = new int[10];
      ColorImage colorImage0 = interpolatedColorImage0.addbuffer(0, 870, 0, 5, intArray0);
      assertEquals(870, colorImage0.Y());
      assertNotNull(colorImage0);
      assertEquals("0:870\n0:870\n0:870\n", colorImage0.toString());
      assertEquals("0:5\n0:5\n0:5\n", interpolatedColorImage0.toString());
  }

  @Test
  public void test18()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      // Undeclared exception!
      try {
        interpolatedColorImage0.max(0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(316, 0);
      // Undeclared exception!
      try {
        interpolatedColorImage0.get(372, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.maxComponent();
  }

  @Test
  public void test21()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try {
        interpolatedColorImage0.clear();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI((-953), (-561), 12, 12);
      // Undeclared exception!
      try {
        interpolatedColorImage0.divide(12, 12, 12, rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI((-1388), 0, 0, 71);
      // Undeclared exception!
      try {
        interpolatedColorImage0.divide((ColorImage) interpolatedColorImage0, rOI0, rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(1177, 1177);
      // Undeclared exception!
      try {
        colorImage0.multiply(1177, 0, 1177, 0, 1177);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1177
         */
      }
  }

  @Test
  public void test25()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.multiply((ColorImage) interpolatedColorImage0, rOI0, rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(790, 790);
      ROI rOI0 = new ROI(790, 349, 790, 9);
      // Undeclared exception!
      try {
        interpolatedColorImage0.subtract(790, 790, 0, 99, 0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 799
         */
      }
  }

  @Test
  public void test27()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      int[] intArray0 = new int[7];
      interpolatedColorImage0.subtract(intArray0);
  }

  @Test
  public void test28()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      InterpolatedColorImage interpolatedColorImage1 = null;
      try {
        interpolatedColorImage1 = new InterpolatedColorImage((ColorImage) interpolatedColorImage0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.divide(1534, 597, 0);
  }

  @Test
  public void test30()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI(77, 1119, (-64), (-1555));
      // Undeclared exception!
      try {
        interpolatedColorImage0.min(77, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 77
         */
      }
  }

  @Test
  public void test31()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      ROI rOI0 = new ROI(0, 0, 0, 0);
      // Undeclared exception!
      try {
        interpolatedColorImage0.divide(0, 0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test32()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.absSum();
  }

  @Test
  public void test33()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.clip(11, 0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test34()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.sqrSum();
  }

  @Test
  public void test35()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.divide(0, 0);
  }

  @Test
  public void test36()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      int[] intArray0 = new int[1];
      ROI rOI0 = new ROI(1, 1, 1, (-1764));
      // Undeclared exception!
      try {
        interpolatedColorImage0.add(intArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1764
         */
      }
  }

  @Test
  public void test37()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.minComponent();
  }

  @Test
  public void test38()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try {
        colorImage0.divide(0, 0, intArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test39()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 5);
      int[] intArray0 = new int[10];
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.add(94, (-532), intArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -532
         */
      }
  }

  @Test
  public void test40()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      interpolatedColorImage0.toString();
  }

  @Test
  public void test41()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      Integer[] integerArray0 = new Integer[6];
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.set(255, (-1220), integerArray0, rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test42()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.multiply(0, (-7), rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test43()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      ROI rOI0 = new ROI(1, 1, 1, 1);
      // Undeclared exception!
      try {
        interpolatedColorImage0.add((ColorImage) interpolatedColorImage0, rOI0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1
         */
      }
  }

  @Test
  public void test44()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(16, 0);
      int[] intArray0 = new int[7];
      interpolatedColorImage0.multiply(intArray0);
  }

  @Test
  public void test45()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[8];
      ROI rOI0 = new ROI((-1), 0, (-530), (-1));
      // Undeclared exception!
      try {
        interpolatedColorImage0.multiply(intArray0, rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test46()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try {
        interpolatedColorImage0.multiply(0, 1105, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1105
         */
      }
  }

  @Test
  public void test47()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(16, 0);
      int[] intArray0 = new int[4];
      ColorImage colorImage0 = interpolatedColorImage0.addbuffer(83, 16, intArray0);
      ROI rOI0 = new ROI();
      colorImage0.min(rOI0);
  }

  @Test
  public void test48()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try {
        interpolatedColorImage0.diff((ColorImage) interpolatedColorImage0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test49()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      ROI rOI0 = new ROI((-1), (-1), (-1), (-1));
      // Undeclared exception!
      try {
        colorImage0.multiply((-1), (-1), (-1), (-1), (-1), rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test50()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      int[] intArray0 = new int[8];
      ROI rOI0 = new ROI((-308), 1091, (-16), 10);
      // Undeclared exception!
      try {
        interpolatedColorImage0.divide(intArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 10
         */
      }
  }

  @Test
  public void test51()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[1];
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try {
        interpolatedColorImage0.subtract(intArray0, rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test52()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI((-1691), (-1691), (-1691), (-1691));
      // Undeclared exception!
      try {
        interpolatedColorImage0.add((-1691), (-1691), (-1691), rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test53()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      interpolatedColorImage0.getColorModel();
  }

  @Test
  public void test54()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try {
        colorImage0.min(32767);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 32767
         */
      }
  }

  @Test
  public void test55()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.multiply(0, (-647));
  }

  @Test
  public void test56()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try {
        interpolatedColorImage0.add((-15), (-561), (-15));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test57()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      int[] intArray0 = new int[10];
      interpolatedColorImage0.divide(intArray0);
  }

  @Test
  public void test58()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try {
        colorImage0.subtract(56, 56, 56, (-448), 56);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test59()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(324, 324);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try {
        colorImage0.subtract(324, 324, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 324
         */
      }
  }

  @Test
  public void test60()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try {
        interpolatedColorImage0.subtract(1, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test61()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI((-54), (-1649), 0, 0);
      // Undeclared exception!
      try {
        interpolatedColorImage0.toString(rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test62()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI((-1725), 1615, 0, 0);
      // Undeclared exception!
      try {
        interpolatedColorImage0.multiply(1615, (-1725), 1615, rOI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test63()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try {
        interpolatedColorImage0.add((-1), (-1), intArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test64()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(16, 0);
      interpolatedColorImage0.clip(0, 0);
  }

  @Test
  public void test65()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      // Undeclared exception!
      try {
        interpolatedColorImage0.subtract(0, 0, (ROI) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test66()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.multiply(0, 1311, 1311);
  }

  @Test
  public void test67()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.subtract((ColorImage) interpolatedColorImage0);
  }

  @Test
  public void test68()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try {
        interpolatedColorImage0.divide((ColorImage) interpolatedColorImage0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test69()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 5);
      interpolatedColorImage0.add((ColorImage) interpolatedColorImage0);
  }

  @Test
  public void test70()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try {
        interpolatedColorImage0.subtract((ColorImage) interpolatedColorImage0, (ROI) null, (ROI) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test71()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 5);
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      ImageKernel imageKernel0 = new ImageKernel((float) 0, 1957);
      MemoryImageSource memoryImageSource0 = (MemoryImageSource)imageKernel0.getJavaImage();
      Image image0 = defaultTreeCellRenderer0.createImage((ImageProducer) memoryImageSource0);
      interpolatedColorImage0.InitFromImage(image0, 1115, (-1758), 18, 0);
  }

  @Test
  public void test72()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(16, 0);
      int[] intArray0 = new int[4];
      intArray0[0] = 16;
      ColorImage colorImage0 = interpolatedColorImage0.addbuffer(83, 16, intArray0);
      ROI rOI0 = new ROI();
      colorImage0.min(rOI0);
  }
}
