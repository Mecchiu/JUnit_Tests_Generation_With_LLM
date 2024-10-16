/*
 * This file was automatically generated by EvoSuite
 */

package oasis.names.tc.ciq.xsdschema.xal._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Map;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.xsdschema.xal._2.ThoroughfareNameType;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ThoroughfareNameTypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ThoroughfareNameType thoroughfareNameType0 = new ThoroughfareNameType();
      Map<QName, String> map0 = thoroughfareNameType0.getOtherAttributes();
      assertEquals(true, map0.isEmpty());
  }

  @Test
  public void test1()  throws Throwable  {
      ThoroughfareNameType thoroughfareNameType0 = new ThoroughfareNameType();
      String string0 = thoroughfareNameType0.getCode();
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      ThoroughfareNameType thoroughfareNameType0 = new ThoroughfareNameType();
      thoroughfareNameType0.setType("p#eS4a");
      assertEquals("p#eS4a", thoroughfareNameType0.getType());
  }

  @Test
  public void test3()  throws Throwable  {
      ThoroughfareNameType thoroughfareNameType0 = new ThoroughfareNameType();
      String string0 = thoroughfareNameType0.getContent();
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      ThoroughfareNameType thoroughfareNameType0 = new ThoroughfareNameType();
      String string0 = thoroughfareNameType0.getType();
      assertNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      ThoroughfareNameType thoroughfareNameType0 = new ThoroughfareNameType();
      thoroughfareNameType0.setContent((String) null);
      assertNull(thoroughfareNameType0.getContent());
  }

  @Test
  public void test6()  throws Throwable  {
      ThoroughfareNameType thoroughfareNameType0 = new ThoroughfareNameType();
      thoroughfareNameType0.setCode("");
      assertNull(thoroughfareNameType0.getType());
  }
}
