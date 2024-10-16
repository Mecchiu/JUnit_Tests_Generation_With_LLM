/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1.pkcs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERConstructedSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.DERConstructedSequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Name;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CertificationRequestInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      X509Name x509Name0 = new X509Name((Vector) vector0, (Hashtable) null);
      SubjectPublicKeyInfo subjectPublicKeyInfo0 = new SubjectPublicKeyInfo((AlgorithmIdentifier) null, (DEREncodable) null);
      DERSet dERSet0 = new DERSet((DEREncodable) null);
      CertificationRequestInfo certificationRequestInfo0 = new CertificationRequestInfo(x509Name0, subjectPublicKeyInfo0, (ASN1Set) dERSet0);
      X509Name x509Name1 = certificationRequestInfo0.getSubject();
      assertSame(x509Name0, x509Name1);
  }

  @Test
  public void test1()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      X509Name x509Name0 = new X509Name((Vector) vector0, (Hashtable) null);
      SubjectPublicKeyInfo subjectPublicKeyInfo0 = new SubjectPublicKeyInfo((AlgorithmIdentifier) null, (DEREncodable) null);
      DERSet dERSet0 = new DERSet((DEREncodable) null);
      CertificationRequestInfo certificationRequestInfo0 = new CertificationRequestInfo(x509Name0, subjectPublicKeyInfo0, (ASN1Set) dERSet0);
      DERSet dERSet1 = (DERSet)certificationRequestInfo0.getAttributes();
      assertSame(dERSet1, dERSet0);
  }

  @Test
  public void test2()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      X509Name x509Name0 = new X509Name((Vector) vector0, (Hashtable) null);
      SubjectPublicKeyInfo subjectPublicKeyInfo0 = new SubjectPublicKeyInfo((AlgorithmIdentifier) null, (DEREncodable) null);
      DERSet dERSet0 = new DERSet((DEREncodable) null);
      CertificationRequestInfo certificationRequestInfo0 = new CertificationRequestInfo(x509Name0, subjectPublicKeyInfo0, (ASN1Set) dERSet0);
      assertNotNull(certificationRequestInfo0);
      
      DERInteger dERInteger0 = certificationRequestInfo0.getVersion();
      assertNotNull(dERInteger0);
      assertEquals("0", dERInteger0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      X509Name x509Name0 = new X509Name((Vector) vector0, (Hashtable) null);
      SubjectPublicKeyInfo subjectPublicKeyInfo0 = new SubjectPublicKeyInfo((AlgorithmIdentifier) null, (DEREncodable) null);
      DERSet dERSet0 = new DERSet((DEREncodable) null);
      CertificationRequestInfo certificationRequestInfo0 = new CertificationRequestInfo(x509Name0, subjectPublicKeyInfo0, (ASN1Set) dERSet0);
      SubjectPublicKeyInfo subjectPublicKeyInfo1 = certificationRequestInfo0.getSubjectPublicKeyInfo();
      assertSame(subjectPublicKeyInfo1, subjectPublicKeyInfo0);
  }

  @Test
  public void test4()  throws Throwable  {
      BERConstructedSequence bERConstructedSequence0 = new BERConstructedSequence();
      // Undeclared exception!
      try {
        CertificationRequestInfo.getInstance((Object) bERConstructedSequence0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0 >= 0
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try {
        CertificationRequestInfo.getInstance((Object) "DER");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * unknown object in factory
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      BERSet bERSet0 = new BERSet();
      CertificationRequestInfo certificationRequestInfo0 = null;
      try {
        certificationRequestInfo0 = new CertificationRequestInfo((X509Name) null, (SubjectPublicKeyInfo) null, (ASN1Set) bERSet0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Not all mandatory fields set in CertificationRequestInfo generator.
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      DERConstructedSequence dERConstructedSequence0 = new DERConstructedSequence();
      X509Name x509Name0 = new X509Name((ASN1Sequence) dERConstructedSequence0);
      DERSet dERSet0 = new DERSet((DEREncodable) x509Name0);
      CertificationRequestInfo certificationRequestInfo0 = null;
      try {
        certificationRequestInfo0 = new CertificationRequestInfo(x509Name0, (SubjectPublicKeyInfo) null, (ASN1Set) dERSet0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Not all mandatory fields set in CertificationRequestInfo generator.
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      X509Name x509Name0 = new X509Name((Vector) vector0, (Hashtable) null);
      SubjectPublicKeyInfo subjectPublicKeyInfo0 = new SubjectPublicKeyInfo((AlgorithmIdentifier) null, (DEREncodable) null);
      CertificationRequestInfo certificationRequestInfo0 = new CertificationRequestInfo(x509Name0, subjectPublicKeyInfo0, (ASN1Set) null);
      assertNotNull(certificationRequestInfo0);
      
      DERSequence dERSequence0 = (DERSequence)certificationRequestInfo0.getDERObject();
      assertEquals(3, dERSequence0.size());
  }

  @Test
  public void test9()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      X509Name x509Name0 = new X509Name((Vector) vector0, (Hashtable) null);
      SubjectPublicKeyInfo subjectPublicKeyInfo0 = new SubjectPublicKeyInfo((AlgorithmIdentifier) null, (DEREncodable) null);
      DERSet dERSet0 = new DERSet((DEREncodable) null);
      CertificationRequestInfo certificationRequestInfo0 = new CertificationRequestInfo(x509Name0, subjectPublicKeyInfo0, (ASN1Set) dERSet0);
      assertNotNull(certificationRequestInfo0);
      
      DERSequence dERSequence0 = (DERSequence)certificationRequestInfo0.getDERObject();
      assertEquals(4, dERSequence0.size());
  }
}
