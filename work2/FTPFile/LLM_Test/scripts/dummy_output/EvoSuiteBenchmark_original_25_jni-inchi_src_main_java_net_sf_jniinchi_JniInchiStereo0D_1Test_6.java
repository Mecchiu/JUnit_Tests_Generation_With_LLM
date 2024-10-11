// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
		boolean assertSucceeded = false;
		boolean assertTested = false;
	
	/** Test case for {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)
	 * (parity is not set.)
	 * Tests:<br>
	 * <ul>
	 *   <li>Test case for
	 *   {@link javax.vecmath.Vector3f#setToUniformBounds(float)
	 * <br>
	 * <br>
	 *     setToUniformBounds(0.0f, 0.0f, 1.0f, 1.0f)
	 *   <li>Test case for
	 *   {@link javax.vecmath.Vector2f#setToUniformBounds(float)
	 *   </ul>
	 * </ul>
	* @throws Exception
	* Test case for: <li>
	* 1)
	* {@link javax.vecmath.Vector3f#setToUniformBounds(float}
	* ({@link javax.vecmath.Vector3f#getX()} <==> {@link javax.vecmath.Vector3f#getX()} <==> 1.0f)}
	* </li><li>2) {@link javax.vecmath.Vector2f#setToUniformBounds(float)
	* ({@link javax.vecmath.Vector2f#getX()} <==> {@link javax.vecmath.Vector2f#getX()} <==> 0.5f)}
	* </li><li>3) {@link javax.vecmath.Vector2f#setToUniformBounds(Vector2f)
	* ({@link javax.vecmath.Vector2f#getX()} <==> {@link javax.vecmath.Vector2f#getX()} <==> {@link Vector2f#getX()} <- 1.0f)}
	* </li><li>4) {@link javax.vecmath.Vector2f#setToUniformBounds(Vector2f)
	* ({@link javax.vecmath.Vector2f#getX()} <==> {@link javax.vecmath.Vector2f#getX()} <- 1.0f)}
	* </li><li>5) {@link javax.vecmath.Vector2f#setToUniformBounds(Vector2f)
	* ({@link javax.vecmath.Vector2f#getX()} <==> {@link javax.vecmath.Vector2f#getX()} <- 0.5f)}
	* </li><li>6) {@link javax.vecmath.Vector2f#setToUniformBounds(float, float, float, float)
	* ({@link javax.vecmath.Vector2f#getY()} <==> {@link javax.vecmath.Vector2f#getY()} <- {@link javax.vecmath.Vector2f#getY()} <- 0.5f)}
	* </li></ol>
	*/
	public static void main(String[] args) throws Exception {
		if (assertSucceeded!= true)
			assertTrue(false, "Test 1 (2) failed");
		assertTested = true;
	}
	
	
	/**
	* @return the success of the test on success
	* @throws Exception
	*/
	public JniInchiStereo0D_1Test assertSuccess() throws Exception {
		if (assertSucceeded)
			return
				assertTested == true
					? JniInchiStereo0D_1Test.success
					: JniInchiStereo0D_1Test.failure;
		else
			return JniInchiStereo0D_1Test.failure;
	}

	/**
	 * Returns a success (true) or fails (false) depending on whether the test was successful or not.
	 * @return the success on success or false for failures
	 */
	public static boolean success() {
		assertSucceeded = true;
		return JniInchiStereo0D_1Test.success;
	}
	
	/**
	 * Returns a failure (false) or success (true) depending on whether the test was successful or not.
	 * @return the success on success or false for failures
	 */
	public static boolean failure() {
		assertSucceeded = true;
		return JniInchiStereo0D_1Test.success;
	}

}