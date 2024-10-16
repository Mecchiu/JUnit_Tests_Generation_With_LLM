/*
 * This file was automatically generated by EvoSuite
 */

package com.eteks.sweethome3d.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.Selectable;
import com.eteks.sweethome3d.model.Wall;
import com.eteks.sweethome3d.swing.HomeTransferableList;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HomeTransferableListEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LinkedList<Selectable> linkedList0 = new LinkedList<Selectable>();
      HomeTransferableList homeTransferableList0 = new HomeTransferableList((List<? extends Selectable>) linkedList0);
      DataFlavor[] dataFlavorArray0 = homeTransferableList0.getTransferDataFlavors();
      assertNotNull(dataFlavorArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      LinkedList<Wall> linkedList0 = new LinkedList<Wall>();
      HomeTransferableList homeTransferableList0 = new HomeTransferableList((List<? extends Selectable>) linkedList0);
      Class<?> class0 = HomeTransferableList.class;
      DataFlavor dataFlavor0 = new DataFlavor(class0, "Australia/South");
      boolean boolean0 = homeTransferableList0.isDataFlavorSupported(dataFlavor0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      LinkedList<Selectable> linkedList0 = new LinkedList<Selectable>();
      HomeTransferableList homeTransferableList0 = new HomeTransferableList((List<? extends Selectable>) linkedList0);
      DataFlavor dataFlavor0 = new DataFlavor();
      try {
        homeTransferableList0.getTransferData(dataFlavor0);
        fail("Expecting exception: UnsupportedFlavorException");
      } catch(UnsupportedFlavorException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LinkedList<Wall> linkedList0 = new LinkedList<Wall>();
      HomeTransferableList homeTransferableList0 = new HomeTransferableList((List<? extends Selectable>) linkedList0);
      DataFlavor dataFlavor0 = HomeTransferableList.HOME_FLAVOR;
      ArrayList<Object> arrayList0 = (ArrayList<Object>)homeTransferableList0.getTransferData(dataFlavor0);
      assertEquals(true, arrayList0.isEmpty());
  }
}
