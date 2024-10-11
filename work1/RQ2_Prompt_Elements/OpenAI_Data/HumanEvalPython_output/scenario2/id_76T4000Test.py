# id_76_Test.java
from scenario2.id_76 import is_simple_power

import pytest

class id_76_Test:
    """
    Test class of id_76.py.
    It contains ten unit test cases for the :func:`scenario2.id_76.is_simple_power`.
    """


    def test_is_simple_power_1(self):
        """
        Test case 1 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(1, 1) == True
		
    def test_is_simple_power_2(self):
        """
        Test case 2 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(2, 2) == True
		
    def test_is_simple_power_3(self):
        """
        Test case 3 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(4, 2) == True
		
    def test_is_simple_power_4(self):
        """
        Test case 4 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(8, 2) == True
		
    def test_is_simple_power_5(self):
        """
        Test case 5 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(9, 3) == True
		
    def test_is_simple_power_6(self):
        """
        Test case 6 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(27, 3) == True
		
    def test_is_simple_power_7(self):
        """
        Test case 7 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(16, 4) == True
		
    def test_is_simple_power_8(self):
        """
        Test case 8 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(32, 5) == False
		
    def test_is_simple_power_9(self):
        """
        Test case 9 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(64, 2) == True
		
    def test_is_simple_power_10(self):
        """
        Test case 10 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(81, 3) == True
		
# id_76_Test.py
from scenario2.id_76 import is_simple_power

import pytest

class id_76_Test:
    """
    Test class of id_76.py.
    It contains ten unit test cases for the :func:`scenario2.id_76.is_simple_power`.
    """
		
    def test_is_simple_power_1(self):
        """
        Test case 1 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(1, 1) == True
		
    def test_is_simple_power_2(self):
        """
        Test case 2 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(2, 2) == True
		
    def test_is_simple_power_3(self):
        """
        Test case 3 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(4, 2) == True
		
    def test_is_simple_power_4(self):
        """
        Test case 4 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(8, 2) == True
		
    def test_is_simple_power_5(self):
        """
        Test case 5 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(9, 3) == True
		
    def test_is_simple_power_6(self):
        """
        Test case 6 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(27, 3) == True
		
    def test_is_simple_power_7(self):
        """
        Test case 7 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(16, 4) == True
		
    def test_is_simple_power_8(self):
        """
        Test case 8 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(32, 5) == False
		
    def test_is_simple_power_9(self):
        """
        Test case 9 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(64, 2) == True
		
    def test_is_simple_power_10(self):
        """
        Test case 10 for :func:`scenario2.id_76.is_simple_power`.
        """
        assert is_simple_power(81, 3) == True
		
# id_77.java

public class id_77 {
    /**
     * Your task is to write a function that returns true if a number x is a simple
     * power of n and false in other cases.
     * x is a simple power of n if n**int=x
     *
     * @param x
     * @param n
     * @return
     */
    public static boolean is_simple_power(int x, int n) {
        if (n == 1) {
            return (x == 1);
        }
        int power = 1;
        while (power < x) {
            power = power * n;
        }
        return (power == x);
    }
}

# id_77.py

def is_simple_power(x, n):
    """Your task is to write a function that returns true if a number x is a simple
    power of n and false in other cases.
    x is a simple power of n if n**int=x
    
    """

    if (n == 1): 
        return (x == 1) 
    power = 1
    while (power < x): 
        power = power * n 
    return (power == x) 

# id_77_Test.java
from scenario2.id_77 import is_simple_power

import pytest

class id_77_Test:
    """
    Test class of id_77.py.
    It contains ten unit test cases for the :func:`scenario2.id_77.is_simple_power`.
    """
		
    def test_is_simple_power_1(self):
        """
        Test case 1 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(1, 1) == True
		
    def test_is_simple_power_2(self):
        """
        Test case 2 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(2, 2) == True
		
    def test_is_simple_power_3(self):
        """
        Test case 3 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(4, 2) == True
		
    def test_is_simple_power_4(self):
        """
        Test case 4 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(8, 2) == True
		
    def test_is_simple_power_5(self):
        """
        Test case 5 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(9, 3) == True
		
    def test_is_simple_power_6(self):
        """
        Test case 6 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(27, 3) == True
		
    def test_is_simple_power_7(self):
        """
        Test case 7 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(16, 4) == True
		
    def test_is_simple_power_8(self):
        """
        Test case 8 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(32, 5) == False
		
    def test_is_simple_power_9(self):
        """
        Test case 9 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(64, 2) == True
		
    def test_is_simple_power_10(self):
        """
        Test case 10 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(81, 3) == True
		
# id_77_Test.py
from scenario2.id_77 import is_simple_power

import pytest

class id_77_Test:
    """
    Test class of id_77.py.
    It contains ten unit test cases for the :func:`scenario2.id_77.is_simple_power`.
    """
		
    def test_is_simple_power_1(self):
        """
        Test case 1 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(1, 1) == True
		
    def test_is_simple_power_2(self):
        """
        Test case 2 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(2, 2) == True
		
    def test_is_simple_power_3(self):
        """
        Test case 3 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(4, 2) == True
		
    def test_is_simple_power_4(self):
        """
        Test case 4 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(8, 2) == True
		
    def test_is_simple_power_5(self):
        """
        Test case 5 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(9, 3) == True
		
    def test_is_simple_power_6(self):
        """
        Test case 6 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(27, 3) == True
		
    def test_is_simple_power_7(self):
        """
        Test case 7 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(16, 4) == True
		
    def test_is_simple_power_8(self):
        """
        Test case 8 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(32, 5) == False
		
    def test_is_simple_power_9(self):
        """
        Test case 9 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(64, 2) == True
		
    def test_is_simple_power_10(self):
        """
        Test case 10 for :func:`scenario2.id_77.is_simple_power`.
        """
        assert is_simple_power(81, 3) == True
		
