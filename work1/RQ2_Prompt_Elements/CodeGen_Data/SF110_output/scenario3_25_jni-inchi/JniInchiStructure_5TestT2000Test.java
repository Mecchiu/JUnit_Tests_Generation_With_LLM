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

	private String name;
	private List<Integer> parms;

	/**
	 * Set up tests in the {@link net.sf.jniinchi.JniInchiStructure_5Test} class.
	 */
	public JniInchiStructure_5Test() {
		this.name = "JniInchiStructure_5Test";
		this.parm0D(0);
		this.parm1D(2);
		this.parm1DIndex(1);
		this.parm2D(0, 1);
		this.parm2DIndex(2);
		this.parm3D(0, 2);
		this.parm3DIndex(3);
		this.parm4D(0, 0, 1, 1);
		this.parm4DIndex(4);
		this.parms = new ArrayList<Integer>();
	}

	/**
	 * The {@link net.sf.jniinchi.JniInchiStructure#getStereo0D(int)} method.
	 * @return JniInchiStereo0D instance.
	 */
	@SuppressWarnings("static-method")
	private JniInchiStereo0D parm0D(final int i) {
		JniInchiStereo0D ret = new JniInchiStereo0D("");
		parms.add(i);
		ret.setPv(parms);
		return ret;
	}

	/**
	 * Parse the JNI-stereo0D to the desired state.
	 */
	@Test
	public void testParse() {
		System.out.println("**** "+this.getClass().getName()+".testParse ****");

		@SuppressWarnings("static-method")
		JniInchiStereo0D out = this.pipeline4JNIInchiStereo0D("inp1_0", this.parm1D(0));
		assertEquals(out.getPv().size(),parms.size());
		System.out.println("**** "+this.getClass().getName()+".testParse.parms ");
		for (int i : parms) {
			int inp1 = (Integer) out.getPv().get(i);
			System.out.println("inp1 = "+inp1);
			assertEquals(inp1, i);
		}
	}

	/**
	 * Returns JSON-array of structures.
	 */
	@SuppressWarnings("static-method")
	private JniInchiStereo0D pipeline4JNATry(final String name) {
		JniInchiStereo0D result = new JniInchiStereo0D();
		result.setPv(new ArrayList<Integer>());
		result.setPv(result.getPv());

		if (!name.startsWith("inp1_") &&!name.startsWith("inp2_")&&!name.startsWith("inp3_")&&!name.startsWith("inp4_"))
			assertTrue(result.getPv().size()==0);
		result.setPv(new ArrayList<Integer>());
		result.getPv().add(Integer.valueOf(100));
		return result;
	}

	/**
	 * The pipeline which parses JSON and returns JSON-array structured structure by structure.
	 */
	@SuppressWarnings("static-method")
	private JniInchiStereo0D pipeline4JNATry(final String name, final JniInchiStereo0D parm0D) {
		JniInchiStereo0D result = new JniInchiStereo0D();
		result.setPv(new ArrayList<Integer>());
		result.setPv(result.getPv());

		if (name.startsWith("inp1_")) {
			result.getPv().add(parm0D);
		} else if (name.startsWith("inp2_")) {
			result.getPv().add(parm0D);
		} else if (name.startsWith("inp3_")) {
			result.getPv().add(parm0D);
		} else if (name.startsWith("inp4_")) {
			result.getPv().add(parm0D);
		}
		return result;
	}
}
