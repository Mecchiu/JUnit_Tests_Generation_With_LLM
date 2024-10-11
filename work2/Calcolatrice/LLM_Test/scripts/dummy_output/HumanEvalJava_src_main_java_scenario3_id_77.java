// IscubeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {
			/**
			* Test case 1: Test if 1 is a cube of some integer number.
			* Expected output: true
			*/
			@Test
			void test1() {
						assertTrue(Iscube.iscube(1));
			}

			/**
			* Test case 2: Test if 2 is a cube of some integer number.
			* Expected output: false
			*/
			@Test
			void test2() {
						assertFalse(Iscube.iscube(2));
			}

			/**
			* Test case 3: Test if -1 is a cube of some integer number.
			* Expected output: true
			*/
			@Test
			void test3() {
						assertTrue(Iscube.iscube(-1));
			}

			/**
			* Test case 4: Test if 64 is a cube of some integer number.
			* Expected output: true
			*/
			@Test
			void test4() {
						assertTrue(Iscube.iscube(64));
			}

			/**
			* Test case 5: Test if 180 is a cube of some integer number.
			* Expected output: false
			*/
			@Test
			void test5() {
						assertFalse(Iscube.iscube(180));
			}

			/**
			* Test case 6: Test if 1000 is a cube of some integer number.
			* Expected output: true
			*/
			@Test
			void test6() {
						assertTrue(Iscube.iscube(1000));
			}

			/**
			* Test case 7: Test if 0 is a cube of some integer number.
			* Expected output: true
			*/
			@Test
			void test7() {
						assertTrue(Iscube.iscube(0));
			}

			/**
			* Test case 8: Test if 1729 is a cube of some integer number.
			* Expected output: false
			*/
			@Test
			void test8() {
						assertFalse(Iscube.iscube(1729));
			}

			/**
			* Test case 9: Test if 729 is a cube of some integer number.
			* Expected output: true
			*/
			@Test
			void test9() {
						assertTrue(Iscube.iscube(729));
			}

			/**
			* Test case 10: Test if 1331 is a cube of some integer number.
			* Expected output: true
			*/
			@Test
			void test10() {
						assertTrue(Iscube.iscube(1331));
			}
}