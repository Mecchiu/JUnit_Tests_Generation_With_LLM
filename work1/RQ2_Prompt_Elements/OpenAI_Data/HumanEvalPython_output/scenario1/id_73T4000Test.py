# id_73_Test.java
from scenario1.id_73 import smallest_change

import pytest

class id_73_Test:
    """
    Test class of id_73.py.
    It contains ten unit test cases for the :func:`scenario1.id_73.smallest_change`.
    """


    def test_smallest_change_1(self):
        """
        Test case 1 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 0

    def test_smallest_change_2(self):
        """
        Test case 2 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9]) == 1

    def test_smallest_change_3(self):
        """
        Test case 3 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9]) == 2

    def test_smallest_change_4(self):
        """
        Test case 4 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9]) == 3

    def test_smallest_change_5(self):
        """
        Test case 5 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9]) == 4

    def test_smallest_change_6(self):
        """
        Test case 6 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9]) == 5

    def test_smallest_change_7(self):
        """
        Test case 7 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9]) == 6

    def test_smallest_change_8(self):
        """
        Test case 8 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9]) == 7

    def test_smallest_change_9(self):
        """
        Test case 9 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9]) == 8

    def test_smallest_change_10(self):
        """
        Test case 10 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]) == 9

# id_73_Test.py
from scenario1.id_73 import smallest_change

import pytest

class id_73_Test:
    """
    Test class of id_73.py.
    It contains ten unit test cases for the :func:`scenario1.id_73.smallest_change`.
    """
		
    def test_smallest_change_1(self):
        """
        Test case 1 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 0

    def test_smallest_change_2(self):
        """
        Test case 2 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9]) == 1

    def test_smallest_change_3(self):
        """
        Test case 3 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9]) == 2

    def test_smallest_change_4(self):
        """
        Test case 4 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9]) == 3

    def test_smallest_change_5(self):
        """
        Test case 5 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9]) == 4

    def test_smallest_change_6(self):
        """
        Test case 6 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9]) == 5

    def test_smallest_change_7(self):
        """
        Test case 7 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9]) == 6

    def test_smallest_change_8(self):
        """
        Test case 8 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9]) == 7

    def test_smallest_change_9(self):
        """
        Test case 9 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9]) == 8

    def test_smallest_change_10(self):
        """
        Test case 10 for :func:`scenario1.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]) == 9

# id_74.java

import java.util.Scanner;

public class id_74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

# id_74.py

def count_inversions(arr):

    ans = 0
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] > arr[j]:
                ans += 1
    return ans

# id_74_Test.java
from scenario1.id_74 import count_inversions

import pytest

class id_74_Test:
    """
    Test class of id_74.py.
    It contains ten unit test cases for the :func:`scenario1.id_74.count_inversions`.
    """
		
    def test_count_inversions_1(self):
        """
        Test case 1 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 0

    def test_count_inversions_2(self):
        """
        Test case 2 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9]) == 0

    def test_count_inversions_3(self):
        """
        Test case 3 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9]) == 0

    def test_count_inversions_4(self):
        """
        Test case 4 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9]) == 0

    def test_count_inversions_5(self):
        """
        Test case 5 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9]) == 0

    def test_count_inversions_6(self):
        """
        Test case 6 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9]) == 0

    def test_count_inversions_7(self):
        """
        Test case 7 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9]) == 0

    def test_count_inversions_8(self):
        """
        Test case 8 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9]) == 0

    def test_count_inversions_9(self):
        """
        Test case 9 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9]) == 0

    def test_count_inversions_10(self):
        """
        Test case 10 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]) == 0

# id_74_Test.py
from scenario1.id_74 import count_inversions

import pytest

class id_74_Test:
    """
    Test class of id_74.py.
    It contains ten unit test cases for the :func:`scenario1.id_74.count_inversions`.
    """
		
    def test_count_inversions_1(self):
        """
        Test case 1 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 0

    def test_count_inversions_2(self):
        """
        Test case 2 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9]) == 0

    def test_count_inversions_3(self):
        """
        Test case 3 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9]) == 0

    def test_count_inversions_4(self):
        """
        Test case 4 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9]) == 0

    def test_count_inversions_5(self):
        """
        Test case 5 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9]) == 0

    def test_count_inversions_6(self):
        """
        Test case 6 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9]) == 0

    def test_count_inversions_7(self):
        """
        Test case 7 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9]) == 0

    def test_count_inversions_8(self):
        """
        Test case 8 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9]) == 0

    def test_count_inversions_9(self):
        """
        Test case 9 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9]) == 0

    def test_count_inversions_10(self):
        """
        Test case 10 for :func:`scenario1.id_74.count_inversions`.
        """
        assert count_inversions([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9]) == 0

# id_75.java

import java.util.Scanner;

public class id_75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

# id_75.py

def count_inversions(arr):

    ans = 0
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] > arr[j]:
                ans += 1
    return ans

# id_75_Test.java
from scenario1.id_75 import count_inversions

import pytest

class id_75_Test:
    """
    Test class of id_75.py.