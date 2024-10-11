// Memory_1Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains one unit test case for the {@link Memory#get(int)} method.
*/
class Memory_1Test {

	@Test
	public void testGet() {
		List<MemoryArray> arrays = new ArrayList<>(0);
		assertNull("First get of Memory_1Test does not return null", Memory.get(0));
		assertNull("Second get of Memory_1Test does not return null", Memory.get(1));
		
		arrays.add(new MemoryArray());
		arrays.add(new MemoryArray());
		arrays.add(new MemoryArray());
		arrays.add(new MemoryArray());
		arrays.get(0).incrementCounter(1);
		arrays.get(1).incrementCounter(2);
		arrays.get(1).incrementCounter(3);
		arrays.get(2).incrementCounter(4);
		arrays.get(2).incrementCounter(5);
		arrays.get(2).incrementCounter(6);
		arrays.get(0).incrementCounter(7);
		arrays.get(3).incrementCounter(8);
		arrays.get(3).incrementCounter(9);
		arrays.get(3).incrementCounter(10);
		assertEquals("Second get of Memory_1Test invalid test data",
						   arrays.get(0), Memory.get(1));
		assertEquals("Third get of Memory_1Test invalid test data",
						   arrays.get(1), Memory.get(2));
		assertEquals("Fourth get of Memory_1Test invalid test data",
						   arrays.get(2), Memory.get(3));
		assertNull("Fifth get of Memory_1Test does not return null", Memory.get(4));
		assertNull("Sixth get of Memory_1Test does not return null", Memory.get(5));
		assertNull("Seventh get of Memory_1Test does not return null", Memory.get(6));
	}
}

// MemoryArray.java
class MemoryArray implements ArrayDequeue {

	public int size() {
		return size;
	}

	public MemoryArray subarray(int offset) {
		MemoryArray arraySubarray = new MemoryArray(offset);
		subarray.addToChain(arraySubarray);
		return arraySubarray;
	}

	public MemoryArray addToChain(MemoryArray subarray) {
		subarray.addToChain(this);
		return subarray;
	}

	@Override
	public int compareTo(Object obj) {
		return compareToHash(obj);
	}

	@Override
	public int compareToHash(Object another) {
		return comparator_.compare((MemoryArray) another, this);
	}

	public void incrementCounter(int offset) {
		Memory_1.incrementCounter(this, offset);
	}

}

class MemoryArray implements List<MemoryArray> {

	public int size = 0;
	public MemoryArray addToChain(MemoryArray newArray) {
		addToChain(size, newArray);
		return null;
	}

	public int position() {
		return size;
	}
	@Override
	public int hashCode() {
		return hashCodeHash(position());
	}
	@Override
	public boolean equals(Object obj) {
		return equalsHash(obj);
	}
	@Override
	public int compareTo(Object obj) {
		return compareToHash(obj);
	}
	public MemoryArray pop() {
		MemoryArray array = null;
		if (size > 0) {
			array = new MemoryArray();
			size--;
		}
		return array;
	}
	public void setAt(int position, MemoryArray array) {
		if (size < position) {
			Memory.subarray(size);
		}
		size++;
		addToChain(array);
	}
	public void addToChain(int position, MemoryArray array) {
		array.addToChain(this);
	}
	public MemoryArray last() {
		memoryChain.addToList(lastElement());
		return lastElement();
	}
	public Memory get(int offset) {
		if (offset >= position() || offset < 0) {
			return null;
		}
		return get(position());
	}

	public int size() {
		return size;
	}
	public Memory getAt(int position) {
		if (position >= position()) {
			return null;
		} else {
			return get(position);
		}
	}
	public MemoryElement getLastElement() {
		return null;
	}
	public MemoryElement lastElement() {
		if (size > 0) {
			return last();
		} else {
			return null;
		}
	}
	public int lastPosition() {
		return last().position();
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int position() {
		return position;
	}
	public MemoryElement peek() {
		int element = position();
		int position;
		boolean isAt = false;

		if (element > position()) {
			isAt = true;
			element++;
		}

		if (element > position()) {
			position++;
			if (isAt) {
				isAt = false;
				element = position();
			} else {
				isAt = true;
				element++;
			}
		}

		while (isElementPresent(element)) {
			element++;
		}

		return isAt? element : null;
	}
	public void setLastElement(MemoryElement element) {
		setPosition(element.position());
		last = element;
	}
	public MemoryElement set(int offset, MemoryElement element) {
		setPosition(offset);
		setLastElement(element);
		return get(offset);
	}
	public MemoryElement removeAt(int position) {
		return remove(!positionPresent(position));
	}
	public MemoryElement remove(boolean isPresent) {
		MemoryElement element = get();
		if (isPresent) {
			if (positionPresent(position())) {
				position--;
			} else {
				position++;
			}
		}
		get().setAt(position(), null);
		if (element!= null) {
			setLastElement(element);
		}
		return element;
	}
	public boolean isPresentAt(int position) {
		MemoryElement element = get();
		if (!isElementPresent(position)) {
			return false;
		}
		return true;
	}
	public int getIndex() {
		return position();
	}
	public List<MemoryElement> asList() {
		return this;
	}
	public boolean containsAt(int position) {
		return contains(position);
	}
	public boolean contains(int position) {
		return indexInChain(position) >= 0;
	}
	public void insertAt(int index, MemoryElement element) {
		if (!containsAt(index)) {
			setLastElement(element);
		}
		setPosition(index + 1);
	}
	public int indexInChain(int position) {
		if (indexPresent(position)) {
			return position;
		} else {
			return last().position();
		}
	}
	public void appendTo(List<MemoryElement> list) {
		for (MemoryElement anElement : list) {
			appendTo(anElement);
		}
	