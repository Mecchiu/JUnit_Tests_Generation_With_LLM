// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {

	@Test
	void testFileLastModified() {
		LocalFileStorage storage = new LocalFileStorage();
		assertEquals(0, storage.fileLastModified("/tmp/foo.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/bar.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/baz.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuuux.txt"));
	}
}

// LocalFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;

/**
 * A FileStorage using the local file system.
 */
public class LocalFileStorage implements FileStorage {

    /**
     * Check if a file exists and when it was last modified.
     *
     * @param path path to the file
     * @return the time when the file was last modified,
     * or -1 if that information is not avaliable,
     * or 0 if the file doesn't exists.
     */
    public long fileLastModified(String path) {
        File file = new File(path);
        if (file.exists()) {
            return file.lastModified();
        }
        else {
            return 0;
        }
    }
}

// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
		
	@Test
	void testFileLastModified() {
		LocalFileStorage storage = new LocalFileStorage();
		assertEquals(0, storage.fileLastModified("/tmp/foo.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/bar.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/baz.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuuux.txt"));
	}
}

// LocalFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;

/**
 * A FileStorage using the local file system.
 */
public class LocalFileStorage implements FileStorage {

    /**
     * Check if a file exists and when it was last modified.
     *
     * @param path path to the file
     * @return the time when the file was last modified,
     * or -1 if that information is not avaliable,
     * or 0 if the file doesn't exists.
     */
    public long fileLastModified(String path) {
        File file = new File(path);
        if (file.exists()) {
            return file.lastModified();
        }
        else {
            return 0;
        }
    }
}

// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
		
	@Test
	void testFileLastModified() {
		LocalFileStorage storage = new LocalFileStorage();
		assertEquals(0, storage.fileLastModified("/tmp/foo.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/bar.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/baz.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuuux.txt"));
	}
}

// LocalFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;

/**
 * A FileStorage using the local file system.
 */
public class LocalFileStorage implements FileStorage {

    /**
     * Check if a file exists and when it was last modified.
     *
     * @param path path to the file
     * @return the time when the file was last modified,
     * or -1 if that information is not avaliable,
     * or 0 if the file doesn't exists.
     */
    public long fileLastModified(String path) {
        File file = new File(path);
        if (file.exists()) {
            return file.lastModified();
        }
        else {
            return 0;
        }
    }
}

// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
		
	@Test
	void testFileLastModified() {
		LocalFileStorage storage = new LocalFileStorage();
		assertEquals(0, storage.fileLastModified("/tmp/foo.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/bar.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/baz.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuuux.txt"));
	}
}

// LocalFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;

/**
 * A FileStorage using the local file system.
 */
public class LocalFileStorage implements FileStorage {

    /**
     * Check if a file exists and when it was last modified.
     *
     * @param path path to the file
     * @return the time when the file was last modified,
     * or -1 if that information is not avaliable,
     * or 0 if the file doesn't exists.
     */
    public long fileLastModified(String path) {
        File file = new File(path);
        if (file.exists()) {
            return file.lastModified();
        }
        else {
            return 0;
        }
    }
}

// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
		
	@Test
	void testFileLastModified() {
		LocalFileStorage storage = new LocalFileStorage();
		assertEquals(0, storage.fileLastModified("/tmp/foo.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/bar.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/baz.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuuux.txt"));
	}
}

// LocalFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;

/**
 * A FileStorage using the local file system.
 */
public class LocalFileStorage implements FileStorage {

    /**
     * Check if a file exists and when it was last modified.
     *
     * @param path path to the file
     * @return the time when the file was last modified,
     * or -1 if that information is not avaliable,
     * or 0 if the file doesn't exists.
     */
    public long fileLastModified(String path) {
        File file = new File(path);
        if (file.exists()) {
            return file.lastModified();
        }
        else {
            return 0;
        }
    }
}

// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
		
	@Test
	void testFileLastModified() {
		LocalFileStorage storage = new LocalFileStorage();
		assertEquals(0, storage.fileLastModified("/tmp/foo.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/bar.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/baz.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuuux.txt"));
	}
}

// LocalFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;

/**
 * A FileStorage using the local file system.
 */
public class LocalFileStorage implements FileStorage {

    /**
     * Check if a file exists and when it was last modified.
     *
     * @param path path to the file
     * @return the time when the file was last modified,
     * or -1 if that information is not avaliable,
     * or 0 if the file doesn't exists.
     */
    public long fileLastModified(String path) {
        File file = new File(path);
        if (file.exists()) {
            return file.lastModified();
        }
        else {
            return 0;
        }
    }
}

// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
		
	@Test
	void testFileLastModified() {
		LocalFileStorage storage = new LocalFileStorage();
		assertEquals(0, storage.fileLastModified("/tmp/foo.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/bar.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/baz.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuux.txt"));
		assertEquals(0, storage.fileLastModified("