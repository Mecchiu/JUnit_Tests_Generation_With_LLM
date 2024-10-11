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
		public static final int i = 7;

		/**
		 * Tries to get bond from JniInchiStructure using the given number.
		 * @param n {@link #i}: an integer number.
		 * @return {@link JniInchiBond}, if successfully.
		 * It can fail if there for example is not supported for the given number.
		*/
		public final JniInchiBond getBond(int n) {
			int bond;
			bond = ((JniInchiBase)this.getClass().getField("base").get(this)).getBond(n);
			return new JniInchiBond_4Test(bond);
		}
	}