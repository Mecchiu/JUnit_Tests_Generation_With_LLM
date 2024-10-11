package scenario2;


class RightAngleTriangle {
    /**
     * * Given the lengths of the three sides of a triangle. Return True if the three
     * sides form a right-angled triangle, False otherwise.
     * A right-angled triangle is a triangle in which one angle is right angle or
     * 90 degree.
     */
    public static Boolean rightAngleTriangle(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            return false;
        }
        if (a > b && a > c) {
            return a * a == b * b + c * c;
        }
        if (b > a && b > c) {
            return b * b == a * a + c * c;
        }
        return c * c == a * a + b * b;
    }

}