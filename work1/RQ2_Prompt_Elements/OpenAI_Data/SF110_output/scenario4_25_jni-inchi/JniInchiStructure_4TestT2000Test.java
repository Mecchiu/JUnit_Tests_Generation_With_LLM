// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {

	/**
	 * Test case for {@link JniInchiStructure#getBond(int)} method.
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetBond_1() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiAtom atom3 = new JniInchiAtom("C");
		JniInchiAtom atom4 = new JniInchiAtom("C");
		JniInchiAtom atom5 = new JniInchiAtom("C");
		JniInchiAtom atom6 = new JniInchiAtom("C");
		JniInchiAtom atom7 = new JniInchiAtom("C");
		JniInchiAtom atom8 = new JniInchiAtom("C");
		JniInchiAtom atom9 = new JniInchiAtom("C");
		JniInchiAtom atom10 = new JniInchiAtom("C");
		JniInchiAtom atom11 = new JniInchiAtom("C");
		JniInchiAtom atom12 = new JniInchiAtom("C");
		JniInchiAtom atom13 = new JniInchiAtom("C");
		JniInchiAtom atom14 = new JniInchiAtom("C");
		JniInchiAtom atom15 = new JniInchiAtom("C");
		JniInchiAtom atom16 = new JniInchiAtom("C");
		JniInchiAtom atom17 = new JniInchiAtom("C");
		JniInchiAtom atom18 = new JniInchiAtom("C");
		JniInchiAtom atom19 = new JniInchiAtom("C");
		JniInchiAtom atom20 = new JniInchiAtom("C");
		JniInchiAtom atom21 = new JniInchiAtom("C");
		JniInchiAtom atom22 = new JniInchiAtom("C");
		JniInchiAtom atom23 = new JniInchiAtom("C");
		JniInchiAtom atom24 = new JniInchiAtom("C");
		JniInchiAtom atom25 = new JniInchiAtom("C");
		JniInchiAtom atom26 = new JniInchiAtom("C");
		JniInchiAtom atom27 = new JniInchiAtom("C");
		JniInchiAtom atom28 = new JniInchiAtom("C");
		JniInchiAtom atom29 = new JniInchiAtom("C");
		JniInchiAtom atom30 = new JniInchiAtom("C");
		JniInchiAtom atom31 = new JniInchiAtom("C");
		JniInchiAtom atom32 = new JniInchiAtom("C");
		JniInchiAtom atom33 = new JniInchiAtom("C");
		JniInchiAtom atom34 = new JniInchiAtom("C");
		JniInchiAtom atom35 = new JniInchiAtom("C");
		JniInchiAtom atom36 = new JniInchiAtom("C");
		JniInchiAtom atom37 = new JniInchiAtom("C");
		JniInchiAtom atom38 = new JniInchiAtom("C");
		JniInchiAtom atom39 = new JniInchiAtom("C");
		JniInchiAtom atom40 = new JniInchiAtom("C");
		JniInchiAtom atom41 = new JniInchiAtom("C");
		JniInchiAtom atom42 = new JniInchiAtom("C");
		JniInchiAtom atom43 = new JniInchiAtom("C");
		JniInchiAtom atom44 = new JniInchiAtom("C");
		JniInchiAtom atom45 = new JniInchiAtom("C");
		JniInchiAtom atom46 = new JniInchiAtom("C");
		JniInchiAtom atom47 = new JniInchiAtom("C");
		JniInchiAtom atom48 = new JniInchiAtom("C");
		JniInchiAtom atom49 = new JniInchiAtom("C");
		JniInchiAtom atom50 = new JniInchiAtom("C");
		JniInchiAtom atom51 = new JniInchiAtom("C");
		JniInchiAtom atom52 = new JniInchiAtom("C");
		JniInchiAtom atom53 = new JniInchiAtom("C");
		JniInchiAtom atom54 = new JniInchiAtom("C");
		JniInchiAtom atom55 = new JniInchiAtom("C");
		JniInchiAtom atom56 = new JniInchiAtom("C");
		JniInchiAtom atom57 = new JniInchiAtom("C");
		JniInchiAtom atom58 = new JniInchiAtom("C");
		JniInchiAtom atom59 = new JniInchiAtom("C");
		JniInchiAtom atom60 = new JniInchiAtom("C");
		JniInchiAtom atom61 = new JniInchiAtom("C");
		JniInchiAtom atom62 = new JniInchiAtom("C");
		JniInchiAtom atom63 = new JniInchiAtom("C");
		JniInchiAtom atom64 = new JniInchiAtom("C");
		JniInchiAtom atom65 = new JniInchiAtom("C");
		JniInchiAtom atom66 = new JniInchiAtom("C");
		JniInchiAtom atom67 = new JniInchiAtom("C");
		JniInchiAtom atom68 = new JniInchiAtom("C");
		JniInchiAtom atom69 = new JniInchiAtom("C");
		JniInchiAtom atom70 = new JniInchiAtom("C");
		JniInchiAtom atom71 = new JniInchiAtom("C");
		JniInchiAtom atom72 = new JniInchiAtom("C");
		JniInchiAtom atom73 = new JniInchiAtom("C");
		JniInchiAtom atom74 = new JniInchiAtom("C");
		JniInchiAtom atom75 = new JniInchiAtom("C");
		JniInchiAtom atom76 = new JniInchiAtom("C");
		JniInchiAtom atom77 = new JniInchiAtom("C");
		JniInchiAtom atom78 = new JniInchiAtom("C");
		JniInchiAtom atom79 = new JniInchiAtom("C");
		JniInchiAtom atom80 = new JniInchiAtom("C");
		JniInchiAtom atom81 = new JniInchiAtom("C");
		JniInchiAtom atom82 = new JniInchiAtom("C");
		JniInchiAtom atom83 = new JniInchiAtom("C");
		JniInchiAtom atom84 = new JniInchiAtom("C");
		JniInchiAtom atom85 = new JniInchiAtom("C");
		JniInchiAtom atom86 = new JniInchiAtom("C");
		JniInchiAtom atom87 = new JniInchiAtom("C");
		JniInchiAtom