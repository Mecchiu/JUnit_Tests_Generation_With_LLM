// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
/**
		* The processor class's name.
		*/
		private java.lang.String processorClassName;
		/**
		* Private field used to save the processor class.
		*/
		private java.lang.Object processorRef = null;
		/**
		* Private field used to set the processor class. It is set into one {@link Processor} class during a {@link ProcessScript} execution.
		*/
		private java.lang.Object processorClass = null;
		/**
		* The processor class name.
		*/
		private java.lang.String type = null;
		/**
		* Test setter and getter method for the {@code type} property.
		* It is set into one {@link Processor} class during a {@link ProcessScript} execution.
		*/
		private java.lang.Boolean isType = false;
		/**
		* Test setter and getter method for the {@code processorRef} property.
		* It is set into one processor class during a {@link ProcessScript} execution.
		*/
		private java.lang.Object processorRef = null;
		/**
		* Test setter and getter method for the {@code processorClass} property.
		* It is set into a {@link Processor} class during a {@link ProcessScript} execution.
		*/
		private java.lang.Object processorClass = null;
		/**
		* Constructor for {@link ProcessorTest}.
		*/
		public ProcessorTest() {
		}

		/**
		* Constructor for {@link ProcessorTest} using a given type.
		* @param processorClassName the processor class name
		*/
		public ProcessorTest(java.lang.String processorClassName) {
			this.processorClassName = processorClassName;
		}

	
		@Test
		public void testProcessTypeDesc() {
			Processor processor = new Processor(processorClassName);
			assertEquals("Getter method for type return value",type,processor.getTypeDesc());
			processorRef = processor.processorRef;
			processorClass = processor.processorClass;
		}

	
		@Test
		public void testInitProcessor() {
			System.err.println("Processor:" + type);
		
			Processor processor = new Processor(processorClassName);
			byte[] byteData = new byte[10];
			processor.init();
			assertNotNull("Init processor returned a null data",processor.processorRef);
			controller.destroyProcessor(processorRef);
			processorRef = null;
		
			processor.init("Foo",byteData);
			assertEquals("Init method for processor returned unexpected data",type.toString(),new String(processorData(byteData,processorRef)));
			processor.destroy();
			processorRef = null;
		
			processor = new Processor(processorClassName);
			type = processor.getTypeDesc();
			assertNull("Destroy processor returned the wrong type",processorRef);
			processorRef = null;
		
			processor.init(processorConfig(type),byteData);
			assertEquals("Init method for processor returned unexpected data",type,new String(processorData(byteData,processorRef)));
			isType = true;
			processorRef = null;
		
			type = processor.getTypeDesc();
			assertNull("Destroy processor returned the wrong type",processorRef);
			processorRef = null;
			processor.destroy();
			processorRef = null;
		}

		/**
		* Test getProcessingQueueMethod
		*/
		@Test
		public void testProcessingQueueMethod() {
			ProcessingQueueProcessor processor = new ProcessingQueueProcessor() { 
				@Override
				public boolean process(ProcessorContext processorContext) {
					processorData(processorContext.getArgs(),processorContext.getResult());
					return true;
				}
			};
			processor.setProcessingQueueProcessor(processor);
			assertTrue("Get the property method",processor.processingQueueProcessor);

			processor.init();
			processor.destroyQueue();

			processor.setProcessingQueueProcessor(processor);
			processor.setQueue(process(ProcessorContext.getQUEUE(),null));

			processor.destroy();
			processorRef = null;
		}

		/**
		* Get processorConfig()
		*/
		@Test
		public void testGetProcessorConfig() {
			Processor processorConfig = new Processor();

			byte[] bytes = processorConfig.getProcessorConfig();
			Processor processor = new Processor(processorClassName);
			byte[] byteData = new byte[10];
			processor.init(bytes,byteData);
			assertEquals("Get the method method",type.toString(),new String(processorData(bytes,processorRef)));
		}

		/**
		* Test processorConfig()
		*/
		@Test
		public void testGetProcessorConfig2() {
			Processor processorConfig = new Processor();

			byte[] bytes = processorConfig.getProcessorConfig();
			Processor processor = new Processor(processorClassName);
			byte[] byteData = new byte[10];
			processor.init(bytes);
			type = processor.getTypeDesc();
			assertNull("Get the method method",processor.processingQueueProcessor);
			System.out.println("Get the method " + processor.processingQueueProcessor);
			assertEquals("Get the method method",type.toString(),new String(processorData(byteData,processorRef)));
		}

	
		/**
		* Test the processorData() method
		*/
		public static byte[] processorData(byte[] bytes,java.lang.Object processorRef) {return bytes;}

		/**
		* Create a processor data
		*/
		@Test
		public void testProcessorData() {
			Processor processor = new Processor() { 
				@Override
				public byte[] processorData(ProcessorContext processorContext) {
					processorContext.setResult(null);
					processorContext.setArgs(null);
					return processorContext.getArgs();
				}
			};
			processor.setProcessingQueueProcessor(processor);
			
			byte[] bytes = processor.processorData("Foo");
			assertEquals("Get data method",bytes[0],0);
		}

	
		
	}

}
