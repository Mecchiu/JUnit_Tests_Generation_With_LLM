// VowelsCountTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
			@Test
			void testVowelsCount1() {
				assertEquals(0, VowelsCount.vowelsCount(""));
			}
			
			@Test
			void testVowelsCount2() {
				assertEquals(1, VowelsCount.vowelsCount("a"));
			}
			
			@Test
			void testVowelsCount3() {
				assertEquals(1, VowelsCount.vowelsCount("A"));
			}
			
			@Test
			void testVowelsCount4() {
				assertEquals(2, VowelsCount.vowelsCount("ae"));
			}
			
			@Test
			void testVowelsCount5() {
				assertEquals(2, VowelsCount.vowelsCount("AE"));
			}
			
			@Test
			void testVowelsCount6() {
				assertEquals(3, VowelsCount.vowelsCount("aei"));
			}
			
			@Test
			void testVowelsCount7() {
				assertEquals(3, VowelsCount.vowelsCount("AEI"));
			}
			
			@Test
			void testVowelsCount8() {
				assertEquals(4, VowelsCount.vowelsCount("aeio"));
			}
			
			@Test
			void testVowelsCount9() {
				assertEquals(4, VowelsCount.vowelsCount("AEIO"));
			}
			
			@Test
			void testVowelsCount10() {
				assertEquals(5, VowelsCount.vowelsCount("aeiou"));
			}
			
			@Test
			void testVowelsCount11() {
				assertEquals(5, VowelsCount.vowelsCount("AEIOU"));
			}
			
			@Test
			void testVowelsCount12() {
				assertEquals(1, VowelsCount.vowelsCount("y"));
			}
			
			@Test
			void testVowelsCount13() {
				assertEquals(1, VowelsCount.vowelsCount("Y"));
			}
			
			@Test
			void testVowelsCount14() {
				assertEquals(2, VowelsCount.vowelsCount("ay"));
			}
			
			@Test
			void testVowelsCount15() {
				assertEquals(2, VowelsCount.vowelsCount("AY"));
			}
			
			@Test
			void testVowelsCount16() {
				assertEquals(3, VowelsCount.vowelsCount("aye"));
			}
			
			@Test
			void testVowelsCount17() {
				assertEquals(3, VowelsCount.vowelsCount("AYE"));
			}
			
			@Test
			void testVowelsCount18() {
				assertEquals(4, VowelsCount.vowelsCount("ayee"));
			}
			
			@Test
			void testVowelsCount19() {
				assertEquals(4, VowelsCount.vowelsCount("AYEE"));
			}
			
			@Test
			void testVowelsCount20() {
				assertEquals(5, VowelsCount.vowelsCount("ayeee"));
			}
			
			@Test
			void testVowelsCount21() {
				assertEquals(5, VowelsCount.vowelsCount("AYEEE"));
			}
			
			@Test
			void testVowelsCount22() {
				assertEquals(0, VowelsCount.vowelsCount("bcdfghjklmnpqrstvwxz"));
			}
			
			@Test
			void testVowelsCount23() {
				assertEquals(0, VowelsCount.vowelsCount("BCDFGHJKLMNPQRSTVWXZ"));
			}
			
			@Test
			void testVowelsCount24() {
				assertEquals(1, VowelsCount.vowelsCount("by"));
			}
			
			@Test
			void testVowelsCount25() {
				assertEquals(1, VowelsCount.vowelsCount("BY"));
			}
			
			@Test
			void testVowelsCount26() {
				assertEquals(2, VowelsCount.vowelsCount("bye"));
			}
			
			@Test
			void testVowelsCount27() {
				assertEquals(2, VowelsCount.vowelsCount("BYE"));
			}
			
			@Test
			void testVowelsCount28() {
				assertEquals(3, VowelsCount.vowelsCount("byee"));
			}
			
			@Test
			void testVowelsCount29() {
				assertEquals(3, VowelsCount.vowelsCount("BYEE"));
			}
			
			@Test
			void testVowelsCount30() {
				assertEquals(4, VowelsCount.vowelsCount("byeee"));
			}
			
			@Test
			void testVowelsCount31() {
				assertEquals(4, VowelsCount.vowelsCount("BYEEE"));
			}
			
			@Test
			void testVowelsCount32() {
				assertEquals(5, VowelsCount.vowelsCount("byeeee"));
			}
			
			@Test
			void testVowelsCount33() {
				assertEquals(5, VowelsCount.vowelsCount("BYEEEE"));
			}
			
			@Test
			void testVowelsCount34() {
				assertEquals(0, VowelsCount.vowelsCount("by"));
			}
			
			@Test
			void testVowelsCount35() {
				assertEquals(0, VowelsCount.vowelsCount("BY"));
			}
			
			@Test
			void testVowelsCount36() {
				assertEquals(0, VowelsCount.vowelsCount("bye"));
			}
			
			@Test
			void testVowelsCount37() {
				assertEquals(0, VowelsCount.vowelsCount("BYE"));
			}
			
			@Test
			void testVowelsCount38() {
				assertEquals(0, VowelsCount.vowelsCount("byee"));
			}
			
			@Test
			void testVowelsCount39() {
				assertEquals(0, VowelsCount.vowelsCount("BYEE"));
			}
			
			@Test
			void testVowelsCount40() {
				assertEquals(0, VowelsCount.vowelsCount("byeee"));
			}
			
			@Test
			void testVowelsCount41() {
				assertEquals(0, VowelsCount.vowelsCount("BYEEE"));
			}
			
			@Test
			void testVowelsCount42() {
				assertEquals(0, VowelsCount.vowelsCount("byeeee"));
			}
			
			@Test
			void testVowelsCount43() {
				assertEquals(0, VowelsCount.vowelsCount("BYEEEE"));
			}
			
			@Test
			void testVowelsCount44() {
				assertEquals(0, VowelsCount.vowelsCount("by"));
			}
			
			@Test
			void testVowelsCount45() {
				assertEquals(0, VowelsCount.vowelsCount("BY"));
			}
			
			@Test
			void testVowelsCount46() {
				assertEquals(0, VowelsCount.vowelsCount("bye"));
			}
			
			@Test
			void testVowelsCount47() {
				assertEquals(0, VowelsCount.vowelsCount("BYE"));
			}
			
			@Test
			void testVowelsCount48() {
				assertEquals(0, VowelsCount.vowelsCount("byee"));
			}
			
			@Test
			void testVowelsCount49() {
				assertEquals(0, VowelsCount.vowelsCount("BYEE"));
			}
			
			@Test
			void testVowelsCount50() {
				assertEquals(0, VowelsCount.vowelsCount("byeee"));
			}
			
			@Test
			void testVowelsCount51() {
				assertEquals(0, VowelsCount.vowelsCount("BYEEE"));
			}
			
			@Test
			void testVowelsCount52() {
				assertEquals(0, VowelsCount.vowelsCount("byeeee"));
			}
			
			@Test
			void testVowelsCount53() {
				assertEquals(0, VowelsCount.vowelsCount("BYEEEE"));
			}
			
			@Test
			void testVowelsCount54() {
				assertEquals(0, VowelsCount.vowelsCount("by"));
			}
			
			@Test
			void testVowelsCount55() {
				assertEquals(0, VowelsCount.vowelsCount("BY"));
			}
			
			@Test
			void testVowelsCount56() {
				assertEquals(0, VowelsCount.vowelsCount("bye"));
			}
			
			@Test
			void testVowelsCount57() {
				assertEquals(0, VowelsCount.vowelsCount("BYE"));
			}
			
}