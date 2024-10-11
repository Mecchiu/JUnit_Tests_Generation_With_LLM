// RIFImplementationManager_0Test.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains one unit test case for the {@link RIFImplementationManager#getInstance()} method.
*/
class RIFImplementationManager_0Test {
public static class MyInt implements Comparable<MyInt> {
			private MyInt(){
				//do nothing
			}
			
			public MyInt(int value){
				System.out.println("MyInt["+ value +"]");
				this.value = value;
			}
			public int value;
			@Override public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + value;
				return result;
			}
			@Override public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass()!= obj.getClass())
					return false;
				MyInt other = (MyInt) obj;
				if (value!= other.value)
					return false;
				return true;
			}
			public int compareTo(MyInt that) throws ClassCastException{
				//we do not have order in RIF. Hence sorting by value. This also sorts by name.
				if ((this.value < that.value)) return -1;
				if ((this.value > that.value)) {
					return 1;
				}
				return 0;
			}
		}
    public static class MyStr implements Comparable<MyStr> {
        public void print(){
            System.out
                   .println(this);
            }
            public MyStr(String value) {
                System.out.println("MyStr["+ value +"]");
                this.value = value;
            }
            public String value;
        @Override public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + value.hashCode();
            return result;
        }
        @Override public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass()!= obj.getClass())
                return false;
            MyStr other = (MyStr) obj;
            if (value!= other.value)
                return false;
            return true;
        }

        @Override public int compareTo(MyStr that) throws ClassCastException{
            //we do not have order in RIF. Hence sorting by name.
            if (this.value == that.value) {
                return 0;
            } else if (this.value!= null && that.value!= null) {
                return this.value.compareTo(that.value);
            }
            return 0;
        }
    }
    public static class MyDynInt implements Comparable<MyDynInt> {
        public MyDynInt(MyInt value) {
            this.value = value;
        }
        public MyInt value;
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + value.hashCode();
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass()!= obj.getClass())
                return false;
            MyDynInt other = (MyDynInt) obj;
            if (value!= other.value)
                return false;
            return true;
        }
        public int compareTo(MyDynInt that) throws ClassCastException {
            //we do not have order in RIF. Hence sorting by value.
            if (value.value == that.value.value) {
                return 0;
            } else if (value.value!= null && that.value.value!= null) {
                return this.value.value.compareTo(that.value.value);
            }
            return 0;
        }
    }
	public void test_getInstance(){
        instance = RIFImplementationManager.getInstance();
        System.out.println(instance.toString());

        System.out.println("MyInt");
        MyInt value = instance.getValue("MyInt", MyInt.class);
        assertEquals(MyInt.class, value.getClass());
        System.out.println("myInt:" + value);
        System.out.println("value:" + value);
        assertEquals(MyInt.value, value);

		System.out.println("MyStr");
        MyStr valueStr = instance.getValue("MyStr", MyStr.class);
        assertEquals(MyStr.class, valueStr.getClass());
        System.out.println("myStr:" + valueStr);
        System.out.println("valueStr:" + valueStr);
        assertEquals(MyStr.value, valueStr);
	}


}
