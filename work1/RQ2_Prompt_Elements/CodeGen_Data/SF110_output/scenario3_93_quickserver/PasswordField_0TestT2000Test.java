// PasswordField_0Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains one unit test case for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordField_0Test {
class PasswordTestCase {
			String value;

			PasswordTestCase() { value = null; }

			PasswordTestCase(String value) { this.value = value; }
		}

		private static char[] getPassword(String prompt) throws IOException {
			Writer pwFile = null;
			StringWriter pswFile = null;
			try {
				pwFile = new StringWriter();
				pswFile = new StringWriter();
				BufferedReader pRead = new BufferedReader(new InputStreamReader(
						new InputStreamReader(System.in), "UTF-8"));
				pRead.readLine(); // Skip user interface input
				// This call takes some time.
				int lineNum = 0;
				while(true) {
					try {
						passwordTestReceiveFromServer(pwFile, pswFile);
						pRead.readLine();
					} catch(NoSuchAlgorithmException nsae) {
	//			    	    System.out.println("Caught NoSuchAlgorithmException!");
						continue;
					} catch (IOException ioex) {
						throw new IOException(ioex.getMessage());
					}
					lineNum++;
					assertTrue("Server did not echo 'Password: " + lineNum + "'!",
							lineNum == 1);
					if (System.lineSeparator() == 0) break;
				} // loop
				pRead.close();
				return pRead.toString().toCharArray();
			} finally {
				pRead.close();
				pwFile.close();
			} // finally
		}

		private static void passwordTestReceiveFromServer(final Writer pwFile,
				final StringWriter pswFile) throws IOException {
				try {
					int userInputCnt = 0;
					char[] passwdArray = getPassword(prompt);
					final char lastCharWas = passwdArray[passwdArray.length-1];
					while((userInputCnt < 3) || (userInputCnt > 3 && lastCharWas!= 'S')) {
						int cnt = 0;
						String inputString = KeyboardFocusManager.getCurrentKeyboard().getSystemSelection().replace("\t\u2000", "\\t").replace("" +
								'\n', '\\n');
						inputString = getSeparator(inputString, lastCharWas, "(" + String.valueOf(cnt) + ')', cnt);
						inputString = getSeparator(inputString, lastCharWas, "(" + String.valueOf(cnt) + ")");
						inputString = getSeparator(inputString, lastCharWas, "\\n", cnt);
						System.out.write(passwdArray, 0, passwordArray.length);
						System.out.write(userInputCnt == 3? "\n": ";-"); // if user input == 3, it writes to pswFile, which is '\n' by default.
						pwFile.write(inputString);
						pwFile.write('\n');
						pwFile.write(lastCharWas + ": password = ");
						pwFile.write(createPasswordFromCharArray(passwdArray, cnt));
						int cntX = String.valueOf(cnt).indexOf(" ");
						if (cntX!= -1)
							cnt = 0;
						userInputCnt++;
						if (cnt >= 3) break; // exit loop if possible
						System.out.write(passwdArray, 0, passwdArray.length);
						System.out.write(lastCharWas + ": (") + userInputCnt + " < ");
					}
				} catch(IOException ioex) {
					throw new IOException("Caught IOException!", ioex);
				}
		} // testReceiveFromServer()

		private static String createPasswordFromCharArray(char[] charArray, int i) {
			int charCnt = charArray.length;
			int passwordLen = i + (charCnt - 1) / 2; // 1st line plus one character for '\0'
			if (passwordLen > 30) passwordLen = 30; // max allowed
			final char[] password = new char[passwordLen];
			System.arraycopy(charArray, 0, password, 0, i);
			for(int k = i ; k < passwordLen ; k++) {
				char c = (char)charArray[k];
				password[k-i] = '"';
				password[k-i+1] = c;
				password[k-i+2] = '"';
			}
			return new String(password);
		} // passwordFromCharArray()
	} // class PasswordField_0Test
