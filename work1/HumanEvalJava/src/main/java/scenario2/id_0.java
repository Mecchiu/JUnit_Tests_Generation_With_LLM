package scenario2;

import java.util.List;


class HasCloseElements {
    /**
     * Check if in given list of numbers, are any two numbers closer to each other than
     * given threshold.
     */
    public static Boolean hasCloseElements(List<Double> numbers, Double threshold) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (Math.abs(numbers.get(i) - numbers.get(j)) < threshold) {
                    return true;
                }
            }
        }
        return false;
    }


}