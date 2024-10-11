// Test case 1: Test decompiling a simple function
@Test
void testSimpleFunction() {
    String source = "function add(a, b) { return a + b; }";
    String expected = "function add(a, b) {\n    return a + b;\n}";
    String actual = Decompiler.decompile(source, 0, null);
    assertEquals(expected, actual);
}

// Test case 2: Test decompiling a function with nested functions
@Test
void testNestedFunctions() {
    String source = "function outer() { function inner() { return 'inner'; } return inner(); }";
    String expected = "function outer() {\n    function inner() {\n        return 'inner';\n    }\n    return inner();\n}";
    String actual = Decompiler.decompile(source, 0, null);
    assertEquals(expected, actual);
}

// Test case 3: Test decompiling a function with a conditional statement
@Test
void testConditionalStatement() {
    String source = "function test(a) { if (a) { return 'true'; } else { return 'false'; } }";
    String expected = "function test(a) {\n    if (a) {\n        return 'true';\n    } else {\n        return 'false';\n    }\n}";
    String actual = Decompiler.decompile(source, 0, null);
    assertEquals(expected, actual);
}

// Test case 4: Test decompiling a function with a for loop
@Test
void testForLoop() {
    String source = "function loop(n) { for (var i = 0; i < n; i++) { console.log(i); } }";
    String expected = "function loop(n) {\n    for (var i = 0; i < n; i++) {\n        console.log(i);\n    }\n}";
    String actual = Decompiler.decompile(source, 0, null);
    assertEquals(expected, actual);
}

// Test case 5: Test decompiling a function with a while loop
@Test
void testWhileLoop() {
    String source = "function loop(n) { var i = 0; while (i < n) { console.log(i); i++; } }";
    String expected = "function loop(n) {\n    var i = 0;\n    while (i < n) {\n        console.log(i);\n        i++;\n    }\n}";
    String actual = Decompiler.decompile(source, 0, null);
    assertEquals(expected, actual);
}

// Test case 6: Test decompiling a function with a do-while loop
@Test
void testDoWhileLoop() {
    String source = "function loop(n) { var i = 0; do { console.log(i); i++; } while (i < n); }";
    String expected = "function loop(n) {\n    var i = 0;\n    do {\n        console.log(i);\n        i++;\n    } while (i < n);\n}";
    String actual = Decompiler.decompile(source, 0, null);
    assertEquals(expected, actual);
}

// Test case 7: Test decompiling a function with a switch statement
@Test
void testSwitchStatement() {
    String source = "function test(a) { switch (a) { case 1: return 'one'; case 2: return 'two'; default: return 'other'; } }";
    String expected = "function test(a) {\n    switch (a) {\n      case 1:\n        return 'one';\n      case 2:\n        return 'two';\n      default:\n        return 'other';\n    }\n}";
    String actual = Decompiler.decompile(source, 0, null);
    assertEquals(expected, actual);
}

// Test case 8: Test decompiling a function with a try-catch statement
@Test
void testTryCatchStatement() {
    String source = "function test(a) { try { console.log(a); } catch (e) { console.log('error: ' + e); } }";
    String expected = "function test(a) {\n    try {\n        console.log(a);\n    } catch (e) {\n        console.log('error: ' + e);\n    }\n}";
    String actual = Decompiler.decompile(source, 0, null);
    assertEquals(expected, actual);
}

// Test case 9: Test decompiling a function with a try-finally statement
@Test
void testTryFinallyStatement() {
    String source = "function test(a) { try { console.log(a); } finally { console.log('done'); } }";
    String expected = "function test(a) {\n    try {\n        console.log(a);\n    } finally {\n        console.log('done');\n    }\n}";
    String actual = Decompiler.decompile(source, 0, null);
    assertEquals(expected, actual);
}

// Test case 10: Test decompiling a function with a try-catch-finally statement
@Test
void testTryCatchFinallyStatement() {
    String source = "function test(a) { try { console.log(a); } catch (e) { console.log('error: ' + e); } finally { console.log('done'); } }";
    String expected = "function test(a) {\n    try {\n        console.log(a);\n    } catch (e) {\n        console.log('error: ' + e);\n    } finally {\n        console.log('done');\n    }\n}";
    String actual = Decompiler.decompile(source, 0, null);
    assertEquals(expected, actual);
}
}