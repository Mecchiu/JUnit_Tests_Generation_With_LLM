// SpecialFactorialTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains one unit test case for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {
private SpecialFactorial sfs;

		/**
		* Gets the private shared {@link TestCaseShared} object holding the {@link SpecialFactorial} object.
		* @return a {@link TestCaseShared} object.
		* @throws NullPointerException if Shared is <code>null</code>.
		*/
	@Test
	public final void getSharedNoArgConstructor() {
		assertNotNull(new SpecialFactorial.Shared(new SpecialFactorial(3)));
	}

		/**
		* Checks if default constructor called on {@link SpecialFactorial} object instance fails.
		*/
	@Test
	public final void constructor() {
		assertNotNull(new SpecialFactorial.Default());
	}

	/**
	* Checks if default constructor calls super constructor {@link SpecialFactorial#specialFactorial(int)} method.
	*/
	@Test
	public final void constructorInt() {
		new SpecialFactorial.Default(6);
	}

	/**
	* Checks if default constructor calls super constructor {@link SpecialFactorial#specialFactorial(int)} method with the exact argument parameter greater than <code>0</code>.
	*/
	@Test
	public final void constructorIntSmall() {
		new SpecialFactorial.Default(7);
	}

	/**
	* Checks if default constructor calls super constructor {@link SpecialFactorial#specialFactorial(int)} method with <code>invalidParam</code>.
	*/
	@Test(expected = Throwable.class)
	public final void constructorIntEinvalidParam() {
		new SpecialFactorial.Default(8);
	}

	// Methods for subclasses

	/**
	* Checks if sub method {@link SpecialFactorial#specialFactorial(int)} calls super method {@link SpecialFactorial#specialFactorial(int)}.
	*/
	@Test
	public final void subSpecialFactorialInt() {
		assertEquals(2, sfs.specialFactorial(3));
	}

	/**
	* Checks if sub method {@link SpecialFactorial#specialFactorial(int)} calls super method {@link SpecialFactorial#specialFactorial(int)}.
	*/
	@Test
	public final void subSpecialFactorialIntEq() {
		assertEquals(0, sfs.specialFactorial(4));
	}

	// Methods for subclasses

	@Test
	public final void subSharedNoArgConstructor() {
		assertNotNull(new SpecialFactorial.Shared(new SpecialFactorial(3)));
	}

	@Test
	public final void subNoArgsConstructor() {
		new SpecialFactorial.Default();
	}

}