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
		
    static final String source =
		"/**\n* This method checks whether hasSuper class. It returns true if\n* this class has a super class or if this class inherits\n* from a super class.\n*/\n" +
			"public boolean hasSuperClass() {\n" +
			"  return\n" +
				"        hasSuperClass ||\n" +
				"        (this.superClass!= null &&!this.superClass.equals(\"\"));\n" +
			"}\n";

	@Test
	public void testHasSuperClass() {
		// create the Class object
		Class test_cls = JavaSource.class;
		test_cls.newInstance();
		
		StringTokenizer tokenizer = new StringTokenizer(test_cls.getName(), ".");
		assertEquals(2, tokenizer.countTokens());
		
		String mBase = className;
		assertEquals(mBase, tokenizer.nextToken());
		assertEquals(mBase + ".java", tokenizer.nextToken());
	}
	
	@Test
	public void testCtor() {
		// create the Class object
		Class test_cls = JavaSource.class;
		test_cls.newInstance();
		
		Iterator<String> it = test_cls.getConstructors();
		assertTrue(it.hasNext());
		TestConstructor test = (TestConstructor)it.next();
				
		String mBase = className;
		List<String> mArgs = new ArrayList<>();
		List<String> mParams = test.getParams();
		if (!mParams.isEmpty()) {			
			mParams.add("[]");
		}

		mParams.add("()");
		List<String> mBody = test.getBody();
		if (!mBody.isEmpty() && mBody.get(0).equals(",")) {
			mBody.set(0, mParams.size() + 1);
		}
		test_cls.setName(mBase + " " + mArgs.toString().replaceAll("[\\[]|\\{", "_").replaceAll("}|}", ""));
		
		// execute
		Iterator<?> var_it = test.execute(getTokenizer(test_cls.getSuperclass(), "."));
		assertTrue(var_it.hasNext());
		
		JavaSource js = (JavaSource)var_it.next();
		
		// validate that no super class was applied
		assertFalse(js.hasSuperClass());
		
		// validate that each class inherits its super class
		List<JavaSource> jSrcList = new ArrayList<>();
		jSrcList.add(js);
		var_it = jSrcList.iterator();
}
}