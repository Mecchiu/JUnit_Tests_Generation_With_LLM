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
import javax.xml.transform.dom.DOMSource;
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
import net.sf.xisemele.exception.InvalidValueException;
import net.sf.xisemele.exception.XisemeleIOException;
import net.sf.xisemele.exception.XisemeleRuntimeException;
import net.sf.xisemele.exception.XisemeleSerializationException;
import net.sf.xisemele.exception.XisemeleValidationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * Implementação de {@link Xisemele}.
 * 
 * @author Carlos Eduardo Coral.
 */
class XisemeleImpl implements Xisemele {

    /**
     * Instância de {@link Factory} que será utilizada para criar instâncias de objetos.
     */
    private final Factory factory;
    
    /**
     * Instância de {@link FormatterProvider} que será utilizada para obter instâncias de {@link Formatter}.
     */
    private final FormatterProvider formatterProvider;
    
    /**
     * Cria uma nova instância de {@link XisemeleImpl}.
     * 
     * @param factory
     *        instância de {@link Factory} que será utilizada para criar instâncias de objetos.
     * @param formatterProvider
     *        instância de {@link FormatterProvider} que será utilizada para obter instâncias de {@link Formatter}.
     */
    XisemeleImpl(final Factory factory, final FormatterProvider formatterProvider) {
        this.factory = factory;
        this.formatterProvider = formatterProvider;
    }
    
    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name) {
        return create(name, null);
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final String value) {
        return create(name, value, null);
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final String value, final String formatter) {
        try {
            return factory.createXisemele(name, value, formatter);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value) {
        return create(name, value, null);
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final String formatter) {
        try {
            return factory.createXisemele(name, value, formatter);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type) {
        return create(name, value, type, null);
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter) {
        try {
            return factory.createXisemele(name, value, type, formatter);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset, encoding);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding, final String version) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset, encoding, version);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding, final String version, final String standalone) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset, encoding, version, standalone);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding, final String version, final String standalone, final String indent) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset, encoding, version, standalone, indent);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding, final String version, final String standalone, final String indent, final String omitXmlDeclaration) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset, encoding, version, standalone, indent, omitXmlDeclaration);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding, final String version, final String standalone, final String indent, final String omitXmlDeclaration, final String omitXmlDeclarationNewLine) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset, encoding, version, standalone, indent, omitXmlDeclaration, omitXmlDeclarationNewLine);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding, final String version, final String standalone, final String indent, final String omitXmlDeclaration, final String omitXmlDeclarationNewLine, final String omitXmlDeclarationStandalone) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset, encoding, version, standalone, indent, omitXmlDeclaration, omitXmlDeclarationNewLine, omitXmlDeclarationStandalone);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding, final String version, final String standalone, final String indent, final String omitXmlDeclaration, final String omitXmlDeclarationNewLine, final String omitXmlDeclarationStandalone, final String omitXmlDeclarationStandaloneNewLine) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset, encoding, version, standalone, indent, omitXmlDeclaration, omitXmlDeclarationNewLine, omitXmlDeclarationStandalone, omitXmlDeclarationStandaloneNewLine);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding, final String version, final String standalone, final String indent, final String omitXmlDeclaration, final String omitXmlDeclarationNewLine, final String omitXmlDeclarationStandalone, final String omitXmlDeclarationStandaloneNewLine, final String omitXmlDeclarationStandaloneNewLineBefore) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset, encoding, version, standalone, indent, omitXmlDeclaration, omitXmlDeclarationNewLine, omitXmlDeclarationStandalone, omitXmlDeclarationStandaloneNewLine, omitXmlDeclarationStandaloneNewLineBefore);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding, final String version, final String standalone, final String indent, final String omitXmlDeclaration, final String omitXmlDeclarationNewLine, final String omitXmlDeclarationStandalone, final String omitXmlDeclarationStandaloneNewLine, final String omitXmlDeclarationStandaloneNewLineBefore, final String omitXmlDeclarationStandaloneNewLineAfter) {
        try {
            return factory.createXisemele(name, value, type, formatter, pattern, timezone, locale, charset, encoding, version, standalone, indent, omitXmlDeclaration, omitXmlDeclarationNewLine, omitXmlDeclarationStandalone, omitXmlDeclarationStandaloneNewLine, omitXmlDeclarationStandaloneNewLineBefore, omitXmlDeclarationStandaloneNewLineAfter);
        } catch (XisemeleRuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new XisemeleRuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public Xisemele create(final String name, final Object value, final Class<?> type, final String formatter, final String pattern, final String timezone, final String locale, final String charset, final String encoding, final String version, final String standalone, final String indent, final String omitXmlDeclaration, final String omitXmlDeclarationNewLine, final String omitXmlDeclarationStandalone, final String omitXmlDeclarationSt