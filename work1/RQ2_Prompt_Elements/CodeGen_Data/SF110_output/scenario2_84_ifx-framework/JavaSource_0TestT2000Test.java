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

    /**
     * Convenience methods since velocity does not understand the conditional
     * "== null". Returns true if this class implements an interface.
     *
     * @return true if this class implements an interface else false.
     */
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
	 * Tests an attribute of an entity that is supposed to be a JavaFile interface.
	 * Returns false if the attribute is not a JavaSourceFile.
	 */
    public boolean hasInterface() {
        return java.util.List.class.isAssignableFrom(getObjectInterface());
    }

    /**
	 * Tests the content of a JavaSource object with the specified list.
	 * Returns an empty <code>java.util.List</code>.
	 */
    public java.util.List<JavaSource> getObject() {
    	java.util.List objectList = new ArrayList<JavaSource>();

        // Construct empty JavaSource.
    	List<JavaSource> javaSourceList = new ArrayList<JavaSource>();
    	Iterator<JavaSource> jusIterator = null;
    	if (hasInterface()) {
    		jusIterator = javaSourceList.listIterator();
    	} else {
    		jusIterator = getObjectInterface().listIterator();
    	}
        while (jusIterator.hasNext()) {
			// Test element.
			// Construct empty JavaSource.
			Object object = jusIterator.next();
			if (JSUtils.isString(object)) {
				// Test the type.
				if (java.util.List.class.isAssignableFrom(getObjectInterface())) {
					if (hasInterface()) {
						javaSourceList = getObjectInterface().list(jusIterator);
					} else {
						javaSourceList = new ArrayList<JavaSource>(getObjectInterface().size());
						javaSourceList.addAll((List)jusIterator);
					}

				// Test the content.
				} else {
					if (! hasInterface()) {
						if (object instanceof String
							|| object instanceof Boolean) {
							Object object = createJavaSource(object);
							if (object!= null) {
								javaSourceList.add((JavaSource) object);
							}
						}
						if (jusIterator.hasNext()) {
							if (! hasInterface()) {
								objectList = new ArrayList<JavaSource>(javaSourceList);
							} else if (hasInterface()) {
								objectList = getNewJavaSource(javaSourceList);
							} else {
								objectList = new ArrayList<JavaSource>(getNewJavaSource(javaSourceList));
							}
							javaSourceList = new ArrayList<JavaSource>();
								}
						}
					}
				}
			}
		}
		if (hasInterface()) {
			if (javaSourceList.size() > 0) {
				objectList = new ArrayList<JavaSource>(javaSourceList);
			}
		}
		return objectList;
    }
	
    /**
     * Tests the return type of an object. The test merely verifies the return type's
     * type name.
     */
    public JavaSource getObjectInterface() {
        return new JavaSource(getClass().getSuperclass(), getClass().getInterfaces(), false);
    }

    /**
     * Tests the content of a JavaFile object with the String contents.
     * The test does not modify the list.
     * The test does not verify that the list has no null elements.
     */
    public java.util.List<JavaSource> createJavaSource(java.util.List<JavaSource> javaSourceList) {
    	return null;
    }

    /**
     * Tests the content of a new JavaSource object with the String contents.
     */
    public java.util.List<JavaSource> getNewJavaSource(java.util.List<JavaSource> javaSourceList) {
    	javaSourceList.add(new JavaSource("MyClass"));
    	return javaSourceList;
    }

}
