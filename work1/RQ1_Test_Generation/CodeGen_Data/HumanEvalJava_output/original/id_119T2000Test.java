// MatchParensTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains one unit test case for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {

    @Test
        void testMatchParens() {
            String s = "Yes";
            assertFalse(MatchParens.matchParens([]).isMatch("yEs"));
            assertFalse(MatchParens.matchParens([]).isMatch("Ys"));
            assertFalse(MatchParens.matchParens([]).isMatch("nE"));
            assertFalse(MatchParens.matchParens([]).isMatch("N"));
            assertTrue(MatchParens.matchParens([]).isMatch("No"));
            assertFalse(MatchParens.matchParens([]).isMatch("nyEs"));
            assertFalse(MatchParens.matchParens([]).isMatch("yEss"));
            assertFalse(MatchParens.matchParens([]).isMatch("nEss"));
            assertFalse(MatchParens.matchParens([]).isMatch("Nss"));
            assertFalse(MatchParens.matchParens([]).isMatch("oN"));
            assertFalse(MatchParens.matchParens([]).isMatch("On"));
            assertFalse(MatchParens.matchParens([]).isMatch("Of"));
            assertTrue(MatchParens.matchParens([]).isMatch("Yes"));
            assertFalse(MatchParens.matchParens([]).isMatch("tEs"));
            assertFalse(MatchParens.matchParens([]).isMatch("Yt"));

            String s1 = "";
            List<String> lst = new LinkedList<String>();
            //List<String> lst1 = new LinkedList<String>();
            assertTrue(MatchParens.matchParens(lst).isMatch(s));
            assertTrue(MatchParens.matchParens(lst).isMatch(s1));

            lst = new LinkedList<String>();
            //List<String> lst1 = new LinkedList<String>();
            assertTrue(MatchParens.matchParens(lst).isMatch(s));
            assertFalse(MatchParens.matchParens(lst).isMatch(s1));

            lst = new LinkedList<String>();
            //List<String> lst1 = new LinkedList<String>();
            assertFalse(MatchParens.matchParens(lst).isMatch(s));
            assertTrue(MatchParens.matchParens(lst).isMatch(s1));
        }

}
