# id_3_Test.java
from scenario1.id_3 import below_zero

import pytest

class id_3_Test:
    """
    Test class of id_3.py.
    It contains ten unit test cases for the :func:`scenario1.id_3.below_zero`.
    """


    def test_below_zero_1(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5]) == False

    def test_below_zero_2(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5]) == True

    def test_below_zero_3(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6]) == True

    def test_below_zero_4(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7]) == True

    def test_below_zero_5(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8]) == True

    def test_below_zero_6(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9]) == True

    def test_below_zero_7(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10]) == True

    def test_below_zero_8(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11]) == True

    def test_below_zero_9(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12]) == True

    def test_below_zero_10(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12, -13]) == True

# id_3_Test.py
from scenario1.id_3 import below_zero

import pytest

class id_3_Test:
    """
    Test class of id_3.py.
    It contains ten unit test cases for the :func:`scenario1.id_3.below_zero`.
    """
		
    def test_below_zero_1(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5]) == False

    def test_below_zero_2(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5]) == True

    def test_below_zero_3(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6]) == True

    def test_below_zero_4(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7]) == True

    def test_below_zero_5(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8]) == True

    def test_below_zero_6(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9]) == True

    def test_below_zero_7(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10]) == True

    def test_below_zero_8(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11]) == True

    def test_below_zero_9(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12]) == True

    def test_below_zero_10(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12, -13]) == True

# id_4.java
package scenario1;

import java.util.List;

public class id_4 {
    /**
     * This function returns the sum of the elements in the list.
     *
     * @param operations List of integers.
     * @return Sum of the elements in the list.
     */
    public static int sum(List<Integer> operations) {
        int sum = 0;
        for (int op : operations) {
            sum += op;
        }
        return sum;
    }
}

# id_4.py
from typing import List


def sum(operations: List[int]) -> int:

    sum = 0

    for op in operations:
        sum += op

    return sum

# id_4_Test.java
package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class id_4_Test {
    /**
     * Test class of id_4.java.
     * It contains ten unit test cases for the :func:`scenario1.id_4.sum`.
     */

    @Test
    public void test_sum_1() {
        /**
         * Test case for the :func:`scenario1.id_4.sum`.
         */
        assertEquals(15, id_4.sum(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    public void test_sum_2() {
        /**
         * Test case for the :func:`scenario1.id_4.sum`.
         */
        assertEquals(10, id_4.sum(Arrays.asList(1, 2, 3, 4, -5)));
    }

    @Test
    public void test_sum_3() {
        /**
         * Test case for the :func:`scenario1.id_4.sum`.
