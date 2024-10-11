// A4j_4Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4j_4Test {
		/**
		* Finds the first author product with a given text.
		*
		* @param searchString character to search for
		* @param startOrder value to start at, to match the result
		* @return ProductInfo
		* @since 1.0
		*/
    public ProductInfo FindAuthorByText(String searchString, int startOrder);

		/**
		* Finds the first author product with a given description.
		*
		* @param description description of a product to find
		* @param searchOrder value to search for, to match the result
		* @return
		* @since 1.0
		*/
    public ProductInfo FindAuthorByDescription(String description, int searchOrder);


		/**
		* Finds the first available article with a given search key.
		*
		* @param key string of keyword
		* @param searchOrder value to search for, to match the result
		* @return
		* @since 1.0
		*/
    public ProductInfo FindAuthorByKey(String key, int searchOrder);

		/**
		* Finds all articles with this text.
		*
		* @param searchString string to search for
		* @param startOrder value to start at, to match the result
		* @return
		* @since 1.0
		*/
    public Search searchText(String searchString, int startOrder);


		/**
		* Finds all available article with a given search key.
		*
		* @param key string of keyword
		* @param searchOrder value to search for, to match the result
		* @return
		* @since 1.0
		*/
    public ProductInfo search(String searchString, int searchOrder);

		/**
		* Finds all articles with this description.
		*
		* @param description description of article to find
		* @param startOrder value to start at, to match the result
		* @return
		* @since 1.0
		*/
    public Search searchDescription(String description, int startOrder);

		/**
		* Finds all articles with this key.
		*
		* @param key string of key
		* @param startOrder value to start at, to match the result
		* @return
		* @since 1.0
		*/
    public Search searchKey(String key, int startOrder);

		/**
		* Finds all articles where key is the value at the supplied
		* ordinate.
		*
		* @param key string of key
		* @param ordinate value
		* @return
		* @since 1.0
		*/
    public Search searchKey(String key, int ordinate);

		/**
		* Finds all articles with this text and description.
		*
		* @param author text to find
		* @param author description of article to find
		* @param startOrder value at which to start searching
		* @return
		* @since 1.0
		*/
    public Search search(String author, String description, int startOrder);

		/**
		* Finds all articles with this key and description.
		*
		* @param key string of key
		* @param description description of article to find
		* @param startOrder value at which to start searching
		* @return
		* @since 1.0
		*/
    public Search search(String key, String description, int startOrder);

}