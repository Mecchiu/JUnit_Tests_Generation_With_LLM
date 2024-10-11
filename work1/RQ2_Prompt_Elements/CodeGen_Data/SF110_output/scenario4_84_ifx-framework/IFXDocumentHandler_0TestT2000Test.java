// IFXDocumentHandler_0Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains one unit test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_0Test {
TestIFXDocumentHandlerTestCase testcase = new TestIFXDocumentHandlerTestCase();

    @Test
    void test_build() throws Exception {
		final Document test1 = build( testcase.test1);

		testcase.verifyBuilding("test1");

    	testcase.verifySaving("test1", test1);
    	testcase.verifyReading("test1", test1);
    }

    @Test
    void test_read() throws Exception {
		final Document test1 = testcase.test1;

		testcase.verifyReading(test1);

    	testcase.verifyEvaluate("test1");
		testcase.verifyReading(test1);

    	testcase.verifyEvaluate("test1");
    	testcase.verifyReading("test1");

		testcase.verifyEvaluate("test1");
    	testcase.verifyWriting("test1", test1);
    }

    @Test
    void test_parse() throws Exception {
		final Document test1 = testcase.test1;

		final Document test2 = build( test1);

		final Document test3 = parse(test2);

		testcase.verifyParsing("test3", test3);

    	testcase.verifyEvaluate("test3");
		testcase.verifyReading("test3");
    }

    @Test
    void test_validate() throws Exception {
		final Document test1 = testcase.test1;

		final Document test2 = build( test1, "test2.xml", "test3.xml");

		test3 = parse(test2);

		testcase.verifyValidation("test3", test3, null);

    	testcase.verifyEvaluate("test3");
		testcase.verifyReading("test3");
    }

    // TODO Add tests for other classes.
}

static class TestIFXDocumentHandlerTestCase {

        Element test;

		public void test1() throws Exception {
			test = build("<doc>foobar</doc>", "schema.xsd", "ns1").getRootElement();
			final Element e = build("<doc>foobar</doc>", "schema.xsd", "ns1").getRootElement();
			parse(e);
		}

		public void test2() throws Exception {
			test = build("<doc>foobar</doc>", "schema.xsd", "ns1").getRootElement();
			final Document d = parse(test);
			assertNull(d.getRootElement());
		}

        public void test3() throws Exception {
		Document d = build("<doc>foobar</doc>", "schema.xsd", "ns1").getRootElement();
		parse(d);
		Document d1 = parse(build("<doc>foobar</doc>", "schema.xsd", "ns1").getRootElement());
		assertNotSame(d, d1);
		assertNotSame(d1, d);
		assertNotSame(d1.getRootElement(), d);
		}

        public void test4() throws Exception {
			InputStream istream = IFXDocumentHandler_0Test.class.getResourceAsStream("Test5.xml");
			Document test5 = build( istream, false);

			test5 = parse( test5 );
			Element test6 = parse(test5).getRootElement();
            Document test7 = parse(test6);

			test5 = parse( test6 );
			assertSame(test5, test7);
		}

	}


}
