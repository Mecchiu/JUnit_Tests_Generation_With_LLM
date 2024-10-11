// JCLOTest.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLOTest {

		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has no fields.
		*/
		@Test
		void testUsageNoFields() {
				JCLO jclo = new JCLO(new NoFields());
				assertEquals("", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only final fields.
		*/
		@Test
		void testUsageOnlyFinalFields() {
				JCLO jclo = new JCLO(new OnlyFinalFields());
				assertEquals("", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields.
		*/
		@Test
		void testUsageOnlyNonFinalFields() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields());
				assertEquals("-a\n-b\n-c\n-d\n-e\n-f\n-g\n-h\n-i\n-j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFields() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields());
				assertEquals("-a\n-b\n-c\n-d\n-e\n-f\n-g\n-h\n-i\n-j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields and a prefix.
		*/
		@Test
		void testUsageOnlyNonFinalFieldsWithPrefix() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields(), "prefix");
				assertEquals("-a\n-b\n-c\n-d\n-e\n-f\n-g\n-h\n-i\n-j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields and a prefix.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFieldsWithPrefix() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields(), "prefix");
				assertEquals("-a\n-b\n-c\n-d\n-e\n-f\n-g\n-h\n-i\n-j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields and a prefix and double dashes.
		*/
		@Test
		void testUsageOnlyNonFinalFieldsWithPrefixAndDoubleDashes() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields and a prefix and double dashes.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFieldsWithPrefixAndDoubleDashes() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields and double dashes.
		*/
		@Test
		void testUsageOnlyNonFinalFieldsWithDoubleDashes() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields(), null, true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields and double dashes.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFieldsWithDoubleDashes() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields(), null, true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageOnlyNonFinalFieldsWithDoubleDashesAndPrefix() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFieldsWithDoubleDashesAndPrefix() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageOnlyNonFinalFieldsWithDoubleDashesAndPrefix2() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFieldsWithDoubleDashesAndPrefix2() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageOnlyNonFinalFieldsWithDoubleDashesAndPrefix3() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFieldsWithDoubleDashesAndPrefix3() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageOnlyNonFinalFieldsWithDoubleDashesAndPrefix4() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFieldsWithDoubleDashesAndPrefix4() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageOnlyNonFinalFieldsWithDoubleDashesAndPrefix5() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFieldsWithDoubleDashesAndPrefix5() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageOnlyNonFinalFieldsWithDoubleDashesAndPrefix6() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFieldsWithDoubleDashesAndPrefix6() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has only non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageOnlyNonFinalFieldsWithDoubleDashesAndPrefix7() {
				JCLO jclo = new JCLO(new OnlyNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has both final and non-final fields and double dashes and a prefix.
		*/
		@Test
		void testUsageBothFinalAndNonFinalFieldsWithDoubleDashesAndPrefix7() {
				JCLO jclo = new JCLO(new BothFinalAndNonFinalFields(), "prefix", true);
				assertEquals("--a\n--b\n--c\n--d\n--e\n--f\n--g\n--h\n--i\n--j\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage