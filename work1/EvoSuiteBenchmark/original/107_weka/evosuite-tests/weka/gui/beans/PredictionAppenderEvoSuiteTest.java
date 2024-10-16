/*
 * This file was automatically generated by EvoSuite
 */

package weka.gui.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.beans.EventSetDescriptor;
import java.util.ArrayList;
import org.junit.BeforeClass;
import weka.clusterers.Clusterer;
import weka.clusterers.MakeDensityBasedClusterer;
import weka.core.Attribute;
import weka.core.Instances;
import weka.gui.LogPanel;
import weka.gui.Logger;
import weka.gui.WekaTaskMonitor;
import weka.gui.beans.BatchClustererEvent;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.Classifier;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.DataSourceListener;
import weka.gui.beans.Filter;
import weka.gui.beans.FlowByExpression;
import weka.gui.beans.IncrementalClassifierEvent;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.InstanceListener;
import weka.gui.beans.Loader;
import weka.gui.beans.PredictionAppender;
import weka.gui.beans.Saver;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringLabeler;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TestSetListener;
import weka.gui.beans.TextViewer;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetListener;

@RunWith(EvoSuiteRunner.class)
public class PredictionAppenderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      // Undeclared exception!
      try {
        predictionAppender0.connectionAllowed((EventSetDescriptor) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      Filter filter0 = new Filter();
      predictionAppender0.removeTrainingSetListener((TrainingSetListener) filter0);
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      Sorter sorter0 = new Sorter();
      predictionAppender0.removeInstanceListener((InstanceListener) sorter0);
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.getComponentCount());
  }

  @Test
  public void test3()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      String string0 = predictionAppender0.appendPredictedProbabilitiesTipText();
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("append probabilities rather than labels for discrete class predictions", string0);
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertNotNull(predictionAppender0);
      
      predictionAppender0.setCustomName((String) null);
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.countComponents());
  }

  @Test
  public void test5()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      BeanVisual beanVisual0 = predictionAppender0.getVisual();
      assertEquals("weka/gui/beans/icons/PredictionAppender_animated.gif", beanVisual0.getAnimatedIconPath());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertNotNull(beanVisual0);
      assertEquals("weka.gui.beans.BeanVisual[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=java.awt.Dimension[width=67,height=68],minimumSize=java.awt.Dimension[width=67,height=68],preferredSize=java.awt.Dimension[width=67,height=68]]", beanVisual0.toString());
      assertEquals("PredictionAppender", beanVisual0.getText());
      assertEquals(1, predictionAppender0.countComponents());
  }

  @Test
  public void test6()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      predictionAppender0.useDefaultVisual();
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals(1, predictionAppender0.getComponentCount());
  }

  @Test
  public void test7()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      String string0 = predictionAppender0.getCustomName();
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertNotNull(string0);
      assertEquals(1, predictionAppender0.getComponentCount());
      assertEquals("PredictionAppender", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      boolean boolean0 = predictionAppender0.isBusy();
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals(false, boolean0);
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.getComponentCount());
  }

  @Test
  public void test9()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      TextViewer textViewer0 = new TextViewer();
      predictionAppender0.removeTestSetListener((TestSetListener) textViewer0);
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.getComponentCount());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals(1, predictionAppender0.countComponents());
  }

  @Test
  public void test10()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertNotNull(predictionAppender0);
      
      Loader loader0 = new Loader();
      BeanVisual beanVisual0 = loader0.getVisual();
      predictionAppender0.setVisual(beanVisual0);
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      WekaTaskMonitor wekaTaskMonitor0 = new WekaTaskMonitor();
      LogPanel logPanel0 = new LogPanel(wekaTaskMonitor0, false, false, false);
      predictionAppender0.setLog((Logger) logPanel0);
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals(1, predictionAppender0.getComponentCount());
  }

  @Test
  public void test12()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      predictionAppender0.getAppendPredictedProbabilities();
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
  }

  @Test
  public void test13()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      String string0 = predictionAppender0.globalInfo();
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("Accepts batch or incremental classifier events and produces a new data set with classifier predictions appended.", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      predictionAppender0.setAppendPredictedProbabilities(true);
      assertEquals(true, predictionAppender0.getAppendPredictedProbabilities());
  }

  @Test
  public void test15()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      FlowByExpression flowByExpression0 = new FlowByExpression();
      predictionAppender0.removeDataSourceListener((DataSourceListener) flowByExpression0);
      assertEquals(1, predictionAppender0.getComponentCount());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.countComponents());
  }

  @Test
  public void test16()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      predictionAppender0.addTrainingSetListener((TrainingSetListener) substringLabeler0);
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.getComponentCount());
      assertEquals(1, predictionAppender0.countComponents());
  }

  @Test
  public void test17()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      Classifier classifier0 = new Classifier();
      predictionAppender0.addTestSetListener((TestSetListener) classifier0);
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.getComponentCount());
      assertEquals(1, predictionAppender0.countComponents());
  }

  @Test
  public void test18()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      FlowByExpression flowByExpression0 = new FlowByExpression();
      predictionAppender0.addDataSourceListener((DataSourceListener) flowByExpression0);
      assertEquals(false, flowByExpression0.isBusy());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals(1, predictionAppender0.getComponentCount());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
  }

  @Test
  public void test19()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      Saver saver0 = new Saver();
      predictionAppender0.addInstanceListener((InstanceListener) saver0);
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.getComponentCount());
      assertEquals(1, predictionAppender0.countComponents());
  }

  @Test
  public void test20()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      IncrementalClassifierEvent incrementalClassifierEvent0 = new IncrementalClassifierEvent((Object) ".arff");
      // Undeclared exception!
      try {
        predictionAppender0.acceptClassifier(incrementalClassifierEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      MakeDensityBasedClusterer makeDensityBasedClusterer0 = new MakeDensityBasedClusterer();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("selected", arrayList0, 24);
      DataSetEvent dataSetEvent0 = new DataSetEvent((Object) "Use OR instead of AND for transactions/rules must contain lists.", instances0);
      BatchClustererEvent batchClustererEvent0 = new BatchClustererEvent((Object) "selected", (Clusterer) makeDensityBasedClusterer0, dataSetEvent0, 24, 24, (-245));
      predictionAppender0.acceptClusterer(batchClustererEvent0);
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
  }

  @Test
  public void test22()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      InstanceEvent instanceEvent0 = new InstanceEvent((Object) "unknown type,keyCode=1,keyText=Unknown keyCode: 0x1,keyChar='@',modifiers=Alt+Shift+Alt Graph,extModifiers=Meta+Ctrl+Shift+Alt Graph+Button1+Button2+Button3,keyLocation=KEY_LOCATION_UNKNOWN,rawCode=0,primaryLevelUnicode=0,scancode=0", (Instances) null);
      predictionAppender0.notifyInstanceAvailable(instanceEvent0);
      assertEquals(1, predictionAppender0.getComponentCount());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
  }

  @Test
  public void test23()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      predictionAppender0.notifyDataSetAvailable((DataSetEvent) null);
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals(1, predictionAppender0.countComponents());
  }

  @Test
  public void test24()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      TestSetEvent testSetEvent0 = new TestSetEvent((Object) "paragraph", (Instances) null, 0, (-127), 0, 0);
      predictionAppender0.notifyTestSetAvailable(testSetEvent0);
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals(1, predictionAppender0.getComponentCount());
  }

  @Test
  public void test25()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent((Object) "Whether pruning is performed.", (Instances) null, 200, 200);
      predictionAppender0.notifyTrainingSetAvailable(trainingSetEvent0);
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
  }

  @Test
  public void test26()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      predictionAppender0.stop();
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals(1, predictionAppender0.getComponentCount());
  }

  @Test
  public void test27()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      predictionAppender0.connectionNotification("Accepts batch or incremental classifier events and produces a new data set with classifier predictions appended.", "If set to true, classifier may output additional info to the console.");
      predictionAppender0.connectionNotification("If set to true, classifier may output additional info to the console.", "javax.swing.JFormattedTextField[,0,0,0x0,invalid,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@2593c406,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=true,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=0,columnWidth=0,command=,horizontalAlignment=LEADING]");
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals(1, predictionAppender0.getComponentCount());
  }

  @Test
  public void test28()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      predictionAppender0.disconnectionNotification("7IVW5=l", "java.awt.event.ActionEvent[unknown type,cmd=The maximum number of digits to print after the decimal point for numeric values,when=0,modifiers=] on The maximum number of digits to print after the decimal point for numeric values");
      assertEquals(1, predictionAppender0.countComponents());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
  }

  @Test
  public void test29()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      predictionAppender0.disconnectionNotification("XF", (Object) null);
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
      assertEquals(1, predictionAppender0.getComponentCount());
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals(1, predictionAppender0.countComponents());
  }

  @Test
  public void test30()  throws Throwable  {
      PredictionAppender predictionAppender0 = new PredictionAppender();
      assertNotNull(predictionAppender0);
      
      boolean boolean0 = predictionAppender0.eventGeneratable("");
      assertEquals(1, predictionAppender0.getComponentCount());
      assertEquals(false, boolean0);
      assertEquals("PredictionAppender", predictionAppender0.getCustomName());
      assertEquals("weka.gui.beans.PredictionAppender[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", predictionAppender0.toString());
  }
}
