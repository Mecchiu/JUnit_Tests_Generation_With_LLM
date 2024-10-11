// A4j_1Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4j_1Test {

// A4J_1Test.java (test with DAO)
	
    // These are unit tests to make sure the method works properly
	public static String TEST = "tests:KeywordSearch";
	protected A4j testa4j = null;

	public A4j_1Test() {
		testa4j = new A4j();
	}
	public A4j_1Test(String test) {
		testa4j = new A4j(test);
	}
	
	protected void runTests() {
									
		String test = TEST;

		String[] productLine = {"Amazon", "DVDS"};
		String productLineA1 = "Book";
		String productLineB = "DVDSB";
		String productLineC = "Tests";

		String productLineA2 = "DVDS";
		String[] productLineAa2 = {"DVDS A2", "DVDS A1", "DVDS A2  ", "DVDS A4"};

		String searchTermA = "Cocchi";
		String searchTermA1 = "Cocchi";
		String productLineA3 = "Cocchi";
		String[] productLineA = {"CocChip", "CocChi"};
		String searchTermA3 = "Cocchi-DS";
		String searchTermB = "cocchtos";
		String searchTermB1 = "cocchtos3";
		String[] productLineA4 = {"cocchtoso3","DVDSB","TESTS"};
		String searchTermB2 = "cocchtos3-DS";
		String searchTermC = "Test-DS";

		// ProductInfo with ProductInfo aProductInfo = null;

		// ProductInfo cProductInfo = null;

		// ProductInfo aProductInfo = testa4j.getDAO().KeywordSearch(searchTermA1, productLineA, "light");
		ProductInfo aProductInfo = testa4j.getDAO().KeywordSearch(searchTermA, productLineA, "light");

		// ProductInfo bProductInfo = testa4j.getDAO().KeywordSearch(searchTermB, productLineB, "light");
		ProductInfo bProductInfo = testa4j.getDAO().KeywordSearch(searchTermB, productLineB, "light");

		// ProductInfo cProductInfo = testa4j.getDAO().KeywordSearch(searchTermC, productLineC, "light");
		ProductInfo cProductInfo = testa4j.getDAO().KeywordSearch(searchTermC, productLineC, "light");

		assertTrue( aProductInfo.equals(bProductInfo) && bProductInfo.equals(cProductInfo) &&
				testa4j.compare(aProductInfo, cProductInfo) == 0);

		String[] productC = testa4j.getDAO().KeywordSearch(searchTermB, productLineB, "light")
				.search().getList();
		assertTrue( productC.length == 1);
		assertTrue(productC[0].equals( productLineA));

		Search search = testa4j.getDAO().KeywordSearch(searchTermB3, productLineA, "light")
				.search();
		assertTrue( search.getList().length == 1);
		assertTrue(search.getList()[0].equals( searchTermB3));
		String[] result = new String[search.getList().length];

		for (int i = 0; i < result.length; i++)
			result[i] = search.getList()[i].getProductLine();
		assertTrue( result.length == 1);
		assertTrue( result[0].equals( productLineA+" "+productLineB) && result[0].equals( productLineA2
				+" "+productLine2) && result[0].equals( productLineA3) && result[0].equals( productLineB)
				&& result[0].equals( searchTermA1 + searchTermA2 + searchTermA3 + searchTermA5)
				&& result[0].equals( productLineA4 ));
		assertTrue( result[0].equals( productLineA4));

		
//							productInfo = testa4j.getDAO().KeywordSearch(searchTermA, productLineA, "light");
//							assertTrue( productInfo!= null);
//							cProductInfo = testa4j.getDAO().KeywordSearch(searchTermC, productLineC, "light");
//							assertTrue( cProductInfo!= null);
//							assertTrue( cProductInfo.equals(productLineC));



//							ProductInfo bProductInfo = testa4j.getDAO().KeywordSearch(searchTermB, productLineB, "light")
//								.search();
//							assertTrue( bProductInfo!= null);
//							bProductInfo = testa4j.getDAO().KeywordSearch(searchTermB2, productLineB, "light")
//					.search();
//							assertTrue( bProductInfo!= null);
//							bProductInfo = testa4j.getDAO().KeywordSearch(searchTermB3, productLineB, "light")
//					.search();
//							assertTrue( bProductInfo!= null);

						
//							bProductInfo = testa4j.getDAO().KeywordSearch(searchTermB2, productLineB, "light")
//				.search();
//				assertTrue( bProductInfo!= null);
//				bProductInfo = testa4j.getDAO().KeywordSearch(searchTermB3, productLineB, "light")
//				.search();
//				assertTrue( bProductInfo!= null);
//				 
//				testa4j.getDAO().Delete(bProductInfo);
//							bProductInfo = testa4j.getDAO().KeywordSearch(searchTermB, productLineB, "light")
//					.search();
//							assertTrue( bProductInfo == null);
//							bProductInfo = testa4j.getDAO().KeywordSearch(searchTermB2, productLineB, "light")
//					.search();
//							assertTrue( bProductInfo!= null);
//							bProductInfo = testa4j.getDAO().KeywordSearch(searchTermB3, productLineB, "light")
//					.search();
//							assertTrue( bProductInfo!= null);
				
			
			testa4j.getDAO().Delete(c