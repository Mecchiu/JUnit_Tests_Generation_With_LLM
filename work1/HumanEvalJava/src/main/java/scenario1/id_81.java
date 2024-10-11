package scenario1;


import java.util.ArrayList;
import java.util.List;


class NumericalLetterGrade {

    public static List<String> numericalLetterGrade(List<Number> grades) {
        List<String> result = new ArrayList<String>();
        for (Number grade : grades) {
            if (grade.doubleValue() >= 4.0) {
                result.add("A+");
            } else if (grade.doubleValue() > 3.7) {
                result.add("A");
            } else if (grade.doubleValue() > 3.3) {
                result.add("A-");
            } else if (grade.doubleValue() > 3.0) {
                result.add("B+");
            } else if (grade.doubleValue() > 2.7) {
                result.add("B");
            } else if (grade.doubleValue() > 2.3) {
                result.add("B-");
            } else if (grade.doubleValue() > 2.0) {
                result.add("C+");
            } else if (grade.doubleValue() > 1.7) {
                result.add("C");
            } else if (grade.doubleValue() > 1.3) {
                result.add("C-");
            } else if (grade.doubleValue() > 1.0) {
                result.add("D+");
            } else if (grade.doubleValue() > 0.7) {
                result.add("D");
            } else if (grade.doubleValue() > 0.0) {
                result.add("D-");
            } else {
                result.add("E");
            }
        }
        return result;
    }

}