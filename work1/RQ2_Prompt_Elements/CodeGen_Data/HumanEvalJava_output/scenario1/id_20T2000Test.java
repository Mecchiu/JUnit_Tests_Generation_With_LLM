// FindClosestElementsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains one unit test case for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {

public FindClosestElementsTest() {
}
*/
// FindingClosestElementsTest.java
/*
 * ***************************************************************************
 * Copyright (C) 2010-2011 by folkertal, mixedware.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * ****************************************************************************
*/


public class FindClosestElementsTest {
	
	@Test
	public void testFindClosestElements()
	{
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(25.9);
		numbers.add(50.1);
		numbers.add(20.8);
		assertEquals(2, FindClosestElements.findClosestElements(numbers).size());
	}
	
	@Test
	public void testFindClosestElements2()
	{
		List<Double> numbers = new ArrayList<Double>();
		
		numbers.add(5.9);
		numbers.add(10.1);
		numbers.add(2.2);
		numbers.add(0.8);
		assertEquals(-4.0, FindClosestElements.findClosestElements(numbers).size());
	}
}
