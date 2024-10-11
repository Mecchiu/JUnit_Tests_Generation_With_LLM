// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {

	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	public void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = null;
		JFrame parentFrame = null;
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of savePreference method, of class HttpPreference.
	 */
	@Test
	public void testSavePreference() {
		System.out.println("savePreference");
		HttpAnalyzerView analyseView = null;
		JFrame parentFrame = null;
		String notes = "";
		HttpPreference instance = new HttpPreference();
		instance.savePreference(analyseView, parentFrame, notes);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// HttpPreference.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;

/**
 * @author vlad
 */
public class HttpPreference {

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     */
    public void savePreference(HttpAnalyzerView analyseView, JFrame parentFrame, String notes);

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     * @return String Notes
     */
    public String loadPreference(HttpAnalyzerView mainView, JFrame parentFrame);
}

// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
		
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	public void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = null;
		JFrame parentFrame = null;
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of savePreference method, of class HttpPreference.
	 */
	@Test
	public void testSavePreference() {
		System.out.println("savePreference");
		HttpAnalyzerView analyseView = null;
		JFrame parentFrame = null;
		String notes = "";
		HttpPreference instance = new HttpPreference();
		instance.savePreference(analyseView, parentFrame, notes);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// HttpPreference.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;

/**
 * @author vlad
 */
public class HttpPreference {

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     */
    public void savePreference(HttpAnalyzerView analyseView, JFrame parentFrame, String notes);

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     * @return String Notes
     */
    public String loadPreference(HttpAnalyzerView mainView, JFrame parentFrame);
}

// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
		
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	public void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = null;
		JFrame parentFrame = null;
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of savePreference method, of class HttpPreference.
	 */
	@Test
	public void testSavePreference() {
		System.out.println("savePreference");
		HttpAnalyzerView analyseView = null;
		JFrame parentFrame = null;
		String notes = "";
		HttpPreference instance = new HttpPreference();
		instance.savePreference(analyseView, parentFrame, notes);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// HttpPreference.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;

/**
 * @author vlad
 */
public class HttpPreference {

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     */
    public void savePreference(HttpAnalyzerView analyseView, JFrame parentFrame, String notes);

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     * @return String Notes
     */
    public String loadPreference(HttpAnalyzerView mainView, JFrame parentFrame);
}

// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
		
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	public void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = null;
		JFrame parentFrame = null;
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of savePreference method, of class HttpPreference.
	 */
	@Test
	public void testSavePreference() {
		System.out.println("savePreference");
		HttpAnalyzerView analyseView = null;
		JFrame parentFrame = null;
		String notes = "";
		HttpPreference instance = new HttpPreference();
		instance.savePreference(analyseView, parentFrame, notes);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// HttpPreference.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;

/**
 * @author vlad
 */
public class HttpPreference {

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     */
    public void savePreference(HttpAnalyzerView analyseView, JFrame parentFrame, String notes);

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     * @return String Notes
     */
    public String loadPreference(HttpAnalyzerView mainView, JFrame parentFrame);
}

// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
		
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	public void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = null;
		JFrame parentFrame = null;
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of savePreference method, of class HttpPreference.
	 */
	@Test
	public void testSavePreference() {
		System.out.println("savePreference");
		HttpAnalyzerView analyseView = null;
		JFrame parentFrame = null;
		String notes = "";
		HttpPreference instance = new HttpPreference();
		instance.savePreference(analyseView, parentFrame, notes);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// HttpPreference.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;

/**
 * @author vlad
 */
public class HttpPreference {

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     */
    public void savePreference(HttpAnalyzerView analyseView, JFrame parentFrame, String notes);

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     * @return String Notes
     */
    public String loadPreference(HttpAnalyzerView mainView, JFrame parentFrame);
}

// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
		
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	public void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = null;
		JFrame parentFrame = null;
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of savePreference method, of class HttpPreference.
	 */
	@Test
	public void testSavePreference() {
		System.out.println("savePreference");
		HttpAnalyzerView analyseView = null;
		JFrame parentFrame = null;
		String notes = "";
		HttpPreference instance = new HttpPreference();
		instance.savePreference(analyseView, parentFrame, notes);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// HttpPreference.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;

/**
 * @author vlad
 */
public class HttpPreference {

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     */
    public void savePreference(HttpAnalyzerView analyseView, JFrame parentFrame, String notes);

    /**
     * Get values from work form and set properties
     * Then call method FileUtil.savePreferenceToFile
     * @param mainView HttpAnalyzerView
     * @param parentFrame JFrame
     * @return String Notes
     */
    public String loadPreference(HttpAnalyzerView mainView, JFrame parentFrame);
}

// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
		
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	public void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = null;
		JFrame parentFrame = null;
		Http