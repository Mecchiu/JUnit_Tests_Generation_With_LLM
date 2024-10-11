// ParameterBeanTest.java
package org.heal.module.search;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterBean}.
* It contains one unit test case for the {@link ParameterBean#size()} method.
*/
class ParameterBeanTest {
		private ArrayList<ParameterBean> _paramNameBeanList = null;
		private ParameterBean.ParameterNode _paramNode = null;
		private String _queryString = null;

		private void setUp() {
			ArrayList<ParameterBean> newList = null;
			_paramNameBeanList = new ArrayList<ParameterBean>();
			newList = ParameterBean.makeParameterBean("test_param");
			_paramNameBeanList.add(newList);
		}

		private void createFilterArray(){
			testBean.setSourceCollection(new String[]{"1", "2", "3"});
			testBean.setFilterArray(new String[] {"1", "2", "3"});
			if (newList!= null)
				_paramNameBeanList = newList;
		}

		@Test
		void makeParameterBeanSets(){
			setUp();

			testBean.addParameters(testBean.getParameters());
			assertEquals(3, _paramNameBeanList.size());
			assertEquals("1", _paramNameBeanList.get(0).getName());
			assertEquals("2", _paramNameBeanList.get(1).getName());
			assertEquals("3", _paramNameBeanList.get(2).getName());
		}

		@Test
		void getParameters() {
			_paramNameBeanList.forEach(pbean -> assertEquals(pbean.getName(), "test_param"));
		}

		@Test
		void setQueryString(){
			setUp();

			_paramNode = ParameterBean.makeParameterNode(testBean);
			_paramNode.setQueryString("");
			assertNull(_paramNode.getQueryString());
			_paramNode.setQueryString("test");
			assertNotNull(_paramNode.getQueryString());
			testBean.setQueryString(_paramNode.getQueryString());
			assertEquals(_paramNode.getQueryString(), testBean.getQueryString());
		}

		@Test
		void getQueryString() {
			_paramNode = ParameterBean.makeParameterNode(testBean);
			_paramNode.setQueryString("");
			assertNull(_paramNode.getQueryString());
			_paramNode.setQueryString("test");
			assertNotNull(_paramNode.getQueryString());
			testBean.setQueryString(_paramNode.getQueryString());
			assertEquals(_paramNode.getQueryString(), testBean.getQueryString());
		}

		@Test
		void getName() {
			_paramNode = ParameterBean.makeParameterNode(testBean);
			_paramNode.setQueryString("test");
			assertEquals(testBean.getName(), _paramNode.getName());
		}

		@Test
		void getNameForNull(){
			ParameterBean t = ParameterBean.makeParameterNode(null);
			assertNull(t.getName());
		}


		@Test
		void setRights(){
			_paramNode = ParameterBean.makeParameterNode(testBean);
			_paramNode.setSearchParameters("test=1");
			_paramNode.setRights("RightsForOne");
			assertEquals(testBean.getRights(), _paramNode.getRights());
		}

		@Test
		void getRights(){
			_paramNode = ParameterBean.makeParameterNode(testBean);
			_paramNode.setSearchParameters("test=1");
			_paramNode.setRights("1");
			assertEquals(testBean.getRights(), _paramNode.getRights());
		}

}