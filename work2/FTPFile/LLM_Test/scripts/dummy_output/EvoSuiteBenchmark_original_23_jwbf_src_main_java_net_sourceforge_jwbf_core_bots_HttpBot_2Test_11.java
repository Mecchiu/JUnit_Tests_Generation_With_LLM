// HttpBot_2Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains one unit test case for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_2Test {
		
    private static final String BASE_URL = "http://www.yourOwnWiki.org/wiki/";
    private GetPage docURL;
    private String page;
    private HttpActionClient cc;
    private final GetPage fxDocURL = new GetPage();
    private ContentProcessable contentCp;

    @Test
    void getPage_fx() throws MalformedURLException, IOException, ActionException, ContentProcessable {
        URL urls[] = new URL[] {new Object() {
            
            @Override
            public String toString() {
                return "url";
            }
            
        }};
        docURL = new GetPage("doc", urls, null);
        String expected = "<p><a style=\"background:#8eae00\">" + BASE_URL + "<a class=\"footer\" onmouseover=\"window.location='http://www.yourOwnWiki.org/wiki/&nl;'\">" + BASE_URL + "<a class=\"footer\" onmouseover=\"window.location='http://www.yourOwnWiki.org/wiki/&nl;&lang=en&o=false'><small title=\"\"><font color=#ff0000\">1</font></small></a></a><a style=\"background:#ffbfe0;font-size:8pt;margin:8px 0 0 0; font-family:sans-serif\" onmouseover=\"window.location='http://www.yourOwnWiki.org/wiki/&nl;'\">" + BASE_URL + "<a class=\"footer\" onmouseover=\"window.location='http://www.yourOwnWiki.org/wiki/&nl;&lang=en&o=false'><small title=\"\"><font color=#ff0000>2</font></small></a></a><a style=\"background:#2d8eb9;font-size:8pt;margin:8px 0 0 0; font-family:sans-serif\" onmouseover=\"window.location='http://www.yourOwnWiki.org/wiki/&nl;&lang=en&o=false'><small title=\"\"><font color=#26bdff;font-size:11pt;font-family:sans-serif;font-variant:normal;font-weight:normal;font-style:normal;\">3</font></small></a></a><a style=\"background:#2d8eb9;font-size:8pt;margin:8px 0 0 0; font-family:sans-serif\" onmouseover=\"window.location='http://www.yourOwnWiki.org/wiki/&nl;&lang=en&o=false'><small title=\"\"><font color=#ff26bd;font-size:11pt;font-family:sans-serif;font-variant:normal;font-weight:normal;font-style:normal;\">4</font></small></a></a><a style=\"background:#2d8eb9;font-size:8pt;margin:8px 0 0 0; font-family:sans-serif\" onmouseover=\"window.location='http://www.yourOwnWiki.org/wiki/&nl;&lang=en&o=false'><small title=\"\"><font color=#26bdff;font-size:11pt;font-family:sans-serif;font-variant:normal;font-weight:normal;font-style:normal;\">5</font></small></a></a><a style=\"background:#2d8eb9;font-size:8pt;margin:8px 0 0 0; font-family:sans-serif\" onmouseover=\"window.location='http://www.yourOwnWiki.org/wiki/&nl;&lang=en&o=false'><small title=\"\"><font color=#26bdff;font-size:11pt;font-family:sans-serif;font-variant:normal;font-weight:normal;font-style:normal;\">6</font></small></a></a>";
}
}