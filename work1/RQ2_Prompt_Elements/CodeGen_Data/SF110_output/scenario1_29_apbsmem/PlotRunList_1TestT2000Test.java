// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_1Test {

    @Test
    void testGet() {
        Map<String, PlotRun> runs = new HashMap<>();
        PlotRun run = new PlotRun(new Plot(0, 0), new ArrayList<PlotData>());
        runs.put("0", run);

        try {
            assertEquals(0, PlotRun.counts(runs));
            assertEquals(1, PlotRunList.count(runs));
            run.updateData();
            assertEquals(0, PlotRunList.count(runs));
            assertEquals(1, PlotRunList.count(runs));
            assertEquals(run.getRunC().getColor(), Color.RED);
            run.updateData();
            assertEquals(0, PlotRunList.count(runs));
            assertEquals(2, PlotRunList.count(runs));
            run.updateData();
            assertEquals(0, PlotRunList.count(runs));
            assertEquals(2, PlotRunList.count(runs));
            run.updateData();
            assertEquals(0, PlotRunList.count(runs));
            assertEquals(2, PlotRunList.count(runs));
            run.updateData();
            assertEquals(0, PlotRunList.count(runs));
            assertEquals(3, PlotRunList.count(runs));
            run.updateData();
            assertEquals(0, PlotRunList.count(runs));
            assertEquals(4, PlotRunList.count(runs));
        } catch (NoSuchElementException nsEx) {
            assertTrue("expected element not found", false);
        } catch (IllegalArgumentException iae) {
            assertTrue("expected exception", false);
        }
    }

    @Test
    void testAdd() {
        assertEquals(0, PlotRun.counts(new HashMap<>()));
        try {
            assertEquals(0, PlotRunList.count(new HashMap<>()));
            assertEquals(0, PlotRunList.count(new HashMap<>()));
        } catch (IllegalArgumentException iae) {
            fail("illegal argument not handled properly");
        }
        try {
            assertEquals(0, PlotRunList.count(new HashMap<>(1)));
            assertEquals(1, PlotRunList.count(new HashMap<>(0)));
            try {
                new PlotRunList(new HashMap<>());
                assertTrue("expected exception not thrown", false);
            } catch (java.lang.IllegalArgumentException iae) {
            }
            try {
                new PlotRunList(new HashMap<>(new HashMap<>()));
                assertTrue("expected exception not thrown", false);
            } catch (java.lang.IllegalArgumentException iae) {
            }
            try {
                new PlotRunList(new HashMap<>(5));
                assertTrue("expected exception not thrown", false);
            } catch (java.lang.IllegalArgumentException iae) {
            }
            try {
                new PlotRunList(new HashMap<>(new ArrayList<>(0)));
                assertTrue("expected exception not thrown", false);
            } catch (java.lang.IllegalArgumentException iae) {
            }
            try {
                new PlotRunList(new HashMap<>(new ArrayList<>(new ArrayList<>(0))));
                assertTrue("expected exception not thrown", false);
            } catch (java.lang.IllegalArgumentException iae) {
            }
            new PlotRunList(new HashMap<>(new ArrayList<>(5)));
           assertTrue("expected exception not thrown", false);
        } catch (java.lang.IllegalArgumentException iae) {
            fail("illegal argument not handled properly");
        }
    }

    @Test
    void testConstructor() {
    	for (int i = 10; i <= 50; i++) {
			Map<String, PlotRun> runs = new HashMap<>();
			for (int j = 0; j < i + 1; j++) {
		        PlotRun run = new PlotRun(new Plot(i, j), new ArrayList<PlotData>());
		        runs.put(run.getRunC().getName() + j, run);
			}
		}
	}
	
	@Test
	public void testArray() {
		ArrayList<PlotRun> runs = new ArrayList<>(5);
		for (int i = 0; i <= 50; i++) {
			PlotRun run = new PlotRun(new Plot(i, 2), new ArrayList<PlotData>());
			runs.add(run);
		}
		PlotRunList runs1, runs2;
		runs1 = new PlotRunList(runs);
		runs2 = new PlotRunList(runs);
		assertEquals(runs.size(), runs1.size());
		assertTrue(runs1.size() == runs2.size());
		for (int i = 0; i <= 50; i++) {
			assertEquals(runs.get(i).getRunC().getName() + 1, runs.get(i).getRunC().getName());
			for (int j = 0; j < runs.get(i).getRunC().getData().size(); j++) {
                assertEquals(runs.get(i).getRunC().getData().get(j).getData().getName(), runs
                       .get(i).getRunC().getData().get(j).getData().getName());
            }
			assertEquals(runs.get(i).getRunC().getData().get(0).getNum(), runs.get(i).getRunC().getData().get(0)
			       .getNum());
		}
		assertEquals(runs.get(0).getRunC().getName(), runs1.get(0).getRunC().getName());
		assertEquals(runs.get(3).getRunC().getName(), runs2.get(3).getRunC().getName());
	}
    
    private Map<String, PlotRun> data = new HashMap<>();
    private int maxIndex = 0;
    
}

// PlotRunList.java
