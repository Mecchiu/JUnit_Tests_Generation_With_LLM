/*
 * This file was automatically generated by EvoSuite
 */

package org.bouncycastle.asn1.x509;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERConstructedSequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.AttributeCertificateInfo;
import org.bouncycastle.asn1.x509.Holder;
import org.bouncycastle.asn1.x509.V2AttributeCertificateInfoGenerator;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class V2AttributeCertificateInfoGeneratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      v2AttributeCertificateInfoGenerator0.setIssuerUniqueID((DERBitString) null);
  }

  @Test
  public void test1()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      DERObjectIdentifier dERObjectIdentifier0 = X509Extensions.QCStatements;
      DEREncodableVector dEREncodableVector0 = new DEREncodableVector();
      BERSet bERSet0 = new BERSet(dEREncodableVector0);
      Attribute attribute0 = new Attribute(dERObjectIdentifier0, (ASN1Set) bERSet0);
      v2AttributeCertificateInfoGenerator0.addAttribute(attribute0);
  }

  @Test
  public void test2()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      // Undeclared exception!
      try {
        v2AttributeCertificateInfoGenerator0.addAttribute("", (ASN1Encodable) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * string  not an OID
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      BigInteger bigInteger0 = BigInteger.TEN;
      DERInteger dERInteger0 = new DERInteger(bigInteger0);
      v2AttributeCertificateInfoGenerator0.setSerialNumber(dERInteger0);
      // Undeclared exception!
      try {
        v2AttributeCertificateInfoGenerator0.generateAttributeCertificateInfo();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * not all mandatory fields set in V2 AttributeCertificateInfo generator
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      // Undeclared exception!
      try {
        v2AttributeCertificateInfoGenerator0.generateAttributeCertificateInfo();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * not all mandatory fields set in V2 AttributeCertificateInfo generator
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      DERObjectIdentifier dERObjectIdentifier0 = X509Extensions.CertificatePolicies;
      AlgorithmIdentifier algorithmIdentifier0 = new AlgorithmIdentifier(dERObjectIdentifier0, dERObjectIdentifier0);
      BigInteger bigInteger0 = BigInteger.TEN;
      DERInteger dERInteger0 = new DERInteger(bigInteger0);
      v2AttributeCertificateInfoGenerator0.setSerialNumber(dERInteger0);
      v2AttributeCertificateInfoGenerator0.setSignature(algorithmIdentifier0);
      // Undeclared exception!
      try {
        v2AttributeCertificateInfoGenerator0.generateAttributeCertificateInfo();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * not all mandatory fields set in V2 AttributeCertificateInfo generator
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      DERObjectIdentifier dERObjectIdentifier0 = X509Extensions.CertificatePolicies;
      AlgorithmIdentifier algorithmIdentifier0 = new AlgorithmIdentifier(dERObjectIdentifier0, dERObjectIdentifier0);
      BigInteger bigInteger0 = BigInteger.TEN;
      DERInteger dERInteger0 = new DERInteger(bigInteger0);
      DERConstructedSequence dERConstructedSequence0 = new DERConstructedSequence();
      v2AttributeCertificateInfoGenerator0.setSerialNumber(dERInteger0);
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject((-973), (DEREncodable) dERConstructedSequence0);
      AttCertIssuer attCertIssuer0 = AttCertIssuer.getInstance((ASN1TaggedObject) dERTaggedObject0, true);
      v2AttributeCertificateInfoGenerator0.setSignature(algorithmIdentifier0);
      v2AttributeCertificateInfoGenerator0.setIssuer(attCertIssuer0);
      // Undeclared exception!
      try {
        v2AttributeCertificateInfoGenerator0.generateAttributeCertificateInfo();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * not all mandatory fields set in V2 AttributeCertificateInfo generator
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      DERObjectIdentifier dERObjectIdentifier0 = X509Extensions.CertificatePolicies;
      AlgorithmIdentifier algorithmIdentifier0 = new AlgorithmIdentifier(dERObjectIdentifier0, dERObjectIdentifier0);
      BigInteger bigInteger0 = BigInteger.TEN;
      DERInteger dERInteger0 = new DERInteger(bigInteger0);
      DERConstructedSequence dERConstructedSequence0 = new DERConstructedSequence();
      v2AttributeCertificateInfoGenerator0.setSerialNumber(dERInteger0);
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject((-973), (DEREncodable) dERConstructedSequence0);
      Date date0 = new Date((long) (-973));
      DERGeneralizedTime dERGeneralizedTime0 = new DERGeneralizedTime(date0);
      v2AttributeCertificateInfoGenerator0.setStartDate(dERGeneralizedTime0);
      AttCertIssuer attCertIssuer0 = AttCertIssuer.getInstance((ASN1TaggedObject) dERTaggedObject0, true);
      v2AttributeCertificateInfoGenerator0.setSignature(algorithmIdentifier0);
      v2AttributeCertificateInfoGenerator0.setIssuer(attCertIssuer0);
      // Undeclared exception!
      try {
        v2AttributeCertificateInfoGenerator0.generateAttributeCertificateInfo();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * not all mandatory fields set in V2 AttributeCertificateInfo generator
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      DERObjectIdentifier dERObjectIdentifier0 = X509Extensions.CertificatePolicies;
      AlgorithmIdentifier algorithmIdentifier0 = new AlgorithmIdentifier(dERObjectIdentifier0, dERObjectIdentifier0);
      BigInteger bigInteger0 = BigInteger.TEN;
      DERInteger dERInteger0 = new DERInteger(bigInteger0);
      DERConstructedSequence dERConstructedSequence0 = new DERConstructedSequence();
      v2AttributeCertificateInfoGenerator0.setSerialNumber(dERInteger0);
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject((-973), (DEREncodable) dERConstructedSequence0);
      Date date0 = new Date((long) (-973));
      DERGeneralizedTime dERGeneralizedTime0 = new DERGeneralizedTime(date0);
      v2AttributeCertificateInfoGenerator0.setEndDate(dERGeneralizedTime0);
      v2AttributeCertificateInfoGenerator0.setStartDate(dERGeneralizedTime0);
      AttCertIssuer attCertIssuer0 = AttCertIssuer.getInstance((ASN1TaggedObject) dERTaggedObject0, true);
      v2AttributeCertificateInfoGenerator0.setSignature(algorithmIdentifier0);
      v2AttributeCertificateInfoGenerator0.setIssuer(attCertIssuer0);
      // Undeclared exception!
      try {
        v2AttributeCertificateInfoGenerator0.generateAttributeCertificateInfo();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * not all mandatory fields set in V2 AttributeCertificateInfo generator
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      DERObjectIdentifier dERObjectIdentifier0 = X509Extensions.CertificatePolicies;
      AlgorithmIdentifier algorithmIdentifier0 = new AlgorithmIdentifier(dERObjectIdentifier0, dERObjectIdentifier0);
      BigInteger bigInteger0 = BigInteger.TEN;
      DERInteger dERInteger0 = new DERInteger(bigInteger0);
      DERConstructedSequence dERConstructedSequence0 = new DERConstructedSequence();
      v2AttributeCertificateInfoGenerator0.setSerialNumber(dERInteger0);
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject((-973), (DEREncodable) dERConstructedSequence0);
      Holder holder0 = new Holder((ASN1Sequence) dERConstructedSequence0);
      v2AttributeCertificateInfoGenerator0.setHolder(holder0);
      Date date0 = new Date((long) (-973));
      DERGeneralizedTime dERGeneralizedTime0 = new DERGeneralizedTime(date0);
      v2AttributeCertificateInfoGenerator0.setEndDate(dERGeneralizedTime0);
      v2AttributeCertificateInfoGenerator0.setStartDate(dERGeneralizedTime0);
      AttCertIssuer attCertIssuer0 = AttCertIssuer.getInstance((ASN1TaggedObject) dERTaggedObject0, true);
      v2AttributeCertificateInfoGenerator0.setSignature(algorithmIdentifier0);
      v2AttributeCertificateInfoGenerator0.setIssuer(attCertIssuer0);
      AttributeCertificateInfo attributeCertificateInfo0 = v2AttributeCertificateInfoGenerator0.generateAttributeCertificateInfo();
      assertNotNull(attributeCertificateInfo0);
  }

  @Test
  public void test10()  throws Throwable  {
      V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator0 = new V2AttributeCertificateInfoGenerator();
      DERObjectIdentifier dERObjectIdentifier0 = X509Extensions.CertificatePolicies;
      AlgorithmIdentifier algorithmIdentifier0 = new AlgorithmIdentifier(dERObjectIdentifier0, dERObjectIdentifier0);
      BigInteger bigInteger0 = BigInteger.TEN;
      DERInteger dERInteger0 = new DERInteger(bigInteger0);
      DERConstructedSequence dERConstructedSequence0 = new DERConstructedSequence();
      v2AttributeCertificateInfoGenerator0.setSerialNumber(dERInteger0);
      DERTaggedObject dERTaggedObject0 = new DERTaggedObject((-973), (DEREncodable) dERConstructedSequence0);
      Holder holder0 = new Holder((ASN1Sequence) dERConstructedSequence0);
      v2AttributeCertificateInfoGenerator0.setHolder(holder0);
      Date date0 = new Date((long) (-973));
      DERGeneralizedTime dERGeneralizedTime0 = new DERGeneralizedTime(date0);
      v2AttributeCertificateInfoGenerator0.setEndDate(dERGeneralizedTime0);
      v2AttributeCertificateInfoGenerator0.setStartDate(dERGeneralizedTime0);
      AttCertIssuer attCertIssuer0 = AttCertIssuer.getInstance((ASN1TaggedObject) dERTaggedObject0, true);
      v2AttributeCertificateInfoGenerator0.setSignature(algorithmIdentifier0);
      v2AttributeCertificateInfoGenerator0.setIssuer(attCertIssuer0);
      Vector<Object> vector0 = new Vector<Object>();
      X509Extensions x509Extensions0 = new X509Extensions(vector0, vector0);
      v2AttributeCertificateInfoGenerator0.setExtensions(x509Extensions0);
      AttributeCertificateInfo attributeCertificateInfo0 = v2AttributeCertificateInfoGenerator0.generateAttributeCertificateInfo();
      assertNotNull(attributeCertificateInfo0);
  }
}
