/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.lucene.search.exposed.facet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.exposed.facet.CollectorPoolFactory;
import org.apache.lucene.search.exposed.facet.request.FacetRequest;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CollectorPoolFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CollectorPoolFactory collectorPoolFactory0 = new CollectorPoolFactory(0, 0, 0);
      FacetRequest facetRequest0 = new FacetRequest("CollectorPoolFactory()");
      // Undeclared exception!
      try {
        collectorPoolFactory0.hasPool((IndexReader) null, facetRequest0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      CollectorPoolFactory collectorPoolFactory0 = CollectorPoolFactory.getLastFactory();
      collectorPoolFactory0.onClose((IndexReader) null);
      assertEquals("CollectorPoolFactory()", collectorPoolFactory0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CollectorPoolFactory collectorPoolFactory0 = CollectorPoolFactory.getLastFactory();
      FacetRequest facetRequest0 = new FacetRequest("");
      // Undeclared exception!
      try {
        collectorPoolFactory0.hasPool((IndexReader) null, facetRequest0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      CollectorPoolFactory collectorPoolFactory0 = CollectorPoolFactory.getLastFactory();
      // Undeclared exception!
      try {
        collectorPoolFactory0.acquire((IndexReader) null, (FacetRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      CollectorPoolFactory collectorPoolFactory0 = CollectorPoolFactory.getLastFactory();
      FacetRequest facetRequest0 = new FacetRequest("CollectorPoolFactory()");
      facetRequest0.createGroup("_>D)a^p<4Q\"}5");
      // Undeclared exception!
      try {
        collectorPoolFactory0.acquire((IndexReader) null, facetRequest0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      CollectorPoolFactory collectorPoolFactory0 = CollectorPoolFactory.getLastFactory();
      collectorPoolFactory0.purgeAllCaches();
      assertEquals(0L, collectorPoolFactory0.getMem());
  }

  @Test
  public void test6()  throws Throwable  {
      CollectorPoolFactory collectorPoolFactory0 = CollectorPoolFactory.getLastFactory();
      String string0 = collectorPoolFactory0.toString();
      assertEquals("CollectorPoolFactory()", string0);
      assertNotNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      CollectorPoolFactory collectorPoolFactory0 = CollectorPoolFactory.getLastFactory();
      assertNotNull(collectorPoolFactory0);
      
      long long0 = collectorPoolFactory0.getMem();
      assertEquals(0L, long0);
  }
}
