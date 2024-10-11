// ArrayOfJobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains one unit test case for the {@link ArrayOfJob#getTypeDesc()} method.
*/
class ArrayOfJobTest {
		javax.xml.namespace.QName tb = null;
		ArrayOfJob target = null;
	
        private static javax.xml.namespace.QName constructor = null;
    
        /*
        *  Constructor
        */
        public ArrayOfJobTest() {
            tb = new javax.xml.namespace.QName("http://mygrid.jaas.iaas.com/", "arrayOfJob");
        }

        /**
         *  Test of the "getTypeDesc" method, of class "ArrayOfJob".
         */
        @Test
        public void testGetTypeDesc() {
            tb = ArrayOfJob.typeDesc;
        }

        /**
         *  Test of the "getTypeDesc" method, of class "ArrayOfJob", return type.
         */
        @Test
        public void testGetTypeDesc1() {
            // link to.java file in the same package as the class under test
            java.lang.Class cls = ArrayOfJob.class;
            // instantiate the linkable object (not the instantiated member object)
            ArrayOfJob inst;
            // get the method parameter values
            tb = new javax.xml.namespace.QName("http://mygrid.jaas.iaas.com/", "arrayOfJob");
            cls = ArrayOfJob.class;
            // get the instance attribute
            inst = ArrayOfJob.get(mygrid.web.Application.getInstance());
            assertEquals("arrayOfJob",
                    inst.getTypeDesc().getLocalPart());
        }

        /**
         *  Test of the "getClass" method, of class "ArrayOfJob", return type.
         */
        @Test
        public void testGetClass() {
            // link to.java file in the same package as the class under test
            java.lang.Class cls = ArrayOfJob.class;
            // instantiate the linkable object (not the instantiated member object)
            ArrayOfJob inst;
            // get the method parameter values
            tb = new javax.xml.namespace.QName("http://mygrid.jaas.iaas.com/", "arrayOfJob");
            cls = ArrayOfJob.class;
            // get the instance attribute
            inst = ArrayOfJob.get(mygrid.web.Application.getInstance());
            assertTrue("arrayOfJob", cls.isInstance(inst));
        }

        /**
         *  Test of the "getTypeDesc" method, of class "ArrayOfJob", return type.
         */
        @Test
        public void testGetDesc() {
            tb = ArrayOfJob.typeDesc;
        }


        /**
         * Test of setJavaClass method, of class ArrayOfJob.
         */
        @org.junit.Test
        public void testSetJavaClass() {
            ArrayOfJob result = null;
            //
            result = (ArrayOfJob) java.lang.reflect.ConstructorUtil.invoke(target, "setJavaClass", new java.lang.Object[] {tb});
            // TODO add your test code here
            assertEquals(tb.getLocalPart(), result.getTypeDesc().getLocalPart());
        }

        /**
         * Test of setJavaClass method, of class ArrayOfJob, return type.
         */
        @org.junit.Test
        public void testSetJavaClass1() {
            java.lang.Class cls = target.getJavaClass();
            // type description is class
            assertEquals("ArrayOfJob", ArrayOfJob.typeDesc.getLocalPart());
            // set a new type description
            target.setJavaClass("org.mygrid.mygridwebapp.ArrayJob");
            // invoke the set method with new type description
            ArrayOfJob result = (ArrayOfJob) java.lang.reflect.ConstructorUtil.invoke(target, "setTypeDesc", new java.lang.Object[] {tb});
            // TODO add your test code here
        }

        /**
         * Test of getJavaClass method, of class ArrayOfJob, return type.
         */
        @org.junit.Test
        public void testGetJavaClass() {
            //
            List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
            list.add("ArrayOfJob");
            //
            target = ArrayOfJob.get(list);
            // invoke the getJavaClass method
            java.lang.String str = target.getJavaClass();
            // TODO add your test code at com.espertech.esper.client.EventType.getJavaClass()
        }

        /**
         * Test of convertCollectionType method, of class ArrayOfJob, return type.
         */
        @org.junit.Test
        public void testConvertCollectionType() {
            //
            List<ArrayOfJob> coll = new java.util.ArrayList<ArrayOfJob>();
            ArrayOfJob arrayOfJob;
            // list of mygrid.web.Application objects
            ArrayOfJob[] mygridwebappArrayOfJob = new ArrayOfJob[2];

            coll.add(arrayOfJob= ArrayOfJob.create());
            arrayOfJob = new ArrayOfJob();
            arrayOfJob.setTypeDesc("ArrayOfJob");
            arrayOfJob.setDataArray(mygridwebappArrayOfJob);
            // invoke the convertCollection method
            coll = ArrayOfJob.convertCollection(coll, "ArrayOfJob");
            // TODO add your test code at com.espertech.esper.client.EventType.convertCollection()
        }

}