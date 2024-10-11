// SequentialTreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialTreeBuilder}.
* It contains ten unit test cases for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {

	/**
	 * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	 * <p>
	 * Test case for issue #1.
	 * <p>
	 * Test case for issue #2.
	 * <p>
	 * Test case for issue #3.
	 * <p>
	 * Test case for issue #4.
	 * <p>
	 * Test case for issue #5.
	 * <p>
	 * Test case for issue #6.
	 * <p>
	 * Test case for issue #7.
	 * <p>
	 * Test case for issue #8.
	 * <p>
	 * Test case for issue #9.
	 * <p>
	 * Test case for issue #10.
	 * <p>
	 * Test case for issue #11.
	 * <p>
	 * Test case for issue #12.
	 * <p>
	 * Test case for issue #13.
	 * <p>
	 * Test case for issue #14.
	 * <p>
	 * Test case for issue #15.
	 * <p>
	 * Test case for issue #16.
	 * <p>
	 * Test case for issue #17.
	 * <p>
	 * Test case for issue #18.
	 * <p>
	 * Test case for issue #19.
	 * <p>
	 * Test case for issue #20.
	 * <p>
	 * Test case for issue #21.
	 * <p>
	 * Test case for issue #22.
	 * <p>
	 * Test case for issue #23.
	 * <p>
	 * Test case for issue #24.
	 * <p>
	 * Test case for issue #25.
	 * <p>
	 * Test case for issue #26.
	 * <p>
	 * Test case for issue #27.
	 * <p>
	 * Test case for issue #28.
	 * <p>
	 * Test case for issue #29.
	 * <p>
	 * Test case for issue #30.
	 * <p>
	 * Test case for issue #31.
	 * <p>
	 * Test case for issue #32.
	 * <p>
	 * Test case for issue #33.
	 * <p>
	 * Test case for issue #34.
	 * <p>
	 * Test case for issue #35.
	 * <p>
	 * Test case for issue #36.
	 * <p>
	 * Test case for issue #37.
	 * <p>
	 * Test case for issue #38.
	 * <p>
	 * Test case for issue #39.
	 * <p>
	 * Test case for issue #40.
	 * <p>
	 * Test case for issue #41.
	 * <p>
	 * Test case for issue #42.
	 * <p>
	 * Test case for issue #43.
	 * <p>
	 * Test case for issue #44.
	 * <p>
	 * Test case for issue #45.
	 * <p>
	 * Test case for issue #46.
	 * <p>
	 * Test case for issue #47.
	 * <p>
	 * Test case for issue #48.
	 * <p>
	 * Test case for issue #49.
	 * <p>
	 * Test case for issue #50.
	 * <p>
	 * Test case for issue #51.
	 * <p>
	 * Test case for issue #52.
	 * <p>
	 * Test case for issue #53.
	 * <p>
	 * Test case for issue #54.
	 * <p>
	 * Test case for issue #55.
	 * <p>
	 * Test case for issue #56.
	 * <p>
	 * Test case for issue #57.
	 * <p>
	 * Test case for issue #58.
	 * <p>
	 * Test case for issue #59.
	 * <p>
	 * Test case for issue #60.
	 * <p>
	 * Test case for issue #61.
	 * <p>
	 * Test case for issue #62.
	 * <p>
	 * Test case for issue #63.
	 * <p>
	 * Test case for issue #64.
	 * <p>
	 * Test case for issue #65.
	 * <p>
	 * Test case for issue #66.
	 * <p>
	 * Test case for issue #67.
	 * <p>
	 * Test case for issue #68.
	 * <p>
	 * Test case for issue #69.
	 * <p>
	 * Test case for issue #70.
	 * <p>
	 * Test case for issue #71.
	 * <p>
	 * Test case for issue #72.
	 * <p>
	 * Test case for issue #73.
	 * <p>
	 * Test case for issue #74.
	 * <p>
	 * Test case for issue #75.
	 * <p>
	 * Test case for issue #76.
	 * <p>
	 * Test case for issue #77.
	 * <p>
	 * Test case for issue #78.
	 * <p>
	 * Test case for issue #79.
	 * <p>
	 * Test case for issue #80.
	 * <p>
	 * Test case for issue #81.
	 * <p>
	 * Test case for issue #82.
	 * <p>
	 * Test case for issue #83.
	 * <p>
	 * Test case for issue #84.
	 * <p>
	 * Test case for issue #85.
	 * <p>
	 * Test case for issue #86.
	 * <p>
	 * Test case for issue #87.
	 * <p>
	 * Test case for issue #88.
	 * <p>
	 * Test case for issue #89.
	 * <p>
	 * Test case for issue #90.
	 * <p>
	 * Test case for issue #91.
	 * <p>
	 * Test case for issue #92.
	 * <p>
	 * Test case for issue #93.
	 * <p>
	 * Test case for issue #94.
	 * <p>
	 * Test case for issue #95.
	 * <p>
	 * Test case for issue #96.
	 * <p>
	 * Test case for issue #97.
	 * <p>
	 * Test case for issue #98.
	 * <p>
	 * Test case for issue #99.
	 * <p>
	 * Test case for issue #100.
	 * <p>
	 * Test case for issue #101.
	 * <p>
	 * Test case for issue #102.
	 * <p>
	 * Test case for issue #103.
	 * <p>
	 * Test case for issue #104.
	 * <p>
	 * Test case for issue #105.
	 * <p>
	 * Test case for issue #106.
	 * <p>
	 * Test case for issue #107.
	 * <p>
	 * Test case for issue #108.
	 * <p>
	 * Test case for issue #109.
	 * <p>
	 * Test case for issue #110.
	 * <p>
	 * Test case for issue #111.
	 * <p>
	 * Test case for issue #112.
	 * <p>
	 * Test case for issue #113.
	 * <p>
	 * Test case for issue #114.
	 * <p>
	 * Test case for issue #115.
	 * <p>
	 * Test case for issue #116.
	 * <p>
	 * Test case for issue #117.
	 * <p>
	 * Test case for issue #118.
	 * <p>
	 * Test case for issue #119.
	 * <p>
	 * Test case for issue #120.
	 * <p>
	 * Test case for issue #121.
	 * <p>
	 * Test case for issue #122.
	 * <p>
	 * Test case for issue #123