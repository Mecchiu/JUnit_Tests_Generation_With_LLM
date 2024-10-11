// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains one unit test case for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {
		
    @Test
    public void testTypeDesc() {
        Dependency testCase = new Dependency();
        testConfig(testCase, "typeDesc");
    }

    @Test
    public void testName() {
        Dependency testCase = new Dependency();
        testName(testCase, "name", 1);
    }

    @Test
    public void testId() {
        Dependency testCase = new Dependency();
        testId(testCase, 1);
    }

    private void testConfig(Dependency testCase, final String testMethod) {
        testCase.setId(new java.lang.String("Test Dependency Id"));
        testCase.setName(new java.lang.String("Test Dependency Name"));
        testCase.setType(new java.lang.String("Test Dependency Type"));
        testCase.setUuid("Test Dependency UUID");
        testCase.setStatus(new java.lang.String("Test Dependency Status"));
        testCase.setSource(new java.lang.String("Test Dependency Source"));
        testCase.setVersion(new java.lang.String("Test Dependency Version"));
        testCase.setUpdateTime(new java.lang.String("Test Dependency UpdateTime"));
        testCase.setCreatedAt(new java.lang.String("Test Dependency CreatedAt"));
        testCase.setUpdatedAt(new java.lang.String("Test Dependency UpdatedAt"));
        testCase.setCreator(new java.lang.String("Test Dependency Creator"));
        testCase.setVersion("Test Dependency Version");
        testCase.test();
    }

    private void testName(Dependency testCase, final String testMethod, final int id) {
        testCase.setId(new java.lang.String("Test Dependency Id with name field"));
        testCase.setName(new java.lang.String("Test Dependency Name with field name"));
        testCase.setType(new java.lang.String("Test Dependency Type with field name"));
        testCase.setUuid(new java.lang.String("Test Dependency Uuid with field name"));
        testCase.setVersion(new java.lang.String("Test Dependency Version with field name"));
        testCase.setCreatedAt(new java.lang.String("Test Dependency CreatedAt with field name"));
        testCase.setUpdatedAt(new java.lang.String("Test Dependency UpdatedAt with field name"));
        testCase.setCreator(new java.lang.String("Test Dependency Creator with field name"));
        testCase.setVersion("Test Dependency Version with field name");
        testCase.setUpdateTime(new java.lang.String("Test Dependency UpdateTime with field name"));
        testCase.test();
    }

    private void testId(Dependency testCase, final int id) {
        testCase.setId(new java.lang.String("Test Dependency ID with field name"));
        testCase.setUuid("Test Dependency Uuid with field name");
        testCase.setVersion("Test Dependency Version with field name");
        testCase.setCreatedAt("Test Dependency CreatedAt with field name");
        testCase.setUpdatedAt("Test Dependency UpdatedAt with field name");
        testCase.setUpdator("Test Dependency Updator with field name");
        testCase.setCreator("Test Dependency Creator with field name");
        testCase.setStatus("Test Dependency Status with field name");
        testCase.setCreatedBy("Test Dependency CreatedBy with field name");
        testCase.setUpdatedBy("Test Dependency UpdatedBy with field name");
        testCase.setUpdger("Test Dependency Updager with field name");
        testCase.setVersion("Test Dependency Version With field name");
        testCase.setCreator("Test Dependency Creator With field name");
        testCase.setVersion("Test Dependency Version With field name");
        testCase.test();
    }

    private void testSource(Dependency testCase, final String testMethod) {
        testCase.setSource(testMethod);
        testCase.test();
    }

    private void testUpdateTime(Dependency testCase, final java.lang.String expected) {
        testCase.setUpdateTime(expected);
        testCase.test();
    }

    private void testCreatedAt(Dependency testCase, final java.lang.String expected) {
        testCase.setCreatedAt(expected);
        testCase.test();
    }

    private void testUpdatedAt(Dependency testCase, final java.lang.String expected) {
        testCase.setUpdatedAt(expected);
        testCase.test();
    }

    private void testCreator(Dependency testCase, final java.lang.String expected) {
        testCase.setCreator(expected);
        testCase.test();
    }

    private void testVersion(Dependency testCase, final java.lang.String expected) {
        testCase.setVersion(expected);
        testCase.test();
    }

    private void testStatus(Dependency testCase, final java.lang.String expected) {
        testCase.setStatus(expected);
        testCase.test();
    }

    private void testUpdateTime(Dependency testCase, final java.util.Date expected) {
        testCase.setUpdateTime(expected);
        testCase.test();
    }

    private void testId(Dependency testCase, final java.util.Date expected) {
        testCase.setId(expected);
        testCase.test();
    }

}