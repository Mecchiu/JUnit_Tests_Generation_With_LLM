// PasswordField_0Test.java
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
class PasswordField_0Test {

	@Test
	void testGetPassword_0() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\n").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_1() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\r\n").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_2() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\r").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_3() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\n").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(System.in, prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_4() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\r\n").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(System.in, prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_5() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\r").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(System.in, prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_6() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\n").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_7() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\r\n").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_8() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\r").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_9() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\n").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(System.in, prompt);
		assertEquals(password, new String(result));
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

// PasswordField_1Test.java
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
class PasswordField_1Test {
		
	@Test
	void testGetPassword_0() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\n").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_1() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\r\n").getBytes());
		System.setIn(in);
		char[] result = PasswordField.getPassword(prompt);
		assertEquals(password, new String(result));
	}
	
	@Test
	void testGetPassword_2() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		ByteArrayInputStream in = new ByteArrayInputStream((password+"\r").getBytes());
		System.setIn(in);
		char[] result