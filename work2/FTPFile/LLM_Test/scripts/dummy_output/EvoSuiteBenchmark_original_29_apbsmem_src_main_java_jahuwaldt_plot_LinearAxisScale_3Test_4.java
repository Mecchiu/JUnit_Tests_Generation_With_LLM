// LinearAxisScale_3Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_3Test {
		public LinearAxisScale_3Test() {
	}

	double  f1, f2;
	double[] f2r;

	void setFunctions() {
		double[] f = new double[5];
		f1=f[0]=5;
		f2 = f[1]=8;
	}

	void setFunctions_2() {
		double[] f2r = new double[2];
		f2r[0] = 5;
		f2r[1] = 8;
	}

	DoubleMatrix getVals() {
		DoubleMatrix vec = new DoubleMatrix(5,5);
		Vector vec2 = new Vector(5);
		vec.put(f1,0,5);
		vec.put(f1,1,6);
		vec.put(f1,2,7);
		vec.put(f2,0,8);
		vec.put(f2,1,9);
		vec2.put(f2r,0,2);
		return vec;
	}

	void test() {
		setFunctions();
		setFunctions_2();
		DoubleMatrix v = getVals();
		double[] a = v.toArray();
}
}