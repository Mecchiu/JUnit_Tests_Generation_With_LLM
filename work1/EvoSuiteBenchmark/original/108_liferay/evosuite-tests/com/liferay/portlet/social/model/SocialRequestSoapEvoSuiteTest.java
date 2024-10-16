/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.social.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.social.model.SocialRequest;
import com.liferay.portlet.social.model.SocialRequestSoap;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SocialRequestSoapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      long long0 = socialRequestSoap0.getModifiedDate();
      assertEquals(0L, long0);
  }

  @Test
  public void test1()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setClassPK(830L);
      assertEquals(830L, socialRequestSoap0.getClassPK());
  }

  @Test
  public void test2()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      int int0 = socialRequestSoap0.getType();
      assertEquals(0, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      long long0 = socialRequestSoap0.getPrimaryKey();
      assertEquals(0L, long0);
  }

  @Test
  public void test4()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      long long0 = socialRequestSoap0.getCreateDate();
      assertEquals(0L, long0);
  }

  @Test
  public void test5()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setStatus(83);
      assertEquals(83, socialRequestSoap0.getStatus());
  }

  @Test
  public void test6()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setCompanyId((long) 83);
      assertEquals(83L, socialRequestSoap0.getCompanyId());
  }

  @Test
  public void test7()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      long long0 = socialRequestSoap0.getCompanyId();
      assertEquals(0L, long0);
  }

  @Test
  public void test8()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      long long0 = socialRequestSoap0.getGroupId();
      assertEquals(0L, long0);
  }

  @Test
  public void test9()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setGroupId(1613L);
      assertEquals(1613L, socialRequestSoap0.getGroupId());
  }

  @Test
  public void test10()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      String string0 = socialRequestSoap0.getUuid();
      assertNull(string0);
  }

  @Test
  public void test11()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      int int0 = socialRequestSoap0.getStatus();
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      long long0 = socialRequestSoap0.getUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      long long0 = socialRequestSoap0.getClassPK();
      assertEquals(0L, long0);
  }

  @Test
  public void test14()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setReceiverUserId(1613L);
      assertEquals(1613L, socialRequestSoap0.getReceiverUserId());
  }

  @Test
  public void test15()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setPrimaryKey(0L);
      assertEquals(0, socialRequestSoap0.getType());
  }

  @Test
  public void test16()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setCreateDate((-1072L));
      assertEquals((-1072L), socialRequestSoap0.getCreateDate());
  }

  @Test
  public void test17()  throws Throwable  {
      LinkedList<SocialRequest> linkedList0 = new LinkedList<SocialRequest>();
      linkedList0.add((SocialRequest) null);
      // Undeclared exception!
      try {
        SocialRequestSoap.toSoapModels((List<SocialRequest>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setModifiedDate(830L);
      assertEquals(830L, socialRequestSoap0.getModifiedDate());
  }

  @Test
  public void test19()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setType((-103));
      assertEquals(-103, socialRequestSoap0.getType());
  }

  @Test
  public void test20()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setUserId(830L);
      assertEquals(830L, socialRequestSoap0.getUserId());
  }

  @Test
  public void test21()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setExtraData("kNTNL2B");
      assertEquals(0L, socialRequestSoap0.getReceiverUserId());
  }

  @Test
  public void test22()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      long long0 = socialRequestSoap0.getReceiverUserId();
      assertEquals(0L, long0);
  }

  @Test
  public void test23()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setClassNameId((-1072L));
      assertEquals((-1072L), socialRequestSoap0.getClassNameId());
  }

  @Test
  public void test24()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      long long0 = socialRequestSoap0.getRequestId();
      assertEquals(0L, long0);
  }

  @Test
  public void test25()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      socialRequestSoap0.setUuid("");
      assertEquals(0L, socialRequestSoap0.getModifiedDate());
  }

  @Test
  public void test26()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      long long0 = socialRequestSoap0.getClassNameId();
      assertEquals(0L, long0);
  }

  @Test
  public void test27()  throws Throwable  {
      SocialRequestSoap socialRequestSoap0 = new SocialRequestSoap();
      String string0 = socialRequestSoap0.getExtraData();
      assertNull(string0);
  }

  @Test
  public void test28()  throws Throwable  {
      SocialRequest[][] socialRequestArray0 = new SocialRequest[1][9];
      // Undeclared exception!
      try {
        SocialRequestSoap.toSoapModels(socialRequestArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      LinkedList<SocialRequest> linkedList0 = new LinkedList<SocialRequest>();
      SocialRequestSoap[] socialRequestSoapArray0 = SocialRequestSoap.toSoapModels((List<SocialRequest>) linkedList0);
      assertNotNull(socialRequestSoapArray0);
  }
}
