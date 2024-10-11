// PlotRun_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#size()} method.
*/
class PlotRun_0Test {

	/**
	 * Test size.
	*/
	@Test
	public void testSize() {
		assertEquals(size(), (new ArrayList()).size());
		assertEquals(0, (new ArrayList()).size());
		assertEquals(-1, (new CollectionUtils()).size((Collection)null));

	}


	/**
	 * Test clone.
	*/
	@Test
	public void testCloning() {
        assertNotSame(null, (new PlotRun(new List())).clone());
        assertEquals(new PlotRun(new ArrayList()), (new PlotRun(new ArrayList())).clone());
        assertEquals(new PlotRun(new ArrayList()), (new ArrayList()).clone());
	}


	/**
	 * Test clone.
	*/
	public void testClone() {
		assertNotSame(null, (new PlotRun(new List())).clone().clone());
		Chart<String> chart = new Chart();
		assertNotSame(null, (new PlotRun(chart)).clone().clone());
	}


	/**
	 * Test cloning.
	*/
	@Test
	public void testShallowClone() {
        assertNotSame((new PlotRun(new List())),
                      (new PlotRun(new ArrayList())).clone().clone());
        assertNotSame((new PlotRun(new ArrayList())),
                      (new ArrayList()).clone().clone());
    }


	/**
	 * Test clone.
	*/
	public void testDeepClones() {
		assertNotSame((new PlotRun(new List())).clone(),
                      (new PlotRun(new ArrayList())).clone());
		assertNotSame((new PlotRun(new ArrayList())).clone(),
                      (new CollectionUtils()).clone((Collection)null));
    }


	/**
	 * Test cloning.
	*/
	public void testDeepClones0() {
		assertNotSame((new PlotRun(new List())).clone(),
                      (new PlotRun(new ArrayList())).clone());
		assertNotSame((new PlotRun(new ArrayList())).clone(),
                      (new CollectionUtils()).clone(new Collection()));
	}

	/**
	 * Test size.
	*/
	@Test
	public void testSize() {
		assertEquals(size(), (new ArrayList()).size());
		assertEquals(-1, (new CollectionUtils()).size(null));

	}
	/**
	 * Test get method.
	 *
	 *  <p> To help with the testing of array indexing.
	 *  </p>
    */
	@Test
	public void testGet() {
		final Map<String, Object> map = new HashMap();
		final int index = 1;
		final PlotRun run;


		// Make run and try to get from it.
		run = new PlotRun(new ArrayList()).append(new PlotDatum().with(run.getP(index)));
		run = (new PlotRun<String, Object>(run)).clone();
		run.getP(index);
		fail("The run in question should not have been changed when cloning");

		// Test shallow clones.
		run = new PlotRun(new ArrayList()).clone();
		run.getP(index);
		run = new PlotRun<String, Object>(run).clone();
		run.p(index);

		// Test deep clones.
		run = new PlotRun<String, Object>(run).clone();
		run.getP(index);
		run.getP(new Integer(index)).clone();
		run.getP(new Boolean(index)).clone();

		final PlotDatum cur = new PlotDatum();
		CurChart<String> curchart;

    new AbstractRun<String, Object>(new ArrayList()) {
				@Override public Object clone() {
					return new PlotRun<String, Object>(getP(index)).clone();
				}
    }.complete();
		List<PlotDatum> curr = curchart.getP(cur.getIndex()
											, cur.getValue());
		run.getP(index);
		run = new PlotRun<String, Object>(run).clone();
		run.getP(cur.getIndex(), cur.getValue());
    final ArrayList<PlotDatum> curr2 
		= new ArrayList<PlotDatum>();
		curr2.addAll(curr);
		curr2.addAll(cur.getSubList());
		curr2.remove(cur.getValue());
		curr2.remove(new Integer(index));
		curr.addAll(curr2);
    new AbstractRun<String, Object>(curr).complete();

    run.getP(index);

    new AbstractRun<String, Object>(new ArrayList()) {
			@Override public Object clone() {
				return new PlotRun<String, Object>(getP(index)
								.clone(), curr.getIndex(), curr.getValue())
								.clone();
			}

    }.complete();
    run.getP(index);
	}
}
