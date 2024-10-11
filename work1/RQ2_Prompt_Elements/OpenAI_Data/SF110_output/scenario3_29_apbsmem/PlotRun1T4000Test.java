// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRunTest {

	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		datum = new PlotDatum(3.0, 4.0);
		run.add(datum);
		assertEquals(2, run.size());
		assertEquals(datum, run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		datum = new PlotDatum(5.0, 6.0);
		run.add(datum);
		assertEquals(3, run.size());
		assertEquals(datum, run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(3));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
	}
}

// PlotRun.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single run of data in a plot.
 *      A run is an array or list of PlotDatum objects.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version December 12, 2000
 */
public class PlotRun extends AbstractList implements Cloneable, java.io.Serializable {

    /**
     *  Returns the PlotDatum object at the specified position
     *  in this run.
     *
     * @param index The index of the plot data object to return.
     * @return The PlotDatum object at the specified position
     *           in this run.
     */
    public Object get(int index) {
        return data[index];
    }
}

// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRunTest {
		
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		datum = new PlotDatum(3.0, 4.0);
		run.add(datum);
		assertEquals(2, run.size());
		assertEquals(datum, run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		datum = new PlotDatum(5.0, 6.0);
		run.add(datum);
		assertEquals(3, run.size());
		assertEquals(datum, run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(3));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
	}
}

// PlotRun.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single run of data in a plot.
 *      A run is an array or list of PlotDatum objects.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version December 12, 2000
 */
public class PlotRun extends AbstractList implements Cloneable, java.io.Serializable {

    /**
     *  Returns the PlotDatum object at the specified position
     *  in this run.
     *
     * @param index The index of the plot data object to return.
     * @return The PlotDatum object at the specified position
     *           in this run.
     */
    public Object get(int index) {
        return data[index];
    }
}

// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRunTest {
		
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		datum = new PlotDatum(3.0, 4.0);
		run.add(datum);
		assertEquals(2, run.size());
		assertEquals(datum, run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		datum = new PlotDatum(5.0, 6.0);
		run.add(datum);
		assertEquals(3, run.size());
		assertEquals(datum, run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(3));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
	}
}

// PlotRun.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single run of data in a plot.
 *      A run is an array or list of PlotDatum objects.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version December 12, 2000
 */
public class PlotRun extends AbstractList implements Cloneable, java.io.Serializable {

    /**
     *  Returns the PlotDatum object at the specified position
     *  in this run.
     *
     * @param index The index of the plot data object to return.
     * @return The PlotDatum object at the specified position
     *           in this run.
     */
    public Object get(int index) {
        return data[index];
    }
}

// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRunTest {
		
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		datum = new PlotDatum(3.0, 4.0);
		run.add(datum);
		assertEquals(2, run.size());
		assertEquals(datum, run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		datum = new PlotDatum(5.0, 6.0);
		run.add(datum);
		assertEquals(3, run.size());
		assertEquals(datum, run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(3));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
	}
}

// PlotRun.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single run of data in a plot.
 *      A run is an array or list of PlotDatum objects.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version December 12, 2000
 */
public class PlotRun extends AbstractList implements Cloneable, java.io.Serializable {

    /**
     *  Returns the PlotDatum object at the specified position
     *  in this run.
     *
     * @param index The index of the plot data object to return.
     * @return The PlotDatum object at the specified position
     *           in this run.
     */
    public Object get(int index) {
        return data[index];
    }
}

// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRunTest {
		
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotRun run = new PlotRun();
		assertEquals(0, run.size());
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		PlotDatum datum = new PlotDatum(1.0, 2.0);
		run.add(datum);
		assertEquals(1, run.size());
		assertEquals(datum, run.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		datum = new PlotDatum(3.0, 4.0);
		run.add(datum);
		assertEquals(2, run.size());
		assertEquals(datum, run.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
		
		datum = new PlotDatum(5.0, 6.0);
		run.add(datum);
		assertEquals(3, run.size());
		assertEquals(datum, run.get(2));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(3));
		assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));
	}
}

// PlotRun.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single run of data in a plot.
 *      A run is an array or list of PlotDatum objects.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version December 12, 2000
 */
public class PlotRun extends AbstractList implements Cloneable, java.io.Serializable {

    /**
     *  Returns the PlotDatum object at the specified position
     *  in this run.
     *
     * @param index The index of the plot data object to return.
     * @return The PlotDatum object at the specified position
     *           in this run.
     */
    public Object get(int index) {
        return data[index];
    }
}

// PlotRunTest.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRunTest {
		
	/**
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	