/*
 * This file was automatically generated by EvoSuite
 */

package oasis.names.tc.ciq.xsdschema.xal._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.xsdschema.xal._2.AddressLine;
import oasis.names.tc.ciq.xsdschema.xal._2.PostalCode;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PostalCodeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      String string0 = postalCode_PostalCodeNumber0.getCode();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      Map<QName, String> map0 = postalCode_PostalCodeNumber0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  @Test
  public void test2()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      String string0 = postalCode_PostalCodeNumber0.getType();
      assertNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      String string0 = postalCode_PostalCodeNumber0.getContent();
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      postalCode_PostalCodeNumber0.setCode((String) null);
      assertNull(postalCode_PostalCodeNumber0.getCode());
  }

  @Test
  public void test5()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      postalCode_PostalCodeNumber0.setType((String) null);
      assertNull(postalCode_PostalCodeNumber0.getType());
  }

  @Test
  public void test6()  throws Throwable  {
      PostalCode.PostalCodeNumber postalCode_PostalCodeNumber0 = new PostalCode.PostalCodeNumber();
      postalCode_PostalCodeNumber0.setContent((String) null);
      assertNull(postalCode_PostalCodeNumber0.getType());
  }

  @Test
  public void test7()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      String string0 = postalCode0.getType();
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      Map<QName, String> map0 = postalCode0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  @Test
  public void test9()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      postalCode0.setType((String) null);
      assertNull(postalCode0.getType());
  }

  @Test
  public void test10()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      postalCode0.setPostTown((PostalCode.PostTown) null);
      assertNull(postalCode0.getType());
  }

  @Test
  public void test11()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      PostalCode.PostTown postalCode_PostTown0 = postalCode0.getPostTown();
      assertNull(postalCode_PostTown0);
  }

  @Test
  public void test12()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      postalCode_PostTown0.setPostTownSuffix((PostalCode.PostTown.PostTownSuffix) null);
      assertNull(postalCode_PostTown0.getType());
  }

  @Test
  public void test13()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      Map<QName, String> map0 = postalCode_PostTown0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  @Test
  public void test14()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = postalCode_PostTown0.getPostTownSuffix();
      assertNull(postalCode_PostTown_PostTownSuffix0);
  }

  @Test
  public void test15()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      postalCode_PostTown0.setType((String) null);
      assertNull(postalCode_PostTown0.getType());
  }

  @Test
  public void test16()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      String string0 = postalCode_PostTown0.getType();
      assertNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      String string0 = postalCode_PostTown_PostTownSuffix0.getContent();
      assertNull(string0);
  }

  @Test
  public void test18()  throws Throwable  {
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      String string0 = postalCode_PostTown_PostTownSuffix0.getCode();
      assertNull(string0);
  }

  @Test
  public void test19()  throws Throwable  {
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      postalCode_PostTown_PostTownSuffix0.setContent((String) null);
      assertNull(postalCode_PostTown_PostTownSuffix0.getContent());
  }

  @Test
  public void test20()  throws Throwable  {
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      postalCode_PostTown_PostTownSuffix0.setCode((String) null);
      assertNull(postalCode_PostTown_PostTownSuffix0.getContent());
  }

  @Test
  public void test21()  throws Throwable  {
      PostalCode.PostTown.PostTownSuffix postalCode_PostTown_PostTownSuffix0 = new PostalCode.PostTown.PostTownSuffix();
      Map<QName, String> map0 = postalCode_PostTown_PostTownSuffix0.getOtherAttributes();
      assertEquals(0, map0.size());
  }

  @Test
  public void test22()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      postalCode_PostalCodeNumberExtension0.setType((String) null);
      assertNull(postalCode_PostalCodeNumberExtension0.getType());
  }

  @Test
  public void test23()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      postalCode_PostalCodeNumberExtension0.setContent((String) null);
      assertNull(postalCode_PostalCodeNumberExtension0.getCode());
  }

  @Test
  public void test24()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      String string0 = postalCode_PostalCodeNumberExtension0.getType();
      assertNull(string0);
  }

  @Test
  public void test25()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      String string0 = postalCode_PostalCodeNumberExtension0.getNumberExtensionSeparator();
      assertNull(string0);
  }

  @Test
  public void test26()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      postalCode_PostalCodeNumberExtension0.setCode((String) null);
      assertNull(postalCode_PostalCodeNumberExtension0.getContent());
  }

  @Test
  public void test27()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      String string0 = postalCode_PostalCodeNumberExtension0.getContent();
      assertNull(string0);
  }

  @Test
  public void test28()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      String string0 = postalCode_PostalCodeNumberExtension0.getCode();
      assertNull(string0);
  }

  @Test
  public void test29()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      postalCode_PostalCodeNumberExtension0.setNumberExtensionSeparator((String) null);
      assertNull(postalCode_PostalCodeNumberExtension0.getContent());
  }

  @Test
  public void test30()  throws Throwable  {
      PostalCode.PostalCodeNumberExtension postalCode_PostalCodeNumberExtension0 = new PostalCode.PostalCodeNumberExtension();
      Map<QName, String> map0 = postalCode_PostalCodeNumberExtension0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  @Test
  public void test31()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      List<AddressLine> list0 = postalCode0.getAddressLine();
      List<AddressLine> list1 = postalCode0.getAddressLine();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  @Test
  public void test32()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      List<PostalCode.PostalCodeNumber> list0 = postalCode0.getPostalCodeNumber();
      List<PostalCode.PostalCodeNumber> list1 = postalCode0.getPostalCodeNumber();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  @Test
  public void test33()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      List<PostalCode.PostalCodeNumberExtension> list0 = postalCode0.getPostalCodeNumberExtension();
      List<PostalCode.PostalCodeNumberExtension> list1 = postalCode0.getPostalCodeNumberExtension();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  @Test
  public void test34()  throws Throwable  {
      PostalCode postalCode0 = new PostalCode();
      List<Object> list0 = postalCode0.getAny();
      List<Object> list1 = postalCode0.getAny();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  @Test
  public void test35()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      List<AddressLine> list0 = postalCode_PostTown0.getAddressLine();
      List<AddressLine> list1 = postalCode_PostTown0.getAddressLine();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  @Test
  public void test36()  throws Throwable  {
      PostalCode.PostTown postalCode_PostTown0 = new PostalCode.PostTown();
      List<PostalCode.PostTown.PostTownName> list0 = postalCode_PostTown0.getPostTownName();
      List<PostalCode.PostTown.PostTownName> list1 = postalCode_PostTown0.getPostTownName();
      assertNotNull(list1);
      assertSame(list1, list0);
  }
}
