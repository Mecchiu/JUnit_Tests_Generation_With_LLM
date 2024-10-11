```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    @Test
    void testEncryptHi() {
        assertEquals("lm", Encrypt.encrypt("hi"));
    }

    @Test
    void testEncryptAsdfghjkl() {
        assertEquals("ewhjklnop", Encrypt.encrypt("asdfghjkl"));
    }

    @Test
    void testEncryptGf() {
        assertEquals("kj", Encrypt.encrypt("gf"));
    }

    @Test
    void testEncryptEt() {
        assertEquals("ix", Encrypt.encrypt("et"));
    }

    @Test
    void testEncryptFaewfawefaewg() {
        assertEquals("jeiajeaijeiak", Encrypt.encrypt("faewfawefaewg"));
    }

    @Test
    void testEncryptHellomyfriend() {
        assertEquals("lippsqcjvmirh", Encrypt.encrypt("hellomyfriend"));
    }

    @Test
    void testEncryptDxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh() {
        assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
    }

    @Test
    void testEncryptA() {
        assertEquals("e", Encrypt.encrypt("a"));
    }
}
```