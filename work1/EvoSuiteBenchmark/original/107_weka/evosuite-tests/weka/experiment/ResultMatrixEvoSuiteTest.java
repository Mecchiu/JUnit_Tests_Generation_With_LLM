/*
 * This file was automatically generated by EvoSuite
 */

package weka.experiment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Enumeration;
import org.junit.BeforeClass;
import weka.experiment.ResultMatrix;
import weka.experiment.ResultMatrixCSV;
import weka.experiment.ResultMatrixGnuPlot;
import weka.experiment.ResultMatrixHTML;
import weka.experiment.ResultMatrixLatex;
import weka.experiment.ResultMatrixPlainText;
import weka.experiment.ResultMatrixSignificance;

@RunWith(EvoSuiteRunner.class)
public class ResultMatrixEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ResultMatrixLatex resultMatrixLatex0 = new ResultMatrixLatex(5, 5);
      assertNotNull(resultMatrixLatex0);
      
      String[] stringArray0 = new String[10];
      stringArray0[0] = "";
      stringArray0[1] = " ";
      stringArray0[2] = " ";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "Q/s*";
      stringArray0[7] = "*";
      stringArray0[8] = " ";
      stringArray0[9] = " ";
      resultMatrixLatex0.setOptions(stringArray0);
      assertEquals(0, resultMatrixLatex0.getStdDevPrec());
      assertEquals(0, resultMatrixLatex0.getStdDevWidth());
  }

  @Test
  public void test1()  throws Throwable  {
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance(8, 10);
      assertNotNull(resultMatrixSignificance0);
      
      String string0 = resultMatrixSignificance0.enumerateColNamesTipText();
      assertEquals(0, resultMatrixSignificance0.getSignificanceWidth());
      assertEquals(2, resultMatrixSignificance0.getStdDevPrec());
      assertEquals(0, resultMatrixSignificance0.getMeanWidth());
      assertEquals("Key:\n(1) col0\n(2) col1\n(3) col2\n(4) col3\n(5) col4\n(6) col5\n(7) col6\n(8) col7\n", resultMatrixSignificance0.toStringKey());
      assertEquals("Whether to enumerate the column names (prefixing them with '(x)', with 'x' being the index).", string0);
      assertEquals(false, resultMatrixSignificance0.getDefaultRemoveFilterName());
      assertEquals(40, resultMatrixSignificance0.getRowNameWidth());
      assertEquals(true, resultMatrixSignificance0.getEnumerateColNames());
      assertEquals(false, resultMatrixSignificance0.getShowAverage());
      assertEquals(2, resultMatrixSignificance0.getMeanPrec());
      assertEquals("Dataset (1) (2) (3) (4) (5) (6) (7) (8)\n---------------------------------------\nrow0                            \nrow1                            \nrow2                            \nrow3                            \nrow4                            \nrow5                            \nrow6                            \nrow7                            \nrow8                            \nrow9                            \n", resultMatrixSignificance0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      ResultMatrixGnuPlot resultMatrixGnuPlot0 = new ResultMatrixGnuPlot();
      assertNotNull(resultMatrixGnuPlot0);
      
      String string0 = resultMatrixGnuPlot0.removeFilterNameTipText();
      assertEquals("\n##################\n# file: plot.dat #\n##################\n# generated by WEKA 3.7.7\n# contains the data for the plot\n\n# key for the x-axis\n# 1 - row0\n\n# data for the plot\n1 ''\n#######\n# end #\n#######\n\n##################\n# file: plot.scr #\n##################\n# generated by WEKA 3.7.7\n# script to plot the data\n\n# display it in a window:\nset terminal x11\nset output\n\n# to display all data rows:\nset xrange [0:2]\n\n# axis labels, e.g.:\n#set xlabel \"Datasets\"\n#set ylabel \"Accuracy in %\"\n\n# the plot commands\nplot \"plot.dat\" using 1:2 with lines title \"col0\"\n\n# generate ps:\n#set terminal postscript\n#set output \"plot.ps\"\n#replot\n\n# generate png:\n#set terminal png size 800,600\n#set output \"plot.png\"\n#replot\n\n# wait for user to hit <Return>\npause -1\n#######\n# end #\n#######\n", resultMatrixGnuPlot0.toStringMatrix());
      assertEquals(0, resultMatrixGnuPlot0.getDefaultSignificanceWidth());
      assertEquals(1, resultMatrixGnuPlot0.getColCount());
      assertEquals(2, resultMatrixGnuPlot0.getDefaultMeanPrec());
      assertEquals(50, resultMatrixGnuPlot0.getColNameWidth());
      assertEquals(50, resultMatrixGnuPlot0.getRowNameWidth());
      assertEquals("Whether to remove the classname package prefixes from the filter names in datasets.", string0);
      assertEquals(2, resultMatrixGnuPlot0.getStdDevPrec());
  }

  @Test
  public void test3()  throws Throwable  {
      ResultMatrixPlainText resultMatrixPlainText0 = new ResultMatrixPlainText();
      assertNotNull(resultMatrixPlainText0);
      
      String string0 = resultMatrixPlainText0.toString();
      assertNotNull(string0);
      assertEquals("Dataset                   (1) col0 \n-----------------------------------\nrow0                       (0)    |\n-----------------------------------\n(v/ /*)                           |\n", string0);
      assertEquals(0, resultMatrixPlainText0.getDefaultStdDevWidth());
  }

  @Test
  public void test4()  throws Throwable  {
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance();
      assertNotNull(resultMatrixSignificance0);
      
      String string0 = resultMatrixSignificance0.toStringMatrix();
      assertEquals(0, resultMatrixSignificance0.getDefaultSignificanceWidth());
      assertNotNull(string0);
      assertEquals("Dataset (1)\n-----------\nrow0       \n", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance();
      assertNotNull(resultMatrixSignificance0);
      
      ResultMatrixCSV resultMatrixCSV0 = new ResultMatrixCSV((ResultMatrix) resultMatrixSignificance0);
      assertNotNull(resultMatrixCSV0);
      
      String[] stringArray0 = resultMatrixCSV0.getOptions();
      assertEquals("Dataset,(1)\nrow0,''\n'(v/ /*)',''\n", resultMatrixCSV0.toString());
      assertNotNull(stringArray0);
      assertEquals(0, resultMatrixSignificance0.getDefaultColNameWidth());
      assertEquals(0, resultMatrixSignificance0.getCountWidth());
      assertEquals(true, resultMatrixSignificance0.getPrintRowNames());
      assertEquals(0, resultMatrixSignificance0.getStdDevWidth());
      assertEquals(true, resultMatrixCSV0.getEnumerateColNames());
      assertEquals(2, resultMatrixCSV0.getStdDevPrec());
      assertEquals(0, resultMatrixSignificance0.getMeanWidth());
      assertEquals(2, resultMatrixCSV0.getMeanPrec());
      assertEquals(40, resultMatrixSignificance0.getRowNameWidth());
      assertEquals(0, resultMatrixCSV0.getMeanWidth());
  }

  @Test
  public void test6()  throws Throwable  {
      ResultMatrixHTML resultMatrixHTML0 = new ResultMatrixHTML();
      assertNotNull(resultMatrixHTML0);
      
      resultMatrixHTML0.rowNameWidthTipText();
      assertEquals(false, resultMatrixHTML0.getDefaultRemoveFilterName());
      assertEquals(25, resultMatrixHTML0.getRowNameWidth());
      assertEquals(0, resultMatrixHTML0.getMeanWidth());
      assertEquals(2, resultMatrixHTML0.getStdDevPrec());
      assertEquals(2, resultMatrixHTML0.getMeanPrec());
      assertEquals("<table border=\"1\" cellpadding=\"3\" cellspacing=\"0\">\n   <tr><td><b>Dataset</b></td><td align=\"center\" colspan=\"1\"><b>(1)</b></td></tr>\n   <tr><td>row0</td><td align=\"right\">&nbsp;</td></tr>\n   <tr><td>(v/ /*)</td><td align=\"right\">&nbsp;</td></tr>\n</table>\n", resultMatrixHTML0.toString());
      assertEquals(0, resultMatrixHTML0.getDefaultSignificanceWidth());
      assertEquals(0, resultMatrixHTML0.getDefaultCountWidth());
      assertEquals("<table border=\"1\" cellpadding=\"3\" cellspacing=\"0\">\n   <tr><td><b>Dataset</b></td><td align=\"center\" colspan=\"1\"><b>(1)</b></td></tr>\n   <tr><td>row0</td><td align=\"right\">&nbsp;</td></tr>\n   <tr><td>(v/ /*)</td><td align=\"right\">&nbsp;</td></tr>\n</table>\n", resultMatrixHTML0.toStringMatrix());
  }

  @Test
  public void test7()  throws Throwable  {
      ResultMatrixPlainText resultMatrixPlainText0 = new ResultMatrixPlainText();
      assertNotNull(resultMatrixPlainText0);
      
      resultMatrixPlainText0.enumerateRowNamesTipText();
      assertEquals(2, resultMatrixPlainText0.getDefaultStdDevPrec());
      assertEquals("Dataset                   (1) col0 \n-----------------------------------\nrow0                       (0)    |\n-----------------------------------\n(v/ /*)                           |\n", resultMatrixPlainText0.toString());
      assertEquals(0, resultMatrixPlainText0.getDefaultSignificanceWidth());
      assertEquals(2, resultMatrixPlainText0.getMeanPrec());
      assertEquals(false, resultMatrixPlainText0.getDefaultRemoveFilterName());
  }

  @Test
  public void test8()  throws Throwable  {
      ResultMatrixPlainText resultMatrixPlainText0 = new ResultMatrixPlainText(69, 603);
      resultMatrixPlainText0.printColNamesTipText();
  }

  @Test
  public void test9()  throws Throwable  {
      ResultMatrixPlainText resultMatrixPlainText0 = new ResultMatrixPlainText();
      assertNotNull(resultMatrixPlainText0);
      
      resultMatrixPlainText0.significanceWidthTipText();
      assertEquals("Dataset                   (1) col0 \n-----------------------------------\nrow0                       (0)    |\n-----------------------------------\n(v/ /*)                           |\n", resultMatrixPlainText0.toString());
      assertEquals(2, resultMatrixPlainText0.getDefaultMeanPrec());
      assertEquals(false, resultMatrixPlainText0.getRemoveFilterName());
      assertEquals(0, resultMatrixPlainText0.getSignificanceWidth());
      assertEquals(2, resultMatrixPlainText0.getStdDevPrec());
      assertEquals(false, resultMatrixPlainText0.getShowStdDev());
  }

  @Test
  public void test10()  throws Throwable  {
      ResultMatrixPlainText resultMatrixPlainText0 = new ResultMatrixPlainText(0, 1240);
      assertNotNull(resultMatrixPlainText0);
      
      Enumeration<Object> enumeration0 = resultMatrixPlainText0.headerKeys();
      assertEquals(2, resultMatrixPlainText0.getMeanPrec());
      assertEquals(true, resultMatrixPlainText0.getPrintRowNames());
      assertEquals(true, resultMatrixPlainText0.getPrintColNames());
      assertEquals(2, resultMatrixPlainText0.getStdDevPrec());
      assertEquals(false, resultMatrixPlainText0.getShowStdDev());
      assertEquals(false, resultMatrixPlainText0.getEnumerateRowNames());
      assertEquals(0, resultMatrixPlainText0.getDefaultColNameWidth());
      assertNotNull(enumeration0);
      assertEquals(25, resultMatrixPlainText0.getRowNameWidth());
      assertEquals(0, resultMatrixPlainText0.getStdDevWidth());
      assertEquals(0, resultMatrixPlainText0.getVisibleColCount());
      assertEquals(1240, resultMatrixPlainText0.getRowCount());
      assertEquals(true, resultMatrixPlainText0.getEnumerateColNames());
      assertEquals(false, resultMatrixPlainText0.getDefaultEnumerateRowNames());
  }

  @Test
  public void test11()  throws Throwable  {
      ResultMatrixHTML resultMatrixHTML0 = new ResultMatrixHTML();
      assertNotNull(resultMatrixHTML0);
      
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance((ResultMatrix) resultMatrixHTML0);
      assertNotNull(resultMatrixSignificance0);
      
      ResultMatrixPlainText resultMatrixPlainText0 = new ResultMatrixPlainText((ResultMatrix) resultMatrixSignificance0);
      int[][] intArray0 = new int[9][2];
      resultMatrixPlainText0.setSummary(intArray0, intArray0);
      ResultMatrixSignificance resultMatrixSignificance1 = new ResultMatrixSignificance((ResultMatrix) resultMatrixPlainText0);
      assertEquals("     a  (No. of datasets where [col] >> [row])\n     - | a = (1)\n", resultMatrixPlainText0.toStringSummary());
      assertEquals(0, resultMatrixHTML0.getCountWidth());
  }

  @Test
  public void test12()  throws Throwable  {
      ResultMatrixCSV resultMatrixCSV0 = new ResultMatrixCSV();
      assertNotNull(resultMatrixCSV0);
      
      resultMatrixCSV0.setColHidden(1040, true);
      assertEquals(2, resultMatrixCSV0.getDefaultMeanPrec());
      assertEquals(0, resultMatrixCSV0.getDefaultMeanWidth());
      assertEquals(2, resultMatrixCSV0.getStdDevPrec());
      assertEquals("Dataset,[1]\nrow0,''\n'[v/ /*]',''\n", resultMatrixCSV0.toString());
      assertEquals(0, resultMatrixCSV0.getDefaultStdDevWidth());
      assertEquals(0, resultMatrixCSV0.getSignificanceWidth());
      assertEquals(0, resultMatrixCSV0.getDefaultCountWidth());
      assertEquals(2, resultMatrixCSV0.getMeanPrec());
  }

  @Test
  public void test13()  throws Throwable  {
      ResultMatrixPlainText resultMatrixPlainText0 = new ResultMatrixPlainText();
      assertNotNull(resultMatrixPlainText0);
      
      resultMatrixPlainText0.setRowHidden((-1829), false);
      assertEquals(0, resultMatrixPlainText0.getMeanWidth());
      assertEquals(2, resultMatrixPlainText0.getMeanPrec());
      assertEquals(0, resultMatrixPlainText0.getSignificanceWidth());
      assertEquals(2, resultMatrixPlainText0.getStdDevPrec());
      assertEquals(0, resultMatrixPlainText0.getDefaultStdDevWidth());
      assertEquals("Dataset                   (1) col0 \n-----------------------------------\nrow0                       (0)    |\n-----------------------------------\n(v/ /*)                           |\n", resultMatrixPlainText0.toStringMatrix());
      assertEquals("Dataset                   (1) col0 \n-----------------------------------\nrow0                       (0)    |\n-----------------------------------\n(v/ /*)                           |\n", resultMatrixPlainText0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      ResultMatrixGnuPlot resultMatrixGnuPlot0 = new ResultMatrixGnuPlot();
      assertNotNull(resultMatrixGnuPlot0);
      
      resultMatrixGnuPlot0.setCount((-218), (-218));
      assertEquals(1, resultMatrixGnuPlot0.getVisibleColCount());
      assertEquals(50, resultMatrixGnuPlot0.getRowNameWidth());
      assertEquals(2, resultMatrixGnuPlot0.getMeanPrec());
      assertEquals(0, resultMatrixGnuPlot0.getDefaultSignificanceWidth());
      assertEquals("\n##################\n# file: plot.dat #\n##################\n# generated by WEKA 3.7.7\n# contains the data for the plot\n\n# key for the x-axis\n# 1 - row0\n\n# data for the plot\n1 ''\n#######\n# end #\n#######\n\n##################\n# file: plot.scr #\n##################\n# generated by WEKA 3.7.7\n# script to plot the data\n\n# display it in a window:\nset terminal x11\nset output\n\n# to display all data rows:\nset xrange [0:2]\n\n# axis labels, e.g.:\n#set xlabel \"Datasets\"\n#set ylabel \"Accuracy in %\"\n\n# the plot commands\nplot \"plot.dat\" using 1:2 with lines title \"col0\"\n\n# generate ps:\n#set terminal postscript\n#set output \"plot.ps\"\n#replot\n\n# generate png:\n#set terminal png size 800,600\n#set output \"plot.png\"\n#replot\n\n# wait for user to hit <Return>\npause -1\n#######\n# end #\n#######\n", resultMatrixGnuPlot0.toString());
      assertEquals(0, resultMatrixGnuPlot0.getMeanWidth());
      assertEquals(0, resultMatrixGnuPlot0.getDefaultCountWidth());
      assertEquals(2, resultMatrixGnuPlot0.getStdDevPrec());
      assertEquals(0, resultMatrixGnuPlot0.getSignificanceWidth());
  }

  @Test
  public void test15()  throws Throwable  {
      ResultMatrixLatex resultMatrixLatex0 = new ResultMatrixLatex(5, 5);
      assertNotNull(resultMatrixLatex0);
      
      double double0 = resultMatrixLatex0.getCount(5);
      assertEquals(0, resultMatrixLatex0.getCountWidth());
      assertEquals(0, resultMatrixLatex0.getDefaultSignificanceWidth());
      assertEquals(0.0, double0, 0.01D);
      assertEquals("\\begin{table}[thb]\n\\caption{\\label{labelname}Table Caption}\n\\footnotesize\n{\\centering \\begin{tabular}{lrr@{\\hspace{0.1cm}}cr@{\\hspace{0.1cm}}cr@{\\hspace{0.1cm}}cr@{\\hspace{0.1cm}}c}\n\\\\\n\\hline\nDataset & (1)& (2) & & (3) & & (4) & & (5) & \\\\\n\\hline\nrow0 &     &     &         &     &         &     &         &     &        \\\\\nrow1 &     &     &         &     &         &     &         &     &        \\\\\nrow2 &     &     &         &     &         &     &         &     &        \\\\\nrow3 &     &     &         &     &         &     &         &     &        \\\\\nrow4 &     &     &         &     &         &     &         &     &        \\\\\n\\hline\n\\multicolumn{10}{c}{$\\circ$, $\\bullet$ statistically significant improvement or degradation}\\\\\n\\end{tabular} \\footnotesize \\par}\n\\end{table}\n", resultMatrixLatex0.toStringMatrix());
      assertEquals(2, resultMatrixLatex0.getDefaultStdDevPrec());
      assertEquals(2, resultMatrixLatex0.getMeanPrec());
  }

  @Test
  public void test16()  throws Throwable  {
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance();
      assertNotNull(resultMatrixSignificance0);
      
      resultMatrixSignificance0.setMean(0, 660, (-799.2395912874424));
      assertEquals("Dataset (1)\n-----------\nrow0       \n", resultMatrixSignificance0.toStringMatrix());
      assertEquals(2, resultMatrixSignificance0.getStdDevPrec());
      assertEquals(0, resultMatrixSignificance0.getDefaultStdDevWidth());
      assertEquals(false, resultMatrixSignificance0.getShowAverage());
      assertEquals("Key:\n(1) col0\n", resultMatrixSignificance0.toStringKey());
      assertEquals(0, resultMatrixSignificance0.getCountWidth());
      assertEquals(false, resultMatrixSignificance0.getRemoveFilterName());
      assertEquals(0, resultMatrixSignificance0.getDefaultSignificanceWidth());
      assertEquals(2, resultMatrixSignificance0.getMeanPrec());
      assertEquals("Dataset (1)\n-----------\nrow0       \n", resultMatrixSignificance0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance();
      assertNotNull(resultMatrixSignificance0);
      
      ResultMatrixCSV resultMatrixCSV0 = new ResultMatrixCSV((ResultMatrix) resultMatrixSignificance0);
      assertNotNull(resultMatrixCSV0);
      
      ResultMatrixLatex resultMatrixLatex0 = new ResultMatrixLatex((ResultMatrix) resultMatrixCSV0);
      resultMatrixLatex0.setMean(0, 0, 0);
      String string0 = resultMatrixLatex0.toString();
      assertNotNull(string0);
      assertEquals("\\begin{table}[thb]\n\\caption{\\label{labelname}Table Caption}\n\\footnotesize\n{\\centering \\begin{tabular}{lr}\n\\\\\n\\hline\nDataset & (1)\\\\\n\\hline\nrow0                                     & 0.00\\\\\n\\hline\n\\multicolumn{2}{c}{$\\circ$, $\\bullet$ statistically significant improvement or degradation}\\\\\n\\end{tabular} \\footnotesize \\par}\n\\end{table}\n", resultMatrixLatex0.toString());
      assertEquals("Dataset,(1)\nrow0,''\n'(v/ /*)',''\n", resultMatrixCSV0.toStringMatrix());
      assertEquals("\\begin{table}[thb]\n\\caption{\\label{labelname}Table Caption}\n\\footnotesize\n{\\centering \\begin{tabular}{lr}\n\\\\\n\\hline\nDataset & (1)\\\\\n\\hline\nrow0                                     & 0.00\\\\\n\\hline\n\\multicolumn{2}{c}{$\\circ$, $\\bullet$ statistically significant improvement or degradation}\\\\\n\\end{tabular} \\footnotesize \\par}\n\\end{table}\n", string0);
  }

  @Test
  public void test18()  throws Throwable  {
      ResultMatrixLatex resultMatrixLatex0 = new ResultMatrixLatex(0, 0);
      assertNotNull(resultMatrixLatex0);
      
      double double0 = resultMatrixLatex0.getAverage(287);
      assertEquals(2, resultMatrixLatex0.getMeanPrec());
      assertEquals(0.0, double0, 0.01D);
      assertEquals(true, resultMatrixLatex0.getPrintRowNames());
      assertEquals(true, resultMatrixLatex0.getEnumerateColNames());
      assertEquals(0, resultMatrixLatex0.getSignificanceWidth());
      assertEquals(0, resultMatrixLatex0.getVisibleRowCount());
      assertEquals(false, resultMatrixLatex0.getDefaultRemoveFilterName());
      assertEquals(2, resultMatrixLatex0.getDefaultStdDevPrec());
      assertEquals(0, resultMatrixLatex0.getMeanWidth());
      assertEquals(0, resultMatrixLatex0.getVisibleColCount());
      assertEquals(false, resultMatrixLatex0.getEnumerateRowNames());
  }

  @Test
  public void test19()  throws Throwable  {
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance(8, 10);
      assertNotNull(resultMatrixSignificance0);
      
      double double0 = resultMatrixSignificance0.getAverage(1);
      assertEquals(40, resultMatrixSignificance0.getRowNameWidth());
      assertEquals(2, resultMatrixSignificance0.getDefaultStdDevPrec());
      assertEquals(false, resultMatrixSignificance0.getDefaultRemoveFilterName());
      assertEquals(false, resultMatrixSignificance0.getDefaultShowAverage());
      assertEquals(Double.NaN, double0, 0.01D);
      assertEquals(0, resultMatrixSignificance0.getSignificanceWidth());
      assertEquals("Dataset (1) (2) (3) (4) (5) (6) (7) (8)\n---------------------------------------\nrow0                            \nrow1                            \nrow2                            \nrow3                            \nrow4                            \nrow5                            \nrow6                            \nrow7                            \nrow8                            \nrow9                            \n", resultMatrixSignificance0.toStringMatrix());
  }

  @Test
  public void test20()  throws Throwable  {
      ResultMatrixHTML resultMatrixHTML0 = new ResultMatrixHTML();
      assertNotNull(resultMatrixHTML0);
      
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance((ResultMatrix) resultMatrixHTML0);
      assertNotNull(resultMatrixSignificance0);
      
      resultMatrixSignificance0.setStdDev(12, 1378, 1378);
      assertEquals("<table border=\"1\" cellpadding=\"3\" cellspacing=\"0\">\n   <tr><td><b>Dataset</b></td><td align=\"center\" colspan=\"1\"><b>(1)</b></td></tr>\n   <tr><td>row0</td><td align=\"right\">&nbsp;</td></tr>\n   <tr><td>(v/ /*)</td><td align=\"right\">&nbsp;</td></tr>\n</table>\n", resultMatrixHTML0.toString());
      assertEquals(true, resultMatrixSignificance0.getPrintRowNames());
      assertEquals(0, resultMatrixHTML0.getMeanWidth());
      assertEquals(2, resultMatrixSignificance0.getMeanPrec());
      assertEquals("Dataset (1)\n-----------\nrow0       \n", resultMatrixSignificance0.toStringMatrix());
      assertEquals(2, resultMatrixSignificance0.getStdDevPrec());
      assertEquals(true, resultMatrixSignificance0.getEnumerateColNames());
      assertEquals(1, resultMatrixHTML0.getColCount());
      assertEquals(2, resultMatrixSignificance0.getDefaultStdDevPrec());
  }

  @Test
  public void test21()  throws Throwable  {
      ResultMatrixLatex resultMatrixLatex0 = new ResultMatrixLatex(5, 5);
      assertNotNull(resultMatrixLatex0);
      
      double double0 = resultMatrixLatex0.getStdDev(5, 0);
      assertEquals(2, resultMatrixLatex0.getMeanPrec());
      assertEquals(0, resultMatrixLatex0.getMeanWidth());
      assertEquals(0.0, double0, 0.01D);
      assertEquals("\\begin{table}[thb]\n\\caption{\\label{labelname}Table Caption}\n\\footnotesize\n{\\centering \\begin{tabular}{lrr@{\\hspace{0.1cm}}cr@{\\hspace{0.1cm}}cr@{\\hspace{0.1cm}}cr@{\\hspace{0.1cm}}c}\n\\\\\n\\hline\nDataset & (1)& (2) & & (3) & & (4) & & (5) & \\\\\n\\hline\nrow0 &     &     &         &     &         &     &         &     &        \\\\\nrow1 &     &     &         &     &         &     &         &     &        \\\\\nrow2 &     &     &         &     &         &     &         &     &        \\\\\nrow3 &     &     &         &     &         &     &         &     &        \\\\\nrow4 &     &     &         &     &         &     &         &     &        \\\\\n\\hline\n\\multicolumn{10}{c}{$\\circ$, $\\bullet$ statistically significant improvement or degradation}\\\\\n\\end{tabular} \\footnotesize \\par}\n\\end{table}\n", resultMatrixLatex0.toString());
      assertEquals(2, resultMatrixLatex0.getStdDevPrec());
      assertEquals(0, resultMatrixLatex0.getDefaultStdDevWidth());
      assertEquals(false, resultMatrixLatex0.getDefaultRemoveFilterName());
  }

  @Test
  public void test22()  throws Throwable  {
      ResultMatrixGnuPlot resultMatrixGnuPlot0 = new ResultMatrixGnuPlot();
      assertNotNull(resultMatrixGnuPlot0);
      
      resultMatrixGnuPlot0.setSignificance(12, 1378, 1378);
      assertEquals(2, resultMatrixGnuPlot0.getMeanPrec());
      assertEquals(2, resultMatrixGnuPlot0.getDefaultStdDevPrec());
      assertEquals(50, resultMatrixGnuPlot0.getRowNameWidth());
      assertEquals("\n##################\n# file: plot.dat #\n##################\n# generated by WEKA 3.7.7\n# contains the data for the plot\n\n# key for the x-axis\n# 1 - row0\n\n# data for the plot\n1 ''\n#######\n# end #\n#######\n\n##################\n# file: plot.scr #\n##################\n# generated by WEKA 3.7.7\n# script to plot the data\n\n# display it in a window:\nset terminal x11\nset output\n\n# to display all data rows:\nset xrange [0:2]\n\n# axis labels, e.g.:\n#set xlabel \"Datasets\"\n#set ylabel \"Accuracy in %\"\n\n# the plot commands\nplot \"plot.dat\" using 1:2 with lines title \"col0\"\n\n# generate ps:\n#set terminal postscript\n#set output \"plot.ps\"\n#replot\n\n# generate png:\n#set terminal png size 800,600\n#set output \"plot.png\"\n#replot\n\n# wait for user to hit <Return>\npause -1\n#######\n# end #\n#######\n", resultMatrixGnuPlot0.toString());
      assertEquals(1, resultMatrixGnuPlot0.getColCount());
      assertEquals(0, resultMatrixGnuPlot0.getMeanWidth());
      assertEquals(0, resultMatrixGnuPlot0.getStdDevWidth());
      assertEquals(false, resultMatrixGnuPlot0.getRemoveFilterName());
  }

  @Test
  public void test23()  throws Throwable  {
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance();
      assertNotNull(resultMatrixSignificance0);
      
      int int0 = resultMatrixSignificance0.getSignificance((-1620), 0);
      assertEquals(false, resultMatrixSignificance0.getShowAverage());
      assertEquals(0, int0);
      assertEquals(1, resultMatrixSignificance0.getVisibleColCount());
      assertEquals(0, resultMatrixSignificance0.getMeanWidth());
      assertEquals(0, resultMatrixSignificance0.getDefaultCountWidth());
      assertEquals(2, resultMatrixSignificance0.getMeanPrec());
      assertEquals(0, resultMatrixSignificance0.getDefaultSignificanceWidth());
      assertEquals(2, resultMatrixSignificance0.getStdDevPrec());
      assertEquals("Dataset (1)\n-----------\nrow0       \n", resultMatrixSignificance0.toString());
      assertEquals(0, resultMatrixSignificance0.getStdDevWidth());
  }

  @Test
  public void test24()  throws Throwable  {
      ResultMatrixGnuPlot resultMatrixGnuPlot0 = new ResultMatrixGnuPlot();
      assertNotNull(resultMatrixGnuPlot0);
      
      int[] intArray0 = new int[4];
      resultMatrixGnuPlot0.setColOrder(intArray0);
      assertEquals(false, resultMatrixGnuPlot0.getRemoveFilterName());
      assertEquals(2, resultMatrixGnuPlot0.getStdDevPrec());
      assertEquals(50, resultMatrixGnuPlot0.getRowNameWidth());
      assertEquals("\n##################\n# file: plot.dat #\n##################\n# generated by WEKA 3.7.7\n# contains the data for the plot\n\n# key for the x-axis\n# 1 - row0\n\n# data for the plot\n1 ''\n#######\n# end #\n#######\n\n##################\n# file: plot.scr #\n##################\n# generated by WEKA 3.7.7\n# script to plot the data\n\n# display it in a window:\nset terminal x11\nset output\n\n# to display all data rows:\nset xrange [0:2]\n\n# axis labels, e.g.:\n#set xlabel \"Datasets\"\n#set ylabel \"Accuracy in %\"\n\n# the plot commands\nplot \"plot.dat\" using 1:2 with lines title \"col0\"\n\n# generate ps:\n#set terminal postscript\n#set output \"plot.ps\"\n#replot\n\n# generate png:\n#set terminal png size 800,600\n#set output \"plot.png\"\n#replot\n\n# wait for user to hit <Return>\npause -1\n#######\n# end #\n#######\n", resultMatrixGnuPlot0.toString());
      assertEquals(0, resultMatrixGnuPlot0.getSignificanceWidth());
      assertEquals(0, resultMatrixGnuPlot0.getDefaultMeanWidth());
      assertEquals(0, resultMatrixGnuPlot0.getDefaultCountWidth());
      assertEquals(1, resultMatrixGnuPlot0.getVisibleColCount());
      assertEquals(2, resultMatrixGnuPlot0.getMeanPrec());
      assertEquals(2, resultMatrixGnuPlot0.getDefaultStdDevPrec());
  }

  @Test
  public void test25()  throws Throwable  {
      ResultMatrixPlainText resultMatrixPlainText0 = new ResultMatrixPlainText();
      assertNotNull(resultMatrixPlainText0);
      
      ResultMatrixHTML resultMatrixHTML0 = new ResultMatrixHTML((ResultMatrix) resultMatrixPlainText0);
      assertNotNull(resultMatrixHTML0);
      
      String string0 = resultMatrixHTML0.toStringMatrix();
      assertEquals("<table border=\"1\" cellpadding=\"3\" cellspacing=\"0\">\n   <tr><td><b>Dataset</b></td><td align=\"center\" colspan=\"1\"><b>(1) col0</b></td></tr>\n   <tr><td>row0</td><td align=\"right\">&nbsp;</td></tr>\n   <tr><td>(v/ /*)</td><td align=\"right\">&nbsp;</td></tr>\n</table>\n", string0);
      assertEquals(25, resultMatrixHTML0.getRowNameWidth());
      assertNotNull(string0);
  }

  @Test
  public void test26()  throws Throwable  {
      ResultMatrixPlainText resultMatrixPlainText0 = new ResultMatrixPlainText(0, 1240);
      assertNotNull(resultMatrixPlainText0);
      
      boolean boolean0 = resultMatrixPlainText0.isMean(343);
      assertEquals(2, resultMatrixPlainText0.getDefaultMeanPrec());
      assertEquals("Key:\n", resultMatrixPlainText0.toStringKey());
      assertEquals(true, resultMatrixPlainText0.getPrintRowNames());
      assertEquals(false, boolean0);
      assertEquals(0, resultMatrixPlainText0.getDefaultStdDevWidth());
      assertEquals(0, resultMatrixPlainText0.getMeanWidth());
      assertEquals(25, resultMatrixPlainText0.getRowNameWidth());
      assertEquals(1240, resultMatrixPlainText0.getVisibleRowCount());
      assertEquals(2, resultMatrixPlainText0.getStdDevPrec());
      assertEquals(true, resultMatrixPlainText0.getEnumerateColNames());
  }

  @Test
  public void test27()  throws Throwable  {
      ResultMatrixGnuPlot resultMatrixGnuPlot0 = new ResultMatrixGnuPlot(8, 8);
      assertNotNull(resultMatrixGnuPlot0);
      
      boolean boolean0 = resultMatrixGnuPlot0.isSignificance(10);
      assertEquals("Key:\n1 col0\n2 col1\n3 col2\n4 col3\n5 col4\n6 col5\n7 col6\n8 col7\n", resultMatrixGnuPlot0.toStringKey());
      assertEquals(2, resultMatrixGnuPlot0.getMeanPrec());
      assertEquals(2, resultMatrixGnuPlot0.getStdDevPrec());
      assertEquals("\n##################\n# file: plot.dat #\n##################\n# generated by WEKA 3.7.7\n# contains the data for the plot\n\n# key for the x-axis\n# 1 - row0\n# 2 - row1\n# 3 - row2\n# 4 - row3\n# 5 - row4\n# 6 - row5\n# 7 - row6\n# 8 - row7\n\n# data for the plot\n1 '' '' '' '' '' '' '' ''\n2 '' '' '' '' '' '' '' ''\n3 '' '' '' '' '' '' '' ''\n4 '' '' '' '' '' '' '' ''\n5 '' '' '' '' '' '' '' ''\n6 '' '' '' '' '' '' '' ''\n7 '' '' '' '' '' '' '' ''\n8 '' '' '' '' '' '' '' ''\n#######\n# end #\n#######\n\n##################\n# file: plot.scr #\n##################\n# generated by WEKA 3.7.7\n# script to plot the data\n\n# display it in a window:\nset terminal x11\nset output\n\n# to display all data rows:\nset xrange [0:9]\n\n# axis labels, e.g.:\n#set xlabel \"Datasets\"\n#set ylabel \"Accuracy in %\"\n\n# the plot commands\nplot \"plot.dat\" using 1:2 with lines title \"col0\"\nreplot \"plot.dat\" using 1:3 with lines title \"col1\"\nreplot \"plot.dat\" using 1:4 with lines title \"col2\"\nreplot \"plot.dat\" using 1:5 with lines title \"col3\"\nreplot \"plot.dat\" using 1:6 with lines title \"col4\"\nreplot \"plot.dat\" using 1:7 with lines title \"col5\"\nreplot \"plot.dat\" using 1:8 with lines title \"col6\"\nreplot \"plot.dat\" using 1:9 with lines title \"col7\"\n\n# generate ps:\n#set terminal postscript\n#set output \"plot.ps\"\n#replot\n\n# generate png:\n#set terminal png size 800,600\n#set output \"plot.png\"\n#replot\n\n# wait for user to hit <Return>\npause -1\n#######\n# end #\n#######\n", resultMatrixGnuPlot0.toString());
      assertEquals(0, resultMatrixGnuPlot0.getMeanWidth());
      assertEquals(0, resultMatrixGnuPlot0.getCountWidth());
      assertEquals(false, resultMatrixGnuPlot0.getRemoveFilterName());
      assertEquals(false, boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance();
      assertNotNull(resultMatrixSignificance0);
      
      resultMatrixSignificance0.addHeader(")", "");
      assertEquals("Dataset (1)\n-----------\nrow0       \n", resultMatrixSignificance0.toStringMatrix());
      assertEquals(2, resultMatrixSignificance0.getStdDevPrec());
      assertEquals(false, resultMatrixSignificance0.getDefaultRemoveFilterName());
      assertEquals("): \n", resultMatrixSignificance0.toStringHeader());
      assertEquals(0, resultMatrixSignificance0.getDefaultSignificanceWidth());
      assertEquals(0, resultMatrixSignificance0.getStdDevWidth());
      assertEquals(2, resultMatrixSignificance0.getMeanPrec());
      assertEquals(2, resultMatrixSignificance0.getDefaultMeanPrec());
  }

  @Test
  public void test29()  throws Throwable  {
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance();
      assertNotNull(resultMatrixSignificance0);
      
      ResultMatrixCSV resultMatrixCSV0 = new ResultMatrixCSV((ResultMatrix) resultMatrixSignificance0);
      assertNotNull(resultMatrixCSV0);
      
      // Undeclared exception!
      try {
        resultMatrixCSV0.getHeader("(");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      ResultMatrixSignificance resultMatrixSignificance0 = new ResultMatrixSignificance();
      assertNotNull(resultMatrixSignificance0);
      
      int[][] intArray0 = new int[4][8];
      int[] intArray1 = new int[2];
      intArray0[0] = intArray1;
      // Undeclared exception!
      try {
        resultMatrixSignificance0.setRanking(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 4
         */
      }
  }
}
