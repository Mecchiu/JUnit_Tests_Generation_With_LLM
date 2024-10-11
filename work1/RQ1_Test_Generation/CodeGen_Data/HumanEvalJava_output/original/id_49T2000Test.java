// ModpTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains one unit test case for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {

	  int expval = 2; // This is intended for testing. Other examples are:
	 
	    int modval(int n, int p) {
	    	int res = 1; 
	    	for (int i = 0; i < n; i++) {
	    		if ((i+1) % p == 0 && i!= 0) {
	    	    	 res = 1;
	    		}
	    	}
	    	return res;
	    }
	  
	    int modp(int n, int p) {
	        return (n > p)? modp(n, p - 1) : modp(n - 1, p); 
	    }

	public ModpTest() {
	    	
	}
	
	
    @Test
	  void test() {
		 assertEquals("modp(" + 1 + "1," + 2 + ") == 2", new Integer(modval(1, 2)).toString(),
		 "modp(" + 1 + "1," + 2 + ") == " + new Integer(modval(1, 2)).toString());

		 assertEquals("modp(" + 2 + "0," + 0 + ") == 1", new Integer(modp(1, 0)).toString(),
		 "modp(" + 2 + "0," + 0 + ") == " + new Integer(modp(1, 0)).toString());

		 assertEquals("modp(" + 1 + "3," + 2 + ") == 1", new Integer(modval(1, 3)).toString(),
		 "modp(" + 1 + "3," + 2 + ") == " + new Integer(modval(1, 3)).toString());
	
	}
 }