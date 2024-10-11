// JavaSource_0Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_0Test {
// JavaSource.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * This class provides an abstraction to collect information about a
 * generated Java class file. Its toString() method will produce a String
 * that can be written using a Writer object to persistent store.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.5 $
 */
public class JavaSource {

    public boolean hasInterface() {
        return (this.getInterface()!= null);
    }
}

// JavaSource_0Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_0Test {
		/**
		 * Some basic checks for compliance of generated test case.
		 */
		private final String TOSTRING_VALUE =
			"Hello, World!\n"
			+ "this is a test string\n"
			+ "This value should be printed as a 'Hello, World!,\n"
			+ "this is a test string\n"
			+ "This value should be printed with a newline\n";
		/*
         * Main entry point of the test case.
         */
		@junit.jupiter.Disabled("Disabled to improve the usability of this test")
		@Test
        void test() {
			list = list!= null
				? list
				: new ArrayList();
			try {
					// get the list of interfaces included by the class
					List ifc_ref = getIncludes();
					// iterate over all interfaces in the class
					Iterator interfaces = ifc_ref.iterator();
					// if present, append the list of interfaces to a given list
					if ( ifc_ref.size() > 0 ) {
						list.addAll(ifc_ref.iterator());
					}
					list = list!= null? new ArrayList(list) : null;
					// if present, check for empty list
					if ( list == null ) {
						System.err.println(
						"\nNo interfaces found by this class.\n"
						+ "This test should fail only if there is no interface.\n" );
					}
					// get the list of interfaces declared in the class
					List ifc_declaration = getDeclaredInterfaces();
					int i = -1; // index to check
					// iterate over all interfaces declared by the class
					Iterator interfaceIterator = ifc_declaration.iterator();
					while ( interfaceIterator.hasNext() ) {
						i++; // i is the index to next iterator
						// if the interface has already been checked, it is OK to continue
						if (! ifc_declaration.contains(interfaceIterator.next()) ) {
							System.out.println(
								"Interface " + i +
								" marked for inclusion by the class has already been used.\n"
								+ "The test will not be passed. ");
							break;
						}
					}
					if ( ifc_declaration.size() == 0
							&& ifc_ref.size() > 0 ) {
						// if possible, check the interfaces of the first class
						int i0 = 0;
						Iterator j1 = ifc_ref.iterator().next().iterator();
						while ( j1.hasNext() ) {
							i0++;
							j1.next();
						}
						if ( i0 > 0 ) {
							System.out.println(
								"There is at least one interface from which to include an interface for this class.\n"
								+ "The test will not be passed. ");
							break;
						}
					}
				}
                catch (RuntimeException e) {
                        e.printStackTrace();
                        fail("Exception in this class : " + e.getMessage());
                }
        }
		/**
		 * List containing the contents of the class file to be
		 * printed. To add a new element, put it into the
		 * list or replace it using the replace() method.
		 * @return the list containing the methods, classes and interfaces
		 */
		private List list;

		/**
		 * Helper class to iterate the list of included classes. It
		 * uses the iterator to get the element that would be returned
		 * when the iterate() method of the interface called.
		 * @type T element
		 */
		private final class ListIterator implements Iterator {
				/**
				 * The element to return.
				 */
				Iterator elem;
				/**
				 * The index to keep track of which element we are
				 * currently returning.
				 */
				int index = 0;

				/**
				 * Constructor for ListIterator.
				 */
				ListIterator() {
						// init iterator
							elem = list!= null? list.iterator() : null;
						}
				/**
				 * Return the elements currently in the list.
				 */
				@junit.jupiter.Async
				public Object next() throws Exception {
						do {
								// get the next element of list
								elem = ( list!= null )
									? (( List ) list).iterator()
									: null;
						}
						while ( doNext() );
						return ((Object) elem.next()).toString();
				}
				/**
				 * Remove the element and return the previous
				 * element that was returned by the iterator.
				 * @return an element to be returned by the iterator
				 */
				@junit.jupiter.Async
				public Object remove() throws Exception {
						// get the previous element of the list
						elem = ((List ) list).remove(index--);
						// return the element
						return ((Object) elem.next()).toString();
				}
				/**
				 * Skip the next element of the list, call
				 * remove() and return the skipped element.
				 * @return the next SKIPPED element from the list
				 * @see java.util.Iterator#hasNext()
				 */
				private boolean doNext() {
						while (index < list.size()) {
								// get the next element of the list
								elem = ((List ) list).remove(index--);
								// return the element
								return ((Object) elem.next()).toString();
						}
						return false;
				}
		}
}
