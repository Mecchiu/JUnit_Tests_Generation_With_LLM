package edu.mscd.cs.jclo;
java
class JCLO_1Test {

    @Test
    void testUsage_NoFields_ReturnsEmptyString() {
        JCLO jclo = new JCLO(new Object());
        String expected = "";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    @Test
    void testUsage_WithFields_ReturnsUsageString() {
        class TestObject {
            int number;
            String name;
        }
        JCLO jclo = new JCLO(new TestObject());
        String expected = "-name String\n-number int\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    @Test
    void testUsage_WithPrefix_ReturnsUsageStringWithPrefix() {
        class TestObject {
            int number;
            String name;
        }
        JCLO jclo = new JCLO("prefix_", new TestObject());
        String expected = "-prefix_name String\n-prefix_number int\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    @Test
    void testUsage_WithAliases_ReturnsUsageStringWithAliases() {
        class TestObject {
            int number;
            String name;
        }
        String[][] aliases = {{"name", "n"}, {"number", "num"}};
        JCLO jclo = new JCLO(new TestObject(), aliases);
        String expected = "-n String\n-num int\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    @Test
    void testUsage_WithFinalField_DoesNotIncludeFinalFieldInUsage() {
        class TestObject {
            final int number = 5;
            String name;
        }
        JCLO jclo = new JCLO(new TestObject());
        String expected = "-name String\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    @Test
    void testUsage_WithAdditionalField_DoesNotIncludeAdditionalFieldInUsage() {
        class TestObject {
            String[] additional;
            String name;
        }
        JCLO jclo = new JCLO(new TestObject());
        String expected = "-name String\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    @Test
    void testUsage_WithBooleanField_ReturnsUsageStringWithBooleanType() {
        class TestObject {
            boolean flag;
        }
        JCLO jclo = new JCLO(new TestObject());
        String expected = "-flag[=boolean]\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    @Test
    void testUsage_WithArrayField_ReturnsUsageStringWithArrayType() {
        class TestObject {
            String[] names;
        }
        JCLO jclo = new JCLO(new TestObject());
        String expected = "-names String...\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    @Test
    void testUsage_WithNumericPrefixedField_ReturnsUsageStringWithNumericPrefix() {
        class TestObject {
            int _1number;
        }
        JCLO jclo = new JCLO(new TestObject());
        String expected = "-1number int\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    @Test
    void testUsage_WithDashedField_ReturnsUsageStringWithDashes() {
        class TestObject {
            String user__name;
        }
        JCLO jclo = new JCLO(new TestObject());
        String expected = "-user-name String\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }
}
