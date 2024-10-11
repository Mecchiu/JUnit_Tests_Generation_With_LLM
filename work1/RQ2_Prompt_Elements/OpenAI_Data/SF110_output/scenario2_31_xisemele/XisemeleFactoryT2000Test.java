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

	/**
	* Test case for {@link XisemeleFactory#newXisemele()} method.
	* It tests if the method returns a new instance of {@link Xisemele} every time it is called.
	*/
	@Test
	void testNewXisemele() {
		Xisemele xisemele1 = XisemeleFactory.newXisemele();
		Xisemele xisemele2 = XisemeleFactory.newXisemele();
		assertNotSame(xisemele1, xisemele2);
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
import net.sf.xisemele.api.Editor;
import net.sf.xisemele.api.Formatter;
import net.sf.xisemele.api.FormatterProvider;
import net.sf.xisemele.api.ReaderProvider;
import net.sf.xisemele.api.Result;
import net.sf.xisemele.api.Xisemele;
import net.sf.xisemele.exception.XisemeleIOException;
import net.sf.xisemele.exception.XisemeleRuntimeException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
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
     * Cria uma nova instância de {@link XisemeleImpl}.
     *
     * @param factory
     *          instância de {@link Factory} que será utilizada para criar instâncias de objetos necessários para a execução das operações de {@link Xisemele}.
     * @param formatterProvider
     *          instância de {@link FormatterProvider} que será utilizada para obter instâncias de {@link Formatter}.
     */
    XisemeleImpl(final Factory factory, final FormatterProvider formatterProvider) {
        this.factory = factory;
        this.formatterProvider = formatterProvider;
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName) {
        return factory.createEditor(factory.createDocument(rootName));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI) {
        return factory.createEditor(factory.createDocument(rootName, namespaceURI));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String qualifiedName) {
        return factory.createEditor(factory.createDocument(rootName, namespaceURI, qualifiedName));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String qualifiedName, final String publicId, final String systemId) {
        return factory.createEditor(factory.createDocument(rootName, namespaceURI, qualifiedName, publicId, systemId));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final Node node) {
        return factory.createEditor(factory.createDocument(node));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final InputSource inputSource) {
        return factory.createEditor(factory.createDocument(inputSource));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final InputStream inputStream) {
        return factory.createEditor(factory.createDocument(inputStream));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final Reader reader) {
        return factory.createEditor(factory.createDocument(reader));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final File file) {
        return factory.createEditor(factory.createDocument(file));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String xml) {
        return factory.createEditor(factory.createDocument(xml));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final Document document) {
        return factory.createEditor(factory.createDocument(document));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final ReaderProvider readerProvider) {
        return factory.createEditor(factory.createDocument(readerProvider));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final ReaderProvider readerProvider, final String encoding) {
        return factory.createEditor(factory.createDocument(readerProvider, encoding));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final ReaderProvider readerProvider, final String encoding, final boolean namespaceAware) {
        return factory.createEditor(factory.createDocument(readerProvider, encoding, namespaceAware));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final ReaderProvider readerProvider, final String encoding, final boolean namespaceAware, final boolean validating) {
        return factory.createEditor(factory.createDocument(readerProvider, encoding, namespaceAware, validating));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final ReaderProvider readerProvider, final String encoding, final boolean namespaceAware, final boolean validating, final boolean xincludeAware) {
        return factory.createEditor(factory.createDocument(readerProvider, encoding, namespaceAware, validating, xincludeAware));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final ReaderProvider readerProvider, final String encoding, final boolean namespaceAware, final boolean validating, final boolean xincludeAware, final boolean coalescing) {
        return factory.createEditor(factory.createDocument(readerProvider, encoding, namespaceAware, validating, xincludeAware, coalescing));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final ReaderProvider readerProvider, final String encoding, final boolean namespaceAware, final boolean validating, final boolean xincludeAware, final boolean coalescing, final boolean ignoreComments) {
        return factory.createEditor(factory.createDocument(readerProvider, encoding, namespaceAware, validating, xincludeAware, coalescing, ignoreComments));
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final ReaderProvider readerProvider, final String encoding, final boolean namespaceAware, final boolean validating, final boolean xincludeAware, final boolean coalescing, final boolean ignoreComments, final boolean ignoreWhitespace) {
        return factory.createEditor(factory.createDocument(readerProvider, encoding, namespaceAware, validating, xincludeAware, coalescing, ignoreComments, ignoreWhitespace));
    }

    /**
     * {@inheritDoc