// JniInchiWrapper_0Test.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains one unit test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_0Test {
		private JniInchiWrapper wrapper = null;
		
			
	/**
	 * Generates an InChI string for the JNI wrapper class given a list of atom
	 * and bond ids for the atoms/bonds to add to the InChI string. The
	 * inChIString will be either empty or the result of adding all of the given bs to it.
	 * 
	 * @param id the set of ids to add atoms/bonds to the InChI string
	 * @param inchi the InChI string to place the atom and bond objects (may be
	 *         empty but in which case the caller will fill in the InChIString)
	 */
	public static void generateInchi(List<Integer> id, String inchi) throws JniInchiException {
		// create a new wrapper for the object in the list
		try {
			// create a new InChI string
			wrapper = new JniInchiWrapper(id);
			// get the InChIKey of the inchi string
			JniInchiOutputKey key = wrapper.getInchiKey(inchi);
			// generate the inchi string
			String s = key.generateInchiString();
			// append the output to the result of generating the string
			if (! s.equals("")) {
				inchi = s;
			}
		}
		catch (Exception e) {
			// handle wrapping an exception
			throw new JniInchiException(e);
		}
		// check that the output was indeed a string
		if (! (s.length() == 0 || s.length() == 0)) {
			// throw some assertion exception on failure
			throw new JniInchiException(
				"Input InChI string (" + s + ") not a string");
		}
	}
	
	
	/**
	 * Test case for the {@link JniInchiWrapper#generateInchi(List,
	 *                                                      String)}.
	 *
	 * @throws JniInchiException
	 */
	@Test
	public final void testGenerateInchi() throws JniInchiException {
		String [] atoms = {"H", "He", "Li", "Be", "B", "C"};
		String [] bonds = {"Hydrogen", "He", "He0", "He1", "He2", "He3", "He4", "He5", "He", "H", "Hb"};
		List<Integer> idlist = wrapper.addAtom(0, 0, atoms[0]);
		idlist.add(0, 0);
		idlist.add(2, 3);
		idlist.add(1, 4);
		idlist.add(5, 6);
		System.out.println("InchiString 0: " +  idlist.toString());
		String inchi = wrapper.generateInchi(idlist, false);
		System.out.println("InchiString 1: " + inchi);
		idlist.clear();
		// for each of the atoms or bonds
		for (int i:idlist) {
			System.out.println("InchiString " + i + ": " +
					wrapper.getInchiKey(Integer.toString(i)));
		}
		List<Integer> id = wrapper.addBond(0, 0, bond1, bond2);
		id.add(1, 1);
		System.out.println("InchiString 2: " + id);
		idlist.clear();
		for (int i:id) {
			System.out.println("InchiString " + i + ": " +
					wrapper.getInchiKey(Integer.toString(i)));
		}
		checkAddAtomBond(id);
		checkAddBond(bond1, bond2);
		
	}
	
	/**
	 * Test case for the {@link JniInchiWrapper#generateInchi(List, Map)}.
	 *
	 * @throws JniInchiException
	 */
	@Test
	public final void testGenerateInchiMap() throws JniInchiException {
		Map<Integer,Integer> a = new HashMap<Integer,Integer>();
		a.put(0, 0);
		Map<Integer,Integer> b = new HashMap<Integer,Integer>();
		b.put(0, 1);
		Map<Integer,Integer> c = new HashMap<Integer,Integer>();
		c.put(1, 2);
		Map<Integer,Integer> d = new HashMap<Integer,Integer>();
		d.put(5, 6);
		Map<Integer,Integer> e = new HashMap<Integer,Integer>();
		e.put(6, 7);
		a.put(1, e);
		a.put(2, c);
		b.put(1, d);
		b.put(2, a);
		String [] atoms = {"H", "He", "He", "He", "He", "He", "He", "He"};
		String [] bonds = {"Hydrogen", "He", "He0", "He1", "He2", "He3", "He4", "He5", "He", "H", "Hb"};
		List<Integer> idlist = wrapper.addAtom(0, 0, atoms[0]);
		idlist.add(0, 0);
		idlist.add(2, 3);
		idlist.add(1, 4);
		idlist.add(5, 6);
		idlist.add(6, 7);
		// make sure that we have the expected number of atoms and bonds
		System.out.println("Atoms/bonds for atom/bond 1:" + idlist);
		String inchi = wrapper.generateInchi(idlist, a);
		System.out.println("InchiString 1: " + inchi);
		System.out.println("Atoms/bonds for atom/bond 1:");
}
}