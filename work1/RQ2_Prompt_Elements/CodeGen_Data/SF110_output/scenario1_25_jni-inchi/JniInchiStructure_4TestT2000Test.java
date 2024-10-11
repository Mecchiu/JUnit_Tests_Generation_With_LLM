// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {
public static final int SIZE = 1;
		public static final int SIZE_1 = 16;
		public static final int SIZE_2 = 32;
		public static final int SIZE_3 = 64;
		public static final int SIZE_4 = 128;
		public static final int SIZE_4_1 = SIZE_4;
		public static final int SIZE_4_2 = SIZE_4 * SIZE_2;
		public static final int SIZE_4_3 = SIZE_4 * SIZE_3;


    @Test
	public void test1() {
		// the case where the bond is set to zero (in which it would exist)
        for (int i = 0; i < SIZE_4; ++i)
		{
			if (bondList.size()!= 1)
				return;
			JniInchiBond bond = (JniInchiBond) bondList.get(i);
			if (bond.getNumBonds()!= 0)
				throw new OutOfBondException("The Bond List should be empty: " + bondList.toString());
		}
		JniInchiStructure st1 = new JniInchiStructure();
        // test case for set
		st1.addBond(0,1,0);
	}


    @Test
	public void test2() {
		// the case where the bond is set to zero (in which it would exist)
        for (int i = 0; i < SIZE_4; ++i)
		{
			if (bondList.size()!= 1)
				return;
			JniInchiBond bond = (JniInchiBond) bondList.get(i);
			for (int j = 0; j < SIZE_2; ++j)
			{
				if (bond.hasBond(j))
					throw new OutOfBondException("The Bond List should contain less than 2 bonds: " + bondList.toString());
			}
		}
		JniInchiStructure st2 = new JniInchiStructure();
		st2.addBond(0,1,0);
		st2.addBond(1,5,90);
		st2.addBond(5,1,0);
		st2.addBond(1,6,10);
		st2.addBond(5,6,0);
		st2.addBond(5,5,120);

		// the second test case
		JniInchiBond bond = (JniInchiBond) st2.getBond(1);
		bond.addBond(4,1,120);
        // test case for equality (one bond per atom; one bond per atom)
	}


    @Test
	public void test3() {
		// the case where the bond is set to zero (in which it would exist)
        for (int i = 0; i < SIZE_4; ++i)
		{
            JniInchiBond bond = (JniInchiBond) bondList.get(i);
			bond.addBond(7,15,60);
		}

		// test case for equality
		for (int i = 0; i < SIZE_4; ++i) {
			JniInchiBond bond = (JniInchiBond) bondList.get(i);
			bond.addBond(1,5,90);
            bond = (JniInchiBond) bondList.get(i);
			assertNotEquals(bondList, bondList);
			assertEquals(bondList, bondList);
			assertEquals(bondList.hashCode(), bondList.hashCode());
			assertEquals(1, bondList.size());
		}
	}

    
}

