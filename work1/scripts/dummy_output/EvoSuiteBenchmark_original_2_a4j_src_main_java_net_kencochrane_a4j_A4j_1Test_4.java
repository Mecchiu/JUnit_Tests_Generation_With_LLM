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
		/**
		* A keyword is a general search term that is used to find products in the Amazon.com
		* catalog. Often, more than one keyword is used at the same time to form a short phrase
		* (such as finance software).
		*
		* @since 1.0
		* @param searchTerm the term you want to search for
		* @param productLine books, dvd, etc
		* @param type heavy or lite
		* @param page 1 2 3 etc
		* @return ProductInfo
		*/
		public ProductInfo KeywordSearch(String searchTerm, String productLine, String type, String page);
}

class Search_1Test {
		/**
		* A keyword is a general search term that is used to find products in the Amazon.com
		* catalog. Often, more than one keyword is used at the same time to form a short phrase
		* (such as finance software).
		*
		* @since 1.0
		* @param searchTerm the term you want to search for
		* @param productLine books, dvd, etc
		* @param type heavy or lite
		* @param page 1 2 3 etc
		* @return ProductInfo
		*/
		public ProductInfo KeywordSearch(String searchTerm, String productLine, String type, String page);
}