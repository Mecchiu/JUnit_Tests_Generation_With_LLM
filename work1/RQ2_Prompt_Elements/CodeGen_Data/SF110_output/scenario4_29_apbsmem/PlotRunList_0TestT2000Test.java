// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {
static final class Element {
	 private Object object;
		public Element(Object obj) {
	 object = obj; }
	public Object getObject() { return object; }
		public void setObject(Object obj) { object = obj;} }

public int main() {
if(new Set().contains(new Element("zero"), new Element("one"), new Element("two")))
    return 1;
else
    return 0;}

}

/**
* A test suite that exercises the list's methods.
*/
class Set {
public static void main(String[] args) {
List all = new ArrayList();
all.add("zero");
all.add("one");
all.add("two");
new Set().iterator();
assertEquals(0,all.size());
assertNotSame(all,all);
all.clear();
all.add("three");
assertEquals(0,all.size());


} }

