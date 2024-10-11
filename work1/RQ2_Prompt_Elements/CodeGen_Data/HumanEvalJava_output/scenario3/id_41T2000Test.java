// CarRaceCollisionTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains one unit test case for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {
/**
		 * This method tests the code which will execute every time the {@link CarRaceCollision}
		 * method is called. A {@link NullPointerException} can be a potential outcome.
		 */
        @Test
    		public void testCarRaceCollision() {
                int result = CarRaceCollisionTest.carRaceCollision(10);
                int expected = 4;
                assertTrue(result == expected);
        }
}

// Unit test.
class CarRaceCollisionTest_unitTests {
	@Test
	void testCarRaceCollision_positiveTest() {
    int n = 10;

        assertTrue(CarRaceCollisionTest.carRaceCollision(n) == n);
        assertTrue(CarRaceCollisionTest.carRaceCollision(n) == 1);
        assertTrue(CarRaceCollisionTest.carRaceCollision(n) == 2);
        assertTrue(CarRaceCollisionTest.carRaceCollision(n) == 3);
 }
	@Test
    void testCarRaceCollision_negativeTest() throws NullPointerException {
    new NullPointerException();
    assertTrue(CarRaceCollisionTest.carRaceCollision(-10) == 0);
    assertTrue(CarRaceCollisionTest.carRaceCollision(-10) == 0);
    assertTrue(CarRaceCollisionTest.carRaceCollision(-10) == 0);
    }
}
	@Test
    void testCarRaceCollision_positive_2_unitTest() {
    int n = 100;

    assertTrue(CarRaceCollisionTest.carRaceCollision(n) == n);
    assertTrue(CarRaceCollisionTest.carRaceCollision(n) == (n/10));
    assertTrue(CarRaceCollisionTest.carRaceCollision(n) == (n/100));
    assertTrue(CarRaceCollisionTest.carRaceCollision(n) == (n/1000L));
    assertTrue(CarRaceCollisionTest.carRaceCollision(n) == (n/10000L));
    assertTrue(CarRaceCollisionTest.carRaceCollision(n) == (n/100000L));
    }
	@Test
    void testCarRaceCollision_negative_2_unitTest() throws NullPointerException {
    new NullPointerException();
    assertTrue(CarRaceCollisionTest.carRaceCollision(-100) == 0);
    assertTrue(CarRaceCollisionTest.carRaceCollision(-100) == 0);
    assertTrue(CarRaceCollisionTest.carRaceCollision(-100) == 0);
    assertTrue(CarRaceCollisionTest.carRaceCollision(-100) == 0);
    assertTrue(CarRaceCollisionTest.carRaceCollision(-100) == 0);
    assertTrue(CarRaceCollisionTest.carRaceCollision(-100) == 0);
    }

         void main(String[] args) throws InterruptedException, NullPointerException, ClassNotFoundException,
             IllegalAccessException {
            carRaceCollisionTest_unitTests();
        }
		}

			//@Test
			void testUnitTest() throws InterruptedException, NullPointerException {
                main(new String[]{ "unitTest" });
    }
			//@Test
			void testUnitTest_2() throws InterruptedException,
									NullPointerException {
                main(new String[]{ "unitTest" } );
    }
			//@Test
			void testUnitTest_6() throws InterruptedException,
									NullPointerException {
                main(new String[]{ "unitTest", "unitTest" });
    }

		//@After
		void after(String[] args) throws InterruptedException,
				NullPointerException, ClassNotFoundException,
				IllegalAccessException {
    		carRaceCollisionTest_unitTests();
    }
		}


	// The following is a unit test of {@link CarRaceCollision#carRaceCollision(int)}.
	// Note: The unit test should be a subclass that can be tested using
	// the specific test for that sub-class, i.e. the test for the test
	// class of CarRaceCollision.  In the current implementation of this
	// method, testUnitTest is a subclass of CarRaceCollision_unitTests.
	// When running a separate test it is a good idea to add this method
	// to the test classes of CarRaceCollision.  That way the unit test
	// tests can be run by name. Example:
	// @AfterClass
	// public static void test() throws InterruptedException,
	// NullPointerException, ClassNotFoundException,
	// IllegalAccessException {
		// CarRaceCollisionTest.testUnitTest();
		// }

	// The above method needs to be run using one of these names.  The unit test
	// runs using the class names above and this will automatically provide
	// access to the specific test class of CarRaceCollision. This means that
	// the specific method that tests the test class becomes redundant.
	// However, if you have testClasses.getClass(testName) or testClasses.getMethod(testMethodName)
	// where testName and testMethodName are the same, then this will automatically provide
	// access to the specific method that runs the test.
	// The unit test won't be able to run the test, it must be manually tested by
	// calling one of those tests above or one of these named methods.
	// This method is a subclass of CarRaceCollision_unitTests, which
	// has the same characteristics, and so ensures it's being tested directly,
	// i.e. it isn't an instance method.
	// This method could be a subclass of CarRaceCollision.
	// However, if you add another instance method in this class, the result is
	// that the method is not named like the original (for testing).
	// (This could happen if you mix names with other methods like CarRaceCollision_unitTests.testFoo() and
	// CarRaceCollision_UnitTest.testFoo())
	// @After
	// public static void test(String[] args) throws InterruptedException,
	// NullPointerException, ClassNotFoundException,
	// IllegalAccessException {
		// CarRaceCollisionTest.testUnitTest();
		// }
});
			



