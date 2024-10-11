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
		// Add to cart with specified asin and quantity
        Cart cart_5 = new Cart();
	    
    // Add an item to cart with specified asin
	public static ShoppingCart AddtoCart(String asin, String quantity)
		{
		    Cart c2 = cart_5;
		    c2.addItem(new Item("item 1", asin, quantity));
		    
		    return c2;
		}
		// Delete an item from cart
	public static void deleteIt(Cart c1)
		{
		    c1.deleteItem("item 1");
		}
		// Add an item to cart that has the same as in a previous test
        Cart c2 = new Cart();
        cart_5.addItem( new Item("item 2", null, null) );
	    
    // Add an item from cart that has the same as in a previous test
	public static ShoppingCart AddtoCart(Cart c1, String asin, String quantity)
		{
		    c1.addItem(new Item("item 2", bytearm(asin), quantity));
		        
		    return c2;
		}
	
	// Add an item to cart that has the same as in a previous test
	public static void deleteIt(Cart c1)
		{
		    c1.deleteItem( "item 2" );
		}
		
	// Add an item from cart that has the same as in a previous test
	public static void deleteIt(Cart c1, String asin, String quantity)
	{	
		Item item = new Item("item 2", bytearm(asin), quantity);
		c1.addItem(item);	  
	}
    
    // Delete an item from cart that has the same as in a previous test
	public static void deleteIt(Cart c1, String asin)
	    {
	    	Item item = new Item("item 2", bytearm(asin), null);
	    	c1.deleteItem(item);
	    }
	// Test AddtoCart
	@Test
    public void AddtoCart_addtobutton() {
        Cart cart = this.cart_5;              
        // ADD an item to cart
        cart.addItem( new Item("item 1", null, null) );
        cart.addItem( new Item("item 15") );       
        cart.addItem( new Item("item 14",null,null) );    
        cart.addItem( new Item("item 3") );
        cart.addItem( new Item("item 4", null) );
        cart.addItem( new Item("item 5", null) );
        cart.addItem( new Item("item 1", null, 1) );
        cart.addItem( new Item("item 15", null, 2) );
        cart.addItem( new Item("item 6") );
        cart.addItem( new Item("item 7") );
        cart.deleteItem(new Item("item 5", null, 1));
        cart.deleteItem(new Item("item 6", null, 2));

        String[] ids = new String[]{"item 1", "item 15", "item 14", "item 3", "item 4"};
        String[] asin = new String[]{"ASIN", "ASIN", "ASIN", "ASIN", "ASIN"};
        
        for (int i = 0; i<20; i++)
        {
            Cart c2 = this.cart_5;
            for (int j = 0; j<ids.length; j++)
            {
                c2.addItem( new Item(ids[j], asin[j], null) );
            }
            assertEquals(ids.length, c2.getQuantity());
            for (int j = 0; j<50; j++)
            {
                c2.deleteItem( new Item(ids[j], asin[j], null) );
            }
            assertEquals(50, c2.getQuantity());
		
            String[] ids2 = c2.search(2, 1, "ASIN")[0].getItemIds(); assertEquals( 1, ids2.length );
        }
    }


    public static String bytearm(String asin) { return "ASIN-"; }

    
    public static String[] getId(Item item){
    	int[] indexs = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    	String id = null;
    	for ( int i = 0; i < indexs.length; i++)
    	{
    		id = 
    		item.getItem().getItemId() + indexs[i];
    		System.out.println("id: "+id+", Item: "+item+
    					 ". It's " +item.getQuantity() + " items.");
    	}	
    	return new String[]{id};
    }

    public static void main(String[] args) {
        try {
            A4j a = new A4j();
            a.AddtoCart("ASIN-1111111111111111222222222", 10);
            a.AddtoCart("ASIN-222222222222222222222222222", 25);
        }
        catch (Exception e) {
            e.printStackTrace();
        }        
    }
}