/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jdom.DocType;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.BeforeClass;
import org.sourceforge.ifx.tools.CodeGenerator;

@RunWith(EvoSuiteRunner.class)
public class CodeGeneratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator();
      codeGenerator0.setInputFileName("impoQ");
  }

  @Test
  public void test1()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator();
      Element element0 = new Element("java.", "java.");
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      Element element1 = new Element("java.", namespace0);
      element0.addContent(element1);
      DocType docType0 = new DocType("java.");
      Document document0 = new Document(element0, docType0);
      try {
        codeGenerator0.buildBaseNameMap(document0, "java.");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
      assertEquals("[Document: [DocType: <!DOCTYPE java.>], Root is [Element: <java. [Namespace: java.]/>]]", document0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator();
      Element element0 = new Element("import", "import");
      DocType docType0 = new DocType("import");
      Document document0 = new Document(element0, docType0);
      codeGenerator0.buildBaseNameMap(document0, "import");
      codeGenerator0.buildBaseNameMap(document0, "import");
      assertEquals(true, document0.hasRootElement());
  }

  @Test
  public void test3()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator();
      Element element0 = new Element("import", "import");
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      Element element1 = new Element("import", namespace0);
      element0.addContent(element1);
      DocType docType0 = new DocType("import");
      Document document0 = new Document(element0, docType0);
      codeGenerator0.buildBaseNameMap(document0, "import");
      assertEquals(true, document0.hasRootElement());
  }

  @Test
  public void test4()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator();
      Element element0 = new Element("import", "import");
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      Element element1 = new Element("import", namespace0);
      element0.addContent(element1);
      DocType docType0 = new DocType("import");
      Document document0 = new Document(element0, docType0);
      codeGenerator0.parseDocument(document0, "import");
      assertEquals("[Document: [DocType: <!DOCTYPE import>], Root is [Element: <import [Namespace: import]/>]]", document0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator();
      Element element0 = new Element("impoQ", "impoQ");
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      Element element1 = new Element("impoQ", namespace0);
      element0.addContent(element1);
      DocType docType0 = new DocType("impoQ");
      Document document0 = new Document(element0, docType0);
      try {
        codeGenerator0.parseDocument(document0, "impoQ");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
      assertEquals("[Document: [DocType: <!DOCTYPE impoQ>], Root is [Element: <impoQ [Namespace: impoQ]/>]]", document0.toString());
  }
}
