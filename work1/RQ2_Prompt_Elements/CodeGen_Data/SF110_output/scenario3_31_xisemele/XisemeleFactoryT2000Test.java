// XisemeleFactoryTest.java
package net.sf.xisemele.impl;

import net.sf.xisemele.api.Xisemele;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XisemeleFactory}.
* It contains one unit test case for the {@link XisemeleFactory#newXisemele()} method.
*/
class XisemeleFactoryTest {

	/**
	 * Test of {@link XisemeleFactory#newXisemele()} method, of class
	 * {@link XisemeleFactory}.
	 * <p>
	 * Test case: {@link XisemeleFactoryTest#XisemeleFactoryTest()} <!--
	 * {@link #XisemeleFactoryTest()} -->
	 * </p>
	 * <b>Result :</b>
	 * <ul>
	 * <li>{@link XisemeleFactoryTest#newXisemele()} method returned value is
	 * the newly created {@link Xisemele} </li>
	 * </ul>
	 */
	@Test
	public void testConstructor_NullValue_NoXisemele_ReturnNull() {
		final TestXisemele testee = new NullTestXisemele();
		assertEquals(testee, null, "The returned value is not null".toString());
	}

	/**
	 * Test of {@link XisemeleFactory#newXisemele()} method, of class
	 * {@link XisemeleFactory}.
	 * <p>
	 * Test case: {@link XisemeleFactoryTest#XisemeleFactoryTest()} <!--
	 * {@link #XisemeleFactoryTest()} -->
	 * </p>
	 * <b>Result :</b>
	 * <ul>
	 * <li>{@link XisemeleFactoryTest#newXisemele()} method returned value is
	 * the newly created {@link Xisemele}</li>
	 * </ul>
	 */
	@Test
	public void testConstructor_NonNullValue_CreateXisemele_ReturnItsType() {
		final Xisemele testee;
		try {
			testee = new TestXisemele();
		} catch (ClassCastException cce) {
            assertTrue(cce.toString(), true);
			assertEquals(cce.getClass(), TestXisemele.class, "ClassCastException, testee class");
			return;
		} catch (IllegalAccessException iae) {
            assertTrue(iae.toString(), true);
		} catch (InstantiationException ie) {
            assertTrue(ie.toString(), true);
		}
		assertEquals(testee, null, "An exception was not thrown.".toString());
	}

	/**
	 * Test of {@link XisemeleFactory#newXisemele()} method, of class
	 * {@link XisemeleFactory}.
	 * <p>
	 * Test case: {@link XisemeleFactoryTest#XisemeleFactoryTest()} <!--
	 * {@link #XisemeleFactoryTest()} -->
	 * </p>
	 * <b>Result :</b>
	 * <ul>
	 * <li>{@link XisemeleFactoryTest#newXisemele()} method returned value is
	 * the newly created {@link Xisemele}</li>
	 * </ul>
	 */
	@Test
	public void testConstructor_NullPointerException_CreateXisemele_ReturnNull() {
		final Xisemele testee;
		try {
			testee = new NullTestXisemele();
		} catch (NullPointerException npe) {
            assertEquals(npe.toString(), "XisemeleFactory.createXisemele() method returned null (" + npe.getClass() + ".", null));
			return;
		}

		assertEquals(testee, null, "An exception was not thrown.".toString());
	}

	/**
	 * A test class of {@link XisemeleFactory}.
	 * <p>
	 * A test case of {@link XisemeleFactoryTest#newXisemele()} method, of class
	 * {@link XisemeleFactory}.
	 * </p>
	 * <b>Result :</b>
	 * <ul>
	 * <li>{@link XisemeleFactoryTest#newXisemele()} method returned value is
	 * the newly created {@link Xisemele}</li>
	 * </ul>
	 */
	private static class TestXisemele extends Xisemele {
		
		final String classValue;

		/**
		 * Creates new {@link XisemeleFactoryTest.TestXisemele} and defines a parameter class {@code classValue}.
		 */
		@SuppressWarnings("unused")
		public TestXisemele() {
            this(TestXisemeleFactoryTest.class);
		}

		/**
		 * Creates new {@link XisemeleFactoryTest.TestXisemele} definition and defines a parameter object {@code object}.
		 *
		 * @param aType A dummy dummy parameter {@code classValue}
		 */
		public TestXisemele(String aType) {
			super();
			this.classValue = aType;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public Xisemele create() {
			return super.create(classValue);
		}

		@Override
		public String toString() {
			final String result = super.toString();
			final String s = "Class = " + this.getClass().getName() + ", Name = " + this.toString() + ", Test Class = " + this.getClass().getName() + ", Test Name = " + result;
			return s;
		}
	}

	private class NullTestXisemele extends Null<TestXisemele> implements Xisemele {

		/**
		 * Constructs a new {@link XisemeleFactoryTest.NullTestXisemele} instance.
		 *
		 * @param <T> The return type of the returned value {@code object}
		 * @param aType The dummy dummy parameter {@code classValue}
		 */
		protected static <T> Xisemele newXisemele(final String aType) {
			return new TestXisemele(aType);
		}

		@Override
		public String toString() {
            final String result = super.toString();
			final String s = "Class = " + this.getClass().getName() + ", Name = " + this.toString() + ", Test Class = " + this.getClass().getName() + ", Test Name = " + result;
			return s;
		}

	}

}
