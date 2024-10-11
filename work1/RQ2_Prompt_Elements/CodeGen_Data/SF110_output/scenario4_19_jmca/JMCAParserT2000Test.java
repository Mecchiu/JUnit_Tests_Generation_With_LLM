// JMCAParserTest.java
package com.soops.CEN4010.JMCA;

import java.io.Reader;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileInputStream;
import java.io.File;
import com.soops.CEN4010.JMCA.JParser.xmlParser.SaxProcessor;
import com.soops.CEN4010.JMCA.JParser.ParseException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAParser}.
* It contains one unit test case for the {@link JMCAParser#parse(Reader)} method.
*/
class JMCAParserTest {
String testString =
			"<?xml version=\"1.0\" encoding=\"utf-8\" encoding=\"UTF-8\"?>"
			+ "<env:Env>" //$NON-NLS-1$
				+   "<env:Environ>"
				+  "<env:EnvironPref><env:CEN4010/CEN4010_01/pref1/pref2/Pref1></env:EnvironPref>"
				+  "<env:EnvironPref><env:CEN4010/CEN4010_01/pref2/Pref2></env:EnvironPref>"
				+  "<env:EnvironPref><env:CEN4010/CEN4010_01/pref1/pref3></env:EnvironPref>"//$NON-NLS-1$
				+  "</env:Environ>"
				+  "<env:EnvironPref></env:EnvironPref>"
				+  //$NON-NLS-1$
				+  "<env:EnvironPref><env:CEN4010/CEN4010_01/pref1/pref2/Pref3></env:EnvironPref>"
				+  "<env:EnvironPref><env:CEN4010/CEN4010_01/pref2/Pref2></env:EnvironPref>"
				+  "<env:EnvironPref><env:CEN4010/CEN4010_01/pref1/pref4></env:EnvironPref>"
				+  "<env:EnvironPref><env:CEN4010/CEN4010_01/pref2/Pref4></env:EnvironPref>"
				+  "</env:Environ>"
				+  "</env:Envv>"
			+  "</env:Env>"

			+ "   <env:Envs>"
			+  "   <env:EnvsPref><env:CEN4010/CEN4010_01/pref1/envs4></env:EnvsPref>"
			+  "   <env:EnvsPref><env:CEN4010/CEN4010_01/pref1/envs4/ENV4>1</env:EnvsPref>"
			+  "</env:Envs>"
			+  "<env:EnvsPref></env:EnvsPref>"
			+  "</env:Envs>";

    @Test
    void test() throws IOException, ParseException {
        JavaParser parser = new JavaParser();
        String intermediateFile = "test.xml";
		ASTNode tree = parser.parse(new StreamBasedInputStream(new FileInputStream(new File(intermediateFile))), null);
        ASTNode root = parser.getASTProcessor().getAST();
        parser.getASTProcessor());
        assertNotNull(root);
        assertTrue(tree.getType() == root.getType() && tree.toString().equals("Test"));
    }

	Reader getReader(String file) throws IOException {
        FileInputStream fis = new FileInputStream(new File(file));
		Reader reader = new StreamBasedInputStream(fis, fis.available());
        return reader;
    }
}