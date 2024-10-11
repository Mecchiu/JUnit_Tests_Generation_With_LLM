// XTreeUtil_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtil_0Test {
		@Test
		public void testParseXMLDocumentFromJar() throws Exception {
		    List<Element> rootElements=new ArrayList<>();
		    rootElements.add(XMLUtil_0.createRootElementTag(null, "root"));

		    List<Element> testElements=new ArrayList<>();
		    XMLUtil_0.createRootElementTag(testElements, "test");
		    XMLUtil_0.createTestElementTag(testElements, "test");

		    XTreeUtil.parseXML(new InputSource(new ClassPathResource("XTreeUtil_0Test.xml")), false, "http://junit.org/junit/xml/jaxp/properties/schemaSource/xs/schema1.xsd", new InputSource(new ClassPathResource("XTreeTestSchema.xsd")));

			assertEquals(testElements.size(), rootElements.size());
		}

}

//=======================================================================================
/*
*  Copyright 2009-2012 Tamas Korotman.
*  <p>
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*  <p>
*  http://www.apache.org/licenses/LICENSE-2.0
*  <p>
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*  <p>
*  Contributors:
*  <p>
*  Tamas Korotman
*  <p>
*  <a href="http://junit.org">
*  JUnit &gt; Release Candidate
*  </a>
*/