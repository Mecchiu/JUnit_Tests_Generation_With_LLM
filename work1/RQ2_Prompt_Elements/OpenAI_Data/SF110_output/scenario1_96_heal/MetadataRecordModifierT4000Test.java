// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.CopyrightTextBean;
import org.heal.module.metadata.DiseaseDiagnosisBean;
import org.heal.module.metadata.FormatBean;
import org.heal.module.metadata.KeywordBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.ThumbnailBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.servlet.Action;
import org.heal.util.DateTools;
import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MetadataRecordModifier}.
* It contains ten unit test cases for the {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
*/
class MetadataRecordModifierTest {

		/**
		* Test case 1:
		* The nextActionKey is "next".
		* The expected result is NEXT_ACTION_DEFAULT.
		*/
		@Test
		void testGetNextAction1() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "next";
						}
				};
				Action expected = Action.NEXT_ACTION_DEFAULT;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2:
		* The nextActionKey is "previous".
		* The expected result is PREVIOUS_ACTION.
		*/
		@Test
		void testGetNextAction2() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "previous";
						}
				};
				Action expected = Action.PREVIOUS_ACTION;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3:
		* The nextActionKey is "save".
		* The expected result is SAVE_ACTION.
		*/
		@Test
		void testGetNextAction3() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "save";
						}
				};
				Action expected = Action.SAVE_ACTION;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4:
		* The nextActionKey is "cancel".
		* The expected result is CANCEL_ACTION.
		*/
		@Test
		void testGetNextAction4() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "cancel";
						}
				};
				Action expected = Action.CANCEL_ACTION;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5:
		* The nextActionKey is "delete".
		* The expected result is DELETE_ACTION.
		*/
		@Test
		void testGetNextAction5() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "delete";
						}
				};
				Action expected = Action.DELETE_ACTION;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6:
		* The nextActionKey is "edit".
		* The expected result is EDIT_ACTION.
		*/
		@Test
		void testGetNextAction6() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "edit";
						}
				};
				Action expected = Action.EDIT_ACTION;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7:
		* The nextActionKey is "view".
		* The expected result is VIEW_ACTION.
		*/
		@Test
		void testGetNextAction7() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "view";
						}
				};
				Action expected = Action.VIEW_ACTION;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8:
		* The nextActionKey is "search".
		* The expected result is SEARCH_ACTION.
		*/
		@Test
		void testGetNextAction8() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "search";
						}
				};
				Action expected = Action.SEARCH_ACTION;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9:
		* The nextActionKey is "".
		* The expected result is NEXT_ACTION_DEFAULT.
		*/
		@Test
		void testGetNextAction9() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "";
						}
				};
				Action expected = Action.NEXT_ACTION_DEFAULT;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10:
		* The nextActionKey is null.
		* The expected result is NEXT_ACTION_DEFAULT.
		*/
		@Test
		void testGetNextAction10() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return null;
						}
				};
				Action expected = Action.NEXT_ACTION_DEFAULT;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
}

// MetadataRecordModifier.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.CopyrightTextBean;
import org.heal.module.metadata.DiseaseDiagnosisBean;
import org.heal.module.metadata.FormatBean;
import org.heal.module.metadata.KeywordBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.ThumbnailBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.servlet.Action;
import org.heal.util.DateTools;
import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * <p>A {@link MetadataModifier} which fills the basic metadata information
 * from a <code>ServletRequest</code> into a {@link CompleteMetadataBean}.</p>
 */
public class MetadataRecordModifier implements MetadataModifier {

    public Action getNextAction(ServletRequest request) {
        Action ret;
        String nextActionKey = request.getParameter("nextAction");
        if (nextActionMap.containsKey(nextActionKey)) {
            ret = (Action) nextActionMap.get(nextActionKey);
        } else {
            ret = NEXT_ACTION_DEFAULT;
        }
        return ret;
    }
}

// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.CopyrightTextBean;
import org.heal.module.metadata.DiseaseDiagnosisBean;
import org.heal.module.metadata.FormatBean;
import org.heal.module.metadata.KeywordBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.ThumbnailBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.servlet.Action;
import org.heal.util.DateTools;
import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MetadataRecordModifier}.
* It contains ten unit test cases for the {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
*/
class MetadataRecordModifierTest {
		
		/**
		* Test case 1:
		* The nextActionKey is "next".
		* The expected result is NEXT_ACTION_DEFAULT.
		*/
		@Test
		void testGetNextAction1() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "next";
						}
				};
				Action expected = Action.NEXT_ACTION_DEFAULT;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2:
		* The nextActionKey is "previous".
		* The expected result is PREVIOUS_ACTION.
		*/
		@Test
		void testGetNextAction2() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "previous";
						}
				};
				Action expected = Action.PREVIOUS_ACTION;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3:
		* The nextActionKey is "save".
		* The expected result is SAVE_ACTION.
		*/
		@Test
		void testGetNextAction3() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "save";
						}
				};
				Action expected = Action.SAVE_ACTION;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4:
		* The nextActionKey is "cancel".
		* The expected result is CANCEL_ACTION.
		*/
		@Test
		void testGetNextAction4() {
				MetadataRecordModifier metadataRecordModifier = new MetadataRecordModifier();
				ServletRequest request = new ServletRequest() {
						@Override
						public String getParameter(String s) {
								return "cancel";
						}
				};
				Action expected = Action.CANCEL_ACTION;
				Action actual = metadataRecordModifier.getNextAction(request);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5:
		* The nextActionKey is "delete".
		* The expected result is DELETE_ACTION.
		*/
		@Test
	