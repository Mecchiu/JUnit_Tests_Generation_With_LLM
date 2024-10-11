// A4j_0Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_0Test {
		private A4j testObj = new A4j();

/**
 * When working with the DAO, we need all the products you want to use to
 * be part of the product service. We need to use the {@link Cart} class for the Product Service
* as well as the {@link Search} class.
 * This test just checks that the code can retrieve products based on the query.
 */
	@Test
	public void queryData() {
		System.out.println("queryData");
		expectedQueryData = "k4fRZ7rjxCv3jW3dRzJ2xCvXCv1w3vw";
		testObj.setQueryData(expectedQueryData);
		assertEquals(expectedQueryData, testObj.queryData());
		testObj.setQueryData(null);
	}
	@Test
	public void queryParameters() {
		System.out.println("queryParameters");
		String expectedQueryString = "k4F9j7jdCv3JW3dRzJ2XCvXCv1w3vw";
		expectedQueryParameters = "+5d&%f%3c%d%f%s%d";
		testObj.setQueryParameters(expectedQueryString);
		assertEquals(expectedQueryString, testObj.queryParameters());
		testObj.setQueryParameters(null);
	}
	@Test
	public void searchData() {
		System.out.println("Search test");
		expectedQueryString1 = "e4fFv5fM0vZiB4O2Fn5Z0WvZvWv";
		expectedExpectedList = "e4fFv5fM0vZiB4O2Fn5Z0WvZvWv";
		expectedList = "e4fFv5fM0vZiB4O2Fn5Z0WvZvWv";
		String expectedSearchString = expectedQueryString1.replace("%f", ""); // The "% has not been escaped
		String[] expectedListWithEqualizedResults = expectedList.split("%");

		String expectedSearchParams = "-%b%e%t%f%s%d%v";
		String[] expectedSearchParamsList = expectedSearchParams.split("%");
		Search searchData = null;

		try {
			searchData = new Search(expectedSearchParamsList, foundInList);
			expectedSearchString = null;
			searchData.setSearchStrategyEnum(Search.STRATEGY_BEST); // We could also do this with a searchQuery method
			expectedList = testObj.searchData(searchData);
		} catch (Exception e) {
			e.printStackTrace();
			fail("An ExpectedException cannot be thrown as this query will not be properly validated");
		} finally {
		}

		try {
			expectedList = testObj.searchData(searchData);
		} catch (Exception e) {
			e.printStackTrace();
			fail("An ExpectedException cannot be thrown as this query will not be properly validated");
		}

		try {
			expectedList = testObj.searchData(searchData);
			fail("ABlendedSearch can only search based on the query, not based on the list of products");
		} catch (ExpectedException e) {
		}
		
		// Now we pass in a BlendedSearch object with an empty list of results
		try {
			assertEquals(expectedListWithEqualizedResults, expectedList.toString().split("%"));
		} catch (Exception e) {
			e.printStackTrace();
			fail("An ExpectedException cannot be thrown as this query will not be properly validated");
		}
	}

	private Object expectedEqualizedResults = "";
	private Object expectedQueryData = "k4F9j7jdCv3JW3dRzJ2XCvXCv1w3vw";
	private Object expectedQueryParameters = "+5d&%f%3c%d%f%s%d";

	// The query string and list object will not be equal if we pass in a BlendedSearch object
	// which would not be equal to this object.
	@Test
	public void SearchTest() {
		System.out.println("Search Test");
		BlendedSearch blendedSearch = new BlendedSearch(expectedQueryData, "k");
		String searchTerm = "d41d8cd98f00b204e9800998ecf8427e";
		String listOfResults = "kjsiWXvb3T"; // Blended search objects will not match.
		Object result = blendedSearch.BlendedSearch(searchTerm, "l"); // This works, although it is more efficient than using a query
		Object result2 = blendedSearch.BlendedSearch(searchTerm, "m"); // This one works more differently.

		assertDoesNotThrow(() -> result == null, null);
		assertDoesNotThrow(() -> result==result2, null);

		List<Object> expectedList = new ArrayList<>(expectedListWithEqualizedResults);
		expectedList.add(result);
		assertEquals(expectedList, result.toString().split("%"));
	}

	public void setExpected(Object expected) {
		this.expectedQueryData = expected;
		this.expectedList = null;
	}

	public void setExpected(Object expected, Object[] expectedList) {
		this.expectedQueryData = expected;
		this.expectedList = expectedList;
	}

	public void testSetParameters() {
		System.out.println("testSetParameters");
		expectedQueryParameters = expectedQueryParams;
		setExpected(expectedQueryParameters);
		expectedExpectedList = expectedExpectedList;
		setExpected(expectedExpectedList);
	}

	public void testGetParameters() {
		System.out.println("testGetParameters");
		String expectedQueryParamsList = expectedQueryParams;
		setExpected(expectedQueryParams);
		expectedExpectedList = expectedExpectedList;
		setExpected(expectedExpectedList);
		expectedQueryParamsList = null;
		setExpected(expectedQueryParamsList);
		expectedExpectedList = null;
		setExpected(expectedExpectedList);
	}
	
	private Object[] expectedQueryParams = null;
	private Object[] expectedExpectedList = null;
	
	private void expectedQueryData(String expectedQueryParameter) {
		this.expectedQueryParameters = expectedQueryParameter;
	}

	private  Object[] expectedList = null;
	protected void expectedQueryData() {
		this.expectedList = expectedQueryData.split("%");
	}
}