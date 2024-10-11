// ContourGeneratorTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourGenerator}.
* It contains one unit test case for the {@link ContourGenerator#done()} method.
*/
class ContourGeneratorTest {
		/**
		 * The name of the class to test
		 */
		static final String className = ContourGeneratorTest.class.getName();
		/**
		 * 
		 */
		public ContourGeneratorTest() {
			// Nothing to test here
		}
       /** @throws Exception if at least one test fails
		 */
    @Test
    void test1() throws Exception {
			// Verify that contour generation is done
			boolean result = ContourGenerator.done();
			assertTrue("Should be done", result);

			// Verify that the generator produces valid result
			result = true;
			Iterator<Node> i = ModelGenerator.listNodes(className);
			int maxIter = 10;
			int iterDepth = 0;
			List<Double> errors = new ArrayList<>();
			double maxError = 0;

			while (i.hasNext() && result) {
				Element e = i.next();
				maxIter = 10;
				iterDepth++;
				model = ModelGenerator.makeInstance(className, e);
				errors.clear();
				errors.add(0d);
				try {
					model.check();
				} catch (Exception ee) {
					result = false;
					for (int i = 0; i < errors.size(); i++) {
						double error = 0;
						double t = 1d/Max;
						for (int j = t; j <= ee.getCause() * 2; j += t)
							error += j;
						error /= t;
						errors.add(error);
					}
					System.err.println(ee.getCode() + " "+ee.getMessage());
				}
				System.err.println("iter: "+iterDepth+" / maxIter: "+maxIter+" / errors: "+errors.size());
				result = (errors.size() == 0 || errors.size() <= maxError);
			}

			assertTrue("Should not be done!"+result, result);
			// Verify that the generator produces valid result
			result = true;
			i = ModelGenerator.listNodes(className);
			iterDepth = 0;
			i = ModelGenerator.listNodes(className);
			iterDepth = 0;
			errors = new ArrayList<>();

			while (i.hasNext() && result) {
				Element e = i.next();
				maxIter = 10;
				iterDepth++;
				model = ModelGenerator.makeInstance(className, e);
				errors.clear();
				errors.add(0d);
				try {
					model.check();
				} catch (Exception ee) {
					result = false;
					for (int i = 0; i < errors.size(); i++) {
						double error = 0;
						double t = 1d/Max;
						for (int j = t; j <= ee.getCause() * 2; j += t)
							error += j;
						error /= t;
						errors.add(error);
					}
					System.err.println(ee.getCode() + " "+ee.getMessage());
				}
				System.err.println("iter: "+iterDepth+" / maxIter: "+maxIter+" / errors: "+errors.size());
				result = (errors.size() == 0 || errors.size() <= maxError);
			}

			assertTrue("Should not be done!"+result, result);
		}
    /** @throws Exception if at least one test fails
	 */
	@Test
    void test2() throws Exception {
      		// Verify that contour generation is done
		boolean result = ContourGenerator.done();
		assertTrue("Should be done", result);

      String [] args = {};
      if (System.getProperty("os.name").toLowerCase().contains("windows"))
	      System.setProperty("os.name", "windows");//$NON-NLS-1$ //$NON-NLS-2$
		try {
				// Now it's a bit more difficult to get the result of the test that takes place below and check it at all.
				// So we have to use the command line arguments of this program, and the class name below.
				Result result = new Result(className+" "+ContourGeneratorTest.class.getName());
				result.addTestCaseWithArguments(className+" "+ContourGeneratorTest.class.getName(),
				     "ContourGeneratorTest.java", args);
				result.addTestCaseWithArguments(className+" "+ContourGeneratorTest.class.getSimpleName(),
				     "ContourGeneratorTest.java", args);
				result.runAndPrint();

				assertTrue(true);
		} finally {
			// Now we can proceed to tests that take place above...
			System.setProperty("os.name", "windows"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}
    }