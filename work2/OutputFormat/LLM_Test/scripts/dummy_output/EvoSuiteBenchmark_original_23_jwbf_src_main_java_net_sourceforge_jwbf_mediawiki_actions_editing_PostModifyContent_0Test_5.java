
package net.sourceforge.jwbf.mediawiki.actions.editing;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PostModifyContent_0Test {
 @Test
 void testHasMoreMessages() throws Exception {
  Set<SimpleArticle> old = new HashSet<>();
  old.add(SimpleArticle.builder().name("article1").version(MW1_09).created(Integer.parseInt("123_122_122_122")).createdUser("test").createdTime(Integer.parseInt("123_122_122_122_121")).isDraft(true).modified(Integer.parseInt("123_122_122_122_121")).modDate(Integer.parseInt("123_122_122_122_121_1230")).isInReply(false).modifiedBy("foo")
    .modifiedTime(Integer.parseInt("123_122_122_122_121")).isFromReply(false).modifiedByUser("test").modifiedArticleKey("article1").isDeleted(false).setTitle("article1 article1 title")
    .setContent("article body content content").build());
  Set<SimpleArticle> new_ = new HashSet<>();
  new_.add(SimpleArticle.builder().name("article1").version(MW1_10).created(Integer.parseInt("123_122_122_122")).createdUser("test").createdTime(Integer.parseInt("123_122_122_122_121"))
    .isDraft(true).modified(Integer.parseInt("123_122_122_122_121")).modDate(Integer.parseInt("123_122_122_122_121_1230")).isFromReply(false).modifiedBy("foo")
    .modifiedTime(Integer.parseInt("123_122_122_122_121")).isFromReply(false).modifiedByUser("test").modifiedArticleKey("article1").isDeleted(false).setTitle("article1 article1 title")
    .setContent("article body content").build());
  PostModifyContent post_modify_content = PostModifyContent.builder()
    .fromUser(SimpleArticle.builder().name("article1").version(MW1_10).created(Integer.parseInt("123_122_122_122"))
      .createdUser("test").createdTime(Integer.parseInt("123_122_122_122_121")).isDraft(true)
      .modified(Integer.parseInt("123_122_122_122_121")).modDate(Integer.parseInt("123_122_122_122_121")).isFromReply(false).modifiedBy("foo")
      .modifiedTime(Integer.parseInt("123_122_122_122_121")).isFromReply(false).modifiedByUser("test").modifiedAuthorKey("article1")
      .isDeleted(false).setTitle("article1 article1 title")
      .setContent("article body content").build())
    .setContent(new_)
    .build();
  try {
   assertEquals(true, post_modify_content.hasMoreMessages());
  }
  catch (ActionException e) {
   fail("ActionException in PostModifyContent.hasMoreMessages() is not possible if the PostModifyContent's hasMoreMessages method does not throw Exception");
  }
 }
 @Test
 void testPostModifyContents() throws Exception {
  Set<SimpleArticle> old = new HashSet<>();
}
}