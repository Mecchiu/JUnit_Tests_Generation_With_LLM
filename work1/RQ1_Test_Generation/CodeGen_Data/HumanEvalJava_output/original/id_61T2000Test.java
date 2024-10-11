// CorrectBracketing1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains one unit test case for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {

    @Test
    public final void test_1() {
        assertTrue(
                correctBracketing(
                        " ( "
                ).equals(
                        correctBracketing((" "( "))
                )
                )
        );
        assertTrue(
                correctBracketing(
                        "(   "
                ).equals(
                        correctBracketing(("    ")
                )
                )
                );
        assertTrue(
                correctBracketing(
                        "((())"
                ).equals(
                        correctBracketing(("()()"))
                )
                );
        assertTrue(
                correctBracketing(
                        "((())"
                ).equals(
                        correctBracketing(("()()()"))
                )
                );
        assertTrue(
                correctBracketing(
                        "("
                ).equals(
                        correctBracketing(("()")
                )
                )
                );
        assertFalse(
                correctBracketing(
                        ()
                ).equals(
                        correctBracketing(("()")
                )
                )
                );
        assertFalse(
                correctBracketing(
                        "("
                ).equals(
                        correctBracketing(("()()")
                )
                )
                );
        assertFalse(
                correctBracketing(
                        ")("
                ).equals(
                        correctBracketing(("()"))))
        ;
        assertFalse(
                correctBracketing(
                        ")("
                ).equals(
                        correctBracketing(("()")
                )
                )
                );
        assertTrue(
                correctBracketing("()").equals(
                        correctBracketing("()")
                )
        );
        assertTrue(
                correctBracketing("()()()").equals(
                        correctBracketing("()()")
                        )
        );
    }
}
