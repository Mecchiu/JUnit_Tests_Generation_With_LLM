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
	void constructors() {
		Test case = new JMCAParser();
		assertNotNull(case.getParser());
		assertNotNull(case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_NULL", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_COMMA", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_SQUAREN", 1, 2, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCENT", 1, 2, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED1", 4, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED2", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED3", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED4", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED5", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED6", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED7", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED8", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED9", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED10", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED11", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED12", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED13", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED14", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED15", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED16", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED17", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_TOKENS", 1, 2, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCENT", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED1", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED2", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED3", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED4", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED5", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED6", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED7", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED8", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED9", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED10", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED11", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED12", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED13", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED14", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED15", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED16", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_TOKENS", 1, 2, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_TOK_PERCED1", 1, 1, 1), case.getParser().getNextToken());
		assertEquals(new Token(null, "TOKEN_