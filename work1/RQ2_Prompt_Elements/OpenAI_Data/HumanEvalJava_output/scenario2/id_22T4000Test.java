// FilterIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {

    @Test
    public void testFilterIntegers_EmptyList() {
        List<Object> values = new ArrayList<Object>();
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterIntegers_ListWithOneInteger() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneString() {
        List<Object> values = new ArrayList<Object>();
        values.add("1");
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneString() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add("1");
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneNull() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(null);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneDouble() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Double(1.0));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneBoolean() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(Boolean.TRUE);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneCharacter() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Character('a'));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneByte() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Byte((byte) 1));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneShort() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Short((short) 1));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }
}

// FilterIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {
		
    @Test
    public void testFilterIntegers_EmptyList() {
        List<Object> values = new ArrayList<Object>();
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterIntegers_ListWithOneInteger() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneString() {
        List<Object> values = new ArrayList<Object>();
        values.add("1");
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneString() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add("1");
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneNull() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(null);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneDouble() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Double(1.0));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneBoolean() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(Boolean.TRUE);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneCharacter() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Character('a'));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneByte() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Byte((byte) 1));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneShort() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Short((short) 1));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }
}

// FilterIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {
		
    @Test
    public void testFilterIntegers_EmptyList() {
        List<Object> values = new ArrayList<Object>();
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterIntegers_ListWithOneInteger() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneString() {
        List<Object> values = new ArrayList<Object>();
        values.add("1");
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneString() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add("1");
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneNull() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(null);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneDouble() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Double(1.0));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneBoolean() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(Boolean.TRUE);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneCharacter() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Character('a'));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneByte() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Byte((byte) 1));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneShort() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Short((short) 1));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }
}

// FilterIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {
		
    @Test
    public void testFilterIntegers_EmptyList() {
        List<Object> values = new ArrayList<Object>();
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterIntegers_ListWithOneInteger() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneString() {
        List<Object> values = new ArrayList<Object>();
        values.add("1");
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneString() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add("1");
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneNull() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(null);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneDouble() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(new Double(1.0));
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(new Integer(1), result.get(0));
    }

    @Test
    public void testFilterIntegers_ListWithOneIntegerAndOneBoolean() {
        List<Object> values = new ArrayList<Object>();
        values.add(new Integer(1));
        values.add(Boolean.TRUE);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(