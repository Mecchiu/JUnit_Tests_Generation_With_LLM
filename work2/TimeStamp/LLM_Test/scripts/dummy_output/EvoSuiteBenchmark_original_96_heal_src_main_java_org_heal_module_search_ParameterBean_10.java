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
		
	/**
     * Unit test case for the {@link ParameterBean#getParameters(int)} method.
     */
	//@Test
		public void testGetParameters( ) throws Exception {
		ArrayList searchParameters = null;
		searchParameters = ParameterBean.createParameterList();
		ArrayList tableList = ParameterBean.createTableList();
		ParameterBean parameter = new ParameterBean();
		int position = parameter.getParameters( 0 );
		for (int i = 0; i < searchParameters.size(); i++) {
			assertTrue( searchParameters.get( i ).equals( tableList.get( position )));
			parameter.addParameters(searchParameters.get( i));
			position++;
			if (i < searchParameters.size() -1) {
				position++;
			}
		}
	}


	/**
     * Unit test case for the {@link ParameterBean#size()} method.
     */
	//@Test
		public void testMaxParameters( ) throws Exception {
		ArrayList searchParameters = null;
		ArrayList tableList = ParameterBean.createTableList();
		ParameterBean parameter = new ParameterBean();
		searchParameters = ParameterBean.createParameterList();
		for (int i = 0; i < searchParameters.size(); i++) {
			position = searchParameters.get( i).size();
			assertTrue(((ParameterBean.Count) searchParameters.get(i)).count(position) == i);
		}
		position = tableList.size();
		for (int i = 0; i < searchParameters.size(); i++) {
			if (position > searchParameters.get(i).size()) {
				throw new Exception( "Position is not enough");
			}
		}
		ParameterBean.countParameterList();
	}

	/**
     * Unit test case for the {@link ParameterBean#size()} method.
     */
	@Test
		public void testFindNoParameters( ) throws Exception {
		ArrayList searchParameters = null;
		ArrayList tableList = ParameterBean.createTableList();
		ParameterBean parameter = new ParameterBean();
		searchParameters = ParameterBean.createParameterList();
		for (int i = 0; i < searchParameters.size(); i++) {
			position = searchParameters.get( i).size();
			assertFalse(((ParameterBean.Find) searchParameters.get(i)).isFound( position));
		}
		tableList = ParameterBean.createTableList();
		position = tableList.size();
		for (int i = 0; i < searchParameters.size(); i++) {
			if (position < searchParameters.get(i).size()) {
				throw new Exception( "Position is not small enough");
			}
		}

	}

}