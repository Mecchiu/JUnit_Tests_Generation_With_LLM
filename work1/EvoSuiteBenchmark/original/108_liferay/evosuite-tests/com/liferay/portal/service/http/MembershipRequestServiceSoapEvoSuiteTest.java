/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.service.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.http.MembershipRequestServiceSoap;
import java.rmi.RemoteException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MembershipRequestServiceSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      try {
        MembershipRequestServiceSoap.getMembershipRequest(1L);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      try {
        MembershipRequestServiceSoap.updateStatus(1719L, "", 0, serviceContext0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      try {
        MembershipRequestServiceSoap.deleteMembershipRequests((-277L), 10);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      try {
        MembershipRequestServiceSoap.addMembershipRequest(0L, "rbZ&RiUDpHB~", serviceContext0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * BeanLocator has not been set
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MembershipRequestServiceSoap membershipRequestServiceSoap0 = new MembershipRequestServiceSoap();
      assertNotNull(membershipRequestServiceSoap0);
  }
}
