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
/**
		* The constructor of Class{}
		*/
		public UserTest() {
		}

 	/**
 	 * Test method for checkIdentification method
 	 * @throws java.lang.Exception
 	*/
		@Test
		public void testCheckIdentification() throws Exception {
			// initialize environment
			initializeEnvironment();
			String test = "test";
			String expected = "1e9c8a36c39a749b8fc74efad2ce05c6";
			
			
			String actual = null;
			// add identities
			HashSet identities = new HashSet();
			Set<String> ldapIdentities = new HashSet<String>();
			
			Iterator<IdentityType> iIter = new User().getAllIdentityTypes().iterator();
			Base64 alphabeticBase64 = new Base64();
			Properties props = new Properties();
			props.setProperty("javax.naming.directory.searchBase", "ou=Users,dc=Browsersoft,dc=java");
			MessageDigest testDigest;
			String sDigest;
			
			// add identities to the env
			while(iIter.hasNext()) {
						identities.add(iIter.next().getIdentifier().toString());
					}
			
			while(iIter.hasNext()) 			
				ldapIdentities.add(iIter.next().getIdentifier().toString());
				
			
			props.setProperty("id.identifier", " ".join(identities));
			props.setProperty("id.issuer", Identity.BrowsersoftIdentifier);
			props.setProperty("id.commonName", "testid.com");
			props.setProperty("id.emailAddress", "testid@java.com");

			// check identify without identities
			testDigest = getDigest(test);
			actual = alphabeticBase64.encode(testDigest.digest());
			
			sDigest = Base64.encodeBase64(expected.getBytes());
			
			assertTrue(expected.equals(actual));
		}

	/**
	* Test method for checkDigest method
	* It does not throw an exception
     */
    @Test
    public void testCheckDigest() {
        // check correct digest
        String digest = null;
        digest = Base64.encodeBase64(getDigest(new String("Test")));
        assertEquals(digest, "1e9c8a36c39a749b8fc74efad2ce05c6");
    }
 
  /**
  * Test method for getAllIdentityTypes method
  */

    @Test
    public void testGetAllIdentityTypes() {
       Set<Identity> ldapIdentities;

       ldapIdentities = new HashSet<Identity>();
       ldapIdentities.add(new User().createIdentifier());
       setAllUsersOf(ldapIdentities);
       Iterator<Identity> iIter = ldapIdentities.iterator();

       // check the number of identities returned
       assertEquals(ldapIdentities.size(),0);
       System.out.println("getAllIdentityTypes");
       
       // create some identities
       HashSet<IdentityType> ldapIdentitiesOfClassOne = new HashSet<Identity>();
       String user1 = "user1";
       String name = "name1";
       HashSet<IdentityType> ldapIdentitiesOfTestSystem = testSystem("user1", name);
       System.out.println(ldapIdentitiesOfTestSystem);
       ldapIdentitiesOfTestSystem.add(new IdentityType().createIdentifier());
       ldapIdentitiesOfOfClassOne.addAll(ldapIdentitiesOfTestSystem);
       System.out.println();
       // add the same identity multiple times
       for(int i=0; i<2; i++) {
           String type1 = "testType1";
           String type2 = "testType2";
           ldapIdentitiesOfClassOne.addAll(ldapIdentitiesOfTestSystem);

           Set ldapIdentitiesOfClassOneOfTestSystem = new HashSet();
           ldapIdentitiesOfClassOneOfTestSystem.addAll(ldapIdentitiesOfClassOne);
           System.out.println("ldapIdentitiesOfClassOneOfTestSystem : "+ldapIdentitiesOfClassOneOfTestSystem.size());
           if(i == 0) {
              System.out.println("add id to class1: "+ldapIdentitiesOfOfClassOneOfTestSystem.size());
              ldapIdentitiesOfOfClassOneOfTestSystem.addAll(ldapIdentitiesOfOfClassOne);
           }
           if(i == 1) {
              System.out.println("add id to class2: "+ldapIdentitiesOfOfClassOneOfTestSystem.size());
              ldapIdentitiesOfOfClassOneOfTestSystem.addAll(ldapIdentitiesOfOfClassOne);
           }
           ldapIdentitiesOfClassOne.addAll(ldapIdentitiesOfOfClassOneOfTestSystem);
           System.out.println();
       }
       
       Iterator<IdentityType> iIter = new IdentityType().getAllIdentifierTypes().iterator();
       Set<IdentityType> ldapIdentitiesOfTestSystemsOfClassOne = testSystem("user1", "name1");
        ldapIdentitiesOfOfClassOne.addAll(ldapIdentitiesOfTestSystemsOfClassOne);
       System.out.println("ldapIdentitiesOfTestSystemsOfClassOne :"+ldapIdentitiesOfOfClassOne.size());
       if(iIter.hasNext()) {
          ldapIdentitiesOfClassOne.remove(iIter.next());
       }
       
       List<IdentityType> ldapIdentitiesOfClassOneOfTestSystem = new ArrayList(ldapIdentitiesOfOfClassOne.iterator());
       System.out.println(ldapIdentitiesOfOfClassOneOfTestSystem.iterator().next());
       System.out.println("ldapIdentitiesOfClass1ofTestSystem" + ldapIdentitiesOfClassOneOfTestSystem.size());
       ldapIdentitiesOfClassOneOfTestSystemList.addAll(ldapIdentitiesOfClassOneOfTestSystem);
       System.out.println("ldapIdentitiesOfClass1ofTestSystemList" + ldapIdentitiesOfClassOneOfTestSystemList.size());
    }
        
    private MessageDigest getDigest (String str) {
        MessageDigest msg = (MessageDigest) MessageDigest.getInstance(str);
        return msg;
    }
    
    private Set<Identity> testServerForUsersOf(){
        Set<Identity> ldapIdentities;
