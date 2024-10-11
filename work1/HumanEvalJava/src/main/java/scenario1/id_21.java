package scenario1;


import java.util.ArrayList;
import java.util.List;


class RescaleToUnit {

    public static List<Double> rescaleToUnit(List<Double> numbers) {
        List<Double> result = new ArrayList<Double>();
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            result.add((numbers.get(i) - min) / (max - min));
        }
        return result;
    }

}