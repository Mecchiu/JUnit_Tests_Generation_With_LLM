// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {

	private static final Logger logger = Logger.getLogger(QSAdminAPITest.class.getName());
	
	private static final String HOST = "localhost";
	private static final int PORT = 9877;
	private static final String USERNAME = "Admin";
	private static final String PASSWORD = "QsAdm1n";
	
	private static final String BAD_USERNAME = "BadAdmin";
	private static final String BAD_PASSWORD = "BadQsAdm1n";
	
	private static final String BAD_HOST = "badhost";
	private static final int BAD_PORT = 9876;
	
	private static final String BAD_COMMAND = "badcommand";
	
	private static final String GOOD_COMMAND = "info server";
	
	private static final String GOOD_RESPONSE = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE = "Bad Response";
	
	private static final String GOOD_RESPONSE_PREFIX = "QSAdminServer";
	
	private static final String BAD_RESPONSE_PREFIX = "Bad Response";
	
	private static final String GOOD_RESPONSE_SUFFIX = "v1.4.0";
	
	private static final String BAD_RESPONSE_SUFFIX = "Bad Response";
	
	private static final String GOOD_RESPONSE_CONTAINS = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_CONTAINS = "Bad Response";
	
	private static final String GOOD_RESPONSE_MATCHES = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_MATCHES = "Bad Response";
	
	private static final String GOOD_RESPONSE_STARTS_WITH = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_STARTS_WITH = "Bad Response";
	
	private static final String GOOD_RESPONSE_ENDS_WITH = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_ENDS_WITH = "Bad Response";
	
	private static final String GOOD_RESPONSE_EQUALS = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_EQUALS = "Bad Response";
	
	private static final String GOOD_RESPONSE_EQUALS_IGNORE_CASE = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_EQUALS_IGNORE_CASE = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_EMPTY = "";
	
	private static final String BAD_RESPONSE_IS_EMPTY = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_NULL = null;
	
	private static final String BAD_RESPONSE_IS_NULL = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_NOT_EMPTY = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_NOT_EMPTY = "";
	
	private static final String GOOD_RESPONSE_IS_NOT_NULL = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_NOT_NULL = null;
	
	private static final String GOOD_RESPONSE_IS_BLANK = "";
	
	private static final String BAD_RESPONSE_IS_BLANK = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_NOT_BLANK = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_NOT_BLANK = "";
	
	private static final String GOOD_RESPONSE_IS_ALL_LOWER_CASE = "qsadminserver v1.4.0";
	
	private static final String BAD_RESPONSE_IS_ALL_LOWER_CASE = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_ALL_UPPER_CASE = "QSADMINSERVER V1.4.0";
	
	private static final String BAD_RESPONSE_IS_ALL_UPPER_CASE = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_ALPHA = "QSAdminServerv";
	
	private static final String BAD_RESPONSE_IS_ALPHA = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_ALPHANUMERIC = "QSAdminServerv";
	
	private static final String BAD_RESPONSE_IS_ALPHANUMERIC = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_ASCII_PRINTABLE = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_ASCII_PRINTABLE = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_BASE64 = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_BASE64 = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_BLANK_SPACE = " ";
	
	private static final String BAD_RESPONSE_IS_BLANK_SPACE = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_DECIMAL_NUMBER = "1.4.0";
	
	private static final String BAD_RESPONSE_IS_DECIMAL_NUMBER = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_DIGITS = "140";
	
	private static final String BAD_RESPONSE_IS_DIGITS = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_EMAIL = "qsadmin@quickserver.org";
	
	private static final String BAD_RESPONSE_IS_EMAIL = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_HEXADECIMAL = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_HEXADECIMAL = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_ISO_CONTROL = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_ISO_CONTROL = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_JAVA_IDENTIFIER = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_JAVA_IDENTIFIER = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_JAVA_IDENTIFIER_START = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_JAVA_IDENTIFIER_START = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_JAVA_IDENTIFIER_PART = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_JAVA_IDENTIFIER_PART = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_LOWER_CASE = "qsadminserver v1.4.0";
	
	private static final String BAD_RESPONSE_IS_LOWER_CASE = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_NUMERIC = "140";
	
	private static final String BAD_RESPONSE_IS_NUMERIC = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_UPPER_CASE = "QSADMINSERVER V1.4.0";
	
	private static final String BAD_RESPONSE_IS_UPPER_CASE = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_WHITESPACE = " ";
	
	private static final String BAD_RESPONSE_IS_WHITESPACE = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_START = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_START = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_END = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_END = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER_DIGIT = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER_DIGIT = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER_DIGIT_NAME_CHAR = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER_DIGIT_NAME_CHAR = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER_DIGIT_NAME_CHAR_NAME_START_CHAR = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER_DIGIT_NAME_CHAR_NAME_START_CHAR = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER_DIGIT_NAME_CHAR_NAME_START_CHAR_NAME_CHAR = "QSAdminServer v1.4.0";
	
	private static final String BAD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER_DIGIT_NAME_CHAR_NAME_START_CHAR_NAME_CHAR = "Bad Response";
	
	private static final String GOOD_RESPONSE_IS_XML_NAME_PART_START_END_DASH_DOT_UNDERSCORE_COLON_COMBINING_CHAR_EXTENDER_LETTER_DIGIT_NAME_CHAR_NAME_START_CHAR_NAME_CHAR_NAME_START_CHAR = "QSAdminServer v1.4.0";
	
	private static