// Test case for getTypeDesc() method
class SearchResultElementTest {

    @Test
    void getTypeDesc_returnsTypeDescObject() {
        // Arrange
        TypeDesc expectedTypeDesc = new TypeDesc(SearchResultElement.class, true);

        // Act
        TypeDesc actualTypeDesc = SearchResultElement.getTypeDesc();

        // Assert
        assertEquals(expectedTypeDesc, actualTypeDesc);
    }

    @Test
    void getTypeDesc_returnsNonNullObject() {
        // Act
        TypeDesc actualTypeDesc = SearchResultElement.getTypeDesc();

        // Assert
        assertNotNull(actualTypeDesc);
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectJavaType() {
        // Arrange
        Class expectedJavaType = SearchResultElement.class;

        // Act
        TypeDesc actualTypeDesc = SearchResultElement.getTypeDesc();

        // Assert
        assertEquals(expectedJavaType, actualTypeDesc.getJavaType());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlType() {
        // Arrange
        QName expectedXmlType = new QName("http://type.fedsearch.merlot.org", "SearchResultElement");

        // Act
        TypeDesc actualTypeDesc = SearchResultElement.getTypeDesc();

        // Assert
        assertEquals(expectedXmlType, actualTypeDesc.getXmlType());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectElementName() {
        // Arrange
        String expectedElementName = "SearchResultElement";

        // Act
        TypeDesc actualTypeDesc = SearchResultElement.getTypeDesc();

        // Assert
        assertEquals(expectedElementName, actualTypeDesc.getElementName());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectNamespaceURI() {
        // Arrange
        String expectedNamespaceURI = "http://type.fedsearch.merlot.org";

        // Act
        TypeDesc actualTypeDesc = SearchResultElement.getTypeDesc();

        // Assert
        assertEquals(expectedNamespaceURI, actualTypeDesc.getXmlType().getNamespaceURI());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectIsElementFlag() {
        // Act
        TypeDesc actualTypeDesc = SearchResultElement.getTypeDesc();

        // Assert
        assertTrue(actualTypeDesc.isElement());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeNamespacePrefix() {
        // Arrange
        String expectedNamespacePrefix = "";

        // Act
        TypeDesc actualTypeDesc = SearchResultElement.getTypeDesc();

        // Assert
        assertEquals(expectedNamespacePrefix, actualTypeDesc.getXmlType().getPrefix());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeLocalPart() {
        // Arrange
        String expectedLocalPart = "SearchResultElement";

        // Act
        TypeDesc actualTypeDesc = SearchResultElement.getTypeDesc();

        // Assert
        assertEquals(expectedLocalPart, actualTypeDesc.getXmlType().getLocalPart());
    }

    @Test
    void getTypeDesc_returnsTypeDescWithCorrectXmlTypeQName() {
        // Arrange
        QName expectedQName = new QName("http://type.fedsearch.merlot.org", "SearchResultElement", "");

        // Act
        TypeDesc actualTypeDesc = SearchResultElement.getTypeDesc();

        // Assert
        assertEquals(expectedQName, actualTypeDesc.getXmlType());
    }
}