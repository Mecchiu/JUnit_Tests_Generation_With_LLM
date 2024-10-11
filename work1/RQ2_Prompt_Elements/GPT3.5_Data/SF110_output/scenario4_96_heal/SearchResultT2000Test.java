// Test case for getTypeDesc() method
class SearchResultTest {

    @Test
    void getTypeDesc_returnsTypeDescObject() {
        // Arrange
        TypeDesc expectedTypeDesc = new TypeDesc(SearchResult.class, true);

        // Act
        TypeDesc actualTypeDesc = SearchResult.getTypeDesc();

        // Assert
        assertEquals(expectedTypeDesc, actualTypeDesc);
    }

    @Test
    void getTypeDesc_returnsNonNullObject() {
        // Act
        TypeDesc actualTypeDesc = SearchResult.getTypeDesc();

        // Assert
        assertNotNull(actualTypeDesc);
    }

    @Test
    void getTypeDesc_returnsTypeDescObjectWithCorrectType() {
        // Arrange
        Class<?> expectedType = SearchResult.class;

        // Act
        TypeDesc actualTypeDesc = SearchResult.getTypeDesc();
        Class<?> actualType = actualTypeDesc.getJavaType();

        // Assert
        assertEquals(expectedType, actualType);
    }

    @Test
    void getTypeDesc_returnsTypeDescObjectWithCorrectXmlType() {
        // Arrange
        QName expectedXmlType = new QName("http://type.fedsearch.merlot.org", "SearchResult");

        // Act
        TypeDesc actualTypeDesc = SearchResult.getTypeDesc();
        QName actualXmlType = actualTypeDesc.getXmlType();

        // Assert
        assertEquals(expectedXmlType, actualXmlType);
    }

    @Test
    void getTypeDesc_returnsTypeDescObjectWithCorrectElementQName() {
        // Arrange
        QName expectedElementQName = new QName("http://type.fedsearch.merlot.org", "SearchResult");

        // Act
        TypeDesc actualTypeDesc = SearchResult.getTypeDesc();
        QName actualElementQName = actualTypeDesc.getElementQName();

        // Assert
        assertEquals(expectedElementQName, actualElementQName);
    }

    @Test
    void getTypeDesc_returnsTypeDescObjectWithCorrectNamespaceURI() {
        // Arrange
        String expectedNamespaceURI = "http://type.fedsearch.merlot.org";

        // Act
        TypeDesc actualTypeDesc = SearchResult.getTypeDesc();
        String actualNamespaceURI = actualTypeDesc.getXmlType().getNamespaceURI();

        // Assert
        assertEquals(expectedNamespaceURI, actualNamespaceURI);
    }

    @Test
    void getTypeDesc_returnsTypeDescObjectWithCorrectIsAnonymousValue() {
        // Arrange
        boolean expectedIsAnonymousValue = true;

        // Act
        TypeDesc actualTypeDesc = SearchResult.getTypeDesc();
        boolean actualIsAnonymousValue = actualTypeDesc.isAnonymousType();

        // Assert
        assertEquals(expectedIsAnonymousValue, actualIsAnonymousValue);
    }

    @Test
    void getTypeDesc_returnsTypeDescObjectWithCorrectIsComplexTypeValue() {
        // Arrange
        boolean expectedIsComplexTypeValue = true;

        // Act
        TypeDesc actualTypeDesc = SearchResult.getTypeDesc();
        boolean actualIsComplexTypeValue = actualTypeDesc.isComplexType();

        // Assert
        assertEquals(expectedIsComplexTypeValue, actualIsComplexTypeValue);
    }

    @Test
    void getTypeDesc_returnsTypeDescObjectWithCorrectIsElement() {
        // Arrange
        boolean expectedIsElement = true;

        // Act
        TypeDesc actualTypeDesc = SearchResult.getTypeDesc();
        boolean actualIsElement = actualTypeDesc.isElement();

        // Assert
        assertEquals(expectedIsElement, actualIsElement);
    }

    @Test
    void getTypeDesc_returnsTypeDescObjectWithCorrectXmlTypeNamespace() {
        // Arrange
        String expectedXmlTypeNamespace = "http://type.fedsearch.merlot.org";

        // Act
        TypeDesc actualTypeDesc = SearchResult.getTypeDesc();
        String actualXmlTypeNamespace = actualTypeDesc.getXmlTypeNamespace();

        // Assert
        assertEquals(expectedXmlTypeNamespace, actualXmlTypeNamespace);
    }
}