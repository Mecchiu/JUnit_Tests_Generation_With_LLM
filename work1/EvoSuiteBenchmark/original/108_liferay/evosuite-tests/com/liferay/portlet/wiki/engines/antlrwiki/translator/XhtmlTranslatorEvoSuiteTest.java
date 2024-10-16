/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portlet.wiki.engines.antlrwiki.translator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.TreeNode;
import com.liferay.portal.parsers.creole.ast.ASTNode;
import com.liferay.portal.parsers.creole.ast.CollectionNode;
import com.liferay.portal.parsers.creole.ast.HeadingNode;
import com.liferay.portal.parsers.creole.ast.ImageNode;
import com.liferay.portal.parsers.creole.ast.WikiPageNode;
import com.liferay.portal.parsers.creole.ast.extension.TableOfContentsNode;
import com.liferay.portal.parsers.creole.ast.link.LinkNode;
import com.liferay.portlet.wiki.engines.antlrwiki.translator.XhtmlTranslator;
import com.liferay.portlet.wiki.model.WikiPage;
import java.util.List;
import javax.portlet.PortletURL;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class XhtmlTranslatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      CollectionNode collectionNode0 = new CollectionNode((List<ASTNode>) null);
      WikiPageNode wikiPageNode0 = new WikiPageNode(collectionNode0);
      String string0 = xhtmlTranslator0.translate((WikiPage) null, (PortletURL) null, (PortletURL) null, (String) null, wikiPageNode0);
      assertEquals("", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      TableOfContentsNode tableOfContentsNode0 = new TableOfContentsNode();
      // Undeclared exception!
      try {
        xhtmlTranslator0.visit(tableOfContentsNode0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      String string0 = xhtmlTranslator0.getHeadingMarkup("date", "date");
      assertEquals("section-date-date", string0);
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      CollectionNode collectionNode0 = new CollectionNode((-979));
      HeadingNode headingNode0 = new HeadingNode(collectionNode0, (-979));
      TreeNode<HeadingNode> treeNode0 = new TreeNode<HeadingNode>(headingNode0);
      treeNode0.addChildNode(headingNode0);
      // Undeclared exception!
      try {
        xhtmlTranslator0.appendTableOfContents(treeNode0, (-979));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      LinkNode linkNode0 = new LinkNode("http://apache.org/xml/fea{ures/validation/schema-full-checking");
      // Undeclared exception!
      try {
        xhtmlTranslator0.appendHref(linkNode0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      ImageNode imageNode0 = new ImageNode(519, (CollectionNode) null, "");
      xhtmlTranslator0.visit(imageNode0);
      assertEquals("", imageNode0.getLink());
  }

  @Test
  public void test6()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      CollectionNode collectionNode0 = new CollectionNode((-517));
      ImageNode imageNode0 = new ImageNode((-517), collectionNode0, "'yh`");
      xhtmlTranslator0.visit(imageNode0);
      assertEquals(true, imageNode0.hasAltCollectionNode());
  }

  @Test
  public void test7()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      CollectionNode collectionNode0 = new CollectionNode((-517));
      ImageNode imageNode0 = new ImageNode((-517), collectionNode0, "'yh`");
      String[] stringArray0 = new String[10];
      stringArray0[0] = "'yh`";
      imageNode0.setSupportedProtocols(stringArray0);
      xhtmlTranslator0.visit(imageNode0);
      assertEquals(true, imageNode0.isAbsoluteLink());
  }

  @Test
  public void test8()  throws Throwable  {
      LinkNode linkNode0 = new LinkNode();
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      // Undeclared exception!
      try {
        xhtmlTranslator0.visit(linkNode0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      LinkNode linkNode0 = new LinkNode("?K~#x$&'aWHdI");
      // Undeclared exception!
      try {
        xhtmlTranslator0.visit(linkNode0);
        fail("Expecting exception: OutOfMemoryError");
      } catch(OutOfMemoryError e) {
        /*
         * Java heap space
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      HeadingNode headingNode0 = new HeadingNode((-851));
      TreeNode<HeadingNode> treeNode0 = new TreeNode<HeadingNode>(headingNode0);
      TreeNode<HeadingNode> treeNode1 = new TreeNode<HeadingNode>(headingNode0, treeNode0, (List<TreeNode<HeadingNode>>) null);
      xhtmlTranslator0.appendTableOfContents(treeNode1, (-851));
      assertEquals(false, treeNode1.isRootNode());
  }

  @Test
  public void test11()  throws Throwable  {
      XhtmlTranslator xhtmlTranslator0 = new XhtmlTranslator();
      CollectionNode collectionNode0 = new CollectionNode((-504));
      HeadingNode headingNode0 = new HeadingNode(collectionNode0, (-504));
      TreeNode<HeadingNode> treeNode0 = new TreeNode<HeadingNode>(headingNode0);
      xhtmlTranslator0.appendTableOfContents(treeNode0, (-504));
      assertEquals(true, treeNode0.isRootNode());
  }
}
