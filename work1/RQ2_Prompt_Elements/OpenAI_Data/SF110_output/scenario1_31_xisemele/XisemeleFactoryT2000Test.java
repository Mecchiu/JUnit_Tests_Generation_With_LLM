// XisemeleFactoryTest.java
package net.sf.xisemele.impl;

import net.sf.xisemele.api.Xisemele;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XisemeleFactory}.
* It contains ten unit test cases for the {@link XisemeleFactory#newXisemele()} method.
*/
class XisemeleFactoryTest {

	@Test
	void testNewXisemele() {
		Xisemele xisemele = XisemeleFactory.newXisemele();
		assertNotNull(xisemele);
	}
}

// XisemeleImpl.java
package net.sf.xisemele.impl;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import net.sf.xisemele.api.Attribute;
import net.sf.xisemele.api.Element;
import net.sf.xisemele.api.Formatter;
import net.sf.xisemele.api.FormatterProvider;
import net.sf.xisemele.api.Xisemele;
import net.sf.xisemele.exception.AttributeNotFoundException;
import net.sf.xisemele.exception.ElementNotFoundException;
import net.sf.xisemele.exception.FormatterNotFoundException;
import net.sf.xisemele.exception.InvalidNameException;
import net.sf.xisemele.exception.XisemeleIOException;
import net.sf.xisemele.exception.XisemeleRuntimeException;
import net.sf.xisemele.exception.XisemeleSerializationException;
import net.sf.xisemele.exception.XisemeleValidationException;
import net.sf.xisemele.exception.XmlParserNotFoundException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 * Implementação de {@link Xisemele}.
 * 
 * @author Carlos Eduardo Coral.
 */
class XisemeleImpl implements Xisemele {

    /**
     * Instância de {@link Factory} que será utilizada para criar instâncias de objetos necessários para a execução das operações de {@link Xisemele}.
     */
    private final Factory factory;
    /**
     * Instância de {@link FormatterProvider} que será utilizada para obter instâncias de {@link Formatter}.
     */
    private final FormatterProvider formatterProvider;
    /**
     * Instância de {@link XisemeleContext} que será utilizada para armazenar informações necessárias para a execução das operações de {@link Xisemele}.
     */
    private final XisemeleContext context;

    /**
     * Cria uma nova instância de {@link XisemeleImpl}.
     * 
     * @param factory
     *        instância de {@link Factory} que será utilizada para criar instâncias de objetos necessários para a execução das operações de {@link Xisemele}.
     * @param formatterProvider
     *        instância de {@link FormatterProvider} que será utilizada para obter instâncias de {@link Formatter}.
     */
    XisemeleImpl(final Factory factory, final FormatterProvider formatterProvider) {
        this.factory = factory;
        this.formatterProvider = formatterProvider;
        context = factory.createXisemeleContext();
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String xml) {
        try {
            context.setDocument(factory.createXmlParser().parse(new StringReader(xml)));
            return this;
        } catch (XmlParserNotFoundException e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final File file) {
        try {
            context.setDocument(factory.createXmlParser().parse(file));
            return this;
        } catch (XmlParserNotFoundException e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final InputStream inputStream) {
        try {
            context.setDocument(factory.createXmlParser().parse(inputStream));
            return this;
        } catch (XmlParserNotFoundException e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final Reader reader) {
        try {
            context.setDocument(factory.createXmlParser().parse(reader));
            return this;
        } catch (XmlParserNotFoundException e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final Source source) {
        try {
            context.setDocument(factory.createXmlParser().parse(source));
            return this;
        } catch (XmlParserNotFoundException e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final InputSource inputSource) {
        try {
            context.setDocument(factory.createXmlParser().parse(inputSource));
            return this;
        } catch (XmlParserNotFoundException e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final Document document) {
        context.setDocument(document);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final Element element) {
        context.setDocument(factory.createXmlParser().parse(new StreamSource(new StringReader(element.asString()))));
        return this;
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String rootName, final String... rootAttributes) {
        try {
            context.setDocument(factory.createXmlParser().createDocument(rootName, rootAttributes));
            return this;
        } catch (XmlParserNotFoundException e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String rootName, final List<Attribute> rootAttributes) {
        try {
            context.setDocument(factory.createXmlParser().createDocument(rootName, rootAttributes));
            return this;
        } catch (XmlParserNotFoundException e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String rootName, final String rootAttributeName, final String rootAttributeValue) {
        try {
            context.setDocument(factory.createXmlParser().createDocument(rootName, rootAttributeName, rootAttributeValue));
            return this;
        } catch (XmlParserNotFoundException e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String rootName, final Attribute rootAttribute) {
        try {
            context.setDocument(factory.createXmlParser().createDocument(rootName, rootAttribute));
            return this;
        } catch (XmlParserNotFoundException e) {
            throw new XisemeleRuntimeException(e);
        }
    }