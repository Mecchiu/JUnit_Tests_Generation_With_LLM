/*
 * This file was automatically generated by EvoSuite
 */

package weka.gui.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;
import weka.associations.AssociationRule;
import weka.associations.AssociationRules;
import weka.gui.beans.BatchAssociationRulesEvent;

@RunWith(EvoSuiteRunner.class)
public class BatchAssociationRulesEventEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      LinkedList<AssociationRule> linkedList0 = new LinkedList<AssociationRule>();
      AssociationRules associationRules0 = new AssociationRules((List<AssociationRule>) linkedList0);
      BatchAssociationRulesEvent batchAssociationRulesEvent0 = new BatchAssociationRulesEvent(object0, associationRules0);
      AssociationRules associationRules1 = batchAssociationRulesEvent0.getRules();
      assertSame(associationRules1, associationRules0);
  }
}
