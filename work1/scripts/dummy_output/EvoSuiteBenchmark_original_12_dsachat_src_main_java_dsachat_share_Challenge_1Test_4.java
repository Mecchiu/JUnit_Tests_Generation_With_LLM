// Challenge_1Test.java
package dsachat.share;

import java.io.Serializable;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Challenge}.
* It contains one unit test case for the {@link Challenge#dice(int)} method.
*/
class Challenge_1Test {
		
	 @Test
	    public void testSetTo()
	    {
	        Challenge c = new Challenge(null, false, null, false, null);
	        assertNotNull(c);
	        assertEquals(0, c.getTo().length());
	        c.to(Character.toUpperCase(c.getTo()));
	        c = new Challenge("", false, null, false, null);
	        assertEquals("", c.to(""));
	    }

		 @Test
		    public void testIsSilent()
		       {
		        String t = null;
		        assertTrue(Challenge_1Test.isSilent(t));
		        t = "a";
		        assertFalse(Challenge_1Test.isSilent(t));
		    }

	

	       @Test
		    public void testRoll_1()
		    {
		    	 final int x, y, s = 2, r = 0, d = 10, k = -1;
		        Weapon w = Hero.weapon(1);
		      //  String t = new String('[0, 1, 2], [[1, '0, t], [[2, '0, t], [[3, t], [[4, t], [[5, t], [[6, t],
		      // 		       ]}]].length);
		        String t = "[[0, 1, 2], [[1, '0, t], [[2, '0, t], [[3, t], [[4, t], [[5, t],
		        // 		       ]}]].length]";
		        char[] a = t.toCharArray();

		        Tokenizer to = new Tokenizer(Character.toString(w.toString()));
		        int size = a.length;
		        Vector<Character> token = new Vector<>(size);
		        int i, j;
		        Vector<Character> value;	      
		        c = null;

		        to = to.getAll(new int[]{j = -1, s, d});

		        System.arraycopy(
		                to,
		                j,
		                c,
		                0,
		                size );	        

		        while(i = to.getFrom(j))
		        {
		            value = c.getAttack(i, d);
		            for(int m = value.size(); m > 0; m--)
		            {
		                char mx = a[i];

		                j=1;
		                while(j > m)
		                {
		                    mx = a[++i];
		                }
		                token.addElement(mx);
		                j--;
		            }
		        }
		        System.arraycopy(
		                token,
		                0,
		                c,
		                0,
		                size );	
		        System.arraycopy(
		                token.getVector(),
		                0,
		                t.getToken(),
		                0,
		                size );
		        System.arraycopy(
		                token.getVector(),
		                0,
		                t_,
		                0,
		                size );

		        x = a[0];
		        y = a[1] - a[0] + 1;
		        String res = Challenge_1Test.roll(x, y, s);

		        assertEquals(new String("0"), res);
		        System.out.println("\nroll "+ res);
		    }
		   
	        @Test
	    	public void testRoll()
	    	{
	        	final int x, y, s = 2, r = 0, d = 10, k = -1;
	        	Weapon w = Hero.weapon(1);
	      //  String t = new String('[0, 1, 2], [[1, '0, t], [[2, '0, t], [[3, t], [[4, t], [[5,
}
}