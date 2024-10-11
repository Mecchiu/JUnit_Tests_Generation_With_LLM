// JCLO_1Test.java
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
class JCLO_1Test {

		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has no variables.
		*/
		@Test
		void testUsage_1() {
				JCLO jclo = new JCLO(new JCLO_1Test());
				assertEquals("", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has one variable.
		*/
		@Test
		void testUsage_2() {
				JCLO jclo = new JCLO(new JCLO_2Test());
				assertEquals("-a\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has two variables.
		*/
		@Test
		void testUsage_3() {
				JCLO jclo = new JCLO(new JCLO_3Test());
				assertEquals("-a\n-b\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has three variables.
		*/
		@Test
		void testUsage_4() {
				JCLO jclo = new JCLO(new JCLO_4Test());
				assertEquals("-a\n-b\n-c\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has four variables.
		*/
		@Test
		void testUsage_5() {
				JCLO jclo = new JCLO(new JCLO_5Test());
				assertEquals("-a\n-b\n-c\n-d\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has five variables.
		*/
		@Test
		void testUsage_6() {
				JCLO jclo = new JCLO(new JCLO_6Test());
				assertEquals("-a\n-b\n-c\n-d\n-e\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has six variables.
		*/
		@Test
		void testUsage_7() {
				JCLO jclo = new JCLO(new JCLO_7Test());
				assertEquals("-a\n-b\n-c\n-d\n-e\n-f\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has seven variables.
		*/
		@Test
		void testUsage_8() {
				JCLO jclo = new JCLO(new JCLO_8Test());
				assertEquals("-a\n-b\n-c\n-d\n-e\n-f\n-g\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has eight variables.
		*/
		@Test
		void testUsage_9() {
				JCLO jclo = new JCLO(new JCLO_9Test());
				assertEquals("-a\n-b\n-c\n-d\n-e\n-f\n-g\n-h\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has nine variables.
		*/
		@Test
		void testUsage_10() {
				JCLO jclo = new JCLO(new JCLO_10Test());
				assertEquals("-a\n-b\n-c\n-d\n-e\n-f\n-g\n-h\n-i\n", jclo.usage());
		}
}

// JCLO_10Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

/**
* Test class of {@link JCLO}.
* It contains ten variables.
*/
class JCLO_10Test {
		
		/**
		* Variable a.
		*/
		public boolean a;
		
		/**
		* Variable b.
		*/
		public byte b;
		
		/**
		* Variable c.
		*/
		public char c;
		
		/**
		* Variable d.
		*/
		public short d;
		
		/**
		* Variable e.
		*/
		public int e;
		
		/**
		* Variable f.
		*/
		public float f;
		
		/**
		* Variable g.
		*/
		public double g;
		
		/**
		* Variable h.
		*/
		public long h;
		
		/**
		* Variable i.
		*/
		public String i;
}

// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

/**
* Test class of {@link JCLO}.
* It contains no variables.
*/
class JCLO_1Test {
}

// JCLO_2Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

/**
* Test class of {@link JCLO}.
* It contains one variable.
*/
class JCLO_2Test {
		
		/**
		* Variable a.
		*/
		public boolean a;
}

// JCLO_3Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

/**
* Test class of {@link JCLO}.
* It contains two variables.
*/
class JCLO_3Test {
		
		/**
		* Variable a.
		*/
		public boolean a;
		
		/**
		* Variable b.
		*/
		public byte b;
}

// JCLO_4Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

/**
* Test class of {@link JCLO}.
* It contains three variables.
*/
class