// EncodeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {

		@Test
		void testEncode() {
				assertEquals("", Encode.encode(""));
				assertEquals("B", Encode.encode("b"));
				assertEquals("C", Encode.encode("c"));
				assertEquals("D", Encode.encode("d"));
				assertEquals("F", Encode.encode("f"));
				assertEquals("G", Encode.encode("g"));
				assertEquals("H", Encode.encode("h"));
				assertEquals("J", Encode.encode("j"));
				assertEquals("K", Encode.encode("k"));
				assertEquals("L", Encode.encode("l"));
				assertEquals("M", Encode.encode("m"));
				assertEquals("N", Encode.encode("n"));
				assertEquals("P", Encode.encode("p"));
				assertEquals("Q", Encode.encode("q"));
				assertEquals("R", Encode.encode("r"));
				assertEquals("S", Encode.encode("s"));
				assertEquals("T", Encode.encode("t"));
				assertEquals("V", Encode.encode("v"));
				assertEquals("W", Encode.encode("w"));
				assertEquals("X", Encode.encode("x"));
				assertEquals("Y", Encode.encode("y"));
				assertEquals("Z", Encode.encode("z"));
				assertEquals("b", Encode.encode("B"));
				assertEquals("c", Encode.encode("C"));
				assertEquals("d", Encode.encode("D"));
				assertEquals("f", Encode.encode("F"));
				assertEquals("g", Encode.encode("G"));
				assertEquals("h", Encode.encode("H"));
				assertEquals("j", Encode.encode("J"));
				assertEquals("k", Encode.encode("K"));
				assertEquals("l", Encode.encode("L"));
				assertEquals("m", Encode.encode("M"));
				assertEquals("n", Encode.encode("N"));
				assertEquals("p", Encode.encode("P"));
				assertEquals("q", Encode.encode("Q"));
				assertEquals("r", Encode.encode("R"));
				assertEquals("s", Encode.encode("S"));
				assertEquals("t", Encode.encode("T"));
				assertEquals("v", Encode.encode("V"));
				assertEquals("w", Encode.encode("W"));
				assertEquals("x", Encode.encode("X"));
				assertEquals("y", Encode.encode("Y"));
				assertEquals("z", Encode.encode("Z"));
				assertEquals("Cg", Encode.encode("cg"));
				assertEquals("Dh", Encode.encode("dh"));
				assertEquals("Fj", Encode.encode("fj"));
				assertEquals("Gk", Encode.encode("gk"));
				assertEquals("Hl", Encode.encode("hl"));
				assertEquals("Jm", Encode.encode("jm"));
				assertEquals("Kn", Encode.encode("kn"));
				assertEquals("Pp", Encode.encode("pp"));
				assertEquals("Qq", Encode.encode("qq"));
				assertEquals("Rr", Encode.encode("rr"));
				assertEquals("Ss", Encode.encode("ss"));
				assertEquals("Tt", Encode.encode("tt"));
				assertEquals("Vv", Encode.encode("vv"));
				assertEquals("Ww", Encode.encode("ww"));
				assertEquals("Xx", Encode.encode("xx"));
				assertEquals("Yy", Encode.encode("yy"));
				assertEquals("Zz", Encode.encode("zz"));
				assertEquals("cg", Encode.encode("Cg"));
				assertEquals("dh", Encode.encode("Dh"));
				assertEquals("fj", Encode.encode("Fj"));
				assertEquals("gk", Encode.encode("Gk"));
				assertEquals("hl", Encode.encode("Hl"));
				assertEquals("jm", Encode.encode("Jm"));
				assertEquals("kn", Encode.encode("Kn"));
				assertEquals("pp", Encode.encode("Pp"));
				assertEquals("qq", Encode.encode("Qq"));
				assertEquals("rr", Encode.encode("Rr"));
				assertEquals("ss", Encode.encode("Ss"));
				assertEquals("tt", Encode.encode("Tt"));
				assertEquals("vv", Encode.encode("Vv"));
				assertEquals("ww", Encode.encode("Ww"));
				assertEquals("xx", Encode.encode("Xx"));
				assertEquals("yy", Encode.encode("Yy"));
				assertEquals("zz", Encode.encode("Zz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz"));
				assertEquals("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz", Encode.encode("cgdhfjgkhljmknppqqrrsssttvvwwxxyyzz"));
				assertEquals("CgDhFjGkHlJmKnPpQqRrSsTtVvWwXxYyZz", Encode.encode("CgDhFjGkHlJmKnPpQqRrSsTt