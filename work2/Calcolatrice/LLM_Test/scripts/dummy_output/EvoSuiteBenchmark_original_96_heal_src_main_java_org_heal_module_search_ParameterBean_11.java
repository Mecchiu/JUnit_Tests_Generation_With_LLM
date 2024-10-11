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
		private ParameterBean param = new ParameterBean();
		private String[] source = {};
		private String[] sourceCollection = {};
		private String[] target = {};
		private String[] publicationNames = {};
		private String[] publicationIds = {};
		private String rights = "";
		private String[] imaging = {"*"};
		private String[] disease = {"*"};
		private boolean hidden = false;

		/**
		*  Test of the {@link ParameterBean#size()} method.
		*/
		@Test
		public void test1S() {
	        assertNotNull(param.getParameterBean());
			assertNotNull(param.getFilterArray());
			assertNotNull(param.getSourcesCollection());
			assertNotNull(param.getPublicationNames());
			assertNotNull(param.getPublicationIds());
			assertNotNull(param.getRights());
			assertNotNull(param.getImaging());
			assertNotNull(param.getDisease());
			assertNotNull(param.getHidden());
			assertNotNull(param.getSourceCollection());
			assertNotNull(param.getTarget());
			assertNotNull(param.getSecurityRights());
			assertNotNull(param.getPrimaryArray());
			assertNotNull(param.getTableList());
			assertNotNull(param.getUsageRights());
			String[] paramTable = {};
			param.getTarget();
			assertNotNull(paramTable);
		}

		/**
		*  Test of the {@link ParameterBean#filterArray()} method.
		*/
		@Test
		public void test2F() {
			ArrayList f = param.getFilterArray();
			assertNotNull(f);
			assertEquals(f.size(), param.size());
		}

		/**
		*  Test of the {@link ParameterBean#tableList()} method.
		*/
		@Test
		public void test3T() {
			ArrayList tableList = param.getTableList();
			assertNotNull(tableList);
			assertNotNull(tableList);
			assertTrue(param.getTableList().length == param.size() + 1);
		}

		/**
		*  Test of the {@link ParameterBean#tableList()} method.
		*/
		@Test
		public void test4T() {
			ArrayList tableList = param.getTableList();
			assertNotNull(tableList);
			assertNotNull(tableList);
			assertTrue(param.getTableList().length == 0);
		}

		/**
		*  Test of the {@link ParameterBean#sourceCollection()} method.
		*/
		@Test
		public void test5S() {
			ArrayList sourceCollection = param.getSourcesCollection();
			assertNotNull(sourceCollection);
			assertNotNull(sourceCollection);
			assertEquals(sourceCollection.length, param.size());
		}

		/**
		*  Test of the {@link ParameterBean#tableList()} method.
		*/
		@Test
		public void test6T() {
			ArrayList tableList = param.getTableList();
			assertNotNull(tableList);
			assertNotNull(tableList);
			assertTrue(param.getTableList().length == 0);
		}

		/**
		*  Test of the {@link ParameterBean#tableList()} method.
		*/
		@Test
		public void test7T() {
			ArrayList filtered = param.getTableList();
			assertNotNull(filtered);
			assertNotNull(filtered);
			assertTrue(param.getTableList().length == 0);
		}

}