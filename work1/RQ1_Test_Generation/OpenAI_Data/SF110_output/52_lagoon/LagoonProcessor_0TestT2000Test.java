// LagoonProcessor_0Test.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains ten unit test cases for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessor_0Test {

		private static final String SITEMAP_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<Sitemap>\n" +
				"  <SiteName>Test</SiteName>\n" +
				"  <SourceDir>src/test/resources/nu/staldal/lagoon/core/</SourceDir>\n" +
				"  <TargetDir>target/test-output/nu/staldal/lagoon/core/</TargetDir>\n" +
				"  <Entry>\n" +
				"    <Source>index.html</Source>\n" +
				"    <Target>index.html</Target>\n" +
				"    <Format>html</Format>\n" +
				"  </Entry>\n" +
				"  <Entry>\n" +
				"    <Source>index.xml</Source>\n" +
				"    <Target>index.xml</Target>\n" +
				"    <Format>xml</Format>\n" +
				"  </Entry>\n" +
				"  <Entry>\n" +
				"    <Source>index.xsp</Source>\n" +
				"    <Target>index.xml</Target>\n" +
				"    <Format>xml</Format>\n" +
				"    <Process>\n" +
				"      <XSP>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSP>\n" +
				"    </Process>\n" +
				"  </Entry>\n" +
				"  <Entry>\n" +
				"    <Source>index.xsp</Source>\n" +
				"    <Target>index.html</Target>\n" +
				"    <Format>html</Format>\n" +
				"    <Process>\n" +
				"      <XSP>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSP>\n" +
				"      <XSLT>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSLT>\n" +
				"    </Process>\n" +
				"  </Entry>\n" +
				"  <Entry>\n" +
				"    <Source>index.xsp</Source>\n" +
				"    <Target>index.html</Target>\n" +
				"    <Format>html</Format>\n" +
				"    <Process>\n" +
				"      <XSP>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSP>\n" +
				"      <XSLT>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSLT>\n" +
				"    </Process>\n" +
				"  </Entry>\n" +
				"  <Entry>\n" +
				"    <Source>index.xsp</Source>\n" +
				"    <Target>index.html</Target>\n" +
				"    <Format>html</Format>\n" +
				"    <Process>\n" +
				"      <XSP>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSP>\n" +
				"      <XSLT>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSLT>\n" +
				"    </Process>\n" +
				"  </Entry>\n" +
				"  <Entry>\n" +
				"    <Source>index.xsp</Source>\n" +
				"    <Target>index.html</Target>\n" +
				"    <Format>html</Format>\n" +
				"    <Process>\n" +
				"      <XSP>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSP>\n" +
				"      <XSLT>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSLT>\n" +
				"    </Process>\n" +
				"  </Entry>\n" +
				"  <Entry>\n" +
				"    <Source>index.xsp</Source>\n" +
				"    <Target>index.html</Target>\n" +
				"    <Format>html</Format>\n" +
				"    <Process>\n" +
				"      <XSP>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSP>\n" +
				"      <XSLT>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSLT>\n" +
				"    </Process>\n" +
				"  </Entry>\n" +
				"  <Entry>\n" +
				"    <Source>index.xsp</Source>\n" +
				"    <Target>index.html</Target>\n" +
				"    <Format>html</Format>\n" +
				"    <Process>\n" +
				"      <XSP>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSP>\n" +
				"      <XSLT>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSLT>\n" +
				"    </Process>\n" +
				"  </Entry>\n" +
				"  <Entry>\n" +
				"    <Source>index.xsp</Source>\n" +
				"    <Target>index.html</Target>\n" +
				"    <Format>html</Format>\n" +
				"    <Process>\n" +
				"      <XSP>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSP>\n" +
				"      <XSLT>\n" +
				"        <Param name=\"foo\">bar</Param>\n" +
				"      </XSLT>\n" +
				"    </Process>\n" +