// StrongestExtensionTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrongestExtension}.
* It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
*/
class StrongestExtensionTest {

	@Test
	void testStrongestExtension() {
		assertEquals("my_class.AA", StrongestExtension.strongestExtension("my_class", List.of("AA", "Be", "CC")));
		assertEquals("Watashi.eIGHt8OKe", StrongestExtension.strongestExtension("Watashi", List.of("tEN", "niNE", "eIGHt8OKe")));
		assertEquals("Boku123.YEs.WeCaNe", StrongestExtension.strongestExtension("Boku123", List.of("nani", "NazeDa", "YEs.WeCaNe", "32145tggg")));
		assertEquals("__YESIMHERE.NuLl__", StrongestExtension.strongestExtension("__YESIMHERE", List.of("t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321")));
		assertEquals("K.TAR", StrongestExtension.strongestExtension("K", List.of("Ta", "TAR", "t234An", "cosSo")));
		assertEquals("__HAHA.123", StrongestExtension.strongestExtension("__HAHA", List.of("Tab", "123", "781345", "-_-")));
		assertEquals("YameRore.okIWILL123", StrongestExtension.strongestExtension("YameRore", List.of("HhAas", "okIWILL123", "WorkOut", "Fails", "-_-")));
		assertEquals("finNNalLLly.WoW", StrongestExtension.strongestExtension("finNNalLLly", List.of("Die", "NowW", "Wow", "WoW")));
		assertEquals("_.Bb", StrongestExtension.strongestExtension("_", List.of("Bb", "91245")));
		assertEquals("Sp.671235", StrongestExtension.strongestExtension("Sp", List.of("671235", "Bb")));
	}
}