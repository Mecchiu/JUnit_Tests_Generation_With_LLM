// InspirentoUtilities_0Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilities_0Test {
		
	/**
	 * Unit test constructor for <code>tokenize(String)</code>.
	 *
	 * @see #tokenize(String)
	 */
    @SuppressWarnings("javadoc")
	@Test
    public void testTokenize() {
		Vector<Class<?>> v = new Vector<Class<?>>();
		assertTrue(tokensOnly(new String[] {"file", "edit", "view"}));
		v.add(Vector.class);
		assertFalse(tokensOnly(new Object[] {"file", "edit", "view"}));
		v.add(String.class);
		assertFalse(tokensOnly(new Object[] {new Object(), new Object(), new String()}));
		v.add(String.class);
		assertFalse(tokensOnly(new Object[] {"file", "edit", "view"}));
		v.add(String.class);
		assertFalse(tokensOnly(new Object[] {"file", "edit", "view"}));

		for (Class<?> c : v) {
			System.out.println("Testing method " + c.getName() + ".tokenize");
			v.remove(c);
			System.out.println("testTokenize: checking if method throws NoSuchMethodException");
			try {
				tokenize(new String(""));
				fail("NoSuchMethodException should have been thrown");
			}
			catch (NoSuchMethodException e) {
				// expected
			}
			System.out.println("testTokenize: checking if method returns an empty array");
			String[] arr = tokenize(new String(""));
			assertNotNull(arr);
			assertTrue(arr.length == 0);
			v.remove(c);

			System.out.println("testTokenize: changing " + c.getName() + ".tokenize to a list");
			ArrayList<Class<?>> fl = new ArrayList<Class<?>>(v);
			v.add(fl.get(0));
			System.out.println("testTokenize: changing " + c.getName() + ".tokenize to a list");
			fl.removeAll(v);
			v.remove(fl.get(0));

			ArrayList<String> at = new ArrayList<String>();
			at.add(new String(new String(new String(new String(new String("file"))
					.getBytes("UTF-8"))).replace(" ",".")
					.replace("[", "(").replace(parenthesisOpen("("), "[")).replace(
					")", ")").toString()));
			at.add(new String(new String(new String(new String(new String("edit"))
					.getBytes("UTF-8"))).replace(" ",".").replace("[", "(").replace(parenthesisClose("("), "]))
					.replace("]",",")))
					.replace(", ", ",",").replace(",", ","));
			System.out.println("testTokenize: changing " + c.getName() + ".tokenize to a list of strings");
			String[] arr2 = new String[at.size()];
			at.toArray(arr2);
			String str2[] = new String[at.size()];
			for (int i = 0; i < arr2.length; i++) {
				System.out.println(i+"\t"+arr2[i] + "\t"+"\t"+"\t"+"\t"+(String)arr2[i].replace(", ", ",")));
				str2[i] = new String((String)arr2[i]);
			}
			assertEquals(new String[at.size()], str2);

			System.out.println("testTokenize: tokenizing on token '" + new String(new String(new String("view 1"))
					.getBytes("UTF-8")) + "'' returning '" + new String("") + "'");
			arr = tokenize(new String(new String(new String("view 1"))
					.getBytes("UTF-8")));
			assertNotNull(arr);
			System.out.println("tokenize on token '" + new String(new String(new String("view 1"))
					.getBytes("UTF-8")) + "'' returning '" + new String("") + "'");
			for (Object t : arr) {
				System.out.println("\ttokenize: "+t + "\ttokenize: "+arr[i]);
				assertEquals(new String(new String(new String(new String("view 1"))
						.getBytes("UTF-8"))),t);
			}
		}
	}

	@Test public void StringArray() {
		assertNull(tokenize(""));
		assertNotNull(tokener(""));
		assertTrue(tokener("").equals(""));
		assertFalse(tokener("a").equals(""));
	}

}

//
// End InspirentoUtilities.java