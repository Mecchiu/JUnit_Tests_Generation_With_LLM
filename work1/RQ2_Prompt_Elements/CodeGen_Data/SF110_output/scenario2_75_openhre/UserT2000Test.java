// UserTest.java
package com.browsersoft.aacs;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import javax.naming.ldap.LdapContext;
import org.apache.xerces.impl.dv.util.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link User}.
* It contains one unit test case for the {@link User#checkDigest(String, String)} method.
*/
class UserTest {
@Test
        public void test() {
            // Test case for check against ID
            String hash = sha.digest("{SHA}").substring(0, 20);
            String identity = sha.digest("{SSHA}").substring(0, 30);
            int identitysize = identity.length();
            String password = sha.digest("{PWHASH}").substring(0, 20);
            int passwordsize = password.length();
            int hashsize = 20;
            
			/*
			 * Check Digest against Identifer
			 *
			 * TODO: I should get "null" when the value for password is null (not all fields)
			 */
            if (messageDigest == null) {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update("{SHA}".getBytes());
                hash = md.digest();
            }
			/*
			 * Check Digest against Id of the User.
			 *
			 * For example, test for a user with one identity, id="rootuserid"
			 *
			 * NOTE: the password is not verified, since it depends on user's password length
			 */
            String[] tokens = {"user", "id", "password"};
            boolean valid = false;
            for (String value : tokens) {
                /* TODO: this could be made more precise by passing "password" as string to test()
                                but it should work fine for now */
                String value0 = value;
                if (password == null) {
                    value = value0.substring(0, 1);
                } else {
                    value = value.substring(0, 1);
                }
                for (String username : tokens) {
                    if (!User.checkIdentifier(username, value0))
                        continue;
                    HashSet uname = new HashSet();
                    uname.add(username);
                    uname.add("password");
                    if (User.checkPassword(username, value)) {
                        valid = true;
                        break;
                    }
                }
            }
            assertTrue("CheckDigest did not match for username: " + value0, valid);
            
            /*
			 * Get Password.
			 */
                                        if (password.length() <= passwordsize) {
                                            password = Base64.decode(password.toCharArray());
                                        } else if (password.length() > passwordsize) {
                                            password = Base64.encode(password);
                                        }
                                        
            assertTrue("Password is equal to the one sent to user", sha.digest("{PWHASH}".getBytes()) == password);
            /*
			 * Compare Id
			 */
                                        // TODO: this could be made more precise by passing "password" as string to test()
                                        if (password.length() <= passwordsize) {
			                    String[] token = {user, id, password};
                                                Base64.encode(token);
                                            int position = 0;
                                            iteration = 0;
                                            hash = sha.digest("{SHA}".getBytes());
                                            while (iteration < 10) {
                                                position = 0;
                                                value = sha.digest("{SHA}".getBytes());
                                                System.out.print(
                                                    value);
                                                if (hash!= null) {
                                                    if (base64 == null)
                                                            hash = base64.hash(hash.getBytes(), hash.getBytes().length); 
                                                        byte b = 0;
                                                    do {
                                                         b = (byte) (hash[position] ^ value[position]);
                                                         System.out.print(
                                                            b);
                                                         iteration++;
                                                        } while (position++;++position < 20);
                                                } else {
                                                    if (hash==null)
                                                            hash = Base64.encode(value);
                                                         position = 0;
                                                         b = value[0];
                                                         System.out.print(
                                                            b);
                                                         iteration++;
                                                }
                                                try {  
                                                    Thread.sleep(10);
                                                } catch (InterruptedException e) {
                                                    AssertionError.setB(e);
                                                }
                                            }
                                        }
			/*
			 * compare
			 */
                                            // we are using a tokenizer to avoid time zone savings.
                                            StringTokenizer st = new StringTokenizer(value.toCharArray(), '-', 8);
                                            if (st.hasMoreTokens()) {
                                                Object o = st.nextToken().trim();
				            // System.out.println("comparing password: " + o.toString());
                                            } else {
                                                // not possible to have it in result set without it.
                                                    assertFalse("checkDigest did not match for username: " + token.toString(), valid);
                                            }
			/*
			 * Check Identifier
			 */
            String username = tokens[0];
            //
            byte[] hash0;
            String value0;
            messageDigest = null;
            iter