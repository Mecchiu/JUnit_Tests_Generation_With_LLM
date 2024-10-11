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
		final static List<Integer> NUCLEOTIDE = Lists.newArrayList(32, 48, 64);
		final static int NUCLEOTIDE_BASE = 32;
		final static int NUCLEOTIDE_LIMIT = 64;
		final static int TURN_BASE = 256;
		
		final static List<Integer> NUCLEOTIDE_SECTION_1 = Lists.newArrayList(
				TURN_BASE,
				TURN_BASE,
				TURN_BASE,
				NUCLEOTIDE_BASE,
				NUCLEOTIDE_BASE,
				NUCLEOTIDE_BASE);
		
		final static List<Integer> NUCLEOTIDE_SECTION_2 = Lists.newArrayList(
				TURN_BASE,
				NUCLEOTIDE_BASE,
				TURN_BASE,
				NUCLEOTIDE_BASE,
				NUCLEOTIDE_BASE);
		
		@SuppressWarnings("unchecked")
		final static JniInchiStereo0D[] ADDED_0 = new JniInchiStereo0D[2];
		@SuppressWarnings("unchecked")
		final static JniInchiStereo0D[] ADDED_1 = new JniInchiStereo0D[2];
		
		@Test
		void testBasicAdd0D();
		@Test
		void testBasicAdd1D();
		@Test
		void testBasicAdd2D();
}