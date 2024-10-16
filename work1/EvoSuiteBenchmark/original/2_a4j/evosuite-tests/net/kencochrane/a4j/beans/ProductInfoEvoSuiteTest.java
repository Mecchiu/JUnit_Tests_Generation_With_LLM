/*
 * This file was automatically generated by EvoSuite
 */

package net.kencochrane.a4j.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.kencochrane.a4j.beans.ProductDetails;
import net.kencochrane.a4j.beans.ProductInfo;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ProductInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ProductInfo productInfo0 = new ProductInfo();
      String string0 = productInfo0.printProductList();
      assertNotNull(string0);
      assertEquals("Total results = null\nTotal pages = null\nproducts is null \n", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ProductInfo productInfo0 = new ProductInfo();
      productInfo0.setTotalResults((String) null);
      assertEquals("Total results = null\nTotal pages = null\nproducts is null \n", productInfo0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      ProductInfo productInfo0 = new ProductInfo();
      // Undeclared exception!
      try {
        productInfo0.getDetails();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ProductInfo productInfo0 = new ProductInfo();
      productInfo0.setTotalPages("Total results = null\nTotal pages = null\nproducts is null \n");
      assertEquals("Total results = null\nTotal pages = Total results = null\nTotal pages = null\nproducts is null \n\nproducts is null \n", productInfo0.toString());
      assertEquals("Total results = null\nTotal pages = Total results = null\nTotal pages = null\nproducts is null \n\nproducts is null \n", productInfo0.printProductList());
  }

  @Test
  public void test4()  throws Throwable  {
      ProductInfo productInfo0 = new ProductInfo();
      productInfo0.setListName("Total results = null\nTotal pages = null\nproducts is null \n");
      assertNull(productInfo0.getTotalPages());
  }

  @Test
  public void test5()  throws Throwable  {
      ProductInfo productInfo0 = new ProductInfo();
      String string0 = productInfo0.getListName();
      assertNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      ProductInfo productInfo0 = new ProductInfo();
      ProductDetails[] productDetailsArray0 = new ProductDetails[10];
      productInfo0.setDetails(productDetailsArray0);
      String string0 = productInfo0.toString();
      assertEquals("Total results = null\nTotal pages = null\nnull\nnull\nnull\nnull\nnull\nnull\nnull\nnull\nnull\nnull\n# of products = 10\n", productInfo0.toString());
      assertNotNull(string0);
      assertEquals("Total results = null\nTotal pages = null\nnull\nnull\nnull\nnull\nnull\nnull\nnull\nnull\nnull\nnull\n# of products = 10\n", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      ProductInfo productInfo0 = new ProductInfo();
      String string0 = productInfo0.toString();
      assertNotNull(string0);
      assertEquals("Total results = null\nTotal pages = null\nproducts is null \n", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      ProductInfo productInfo0 = new ProductInfo();
      ProductDetails productDetails0 = new ProductDetails();
      productInfo0.details = (net.kencochrane.a4j.beans.ProductDetails) productDetails0;
      ProductDetails[] productDetailsArray0 = new ProductDetails[2];
      productDetailsArray0[0] = (ProductDetails) productInfo0.details;
      productDetailsArray0[1] = (ProductDetails) productInfo0.details;
      productInfo0.setDetails(productDetailsArray0);
      String string0 = productInfo0.printProductList();
      assertEquals("Total results = null\nTotal pages = null\nASIN - null\nProductAction Name - null\nURL - null\nAge Group - null\nAvailability - null\nCatalog - null\nCollectibles Count - null\nCollectibles Price - null\nDistributor - null\nEncoding - null\nESRB Rating- null\nLargeImage - null\nMedium Image - null\nSmall Image - null\nISBN - null\nList Price - null\nManufactor - null\nMedia - null\nMPAA Rating - null\nMPN - null\n# of items - null\n# of offerings - null\nOur Price - null\nReading Level - null\nRefurbished Count - null\nRefurbised Price - null\nReleased Date - null\nSales Rank - null\nStatus - null\nTheatre Release Date - null\nthird party new count - null\nthird party new price - null\nUPC - null\nUsed Count - null\nUsed Price - null\nTracks is null or size 0\n\nlists is null or size 0 \n\nartists is null or size 0 \n\nFeature is null or size 0\n\nSimilar Products is null or size 0\n\nnull\nnull\nreviews is null \nNo nodes\n\nAccessories is null or size 0\n\nDirector is null or size 0\n\nActors is null or size 0\n\nAuthors is null or size 0\n\nPlatforms is null or size 0\n\nproductOffers is null \n\nASIN - null\nProductAction Name - null\nURL - null\nAge Group - null\nAvailability - null\nCatalog - null\nCollectibles Count - null\nCollectibles Price - null\nDistributor - null\nEncoding - null\nESRB Rating- null\nLargeImage - null\nMedium Image - null\nSmall Image - null\nISBN - null\nList Price - null\nManufactor - null\nMedia - null\nMPAA Rating - null\nMPN - null\n# of items - null\n# of offerings - null\nOur Price - null\nReading Level - null\nRefurbished Count - null\nRefurbised Price - null\nReleased Date - null\nSales Rank - null\nStatus - null\nTheatre Release Date - null\nthird party new count - null\nthird party new price - null\nUPC - null\nUsed Count - null\nUsed Price - null\nTracks is null or size 0\n\nlists is null or size 0 \n\nartists is null or size 0 \n\nFeature is null or size 0\n\nSimilar Products is null or size 0\n\nnull\nnull\nreviews is null \nNo nodes\n\nAccessories is null or size 0\n\nDirector is null or size 0\n\nActors is null or size 0\n\nAuthors is null or size 0\n\nPlatforms is null or size 0\n\nproductOffers is null \n\n# of products = 2\n", productInfo0.toString());
      assertEquals("Total results = null\nTotal pages = null\n< 0 > null : null - null\n< 1 > null : null - null\n# of products = 2\n", string0);
  }
}
