# id_18_Test.java
from scenario1.id_18 import how_many_times

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`scenario1.id_18.how_many_times`.
    """


    def test_how_many_times_1(self):
        """
        Test case 1 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "a") == 1

    def test_how_many_times_2(self):
        """
        Test case 2 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "b") == 1

    def test_how_many_times_3(self):
        """
        Test case 3 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "c") == 1

    def test_how_many_times_4(self):
        """
        Test case 4 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "ab") == 1

    def test_how_many_times_5(self):
        """
        Test case 5 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "bc") == 1

    def test_how_many_times_6(self):
        """
        Test case 6 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "abc") == 1

    def test_how_many_times_7(self):
        """
        Test case 7 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "abcd") == 0

    def test_how_many_times_8(self):
        """
        Test case 8 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "") == 4

    def test_how_many_times_9(self):
        """
        Test case 9 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("", "a") == 0

    def test_how_many_times_10(self):
        """
        Test case 10 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("", "") == 1

# id_18_Test.py
from scenario1.id_18 import how_many_times

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`scenario1.id_18.how_many_times`.
    """
		
    def test_how_many_times_1(self):
        """
        Test case 1 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "a") == 1

    def test_how_many_times_2(self):
        """
        Test case 2 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "b") == 1

    def test_how_many_times_3(self):
        """
        Test case 3 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "c") == 1

    def test_how_many_times_4(self):
        """
        Test case 4 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "ab") == 1

    def test_how_many_times_5(self):
        """
        Test case 5 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "bc") == 1

    def test_how_many_times_6(self):
        """
        Test case 6 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "abc") == 1

    def test_how_many_times_7(self):
        """
        Test case 7 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "abcd") == 0

    def test_how_many_times_8(self):
        """
        Test case 8 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "") == 4

    def test_how_many_times_9(self):
        """
        Test case 9 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("", "a") == 0

    def test_how_many_times_10(self):
        """
        Test case 10 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("", "") == 1

# id_19.java

public class id_19 {
    /**
     * Returns the number of times that the substring appears in the string.
     *
     * @param string the string to search in
     * @param substring the substring to search for
     * @return the number of times that the substring appears in the string
     */
    public static int how_many_times(String string, String substring) {
        int times = 0;

        for (int i = 0; i < string.length() - substring.length() + 1; i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                times++;
            }
        }

        return times;
    }
}

# id_19.py


def how_many_times(string: str, substring: str) -> int:

    times = 0

    for i in range(len(string) - len(substring) + 1):
        if string[i:i+len(substring)] == substring:
            times += 1

    return times

# id_19_Test.java
from scenario1.id_19 import how_many_times

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains ten unit test cases for the :func:`scenario1.id_19.how_many_times`.
    """
		
    def test_how_many_times_1(self):
        """
        Test case 1 for :func:`scenario1.id_19.how_many_times`.
        """
        assert how_many_times("abc", "a") == 1

    def test_how_many_times_2(self):
        """
        Test case 2 for :func:`scenario1.id_19.how_many_times`.
        """
        assert how_many_times("abc", "b") == 1

    def test_how_many_times_3(self):
        """
        Test case 3 for :func:`scenario1.id_19.how_many_times`.
        """
        assert how_many_times("abc", "c") == 1

    def test_how_many_times_4(self):
        """
        Test case 4 for :func:`scenario1.id_19.how_many_times`.
        """
        assert how_many_times("abc", "ab") == 1

    def test_how_many_times_5(self):
        """
        Test case 5 for :func:`scenario1.id_19.how_many_times`.
        """
        assert how_many_times("abc", "bc") == 1

    def test_how_many_times_6(self):
        """
        Test case 6 for :func:`scenario1.id_19.how_many_times`.
        """
