// PasswordField_1Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(InputStream, String)} method.
*/
class PasswordField_1Test {

	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	public void testGetPassword_1() throws Exception {
		try {
			PasswordField.getPassword(null, "test");
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* Test data: empty string.
	* Expected result: IllegalArgumentException.
	*/
	@Test
	public void testGetPassword_2() throws Exception {
		try {
			PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), "test");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* Test data: empty string.
	* Expected result: IllegalArgumentException.
	*/
	@Test
	public void testGetPassword_3() throws Exception {
		try {
			PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), "test");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* Test data: empty string.
	* Expected result: IllegalArgumentException.
	*/
	@Test
	public void testGetPassword_4() throws Exception {
		try {
			PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), "test");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* Test data: empty string.
	* Expected result: IllegalArgumentException.
	*/
	@Test
	public void testGetPassword_5() throws Exception {
		try {
			PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), "test");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* Test data: empty string.
	* Expected result: IllegalArgumentException.
	*/
	@Test
	public void testGetPassword_6() throws Exception {
		try {
			PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), "test");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* Test data: empty string.
	* Expected result: IllegalArgumentException.
	*/
	@Test
	public void testGetPassword_7() throws Exception {
		try {
			PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), "test");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* Test data: empty string.
	* Expected result: IllegalArgumentException.
	*/
	@Test
	public void testGetPassword_8() throws Exception {
		try {
			PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), "test");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* Test data: empty string.
	* Expected result: IllegalArgumentException.
	*/
	@Test
	public void testGetPassword_9() throws Exception {
		try {
			PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), "test");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* Test data: empty string.
	* Expected result: IllegalArgumentException.
	*/
	@Test
	public void testGetPassword_10() throws Exception {
		try {
			PasswordField.getPassword(new ByteArrayInputStream(new byte[0]), "test");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// OK
		}
	}
	
}

// MaskingThread.java
/*
 * This file is part of the QuickServer library 
 * Copyright (C) QuickServer.org
 *
 * Use, modification, copying and distribution of this software is subject to
 * the terms and conditions of the GNU Lesser General Public License. 
 * You should have received a copy of the GNU LGP License along with this 
 * library; if not, you can download a copy from <http://www.quickserver.org/>.
 *
 * For questions, suggestions, bug-reports, enhancement-requests etc.
 * visit http://www.quickserver.org
 *
 */
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 * This class attempts to erase characters echoed to the console.
 * @since 1.4
 */
class MaskingThread extends Thread {
    private volatile boolean stop;
    private char echochar = '*';

    /**
     *@param prompt The prompt displayed to the user
     */
    public MaskingThread(String prompt) {
        System.out.print(prompt);
    }

    /**
     * Begin masking until asked to stop.
     */
    public void run() {
        int priority = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        try {
            stop = true;
            while (stop) {
                System.out.print("\010" + echochar);
                try {
                    // attempt masking at this rate
                    Thread.sleep(1);
                } catch (InterruptedException iex) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } finally { // restore the original priority
            Thread.currentThread().setPriority(priority);
        }
    }

    /**
     * Instruct the thread to stop masking.
     */
    public void stopMasking() {
        this.stop = false;
    }
}

// PasswordField_2Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordField_2Test {
		
	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	