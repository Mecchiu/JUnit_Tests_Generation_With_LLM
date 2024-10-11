// IscubeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {
			@Test
			void test1() {
				assertTrue(Iscube.iscube(1));
			}
			
			@Test
			void test2() {
				assertTrue(Iscube.iscube(8));
			}
			
			@Test
			void test3() {
				assertTrue(Iscube.iscube(27));
			}
			
			@Test
			void test4() {
				assertTrue(Iscube.iscube(64));
			}
			
			@Test
			void test5() {
				assertTrue(Iscube.iscube(125));
			}
			
			@Test
			void test6() {
				assertTrue(Iscube.iscube(216));
			}
			
			@Test
			void test7() {
				assertTrue(Iscube.iscube(343));
			}
			
			@Test
			void test8() {
				assertTrue(Iscube.iscube(512));
			}
			
			@Test
			void test9() {
				assertTrue(Iscube.iscube(729));
			}
			
			@Test
			void test10() {
				assertTrue(Iscube.iscube(1000));
			}
}