// A4j_5Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#AddtoCart(String, String)} method.
*/
class A4j_5Test {
private A4jDAO a4jDAO;

        public A4j_5Test( ) throws Exception {
                a4jDAO = new A4jDAO( );
        }

        @Test
        public void testAddtoCart() throws Exception {
                final String asin = "kpkqwxyz0w8"; // "qwxyz0w8"
                final String quantity = 42;
                final String quantityA = "34"; // "34"
                final boolean a = true; // "true"
                final String order = "kpkqwxyzq9m"; // "qwxyzq9m"
                final String orderA = "qpqwxyzq12a9"; // "qpqwxyzq12a9"
                final String qty0 = "123"; // "123"
                final String qty1 = "34"; // "34"
                final String qty2 = "321"; // "321"
                final String qty3 = "321"; // "321"
                final String qty4 = "234567"; // "234567"

                final Product asinproduct = new A4jProduct( asin );
                final Product qtyproduct = new A4jProduct( qty0, qty1, qty2, qty3, qty4 );
                final Product quantityproduct = new A4jProduct( quantity, quantityA );

				final Product orderproduct = new A4jProduct( order );
				final Product orderAproduct = new A4jProduct( orderA );

				final Product qty2product = new A4jProduct( qty2 );
				final Product qty3product = new A4jProduct( qty3 );
				final Product qty4product = new A4jProduct( qty4 );

                final String expectedQuery = "qpqwxyzq12a9 = \"Qpqwxyzq12a9 = \"&order=kpkqwxyzq.&qy0=44&qy1=0&qy2=345&qy3=321&qy4=234567\"";

                FindAll findAll = new FindAll();

		    	// Make sure the Cart is not null.
				assertFalse( ( (Cart) a4jDAO.AddtoCart( asinproduct.ASIN, qtyproduct.Qty ).result).isCart());

        	    // Verify that a Cart is returned.
		    	// A Cart is returned for a cart containing more than one product with the same quantity.
        		findAll.run();
		    	final Cart cart = (Cart) a4jDAO.AddtoCart( asinproduct.ASIN, qtyproduct.Qty ).result;

	            assertEquals(expectedQuery, cart.GETQUERY_QTY, "The returned query is different than expected.");

		    	// Make sure the quantity product is returned.
		    	assertNotNull( cart.GETQUERY_QTY );
		    	assertEquals( expectedQuery, cart.GETQUERY_QTY.Qty, "The returned query.Qty does not match the expected quantity of the product.");

		    	// Verify that the products is returned.
		    	FindProducts findProducts = new FindProducts();

		    	// Verifies two products
		    	List products = findProducts.run();

		    	assertEquals( 3, products.size(), "The returned product list should have matched" + " the expected result.");

		    	Product qty2product2 = (Product) products.get(0);
		    	Product qty3product2 = (Product) products.get(1);
		    	Product qty4product2 = (Product) products.get(2);

		    	// Make sure both products are returned.
		    	assertTrue( qty2product.isCart(), "The query query.qy0 did not match the product.");
		    	assertTrue( qty3product.isCart(), "The query query.qy1 did not match the product.");
		    	assertTrue( qty4product.isCart(), "The query query.qy2 did not match the product.");
		    	assertTrue( qty2product2.isCart(), "The query query.qy0 did not match the product.");
		    	assertTrue( qty3product2.isCart(), "The query query.qy1 did not match the product.");
		    	assertTrue( qty4product2.isCart(), "The query query.qy2 did not match the product.");

		    	// Verify that the query was executed.
		    	assertFalse(findProducts.getQuery().equals( expectedQuery),
		    			"Query does not match the expected result.");

		    	// Verify that the result of the query is a list.
		    	List list = (List) findProducts.getQuery().result;

		    	// Make sure two lists are returned.
		    	assertEquals( 2, list.size(), "The expected number of result is not the same. Results of two products matching different quantity.");

		    	// Verify that the result is correct product.
		    	Product results = (Product) list.get(0);

		    	// Verify that the first element is an A4j Product.
		    	assertNotNull( results, "The returned value for a4jProduct.qy0 is null." );
		    	assertTrue( results.isCart(), "The result of a4jProduct.qy0 is not a Cart." );
		    	assertTrue( results.isProduct(), "The result of a4jProduct.qy0 is not a Product." );

		    	// Verify the quantity product of the A4j Product.
		    	assertNotNull( results.qtyProduct(), "The returned quantity of a4jProduct.qy0 is null." );
		    	assertEquals( qtyproduct.Qty, results.qtyProduct().Qty, "The returned quantity of a4jProduct does not match the expected quantity of the product of the cart." );

		    	// Verify the quantity product of the A4j Product.
		    	assertNotNull( results.qtyProducts(),
		    			"The returned quantity of a4jProduct.qy0 is null." );
		    	assertEquals( qtyproducts.Qty, results.qtyProducts().Qty, "The returned quantity of a4jProduct does not match the expected quantity of items in the cart." );

		    	//
		    	// Verify the cart.
		    	assertNotNull( cart.GETQUERY_QTY, "Cart did not contain the expected results." );
		    	assertTrue( cart.GETQUERY_QTY.Qty.equals( qtyproduct.Qty ), "The query query.qy0 for A4jProduct did not match the expected quantity of the product." );

		    	//
		    	// Verify the cart.
		    	assertNotNull( cart.GETQUERY_QTY, "Cart did not contain the expected results." );
		    	assertTrue( cart.GETQUERY_QTY.Qty.equals( qtyproduct.Qty ),