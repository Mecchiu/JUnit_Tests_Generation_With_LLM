// EditContextURLActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditContextURLAction}.
* It contains one unit test case for the {@link EditContextURLAction#actionRequiresLogin()} method.
*/
class EditContextURLActionTest {
		private static String expectedURL = "http://www.heal.org";
		{
			expectedURL = "http://www.heal.org/";
			expectedURL += "?n=0";
		}

        private static final int expectedCount = 2;

	/**
	 * {@link #expectedURL} is not valid.
	 */
	@Test(expected = IllegalArgumentException.class) 
	public void testIllegalURL() {
		new EditContextURLAction(null);
	}

	/**
	 * {@link #expectedURL} is too long.
	 */
	@Test(expected = IllegalArgumentException.class) 
	public void testOutLength() {
		new EditContextURLAction("http://a") {
			public boolean requiresLogin() {
				return false;
			}
		}.actionRequiresLogin();
	}

	/**
	 * {@link #expectedURL} is longer than required.
	 */
	@Test(expected = IllegalArgumentException.class) 
	public void testTooLong() {
		new EditContextURLAction("http://a" + "zzzzzz".substring(1));
	}

	/**
	 * {@link #expectedURL} is not present in the provided list.
	 */
	@Test public void testNotInList() {
		new EditContextURLAction(
				EasyEnabler.getUrlList(expectedURL, expectedCount)) {
			public void addExtraContextURLs(ContextURLBean[] extraContextURLs) {
				assertContains(actualExtraContextURIs(), extraContextURLs);
			}
		}.actionRequiresLogin();
	}

	/**
	 * {@link #expectedURL} is present in the provided list.
	 */
	@Test public void testPresentInList() {
		new EditContextURLAction(
				EasyEnabler.getUrlList(expectedURL, expectedCount+1)) {
			public boolean requiresLogin() {
				return true;
			}
			public void addExtraContextURLs(ContextURLBean[] extraContextURLs) {
				assertContains(actualExtraContextURIs(), extraContextURLs);
			}
		}.actionRequiresLogin();
	}

	/**
	 * {@link #expectedURL} is not present in the provided list.
	 */
	@Test public void testNotInListNoExtraContextURIs() {
		new EditContextURLAction(
				EasyEnabler.getUrlList(expectedURL, expectedCount)) {
			public boolean requiresLogin() {
				return false;
			}
		}.actionRequiresLogin();
	}

    /**
     * {@link #actualExtraContextURIs} is the updated list with the new list.
     */
    private static String[] actualExtraContextURIs = EasyEnabler.getUrlList(expectedURL, expectedCount);

    private static String[] expectedExtraContextURIs = 
            new String [] {
                    "http://www.heal.org", 
                    expectedURL
            };

    /**
     * @return the list of {@link #actualExtraContextURIs}
     */
    public static String[] getActualExtraContextURIs() {
        return actualExtraContextURIs;
    }

    public void assertContains(Iterator<String> actual, Iterator<String> expected) {
        assertTrue(actual.hasNext());
        assertTrue(expected.hasNext());
        String expectedURL = expected.next();
        String actualURL = actual.next();
        assertEquals(expectedURL, actualURL);
    }

    public void assertDoesNotContain(Iterator<String> iterator, Iterator<String> expected) {
        assertTrue(itemMissingOrNull(iterator));
        assertTrue(itemMissingOrNull(expected));
    }

	private boolean itemMissingOrNull(Iterator<String> iterator) {
		assertFalse(iterator.hasNext());
		return false;
	}
}