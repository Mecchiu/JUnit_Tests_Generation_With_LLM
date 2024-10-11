// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains one unit test case for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {
		static { NativeJavaLevel.init(); }

	private String encoded;
	private int compiled;
	private int unescapedCount;
	private boolean inUseEscaped = false;

    public DecompilerTest(String encoded, int compiled) {
		this.encoded = encoded;
		this.compiled = compiled;
		this.unescapedCount = 0;
	}

	@Test
	void testDecompile() throws CompilerError {
		if ( inUseEscaped )
			throw error("inUseEscaped is set.");

		Decompiler decompiler = new Decompiler();

		if (inUseEscaped)
			decompiler = decoder(deoptimize());

		decompiler.setSource(this.encoded);
		decompiler.decompile(sourceTop, source, UNESCAPED_PROP, properties);
		assertTrue(DECOMPILE_VALID, decompiler.hasErrors());
		assertEquals("source", 1, unescapedCount);
		if ( printSource)
			decompiler.printSource();
		assertEquals("source", 0, sourceTop);
		decompiler.printSource();
		assertTrue(DECOMPILE_VALID, decompiler.hasErrors());
	}

	private Decompiler deoptimize() {
		Decompiler decompiler = new Decompiler();
		decompiler.setSource(encoded);
		decompiler.deoptimize();
		return decompiler;
	}

	public int getSource() {
		return compiled;
	}

	public int getCompiled() {
		return compiled;
	}

	public List<UnescapedToken> getTokens() {
		List<UnescapedToken> tokens = new LinkedList<UnescapedToken>();
		unescapedCount = 0;
		sourceTop = 0;
		addToken(Token.ASSIGN, Token.TRUE);
		addName(encoded);
		addEOL(Token.EOF);
		//
		decompiler.setSource(encoded);
		tokens.add(decompiler.decodeToken());
		decompiler.setSource(encoded);
		return tokens;
	}

	Decompiler clone() {
			return new Decompiler(encoded, compiled);
	}

	public void reset() {
		decompiler.reset();
		sourceTop = 0;
		unescapedCount = 0;
	}
}