/*
 * This file was automatically generated by EvoSuite
 */

package it.pdfsam.plugin.merge.type;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import it.pdfsam.plugin.merge.component.JMergeTable;
import it.pdfsam.plugin.merge.type.MergeItemTransfer;
import it.pdfsam.plugin.merge.type.TableTransferHandler;
import java.awt.Component;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JToolTip;
import javax.swing.TransferHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TableTransferHandlerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TableTransferHandler tableTransferHandler0 = new TableTransferHandler();
      JMergeTable jMergeTable0 = new JMergeTable();
      Clipboard clipboard0 = new Clipboard("P+k@aD5c");
      // Undeclared exception!
      try {
        tableTransferHandler0.exportToClipboard((JComponent) jMergeTable0, clipboard0, 2);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * javax.swing.table.DefaultTableModel cannot be cast to it.pdfsam.plugin.merge.model.MergeTableModel
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TableTransferHandler tableTransferHandler0 = new TableTransferHandler();
      JMergeTable jMergeTable0 = new JMergeTable();
      MergeItemTransfer mergeItemTransfer0 = (MergeItemTransfer)tableTransferHandler0.createTransferable((JComponent) null);
      // Undeclared exception!
      try {
        tableTransferHandler0.importData((JComponent) jMergeTable0, (Transferable) mergeItemTransfer0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * javax.swing.table.DefaultTableModel cannot be cast to it.pdfsam.plugin.merge.model.MergeTableModel
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TableTransferHandler tableTransferHandler0 = new TableTransferHandler();
      JPasswordField jPasswordField0 = new JPasswordField("");
      tableTransferHandler0.importMergeItem((JComponent) jPasswordField0, (ArrayList) null);
      assertEquals(false, jPasswordField0.isLightweight());
  }

  @Test
  public void test3()  throws Throwable  {
      TableTransferHandler tableTransferHandler0 = new TableTransferHandler();
      JMergeTable jMergeTable0 = new JMergeTable();
      MergeItemTransfer mergeItemTransfer0 = (MergeItemTransfer)tableTransferHandler0.createTransferable((JComponent) null);
      tableTransferHandler0.exportDone((JComponent) jMergeTable0, (Transferable) mergeItemTransfer0, 808);
      assertEquals(false, jMergeTable0.getIgnoreRepaint());
  }

  @Test
  public void test4()  throws Throwable  {
      TableTransferHandler tableTransferHandler0 = new TableTransferHandler();
      tableTransferHandler0.cleanup((JComponent) null, true);
  }

  @Test
  public void test5()  throws Throwable  {
      TableTransferHandler tableTransferHandler0 = new TableTransferHandler();
      JPasswordField jPasswordField0 = new JPasswordField("");
      StringSelection stringSelection0 = new StringSelection("");
      TransferHandler.TransferSupport transferHandler_TransferSupport0 = new TransferHandler.TransferSupport((Component) jPasswordField0, (Transferable) stringSelection0);
      boolean boolean0 = tableTransferHandler0.importData(transferHandler_TransferSupport0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      TableTransferHandler tableTransferHandler0 = new TableTransferHandler();
      JList jList0 = new JList();
      JToolTip jToolTip0 = jList0.createToolTip();
      MouseEvent mouseEvent0 = new MouseEvent((Component) jList0, 1, (long) 1, 1, 1, 1, 1, false, 1);
      tableTransferHandler0.exportAsDrag((JComponent) jToolTip0, (InputEvent) mouseEvent0, (-1569));
      assertEquals(false, mouseEvent0.isPopupTrigger());
  }

  @Test
  public void test7()  throws Throwable  {
      TableTransferHandler tableTransferHandler0 = new TableTransferHandler();
      JPasswordField jPasswordField0 = new JPasswordField("");
      StringSelection stringSelection0 = new StringSelection("");
      TransferHandler.TransferSupport transferHandler_TransferSupport0 = new TransferHandler.TransferSupport((Component) jPasswordField0, (Transferable) stringSelection0);
      boolean boolean0 = tableTransferHandler0.canImport(transferHandler_TransferSupport0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      TableTransferHandler tableTransferHandler0 = new TableTransferHandler();
      Vector<Integer> vector0 = new Vector<Integer>();
      JList jList0 = new JList(vector0);
      DataFlavor[] dataFlavorArray0 = new DataFlavor[3];
      DataFlavor dataFlavor0 = new DataFlavor();
      dataFlavorArray0[0] = dataFlavor0;
      DataFlavor dataFlavor1 = DataFlavor.javaFileListFlavor;
      dataFlavorArray0[1] = dataFlavor1;
      boolean boolean0 = tableTransferHandler0.canImport((JComponent) jList0, dataFlavorArray0);
      assertEquals(true, boolean0);
  }
}
