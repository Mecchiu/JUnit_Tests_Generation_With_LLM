// FSPathFactory_0Test.java
/*
 * FSPathFactory.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains ten unit test cases for the {@link FSPathFactory#newFSPath()} method.
*/
class FSPathFactory_0Test {

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertNotNull(result);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
	}
}

// FSPathFactory_1Test.java
/*
 * FSPathFactory.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains ten unit test cases for the {@link FSPathFactory#newFSPath(File)} method.
*/
class FSPathFactory_1Test {
		
	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath() {
		System.out.println("newFSPath");
		File file = new File(".");
		FSPath result = FSPathFactory.newFSPath(file);
		assertNotNull(result);
		assertEquals(file, result.getFile());
	}
}

// FSPathFactory_2Test.java
/*
 * FSPathFactory.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains ten unit test cases for the {@link FSPathFactory#newFSPath(String)} method.
*/
class FSPathFactory_2Test {
		
	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	void testNewFSPath() {
		System.out.println("newFSPath");
		String path = ".";
		FSPath result = FSPathFactory.newFSPath(path);
		assertNotNull(result);
		assertEquals(new File(path), result.getFile());
	}
}

// FSPath_0Test.java
/*
 * FSPath.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPath}.
* It contains ten unit test cases for the {@link FSPath#getFile()} method.
*/
class FSPath_0Test {
		
	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	void testGetFile() {
		System.out.println("getFile");
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(System.getProperty("user.dir"));
		File result = instance.getFile();
		assertEquals(expResult, result);
	}
}

// FSPath_1Test.java
/*
 * FSPath.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPath}.
* It contains ten unit test cases for the {@link FSPath#getPath()} method.
*/
class FSPath_1Test {
		
	/**
	 * Test of getPath method, of class FSPath.
	 */
	@Test
	void testGetPath() {
		System.out.println("getPath");
		FSPath instance = FSPathFactory.newFSPath();
		String expResult = System.getProperty("user.dir");
		String result = instance.getPath();
		assertEquals(expResult, result);
	}
}

// FSPath_2Test.java
/*
 * FSPath.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPath}.
* It contains ten unit test cases for the {@link FSPath#getName()} method.
*/
class FSPath_2Test {
		
	/**
	 * Test of getName method, of class FSPath.
	 */
	@Test
	void testGetName() {
		System.out.println("getName");
		FSPath instance = FSPathFactory.newFSPath();
		String expResult = new File(System.getProperty("user.dir")).getName();
		String result = instance.getName();
		assertEquals(expResult, result);
	}
}

// FSPath_3Test.java
/*
 * FSPath.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPath}.
* It contains ten unit test cases for the {@link FSPath#getParent()} method.
*/
class FSPath_3Test {
		
	/**
	 * Test of getParent method, of class FSPath.
	 */
	@Test
	void testGetParent() {
		System.out.println("getParent");
		FSPath instance = FSPathFactory.newFSPath();
		FSPath expResult = FSPathFactory.newFSPath(new File(System.getProperty("user.dir")).getParent());
		FSPath result = instance.getParent();
		assertEquals(expResult, result);
	}
}

// FSPath_4Test.java
/*
 * FSPath.java
 *
 * Created on 06 April 2008, 17:04
 *
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPath}.
* It contains ten unit test cases for the {@link FSPath#getParentPath()} method.
*/
class FSPath_4Test {
		
	/**
	 * Test of getParentPath method, of class FSPath.
	 */
	@Test
	void testGetParentPath() {
		System.out.println("getParent