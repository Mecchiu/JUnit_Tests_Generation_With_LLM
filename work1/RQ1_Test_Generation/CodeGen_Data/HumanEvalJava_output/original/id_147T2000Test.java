// GetMaxTriplesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains one unit test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {
static final int N = 12;
		
    @Test
    void test1() {
        for (int i = 0; i < N; i++) {
            assertEquals(i, new GetMaxTriples().getMaxTriples(i));
            assertEquals(i + 1, new GetMaxTriples().getMaxTriples(i + 1));
        }
    }

    @Test
    void test2() {
        int data[] = new int[N];
        data[0] = 1;
        data[1] = 1;
        data[2] = 1;
        
        assertEquals(N - 2, new GetMaxTriples().getMaxTriples(0));
        assertEquals(N - 1, new GetMaxTriples().getMaxTriples(1));
        assertEquals(2, new GetMaxTriples().getMaxTriples(2));
        
        data[3] = 1;
        data[4] = 1;
        data[5] = 1;
        
        assertEquals(N, new GetMaxTriples().getMaxTriples(3));
        assertEquals(N + 1, new GetMaxTriples().getMaxTriples(4));
        assertEquals(N, data[5], 1);
    }

	@Test
	void test3() {
		assertEquals(2147483648, new GetMaxTriples().getMaxTriples(2147483647));
	}
	
	@Test
	void test4(){
		int data[] = new int[12]; 
		data[5] = 2147483647;
		data[4] = 65537;
		data[3] = 16;
		
		data[0] = 2;
		
		assertEquals(348529, new GetMaxTriples().getMaxTriples(5));
		assertEquals(348529, new GetMaxTriples().getMaxTriples(6));
		assertEquals(348530, new GetMaxTriples().getMaxTriples(7));
		assertEquals(1234789033L, new GetMaxTriples().getMaxTriples(8));
		assertEquals(1234789034L, new GetMaxTriples().getMaxTriples(9));
	}

}
