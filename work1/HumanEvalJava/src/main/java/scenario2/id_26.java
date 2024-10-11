package scenario2;


import java.util.ArrayList;
import java.util.List;


class RemoveDuplicates {
    /**
     * From a list of integers, remove all elements that occur more than once.
     * Keep order of elements left the same as in the input.
     */
    public static List<Object> removeDuplicates(List<Object> numbers) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.indexOf(numbers.get(i)) == numbers.lastIndexOf(numbers.get(i))) {
                result.add(numbers.get(i));
            }
        }
        return result;
    }

}