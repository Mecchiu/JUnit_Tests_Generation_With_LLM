import org.junit.jupiter.api.DisplayName;

@DisplayName("JavaSource_1Test")
class JavaSource_1Test {

    @Test
    @DisplayName("Test hasSuperClass() with null superClass")
    void testHasSuperClassWithNullSuperClass() {
        JavaSource javaSource = new JavaSource();
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    @DisplayName("Test hasSuperClass() with non-null superClass")
    void testHasSuperClassWithNonNullSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("org.sourceforge.ifx.tools.JavaSource");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    @DisplayName("Test hasSuperClass() with empty superClass")
    void testHasSuperClassWithEmptySuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("");
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    @DisplayName("Test hasSuperClass() with whitespace superClass")
    void testHasSuperClassWithWhitespaceSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("   ");
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    @DisplayName("Test hasSuperClass() with multiple whitespace superClass")
    void testHasSuperClassWithMultipleWhitespaceSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass(" \t\n\r\f ");
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    @DisplayName("Test hasSuperClass() with non-empty superClass")
    void testHasSuperClassWithNonEmptySuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("java.lang.Object");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    @DisplayName("Test hasSuperClass() with non-empty superClass and package")
    void testHasSuperClassWithNonEmptySuperClassAndPackage() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("org.sourceforge.ifx.tools.JavaSource");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    @DisplayName("Test hasSuperClass() with non-empty superClass and invalid package")
    void testHasSuperClassWithNonEmptySuperClassAndInvalidPackage() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("org.sourceforge.ifx.tools.JavaSource$");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    @DisplayName("Test hasSuperClass() with non-empty superClass and invalid class name")
    void testHasSuperClassWithNonEmptySuperClassAndInvalidClassName() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("org.sourceforge.ifx.tools.JavaSource#");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    @DisplayName("Test hasSuperClass() with non-empty superClass and invalid package and class name")
    void testHasSuperClassWithNonEmptySuperClassAndInvalidPackageAndClassName() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("org.sourceforge.ifx.tools.JavaSource$#");
        assertTrue(javaSource.hasSuperClass());
    }
}