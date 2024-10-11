// FSPathResultListImpl_0Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_0Test {

	/**
	 * Test of each method, of class FSPathResultListImpl.
	 */
	@Test
	void testEach() throws Exception {
		System.out.println("each");
		Callback callback = null;
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultList expResult = null;
		FSPathResultList result = instance.each(callback);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// FSPathResultListImpl_1Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_1Test {
		
	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.delete();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// FSPathResultListImpl_2Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#copy(String)} method.
*/
class FSPathResultListImpl_2Test {
		
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 */
	@Test
	void testCopy() throws Exception {
		System.out.println("copy");
		String destinationDirPath = "";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// FSPathResultListImpl_3Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#rename(String, String)} method.
*/
class FSPathResultListImpl_3Test {
		
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 */
	@Test
	void testRename() throws Exception {
		System.out.println("rename");
		String matchExpression = "";
		String replaceExpresion = "";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// FSPathResultListImpl_4Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#move(String)} method.
*/
class FSPathResultListImpl_4Test {
		
	/**
	 * Test of move method, of class FSPathResultListImpl.
	 */
	@Test
	void testMove() throws Exception {
		System.out.println("move");
		String destinationPath = "";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.move(destinationPath);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// FSPathResultModificationListImpl.java
/**
 * Copyright 2008 (C) Keith Bishop (bishi@users.sourceforge.net)
 *
 * All rights reserved.
 *
 * This file is part of FSPath.
 *
 * FSPath is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FSPath is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FSPath.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * FSPathResultModificationListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.util.ArrayList;

/**
 * @author kbishop
 * @version $Id$
 */
public class FSPathResultModificationListImpl extends ArrayList<FSPathResult> implements FSPathResultModificationList {

    private ArrayList<FSPathResult> successes = new ArrayList<FSPathResult>();
    private ArrayList<FSPathResult> failures = new ArrayList<FSPathResult>();

    /**
     * Creates a new instance of FSPathResultModificationListImpl
     */
    public FSPathResultModificationListImpl() {
    }

    public void addSuccess(FSPathResult result) {
        successes.add(result);
    }

    public void addFailure(FSPathResult result) {
        failures.add(result);
    }

    public boolean hasFailures() {
        return (failures.size() > 0);
    }

    public boolean hasSuccesses() {
        return (successes.size() > 0);
    }

    public FSPathResultList getSuccesses() {
        return successes;
    }

    public FSPathResultList getFailures() {
        return failures;
    }
}

// FSPathResultModificationListImpl_0Test.java
/*
 * FSPathResultModificationListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultModificationListImpl}.
* It contains ten unit test cases for the {@link FSPathResultModificationListImpl#addSuccess(FSPathResult)} method.
*/
class FSPathResultModificationListImpl_0Test {
		
	/**
	 * Test of addSuccess method, of class FSPathResultModificationListImpl.
	 */
	@Test
	void testAddSuccess() {
		System.out.println("addSuccess");
		FSPathResult result = null;
		FSPathResultModificationListImpl instance = new FSPathResultModificationListImpl();
		instance.addSuccess(result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// FSPathResultModificationListImpl_1Test.java
/*
 * FSPathResultModificationListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultModificationListImpl}.
* It contains ten unit test cases for the {@link FSPathResultModificationListImpl#addFailure(FSPathResult)} method.
*/
class FSPathResultModificationListImpl_1Test {
		
	/**
	 * Test of addFailure method, of class FSPathResultModificationListImpl.
	 */
	@Test
	void testAddFailure() {
		System.out.println("addFailure");
		FSPathResult result = null;
		FSPathResultModificationListImpl instance = new FSPathResultModificationListImpl();
		instance.addFailure(result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// FSPathResultModificationListImpl_2Test.java
/*
 * FSPathResultModificationListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultModificationListImpl}.
* It contains ten unit test cases for the {@link FSPathResultModificationListImpl#hasFailures()} method.
*/
class FSPathResultModificationListImpl_2Test {
		
	/**
	 * Test of hasFailures method, of class FSPathResultModificationListImpl.
	 */
	@Test
	void testHasFailures() {
		System.out.println("hasFailures");
		FSPathResultModificationListImpl instance = new FSPathResultModificationListImpl();
		boolean expResult = false;
		boolean result = instance.hasFailures();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// FSPathResultModificationListImpl_3Test.java
/*
 * FSPathResultModificationListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultModificationListImpl}.
* It contains ten unit test cases for the {@link FSPathResultModificationListImpl#hasSuccesses()} method.
*/
class FSPathResultModificationListImpl_3Test {
		
	/**
	 * Test of hasSuccesses method, of class FSPathResultModificationListImpl.
	 */
	@Test
	void testHasSuccesses() {
		System.out.println("hasSuccesses");
		FSPathResultModificationListImpl instance = new FSPathResultModificationListImpl();
		boolean expResult = false;
		boolean result = instance.hasSuccesses();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// FSPathResultModificationListImpl_4Test.java
/*
 * FSPathResultModificationListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultModificationListImpl}.
* It contains ten unit test cases for the {@link FSPathResultModificationListImpl#getSuccesses()} method.
*/
class FSPathResultModificationListImpl_4Test {
		
	/**
	 * Test of getSuccesses method, of class FSPathResultModificationListImpl.
	 */
	@Test
	void testGetSuccesses() {
		System.out.println("getSuccesses");
		FSPath