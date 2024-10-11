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
		
    @Test
    /**
     * test parsing using default configuration
    */

    public void parseDefaultConfiguration() {
        AstNode astNode = null;
        try {
            String path = JMCAParser.class.getResource("/test.xml").getPath();
            String fileName = toSystemIndependentName(path);
            Reader reader = new FileInputStream(fileName);
            astNode = read(reader);
            System.out.println("test case #1: Parsing Default configuration is finished!");
        } catch (IOException e) {
            System.err.println(e);
        } catch (ParseException e) {
            System.err.println(e);
        }
    }

    @Test
    public void testParsingFromJMCASource() {
        for (Source source : Source.getSources()) {
            if (source instanceof JMCASource) {
                ASTNode astNode = null;

                String sourcepath = null;
                if (source!= Source.UNDECIDED) {
                    sourcepath = getFilePathBySource(source);
                }
                if (sourcepath!= null) {
                    System.out.println("Test case #2: Parsing " + source + " using JMCAParser");
                    astNode = parse("src/test/unit/JParserTest/JMCAParser-" + source + ".xml");
                } else {
                    System.out.println("Source not found : #" + source);
                }
            }
        }
    }

    @Test
    public void testParsingFromJMCAContent() {
        for (Content content : Content.getContent()) {
            if (content!= null) {

                String contentFilepath = null;
                if (content.isMID()) {
                    contentFilepath = getFilePathByContent(content.getContent());
                } else if (content.isJavaDoc()) {
                    contentFilepath = toSystemIndependentName(content.getContent());
                }
                if (contentFilepath!= null) {
                    System.out.println("Test case #3: Parsing " + content.getContent() + " using JMCAParser");
                    astNode = parse("src/test/unit/JParserTest/JMCAParser.xml");
                } else {
                    System.out.println("Content not found : #" + content);
                }
            }
        }
    }

    /**
    * Parses a given file using specified configuration.
    * @param configName 
    * @return new ASTNode
    */
    AstNode read(File config) {
        assertTrue(config!= null);

        String path = config.getPath();
        File file = new File(path);

        // default file
        try {
            JavaParser parser = new JavaParser();
            Writer fileout = new FileWriter(file);
            SaxProcessor processor = new JavacProcessor(new FileInputStream(config));
            parser.parse(fileout, new Parser(), processor);
            return processor.getAST();
        } catch (ParseException ex) {
           System.err.println("JMCAError: ParseException " + ex);
        }
        return null;
    }

    String getFilePathBySource(Source source) {
        return toSystemIndependentName(source.toString());
    }

    String getFilePathByContent(Content content) {
        return toSystemIndependentName(content.getContent());
    }

    String toSystemIndependentName(String fileName) {
        return fileName.replace("\\", "/").replace("/", ".");
    }
}