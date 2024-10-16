/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.core.residue.aa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.jcvi.jillion.core.residue.aa.AminoAcid;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AminoAcidEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AminoAcid aminoAcid0 = AminoAcid.Lysine;
      String string0 = aminoAcid0.get3LetterAbbreviation();
      assertEquals("Lys", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      AminoAcid aminoAcid0 = AminoAcid.Lysine;
      String string0 = aminoAcid0.toString();
      assertEquals("K", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        AminoAcid.parse((Character) '\u0082');
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * \u0082 is not a valid Amino Acid
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      AminoAcid aminoAcid0 = AminoAcid.Lysine;
      char char0 = aminoAcid0.asChar();
      assertEquals('K', char0);
  }

  @Test
  public void test4()  throws Throwable  {
      AminoAcid aminoAcid0 = AminoAcid.Lysine;
      String string0 = aminoAcid0.getName();
      assertEquals("Lysine", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      AminoAcid aminoAcid0 = AminoAcid.Lysine;
      byte byte0 = aminoAcid0.getOrdinalAsByte();
      assertEquals((byte)2, byte0);
  }

  @Test
  public void test6()  throws Throwable  {
      AminoAcid aminoAcid0 = AminoAcid.parse("Lysine");
      assertEquals(AminoAcid.Lysine, aminoAcid0);
  }

  @Test
  public void test7()  throws Throwable  {
      LinkedList<AminoAcid> linkedList0 = new LinkedList<AminoAcid>();
      AminoAcid aminoAcid0 = AminoAcid.Arginine;
      linkedList0.add(aminoAcid0);
      String string0 = AminoAcid.convertToString((List<AminoAcid>) linkedList0);
      assertEquals("R", string0);
      assertNotNull(string0);
  }
}
