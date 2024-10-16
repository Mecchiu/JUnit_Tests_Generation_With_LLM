/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.datamodel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import geo.google.datamodel.GeoAddress;
import geo.google.datamodel.GeoAddressAccuracy;
import geo.google.datamodel.GeoCoordinate;
import oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GeoAddressEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GeoAddress geoAddress0 = new GeoAddress();
      GeoCoordinate geoCoordinate0 = new GeoCoordinate();
      geoAddress0.setCoordinate(geoCoordinate0);
      assertEquals("", geoAddress0.getAddressLine());
  }

  @Test
  public void test1()  throws Throwable  {
      GeoAddress geoAddress0 = new GeoAddress();
      GeoCoordinate geoCoordinate0 = geoAddress0.getCoordinate();
      assertNull(geoCoordinate0);
  }

  @Test
  public void test2()  throws Throwable  {
      GeoAddress geoAddress0 = new GeoAddress();
      AddressDetails addressDetails0 = geoAddress0.getAddressDetails();
      assertNull(addressDetails0);
  }

  @Test
  public void test3()  throws Throwable  {
      GeoAddress geoAddress0 = new GeoAddress();
      String string0 = geoAddress0.toString();
      assertNotNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      GeoAddress geoAddress0 = new GeoAddress();
      boolean boolean0 = geoAddress0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      GeoAddress geoAddress0 = new GeoAddress();
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.TOWN_LEVEL;
      geoAddress0.setAccuracy(geoAddressAccuracy0);
      assertEquals("", geoAddress0.getAddressLine());
  }

  @Test
  public void test6()  throws Throwable  {
      GeoAddress geoAddress0 = new GeoAddress();
      AddressDetails addressDetails0 = new AddressDetails();
      geoAddress0.setAddressDetails(addressDetails0);
      assertNull(addressDetails0.getUsage());
  }

  @Test
  public void test7()  throws Throwable  {
      GeoAddress geoAddress0 = new GeoAddress();
      geoAddress0.setAddressLine("");
      assertEquals(GeoAddressAccuracy.UNKNOWN_LOCATION, geoAddress0.getAccuracy());
  }

  @Test
  public void test8()  throws Throwable  {
      GeoAddress geoAddress0 = new GeoAddress();
      GeoAddressAccuracy geoAddressAccuracy0 = geoAddress0.getAccuracy();
      assertEquals(0, geoAddressAccuracy0.ordinal());
  }

  @Test
  public void test9()  throws Throwable  {
      GeoAddress geoAddress0 = new GeoAddress();
      String string0 = geoAddress0.getAddressLine();
      assertEquals("", string0);
  }
}
