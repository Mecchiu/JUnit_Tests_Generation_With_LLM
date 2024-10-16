/*
 * This file was automatically generated by EvoSuite
 */

package com.eteks.sweethome3d.viewcontroller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.swing.SwingViewFactory;
import com.eteks.sweethome3d.viewcontroller.ContentManager;
import com.eteks.sweethome3d.viewcontroller.VideoController;
import com.eteks.sweethome3d.viewcontroller.ViewFactory;
import java.beans.PropertyChangeListener;
import javax.swing.JSpinner;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class VideoControllerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Home home0 = new Home((-54.946594F));
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      videoController0.getContentManager();
      assertEquals(1372766400766L, videoController0.getTime());
  }

  @Test
  public void test1()  throws Throwable  {
      Home home0 = new Home(2.0666666F);
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      videoController0.setHeight(0);
      assertEquals(1372766400817L, videoController0.getTime());
  }

  @Test
  public void test2()  throws Throwable  {
      Home home0 = new Home();
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      int int0 = videoController0.getCeilingLightColor();
      assertEquals(1372766400278L, videoController0.getTime());
      assertEquals(13684944, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      VideoController.Property videoController_Property0 = VideoController.Property.TIME;
      Home home0 = new Home((-47.117855F));
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      videoController0.addPropertyChangeListener(videoController_Property0, (PropertyChangeListener) null);
      assertEquals(1372766400695L, videoController0.getTime());
  }

  @Test
  public void test4()  throws Throwable  {
      Home home0 = new Home((-47.117855F));
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      videoController0.getAspectRatio();
      assertEquals(1372766400228L, videoController0.getTime());
  }

  @Test
  public void test5()  throws Throwable  {
      Home home0 = new Home();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) null, (ContentManager) null);
      assertNotNull(videoController0);
      
      videoController0.setWidth((-243));
      assertEquals(-243, videoController0.getWidth());
      assertEquals(1372766400654L, videoController0.getTime());
  }

  @Test
  public void test6()  throws Throwable  {
      Home home0 = new Home();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) null, (ContentManager) null);
      assertNotNull(videoController0);
      
      videoController0.setVisualProperty("", "anchorSelectionPath");
      assertEquals(1372766400988L, videoController0.getTime());
      assertEquals(25, videoController0.getFrameRate());
  }

  @Test
  public void test7()  throws Throwable  {
      Home home0 = new Home((-54.946594F));
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      long long0 = videoController0.getTime();
      assertEquals(1372766400270L, long0);
  }

  @Test
  public void test8()  throws Throwable  {
      Home home0 = new Home(2.0666666F);
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      int int0 = videoController0.getHeight();
      assertEquals(1372766400628L, videoController0.getTime());
      assertEquals(240, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      Home home0 = new Home(2.0666666F);
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      videoController0.setQuality(25);
      assertEquals(3, videoController0.getQuality());
      assertEquals(1372766400995L, videoController0.getTime());
  }

  @Test
  public void test10()  throws Throwable  {
      Home home0 = new Home((-2037.8195F));
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) null, (ContentManager) null);
      assertNotNull(videoController0);
      
      int int0 = videoController0.getQuality();
      assertEquals(1372766400360L, videoController0.getTime());
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      Home home0 = new Home(2.0666666F);
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      videoController0.getCameraPath();
      assertEquals(1372766400748L, videoController0.getTime());
  }

  @Test
  public void test12()  throws Throwable  {
      Home home0 = new Home((-2037.8195F));
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) null, (ContentManager) null);
      assertNotNull(videoController0);
      
      VideoController.Property videoController_Property0 = VideoController.Property.TIME;
      JSpinner jSpinner0 = new JSpinner();
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0, "");
      videoController0.removePropertyChangeListener(videoController_Property0, (PropertyChangeListener) jSpinner_NumberEditor0);
      assertEquals(1372766400227L, videoController0.getTime());
  }

  @Test
  public void test13()  throws Throwable  {
      Home home0 = new Home();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) null, (ContentManager) null);
      assertNotNull(videoController0);
      
      int int0 = videoController0.getFrameRate();
      assertEquals(1372766400367L, videoController0.getTime());
      assertEquals(25, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      Home home0 = new Home((-47.117855F));
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      int int0 = videoController0.getWidth();
      assertEquals(1372766400676L, videoController0.getTime());
      assertEquals(320, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      Home home0 = new Home((-54.946594F));
      SwingViewFactory swingViewFactory0 = new SwingViewFactory();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) swingViewFactory0, (ContentManager) null);
      assertNotNull(videoController0);
      
      videoController0.setCeilingLightColor(0);
      assertEquals(1372766400019L, videoController0.getTime());
  }

  @Test
  public void test16()  throws Throwable  {
      Home home0 = new Home();
      VideoController videoController0 = new VideoController(home0, (UserPreferences) null, (ViewFactory) null, (ContentManager) null);
      assertNotNull(videoController0);
      
      // Undeclared exception!
      try {
        videoController0.getView();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
