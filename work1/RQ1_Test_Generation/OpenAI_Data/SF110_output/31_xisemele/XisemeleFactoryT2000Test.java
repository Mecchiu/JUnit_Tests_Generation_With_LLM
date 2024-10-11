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
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import net.sf.xisemele.api.Editor;
import net.sf.xisemele.api.Formatter;
import net.sf.xisemele.api.FormatterProvider;
import net.sf.xisemele.api.Xisemele;
import net.sf.xisemele.exception.XisemeleIOException;
import net.sf.xisemele.exception.XisemeleRuntimeException;
import net.sf.xisemele.exception.XisemeleSerializationException;
import net.sf.xisemele.exception.XisemeleValidationException;
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
     *      instância de {@link Factory} que será utilizada para criar instâncias de objetos necessários para a execução das operações de {@link Xisemele}.
     * @param formatterProvider
     *      instância de {@link FormatterProvider} que será utilizada para obter instâncias de {@link Formatter}.
     */
    XisemeleImpl(final Factory factory, final FormatterProvider formatterProvider) {
        this.factory = factory;
        this.formatterProvider = formatterProvider;
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName) {
        return factory.createEditor(rootName);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI) {
        return factory.createEditor(rootName, namespaceURI);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String prefix) {
        return factory.createEditor(rootName, namespaceURI, prefix);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String prefix, final String schemaLocation) {
        return factory.createEditor(rootName, namespaceURI, prefix, schemaLocation);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String prefix, final String schemaLocation, final String noNamespaceSchemaLocation) {
        return factory.createEditor(rootName, namespaceURI, prefix, schemaLocation, noNamespaceSchemaLocation);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String prefix, final String schemaLocation, final String noNamespaceSchemaLocation, final String xsiSchemaLocation) {
        return factory.createEditor(rootName, namespaceURI, prefix, schemaLocation, noNamespaceSchemaLocation, xsiSchemaLocation);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String prefix, final String schemaLocation, final String noNamespaceSchemaLocation, final String xsiSchemaLocation, final String xsiNoNamespaceSchemaLocation) {
        return factory.createEditor(rootName, namespaceURI, prefix, schemaLocation, noNamespaceSchemaLocation, xsiSchemaLocation, xsiNoNamespaceSchemaLocation);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String prefix, final String schemaLocation, final String noNamespaceSchemaLocation, final String xsiSchemaLocation, final String xsiNoNamespaceSchemaLocation, final String xsiType) {
        return factory.createEditor(rootName, namespaceURI, prefix, schemaLocation, noNamespaceSchemaLocation, xsiSchemaLocation, xsiNoNamespaceSchemaLocation, xsiType);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String prefix, final String schemaLocation, final String noNamespaceSchemaLocation, final String xsiSchemaLocation, final String xsiNoNamespaceSchemaLocation, final String xsiType, final String xsiNil) {
        return factory.createEditor(rootName, namespaceURI, prefix, schemaLocation, noNamespaceSchemaLocation, xsiSchemaLocation, xsiNoNamespaceSchemaLocation, xsiType, xsiNil);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String prefix, final String schemaLocation, final String noNamespaceSchemaLocation, final String xsiSchemaLocation, final String xsiNoNamespaceSchemaLocation, final String xsiType, final String xsiNil, final String xsiTypeValue) {
        return factory.createEditor(rootName, namespaceURI, prefix, schemaLocation, noNamespaceSchemaLocation, xsiSchemaLocation, xsiNoNamespaceSchemaLocation, xsiType, xsiNil, xsiTypeValue);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String prefix, final String schemaLocation, final String noNamespaceSchemaLocation, final String xsiSchemaLocation, final String xsiNoNamespaceSchemaLocation, final String xsiType, final String xsiNil, final String xsiTypeValue, final String xsiNilValue) {
        return factory.createEditor(rootName, namespaceURI, prefix, schemaLocation, noNamespaceSchemaLocation, xsiSchemaLocation, xsiNoNamespaceSchemaLocation, xsiType, xsiNil, xsiTypeValue, xsiNilValue);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String namespaceURI, final String prefix, final String schemaLocation, final String noNamespaceSchemaLocation, final String xsiSchemaLocation, final String xsiNoNamespaceSchemaLocation, final String xsiType, final String xsiNil, final String xsiTypeValue, final String xsiNilValue, final String xsiTypeValueNamespaceURI) {
        return factory.createEditor(rootName,