# id_78.java

public class id_78 {
    /**
     * Your task is to write a function that returns true if a number x is a simple
     * power of n and false in other cases.
     * x is a simple power of n if n**int=x
     *
     * @param x
     * @param n
     * @return
     */
    public static boolean is_simple_power(int x, int n) {
        if (n == 1) {
            return (x == 1);
        }
        int power = 1;
        while (power < x) {
            power = power * n;
        }
        return (power == x);
    }
}

# id_78.py

def is_simple_power(x, n):
    """Your task is to write a function that returns true if a number x is a simple
    power of n and false in other cases.
    x is a simple power of n if n**int=x
    
    """

    if (n == 1): 
        return (x == 1) 
    power = 1
    while (power < x): 
        power = power * n 
    return (power == x) 

# id_78_Test.java
from scenario2.id_78 import is_simple_power

import pytest

class id_78_Test:
    """
    Test class of id_78.py.
    It contains ten unit test cases for the :func:`scenario2.id_78.is_simple_power`.
    """
		
    def test_is_simple_power_1(self):
        """
        Test case 1 for :func:`scenario2.id_78.is_simple_power`.
        """
        assert is_simple_power(1, 1) == True
		
    def test_is_simple_power_2(self):
        """
        Test case 2 for :func:`scenario2.id_78.is_simple_power`.
        """
        assert is_simple_power(2, 2) == True
		
    def test_is_simple_power_3(self):
        """
        Test case 3 for :func:`scenario2.id_78.is_simple_power`.
        """
        assert is_simple_power(4, 2) == True
		
    def test_is_simple_power_4(self):
        """
        Test case 4 for :func:`scenario2.id_78.is_simple_power`.
        """
        assert is_simple_power(8, 2) == True
		
    def test_is_simple_power_5(self):
        """
        Test case 5 for :func:`scenario2.id_78.is_simple_power`.
        """
        assert is_simple_power(9, 3) == True
		
    def test_is_simple_power_6(self):
        """
        Test case 6 for :func:`scenario2.id_78.is_simple_power`.
        """
        assert is_simple_power(27, 3) == True
		
    def test_is_simple_power_7(self):
        """
        Test case 7 for :func:`scenario2.id_78.is_simple_power`.
        """
        assert is_simple_power(16, 4) == True
		
    def test_is_simple_power_8(self):
        """
        Test case 8 for :func:`scenario2.id_78.is_simple_power`.
        """
        assert is_simple_power(32, 5) == False
		
    def test_is_simple_power_9(self):
        """
        Test case 9 for :func:`scenario2.id_78.is_simple_power`.
        """
        assert is_simple_power(64, 2)