// IsBoredTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
	@Test
			void testIsBored1() {
				assertEquals(0, IsBored.isBored("Hello world"));
			}
			
			@Test
			void testIsBored2() {
				assertEquals(0, IsBored.isBored("Is the sky blue?"));
			}
			
			@Test
			void testIsBored3() {
				assertEquals(1, IsBored.isBored("I love It !"));
			}
			
			@Test
			void testIsBored4() {
				assertEquals(0, IsBored.isBored("bIt"));
			}
			
			@Test
			void testIsBored5() {
				assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
			}
			
			@Test
			void testIsBored6() {
				assertEquals(0, IsBored.isBored("You and I are going for a walk"));
			}
			
			@Test
			void testIsBored7() {
				assertEquals(1, IsBored.isBored("I am bored"));
			}
			
			@Test
			void testIsBored8() {
				assertEquals(0, IsBored.isBored("I am not bored"));
			}
			
			@Test
			void testIsBored9() {
				assertEquals(1, IsBored.isBored("I am bored. I am not bored"));
			}
			
			@Test
			void testIsBored10() {
				assertEquals(2, IsBored.isBored("I am bored. I am not bored. I am bored again"));
			}
}
