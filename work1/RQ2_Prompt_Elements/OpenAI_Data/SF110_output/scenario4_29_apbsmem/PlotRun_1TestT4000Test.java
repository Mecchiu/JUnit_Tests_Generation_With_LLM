// PlotRun_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRun_1Test {

	/**
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	* Test case for {@link PlotRun#get(int)} method.
	*/
	@Test
	void testGet() {
		PlotDatum[] run = new PlotDatum[10];
		for (int i = 0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		PlotRun plotRun = new PlotRun(run);
		for (int i = 0; i < run.length; i++) {
			assertEquals(run[i], plotRun.get(i));
		}
	}
}

// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#set(int, Object)} method.
*/
class PlotRun_2Test {
		
	/**
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	* Test case for {@link PlotRun#set(int, Object)} method.
	*/
	@Test
	void testSet() {
		PlotDatum[] run = new PlotDatum[10];
		for (int i = 0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		PlotRun plotRun = new PlotRun(run);
		for (int i = 0; i < run.length; i++) {
			PlotDatum datum = new PlotDatum(i, i);
			assertEquals(run[i], plotRun.set(i, datum));
		}
	}
}

// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#add(int, Object)} method.
*/
class PlotRun_3Test {
		
	/**
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	* Test case for {@link PlotRun#add(int, Object)} method.
	*/
	@Test
	void testAdd() {
		PlotDatum[] run = new PlotDatum[10];
		for (int i = 0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		PlotRun plotRun = new PlotRun(run);
		for (int i = 0; i < run.length; i++) {
			PlotDatum datum = new PlotDatum(i, i);
			plotRun.add(i, datum);
		}
	}
}

// PlotRun_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_4Test {
		
	/**
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#remove(int)} method.
	* Test case for {@link PlotRun#remove(int)} method.
	*/
	@Test
	void testRemove() {
		PlotDatum[] run = new PlotDatum[10];
		for (int i = 0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		PlotRun plotRun = new PlotRun(run);
		for (int i = 0; i < run.length; i++) {
			assertEquals(run[i], plotRun.remove(i));
		}
	}
}

// PlotRun_5Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#clear()} method.
*/
class PlotRun_5Test {
		
	/**
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#clear()} method.
	* Test case for {@link PlotRun#clear()} method.
	*/
	@Test
	void testClear() {
		PlotDatum[] run = new PlotDatum[10];
		for (int i = 0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		PlotRun plotRun = new PlotRun(run);
		plotRun.clear();
	}
}

// PlotRun_6Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_6Test {
		
	/**
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#iterator()} method.
	* Test case for {@link PlotRun#iterator()} method.
	*/
	@Test
	void testIterator() {
		PlotDatum[] run = new PlotDatum[10];
		for (int i = 0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		PlotRun plotRun = new PlotRun(run);
		Iterator iterator = plotRun.iterator();
		for (int i = 0; i < run.length; i++) {
			assertEquals(run[i], iterator.next());
		}
	}
}

// PlotRun_7Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#clone()} method.
*/
class PlotRun_7Test {
		
	/**
	* Test case for {@link PlotRun#clone()} method.
	* Test case for {@link PlotRun#clone()} method.
	* Test case for {@link PlotRun#clone()} method.
	* Test case for {@link PlotRun#clone()} method.
	* Test case for {@link PlotRun#clone()} method.
	* Test case for {@link PlotRun#clone()} method.
	* Test case for {@link PlotRun#clone()} method.
	* Test case for {@link PlotRun#clone()} method.
	* Test case for {@link PlotRun#clone()} method.
	* Test case for {@link PlotRun#clone()} method.
	*/
	@Test
	void testClone() {
		PlotDatum[] run = new PlotDatum[10];
		for (int i = 0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		PlotRun plotRun = new PlotRun(run);
		PlotRun clone = (PlotRun) plotRun.clone();
		assertEquals(plotRun, clone);
	}
}

// PlotRun_8Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#getMinX()} method.
*/
class PlotRun_8Test {
		
	/**
	* Test case for {@link PlotRun#getMinX()} method.
	* Test case for {@link PlotRun#getMinX()} method.
	* Test case for {@link PlotRun#getMinX()} method.
	* Test case for {@link PlotRun#getMinX()} method.
	* Test case for {@link PlotRun#getMinX()} method.
	* Test case for {@link PlotRun#getMinX()} method.
	* Test case for {@link PlotRun#getMinX()} method.
	* Test case for {@link PlotRun#getMinX()} method.
	* Test case for {@link PlotRun#getMinX()} method.
	* Test case for {@link PlotRun#getMinX()} method.
	*/
	@Test
	void testGetMinX() {
		PlotDatum[] run = new PlotDatum[10];
		for (int i = 0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		PlotRun plotRun = new PlotRun(run);
		assertEquals(0, plotRun.getMinX());
	}
}

// PlotRun_9Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#getMaxX()} method.
*/
class PlotRun_9Test {
		
	/**
	* Test case for {@link PlotRun#getMaxX()} method.
	* Test case for {@link PlotRun#getMaxX()} method.
	* Test case for {@link PlotRun#getMaxX()} method.
	* Test case for {@link PlotRun#getMaxX()} method.
	* Test case for {@link PlotRun#getMaxX()} method.
	* Test case for {@link PlotRun#getMaxX()} method.
	* Test case for {@link PlotRun#getMaxX()} method.
	* Test case for {@link PlotRun#getMaxX()} method.
	* Test case for {@link PlotRun#getMaxX()} method.
	* Test case for {@link PlotRun#getMaxX()} method.
	*/
	@Test
	void testGetMaxX() {
		PlotDatum[] run = new PlotDatum[10];
		for (int i = 0; i < run.length; i++) {
			run[i] = new PlotDatum(i, i);
		}
		PlotRun plotRun = new PlotRun(run);
		assertEquals(9, plotRun.getMaxX());
	}
}

// PlotRun_10Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#getMinY()} method.
*/
class PlotRun_10Test {
		
	/**
	* Test case for {@link PlotRun#getMinY()} method.
	* Test case for {@link PlotRun#getMinY()} method.
	* Test case for {@link PlotRun#getMinY()} method.
	* Test case for {@link PlotRun#getMinY()} method.
	* Test case for {@link PlotRun#getMinY()} method.
	* Test case for {@link PlotRun#getMinY()} method.
	* Test case for {@link PlotRun#