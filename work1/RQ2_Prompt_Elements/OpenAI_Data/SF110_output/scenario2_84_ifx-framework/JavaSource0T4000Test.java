// JavaSourceTest.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSourceTest {

	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a null interface.
	*/
	@Test
	public void testHasInterface_NullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a non-null interface.
	*/
	@Test
	public void testHasInterface_NonNullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
}

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
        return (this.getInterface() != null);
    }
}

// JavaSourceTest.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSourceTest {
		
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a null interface.
	*/
	@Test
	public void testHasInterface_NullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a non-null interface.
	*/
	@Test
	public void testHasInterface_NonNullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
}

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
        return (this.getInterface() != null);
    }
}

// JavaSourceTest.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSourceTest {
		
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a null interface.
	*/
	@Test
	public void testHasInterface_NullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a non-null interface.
	*/
	@Test
	public void testHasInterface_NonNullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
}

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
        return (this.getInterface() != null);
    }
}

// JavaSourceTest.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSourceTest {
		
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a null interface.
	*/
	@Test
	public void testHasInterface_NullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a non-null interface.
	*/
	@Test
	public void testHasInterface_NonNullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
}

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
        return (this.getInterface() != null);
    }
}

// JavaSourceTest.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSourceTest {
		
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a null interface.
	*/
	@Test
	public void testHasInterface_NullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a non-null interface.
	*/
	@Test
	public void testHasInterface_NonNullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
}

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
        return (this.getInterface() != null);
    }
}

// JavaSourceTest.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSourceTest {
		
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a null interface.
	*/
	@Test
	public void testHasInterface_NullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a non-null interface.
	*/
	@Test
	public void testHasInterface_NonNullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
}

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
        return (this.getInterface() != null);
    }
}

// JavaSourceTest.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSourceTest {
		
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a null interface.
	*/
	@Test
	public void testHasInterface_NullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a non-null interface.
	*/
	@Test
	public void testHasInterface_NonNullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
}

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
        return (this.getInterface() != null);
    }
}

// JavaSourceTest.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSourceTest {
		
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a null interface.
	*/
	@Test
	public void testHasInterface_NullInterface() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()} method.
	* This test case tests the method with a non-null interface.
	*/
	@Test
	public void test