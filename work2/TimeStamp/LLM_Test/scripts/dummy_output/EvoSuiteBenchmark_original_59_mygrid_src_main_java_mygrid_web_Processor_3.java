// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
		Processor() {
		}
		
		Processor(java.lang.String type) {
			type = type.replace(" ", "");
			type = type.replace("-", "/");
			this.type = type;
		}
		
		Processor(java.lang.String type, java.lang.String assembly) {
			type = type.replace(" ", "");
			type = type.replace("-", "/");
			this.type = type;
			this.assembly = assembly;
		}
		
		/**
		* Test the method {@link Processor#getTypeDesc()}.
		*/
		@Test
		public void
		testTypeDesc() {
			org.apache.axis.message.DescribeTypeRequest request =
				new org.apache.axis.message.DescribeTypeRequest();
			request.setType(type + "/") ;
			org.apache.axis.message.DescribeTypeResponse resp;
			Processor processor = new Processor();
			resp = processor.getTypeDesc(request);
			
			assertTrue("Successful type",
				resp.getType()!= null);
			assertTrue("Type is empty", (resp!= null)?resp.getType().length()>0:true);
			assertTrue("Assembly is empty",
				(resp!= null)?(resp.getType()!= null)&&(resp.getAssembly()!=null):true);
		}
		
		/**
		* Test the method {@link Processor#getTypeDesc()} for a null
		* type.
		*/
		@Test
		public void testTypeDesc_Null() {
			org.apache.axis.message.DescribeTypeRequest request =
				new org.apache.axis.message.DescribeTypeRequest();
			Processor processor = new Processor();
			request.setType(null);
			org.apache.axis.message.DescribeTypeResponse resp;
			Processor processor2 = new Processor();
			resp = processor2.getTypeDesc(request);
			
			assertTrue("Null type should return type desc", (resp!=null));
			assertTrue("Not empty type should", resp.getType().length()>0);
		}
		
		/**
		* Test the method {@link Processor#getTypeDesc()} for a non-null
		* type.
		*/
		@Test
		public void testTypeDesc_Nonnull() {
			org.apache.axis.message.DescribeTypeRequest request =
				new org.apache.axis.message.DescribeTypeRequest();
			Processor processor = new Processor();
			request.setType(type + "/") ;
			org.apache.axis.message.DescribeTypeResponse resp;
			resp = processor.getTypeDesc(request);
			
			assertTrue("Non-empty type should return type desc", (resp!=null));
			assertTrue("Not empty type should", (resp.getType().length()>0));
		}
		
		/**
		* Test the method {@link Processor#getAssembly()} with asm
		* paramter, non null.
		*/
		@Test
		public void testAssembly() {
			Processor processor = new Processor();
			org.apache.axis.message.DescribeTypeRequest request =
				new org.apache.axis.message.DescribeTypeRequest();
			request.setAssembly(type);
			org.apache.axis.message.DescribeTypeResponse resp;
			resp = processor.getTypeDesc(request);
			
			assertTrue("Non-empty assembly should return assembly", (resp!=null)&&(resp.getAssembly()!=null));
			assertTrue("Not empty assembly should", (resp.getType().length()>0));
			assertTrue("Type is empty as assembly", (resp.getType().length()==0)&&(resp.isAssembly()));
		}
		
	}