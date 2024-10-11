// BfTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {

	@Test
	void testBf1() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Saturn");
		expected.add("Uranus");
		assertEquals(expected, Bf.bf("Jupiter", "Neptune"));
	}
	
	@Test
	void testBf2() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		assertEquals(expected, Bf.bf("Earth", "Mercury"));
	}
	
	@Test
	void testBf3() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		assertEquals(expected, Bf.bf("Mercury", "Uranus"));
	}
	
	@Test
	void testBf4() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		expected.add("Uranus");
		assertEquals(expected, Bf.bf("Neptune", "Venus"));
	}
	
	@Test
	void testBf5() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Earth", "Earth"));
	}
	
	@Test
	void testBf6() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Mars", "Earth"));
	}
	
	@Test
	void testBf7() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Jupiter", "Makemake"));
	}
	
	@Test
	void testBf8() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Makemake", "Jupiter"));
	}
	
	@Test
	void testBf9() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Makemake", "Makemake"));
	}
	
	@Test
	void testBf10() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Jupiter", "Jupiter"));
	}
}

// BfTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {
		
	@Test
	void testBf1() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Saturn");
		expected.add("Uranus");
		assertEquals(expected, Bf.bf("Jupiter", "Neptune"));
	}
	
	@Test
	void testBf2() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		assertEquals(expected, Bf.bf("Earth", "Mercury"));
	}
	
	@Test
	void testBf3() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		assertEquals(expected, Bf.bf("Mercury", "Uranus"));
	}
	
	@Test
	void testBf4() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		expected.add("Uranus");
		assertEquals(expected, Bf.bf("Neptune", "Venus"));
	}
	
	@Test
	void testBf5() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Earth", "Earth"));
	}
	
	@Test
	void testBf6() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Mars", "Earth"));
	}
	
	@Test
	void testBf7() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Jupiter", "Makemake"));
	}
	
	@Test
	void testBf8() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Makemake", "Jupiter"));
	}
	
	@Test
	void testBf9() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Makemake", "Makemake"));
	}
	
	@Test
	void testBf10() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Jupiter", "Jupiter"));
	}
}

// BfTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {
		
	@Test
	void testBf1() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Saturn");
		expected.add("Uranus");
		assertEquals(expected, Bf.bf("Jupiter", "Neptune"));
	}
	
	@Test
	void testBf2() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		assertEquals(expected, Bf.bf("Earth", "Mercury"));
	}
	
	@Test
	void testBf3() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		assertEquals(expected, Bf.bf("Mercury", "Uranus"));
	}
	
	@Test
	void testBf4() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		expected.add("Uranus");
		assertEquals(expected, Bf.bf("Neptune", "Venus"));
	}
	
	@Test
	void testBf5() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Earth", "Earth"));
	}
	
	@Test
	void testBf6() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Mars", "Earth"));
	}
	
	@Test
	void testBf7() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Jupiter", "Makemake"));
	}
	
	@Test
	void testBf8() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Makemake", "Jupiter"));
	}
	
	@Test
	void testBf9() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Makemake", "Makemake"));
	}
	
	@Test
	void testBf10() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Jupiter", "Jupiter"));
	}
}

// BfTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {
		
	@Test
	void testBf1() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Saturn");
		expected.add("Uranus");
		assertEquals(expected, Bf.bf("Jupiter", "Neptune"));
	}
	
	@Test
	void testBf2() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		assertEquals(expected, Bf.bf("Earth", "Mercury"));
	}
	
	@Test
	void testBf3() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		assertEquals(expected, Bf.bf("Mercury", "Uranus"));
	}
	
	@Test
	void testBf4() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		expected.add("Uranus");
		assertEquals(expected, Bf.bf("Neptune", "Venus"));
	}
	
	@Test
	void testBf5() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Earth", "Earth"));
	}
	
	@Test
	void testBf6() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Mars", "Earth"));
	}
	
	@Test
	void testBf7() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Jupiter", "Makemake"));
	}
	
	@Test
	void testBf8() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Makemake", "Jupiter"));
	}
	
	@Test
	void testBf9() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Makemake", "Makemake"));
	}
	
	@Test
	void testBf10() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Jupiter", "Jupiter"));
	}
}

// BfTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {
		
	@Test
	void testBf1() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Saturn");
		expected.add("Uranus");
		assertEquals(expected, Bf.bf("Jupiter", "Neptune"));
	}
	
	@Test
	void testBf2() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		assertEquals(expected, Bf.bf("Earth", "Mercury"));
	}
	
	@Test
	void testBf3() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		assertEquals(expected, Bf.bf("Mercury", "Uranus"));
	}
	
	@Test
	void testBf4() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		expected.add("Uranus");
		assertEquals(expected, Bf.bf("Neptune", "Venus"));
	}
	
	@Test
	void testBf5() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Earth", "Earth"));
	}
	
	@Test
	void testBf6() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Mars", "Earth"));
	}
	
	@Test
	void testBf7() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Jupiter", "Makemake"));
	}
	
	@Test
	void testBf8() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Makemake", "Jupiter"));
	}
	
	@Test
	void testBf9() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Makemake", "Makemake"));
	}
	
	@Test
	void testBf10() {
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, Bf.bf("Jupiter", "Jupiter"));
	}
}

// BfTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {
		
	@Test
	void testBf1() {
	