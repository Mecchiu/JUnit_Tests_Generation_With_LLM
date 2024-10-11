// StrongestExtension.java
package scenario3;

import java.util.List;

class StrongestExtension {

    /**
     * You will be given the name of a class (a string) and a list of extensions.
     * The extensions are to be used to load additional classes to the class. The
     * strength of the extension is as follows: Let CAP be the number of the uppercase
     * letters in the extension's name, and let SM be the number of lowercase letters
     * in the extension's name, the strength is given by the fraction CAP - SM.
     * You should find the strongest extension and return a string in this
     * format: ClassName.StrongestExtensionName.
     * If there are two or more extensions with the same strength, you should
     * choose the one that comes first in the list.
     * For example, if you are given "Slices" as the class and a list of the
     * extensions: ['SErviNGSliCes', 'Cheese', 'StuFfed'] then you should
     * return 'Slices.SErviNGSliCes' since 'SErviNGSliCes' is the strongest extension
     * (its strength is -1).
     * Example:
     * for strongestExtension('my_class', ['AA', 'Be', 'CC']) == 'my_class.AA'
     *
     * > strongestExtension("Watashi", ["tEN", "niNE", "eIGHt8OKe"])
     * "Watashi.eIGHt8OKe"
     * > strongestExtension("Boku123", ["nani", "NazeDa", "YEs.WeCaNe", "32145tggg"])
     * "Boku123.YEs.WeCaNe"
     * > strongestExtension("__YESIMHERE", ["t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321"])
     * "__YESIMHERE.NuLl__"
     * > strongestExtension("K", ["Ta", "TAR", "t234An", "cosSo"])
     * "K.TAR"
     * > strongestExtension("__HAHA", ["Tab", "123", "781345", "-_-"])
     * "__HAHA.123"
     * > strongestExtension("YameRore", ["HhAas", "okIWILL123", "WorkOut", "Fails", "-_-"])
     * "YameRore.okIWILL123"
     * > strongestExtension("finNNalLLly", ["Die", "NowW", "Wow", "WoW"])
     * "finNNalLLly.WoW"
     * > strongestExtension("_", ["Bb", "91245"])
     * "_.Bb"
     * > strongestExtension("Sp", ["671235", "Bb"])
     * "Sp.671235"
     */
    public static String strongestExtension(String className, List<String> extensions) {
        String strongestExtension = "";
        int strongestStrength = Integer.MIN_VALUE;
        for (String extension : extensions) {
            int capCount = 0;
            int smCount = 0;
            for (char c : extension.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    capCount++;
                } else if (Character.isLowerCase(c)) {
                    smCount++;
                }
            }
            int strength = capCount - smCount;
            if (strength > strongestStrength) {
                strongestExtension = extension;
                strongestStrength = strength;
            }
        }
        return className + "." + strongestExtension;
    }
}

// StrongestExtensionTest.java
package scenario3;

import java.util.Arrays;
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
        assertEquals("my_class.AA", StrongestExtension.strongestExtension("my_class", Arrays.asList("AA", "Be", "CC")));
        assertEquals("Watashi.eIGHt8OKe", StrongestExtension.strongestExtension("Watashi", Arrays.asList("tEN", "niNE", "eIGHt8OKe")));
        assertEquals("Boku123.YEs.WeCaNe", StrongestExtension.strongestExtension("Boku123", Arrays.asList("nani", "NazeDa", "YEs.WeCaNe", "32145tggg")));
        assertEquals("__YESIMHERE.NuLl__", StrongestExtension.strongestExtension("__YESIMHERE", Arrays.asList("t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321")));
        assertEquals("K.TAR", StrongestExtension.strongestExtension("K", Arrays.asList("Ta", "TAR", "t234An", "cosSo")));
        assertEquals("__HAHA.123", StrongestExtension.strongestExtension("__HAHA", Arrays.asList("Tab", "123", "781345", "-_-")));
        assertEquals("YameRore.okIWILL123", StrongestExtension.strongestExtension("YameRore", Arrays.asList("HhAas", "okIWILL123", "WorkOut", "Fails", "-_-")));
        assertEquals("finNNalLLly.WoW", StrongestExtension.strongestExtension("finNNalLLly", Arrays.asList("Die", "NowW", "Wow", "WoW")));
        assertEquals("_.Bb", StrongestExtension.strongestExtension("_", Arrays.asList("Bb", "91245")));
        assertEquals("Sp.671235", StrongestExtension.strongestExtension("Sp", Arrays.asList("671235", "Bb")));
    }
}