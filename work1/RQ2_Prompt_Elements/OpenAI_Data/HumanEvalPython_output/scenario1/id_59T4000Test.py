# id_59_Test.java
from scenario1.id_59 import largest_prime_factor

import pytest

class id_59_Test:
    """
    Test class of id_59.py.
    It contains ten unit test cases for the :func:`scenario1.id_59.largest_prime_factor`.
    """


    def test_largest_prime_factor_1(self):
        """
        Test case 1 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13195) == 29

    def test_largest_prime_factor_2(self):
        """
        Test case 2 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(600851475143) == 6857

    def test_largest_prime_factor_3(self):
        """
        Test case 3 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(1) == 1

    def test_largest_prime_factor_4(self):
        """
        Test case 4 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2) == 2

    def test_largest_prime_factor_5(self):
        """
        Test case 5 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(3) == 3

    def test_largest_prime_factor_6(self):
        """
        Test case 6 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(4) == 2

    def test_largest_prime_factor_7(self):
        """
        Test case 7 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(5) == 5

    def test_largest_prime_factor_8(self):
        """
        Test case 8 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(6) == 3

    def test_largest_prime_factor_9(self):
        """
        Test case 9 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(7) == 7

    def test_largest_prime_factor_10(self):
        """
        Test case 10 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(8) == 2

# id_59_Test.py
from scenario1.id_59 import largest_prime_factor

import pytest

class id_59_Test:
    """
    Test class of id_59.py.
    It contains ten unit test cases for the :func:`scenario1.id_59.largest_prime_factor`.
    """
		
    def test_largest_prime_factor_1(self):
        """
        Test case 1 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13195) == 29

    def test_largest_prime_factor_2(self):
        """
        Test case 2 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(600851475143) == 6857

    def test_largest_prime_factor_3(self):
        """
        Test case 3 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(1) == 1

    def test_largest_prime_factor_4(self):
        """
        Test case 4 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2) == 2

    def test_largest_prime_factor_5(self):
        """
        Test case 5 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(3) == 3

    def test_largest_prime_factor_6(self):
        """
        Test case 6 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(4) == 2

    def test_largest_prime_factor_7(self):
        """
        Test case 7 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(5) == 5

    def test_largest_prime_factor_8(self):
        """
        Test case 8 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(6) == 3

    def test_largest_prime_factor_9(self):
        """
        Test case 9 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(7) == 7

    def test_largest_prime_factor_10(self):
        """
        Test case 10 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(8) == 2

# id_60.java

import java.util.ArrayList;
import java.util.List;

public class id_60 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

# id_60.py


def sum_of_primes_below_two_million():
    """
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    Find the sum of all the primes below two million.
    """
    def is_prime(k):
        if k < 2:
            return False
        for i in range(2, k - 1):
            if k % i == 0:
                return False
        return True
    sum = 0
    for j in range(2, 2000000):
        if is_prime(j):
            sum += j
    return sum

# id_60_Test.java
from scenario1.id_60 import sum_of_primes_below_two_million

import pytest

class id_60_Test:
    """
    Test class of id_60.py.
    It contains one unit test case for the :func:`scenario1.id_60.sum_of_primes_below_two_million`.
    """
		
    def test_sum_of_primes_below_two_million_1(self):
        """
        Test case 1 for :func:`scenario1.id_60.sum_of_primes_below_two_million`.
        """
        assert sum_of_primes_below_two_million() == 142913828922

# id_60_Test.py
from scenario1.id_60 import sum_of_primes_below_two_million

import pytest

class id_60_Test:
    """
    Test class of id_60.py.
    It contains one unit test case for the :func:`scenario1.id_60.sum_of_primes_below_two_million`.
    """
		
    def test_sum_of_primes_below_two_million_1(self):
        """
        Test case 1 for :func:`scenario1.id_60.sum_of_primes_below_two_million`.
        """
        assert sum_of_primes_below_two_million() == 142913828922

# id_61.java

import java.util.ArrayList;
import java.util.List;

