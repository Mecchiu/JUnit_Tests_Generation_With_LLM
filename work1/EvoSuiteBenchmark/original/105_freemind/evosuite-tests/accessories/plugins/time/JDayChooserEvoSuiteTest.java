/*
 * This file was automatically generated by EvoSuite
 */

package accessories.plugins.time;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JYearChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SpinnerDateModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JDayChooserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.requestFocus(false);
      assertEquals(false, jDayChooser0.isDecorationBordersVisible());
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(false, jDayChooser_DecoratorButton0.isBorderPainted());
  }

  @Test
  public void test1()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      jDayChooser0.setYear(8709);
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(1, jDayChooser0.countComponents());
  }

  @Test
  public void test2()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
      assertEquals(true, jDayChooser0.isDayBordersVisible());
      assertEquals(2, jDayChooser0.getDay());
  }

  @Test
  public void test3()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      jDayChooser0.getSundayForeground();
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(false, jDayChooser0.isDecorationBordersVisible());
  }

  @Test
  public void test4()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      KeyEvent keyEvent0 = new KeyEvent((Component) jDayChooser0, (-1638), (long) (-1638), (-1909), 346, 'x');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test
  public void test5()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      jDayChooser0.isWeekOfYearVisible();
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(31, jDayChooser0.getDaysInMonth());
  }

  @Test
  public void test6()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      FocusEvent focusEvent0 = new FocusEvent((Component) jDayChooser0, 1706, false);
      jDayChooser0.focusLost(focusEvent0);
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(true, jDayChooser0.isDayBordersVisible());
  }

  @Test
  public void test7()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      Color color0 = jDayChooser0.getForeground();
      jDayChooser0.setWeekdayForeground(color0);
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(2, jDayChooser0.getDay());
      assertEquals("accessories.plugins.time.JDayChooser[JDayChooser,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", jDayChooser0.toString());
      assertEquals(true, jDayChooser0.isDayBordersVisible());
  }

  @Test
  public void test8()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      jDayChooser0.isDecorationBackgroundVisible();
      assertEquals(1, jDayChooser0.countComponents());
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(31, jDayChooser0.getDaysInMonth());
  }

  @Test
  public void test9()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      assertNotNull(jDayChooser0);
      
      jDayChooser0.setAlwaysFireDayProperty(false);
      assertEquals(2, jDayChooser0.getDay());
  }

  @Test
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      jDayChooser0.getLocale();
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(true, jDayChooser0.isDayBordersVisible());
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(1, jDayChooser0.getComponentCount());
      assertEquals("accessories.plugins.time.JDayChooser[JDayChooser,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", jDayChooser0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      assertNotNull(jDayChooser0);
      
      KeyEvent keyEvent0 = new KeyEvent((Component) jDayChooser0, 0, (-1992L), 0, 803, '\"', 1);
      jDayChooser0.keyReleased(keyEvent0);
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(true, jDayChooser0.isWeekOfYearVisible());
  }

  @Test
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      Date date0 = jDayChooser0.getMaxSelectableDate();
      assertEquals(253370768508579L, date0.getTime());
  }

  @Test
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      JButton jButton0 = jDayChooser0.getSelectedDay();
      assertEquals(true, jButton0.isEnabled());
      assertEquals(true, jDayChooser0.isDayBordersVisible());
      assertEquals(2, jDayChooser0.getDay());
  }

  @Test
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      jDayChooser0.isDecorationBordersVisible();
      assertEquals("accessories.plugins.time.JDayChooser[JDayChooser,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", jDayChooser0.toString());
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(1, jDayChooser0.getComponentCount());
  }

  @Test
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      jDayChooser0.getWeekdayForeground();
      assertEquals(31, jDayChooser0.getDaysInMonth());
      assertEquals(true, jDayChooser0.isDayBordersVisible());
      assertEquals(2, jDayChooser0.getDay());
      assertEquals("accessories.plugins.time.JDayChooser[JDayChooser,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", jDayChooser0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      jDayChooser0.getDayPanel();
      assertEquals(1, jDayChooser0.getComponentCount());
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(1, jDayChooser0.countComponents());
  }

  @Test
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      FocusEvent focusEvent0 = new FocusEvent((Component) jDayChooser0, 0, false);
      jDayChooser0.focusGained(focusEvent0);
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(true, jDayChooser0.isDayBordersVisible());
      assertEquals("accessories.plugins.time.JDayChooser[JDayChooser,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", jDayChooser0.toString());
  }

  @Test
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      JScrollPane jScrollPane0 = new JScrollPane((Component) jDayChooser_DecoratorButton0);
      JViewport jViewport0 = jScrollPane0.getViewport();
      Color color0 = jViewport0.getForeground();
      jDayChooser0.setSundayForeground(color0);
      assertEquals(2, jDayChooser0.getDay());
  }

  @Test
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      assertNotNull(jDayChooser0);
      
      KeyEvent keyEvent0 = new KeyEvent((Component) jDayChooser0, 0, (-1992L), 0, 803, '\"', 1);
      jDayChooser0.keyTyped(keyEvent0);
      assertEquals(31, jDayChooser0.getDaysInMonth());
      assertEquals("accessories.plugins.time.JDayChooser[JDayChooser,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", jDayChooser0.toString());
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1549, 1549, 0);
      jDayChooser0.setCalendar((Calendar) gregorianCalendar0);
      assertEquals(2, jDayChooser0.getDay());
  }

  @Test
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      SpinnerDateModel spinnerDateModel0 = new SpinnerDateModel();
      Date date0 = spinnerDateModel0.getDate();
      jDayChooser0.setSelectableDateRange(date0, date0);
      assertEquals(1372734541112L, date0.getTime());
  }

  @Test
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      Locale locale0 = Locale.JAPAN;
      jDayChooser0.setLocale(locale0);
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(true, jDayChooser0.isDayBordersVisible());
      assertEquals(2, jDayChooser0.getDay());
  }

  @Test
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertEquals(2, jDayChooser0.getDay());
      assertNotNull(jDayChooser0);
      
      jDayChooser0.setDay((-1638));
      assertEquals(1, jDayChooser0.getDay());
  }

  @Test
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      assertEquals(2, jDayChooser0.getDay());
      
      jDayChooser0.setDay(269);
      assertEquals(31, jDayChooser0.getDay());
  }

  @Test
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      jDayChooser0.setMonth(1706);
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(true, jDayChooser0.isDayBordersVisible());
  }

  @Test
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      jDayChooser0.setEnabled(false);
      assertEquals(31, jDayChooser0.getDaysInMonth());
      assertEquals(true, jDayChooser0.isDayBordersVisible());
      assertEquals(2, jDayChooser0.getDay());
  }

  @Test
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      jDayChooser0.setWeekOfYearVisible(true);
      assertEquals(2, jDayChooser0.getDay());
  }

  @Test
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      assertNotNull(jDayChooser0);
      
      Color color0 = Color.BLACK;
      jDayChooser0.setDecorationBackgroundColor(color0);
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      assertNotNull(jDayChooser0);
      
      Timestamp timestamp0 = new Timestamp((-10L));
      jDayChooser0.setMinSelectableDate((Date) timestamp0);
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
  }

  @Test
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      jDayChooser0.setMaxDayCharacters(93);
      assertEquals("accessories.plugins.time.JDayChooser[JDayChooser,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", jDayChooser0.toString());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertEquals(true, jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(2, jDayChooser0.getDay());
  }

  @Test
  public void test31()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertNotNull(jDayChooser0);
      
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.update((Graphics) null);
      assertEquals(2, jDayChooser0.getDay());
      assertEquals(true, jDayChooser_DecoratorButton0.isContentAreaFilled());
  }
}
