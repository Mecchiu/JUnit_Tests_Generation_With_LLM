// JMCAAnalyzerTest.java
package com.soops.CEN4010.JMCA;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAAnalyzer}.
* It contains one unit test case for the {@link JMCAAnalyzer#analyze(ASTNode)} method.
*/
class JMCAAnalyzerTest {
//  Test class parameters
    @Test
    final private static String testFilePath = "/testCaseFilePath/";
    @Test
    final private static String testName = "JMCAanalyzerTest";
    boolean errorOccurred;

    //  Test class main execution

    public static void main(String args[]) {
		(TestclassJMCAApp.main(args));
	}

//=======================================================================

    @Test
    void testHeaderCheck() {
        if (((TestclassJMCAApp)TestclassJMCAApp.instance()).getErrorOccurred())
            output.append("ERROR ON HEADER FIELD INDEX: " + testClassName + ".");
        else
            output.append("OK");
        output.append(testName);
    }

	// Test execute() method --------------------------------

    private void setHeader()
    {

        try {
            //  System.out.println("===============================================");
            //  System.out.println("*** Class name: " + testClassName);
            //  System.out.println("*** Test case path: " + testFilePath);
            //  System.out.println("*** Class: " + getClass());
            //  System.out.println(" *** " + getClass().getClassLoader());

            testClassName = getClass().getName();
            testFilePath = testClassName.substring(0, testClassName.length() - (testName.length() + 1)).replace('/', '_');
            //  testCaseFilePath = testFilePath.substring(0, testFilePath.indexOf(testName));
        }
        catch (Exception pe)
            {
                output.append(((TestclassJMCAApp)TestclassJMCAApp.instance()).getErrorMessage() + '\n' + pe);
                errorOccurred = true;
            }
        catch (ArrayIndexOutOfBoundsException pe)
            {
                output.append("Class or method name index out of range (0-length). : " + pe);
                errorOccurred = true;
                errorOccurred = true;
            }
        catch (IllegalArgumentException ppe)
            {
                output.append(((TestclassJMCAApp)TestclassJMCAApp.instance()).getErrorMessage() + '\n' + ppe);
                errorOccurred = true;
            }
        try{
            testCaseName = testName;
        }
        catch (Exception pe)
            {
                output.append(((TestclassJMCAApp)TestclassJMCAApp.instance()).getErrorMessage() + '\n' + pe);
            }
    }

    //  Test class run() --------------------------------

    @Test
    void testRun() {
        String testMethodInput = "TestmethodInput";
        String testClassInput = testMethodInput + "()";
        String testFileInput = testClassInput + testMethodInput;
        String testTestOutput = "Test output";

        //  System.out.println("===============================================");
        //  System.out.println("Test Class Name: " + testClassName);
        //  System.out.println("Test Case path: " + testFilePath);

        testClassName = testClassName.replace('/', '_');
        testFilePath = testFilePath.replace('/', '_');

        testTestOutput = testTestOutput + testClassName;
        testTestOutput = testTestOutput.replace("Test class for "+  testClassName, testClassInput);
        testTestOutput = testTestOutput.replace("Test method for "+ testMethodInput, testMethodInput);
        testTestOutput = testTestOutput.replace("File path of test class :" + testClassName, testFilePath);
        testTestOutput = testTestOutput.replace("Test class name :" + testClassName, testClassInput.replace('.', '/'));
        testTestOutput = testTestOutput.replace("Test: " + testClassName, testCaseName);

        //  System.out.println("===============================================");

        //  System.out.println("Test Test Output: " + testTestOutput);

        output = "Running testcase:\n\tTest Class Name:    " + testClassName;
        output = output + "\n\tTest Test Name:      " + testCaseName;
        output = output + "\n\tTest Class Input:    " + testClassInput;
        output = output + "\n\tTest Class Output:   " + testTestOutput;

        //  System.out.println("Output:\n\t" + output + "\n\t" + (errorOccurred? ": OK" : ": Error"));

        if (errorOccurred)
          output.append("\n\tError in test case:  ");
        else
          output.append("OK\n\t");

//       System.out.println("Output:\n\t" + output + "\n\t" + (errorOccurred? "\n\tERROR" : "\n\tOK"));
    }

	// Test class run - Class/method
        // Test class run - Test method
}