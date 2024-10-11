package scenario1;


import java.util.ArrayList;
import java.util.List;


class SumProduct {

    public static List<Integer> sumProduct(List<Object> numbers) {
        Integer sum = 0;
        Integer product = 1;
        for (Object number : numbers) {
            if (number instanceof Integer) {
                sum += (Integer) number;
                product *= (Integer) number;
            } else {
                throw new IllegalArgumentException("Invalid number type");
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(sum);
        result.add(product);
        return result;
    }

}