```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class StrongestExtensionTest {

    @Test
    void testStrongestExtension1() {
        List<String> extensions = Arrays.asList("AA", "Be", "CC");
        assertEquals("my_class.AA", StrongestExtension.strongestExtension("my_class", extensions));
    }

    @Test
    void testStrongestExtension2() {
        List<String> extensions = Arrays.asList("tEN", "niNE", "eIGHt8OKe");
        assertEquals("Watashi.eIGHt8OKe", StrongestExtension.strongestExtension("Watashi", extensions));
    }

    @Test
    void testStrongestExtension3() {
        List<String> extensions = Arrays.asList("nani", "NazeDa", "YEs.WeCaNe", "32145tggg");
        assertEquals("Boku123.YEs.WeCaNe", StrongestExtension.strongestExtension("Boku123", extensions));
    }

    @Test
    void testStrongestExtension4() {
        List<String> extensions = Arrays.asList("t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321");
        assertEquals("__YESIMHERE.NuLl__", StrongestExtension.strongestExtension("__YESIMHERE", extensions));
    }

    @Test
    void testStrongestExtension5() {
        List<String> extensions = Arrays.asList("Ta", "TAR", "t234An", "cosSo");
        assertEquals("K.TAR", StrongestExtension.strongestExtension("K", extensions));
    }

    @Test
    void testStrongestExtension6() {
        List<String> extensions = Arrays.asList("Tab", "123", "781345", "-_-");
        assertEquals("__HAHA.123", StrongestExtension.strongestExtension("__HAHA", extensions));
    }

    @Test
    void testStrongestExtension7() {
        List<String> extensions = Arrays.asList("HhAas", "okIWILL123", "WorkOut", "Fails", "-_-");
        assertEquals("YameRore.okIWILL123", StrongestExtension.strongestExtension("YameRore", extensions));
    }

    @Test
    void testStrongestExtension8() {
        List<String> extensions = Arrays.asList("Die", "NowW", "Wow", "WoW");
        assertEquals("finNNalLLly.WoW", StrongestExtension.strongestExtension("finNNalLLly", extensions));
    }

    @Test
    void testStrongestExtension9() {
        List<String> extensions = Arrays.asList("Bb", "91245");
        assertEquals("_.Bb", StrongestExtension.strongestExtension("_", extensions));
    }

    @Test
    void testStrongestExtension10() {
        List<String> extensions = Arrays.asList("671235", "Bb");
        assertEquals("Sp.671235", StrongestExtension.strongestExtension("Sp", extensions));
    }
}
```
