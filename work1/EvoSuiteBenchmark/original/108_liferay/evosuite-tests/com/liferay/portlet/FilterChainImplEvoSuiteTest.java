/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portlet.ActionRequestImpl;
import com.liferay.portlet.EventRequestImpl;
import com.liferay.portlet.FilterChainImpl;
import com.liferay.portlet.RenderRequestImpl;
import com.liferay.portlet.ResourceRequestImpl;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.ResourceRequestWrapper;
import org.junit.BeforeClass;
import org.portletbridge.portlet.BridgeHelpPortlet;

@RunWith(EvoSuiteRunner.class)
public class FilterChainImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BridgeHelpPortlet bridgeHelpPortlet0 = new BridgeHelpPortlet();
      FilterChainImpl filterChainImpl0 = new FilterChainImpl((Portlet) bridgeHelpPortlet0, (List<? extends PortletFilter>) null);
      ResourceRequestImpl resourceRequestImpl0 = new ResourceRequestImpl();
      ResourceRequestWrapper resourceRequestWrapper0 = new ResourceRequestWrapper((ResourceRequest) resourceRequestImpl0);
      filterChainImpl0.doFilter((ResourceRequest) resourceRequestWrapper0, (ResourceResponse) null);
      assertNull(resourceRequestWrapper0.getRemoteUser());
  }

  @Test
  public void test1()  throws Throwable  {
      LinkedList<PortletFilter> linkedList0 = new LinkedList<PortletFilter>();
      FilterChainImpl filterChainImpl0 = new FilterChainImpl((Portlet) null, (List<? extends PortletFilter>) linkedList0);
      EventRequestImpl eventRequestImpl0 = new EventRequestImpl();
      // Undeclared exception!
      try {
        filterChainImpl0.doFilter((EventRequest) eventRequestImpl0, (EventResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ActionRequestImpl actionRequestImpl0 = new ActionRequestImpl();
      BridgeHelpPortlet bridgeHelpPortlet0 = new BridgeHelpPortlet();
      FilterChainImpl filterChainImpl0 = new FilterChainImpl((Portlet) bridgeHelpPortlet0, (List<? extends PortletFilter>) null);
      // Undeclared exception!
      try {
        filterChainImpl0.doFilter((ActionRequest) actionRequestImpl0, (ActionResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LinkedList<PortletFilter> linkedList0 = new LinkedList<PortletFilter>();
      FilterChainImpl filterChainImpl0 = new FilterChainImpl((Portlet) null, (List<? extends PortletFilter>) linkedList0);
      EventRequestImpl eventRequestImpl0 = new EventRequestImpl();
      linkedList0.add((PortletFilter) null);
      // Undeclared exception!
      try {
        filterChainImpl0.doFilter((EventRequest) eventRequestImpl0, (EventResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      FilterChainImpl filterChainImpl0 = new FilterChainImpl((Portlet) null, (List<? extends PortletFilter>) null);
      RenderRequestImpl renderRequestImpl0 = new RenderRequestImpl();
      // Undeclared exception!
      try {
        filterChainImpl0.doFilter((RenderRequest) renderRequestImpl0, (RenderResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
