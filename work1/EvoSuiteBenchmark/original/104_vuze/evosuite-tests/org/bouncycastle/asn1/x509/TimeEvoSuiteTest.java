/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1.x509;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Date;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Time;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TimeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Date date0 = new Date();
      Time time0 = new Time(date0);
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject(true, 5, (DEREncodable) time0);
      Time.getInstance((ASN1TaggedObject) dERTaggedObject0, true);
      assertEquals("Tue Jul 02 02:43:19 BST 2013", date0.toString());
      assertEquals(19, date0.getSeconds());
  }

  @Test
  public void test1()  throws Throwable  {
      Date date0 = new Date(36028797018963970L);
      Time time0 = new Time(date0);
      assertNotNull(time0);
      
      String string0 = time0.toString();
      assertEquals("11436770215115603GMT+00:00", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Date date0 = new Date();
      DERGeneralizedTime dERGeneralizedTime0 = new DERGeneralizedTime(date0);
      Time time0 = Time.getInstance((Object) dERGeneralizedTime0);
      time0.getDate();
      assertEquals(1372729400502L, date0.getTime());
  }

  @Test
  public void test3()  throws Throwable  {
      Time time0 = null;
      try {
        time0 = new Time((DERObject) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * unknown object passed to Time
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Date date0 = new Date(72057594037927936L);
      Time time0 = new Time(date0);
      assertNotNull(time0);
      
      Time time1 = Time.getInstance((Object) time0);
      assertNotNull(time1);
      assertEquals("22853840402235207GMT+00:00", time1.getTime());
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try {
        Time.getInstance((Object) "11436770215115603GMT+00:00");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * unknown object in factory
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Date date0 = new Date(1L);
      Time time0 = new Time(date0);
      assertNotNull(time0);
      
      String string0 = time0.getTime();
      assertEquals("19700101000000GMT+00:00", string0);
      assertNotNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Date date0 = new Date(1L);
      Time time0 = new Time(date0);
      assertNotNull(time0);
      
      Date date1 = time0.getDate();
      assertNotNull(date1);
      assertEquals("19700101000000GMT+00:00", time0.getTime());
      assertEquals(-60, date1.getTimezoneOffset());
  }
}
