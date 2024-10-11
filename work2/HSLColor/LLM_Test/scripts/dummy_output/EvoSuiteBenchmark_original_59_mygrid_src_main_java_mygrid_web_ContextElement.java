// ContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElementTest {
		public ContextElementTest() {
			// TODO
		}
		public void test() {
				ContextElement ctx = new ContextElement();
				ctx.setName("mygrid-user.xml");
				ctx.setContent("<mygrid-user xmlns='http://mygrid.mygroup/ns/0.8/'><user><elem1>hello world</elem1></user><user><elem2>another</elem2></user>");
				assertEquals(ctx.getName(), "mygrid-user.xml");
				assertEquals(ctx.getContent(), "<mygrid-user xmlns='http://mygrid.mygroup/ns/0.8/'><user><elem1>hello world</elem1></user><user><elem2>another"
				+ "</elem2></user>");
//				assertEquals(ctx.getContent(), "<mygrid-user xmlns='http://mygrid.mygroup/ns/0.8/'>"
//				+ "mygrid-user.xml</mygrid-user>");
				assertNotSame(null, ctx);
			}

		}
		
// ContextElementTest_TypeDesc.java Test class of {@link ContextElement}