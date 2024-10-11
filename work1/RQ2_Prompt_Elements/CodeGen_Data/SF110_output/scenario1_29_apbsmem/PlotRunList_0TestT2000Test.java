// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {

    /**
	* Test method for
	* {@link PlotRunList#size()}.
	*/
    @Test
    public void testSize() {
        assertEquals(1, PlotRunList.size());
    }

	/**
	 * Test method for {@link PlotRunList#get(int)}.
	 */
    @Test
    public void testGet() {
        final List list = new ArrayList();
		final PlotRunList l = new PlotRunList(list);

        assertEquals(new PlotRun_0(1), l.get(0));
        assertNull(l.get(1));
        assertEquals(1, l.size());

        list.add(new PlotRun_0(1));
        assertEquals(1, l.size());
	}

	/**
	 * Test method for {@link PlotRunList#put(PlothRun)}.
	 */
    @Test
    public void testPut() {
        final List list = new ArrayList();
        final PlotRun l = new PlotRun(1);
        final PlotRun l2 = new PlotRun(1);

        assertSame(l, list.get(0));
        assertSame(l2, list.get(1));

        list.add(l);
        list.add(l2);
        assertEquals(l, list.get(0));
        assertEquals(l2, list.get(1));

        list.add(new PlotRun_0(1));
        assertEquals(1, list.size());
        assertNull(list.get(0));
    }

	/**
	 * Test method for {@link PlotRunList#isEmpty()}.
	 */
    @Test
    public void testIsEmpty() {
        assertFalse(PlotRunList.isEmpty());
    }

	/**
	 * Test method for {@link PlotRunList#remove(PlothRun)}.
	 */
    @Test
    public void testRemove() {
        final List list = new ArrayList();

        final PlotRun l = new PlotRun(1);
        final PlotRun l2 = new PlotRun(1);
        list.add(l);
        list.add(l2);

        assertTrue(list.remove(l));
        assertFalse(list.remove(l2));
    }

	/**
	 * Test method for {@link PlotRunList#contains(PlothRun)}.
	 */
    @Test
    public void testContains() {
        final List list = new ArrayList();

        final PlotRun l = new PlotRun(1);
        final PlotRun l2 = new PlotRun(1);
        list.add(l);
        list.add(l2);

        assertTrue(list.contains(l2));
        assertFalse(list.contains(l));
    }

	/**
	 * Test method for {@link PlotRunList#add(java.util.List)}.
	 */
    @Test
    public void testAdd() {
        final PlotRun l = new PlotRun(1);
        final PlotRun l2 = new PlotRun(1);
        final PlotRun l3 = new PlotRun(1);
        final PlotRun l4 = new PlotRun(1);
        final PlotRun l5 = new PlotRun(1);
        final PlotRun l6 = new PlotRun(1);
        final PlotRun l7 = new PlotRun(1);

        final List list = new ArrayList();
        list.add(l);
        list.add(l2);
        list.add(new PlotRun(1));
        list.add(l3);
        list.add(l4);
        list.add(new PlotRun(1));
        list.add(l5);
        list.add(l6);
        list.add(l7);

        assertSame(list, PlotRunList.add(list, new Object[] {l2}));
    }

	/**
	 * Test method for {@link PlotRunList#reverse()}.
	 */
    @Test
    public void testReverse() {
        final List list = new ArrayList();

        final PlotRun l = new PlotRun(1);
        final PlotRun l2 = new PlotRun(1);
        list.add(l);
        list.add(l2);
        list.add(l4);
        list.add(l5);

        assertTrue(list.reverse());
        assertEquals(new PlotRun_0(1), list.get(list.size() -1));
    }

	/**
	 * Test method for {@link PlotRunList#get(int)}.
	 */
    @Test
    public void testGetByIndex() {
        final List list = new ArrayList();

        final PlotRun l = new PlotRun(1);
        list.add(l);
        list.add(l4);
        list.add(l5);

        assertEquals(new PlotRun_0(1), PlotRunList.getByIndex(1, list));
    }

	/**
	 * Test method for {@link PlotRunList#subList(int, int)}.
	 */
    @Test
    public void testSubList() {
        final List list = new ArrayList();

        final PlotRun l = new PlotRun(1);
        list.add(l);
        list.add(l4);
        list.add(l5);

        assertEquals(new PlotRun_0(1), PlotRunList.subList(4, 8));
        assertEquals(new PlotRun_0(1), PlotRunList.subList(-4, -5));
        assertEquals(new PlotRun_0(1), PlotRunList.subList(3, -2));
    }

	/**
	 * Test method for {@link PlotRunList#append(PlotRun)}.
	 */
    @Test
    public void testAppend() {
        final PlotRun l = new PlotRun(1);
        final PlotRun l2 = new PlotRun(1);
        final PlotRun l3 = new PlotRun(1);
        final PlotRun l4 = new PlotRun(1);
        final PlotRun l5 = new PlotRun(1);
        final PlotRun l6 = new PlotRun(1);

        final List list = new ArrayList();
        list.add(l);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l4);
        list.add(l4);
        list.add(l4);
        list.add(l4);
        list.add(l4);

        assertTrue(list.append(l5));
        assertEquals(l5, list.get(0));
        assertEquals(l5, list.get(2));
        assertEquals(l5, list.get(3));

        assertTrue(list.append(l4));
        assertEquals(l4, list.get(0));
        assertEquals(l4, list.get(2));
        assertEquals(l4, list.get(3));

        assertTrue(list.append(l6));
        assertEquals(l6, list.get(4));
        assertEquals(l5, list.get(1));
        assertEquals(l4, list.get(2));
        assertEquals(l4