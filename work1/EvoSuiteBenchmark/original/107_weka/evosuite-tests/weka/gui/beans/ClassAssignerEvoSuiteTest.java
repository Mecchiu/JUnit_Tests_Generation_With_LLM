/*
 * This file was automatically generated by EvoSuite
 */

package weka.gui.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.BeforeClass;
import weka.core.Instances;
import weka.core.converters.TextDirectoryLoader;
import weka.gui.Logger;
import weka.gui.SysErrLog;
import weka.gui.beans.Appender;
import weka.gui.beans.AttributeSummarizer;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ClassAssigner;
import weka.gui.beans.ClassAssignerCustomizer;
import weka.gui.beans.CrossValidationFoldMaker;
import weka.gui.beans.DataFormatListener;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.DataSourceListener;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.InstanceListener;
import weka.gui.beans.SubstringLabeler;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TestSetListener;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetListener;

@RunWith(EvoSuiteRunner.class)
public class ClassAssignerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.removeInstanceListener((InstanceListener) classAssigner0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals(1, classAssigner0.countComponents());
  }

  @Test
  public void test1()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      boolean boolean0 = classAssigner0.isBusy();
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.countComponents());
      assertEquals(false, boolean0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
  }

  @Test
  public void test2()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      SysErrLog sysErrLog0 = new SysErrLog();
      classAssigner0.setLog((Logger) sysErrLog0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals(1, classAssigner0.countComponents());
  }

  @Test
  public void test3()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      BeanVisual beanVisual0 = classAssigner0.getVisual();
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertNotNull(beanVisual0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("weka/gui/beans/icons/ClassAssigner_animated.gif", beanVisual0.getAnimatedIconPath());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("weka.gui.beans.BeanVisual[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=java.awt.Dimension[width=67,height=68],minimumSize=java.awt.Dimension[width=67,height=68],preferredSize=java.awt.Dimension[width=67,height=68]]", beanVisual0.toString());
      assertEquals(1, classAssigner0.countComponents());
  }

  @Test
  public void test4()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      String string0 = classAssigner0.classColumnTipText();
      assertEquals("Specify the number of the column that contains the class attribute", string0);
      assertEquals(1, classAssigner0.countComponents());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
  }

  @Test
  public void test5()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.removeTestSetListener((TestSetListener) classAssigner0);
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.getComponentCount());
  }

  @Test
  public void test6()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      String string0 = classAssigner0.globalInfo();
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("Designate which column is to be considered the class column in incoming data.", string0);
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      classAssigner0.removeDataSourceListener((DataSourceListener) attributeSummarizer0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.countComponents());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
  }

  @Test
  public void test8()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      String string0 = classAssigner0.getCustomName();
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertNotNull(string0);
      assertEquals("ClassAssigner", string0);
      assertEquals(1, classAssigner0.countComponents());
      assertEquals("last", classAssigner0.getClassColumn());
  }

  @Test
  public void test9()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      BeanVisual beanVisual0 = substringLabeler0.getVisual();
      classAssigner0.setVisual(beanVisual0);
      assertEquals("last", classAssigner0.getClassColumn());
  }

  @Test
  public void test10()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      ClassAssignerCustomizer classAssignerCustomizer0 = new ClassAssignerCustomizer();
      classAssigner0.addDataFormatListener((DataFormatListener) classAssignerCustomizer0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.countComponents());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
  }

  @Test
  public void test11()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      ClassAssignerCustomizer classAssignerCustomizer0 = new ClassAssignerCustomizer();
      classAssigner0.removeDataFormatListener((DataFormatListener) classAssignerCustomizer0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("last", classAssigner0.getClassColumn());
  }

  @Test
  public void test12()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      String string0 = classAssigner0.getClassColumn();
      assertEquals("last", string0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertNotNull(string0);
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
  }

  @Test
  public void test13()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.setCustomName("ClassAssigner");
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.countComponents());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
  }

  @Test
  public void test14()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.removeTrainingSetListener((TrainingSetListener) classAssigner0);
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.countComponents());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
  }

  @Test
  public void test15()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.useDefaultVisual();
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
  }

  @Test
  public void test16()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.getConnectedFormat();
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.getComponentCount());
  }

  @Test
  public void test17()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.getStructure("instance");
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.getComponentCount());
  }

  @Test
  public void test18()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.getStructure("");
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.getComponentCount());
  }

  @Test
  public void test19()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.connectionNotification("instance", "horizontalTextPosition");
      classAssigner0.getStructure("instance");
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.countComponents());
  }

  @Test
  public void test20()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.setClassColumn("Conditional Density Estimation with Class Probability Estimators");
      InstanceEvent instanceEvent0 = new InstanceEvent((Object) "Redo", (Instances) null);
      // Undeclared exception!
      try {
        classAssigner0.acceptInstance(instanceEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent((Object) "", instances0, (-1485), (-1485));
      classAssigner0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, instances0.classIndex());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals(1, classAssigner0.countComponents());
  }

  @Test
  public void test22()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      InstanceEvent instanceEvent0 = new InstanceEvent((Object) "Redo", (Instances) null);
      // Undeclared exception!
      try {
        classAssigner0.acceptInstance(instanceEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TestSetEvent testSetEvent0 = new TestSetEvent((Object) "1127", instances0, (int) (short)1127, 0);
      classAssigner0.notifyTestListeners(testSetEvent0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals(1, classAssigner0.countComponents());
      assertEquals("last", classAssigner0.getClassColumn());
  }

  @Test
  public void test24()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.notifyDataListeners((DataSetEvent) null);
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.countComponents());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
  }

  @Test
  public void test25()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      InstanceEvent instanceEvent0 = new InstanceEvent((Object) classAssigner0);
      classAssigner0.notifyInstanceListeners(instanceEvent0);
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("weka.gui.beans.InstanceEvent[source=weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]]", instanceEvent0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
  }

  @Test
  public void test26()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.eventGeneratable("instance");
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals(1, classAssigner0.countComponents());
  }

  @Test
  public void test27()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.addInstanceListener((InstanceListener) classAssigner0);
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals(1, classAssigner0.countComponents());
  }

  @Test
  public void test28()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      classAssigner0.addDataSourceListener((DataSourceListener) substringLabeler0);
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.countComponents());
  }

  @Test
  public void test29()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      classAssigner0.addTrainingSetListener((TrainingSetListener) crossValidationFoldMaker0);
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
  }

  @Test
  public void test30()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      Appender appender0 = new Appender();
      classAssigner0.addTestSetListener((TestSetListener) appender0);
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.countComponents());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(false, appender0.isBusy());
  }

  @Test
  public void test31()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.connectionNotification("{}", "{}");
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals(1, classAssigner0.getComponentCount());
  }

  @Test
  public void test32()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.disconnectionNotification("testSet", "weka.gui.beans.SubstringLabeler[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("last", classAssigner0.getClassColumn());
  }

  @Test
  public void test33()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.disconnectionNotification("instance", "set-writable");
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals(1, classAssigner0.countComponents());
  }

  @Test
  public void test34()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      classAssigner0.stop();
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals(1, classAssigner0.getComponentCount());
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.countComponents());
  }

  @Test
  public void test35()  throws Throwable  {
      ClassAssigner classAssigner0 = new ClassAssigner();
      assertNotNull(classAssigner0);
      
      boolean boolean0 = classAssigner0.eventGeneratable("LS$S$N:ADn5t_gH");
      assertEquals(true, boolean0);
      assertEquals("weka.gui.beans.ClassAssigner[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", classAssigner0.toString());
      assertEquals("ClassAssigner", classAssigner0.getCustomName());
      assertEquals("last", classAssigner0.getClassColumn());
      assertEquals(1, classAssigner0.countComponents());
  }
}
