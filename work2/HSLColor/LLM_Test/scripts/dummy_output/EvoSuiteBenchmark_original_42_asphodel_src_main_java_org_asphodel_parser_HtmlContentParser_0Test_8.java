// HtmlContentParser_0Test.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlContentParser}.
* It contains one unit test case for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParser_0Test {
		
    /**
	* Basic test for {@link HtmlContentParser#extractText(Reader)} method.
	*/
	@Test
	public void testExtractText() {
		HTMLContentParser parser = new HtmlContentParser();
		HTMLContentParser.HtmlContentParserListener listener = new HTMLContentParser.HtmlContentParserListener(){
	         public void onFinishedElement(boolean isFinished, org.asphodel.ASPHtmlText text)
	         {
	        	   System.out.println("OnFinishedElement: text=" + text);
	         }
	        public void onEOF(boolean isEOF) {
	        	   System.out.println("OnEOF");
	        }
	      };
		Source source = new Source(getClass().getResourceAsStream("test.txt.html"));
		System.out.println(parser.parseContent(source, parser.getCurrentElement(),listener));
	}
	

	/**
	* Basic test for {@link HtmlContentParser#extractText(Source)} method.
	*/
	@Test
	public void testExtractTextSource() {
		HTMLContentParser parser = new HtmlContentParser();
		HTMLContentParser.HtmlContentParserListener listener = new HTMLContentParser.HtmlContentParserListener(){
	         public void onFinishedElement(boolean isFinished, org.asphodel.ASPHtmlText text)
	         {
	        	   System.out.println("OnFinishedElement: text=" + text);
	         }
				public void onEOF(boolean isEOF) {
	        	   System.out.println("OnEOF");
	        }
	      };
		Source source = new Source(getClass().getResourceAsStream("test.txt.html"));
		System.out.println(parser.parseContent(source, null,listener));
	}
	
	
	/**
	* Basic test for {@link HtmlContentParser#extractText(Source, int)} method.
	*/
	@Test
	public void testExtractTextSourceInt() {
		HTMLContentParser parser = new HtmlContentParser();
		HTMLContentParser.HtmlContentParserListener listener = new HTMLContentParser.HtmlContentParserListener(){
	         public void onFinishedElement(boolean isFinished, org.asphodel.ASPHtmlText text)
	         {
	        	   System.out.println("OnFinishedElement: text=" + text);
	         }
				public void onEOF(boolean isEOF) {
	        	   System.out.println("OnEOF");
	        }
	      };
		Source source = new Source(getClass().getResourceAsStream("test.txt.html"));
		System.out.println(parser.parseContent(source, 5,listener));
	}
	




}