// JniInchiStructure_5Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getStereo0D(int)} method.
*/
class JniInchiStructure_5Test {
		
	/**
	 * Tests getStereo0D(int) with a list of stations.
	 */
	@Test
	public void testGetStereo0DListWithStations() {
		List<InchiStereo0D> list = new ArrayList<InchiStereo0D>();
		list.add(new InchiStereo0D());
		list.add(new InchiStereo0D());
		for (int i = 0; i < list.size(); i++)
			list.get(i).increment();
		assertThat("incorrect list size", list.size(), equalTo(3));
		assertThat("incorrect list size", countOf(list.get(0)), greaterThan(0));

		InchiStereo0D t1 = list.get(0);
		InchiStereo0D t2 = list.get(1);
		InchiStereo0D t3 = list.get(2);
		t1.decrement();
		t2.decrement();
		t3.decrement();

		assertThat("nonstereo0D at index 0 not changed", t1.getStereo0D(), equalTo(0));
		assertThat("nonstereo0D at index 1 not changed", t2.getStereo0D(), equalTo(0));
		assertThat("nonstereo0D at index 2 not changed", t3.getStereo0D(), equalTo(0));
	}
		
	/**
	 * Tests getStereo0D() for a list that contains one non-stereo0D.
	 */
	@Test
	public void testGetStereo0D_NonStereo0D() {
		List<InchiStereo0D> list = new ArrayList<InchiStereo0D>();
		InchiStereo0D t1 = new InchiStereo0D();
		list.add(t1);
		t1.increment();
		t1.increment();

		assertThat("stereo0D not returned", t1.getStereo0D(), equalTo(t1.getStereo0D()));
	}
	
}