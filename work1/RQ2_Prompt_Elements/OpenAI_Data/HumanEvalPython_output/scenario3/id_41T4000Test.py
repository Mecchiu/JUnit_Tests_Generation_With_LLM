# id_41_Test.java
from scenario3.id_41 import car_race_collision

import pytest

class id_41_Test:
    """
    Test class of id_41.py.
    It contains ten unit test cases for the :func:`scenario3.id_41.car_race_collision`.
    """


    def test_car_race_collision_1(self):
        """
        Test case for the :func:`scenario3.id_41.car_race_collision`.
        """
        assert car_race_collision(0) == 0

    def test_car_race_collision_2(self):
        """
        Test case for the :func:`scenario3.id_41.car_race_collision`.
        """
        assert car_race_collision(1) == 0

    def test_car_race_collision_3(self):
        """
        Test case for the :func:`scenario3.id_41.car_race_collision`.
        """
        assert car_race_collision(2) == 1

    def test_car_race_collision_4(self):
        """
        Test case for the :func:`scenario3.id_41.car_race_collision`.
        """
        assert car_race_collision(3) == 3

    def test_car_race_collision_5(self):
        """
        Test case for the :func:`scenario3.id_41.car_race_collision`.
        """
        assert car_race_collision(4) == 6

    def test_car_race_collision_6(self):
        """
        Test case for the :func:`scenario3.id_41.car_race_collision`.
        """
        assert car_race_collision(5) == 10

    def test_car_race_collision_7(self):
        """
        Test case for the :func:`scenario3.id_41.car_race_collision`.
        """
        assert car_race_collision(6) == 15

    def test_car_race_collision_8(self):
        """
        Test case for the :func:`scenario3.id_41.car_race_collision`.
        """
        assert car_race_collision(7) == 21

    def test_car_race_collision_9(self):
        """
        Test case for the :func:`scenario3.id_41.car_race_collision`.
        """
        assert car_race_collision(8) == 28

    def test_car_race_collision_10(self):
        """
        Test case for the :func:`scenario3.id_41.car_race_collision`.
        """
        assert car_race_collision(9) == 36