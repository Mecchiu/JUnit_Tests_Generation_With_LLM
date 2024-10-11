// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains ten unit test cases for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {

		/**
		* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
		*/
		@Test
		void testAnalyze() {
				UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
				assertEquals("\nFile:  \nClass: CohesionTest\n\nMethod Name                             Cohesion Level\n--------------------------------------------------------------\ndeposit                                 Functional\nwithdraw                                Sequential\naddCD                                   Communicational\nformDet                                 Iterative\ncheckBookIn                             Conditional\nreadInput                               Coincidental\n", analyzer.analyze(null));
		}
}

// UILayoutDisplayAnalyzer.java
package com.soops.CEN4010.JMCA;

/**
 * <p>Title: Group 2 Project </p>
 *
 * <p>Class: CEN4010 Fall 2005</p>
 *
 * <p>Description: Description: UILayoutDisplayAnalyzer implements a dummy Analyzer
 *    use for UI layout  </p>
 *
 * <p>Instructor Dr. Stoeklin</p>
 *
 * @author Group 2
 */
public class UILayoutDisplayAnalyzer implements Analyzer {

    public String analyze(ASTNode dummy) {
        StringBuffer output = new StringBuffer();
        //FAKE OUTPUT FOR PROTOTYPE
        output = new StringBuffer("\nFile:  ");
        output.append(filename);
        output.append("\n");
        output.append("Class: CohesionTest\n\n");
        output.append("Method Name                             Cohesion Level\n");
        output.append("--------------------------------------------------------------\n");
        output.append("deposit                                 Functional\n");
        output.append("withdraw                                Sequential\n");
        output.append("addCD                                   Communicational\n");
        output.append("formDet                                 Iterative\n");
        output.append("checkBookIn                             Conditional\n");
        output.append("readInput                               Coincidental\n");
        return output.toString();
    }
}

// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains ten unit test cases for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {
		
		/**
		* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
		*/
		@Test
		void testAnalyze() {
				UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
				assertEquals("\nFile:  \nClass: CohesionTest\n\nMethod Name                             Cohesion Level\n--------------------------------------------------------------\ndeposit                                 Functional\nwithdraw                                Sequential\naddCD                                   Communicational\nformDet                                 Iterative\ncheckBookIn                             Conditional\nreadInput                               Coincidental\n", analyzer.analyze(null));
		}
}

// UILayoutDisplayAnalyzer.java
package com.soops.CEN4010.JMCA;

/**
 * <p>Title: Group 2 Project </p>
 *
 * <p>Class: CEN4010 Fall 2005</p>
 *
 * <p>Description: Description: UILayoutDisplayAnalyzer implements a dummy Analyzer
 *    use for UI layout  </p>
 *
 * <p>Instructor Dr. Stoeklin</p>
 *
 * @author Group 2
 */
public class UILayoutDisplayAnalyzer implements Analyzer {

    public String analyze(ASTNode dummy) {
        StringBuffer output = new StringBuffer();
        //FAKE OUTPUT FOR PROTOTYPE
        output = new StringBuffer("\nFile:  ");
        output.append(filename);
        output.append("\n");
        output.append("Class: CohesionTest\n\n");
        output.append("Method Name                             Cohesion Level\n");
        output.append("--------------------------------------------------------------\n");
        output.append("deposit                                 Functional\n");
        output.append("withdraw                                Sequential\n");
        output.append("addCD                                   Communicational\n");
        output.append("formDet                                 Iterative\n");
        output.append("checkBookIn                             Conditional\n");
        output.append("readInput                               Coincidental\n");
        return output.toString();
    }
}

// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains ten unit test cases for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {
		
		/**
		* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
		*/
		@Test
		void testAnalyze() {
				UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
				assertEquals("\nFile:  \nClass: CohesionTest\n\nMethod Name                             Cohesion Level\n--------------------------------------------------------------\ndeposit                                 Functional\nwithdraw                                Sequential\naddCD                                   Communicational\nformDet                                 Iterative\ncheckBookIn                             Conditional\nreadInput                               Coincidental\n", analyzer.analyze(null));
		}
}

// UILayoutDisplayAnalyzer.java
package com.soops.CEN4010.JMCA;

/**
 * <p>Title: Group 2 Project </p>
 *
 * <p>Class: CEN4010 Fall 2005</p>
 *
 * <p>Description: Description: UILayoutDisplayAnalyzer implements a dummy Analyzer
 *    use for UI layout  </p>
 *
 * <p>Instructor Dr. Stoeklin</p>
 *
 * @author Group 2
 */
public class UILayoutDisplayAnalyzer implements Analyzer {

    public String analyze(ASTNode dummy) {
        StringBuffer output = new StringBuffer();
        //FAKE OUTPUT FOR PROTOTYPE
        output = new StringBuffer("\nFile:  ");
        output.append(filename);
        output.append("\n");
        output.append("Class: CohesionTest\n\n");
        output.append("Method Name                             Cohesion Level\n");
        output.append("--------------------------------------------------------------\n");
        output.append("deposit                                 Functional\n");
        output.append("withdraw                                Sequential\n");
        output.append("addCD                                   Communicational\n");
        output.append("formDet                                 Iterative\n");
        output.append("checkBookIn                             Conditional\n");
        output.append("readInput                               Coincidental\n");
        return output.toString();
    }
}

// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains ten unit test cases for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {
		
		/**
		* Test case for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
		*/
		@Test
		void testAnalyze() {
				UILayout