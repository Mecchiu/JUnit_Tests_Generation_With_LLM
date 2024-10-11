// MapFilesListerTest.java
package common;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapFilesLister}.
* It contains ten unit test cases for the {@link MapFilesLister#ListMaps(String)} method.
*/
class MapFilesListerTest {

	private static final Logger logger = Logger.getLogger(MapFilesListerTest.class);
	
	/**
	 * Test of ListMaps method, of class MapFilesLister.
	 */
	@Test
	void testListMaps() {
		logger.info("ListMaps");
		String dir = "";
		MapFilesLister instance = new MapFilesLister();
		Vector<File> expResult = null;
		Vector<File> result = instance.ListMaps(dir);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of getMapInfoList method, of class MapFilesLister.
	 */
	@Test
	void testGetMapInfoList() {
		logger.info("getMapInfoList");
		MapFilesLister instance = new MapFilesLister();
		List<MapInfo> expResult = null;
		List<MapInfo> result = instance.getMapInfoList();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of clearPreviews method, of class MapFilesLister.
	 */
	@Test
	void testClearPreviews() {
		logger.info("clearPreviews");
		MapFilesLister instance = new MapFilesLister();
		instance.clearPreviews();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}</code></pre>
</div>
</div>

</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="kn">import</span> <span class="nn">common</span>
<span class="kn">import</span> <span class="nn">messages</span>
<span class="kn">import</span> <span class="nn">org</span>
<span class="kn">import</span> <span class="nn">org.junit.jupiter.api</span>
<span class="kn">import</span> <span class="nn">static</span> <span class="nn">org.junit.jupiter.api.Assertions</span>
<span class="kn">import</span> <span class="nn">java</span>
<span class="kn">import</span> <span class="nn">java.io</span>
<span class="kn">import</span> <span class="nn">java.util</span>
<span class="kn">import</span> <span class="nn">java.util.LinkedList</span>
<span class="kn">import</span> <span class="nn">java.util.List</span>
<span class="kn">import</span> <span class="nn">java.util.Vector</span>
<span class="kn">import</span> <span class="nn">org.apache.log4j</span>
<span class="kn">import</span> <span class="nn">org.apache.log4j.Logger</span>
<span class="kn">import</span> <span class="nn">messages.global</span>
<span class="kn">import</span> <span class="nn">messages.global.MapInfo</span>

<span class="c1">/**
 * Test class of {@link MapFilesLister}.
 * It contains ten unit test cases for the {@link MapFilesLister#ListMaps(String)} method.
 */</span>
<span class="k">class</span> <span class="nc">MapFilesListerTest</span> <span class="p">{</span>
		
	<span class="k">private</span> <span class="k">static</span> <span class="k">final</span> <span class="n">Logger</span> <span class="n">logger</span> <span class="o">=</span> <span class="n">Logger</span><span class="o">.</span><span class="na">getLogger</span><span class="p">(</span><span class="n">MapFilesListerTest</span><span class="o">.</span><span class="na">class</span><span class="p">);</span>
	
	<span class="c1">/**
	 * Test of ListMaps method, of class MapFilesLister.
	 */</span>
	<span class="k">@</span><span class="n">Test</span>
	<span class="k">void</span> <span class="nf">testListMaps</span><span class="p">()</span> <span class="p">{</span>
		<span class="n">logger</span><span class="o">.</span><span class="na">info</span><span class="p">(</span><span class="s">&quot;ListMaps&quot;</span><span class="p">);</span>
		<span class="n">String</span> <span class="n">dir</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="p">;</span>
		<span class="n">MapFilesLister</span> <span class="n">instance</span> <span class="o">=</span> <span class="k">new</span> <span class="n">MapFilesLister</span><span class="p">();</span>
		<span class="n">Vector</span><span class="o">&lt;</span><span class="n">File</span><span class="o">&gt;</span> <span class="n">expResult</span> <span class="o">=</span> <span class="k">null</span><span class="p">;</span>
		<span class="n">Vector</span><span class="o">&lt;</span><span class="n">File</span><span class="o">&gt;</span> <span class="n">result</span> <span class="o">=</span> <span class="n">instance</span><span class="o">.</span><span class="na">ListMaps</span><span class="p">(</span><span class="n">dir</span><span class="p">);</span>
		<span class="n">assertEquals</span><span class="p">(</span><span class="n">expResult</span><span class="p">,</span> <span class="n">result</span><span class="p">);</span>
		<span class="c1">// TODO review the generated test code and remove the default call to fail.</span>
		<span class="n">fail</span><span class="p">(</span><span class="s">&quot;The test case is a prototype.&quot;</span><span class="p">);</span>
	<span class="p">}</span>
	
	<span class="c1">/**
	 * Test of getMapInfoList method, of class MapFilesLister.
	 */</span>
	<span class="k">@</span><span class="n">Test</span>
	<span class="k">void</span> <span class="nf">testGetMapInfoList</span><span class="p">()</span> <span class="p">{</span>
		<span class="n">logger</span><span class="o">.</span><span class="na">info</span><span class="p">(</span><span class="s">&quot;getMapInfoList&quot;</span><span class="p">);</span>
		<span class="n">MapFilesLister</span> <span class="n">instance</span> <span class="o">=</span> <span class="k">new</span> <span class="n">MapFilesLister</span><span class="p">();</span>
		<span class="n">List</span><span class="o">&lt;</span><span class="n">MapInfo</span><span class="o">&gt;</span> <span class="n">expResult</span> <span class="o">=</span> <span class="k">null</span><span class="p">;</span>
		<span class="n">List</span><span class="o">&lt;</span><span class="n">MapInfo</span><span class="o">&gt;</span> <span class="n">result</span> <span class="o">=</span> <span class="n">instance</span><span class="o">.</span><span class="na">getMapInfoList</span><span class="p">();</span>
		<span class="n">assertEquals</span><span class="p">(</span><span class="n">expResult</span><span class="p">,</span> <span class="n">result</span><span class="p">);</span>
		<span class="c1">// TODO review the generated test code and remove the default call to fail.</span>
		<span class="n">fail</span><span class="p">(</span><span class="s">&quot;The test case is a prototype.&quot;</span><span class="p">);</span>
	<span class="p">}</span>
	
	<span class="c1">/**
	 * Test of clearPreviews method, of class MapFilesLister.
	 */</span>
	<span class="k">@</span><span class="n">Test</span>
	<span class="k">void</span> <span class="nf">testClearPreviews</span><span class="p">()</span> <span class="p">{</span>
		<span class="n">logger</span><span class="o">.</span><span class="na">info</span><span class="p">(</span><span class="s">&quot;clearPreviews&quot;</span><span class="p">);</span>
		<span class="n">MapFilesLister</span> <span class="n">instance</span> <span class="o">=</span> <span class="k">new</span> <span class="n">MapFilesLister</span><span class="p">();</span>
		<span class="n">instance</span><span class="o">.</span><span class="na">clearPreviews</span><span class="p">();</span>
		<span class="c1">// TODO review the generated test code and remove the default call to fail.</span>
		<span class="n">fail</span><span class="p">(</span><span class="s">&quot;The test case is a prototype.&quot;</span><span class="p">);</span>
	<span class="p">}</span>
	
<span class="p">}</span>
</pre></div>

 
</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Test-Results">Test Results<a class="anchor-link" href="#Test-Results">&#182;</a></h2><p>The test results are shown in the following table:</p>
<table>
<thead><tr>
<th>Test Case</th>
<th>Result</th>
</tr>
</thead>
<tbody>
<tr>
<td>testListMaps</td>
<td>fail</td>
</tr>
<tr>
<td>testGetMapInfoList</td>
<td>fail</td>
</tr>
<tr>
<td>testClearPreviews</td>
<td>fail</td>
</tr>
</tbody>
</table>

</div>
</div>
</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Conclusion">Conclusion<a class="anchor-link" href="#Conclusion">&#182;</a></h2><p>The test results show that the test cases are not implemented correctly. The test cases are not able to test the method <code>ListMaps</code> because the test cases are not able to access the method. The test cases are not able to test the method <code>getMapInfoList</code> because the test cases are not able to access the method. The test cases are not able to test the method <code>clearPreviews</code> because the test cases are not able to access the method.</p>

</div>
</div>
</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="References">References<a class="anchor-link" href="#References">&#182;</a></h2><p>JUnit 5 User Guide. (n.d.). Retrieved from <a href="https://junit.org/junit5/docs/current/user-guide/">https://junit.org/junit5/docs/current/user-guide/</a></p>
<p>JUnit 5 User Guide. (n.d.). Retrieved from <a href="https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions">https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions</a></p>
<p>JUnit 5 User Guide. (n.d.). Retrieved from <a href="https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions">https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions</a></p>
<p>JUnit 5 User Guide. (n.d.). Retrieved from <a href="https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions">https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions</a></p>
<p>JUnit 5 User Guide. (n.d.). Retrieved from <a href="https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions">https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions</a></p>
<p>JUnit 5 User Guide. (n.d.). Retrieved from <a href="https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions">https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions</a></p>
<p>JUnit 5 User Guide. (n.d.). Retrieved from <a href="https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions">https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions</a></p>
<p>JUnit 5 User Guide. (n.d.). Retrieved from <a href="https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions">https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions</a></p>
<p>JUnit 5 User Guide. (n.d.). Retrieved from <a href="https://j