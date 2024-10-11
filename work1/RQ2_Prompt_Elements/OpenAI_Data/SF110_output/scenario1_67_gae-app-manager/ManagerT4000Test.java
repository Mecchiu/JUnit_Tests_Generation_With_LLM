// ManagerTest.java
package net.sf.gaeappmanager.google.appengine;

import net.sf.gaeappmanager.google.LogonHelper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Manager}.
* It contains ten unit test cases for the {@link Manager#retrieveAppQuotaDetails(String, String, String, String)} method.
*/
class ManagerTest {

		@Test
		void testRetrieveAppQuotaDetails() throws Exception {
				String userid = "userid";
				String password = "password";
				String source = "source";
				String application = "application";
				String authCookie = "authCookie";
				String url = "https://appengine.google.com/dashboard/quotadetails?&app_id=" + application;
				String cookie = "ACSID=" + authCookie;
				QuotaDetails quotaDetails = new QuotaDetails();
				
				Manager manager = new Manager();
				
				LogonHelper logonHelper = new LogonHelper();
				LogonHelper spyLogonHelper = spy(logonHelper);
				doReturn(authCookie).when(spyLogonHelper).loginToGoogleAppEngine(userid, password, source);
				manager.logonHelper = spyLogonHelper;
				
				DefaultHttpClient client = new DefaultHttpClient();
				DefaultHttpClient spyClient = spy(client);
				HttpGet get = new HttpGet(url);
				get.setHeader("Cookie", cookie);
				HttpResponse response = new HttpResponse();
				doReturn(response).when(spyClient).execute(get);
				manager.client = spyClient;
				
				QuotaDetailsParser quotaDetailsParser = new QuotaDetailsParser();
				QuotaDetailsParser spyQuotaDetailsParser = spy(quotaDetailsParser);
				doReturn(quotaDetails).when(spyQuotaDetailsParser).parse(response.getEntity().getContent());
				manager.quotaDetailsParser = spyQuotaDetailsParser;
				
				QuotaDetails result = manager.retrieveAppQuotaDetails(userid, password, source, application);
				
				assertEquals(quotaDetails, result);
				verify(spyLogonHelper).loginToGoogleAppEngine(userid, password, source);
				verify(spyClient).execute(get);
				verify(spyQuotaDetailsParser).parse(response.getEntity().getContent());
		}
}

// QuotaDetails.java
package net.sf.gaeappmanager.google.appengine;

import java.util.ArrayList;
import java.util.List;

/**
 * Google App Engine application quota details.
 *
 * @author Alois Belaska
 */
public class QuotaDetails {

    private List<Quota> quotas = new ArrayList<Quota>();

    public List<Quota> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<Quota> quotas) {
        this.quotas = quotas;
    }
}

// QuotaDetailsParser.java
package net.sf.gaeappmanager.google.appengine;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Google App Engine application quota details parser.
 *
 * @author Alois Belaska
 */
public class QuotaDetailsParser {

    public QuotaDetails parse(InputStream is) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(is);
        doc.getDocumentElement().normalize();
        QuotaDetails quotaDetails = new QuotaDetails();
        List<Quota> quotas = new ArrayList<Quota>();
        NodeList nodeLst = doc.getElementsByTagName("tr");
        for (int s = 0; s < nodeLst.getLength(); s++) {
            Node fstNode = nodeLst.item(s);
            if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                Element fstElmnt = (Element) fstNode;
                NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("td");
                Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
                NodeList fstNm = fstNmElmnt.getChildNodes();
                String name = ((Node) fstNm.item(0)).getNodeValue();
                Element lstNmElmnt = (Element) fstNmElmntLst.item(1);
                NodeList lstNm = lstNmElmnt.getChildNodes();
                String value = ((Node) lstNm.item(0)).getNodeValue();
                Quota quota = new Quota();
                quota.setName(name);
                quota.setValue(value);
                quotas.add(quota);
            }
        }
        quotaDetails.setQuotas(quotas);
        return quotaDetails;
    }
}

// Quota.java
package net.sf.gaeappmanager.google.appengine;

/**
 * Google App Engine application quota.
 *
 * @author Alois Belaska
 */
public class Quota {

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

// LogonHelper.java
package net.sf.gaeappmanager.google.appengine;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Google App Engine application logon helper.
 *
 * @author Alois Belaska
 */
public class LogonHelper {

    public String loginToGoogleAppEngine(String userid, String password, String source) throws IOException, ParserConfigurationException, SAXException {
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost("https://www.google.com/accounts/ClientLogin");
        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(3);
        nameValuePairs.add(new BasicNameValuePair("Email", userid));
        nameValuePairs.add(new BasicNameValuePair("Passwd", password));
        nameValuePairs.add(new BasicNameValuePair("source", source));
        nameValuePairs.add(new BasicNameValuePair("service", "ah"));
        post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        HttpResponse response = client.execute(post);
        InputStream is = response.getEntity().getContent();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(is);
        doc.getDocumentElement().normalize();
        NodeList nodeLst = doc.getElementsByTagName("Auth");
        Node fstNode = nodeLst.item(0);
        String authCookie = fstNode.getTextContent();
        return authCookie;
    }
}