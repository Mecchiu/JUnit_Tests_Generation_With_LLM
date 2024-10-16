/*
 * This file was automatically generated by EvoSuite
 */

package weka.associations;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.junit.BeforeClass;
import weka.associations.AbstractAssociator;
import weka.associations.AssociationRule;
import weka.associations.Associator;
import weka.associations.BinaryItem;
import weka.associations.DefaultAssociationRule;
import weka.associations.FPGrowth;
import weka.associations.Item;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SelectedTag;
import weka.core.SparseInstance;
import weka.core.Tag;
import weka.core.converters.ArffLoader;

@RunWith(EvoSuiteRunner.class)
public class FPGrowthEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ArrayList<BinaryItem> arrayList0 = new ArrayList<BinaryItem>();
      FPGrowth.FrequentBinaryItemSet fPGrowth_FrequentBinaryItemSet0 = new FPGrowth.FrequentBinaryItemSet(arrayList0, (-390));
      assertNotNull(fPGrowth_FrequentBinaryItemSet0);
      
      FPGrowth.FrequentBinaryItemSet fPGrowth_FrequentBinaryItemSet1 = (FPGrowth.FrequentBinaryItemSet)fPGrowth_FrequentBinaryItemSet0.clone();
      assertNotNull(fPGrowth_FrequentBinaryItemSet1);
      assertEquals(": -390", fPGrowth_FrequentBinaryItemSet0.toString());
      assertEquals(-390, fPGrowth_FrequentBinaryItemSet1.getSupport());
  }

  @Test
  public void test1()  throws Throwable  {
      ArrayList<BinaryItem> arrayList0 = new ArrayList<BinaryItem>();
      FPGrowth.FrequentBinaryItemSet fPGrowth_FrequentBinaryItemSet0 = new FPGrowth.FrequentBinaryItemSet(arrayList0, 1501);
      fPGrowth_FrequentBinaryItemSet0.addItem((BinaryItem) null);
      // Undeclared exception!
      try {
        fPGrowth_FrequentBinaryItemSet0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ArrayList<BinaryItem> arrayList0 = new ArrayList<BinaryItem>();
      FPGrowth.FrequentBinaryItemSet fPGrowth_FrequentBinaryItemSet0 = new FPGrowth.FrequentBinaryItemSet(arrayList0, (-17));
      assertNotNull(fPGrowth_FrequentBinaryItemSet0);
      
      fPGrowth_FrequentBinaryItemSet0.numberOfItems();
      assertEquals(-17, fPGrowth_FrequentBinaryItemSet0.getSupport());
      assertEquals(": -17", fPGrowth_FrequentBinaryItemSet0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      ArrayList<BinaryItem> arrayList0 = new ArrayList<BinaryItem>();
      FPGrowth.FrequentBinaryItemSet fPGrowth_FrequentBinaryItemSet0 = new FPGrowth.FrequentBinaryItemSet(arrayList0, (-1771));
      assertNotNull(fPGrowth_FrequentBinaryItemSet0);
      
      fPGrowth_FrequentBinaryItemSet0.setSupport((-1771));
      assertEquals(-1771, fPGrowth_FrequentBinaryItemSet0.getSupport());
      assertEquals(": -1771", fPGrowth_FrequentBinaryItemSet0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      ArrayList<BinaryItem> arrayList0 = new ArrayList<BinaryItem>();
      FPGrowth.FrequentBinaryItemSet fPGrowth_FrequentBinaryItemSet0 = new FPGrowth.FrequentBinaryItemSet(arrayList0, 0);
      assertNotNull(fPGrowth_FrequentBinaryItemSet0);
      
      // Undeclared exception!
      try {
        fPGrowth_FrequentBinaryItemSet0.getItem(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode0 = new FPGrowth.FPTreeNode((FPGrowth.FPTreeNode) null, (BinaryItem) null);
      LinkedList<BinaryItem> linkedList0 = new LinkedList<BinaryItem>();
      HashMap<BinaryItem, FPGrowth.FPTreeRoot.Header> hashMap0 = new HashMap<BinaryItem, FPGrowth.FPTreeRoot.Header>();
      linkedList0.add((BinaryItem) null);
      fPGrowth_FPTreeNode0.addItemSet((Collection<BinaryItem>) linkedList0, (Map<BinaryItem, FPGrowth.FPTreeRoot.Header>) hashMap0, (-1));
      assertEquals(1, hashMap0.size());
      
      int int0 = fPGrowth_FPTreeNode0.assignIDs((-1));
      assertEquals(1, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      FPGrowth.FPTreeRoot.Header fPGrowth_FPTreeRoot_Header0 = new FPGrowth.FPTreeRoot.Header();
      List<FPGrowth.FPTreeNode> list0 = fPGrowth_FPTreeRoot_Header0.getHeaderList();
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test7()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      fPGrowth0.setOffDiskReportingFrequency((-10));
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
  }

  @Test
  public void test8()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.maxNumberOfItemsTipText();
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals("The maximum number of items to include in frequent item sets. -1 means no limit.", string0);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
  }

  @Test
  public void test9()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.metricTypeTipText();
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals("Set the type of metric by which to rank rules. Confidence is the proportion of the examples covered by the premise that are also covered by the consequence(Class association rules can only be mined using confidence). Lift is confidence divided by the proportion of all examples that are covered by the consequence. This is a measure of the importance of the association that is independent of support. Leverage is the proportion of additional examples covered by both the premise and consequence above those expected if the premise and consequence were independent of each other. The total number of examples that this represents is presented in brackets following the leverage. Conviction is another measure of departure from independence.", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.minMetricTipText();
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals("Minimum metric score. Consider only rules with scores higher than this value.", string0);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      // Undeclared exception!
      try {
        fPGrowth0.graph((FPGrowth.FPTreeRoot) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.globalInfo();
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals("Class implementing the FP-growth algorithm for finding large item sets without candidate generation. Iteratively reduces the minimum support until it finds the required number of rules with the given minimum metric. For more information see:\n\nJ. Han, J.Pei, Y. Yin: Mining frequent patterns without candidate generation. In: Proceedings of the 2000 ACM-SIGMID International Conference on Management of Data, 1-12, 2000.", string0);
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertNotNull(string0);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.findAllRulesForSupportLevelTipText();
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals("Find all rules that meet the lower bound on minimum support and the minimum metric constraint. Turning this mode on will disable the iterative support reduction procedure to find the specified number of rules.", string0);
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
  }

  @Test
  public void test14()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      fPGrowth0.setTransactionsMustContain(" #_$)");
      String[] stringArray0 = fPGrowth0.getOptions();
      fPGrowth0.setOptions(stringArray0);
      assertEquals(" #_$)", fPGrowth0.getTransactionsMustContain());
      assertEquals(2, fPGrowth0.getPositiveIndex());
  }

  @Test
  public void test15()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.lowerBoundMinSupportTipText();
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals("Lower bound for minimum support as a fraction or number of instances.", string0);
  }

  @Test
  public void test16()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.deltaTipText();
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals("Iteratively decrease support by this factor. Reduces support until min support is reached or required number of rules has been generated.", string0);
  }

  @Test
  public void test17()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      try {
        fPGrowth0.buildAssociations((Instances) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.upperBoundMinSupportTipText();
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals("Upper bound for minimum support as a fraction or number of instances. Start iteratively decreasing minimum support from this value.", string0);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
  }

  @Test
  public void test19()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String[] stringArray0 = fPGrowth0.getOptions();
      assertNotNull(stringArray0);
      
      AbstractAssociator.runAssociator((Associator) fPGrowth0, stringArray0);
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(2, fPGrowth0.getPositiveIndex());
  }

  @Test
  public void test20()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.transactionsMustContainTipText();
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals("Limit input to FPGrowth to those transactions (instances) that contain these items. Provide a comma separated list of attribute names.", string0);
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
  }

  @Test
  public void test21()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.useORForMustContainListTipText();
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals("Use OR instead of AND for transactions/rules must contain lists.", string0);
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
  }

  @Test
  public void test22()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.numRulesToFindTipText();
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals("The number of rules to output", string0);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
  }

  @Test
  public void test23()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      boolean boolean0 = fPGrowth0.canProduceRules();
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(true, boolean0);
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
  }

  @Test
  public void test24()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.rulesMustContainTipText();
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals("Only print rules that contain these items. Provide a comma separated list of attribute names.", string0);
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
  }

  @Test
  public void test25()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.getRevision();
      assertEquals("8034", string0);
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertNotNull(string0);
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
  }

  @Test
  public void test26()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      fPGrowth0.setRulesMustContain(" #_$)");
      String[] stringArray0 = fPGrowth0.getOptions();
      assertNotNull(stringArray0);
      
      fPGrowth0.setOptions(stringArray0);
      assertEquals(" #_$)", fPGrowth0.getRulesMustContain());
  }

  @Test
  public void test27()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.positiveIndexTipText();
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals("Set the index of binary valued attributes that is to be considered the positive index. Has no effect for sparse data (in this case the first index (i.e. non-zero values) is always treated as  positive. Also has no effect for unary valued attributes (i.e. when using the Weka Apriori-style format for market basket data, which uses missing value \"?\" to indicate absence of an item.", string0);
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
  }

  @Test
  public void test28()  throws Throwable  {
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode0 = new FPGrowth.FPTreeNode((FPGrowth.FPTreeNode) null, (BinaryItem) null);
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode1 = fPGrowth_FPTreeNode0.getParent();
      assertNull(fPGrowth_FPTreeNode1);
  }

  @Test
  public void test29()  throws Throwable  {
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode0 = new FPGrowth.FPTreeNode((FPGrowth.FPTreeNode) null, (BinaryItem) null);
      int int0 = fPGrowth_FPTreeNode0.getProjectedCount(1024);
      assertEquals(0, int0);
  }

  @Test
  public void test30()  throws Throwable  {
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode0 = new FPGrowth.FPTreeNode((FPGrowth.FPTreeNode) null, (BinaryItem) null);
      fPGrowth_FPTreeNode0.removeProjectedCount(0);
  }

  @Test
  public void test31()  throws Throwable  {
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode0 = new FPGrowth.FPTreeNode((FPGrowth.FPTreeNode) null, (BinaryItem) null);
      BinaryItem binaryItem0 = fPGrowth_FPTreeNode0.getItem();
      assertNull(binaryItem0);
  }

  @Test
  public void test32()  throws Throwable  {
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode0 = new FPGrowth.FPTreeNode((FPGrowth.FPTreeNode) null, (BinaryItem) null);
      // Undeclared exception!
      try {
        fPGrowth_FPTreeNode0.toString(1024);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test33()  throws Throwable  {
      FPGrowth.FrequentItemSets fPGrowth_FrequentItemSets0 = new FPGrowth.FrequentItemSets(0);
      fPGrowth_FrequentItemSets0.size();
      assertEquals(0, fPGrowth_FrequentItemSets0.getNumberOfTransactions());
  }

  @Test
  public void test34()  throws Throwable  {
      FPGrowth.FrequentItemSets fPGrowth_FrequentItemSets0 = new FPGrowth.FrequentItemSets((-197));
      // Undeclared exception!
      try {
        fPGrowth_FrequentItemSets0.getItemSet((-197));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test35()  throws Throwable  {
      FPGrowth.FrequentItemSets fPGrowth_FrequentItemSets0 = new FPGrowth.FrequentItemSets(6);
      int int0 = fPGrowth_FrequentItemSets0.getNumberOfTransactions();
      assertEquals(6, int0);
  }

  @Test
  public void test36()  throws Throwable  {
      FPGrowth.FrequentItemSets fPGrowth_FrequentItemSets0 = new FPGrowth.FrequentItemSets((-17));
      ArrayList<BinaryItem> arrayList0 = new ArrayList<BinaryItem>();
      FPGrowth.FrequentBinaryItemSet fPGrowth_FrequentBinaryItemSet0 = new FPGrowth.FrequentBinaryItemSet(arrayList0, (-17));
      fPGrowth_FrequentItemSets0.addItemSet(fPGrowth_FrequentBinaryItemSet0);
      String string0 = fPGrowth_FrequentItemSets0.toString((-17));
      assertEquals(1, fPGrowth_FrequentItemSets0.size());
      assertEquals("1 frequent item sets found:\n\n: -17\n", string0);
  }

  @Test
  public void test37()  throws Throwable  {
      FPGrowth.FrequentItemSets fPGrowth_FrequentItemSets0 = new FPGrowth.FrequentItemSets((-108));
      DefaultAssociationRule.METRIC_TYPE defaultAssociationRule_METRIC_TYPE0 = DefaultAssociationRule.METRIC_TYPE.CONVICTION;
      ArrayList<BinaryItem> arrayList0 = new ArrayList<BinaryItem>();
      FPGrowth.FrequentBinaryItemSet fPGrowth_FrequentBinaryItemSet0 = new FPGrowth.FrequentBinaryItemSet(arrayList0, (-108));
      Attribute attribute0 = new Attribute("No frequent items sets found!", (List<String>) null);
      BinaryItem binaryItem0 = new BinaryItem(attribute0, (-108));
      arrayList0.add(binaryItem0);
      fPGrowth_FrequentItemSets0.addItemSet(fPGrowth_FrequentBinaryItemSet0);
      fPGrowth_FrequentItemSets0.addItemSet(fPGrowth_FrequentBinaryItemSet0);
      FPGrowth.generateRulesBruteForce(fPGrowth_FrequentItemSets0, defaultAssociationRule_METRIC_TYPE0, (double) (-108), (-108), (-108), (-108));
      assertEquals(2, fPGrowth_FrequentItemSets0.size());
      assertEquals(-108, fPGrowth_FrequentItemSets0.getNumberOfTransactions());
  }

  @Test
  public void test38()  throws Throwable  {
      FPGrowth.FrequentItemSets fPGrowth_FrequentItemSets0 = new FPGrowth.FrequentItemSets((-108));
      String string0 = fPGrowth_FrequentItemSets0.toString((-108));
      assertEquals("No frequent items sets found!", string0);
      assertEquals(-108, fPGrowth_FrequentItemSets0.getNumberOfTransactions());
      assertNotNull(string0);
  }

  @Test
  public void test39()  throws Throwable  {
      FPGrowth.FrequentItemSets fPGrowth_FrequentItemSets0 = new FPGrowth.FrequentItemSets(6);
      ArrayList<BinaryItem> arrayList0 = new ArrayList<BinaryItem>();
      FPGrowth.FrequentBinaryItemSet fPGrowth_FrequentBinaryItemSet0 = new FPGrowth.FrequentBinaryItemSet(arrayList0, 6);
      fPGrowth_FrequentItemSets0.addItemSet(fPGrowth_FrequentBinaryItemSet0);
      String string0 = fPGrowth_FrequentItemSets0.toString(6);
      assertEquals(1, fPGrowth_FrequentItemSets0.size());
      assertEquals("1 frequent item sets found , displaying 6:\n\n: 6\n", string0);
  }

  @Test
  public void test40()  throws Throwable  {
      FPGrowth.FPTreeRoot.Header fPGrowth_FPTreeRoot_Header0 = new FPGrowth.FPTreeRoot.Header();
      FPGrowth.ShadowCounts fPGrowth_ShadowCounts0 = fPGrowth_FPTreeRoot_Header0.getProjectedCounts();
      // Undeclared exception!
      try {
        fPGrowth_ShadowCounts0.getCount((-17));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test41()  throws Throwable  {
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode0 = new FPGrowth.FPTreeNode((FPGrowth.FPTreeNode) null, (BinaryItem) null);
      fPGrowth_FPTreeNode0.increaseProjectedCount(1024, 1024);
  }

  @Test
  public void test42()  throws Throwable  {
      FPGrowth.FPTreeRoot.Header fPGrowth_FPTreeRoot_Header0 = new FPGrowth.FPTreeRoot.Header();
      FPGrowth.ShadowCounts fPGrowth_ShadowCounts0 = fPGrowth_FPTreeRoot_Header0.getProjectedCounts();
      // Undeclared exception!
      try {
        fPGrowth_ShadowCounts0.increaseCount((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test43()  throws Throwable  {
      FPGrowth.FPTreeRoot.Header fPGrowth_FPTreeRoot_Header0 = new FPGrowth.FPTreeRoot.Header();
      FPGrowth.ShadowCounts fPGrowth_ShadowCounts0 = fPGrowth_FPTreeRoot_Header0.getProjectedCounts();
      fPGrowth_ShadowCounts0.increaseCount(0, 0);
      fPGrowth_ShadowCounts0.removeCount(0);
  }

  @Test
  public void test44()  throws Throwable  {
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode0 = new FPGrowth.FPTreeNode((FPGrowth.FPTreeNode) null, (BinaryItem) null);
      int int0 = fPGrowth_FPTreeNode0.assignIDs((-1));
      assertEquals(0, int0);
  }

  @Test
  public void test45()  throws Throwable  {
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode0 = new FPGrowth.FPTreeNode((FPGrowth.FPTreeNode) null, (BinaryItem) null);
      fPGrowth_FPTreeNode0.graphFPTree((StringBuffer) null);
  }

  @Test
  public void test46()  throws Throwable  {
      FPGrowth.FPTreeNode fPGrowth_FPTreeNode0 = new FPGrowth.FPTreeNode((FPGrowth.FPTreeNode) null, (BinaryItem) null);
      LinkedList<BinaryItem> linkedList0 = new LinkedList<BinaryItem>();
      HashMap<BinaryItem, FPGrowth.FPTreeRoot.Header> hashMap0 = new HashMap<BinaryItem, FPGrowth.FPTreeRoot.Header>();
      linkedList0.add((BinaryItem) null);
      fPGrowth_FPTreeNode0.addItemSet((Collection<BinaryItem>) linkedList0, (Map<BinaryItem, FPGrowth.FPTreeRoot.Header>) hashMap0, 91);
      // Undeclared exception!
      try {
        fPGrowth_FPTreeNode0.graphFPTree((StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test47()  throws Throwable  {
      FPGrowth.FrequentItemSets fPGrowth_FrequentItemSets0 = new FPGrowth.FrequentItemSets((-108));
      DefaultAssociationRule.METRIC_TYPE defaultAssociationRule_METRIC_TYPE0 = DefaultAssociationRule.METRIC_TYPE.CONVICTION;
      ArrayList<BinaryItem> arrayList0 = new ArrayList<BinaryItem>();
      FPGrowth.FrequentBinaryItemSet fPGrowth_FrequentBinaryItemSet0 = new FPGrowth.FrequentBinaryItemSet(arrayList0, (-108));
      Attribute attribute0 = new Attribute("No frequent items sets found!", (List<String>) null);
      BinaryItem binaryItem0 = new BinaryItem(attribute0, (-108));
      arrayList0.add(binaryItem0);
      fPGrowth_FrequentItemSets0.addItemSet(fPGrowth_FrequentBinaryItemSet0);
      fPGrowth_FrequentBinaryItemSet0.addItem(binaryItem0);
      // Undeclared exception!
      try {
        FPGrowth.generateRulesBruteForce(fPGrowth_FrequentItemSets0, defaultAssociationRule_METRIC_TYPE0, (double) (-108), (-108), (-108), (-108));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test48()  throws Throwable  {
      FPGrowth.FrequentItemSets fPGrowth_FrequentItemSets0 = new FPGrowth.FrequentItemSets(0);
      DefaultAssociationRule.METRIC_TYPE defaultAssociationRule_METRIC_TYPE0 = DefaultAssociationRule.METRIC_TYPE.LIFT;
      List<AssociationRule> list0 = FPGrowth.generateRulesBruteForce(fPGrowth_FrequentItemSets0, defaultAssociationRule_METRIC_TYPE0, (double) 0, 0, 0, 0);
      assertNotNull(list0);
      
      ArrayList<Item> arrayList0 = new ArrayList<Item>();
      List<AssociationRule> list1 = FPGrowth.pruneRules(list0, arrayList0, true);
      assertNotNull(list1);
      assertEquals(0, fPGrowth_FrequentItemSets0.getNumberOfTransactions());
  }

  @Test
  public void test49()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("<E*W)H~m^", arrayList0, 220);
      SparseInstance sparseInstance0 = new SparseInstance(220);
      DenseInstance denseInstance0 = new DenseInstance((Instance) sparseInstance0);
      instances0.add((Instance) denseInstance0);
      ArrayList<BinaryItem> arrayList1 = fPGrowth0.getSingletons(instances0);
      assertNotNull(arrayList1);
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
  }

  @Test
  public void test50()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      ArffLoader arffLoader0 = new ArffLoader();
      try {
        fPGrowth0.getSingletons((Object) arffLoader0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * No source has been specified
         */
      }
  }

  @Test
  public void test51()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      try {
        fPGrowth0.getSingletons((Instances) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test52()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("    attValues = new FastVector();\n", (List<String>) null, 592);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("    attValues = new FastVector();\n", arrayList0, 592);
      ArrayList<BinaryItem> arrayList1 = fPGrowth0.getSingletons(instances0);
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertNotNull(arrayList1);
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(1, arrayList1.size());
  }

  @Test
  public void test53()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      Tag[] tagArray0 = new Tag[6];
      Tag tag0 = new Tag();
      tagArray0[0] = tag0;
      tagArray0[1] = tagArray0[0];
      Tag tag1 = new Tag((-1771), "", "", false);
      tagArray0[2] = tag1;
      SelectedTag selectedTag0 = new SelectedTag("", tagArray0);
      fPGrowth0.setMetricType(selectedTag0);
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
  }

  @Test
  public void test54()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String[] stringArray0 = fPGrowth0.getRuleMetricNames();
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertNotNull(stringArray0);
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
  }

  @Test
  public void test55()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      
      String[] stringArray0 = new String[10];
      stringArray0[0] = "8034";
      stringArray0[1] = "8034";
      stringArray0[2] = "8034";
      stringArray0[3] = "8034";
      stringArray0[4] = "8034";
      stringArray0[5] = "8034";
      stringArray0[6] = "8034";
      stringArray0[7] = "8034";
      stringArray0[8] = "8034";
      stringArray0[9] = "8034";
      fPGrowth0.setOptions(stringArray0);
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
  }

  @Test
  public void test56()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      fPGrowth0.setFindAllRulesForSupportLevel(true);
      fPGrowth0.getOptions();
      assertEquals(true, fPGrowth0.getFindAllRulesForSupportLevel());
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
  }

  @Test
  public void test57()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      
      fPGrowth0.setUseORForMustContainList(true);
      fPGrowth0.getOptions();
      assertEquals(true, fPGrowth0.getUseORForMustContainList());
      assertEquals(10, fPGrowth0.getNumRulesToFind());
  }

  @Test
  public void test58()  throws Throwable  {
      FPGrowth fPGrowth0 = new FPGrowth();
      String string0 = fPGrowth0.toString();
      assertEquals(false, fPGrowth0.getUseORForMustContainList());
      assertEquals(-1, fPGrowth0.getMaxNumberOfItems());
      assertEquals(2, fPGrowth0.getPositiveIndex());
      assertEquals(0.1, fPGrowth0.getLowerBoundMinSupport(), 0.01D);
      assertEquals(0.9, fPGrowth0.getMinMetric(), 0.01D);
      assertEquals(false, fPGrowth0.getFindAllRulesForSupportLevel());
      assertNotNull(string0);
      assertEquals(0.05, fPGrowth0.getDelta(), 0.01D);
      assertEquals(1.0, fPGrowth0.getUpperBoundMinSupport(), 0.01D);
      assertEquals(10, fPGrowth0.getNumRulesToFind());
      assertEquals("FPGrowth hasn't been trained yet!", string0);
  }
}
