// ExplosionBoundsTest.java
package server;

import java.awt.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplosionBounds}.
* It contains one unit test case for the {@link ExplosionBounds#contain(Point)} method.
*/
class ExplosionBoundsTest {
/**
* Constructs a new test object.
* @param pTest The Point to be tested.
*/
	public ExplosionBoundsTest(Point pTest) {
		this.p = pTest;
		this.p1 = pTest;
		this.p2 = pTest;
		this.p3 = pTest;
	}

	/**
* Checks if the given point is within the bounds.
*
* @param p The Point to be checked.
* @return True if p is within the bounds, false if not.
*/
	public boolean contain(Point p) {
		return (p.x >= this.p1.x && p.y >= this.p1.y &&
				p.x <=  this.p2.x && p.y <=  this.p2.y);
	}
	/**
 * Constructs an {@link ExplosionBounds} object of specified bounds.
 * @param b The {@link ExplosionBounds} object to be used.
*/
	public static ExplosionBounds<Double> create(ExplosionBounds<Double> b) {

		/* Define the maximum and minimum coordinates */
		Point maxX = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
		Point maxY = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
		Point minX = new Point(Integer.MIN_VALUE, Integer.MIN_VALUE);
		Point minY = new Point(Integer.MIN_VALUE, Integer.MIN_VALUE);

		/* The coordinates of the min/max bound box */
		Point p1MinX = new Point( Integer.MAX_VALUE, Integer.MIN_VALUE);
		Point p1MinY = new Point( Integer.MIN_VALUE, Integer.MAX_VALUE);
		Point p2MinX = new Point( Integer.MIN_VALUE, Integer.MIN_VALUE);
		Point p2MinY = new Point( Integer.MAX_VALUE, Integer.MAX_VALUE);

		/* The coordinates of the maximum bound box */
		Point pMaxX = new Point( Integer.MAX_VALUE, Integer.MAX_VALUE);
		Point pMaxY = new Point( Integer.MAX_VALUE, Integer.MAX_VALUE);
		Point pMinX = new Point( Integer.MIN_VALUE, Integer.MIN_VALUE);
		Point pMinY = new Point( Integer.MIN_VALUE, Integer.MIN_VALUE);

		/* The coordinate of which p1_min/p2_min are defined */
		Point p1Min = new Point( Integer.MAX_VALUE, Integer.MAX_VALUE);
		Point p2Min = new Point( Integer.MIN_VALUE, Integer.MAX_VALUE);

		/* The coordinate of which p1_max/p2_max are defined */
		Point p1Max = new Point( Integer.MIN_VALUE, Integer.MAX_VALUE);
		Point p2Max = new Point( Integer.MAX_VALUE, Integer.MAX_VALUE);

		return new ExplosionBounds<Double>(maxX, maxY, minX, minY, p1MinX, p1MinY,
				maxX, maxY, minX, minY, p2MinX, p2MinY, maxX, maxY, minX, minY,
				p1Min.y, p1Min.x, p1Max.y, p1Max.x, p2Min.y, p2Min.x,
				p2Max.y, p2Max.x);
	}

	/**
 * Converts the given bounds into an equivalent ExplosionBounds using values
 * from the given one.
 */
	public static ExplosionBounds<Double> from(ExplosionBounds<Double> b, ExplosionBounds<Double> to) {

		/* Define bounds of to */
		Point pToMin = to.getMinX();
		Point pToMax = to.getMaxX();

		/* Create points for both bounds */
		Point p1 = new Point( Integer.MAX_VALUE, Integer.MAX_VALUE);
		Point p2 = new Point( Integer.MAX_VALUE, Integer.MAX_VALUE);
		Point p3 = new Point( Integer.MIN_VALUE, Integer.MIN_VALUE);

		/* Define range of points */
		Point pRange = new Point( Integer.MAX_VALUE - Integer.MAX_VALUE, Integer.MAX_VALUE - Integer.MAX_VALUE);

		/* Set the second point to be closest to the upper bound */
		p2.setY(pToMax.y+10);

		/* Set the range to be the distance from the upper bound to the second point */
		pRange.setY(pToMax.y - pToMin.y);

		/* Set the third point to be closest to the lower bound */
		p3.setY(pToMin.y);

		return new ExplosionBounds<Double>(p1, p2, p3, pToMin.x, pToMin.y, pToMin.y,
				pToMax.x, pToMax.y, pToMax.x, pToMax.y, pRange.x, pRange.y, pRange.x,
				pToMax.y, pToMax.x);
	}
	private ExplosionBounds<Double> p;
	private ExplosionBounds<Double> p1;
	private ExplosionBounds<Double> p2;
	private ExplosionBounds<Double> p3;

	public ExplosionBoundsTest(ExplosionBounds<Double> p1, ExplosionBounds<Double> p2,
			ExplosionBounds<Double> p3, ExplosionBounds<Double> p) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}


	public boolean contain(ExplosionBounds<Double> b) {
		/* If this test has a given p as its input, that is true */
		if (p!= null) {
			return p.contain(b);
		}

		/* Otherwise, the conditions are asserted */
		if (p1 == null) {
			return p2.contain(b);
		}
		if (p2 == null) {
			return p1.contain(b);
		}
		if (p3 == null) {
			return p.contain(b);
		}
		if (p2.contain(b)) {
			return true;
		}
		return false;
	}

	public ExplosionBoundsTest(ExplosionBounds<Double> p1, ExplosionBounds<Double> p2, ExplosionBounds<Double> p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public ExplosionBoundsTest(ExplosionBounds<Double> p1, ExplosionBounds<Double> p2, ExplosionBounds<Double> p3) {
	super();
	this.p1 = p1;
	this.p2 = p2;
	this.p3 = p3;}

	public void show() {
		System.out.println("\n\n\n\n");

		/* Define boundaries of the test case */
		Point p1MinX = p1.getMinX();
		Point p1MinY = p1.getMinY();
		Point p2MinX = p2.getMinX();
		Point p2MinY = p2.getMinY();
		Point p3MinX = p3.getMinX();
		Point p3MinY = p3.getMinY();
		Point p1MaxX = p1.getMax