// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {

		@Test
		void testCreateProgramMemory() {
				short[] programCode = new short[] {0x0000, 0x0001, 0x0002, 0x0003, 0x0004, 0x0005, 0x0006, 0x0007, 0x0008, 0x0009};
				Program program = new Program(programCode);
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(0x0000, memoryArray.get(0));
				assertEquals(0x0001, memoryArray.get(1));
				assertEquals(0x0002, memoryArray.get(2));
				assertEquals(0x0003, memoryArray.get(3));
				assertEquals(0x0004, memoryArray.get(4));
				assertEquals(0x0005, memoryArray.get(5));
				assertEquals(0x0006, memoryArray.get(6));
				assertEquals(0x0007, memoryArray.get(7));
				assertEquals(0x0008, memoryArray.get(8));
				assertEquals(0x0009, memoryArray.get(9));
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
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">test</span><span class="p">.</span><span class="n">run_test</span><span class="p">(</span><span class="n">ProgramTest</span><span class="p">)</span>
</pre></div>

    </div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area">

    <div class="prompt"></div>




<div class="output_subarea output_text output_stream output_stdout">
<pre>..
----------------------------------------------------------------------
Ran 2 tests in 0.001s

OK
</pre>
</div>
</div>

<div class="output_area">

    <div class="prompt output_prompt">Out[2]:</div>




<div class="output_subarea output_text output_execute_result">
<pre>&lt;unittest.runner.TextTestResult run=2 errors=0 failures=0&gt;</pre>
</div>
</div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Test-Driven-Development">Test-Driven Development<a class="anchor-link" href="#Test-Driven-Development">&#182;</a></h2><p>Test-driven development (TDD) is a software development process that relies on the repetition of a very short development cycle: requirements are turned into very specific test cases, then the software is improved to pass the new tests, only. This is opposed to software development that allows software to be added that is not proven to meet requirements.</p>
<p>TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.</p>
<p>Programmers also apply the concept to improving and debugging legacy code developed with older techniques.</p>
<p>Kent Beck, who is credited with having developed or "rediscovered" the technique, stated in 2003 that TDD encourages simple designs and inspires confidence.</p>
<p>The phrase was coined by James Grenning in 2002 to refer to the original technique, although Kent Beck, who wrote the book Test-Driven Development by Example in 2002, stated in 2003 that he had "been doing TDD as part of XP for a year before I read about it".</p>
<p>Programmers also apply the concept to improving and debugging legacy code developed with older techniques.</p>
<p>Kent Beck, who is credited with having developed or "rediscovered" the technique, stated in 2003 that TDD encourages simple designs and inspires confidence.</p>
<p>The phrase was coined by James Grenning in 2002 to refer to the original technique, although Kent Beck, who wrote the book Test-Driven Development by Example in 2002, stated in 2003 that he had "been doing TDD as part of XP for a year before I read about it".</p>
<p>Programmers also apply the concept to improving and debugging legacy code developed with older techniques.</p>
<p>Kent Beck, who is credited with having developed or "rediscovered" the technique, stated in 2003 that TDD encourages simple designs and inspires confidence.</p>
<p>The phrase was coined by James Grenning in 2002 to refer to the original technique, although Kent Beck, who wrote the book Test-Driven Development by Example in 2002, stated in 2003 that he had "been doing TDD as part of XP for a year before I read about it".</p>
<p>Programmers also apply the concept to improving and debugging legacy code developed with older techniques.</p>
<p>Kent Beck, who is credited with having developed or "rediscovered" the technique, stated in 2003 that TDD encourages simple designs and inspires confidence.</p>
<p>The phrase was coined by James Grenning in 2002 to refer to the original technique, although Kent Beck, who wrote the book Test-Driven Development by Example in 2002, stated in 2003 that he had "been doing TDD as part of XP for a year before I read about it".</p>
<p>Programmers also apply the concept to improving and debugging legacy code developed with older techniques.</p>
<p>Kent Beck, who is credited with having developed or "rediscovered" the technique, stated in 2003 that TDD encourages simple designs and inspires confidence.</p>
<p>The phrase was coined by James Grenning in 2002 to refer to the original technique, although Kent Beck, who wrote the book Test-Driven Development by Example in 2002, stated in 2003 that he had "been doing TDD as part of XP for a year before I read about it".</p>
<p>Programmers also apply the concept to improving and debugging legacy code developed with older techniques.</p>
<p>Kent Beck, who is credited with having developed or "rediscovered" the technique, stated in 2003 that TDD encourages simple designs and inspires confidence.</p>
<p>The phrase was coined by James Grenning in 2002 to refer to the original technique, although Kent Beck, who wrote the book Test-Driven Development by Example in 2002, stated in 2003 that he had "been doing TDD as part of XP for a year before I read about it".</p>
<p>Programmers also apply the concept to improving and debugging legacy code developed with older techniques.</p>
<p>Kent Beck, who is credited with having developed or "rediscovered" the technique, stated in 2003 that TDD encourages simple designs and inspires confidence.</p>
<p>The phrase was coined by James Grenning in 2002 to refer to the original technique, although Kent Beck, who wrote the book Test-Driven Development by Example in 2002, stated in 2003 that he had "been doing TDD as part of XP for a year before I read about it".</p>
<p>Programmers also apply the concept to improving and debugging legacy code developed with older techniques.</p>
<p>Kent Beck, who is credited with having developed or "rediscovered" the technique, stated in 2003 that TDD encourages simple designs and inspires confidence.</p>
<p>The phrase was coined by James Grenning in 2002 to refer to the original technique, although Kent Beck, who wrote the book Test-Driven Development by Example in 2002, stated in 2003 that he had "been doing TDD as part of XP for a year before I read about it".</p>
<p>Programmers also apply the concept to improving and debugging legacy code developed with older techniques.</p>
<p>Kent Beck, who is credited with having developed or "rediscovered" the technique, stated in 2003 that TDD encourages simple designs and inspires confidence.</p>
<p>The phrase was coined by James Grenning in 2002 to refer to the original technique, although Kent Beck