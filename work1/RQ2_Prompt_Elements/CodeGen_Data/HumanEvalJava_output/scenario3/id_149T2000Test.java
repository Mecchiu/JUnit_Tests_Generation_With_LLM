// SortedListSumTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains one unit test case for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {
private static class SortedListSumTestCases {
<%_ if SORTED_LIST_SUM %>            <%_ 
	private List<String>  list 		= new <%_ 
	{"a", "a", "b", "bx", "x", "y", "y"}, // 0-7 max length
	{"a", "a", "b", "bx", "x", "y", "y"}, // max lenght of first word
	{"-a", "A", "a", "b", "bx", "x", "y"}, // max lenght of second word
	{"ab", "A", "c", "bcy", "x", "y", "y"}, // max length of first length of abc
	{"bc", "Q", "bcy", "bz", "u", "v", "w"}, // 1-max length of any word
	{"bcy", "u", "v", "w", "bz", "x", "y"}, // max length of abc, u max is 1, v max is 2
	{"c", "d", "b", "bcy", "y", "z", "x"}, // 1-max length of c
	{"Bc,Z", "Bd", "a", "Bb", "y", "z", "x"}, // max length of bc, az is 0, bc,Bd can be 1
	{"xy", "ydc", "ddx", "xdy", "bxd", "ybz", "yddzx"} // all numbers are the same, "bDcXd", "xyDcXd", are both bcdxd
<%_ }_%>
		}
		private Integer[]  result 	  = null;
		private List<String> resultNum 	  = null;
		private List<String[]> list  		  = new List[] {
			SortedListSumTestCases.list,
			SortedListSumTestCases.list,
			new <%_if SORTED_LIST_SUM %>new List<%_ 
			<%_ if SORTED_LIST_SUM %>List<%_ 
			<%_ if SORTED_LIST_SUM %>List<%_ 
			<%_ }_%>new List<%_ 
			<%_ if SORTED_LIST_SUM %>List<%_ 
			<%_ }_%>new <%_ }_%>
/*
<%_ if SORTED_LIST_SUM %>SortedListSumTestCases.list %>// SortedListSumTestCases {%_ }_%>
<%_ if SORTED_LIST_SUM %>for (String num : SortedListSumTestCases.list) {
<%_ }_%>
<%_
  public static List<Object> test() {
<% _ function 
<%
  public List<List<String>> test() {
    return SortedListSumTestCases.<List<String>>test<%_
		// the first is sorted by length, the second by length of words and words
        <%_ 
		return (Collections.sort(SortedListSumTestCases.list, (o1, o2) ->  sz - sz1 + sz2)
		)<%_ }_%>;
      }
<%} _function 
</%_ }_%>
 */
      }
}
