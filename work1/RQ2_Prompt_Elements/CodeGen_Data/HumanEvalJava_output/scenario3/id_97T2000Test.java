// MultiplyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Multiply}.
* It contains one unit test case for the {@link Multiply#multiply(int, int)} method.
*/
class MultiplyTest {

    
    /**
     * Test case 1.
     * complete test cases:
     * 		1*100, 1
     * 		1*21, 14
     * 		1*30, 70
     * 		1*400, 3500
     * 		1*11*25, 3
     * 		1*26*35, 13
     * 		1*22*46, 10
     * 		1*48, 500
     * 		1*21*45, 1
     * 		1*17*47, 6
     * 		1*29*25, 15
     * 		1*41*29, 2
     * 		1*52*20, 18
     * 		1*49*23, 33
     * 		1*22*27, 18
     * 		1*27*31, 22
     * 		2*20*29, 0
     * 		2*23*15, 0
     * 		2*50*5, 10
     * 		2*27*25, 5
     * 		2*33*35, 5
     * 		2*14*35, 1
     * 		2*19*45, 0
     * 		2*39*23, 2
     * 		2*42*27, 38
    * 		2*51*25, 48
     * 		2*49*23, 42
     * 		2*51*2, 35
     * @throws Exception if there is an exception during test
     */
    @Test
    void test1() throws Exception {

                        for (int r = 0; r < 10; r++) {
                                        
                                         assertTrue(multiply(10, r) == (r * r) * 2);
                                         assertTrue(multiply(11, r) == (r * r) * 12);
                                         assertTrue(multiply(100, r) == (r * r) * 25);		
                                          
                                                   
                                    }
			
    }
    /**
     * Test case 2.
     * complete test cases:
     * 		1*20, 51
     * 		3*2*16, 13
     * 		3*2*1, 33
     * 		10*7*6, 0
     * 		10*7*6, 15
    * @throws Exception if there is an exception during test
     */
    @Test
    void test2() throws Exception {

                        for (int r = 0; r < 11; r++) {
                                        
                                         assertTrue(multiply(10, r) == (r * r) * 21);
                                         assertTrue(multiply(11, r) == (r * r) * 52);
                                         assertTrue(multiply(100, r) == (r * r) * 35);
                                            
                                                   
                                    }
			
    }
    /**
     * Test case 3.
     * complete test cases:
     * 		1*25, 51
     * 		10*2*6, 15
     * 		10*1*12, 25
     * 		4*2*18, 11
     * 		4*2*0, 37
    * @throws Exception if there is an exception during test
     */
    @Test
    void test3() throws Exception {

                        for (int r = 0; r < 8; r++) {
                                        
                                         assertTrue(multiply(10, r) == (r * r) * 25);
                                         assertTrue(multiply(11, r) == (r * r) * 51);
                                         assertTrue(multiply(100, r) == (r * r) * 35);
                                            
                                                   
                                    }
			
    }

	/*
	 * Output 
	 * 
	 * 		   multiply(0, 1)
	 * 		   multiply(0, 1000)
	 * 		   multiply(1, 1000)
	 * 		   multiply(1000, 1)
	 */

	/**
     * 
     */
	@Test
    void test() {
        // @formatter:off
        Multiply m = new Multiply();
        // @formatter:on

        assertEquals(10, m.multiply(10, 1000));         // 1 * 1 = 2 * 2 = 4 * 2
        assertEquals(51, m.multiply(11, 1000));         // 30 * 30 = 60 * 60 = 120 * 120 = 12 * 120
        assertEquals(35, m.multiply(400, 1000));       // 400 * 400 = 900 * 900 = 1600 * 1600 = 200 * 200 = 400

        System.out.println(m.multiply(1, 1000));

        final int s = 1000;
        assertEquals(3 * 15 * 29, m.multiply(3, s));
        System.out.println(s);
    }
}

