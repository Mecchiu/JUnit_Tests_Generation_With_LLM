// Test case 1: Test usage message with no options
@Test
void testUsageNoOptions() {
    JCLO jclo = new JCLO(new Object());
    String expected = "Usage: java <classname> [options]\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
}

// Test case 2: Test usage message with one option
@Test
void testUsageOneOption() {
    class TestObject {
        int num;
    }
    JCLO jclo = new JCLO(new TestObject());
    String expected = "Usage: java <classname> [options]\n" +
                      "Options:\n" +
                      "  --num <int>\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
}

// Test case 3: Test usage message with multiple options
@Test
void testUsageMultipleOptions() {
    class TestObject {
        int num;
        String name;
        boolean flag;
    }
    JCLO jclo = new JCLO(new TestObject());
    String expected = "Usage: java <classname> [options]\n" +
                      "Options:\n" +
                      "  --num <int>\n" +
                      "  --name <String>\n" +
                      "  --flag\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
}

// Test case 4: Test usage message with prefix and aliases
@Test
void testUsagePrefixAndAliases() {
    class TestObject {
        int num;
        String name;
        boolean flag;
    }
    String prefix = "-";
    String[][] aliases = {{"num", "n"}, {"name", "nm"}, {"flag", "f"}};
    JCLO jclo = new JCLO(prefix, new TestObject(), aliases);
    String expected = "Usage: java <classname> [options]\n" +
                      "Options:\n" +
                      "  -n, --num <int>\n" +
                      "  -nm, --name <String>\n" +
                      "  -f, --flag\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
}

// Test case 5: Test usage message with default values
@Test
void testUsageDefaultValues() {
    class TestObject {
        int num = 5;
        String name = "default";
        boolean flag = true;
    }
    JCLO jclo = new JCLO(new TestObject());
    String expected = "Usage: java <classname> [options]\n" +
                      "Options:\n" +
                      "  --num <int> (default: 5)\n" +
                      "  --name <String> (default: default)\n" +
                      "  --flag (default: true)\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
}

// Test case 6: Test usage message with required options
@Test
void testUsageRequiredOptions() {
    class TestObject {
        int num;
        String name;
        boolean flag;
    }
    JCLO jclo = new JCLO(new TestObject());
    jclo.addRequired("num");
    jclo.addRequired("name");
    String expected = "Usage: java <classname> [options]\n" +
                      "Options:\n" +
                      "  --num <int> (required)\n" +
                      "  --name <String> (required)\n" +
                      "  --flag\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
}

// Test case 7: Test usage message with description
@Test
void testUsageDescription() {
    class TestObject {
        int num;
        String name;
        boolean flag;
    }
    JCLO jclo = new JCLO(new TestObject());
    jclo.setDescription("This is a test object");
    String expected = "Usage: java <classname> [options]\n" +
                      "This is a test object\n" +
                      "Options:\n" +
                      "  --num <int>\n" +
                      "  --name <String>\n" +
                      "  --flag\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
}

// Test case 8: Test usage message with long description
@Test
void testUsageLongDescription() {
    class TestObject {
        int num;
        String name;
        boolean flag;
    }
    JCLO jclo = new JCLO(new TestObject());
    jclo.setDescription("This is a test object with a very long description that should span multiple lines in the usage message. Hopefully this works correctly.");
    String expected = "Usage: java <classname> [options]\n" +
                      "This is a test object with a very long description that should span multiple lines in the usage message. Hopefully this works correctly.\n" +
                      "Options:\n" +
                      "  --num <int>\n" +
                      "  --name <String>\n" +
                      "  --flag\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
}

// Test case 9: Test usage message with custom header
@Test
void testUsageCustomHeader() {
    class TestObject {
        int num;
        String name;
        boolean flag;
    }
    JCLO jclo = new JCLO(new TestObject());
    jclo.setHeader("Custom header");
    String expected = "Custom header\n" +
                      "Usage: java <classname> [options]\n" +
                      "Options:\n" +
                      "  --num <int>\n" +
                      "  --name <String>\n" +
                      "  --flag\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
}

// Test case 10: Test usage message with custom footer
@Test
void testUsageCustomFooter() {
    class TestObject {
        int num;
        String name;
        boolean flag;
    }
    JCLO jclo = new JCLO(new TestObject());
    jclo.setFooter("Custom footer");
    String expected = "Usage: java <classname> [options]\n" +
                      "Options:\n" +
                      "  --num <int>\n" +
                      "  --name <String>\n" +
                      "  --flag\n" +
                      "Custom footer\n";
    String actual = jclo.usage();
    assertEquals(expected, actual);
}