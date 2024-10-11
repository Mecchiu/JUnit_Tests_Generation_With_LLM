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
	* Test method for {@link ParameterBean#size()}.
	*/
	@Test
	public void testSize() {
		// A case for a search parameter with no set of parameter types.
		{
		Map<Long, String> expected = new HashMap<>();
		expected.put(-1L, String.class.getName());
		test(expected);
		}
		// A case for a search parameter of multiple types.
		{
		Map<Long, Map<String, String>> expected = new HashMap<>();
		expected.put(-1L, new HashMap<>());
		expected.get(-1L).put(String.class.getName(), String.class.getName());
		test(expected);
		}
		// A case for a search parameter with multiple types.
		{
		Map<Long, Map<String, String>> expected = new HashMap<>();
		expected.put(-1L, new HashMap<>());
		expected.get(-1L).put(String.class.getName(), "A");
		expected.put(-2L, new HashMap<>());
		expected.get(-2L).put(String.class.getName(), "B");
		test(expected);
		}
	}
	
	/**
	* Test method for {@link ParameterBean#size()}.
	*/
	@Test
	public void testSize2() {	
		List<Map<String, String>> badSearchParameters = new ArrayList<>();
		List<Map<String, String>> badSearchParameters2 = new ArrayList<>();
		// A case for a search parameter for search parameter with multiple types.
		{
		badSearchParameters.add(new HashMap<>());
		badSearchParameters.add(new LinkedHashMap<>());
		badSearchParameters.add(new ArrayList<>());
		badSearchParameters.add(new HashSet<>());
		badSearchParameters.add(new HashSet<>());
		badSearchParameters.add(new ArrayList<>());
		badSearchParameters.add(new ArrayList<>());
		badSearchParameters.add(new HashMap<>());
		badSearchParameters.add(new Map<>());
		badSearchParameters.add(new Vector<>());
		badSearchParameters.add(new List<>());
		badSearchParameters.add(new Collection<>());
		badSearchParameters.add(new Set<>());
		badSearchParameters.add(new Map<>(badParameterArray));
		badSearchParameters.add(new Object());
		badSearchParameters.add(new int[1]);
		badSearchParameters.add(new HashSet(badParameterArray));
		badSearchParameters.add(new StringBuilder(), badParameterArray);
		badSearchParameters.add(new BigDecimal(new BigInteger("99")));
		badSearchParameters.add(new BigDecimal(0));
		badSearchParameters.add(new long[1]);
		badSearchParameters.add(new HashSet<>());
		badSearchParameters.add(new Boolean());
		badSearchParameters.add(new Object[1]);
		badSearchParameters.add(new List<>());
		badSearchParameters.add(new HashMap<>());
		badSearchParameters.add(new HashMap<>());
		badSearchParameters.add(new Vector<>());
		badSearchParameters.add(new HashSet<>());
		badSearchParameters.add(new HashSet<>());
		badSearchParameters.add(new Map<>());
		badSearchParameters.add(new HashSet<>());
		badSearchParameters.add(new List<>());
		badSearchParameters.add(new Set<>());
		badSearchParameters.add(new HashSet<>(badParameterArray));
		badSearchParameters.add(new HashSet<>(badParameterArray));
		badSearchParameters.add(new Set<>(badParameterArray));
		badSearchParameters.add(new HashSet<>(badParameterArray));
		badSearchParameters.add(new HashSet<>(badParameterArray));
		badSearchParameters.add(new Set<>(badParameterArray));
		badSearchParameters.add(new HashSet<>(badParameterArray));
		badSearchParameters.add(new HashSet<>(badParameterArray));
		badSearchParameters.add(new HashSet<>(badParameterArray));
		badSearchParameters.add(new List<String>());
		badSearchParameters.add(new Vector<String>());
		badSearchParameters.add(new ArrayList<String>());
		badSearchParameters.add(new HashSet<String>(badParameterArray));
		badSearchParameters.add(new HashSet<String>(badParameterArray));
		badSearchParameters.add(new Set<String>(badParameterArray));
		badSearchParameters.add(new Vector<String>(badParameterArray));
		badSearchParameters.add(new HashSet<String>(badParameterArray));
		badSearchParameters.add(new Map<String, String[][]>("array", badParameterArray));
		badSearchParameters.add(new Object[10]);
		badSearchParameters.add(new Object[]{badParameterArray});
		badSearchParameters.add(badParameterArray + badParameterArray); // Also test null parameter
		
		badSearchParameters2.add(new ArrayList<>());
		badSearchParameters2.add(new Object[] { badParameterArray });
		badSearchParameters2.add(new Object[] { new StringBuilder() } );
		badSearchParameters2.add(new Vector<String>() );
		badSearchParameters2.add(new HashSet<>() );
		badSearchParameters2.add(new HashSet<>() );
		badSearchParameters2.add(new HashSet<>() );
		badSearchParameters2.add(new ArrayList<>() );
		badSearchParameters2.add(new Set<>() );
		badSearchParameters2.add(new Collection<>() );
		badSearchParameters2.add(new HashMap<>() );
		badSearchParameters2.add(new HashMap<>() );
		badSearchParameters2.add(new BigDecimal(new BigInteger("99")));
		badSearchParameters2.add(new BigDecimal(0));
		badSearchParameters2.add(new long[] { 1 } );
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new Boolean() );		
		badSearchParameters2.add(new String[] { "abcdefg", "mna" } );
		badSearchParameters2.add(new Object[] { 1, null } );
		badSearchParameters2.add(new Vector<String>());
		badSearchParameters2.add(new Object[] { badParameterArray });
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new Vector<>());
		badSearchParameters2.add(new HashMap<>() );
		badSearchParameters2.add(new String[][] {badParameterArray  });
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new Vector<String>(badParameterArray));
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(badParameterArray + badParameterArray); // Also test null parameter
		
		badSearchParameters2.add(new ArrayList<String>());
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new HashSet<>());
		badSearchParameters2.add(new HashSet<>