// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {

  @Test
  public void testGetImage() {
    String image;

// SimpleCharStream['
output("'");
assertEquals( "''", SimpleCharStream.GetImage());
input("'/');");
assertEquals( "''", SimpleCharStream.GetImage());
input("'*');");
assertEquals( "''", SimpleCharStream.GetImage());
input("'\\u0022';");
assertEquals( "''", SimpleCharStream.GetImage());
input("'" );
assertEquals( "''", SimpleCharStream.GetImage());
input("'//');");
assertEquals( "''", SimpleCharStream.GetImage());
input("''");
assertEquals( "''", SimpleCharStream.GetImage());

input("'#');");	// note whitespace (\t)
assertEquals( "''", SimpleCharStream.GetImage());
input("'\''");
assertEquals( "''", SimpleCharStream.GetImage());
input("''");
assertEquals( "''", SimpleCharStream.GetImage());

input("'\"'");	// ignore backslashes
assertEquals( "", SimpleCharStream.GetImage());
input("'\'';");
assertEquals( "", SimpleCharStream.GetImage());
input("'\"\"");
input("&quot;");	// ignore backslashes
assertEquals( "&quot;", SimpleCharStream.GetImage());
input("'\"'''");
assertEquals( "", SimpleCharStream.GetImage());
input("'\"\"\"");
input("&#xD;");	// ignore horizontal whitespaces
assertEquals( "&#xD;", SimpleCharStream.GetImage());
input("'\"\"'");
assertEquals( "&#xD;", SimpleCharStream.GetImage());
input("\"\\u0192\"");	// ignore character in \r\n
assertEquals( "\"", SimpleCharStream.GetImage());
input("\"\\u0193\"");	// ignore character in \r\n
assertEquals( "\"", SimpleCharStream.GetImage());

input("'\\'';");	// ignore backslashes
assertEquals("'",SimpleCharStream.GetImage());
input("''");
assertEquals("",SimpleCharStream.GetImage());
input("''");

// SimpleCharStream.end()
output("'");

// SimpleCharStream.lookAhead()
output("'");
testlookAhead(1);
input("'");
assertEquals( "''", SimpleCharStream.GetImage());
input("'\''");

// SimpleCharStream.nextToken()
output("'");
testnextToken(2);
input("'");
assertEquals( "''", SimpleCharStream.GetImage());
input("'\''");

// SimpleCharStream.Unget()
input("'");
assertEquals( "''", SimpleCharStream.GetImage());
input("'\''");

// SimpleCharStream.seek()
output("'");
input("\"");	// need to accept a \
input("'" );
assertEquals( "''", SimpleCharStream.GetImage());
input("\"'");
assertEquals( "''", SimpleCharStream.GetImage());
input("\'\"");
assertEquals( "''", SimpleCharStream.GetImage());
input("\u1F01E");	// note that \r\n added by default
assertEquals( "''", SimpleCharStream.GetImage());
input("\u1F01E'", 1);
assertEquals( "''", SimpleCharStream.GetImage());
input("\u1F01E\"", 2);
assertEquals( "''", SimpleCharStream.GetImage());

test_failure("'", "U+0085"); // the only valid Unicode code point
test_failure("'", "U+FFFE");	// it's not a valid code page to start a stream
test_failure("\' \"", "U+02AD"); // should not be a valid Unicode code point
}
	
}