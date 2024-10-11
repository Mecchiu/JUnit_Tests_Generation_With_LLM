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
import net.sf.xisemele.api.Result;
import net.sf.xisemele.api.Xisemele;
import net.sf.xisemele.exception.FormatterNotFoundException;
import net.sf.xisemele.exception.XisemeleException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/**
 * Implementação de {@link Xisemele}.
 *
 * @author Carlos Eduardo Coral.
 */
public class XisemeleImpl implements Xisemele {

    /**
     * Instância de {@link Factory} que será utilizada para criar instâncias de objetos necessários para a execução das operações de edição.
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
     *          instância de {@link Factory} que será utilizada para criar instâncias de objetos necessários para a execução das operações de edição.
     * @param formatterProvider
     *          instância de {@link FormatterProvider} que será utilizada para obter instâncias de {@link Formatter}.
     */
    public XisemeleImpl(final Factory factory, final FormatterProvider formatterProvider) {
        this.factory = factory;
        this.formatterProvider = formatterProvider;
    }

    /**
     * {@inheritDoc}
     */
    public Editor create(final String xml) {
        return create(new StringReader(xml));
    }

    /**
     * {@inheritDoc}
     */
    public Editor create(final File file) {
        return create(factory.newFileInputStream(file));
    }

    /**
     * {@inheritDoc}
     */
    public Editor create(final InputStream inputStream) {
        return create(factory.newInputSource(inputStream));
    }

    /**
     * {@inheritDoc}
     */
    public Editor create(final Reader reader) {
        return create(factory.newInputSource(reader));
    }

    /**
     * {@inheritDoc}
     */
    public Editor create(final InputSource inputSource) {
        return create(factory.newDocument(inputSource));
    }

    /**
     * {@inheritDoc}
     */
    public Editor create(final Document document) {
        return create(factory.newNode(document));
    }

    /**
     * {@inheritDoc}
     */
    public Editor create(final Node node) {
        return factory.newEditor(node);
    }

    /**
     * {@inheritDoc}
     */
    public Result result(final String xml) {
        return result(new StringReader(xml));
    }

    /**
     * {@inheritDoc}
     */
    public Result result(final File file) {
        return result(factory.newFileInputStream(file));
    }

    /**
     * {@inheritDoc}
     */
    public Result result(final InputStream inputStream) {
        return result(factory.newInputSource(inputStream));
    }

    /**
     * {@inheritDoc}
     */
    public Result result(final Reader reader) {
        return result(factory.newInputSource(reader));
    }

    /**
     * {@inheritDoc}
     */
    public Result result(final InputSource inputSource) {
        return result(factory.newDocument(inputSource));
    }

    /**
     * {@inheritDoc}
     */
    public Result result(final Document document) {
        return result(factory.newNode(document));
    }

    /**
     * {@inheritDoc}
     */
    public Result result(final Node node) {
        return factory.newResult(node);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final String xml) {
        return format(xml, null);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final String xml, final String formatterName) {
        return format(new StringReader(xml), formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final File file) {
        return format(file, null);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final File file, final String formatterName) {
        return format(factory.newFileInputStream(file), formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final InputStream inputStream) {
        return format(inputStream, null);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final InputStream inputStream, final String formatterName) {
        return format(factory.newInputSource(inputStream), formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final Reader reader) {
        return format(reader, null);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final Reader reader, final String formatterName) {
        return format(factory.newInputSource(reader), formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final InputSource inputSource) {
        return format(inputSource, null);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final InputSource inputSource, final String formatterName) {
        return format(factory.newDocument(inputSource), formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final Document document) {
        return format(document, null);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final Document document, final String formatterName) {
        return format(factory.newNode(document), formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final Node node) {
        return format(node, null);
    }

    /**
     * {@inheritDoc}
     */
    public String format(final Node node, final String formatterName) {
        Formatter formatter = formatterProvider.getFormatter(formatterName);
        if (formatter == null) {
            throw new FormatterNotFoundException(formatterName);
        }
        return formatter.format(node);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final String xml, final Writer writer) {
        format(xml, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final String xml, final Writer writer, final String formatterName) {
        format(new StringReader(xml), writer, formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final File file, final Writer writer) {
        format(file, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final File file, final Writer writer, final String formatterName) {
        format(factory.newFileInputStream(file), writer, formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final InputStream inputStream, final Writer writer) {
        format(inputStream, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final InputStream inputStream, final Writer writer, final String formatterName) {
        format(factory.newInputSource(inputStream), writer, formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final Reader reader, final Writer writer) {
        format(reader, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final Reader reader, final Writer writer, final String formatterName) {
        format(factory.newInputSource(reader), writer, formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final InputSource inputSource, final Writer writer) {
        format(inputSource, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final InputSource inputSource, final Writer writer, final String formatterName) {
        format(factory.newDocument(inputSource), writer, formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final Document document, final Writer writer) {
        format(document, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final Document document, final Writer writer, final String formatterName) {
        format(factory.newNode(document), writer, formatterName);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final Node node, final Writer writer) {
        format(node, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void format(final Node node, final Writer writer, final String formatterName) {
        Formatter formatter = formatterProvider.getFormatter(formatterName);
        if (formatter == null) {
            throw new FormatterNotFoundException(formatterName);
        }
        formatter.format(node, writer);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final String xml) {
        return validate(xml, null);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final String xml, final String schema) {
        return validate(new StringReader(xml), schema);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final File file) {
        return validate(file, null);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final File file, final String schema) {
        return validate(factory.newFileInputStream(file), schema);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final InputStream inputStream) {
        return validate(inputStream, null);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final InputStream inputStream, final String schema) {
        return validate(factory.newInputSource(inputStream), schema);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final Reader reader) {
        return validate(reader, null);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final Reader reader, final String schema) {
        return validate(factory.newInputSource(reader), schema);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final InputSource inputSource) {
        return validate(inputSource, null);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final InputSource inputSource, final String schema) {
        return validate(factory.newDocument(inputSource), schema);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final Document document) {
        return validate(document, null);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final Document document, final String schema) {
        return validate(factory.newNode(document), schema);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final Node node) {
        return validate(node, null);
    }

    /**
     * {@inheritDoc}
     */
    public String validate(final Node node, final String schema) {
        return factory.newValidator(schema).validate(node);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final String xml, final Writer writer) {
        validate(xml, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final String xml, final Writer writer, final String schema) {
        validate(new StringReader(xml), writer, schema);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final File file, final Writer writer) {
        validate(file, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final File file, final Writer writer, final String schema) {
        validate(factory.newFileInputStream(file), writer, schema);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final InputStream inputStream, final Writer writer) {
        validate(inputStream, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final InputStream inputStream, final Writer writer, final String schema) {
        validate(factory.newInputSource(inputStream), writer, schema);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final Reader reader, final Writer writer) {
        validate(reader, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final Reader reader, final Writer writer, final String schema) {
        validate(factory.newInputSource(reader), writer, schema);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final InputSource inputSource, final Writer writer) {
        validate(inputSource, writer, null);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final InputSource inputSource, final Writer writer, final String schema) {
        validate(factory.newDocument(inputSource), writer, schema);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(final Document document, final Writer writer) {
        validate(document, writer, null);
    }

    /**
     * {