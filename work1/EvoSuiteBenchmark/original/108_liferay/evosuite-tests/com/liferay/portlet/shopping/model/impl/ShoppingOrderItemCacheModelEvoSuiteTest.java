/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.shopping.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.shopping.model.impl.ShoppingOrderItemCacheModel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ShoppingOrderItemCacheModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ShoppingOrderItemCacheModel shoppingOrderItemCacheModel0 = new ShoppingOrderItemCacheModel();
      String string0 = shoppingOrderItemCacheModel0.toString();
      assertEquals("{orderItemId=0, orderId=0, itemId=null, sku=null, name=null, description=null, properties=null, price=0.0, quantity=0, shippedDate=0}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ShoppingOrderItemCacheModel shoppingOrderItemCacheModel0 = new ShoppingOrderItemCacheModel();
      // Undeclared exception!
      try {
        shoppingOrderItemCacheModel0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ShoppingOrderItemCacheModel shoppingOrderItemCacheModel0 = new ShoppingOrderItemCacheModel();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      shoppingOrderItemCacheModel0.itemId = "";
      shoppingOrderItemCacheModel0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(0, shoppingOrderItemCacheModel0.quantity);
  }

  @Test
  public void test3()  throws Throwable  {
      ShoppingOrderItemCacheModel shoppingOrderItemCacheModel0 = new ShoppingOrderItemCacheModel();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      shoppingOrderItemCacheModel0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(0, shoppingOrderItemCacheModel0.quantity);
  }

  @Test
  public void test4()  throws Throwable  {
      ShoppingOrderItemCacheModel shoppingOrderItemCacheModel0 = new ShoppingOrderItemCacheModel();
      shoppingOrderItemCacheModel0.sku = "no-repeat";
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      shoppingOrderItemCacheModel0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(0, shoppingOrderItemCacheModel0.quantity);
  }
}
