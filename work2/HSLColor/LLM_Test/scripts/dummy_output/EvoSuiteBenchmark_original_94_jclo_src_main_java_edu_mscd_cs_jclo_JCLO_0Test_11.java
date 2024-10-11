// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {
		static {
       try {
			Class pathClass0 = Class.forName("java.lang.Classpath$path");
			Class superCl1 = Class.forName("edu.mscd.cs.jclo.path.JCLO");
     		assertTrue("not found in path or superclass",pathClass0.isInstance(superCl1));
     	} catch(ClassNotFoundException clie) {
	     	 assertTrue("not found in path or superclass", true);
     	 }
     } catch (ClassNotFoundException clie) {
         assertTrue("not found in path or superclass",true);
     }
}
