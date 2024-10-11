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
* It contains ten unit test cases for the {@link PlotRun#get(int