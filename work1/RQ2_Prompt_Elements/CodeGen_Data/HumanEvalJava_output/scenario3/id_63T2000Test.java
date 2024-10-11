// FibfibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fibfib}.
* It contains one unit test case for the {@link Fibfib#fibfib(int)} method.
*/
class FibfibTest {
private int result;
		private final int[] answer = new int[1];
	public static int fibfib( int n) {
		answer[0] = n;
		return answer[0];
	}
	public static int fibfibInt(int n) {
		return fibfib(n);
	}
	
		@Test
		void fibfibInt() {
			assertEquals(1, fibfibInt(0));
			answer[0] = 1;
			assertEquals(2, fibfibInt(1));
			answer[0] = 2; 
			assertEquals(3, fibfibInt(101));
			answer[0] = 3; 
			assertEquals(11, fibfibInt(1001));
			answer[0] = 4; 
			assertEquals((4+4) / 2, fibfibInt(5));
			answer[0] = 4; 
			assertEquals((4+4) / 2, fibfibInt(6));
			answer[0] = 5; 
			assertEquals(151, fibfibInt(16));
			answer[0] = 6; 
			assertEquals(1818, fibfibInt(26));
			answer[0] = 7; 	
			assertEquals(1957, fibfibInt(45));
			answer[0] = 8; 	
			assertEquals(2025, fibfibInt(54));
			answer[0] = 9; 	
			assertEquals(2239, fibfibInt(55));
			answer[0] = 10; 	
			assertEquals(2281, fibfibInt(58));
			answer[0] = 11; 	
			assertEquals(2321, fibfibInt(63));
			answer[0] = 12; 	
			assertEquals(2431, fibfibInt(66));
			answer[0] = 13; 	
			assertEquals(2472, fibfibInt(74));
			answer[0] = 14; 	
			assertEquals(2504, fibfibInt(78));
			answer[0] = 15; 	
			assertEquals(2520, fibfibInt(88));
			answer[0] = 16; 	
			assertEquals(2584, fibfibInt(98));
			answer[0] = 17; 	
			assertEquals(2624, fibfibInt(100));
			answer[0] = 18; 	
			assertEquals(2680, fibfibInt(101));
			answer[0] = 19; 	
			assertEquals(2712, fibfibInt(106));
			answer[0] = 20; 	
			assertEquals(2743, fibfibInt(107));
			answer[0] = 21; 	
			assertEquals(2781, fibfibInt(108));
			answer[0] = 22; 	
			assertEquals(2831, fibfibInt(110));
			answer[0] = 23; 	
			assertEquals(2881, fibfibInt(111));
			answer[0] = 24; 	
			assertEquals(2921, fibfibInt(112));
			answer[0] = 25; 	
			assertEquals(2951, fibfibInt(134));
			answer[0] = 26; 	
			assertEquals(2971, fibfibInt(149));
			answer[0] = 27; 	
			assertEquals(3005, fibfibInt(150));
			answer[0] = 28; 	
			assertEquals(3105, fibfibInt(151));
			answer[0] = 29; 	
			assertEquals(3175, fibfibInt(154));
			answer[0] = 30; 	
			assertEquals(3225, fibfibInt(159));
			answer[0] = 31; 	
			assertEquals(3341, fibfibInt(162));
			answer[0] = 32; 	
			assertEquals(3391, fibfibInt(167));
			answer[0] = 33; 	
			assertEquals(3405, fibfibInt(168));
			answer[0] = 34; 	
			assertEquals(3415, fibfibInt(169));
			answer[0] = 35; 	
			assertEquals(3435, fibfibInt(170));
			answer[0] = 36; 	
			assertEquals(3441, fibfibInt(181));
			answer[0] = 37; 	
			assertEquals(3447, fibfibInt(182));
			answer[0] = 38; 	
			assertEquals(3451, fibfibInt(183));
			answer[0] = 39; 	
			assertEquals(3481, fibfibInt(184));
			answer[0] = 40; 	
			assertEquals(3491, fibfibInt(185));
			answer[0] = 41; 	
			assertEquals(3501, fibfibInt(186));
			answer[0] = 42; 	
			assertEquals(3511, fibfibInt(187));
			answer[0] = 43; 	
			assertEquals(3517, fibfibInt(188));
			answer[0] = 44; 	
			assertEquals(3521, fibfibInt(190));
			answer[0] = 45; 	
			assertEquals(3521, fibfibInt(191));
			answer[0] = 46; 	
			assertEquals(3521, fibfibInt(192));
			answer[0] = 47; 	
			assertEquals(3521, fibfibInt(193));
			answer[0] = 48;
			assertEquals(353, fibfibInt(194));
			answer[0] = 49;
			assertEquals(360, fibfibInt(195));
			answer[0] = 50;
			assertEquals(361, fibfibInt(196));
			answer[0] = 51;
			assertEquals(362, fibfibInt(197));
			answer[0] = 52;
			assertEquals(364, fibfibInt(198));
			answer[0] = 53;
			assertEquals(365, fibfibInt(199));
			answer[0] = 54;
			assertEquals(3671, fibfibInt(201));
			answer[0] = 55;
			assertEquals(3692, fibfibInt(202));
			answer[0] = 56;
			assertEquals(3711, fibfibInt(203));
			answer[0] = 57;
			assertEquals(3721, fibfibInt(204));
			answer[0] = 58;
			assertEquals(3731, fibfibInt(205));
			answer[0] = 59;
			assertEquals(3742, fibfibInt