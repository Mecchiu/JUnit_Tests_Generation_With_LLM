import org.junit.jupiter.api.BeforeEach;

class XmlElement_2Test {

    private XmlElement xmlElement;

    @BeforeEach
    void setUp() {
        xmlElement = new XmlElement();
    }

    @Test
    void testAddSubElement() {
        XmlElement subElement = xmlElement.addSubElement("subElement");
        assertNotNull(subElement);
    }

    @Test
    void testAddSubElementWithExistingSubElement() {
        XmlElement subElement1 = xmlElement.addSubElement("subElement1");
        XmlElement subElement2 = xmlElement.addSubElement("subElement2");
        XmlElement subElement3 = subElement1.addSubElement("subElement3");
        XmlElement subElement4 = subElement2.addSubElement("subElement4");
        XmlElement subElement5 = subElement3.addSubElement("subElement5");
        XmlElement subElement6 = subElement4.addSubElement("subElement6");
        XmlElement subElement7 = subElement5.addSubElement("subElement7");
        XmlElement subElement8 = subElement6.addSubElement("subElement8");
        XmlElement subElement9 = subElement7.addSubElement("subElement9");
        XmlElement subElement10 = subElement8.addSubElement("subElement10");
        assertNotNull(subElement1);
        assertNotNull(subElement2);
        assertNotNull(subElement3);
        assertNotNull(subElement4);
        assertNotNull(subElement5);
        assertNotNull(subElement6);
        assertNotNull(subElement7);
        assertNotNull(subElement8);
        assertNotNull(subElement9);
        assertNotNull(subElement10);
    }

    @Test
    void testAddSubElementWithEmptyPath() {
        XmlElement subElement = xmlElement.addSubElement("");
        assertNull(subElement);
    }

    @Test
    void testAddSubElementWithNullPath() {
        XmlElement subElement = xmlElement.addSubElement(null);
        assertNull(subElement);
    }

    @Test
    void testAddSubElementWithInvalidPath() {
        XmlElement subElement = xmlElement.addSubElement("invalid.path");
        assertNull(subElement);
    }

    @Test
    void testAddSubElementWithExistingSubElementAndInvalidPath() {
        XmlElement subElement1 = xmlElement.addSubElement("subElement1");
        XmlElement subElement2 = xmlElement.addSubElement("subElement2");
        XmlElement subElement3 = subElement1.addSubElement("subElement3");
        XmlElement subElement4 = subElement2.addSubElement("subElement4");
        XmlElement subElement5 = subElement3.addSubElement("subElement5");
        XmlElement subElement6 = subElement4.addSubElement("subElement6");
        XmlElement subElement7 = subElement5.addSubElement("subElement7");
        XmlElement subElement8 = subElement6.addSubElement("subElement8");
        XmlElement subElement9 = subElement7.addSubElement("subElement9");
        XmlElement subElement10 = subElement8.addSubElement("subElement10");
        XmlElement subElement11 = subElement10.addSubElement("invalid.path");
        assertNull(subElement11);
    }

    @Test
    void testAddSubElementWithExistingSubElementAndEmptyPath() {
        XmlElement subElement1 = xmlElement.addSubElement("subElement1");
        XmlElement subElement2 = xmlElement.addSubElement("subElement2");
        XmlElement subElement3 = subElement1.addSubElement("subElement3");
        XmlElement subElement4 = subElement2.addSubElement("subElement4");
        XmlElement subElement5 = subElement3.addSubElement("subElement5");
        XmlElement subElement6 = subElement4.addSubElement("subElement6");
        XmlElement subElement7 = subElement5.addSubElement("subElement7");
        XmlElement subElement8 = subElement6.addSubElement("subElement8");
        XmlElement subElement9 = subElement7.addSubElement("subElement9");
        XmlElement subElement10 = subElement8.addSubElement("subElement10");
        XmlElement subElement11 = subElement10.addSubElement("");
        assertNull(subElement11);
    }

    @Test
    void testAddSubElementWithExistingSubElementAndNullPath() {
        XmlElement subElement1 = xmlElement.addSubElement("subElement1");
        XmlElement subElement2 = xmlElement.addSubElement("subElement2");
        XmlElement subElement3 = subElement1.addSubElement("subElement3");
        XmlElement subElement4 = subElement2.addSubElement("subElement4");
        XmlElement subElement5 = subElement3.addSubElement("subElement5");
        XmlElement subElement6 = subElement4.addSubElement("subElement6");
        XmlElement subElement7 = subElement5.addSubElement("subElement7");
        XmlElement subElement8 = subElement6.addSubElement("subElement8");
        XmlElement subElement9 = subElement7.addSubElement("subElement9");
        XmlElement subElement10 = subElement8.addSubElement("subElement10");
        XmlElement subElement11 = subElement10.addSubElement(null);
        assertNull(subElement11);
    }

    @Test
    void testAddSubElementWithExistingSubElementAndDuplicatePath() {
        XmlElement subElement1 = xmlElement.addSubElement("subElement1");
        XmlElement subElement2 = xmlElement.addSubElement("subElement2");
        XmlElement subElement3 = subElement1.addSubElement("subElement3");
        XmlElement subElement4 = subElement2.addSubElement("subElement3");
        assertNotNull(subElement1);
        assertNotNull(subElement2);
        assertNotNull(subElement3);
        assertNull(subElement4);
    }
}