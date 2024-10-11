// IFXEncoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.Writer;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.output.XMLOutputter;
import org.jdom.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXEncoder}.
* It contains one unit test case for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {

    /** The resourceBundle. */
    private static ResourceBundle res = ResourceBundle.getBundle("org.sourceforge.ifx.utils");


    /**
     * Test the {@link IFXEncoder#encode(IFXObject)} method.
     */
    @Test
    void testEncode() throws IOException, MissingResourceException, IllegalAccessException {
        IFXObject obj = new IFXObject();

        XMLOutputter xmlout = new XMLOutputter();
        Writer out = obj.getOutputStream("/testEncoding/test_encoding_3.xml");
//        out = obj.getOutputStream("/testEncoding/test_encoding_4.xml");
        xmlout.setOmitXMLDeclaration(true);
        xmlout.setFormatForStructure(false);
        xmlout.output(out,null);
        assertEquals("test_encoding_3.xml", obj.toString("UTF-8"));

        XMLEmitter xmlemitter = new XMLEmitter();
        XMLOutputter output = xmlemitter.createOutputter("UTF-8");
        output.setIndentSize(4);
        ArrayList<IFXClass> list = new ArrayList<IFXClass>();
        XMLBuilder xml = new XMLBuilder(list);
        xml.setIndentSize(4);
        xml.build(res.getString("/testEncoding/test_encoding_3.xml"), obj);
        String xml_string = convertOutput(xml);
//        String xml_string = obj.toString("UTF-8");
        assertEquals("test_encoding_3.xml", xml_string);
        assertEquals("UTF-8", xmlemitter.getXMLVersion());
        setLocale(xml);
    }

    private void setLocale(XMLEmitter xml){
        XMLBuilder builder = new XMLBuilder();
        builder.add(new LocaleData("en"),"",builder);
        xml.add(builder);
    }

	/**
     * @throws Exception
     */
    @Test
    void testEncodeXmlNamespace() throws Exception {

        String name = "xml_namespace_1";
        IFXObject obj = new IFXObject();
//        obj.setName(name);
        obj.setName(res.getString("/xml_namespace/tag:tag.xml"));
//        obj.setName("xml_namespace_3");
        obj.getXMLNamespace().setBundle("urn:xxx");

        XMLOutputter xmlout = new XMLOutputter();
        Writer out = obj.getOutputStream("/xml/out/out.xml");
//        out = obj.getOutputStream("/xml/out/out.xml");
        xmlout.setOmitXMLDeclaration(true);
        xmlout.setFormatForStructure(false);
        xmlout.output(out, null);
        String xml_string = convertOutput(obj);

        int index = xml_string.indexOf("xmlns:" + name) + name.length();
        int last_index = 0;
        while (index >= 0) {
            if (index > last_index) {
                assertTrue(index <= xml_string.length());
            }
            index = xml_string.indexOf("xmlns:" + name, index);
            assertEquals(0, xml_string.indexOf("?", index));
            last_index = index + name.length();
            index = name.indexOf("xmlns:" + name, index);
            assertEquals(0, index);
            index = name.indexOf(">", index);
            assertEquals('"', xml_string.charAt(index - 1));
            System.out.println(xml_string.substring(index, out.size()));
            index = out.size();
            out.write(xml_string.substring(index));
            out.write("\n");
            index = xml_string.indexOf(">", index + 1);
            assertTrue(index >= 0);
        }

    }
}
