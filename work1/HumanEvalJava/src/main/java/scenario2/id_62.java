package scenario2;


import java.util.ArrayList;
import java.util.List;


class Derivative {
    /**
     * xs represent coefficients of a polynomial.
     * xs[0] + xs[1] * x + xs[2] * x^2 + ....
     * Return derivative of this polynomial in the same form.
     */
    public static List<Object> derivative(List<Integer> xs) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 1; i < xs.size(); i++) {
            result.add(xs.get(i) * i);
        }
        return result;
    }

}