/*
 * This file was automatically generated by EvoSuite
 */

package corina.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import corina.map.PngEncoderB;
import java.awt.image.BufferedImage;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PngEncoderBEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(11, 11, 11);
      PngEncoderB pngEncoderB0 = new PngEncoderB(bufferedImage0);
      pngEncoderB0.pngEncode();
      assertEquals(0, pngEncoderB0.getCompressionLevel());
      assertEquals(0, pngEncoderB0.getFilter());
      assertEquals(false, pngEncoderB0.establishStorageInfo());
      assertEquals(false, pngEncoderB0.getEncodeAlpha());
  }

  @Test
  public void test1()  throws Throwable  {
      PngEncoderB pngEncoderB0 = new PngEncoderB();
      pngEncoderB0.setImage((BufferedImage) null);
      assertEquals(0, pngEncoderB0.getCompressionLevel());
      assertEquals(0, pngEncoderB0.getFilter());
      assertEquals(false, pngEncoderB0.getEncodeAlpha());
  }

  @Test
  public void test2()  throws Throwable  {
      PngEncoderB pngEncoderB0 = new PngEncoderB((BufferedImage) null, false);
      pngEncoderB0.pngEncode();
      assertEquals(0, pngEncoderB0.getCompressionLevel());
      assertEquals(false, pngEncoderB0.getEncodeAlpha());
      assertEquals(0, pngEncoderB0.getFilter());
  }

  @Test
  public void test3()  throws Throwable  {
      PngEncoderB pngEncoderB0 = new PngEncoderB((BufferedImage) null, true, (-1));
      assertEquals(0, pngEncoderB0.getCompressionLevel());
      assertEquals(true, pngEncoderB0.getEncodeAlpha());
      assertEquals(-1, pngEncoderB0.getFilter());
  }

  @Test
  public void test4()  throws Throwable  {
      PngEncoderB pngEncoderB0 = new PngEncoderB((BufferedImage) null, true, 0, (-694));
      assertEquals(0, pngEncoderB0.getCompressionLevel());
      assertEquals(true, pngEncoderB0.getEncodeAlpha());
      assertEquals(0, pngEncoderB0.getFilter());
  }

  @Test
  public void test5()  throws Throwable  {
      PngEncoderB pngEncoderB0 = new PngEncoderB((BufferedImage) null, true, 0, 948);
      assertEquals(0, pngEncoderB0.getCompressionLevel());
      assertEquals(0, pngEncoderB0.getFilter());
      assertEquals(true, pngEncoderB0.getEncodeAlpha());
  }

  @Test
  public void test6()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(13, 13, 13);
      PngEncoderB pngEncoderB0 = new PngEncoderB(bufferedImage0);
      byte[] byteArray0 = pngEncoderB0.pngEncode();
      assertEquals(0, pngEncoderB0.getFilter());
      assertNotNull(byteArray0);
      assertEquals(0, pngEncoderB0.getCompressionLevel());
      assertEquals(true, pngEncoderB0.establishStorageInfo());
  }

  @Test
  public void test7()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(7, 7, 7);
      PngEncoderB pngEncoderB0 = new PngEncoderB(bufferedImage0);
      byte[] byteArray0 = pngEncoderB0.pngEncode();
      assertEquals(0, pngEncoderB0.getFilter());
      assertEquals(0, pngEncoderB0.getCompressionLevel());
      assertNotNull(byteArray0);
  }

  @Test
  public void test8()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(4, 4, 4);
      PngEncoderB pngEncoderB0 = new PngEncoderB(bufferedImage0);
      byte[] byteArray0 = pngEncoderB0.pngEncode();
      assertEquals(0, pngEncoderB0.getCompressionLevel());
      assertEquals(0, pngEncoderB0.getFilter());
      assertEquals(false, pngEncoderB0.getEncodeAlpha());
      assertNotNull(byteArray0);
      assertEquals(true, pngEncoderB0.establishStorageInfo());
  }

  @Test
  public void test9()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(7, 7, 7);
      PngEncoderB pngEncoderB0 = new PngEncoderB(bufferedImage0);
      assertEquals(false, pngEncoderB0.getEncodeAlpha());
      
      pngEncoderB0.setEncodeAlpha(true);
      pngEncoderB0.pngEncode();
      assertEquals(0, pngEncoderB0.getFilter());
  }
}
