/*
 * This file was automatically generated by EvoSuite
 */

package org.pdfsam.guiclient.commons.dnd.transferables;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import org.junit.BeforeClass;
import org.pdfsam.guiclient.commons.dnd.transferables.VisualPageListTransferable;
import org.pdfsam.guiclient.dto.VisualPageListItem;

@RunWith(EvoSuiteRunner.class)
public class VisualPageListTransferableEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      VisualPageListTransferable visualPageListTransferable0 = new VisualPageListTransferable((VisualPageListTransferable.TransferableData) null);
      DataFlavor[] dataFlavorArray0 = visualPageListTransferable0.getTransferDataFlavors();
      assertNotNull(dataFlavorArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[1];
      int[] intArray0 = new int[1];
      VisualPageListTransferable visualPageListTransferable0 = new VisualPageListTransferable(visualPageListItemArray0, intArray0);
      int[] intArray1 = new int[5];
      VisualPageListTransferable.TransferableData visualPageListTransferable_TransferableData0 = visualPageListTransferable0.new TransferableData(visualPageListItemArray0, intArray1);
      VisualPageListItem[] visualPageListItemArray1 = visualPageListTransferable_TransferableData0.getDataList();
      assertSame(visualPageListItemArray1, visualPageListItemArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      VisualPageListTransferable visualPageListTransferable0 = new VisualPageListTransferable((VisualPageListTransferable.TransferableData) null);
      VisualPageListTransferable.TransferableData visualPageListTransferable_TransferableData0 = visualPageListTransferable0.new TransferableData();
      int[] intArray0 = visualPageListTransferable_TransferableData0.getIndexesList();
      assertNull(intArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      VisualPageListItem[] visualPageListItemArray0 = new VisualPageListItem[1];
      int[] intArray0 = new int[1];
      VisualPageListTransferable visualPageListTransferable0 = new VisualPageListTransferable(visualPageListItemArray0, intArray0);
      int[] intArray1 = new int[5];
      VisualPageListTransferable.TransferableData visualPageListTransferable_TransferableData0 = visualPageListTransferable0.new TransferableData(visualPageListItemArray0, intArray1);
      visualPageListTransferable_TransferableData0.setDataList(visualPageListItemArray0);
  }

  @Test
  public void test4()  throws Throwable  {
      VisualPageListTransferable visualPageListTransferable0 = new VisualPageListTransferable((VisualPageListTransferable.TransferableData) null);
      VisualPageListTransferable.TransferableData visualPageListTransferable_TransferableData0 = visualPageListTransferable0.new TransferableData();
      int[] intArray0 = new int[5];
      visualPageListTransferable_TransferableData0.setIndexesList(intArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      VisualPageListTransferable visualPageListTransferable0 = new VisualPageListTransferable((VisualPageListTransferable.TransferableData) null);
      DataFlavor dataFlavor0 = new DataFlavor();
      try {
        visualPageListTransferable0.getTransferData(dataFlavor0);
        fail("Expecting exception: UnsupportedFlavorException");
      } catch(UnsupportedFlavorException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      VisualPageListTransferable visualPageListTransferable0 = new VisualPageListTransferable((VisualPageListTransferable.TransferableData) null);
      try {
        visualPageListTransferable0.getTransferData((DataFlavor) null);
        fail("Expecting exception: UnsupportedFlavorException");
      } catch(UnsupportedFlavorException e) {
      }
  }
}
