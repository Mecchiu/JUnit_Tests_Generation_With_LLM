// JniInchiStructure_2Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructure_2Test {
private final JniInchiStructure _stereo0D = new JniInchiStereo0D();

		/**
	 * Test case for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)}.
	 * @throws RuntimeException for the test cases fail
	 */
	@Test
	public void testAddStereo0D() {
	  final JniInchiStructure.BinaryStereo0D stereoParity = new JniInchiStructure.BinaryStereo0D();
	  assertNotNull(STEREO0D_ADD1_PARITY, stereoParity);
	  assertTrue(STEREO0D_ADD1_PARITY.stereo0D, stereoParity);
	  assertNotNull(STEREO0D_ADD1_PARITY.binary, stereoParity.binary);
	  assertTrue(STEREO0D_ADD1_PARITY.binary.length*2 > stereoParity.binary.length, "Stereo parity is larger than BNIBINARY_STREAM_LENGTH");
	  stereoList.add(_stereo0D);
	}

	@Test
	public void testBinaryMolecule1D() {
	  final List<BinaryMoleculeParams> binaryList = new ArrayList<BinaryMoleculeParams>(1);
	  binaryList.add(new BinaryMoleculeParams(0, 0));
	  testBinaryMolecule1DParams(binaryList);
	}

	@Test
	public void testBinaryMolecule2D() {
	  final List<BinaryMoleculeParams> binaryList = new ArrayList<BinaryMoleculeParams>(1);
	  binaryList.add(new BinaryMoleculeParams(0, 0, 0));
	  testBinaryMolecule2DParams(binaryList);
	}

	@Test
	public void testTensorMolecule1D() {
	  final List<BinaryMoleculeParams> binaryList = new ArrayList<BinaryMoleculeParams>(1);
	  binaryList.add(new BinaryMoleculeParams(0, 0, 0));
	  testBinaryMolecule1DParams(binaryList);
	}

	@Test
	public void testTensorMolecule2D() {
	  final List<BinaryMoleculeParams> binaryList = new ArrayList<BinaryMoleculeParams>(1);
	  binaryList.add(new BinaryMoleculeParams(0, 0, 0, 0));
	  testBinaryMolecule2DParams(binaryList);
	}

	private void testBinaryMolecule1DParams(final List<BinaryMoleculeParams> binaryList) {
	  assertNotNull(STEREO0D_ADD1_PDBARAMA_LIST, _stereo0D.binaryA);
	  assertTrue(STEREO0D_ADD1_PDBARAMA_LIST.stereo0D, _stereo0D.stereo0D);
	  assertNotNull(STEREO0D_ADD1_PDBARAMA_LIST.binaryA, _stereo0D.binaryA);
	  assertTrue(STEREO0D_ADD1_PDBARAMA_LIST.binaryA.length*5 > _stereo0D.binaryA.length, "Stereo parity is larger than BNIBINARY_STREAM_LENGTH");
	  binaryList.add(_stereo0D);
	}

	private void testBinaryMolecule2DParams(
				final List<BinaryMoleculeParams> binaryList
			) {
	  assertNotNull(FERENCE_PREFIX, _stereo0D.binaryF);
	  assertEquals(0, _stereo0D.binaryF.indexFromString("0"), "Non-zero F");
	  assertEquals(1, _stereo0D.binaryF.indexFromString("1"), "Non-zero F");
	  assertEquals(0, _stereo0D.binaryF.indexFromString("2"), "Non-zero F");
	  assertTrue(_stereo0D.binaryF.size_p * 5 > _stereo0D.binaryF.length, "F is longer than a binary");
	  assertNotNull(FERENCE_PREFIX, _stereo0D.binaryG);
	  assertTrue(Math.abs(1-_stereo0D.binaryG.indexFromString("0%")) + 1 < _stereo0D.binaryG.length, "F is even");
	  assertTrue(Math.abs(1-_stereo0D.binaryG.indexFromString("0%")) + 1 < _stereo0D.binaryG.length, "F is even");
	  assertTrue(Math.abs(1-_stereo0D.binaryG.indexFromString("1%")) + 1 < _stereo0D.binaryG.length, "F is odd");
	  assertTrue(Math.abs(1-_stereo0D.binaryG.indexFromString("1%")) + 1 < _stereo0D.binaryG.length, "F is odd");
	  assertTrue(Math.abs(1-_stereo0D.binaryG.indexFromString("2%")) + 1 < _stereo0D.binaryG.length, "F is even");
	  assertTrue(_stereo0D.binaryG.size_p-1 < _stereo0D.binaryG.length, "F has to be greater than an end-cap");
	  byte[] binary;
	  {
		binary = _stereo0D.binaryG.subSequence(0, _binaryG.length).getBytes();
		binary = binary.length == 0? new byte[] { 0 }:{};
		binaryList.add(_stereo0D.binaryG);
		return;
	  }
	}

	private byte[] _binaryG;
	private BinaryMoleculeParams _stereo0D;
	private List<BinaryMoleculeParams> _binaryList;
	private List<JniInchiStereo0D> _stereoList;

	private BinaryMoleculeParams _binaryA;
}
