/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.shopping.service.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.shopping.service.http.ShoppingCouponServiceSoap;
import java.rmi.RemoteException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ShoppingCouponServiceSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ShoppingCouponServiceSoap shoppingCouponServiceSoap0 = new ShoppingCouponServiceSoap();
      assertNotNull(shoppingCouponServiceSoap0);
  }

  @Test
  public void test1()  throws Throwable  {
      try {
        ShoppingCouponServiceSoap.getCoupon((-1985L), (-1985L));
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      try {
        ShoppingCouponServiceSoap.addCoupon("X%4A8k\"t", false, "X%4A8k\"t", "X%4A8k\"t", (-1812), (-1812), (-1812), (-1812), (-1812), (-1812), (-1812), (-1812), (-1812), (-1812), false, false, "X%4A8k\"t", "X%4A8k\"t", 0.0, 708.6944433876905, "X%4A8k\"t", serviceContext0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      try {
        ShoppingCouponServiceSoap.deleteCoupon(0L, (-817L));
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      try {
        ShoppingCouponServiceSoap.search((long) 0, (-1259L), "(FD4", false, "(FD4", false, 0, 1);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      try {
        ShoppingCouponServiceSoap.updateCoupon((-1986L), "update", "update", 0, 0, 0, (-973), 1, 0, 0, (-1), 0, 1, true, false, "", "", 1.0, 0.0, "update", serviceContext0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }
}