public class id_61 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10000; i++) {
            if (isTriangle(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static boolean isTriangle(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (i * (i + 1) / 2 == n) {
                return true;
            }
        }
        return false;
    }
}

# id_61.py


def triangle_numbers():
    """
    Triangle	 	Tn=n(n+1)/2	 	1, 3, 6, 10, 15, ...
    """
    def is_triangle(k):
        if k < 1:
            return False
        for i in range(1, k):
            if i * (i + 1) / 2 == k:
                return True
        return False
    list = []
    for j in range(1, 10000):
        if is_triangle(j):
            list.append(j)
    return list

# id_61_Test.java
from scenario1.id_61 import triangle_numbers

import pytest

class id_61_Test:
    """
    Test class of id_61.py.
    It contains one unit test case for the :func:`scenario1.id_61.triangle_numbers`.
    """
		
    def test_triangle_numbers_1(self):
        """
        Test case 1 for :func:`scenario1.id_61.triangle_numbers`.
        """
        assert triangle_numbers() == [1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120, 136, 153, 171, 190, 210, 231, 253, 276, 300, 325, 351, 378, 406, 435, 465, 496, 528, 561, 595, 630, 666, 703, 741, 780, 820, 861, 903, 946, 990, 1035, 1081, 1128, 1176, 1225, 1275, 1326, 1378, 1431, 1485, 1540, 1596, 1653, 1711, 1770, 1830, 1891, 1953, 2016, 2080, 2145, 2211, 2278, 2346, 2415, 2485, 2556, 2628, 2701, 2775, 2850, 2926, 3003, 3081, 3160, 3240, 3321, 3403, 3486, 3570, 3655, 3741, 3828, 3916, 4005, 4095, 4186, 4278, 4371, 4465, 4560, 4656, 4753, 4851, 4950, 5050]

# id_61_Test.py
from scenario1.id_61 import triangle_numbers

import pytest

class id_61_Test:
    """
    Test class of id_61.py.
    It contains one unit test case for the :func:`scenario1.id_61.triangle_numbers`.
    """
		
    def test_triangle_numbers_1(self):
        """
        Test case 1 for :func:`scenario1.id_61.triangle_numbers`.
        """
        assert triangle_numbers() == [1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120, 136, 153, 171, 190, 210, 231, 253, 276, 300, 325, 351, 378, 406, 435, 465, 496, 528, 561, 595, 630, 666, 703, 741, 780, 820, 861, 903, 946, 990, 1035, 1081, 1128, 1176, 1225, 1275, 1326, 1378, 1431, 1485, 1540, 1596, 1653, 1711, 1770, 1830, 1891, 1953, 2016, 2080, 2145, 2211, 2278, 2346, 2415, 2485, 2556, 2628, 2701, 2775, 2850, 2926, 3003, 3081, 3160, 3240, 3321, 3403, 3486, 3570, 3655, 3741, 3828, 3916, 4005, 4095, 4186, 4278, 4371, 4465, 4560, 4656, 4753, 4851, 4950, 5050]

# id_62.java

import java.util.ArrayList;
import java.util.List;

public class id_62 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10000; i++) {
            if (isSquare(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static boolean isSquare(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }
}

# id_62.py


def square_numbers():
    """
    Square	 	Sn=n2	 	1, 4, 9, 16, 25, ...
    """
    def is_square(k):
        if k < 1:
            return False
        for i in range(1, k):
            if i * i == k:
                return True
        return False
    list = []
    for j in range(1, 10000):
        if is_square(j):
            list.append(j)
    return list

# id_62_Test.java
from scenario1.id_62 import square_numbers

import pytest

class id_62_Test:
    """
    Test class of id_62.py.
    It contains one unit test case for the :func:`scenario1.id_62.square_numbers`.
    """
		
    def test_square_numbers_1(self):
        """
        Test case 1 for :func:`scenario1.id_62.square_numbers`.
        """
        assert square_numbers() == [1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961, 1024, 1089, 1156, 1225, 1296, 1369, 1444, 1521, 1600, 1681, 1764, 1849, 1936, 2025, 2116, 2209, 2304, 2401, 2500, 2601, 2704, 2809, 2916, 3025, 3136, 3249, 3364, 3481, 3600, 3721, 3844, 3969, 4096, 4225, 4356, 4489, 4624, 4761, 4900, 5041, 5184, 5329, 5476, 5625, 5776, 5929, 6084, 6241, 6400, 6561, 6724, 6889, 7056, 7225, 7396, 7569, 7744, 7921, 8100, 8281, 8464, 8649, 8836, 9025, 9216, 9409, 9604, 9801]

# id_62_Test.py
from scenario1.id_62 import square_numbers

import pytest

class id_62_Test:
    """
    Test class of id_62.py.
    It contains one unit test case for the :