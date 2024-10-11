// FileNameCheckTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains one unit test case for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {
// FileNameCheck.java
package scenario1;

import java.util.Arrays;

class FileNameCheck {

    public static String fileNameCheck(String fileName) {
        String[] suf = { "txt", "exe", "dll" };
        String[] lst = fileName.split("\\.");
        if (lst.length!= 2) {
            return "No";
        }
        if (!Arrays.asList(suf).contains(lst[1])) {
            return "No";
        }
        if (lst[0].length() == 0) {
            return "No";
        }
        if (!Character.isLetter(lst[0].charAt(0))) {
            return "No";
        }
        int t = 0;
        for (int i = 0; i < lst[0].length(); i++) {
            if (Character.isDigit(lst[0].charAt(i))) {
                t++;
            }
        }
        if (t > 3) {
            return "No";
        }
        return "Yes";
    }
}

// FileNameCheckTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains one unit test case for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {
		
	private final FileNameCheck fnc = new FileNameCheck();
	
	@Test
    void test0() {
        assertTrue(fnc.fileNameCheck("c:\\d.txt") == "Yes");
        assertTrue(fnc.fileNameCheck("c:\\d.txt") == "No");
        assertTrue(fnc.fileNameCheck("c:\\01.txt") == "No");
        assertTrue(fnc.fileNameCheck("c:\\p0_0_1Px") == "No");
        assertTrue(fnc.fileNameCheck("c:\\p1_2\\q3.p1s\\file12") == "No");
        assertTrue(fnc.fileNameCheck("c:\\7k8nfhqk4s9-d.p1") == "No");
        assertTrue(fnc.fileNameCheck("c:\\7k8nfhqk4s9-d.p1") == "No");
        assertTrue(fnc.fileNameCheck("c:\\7k8nfhqk4s9-d.p1") == "No");	
        assertFalse(fnc.fileNameCheck("c:\\7k8nfhqk4s9-d.p1") == "Yes");
    }
	
	@Test
    void test1() {
        assertTrue(fnc.fileNameCheck("c:\\d.txt") == "Yes");
        assertTrue(fnc.fileNameCheck("c:\\d.txt") == "Yes");
        assertTrue(fnc.fileNameCheck("c:\\07.txt") == "Yes");
        assertTrue(fnc.fileNameCheck("c:\\07.txt") == "Yes");
        assertTrue(fnc.fileNameCheck("c:\\7k8nfhqk4s9-d.txt") == "Yes");
        assertTrue(fnc.fileNameCheck("c:\\7k8nfhqk4s9-d.txt") == "Yes");
        assertFalse(fnc.fileNameCheck("c:\\07k8nfhqk4s9-d.txt") == "No");
    }
	
}
