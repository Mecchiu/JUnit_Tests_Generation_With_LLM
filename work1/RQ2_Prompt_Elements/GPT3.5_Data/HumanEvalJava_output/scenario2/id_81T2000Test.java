public class NumericalLetterGradeTest {

    @Test
    void testNumericalLetterGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(4.0);
        grades.add(3.8);
        grades.add(3.5);
        grades.add(3.2);
        grades.add(2.9);
        grades.add(2.6);
        grades.add(2.3);
        grades.add(2.1);
        grades.add(1.8);
        grades.add(1.5);
        grades.add(1.2);
        grades.add(0.9);
        grades.add(0.6);
        grades.add(0.3);
        grades.add(0.0);

        List<String> expected = new ArrayList<>();
        expected.add("A+");
        expected.add("A");
        expected.add("A-");
        expected.add("B+");
        expected.add("B");
        expected.add("B-");
        expected.add("C+");
        expected.add("C");
        expected.add("C-");
        expected.add("D+");
        expected.add("D");
        expected.add("D-");
        expected.add("D-");
        expected.add("E");
        expected.add("E");

        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeEmptyList() {
        List<Number> grades = new ArrayList<>();

        List<String> expected = new ArrayList<>();

        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeSingleGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(3.5);

        List<String> expected = new ArrayList<>();
        expected.add("A-");

        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeAllGradesAPlus() {
        List<Number> grades = new ArrayList<>();
        grades.add(4.0);
        grades.add(4.0);
        grades.add(4.0);

        List<String> expected = new ArrayList<>();
        expected.add("A+");
        expected.add("A+");
        expected.add("A+");

        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeAllGradesE() {
        List<Number> grades = new ArrayList<>();
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);

        List<String> expected = new ArrayList<>();
        expected.add("E");
        expected.add("E");
        expected.add("E");

        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeMixedGrades() {
        List<Number> grades = new ArrayList<>();
        grades.add(3.5);
        grades.add(2.0);
        grades.add(1.0);
        grades.add(0.0);

        List<String> expected = new ArrayList<>();
        expected.add("A-");
        expected.add("C+");
        expected.add("D+");
        expected.add("E");

        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);

        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeNegativeGrades() {
        List<Number> grades = new ArrayList<>();
        grades.add(-1.0);
        grades.add(-2.0);
        grades.add(-3.0);

        assertThrows(IllegalArgumentException.class, () -> {
            NumericalLetterGrade.numericalLetterGrade(grades);
        });
    }

    @Test
    void testNumericalLetterGradeNullList() {
        assertThrows(NullPointerException.class, () -> {
            NumericalLetterGrade.numericalLetterGrade(null);
        });
    }

    @Test
    void testNumericalLetterGradeNullGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(3.5);
        grades.add(null);
        grades.add(2.0);

        assertThrows(NullPointerException.class, () -> {
            NumericalLetterGrade.numericalLetterGrade(grades);
        });
    }
}