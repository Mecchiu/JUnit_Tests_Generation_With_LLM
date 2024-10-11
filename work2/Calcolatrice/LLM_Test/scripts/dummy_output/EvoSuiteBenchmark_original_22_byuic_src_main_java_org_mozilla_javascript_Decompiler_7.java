package org.mozilla.javascript;
private final int lineOffset;
		private final int sourceStart;
		private int braceDepth;
		private Decompiler decompiler;
		private int tokenStart;
		private int endOffset;
		private ErrorRecoveryTest debug;
		private UintMap properties;
		private static int NO_PROPS = 100; // don't modify properties yet

	/**
	 * Constructor for the class DecompilerTest.
	 *
	 * @param line no. of line in the source file
	 * @param sourceStart offset of the source start (inclusive)
	 * @param endOffset offset of the end   (inclusive)
	 * @param properties UintMap with debug information of this node in effect
	 */
	DecompilerTest(int line, int sourceStart, int endOffset, UintMap properties) {
		this.lineOffset = endOffset;
		this.sourceStart = sourceStart;
		this.endOffset = endOffset;
		this.tokenStart = getFirstToken(sourceStart);
		this.debug = new ErrorRecoveryTest(properties);
		this.braceDepth = sourceStart - 1;
		this.decompiler = new Decompiler(line, sourceStart, endOffset, properties);
		this.properties = properties;
	}

    @Test
    public void testDecompileSource() {
        if (debug.enabled) {
            debug.decision(OP_DECOMPILE, lineOffset);
        }

        assertFalse(decompiler.needsRecovery());
        String s = decompiler.compile("abc", NO_PROPS);

        if (printSource) {
            System.out.println(s);
        }

        assertTrue(decompiler.needsRecovery());
        assertNotNull(decompiler.getEncodedSource());

        String result = decompiler.decompile(s, NO_PROPS);

        if (printSource) {
            System.out.println(result);
        }

        assertEquals(result, s);
    }

    @Test
    public void testDecompileWithSource() {
		decompiler.setSourceString(sourceStart, sourceStringLength(sourceStart));
        decompiler.setEndPosition(sourceStart + sourceStringLength(sourceStart));

        String s = decompiler.compile("abc", NO_PROPS);

        decompiler.decompile(s, NO_PROPS);

        String result = decompiler.decompile(s, NO_PROPS);

        decompiler.decompile(result, NO_PROPS);

        String resultSource = decompiler.getEncodedSource();
        assertEquals(resultSource.length(), s.length());
        if (printSource) {
            System.out.println(s);
            System.out.println(resultSource);
        }

        String resultJSC = decompiler.decompileWithSource(s, result.length());
        if (printSource) {
            System.out.println(resultJSC);
        }
        assertTrue(resultJSC.equals(s));
    }

    @Test
    public void testDecompileWithSourceWithoutDebug() {
        decompiler.setEndPosition(-1);
        String s = decompiler.compile("abc", NO_PROPS);

        decomp