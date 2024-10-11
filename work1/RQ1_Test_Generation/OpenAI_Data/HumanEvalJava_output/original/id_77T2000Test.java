// IscubeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {
	/**
			* Test case 1: input is 1.
			* Expected output: true.
			*/
			@Test
			void test1() {
						assertTrue(Iscube.iscube(1));
			}

			/**
			* Test case 2: input is 2.
			* Expected output: false.
			*/
			@Test
			void test2() {
						assertFalse(Iscube.iscube(2));
			}

			/**
			* Test case 3: input is -1.
			* Expected output: true.
			*/
			@Test
			void test3() {
						assertTrue(Iscube.iscube(-1));
			}

			/**
			* Test case 4: input is 64.
			* Expected output: true.
			*/
			@Test
			void test4() {
						assertTrue(Iscube.iscube(64));
			}

			/**
			* Test case 5: input is 0.
			* Expected output: true.
			*/
			@Test
			void test5() {
						assertTrue(Iscube.iscube(0));
			}

			/**
			* Test case 6: input is 180.
			* Expected output: false.
			*/
			@Test
			void test6() {
						assertFalse(Iscube.iscube(180));
			}

			/**
			* Test case 7: input is 1000.
			* Expected output: true.
			*/
			@Test
			void test7() {
						assertTrue(Iscube.iscube(1000));
			}

			/**
			* Test case 8: input is 1729.
			* Expected output: false.
			*/
			@Test
			void test8() {
						assertFalse(Iscube.iscube(1729));
			}

			/**
			* Test case 9: input is 729.
			* Expected output: true.
			*/
			@Test
			void test9() {
						assertTrue(Iscube.iscube(729));
			}

			/**
			* Test case 10: input is 1331.
			* Expected output: true.
			*/
			@Test
			void test10() {
						assertTrue(Iscube.iscube(1331));
			}
}
