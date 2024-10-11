# id_22_Test.java
from scenario1.id_22 import filter_integers

import pytest

class id_22_Test:
    """
    Test class of id_22.py.
    It contains ten unit test cases for the :func:`scenario1.id_22.filter_integers`.
    """


    def test_filter_integers_1(self):
        """
        Test case for the :func:`scenario1.id_22.filter_integers`.
        """
        assert filter_integers([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_filter_integers_2(self):
        """
        Test case for the :func:`scenario1.id_22.filter_integers`.
        """
        assert filter_integers([1, 2, 3, 4, 5, 'a', 'b', 'c']) == [1, 2, 3, 4, 5]

    def test_filter_integers_3(self):
        """
        Test case for the :func:`scenario1.id_22.filter_integers`.
        """
        assert filter_integers([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f']) == [1, 2, 3, 4, 5]

    def test_filter_integers_4(self):
        """
        Test case for the :func:`scenario1.id_22.filter_integers`.
        """
        assert filter_integers([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']) == [1, 2, 3, 4, 5]

    def test_filter_integers_5(self):
        """
        Test case for the :func:`scenario1.id_22.filter_integers`.
        """
        assert filter_integers([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']) == [1, 2, 3, 4, 5]

    def test_filter_integers_6(self):
        """
        Test case for the :func:`scenario1.id_22.filter_integers`.
        """
        assert filter_integers([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']) == [1, 2, 3, 4, 5]

    def test_filter_integers_7(self):
        """
        Test case for the :func:`scenario1.id_22.filter_integers`.
        """
        assert filter_integers([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/']) == [1, 2, 3, 4, 5]

    def test_filter_integers_8(self):
        """
        Test case for the :func:`scenario1.id_22.filter_integers`.
        """
        assert filter_integers([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0']) == [1, 2, 3, 4, 5]

    def test_filter_integers_9(self):
        """
        Test case for the :func:`scenario1.id_22.filter_integers`.
        """
        assert filter_integers([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '~', '`']) == [1, 2, 3, 4, 5]

    def test_filter_integers_10(self):
        """
        Test case for the :func:`scenario1.id_22.filter_integers`.
        """
        assert filter_integers([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '~', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']) == [1, 2, 3, 4, 5]

# id_23.py
from typing import List, Any


def filter_integers_and_strings(values: List[Any]) -> List[int]:
    

    return [x for x in values if isinstance(x, int) or isinstance(x, str)]

# id_23_Test.java
from scenario1.id_23 import filter_integers_and_strings

import pytest

class id_23_Test:
    """
    Test class of id_23.py.
    It contains ten unit test cases for the :func:`scenario1.id_23.filter_integers_and_strings`.
    """
		
    def test_filter_integers_and_strings_1(self):
        """
        Test case for the :func:`scenario1.id_23.filter_integers_and_strings`.
        """
        assert filter_integers_and_strings([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_filter_integers_and_strings_2(self):
        """
        Test case for the :func:`scenario1.id_23.filter_integers_and_strings`.
        """
        assert filter_integers_and_strings([1, 2, 3, 4, 5, 'a', 'b', 'c']) == [1, 2, 3, 4, 5, 'a', 'b', 'c']

    def test_filter_integers_and_strings_3(self):
        """
        Test case for the :func:`scenario1.id_23.filter_integers_and_strings`.
        """
        assert filter_integers_and_strings([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f']) == [1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f']

    def test_filter_integers_and_strings_4(self):
        """
        Test case for the :func:`scenario1.id_23.filter_integers_and_strings`.
        """
        assert filter_integers_and_strings([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']) == [1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']

    def test_filter_integers_and_strings_5(self):
        """
        Test case for the :func:`scenario1.id_23.filter_integers_and_strings`.
        """
        assert filter_integers_and_strings([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']) == [1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

    def test_filter_integers_and_strings_6(self):
        """
        Test case for the :func:`scenario1.id_23.filter_integers_and_strings`.
        """
        assert filter_integers_and_strings([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']) == [1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']

    def test_filter_integers_and_strings_7(self):
        """
        Test case for the :func:`scenario1.id_23.filter_integers_and_strings`.
        """
        assert filter_integers_and_strings([1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/']) == [1, 2, 3, 4, 5, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.', '?',