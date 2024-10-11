// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {
		/**
		 * @param args the command line arguments.
		 */
		public static void main(String[] args) {
			new JavaSource_1Test().test();
		}
		public void test() {
			JavaSource aJavaSource = new JavaSource("org.sourceforge.ifx.tools.JavaSource.Test");

			assertNotNull("hasSuperClass() must return a non-null value", aJavaSource.hasSuperClass());

			List aListOfMemberVariables = new ArrayList();
			List aListVariableNames = new ArrayList();

			Iterator iterator = aJavaSource.getMemberVariables().iterator();
			while(iterator.hasNext()) {
				MemberVariable aMemberVariable = (MemberVariable)iterator.next();
				String aMemberVariableName = aMemberVariable.getVariableName();
				List aListVariableNamesForMember = new ArrayList();
				aListVariableNamesForMember.add(aMemberVariableName);

				if(isArray(aMemberVariable.getVariableType())) {
					List aArray = (Array) aMemberVariable;
					aListVariableNamesForMember.add(aArray.getElementCount());

				} else {
					aListVariableNamesForMember.add(aMemberVariableName);
				}
				aListOfMemberVariables.add(aListVariableNamesForMember);
				aListVariableNames.add(aMemberVariableName);
			}

			aJavaSource.setMemberVariables(aListOfMemberVariables);
			aJavaSource.setVariableNames(aListVariableNames);

			assertEquals("hasSuperClass()",true,aJavaSource.hasSuperClass());

			// assertEquals(5, aJavaSource.getNumberOfMemberVariables());

			// assertEquals(5, aJavaSource.getMemberVariables().size());

			assertEquals(5,aListVariableNames.size());

			Iterator iterator2 = aJavaSource.getMemberVariables().iterator();
			Boolean[] anBooleanArray = new Boolean[5];
			String mvarName = null;
			int index = 0;
			do{
				anBooleanArray[index] = false;
				mvarName = (String)iterator2.next();

				aJavaSource.getMemberVariables().remove(index);
				index++;
			}while(isArray(aJavaSource.getMemberVariables().get(index)));

			List aTempListOfMemberVariables = new ArrayList();
			Iterator iterator3 = aJavaSource.getVariableNames().iterator();
			Boolean[] aBooleanArray = new Boolean[5];
			anBooleanArray[0] = true;
			int index9 = 0;
			boolean anBoolean2 = false;
}
}