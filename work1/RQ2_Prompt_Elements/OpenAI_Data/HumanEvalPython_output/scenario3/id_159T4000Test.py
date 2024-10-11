# id_159_Test.java
from scenario3.id_159 import eat

import pytest

class id_159_Test:
    """
    Test class of id_159.py.
    It contains ten unit test cases for the :func:`scenario3.id_159.eat`.
    """


    def test_eat_1(self):
        """
        Test case for eat function.
        """
        assert eat(5, 6, 10) == [11, 4]
    
    def test_eat_2(self):
        """
        Test case for eat function.
        """
        assert eat(4, 8, 9) == [12, 1]
    
    def test_eat_3(self):
        """
        Test case for eat function.
        """
        assert eat(1, 10, 10) == [11, 0]
    
    def test_eat_4(self):
        """
        Test case for eat function.
        """
        assert eat(2, 11, 5) == [7, 0]
    
    def test_eat_5(self):
        """
        Test case for eat function.
        """
        assert eat(0, 0, 0) == [0, 0]
    
    def test_eat_6(self):
        """
        Test case for eat function.
        """
        assert eat(0, 1, 1) == [1, 0]
    
    def test_eat_7(self):
        """
        Test case for eat function.
        """
        assert eat(1, 0, 1) == [1, 0]
    
    def test_eat_8(self):
        """
        Test case for eat function.
        """
        assert eat(1, 1, 0) == [1, 0]
    
    def test_eat_9(self):
        """
        Test case for eat function.
        """
        assert eat(1000, 1000, 1000) == [2000, 0]
    
    def test_eat_10(self):
        """
        Test case for eat function.
        """
        assert eat(1000, 1000, 1) == [1001, 0]

# id_159_Test.py
from scenario3.id_159 import eat

import pytest

class id_159_Test:
    """
    Test class of id_159.py.
    It contains ten unit test cases for the :func:`scenario3.id_159.eat`.
    """
		
    def test_eat_1(self):
        """
        Test case for eat function.
        """
        assert eat(5, 6, 10) == [11, 4]
    
    def test_eat_2(self):
        """
        Test case for eat function.
        """
        assert eat(4, 8, 9) == [12, 1]
    
    def test_eat_3(self):
        """
        Test case for eat function.
        """
        assert eat(1, 10, 10) == [11, 0]
    
    def test_eat_4(self):
        """
        Test case for eat function.
        """
        assert eat(2, 11, 5) == [7, 0]
    
    def test_eat_5(self):
        """
        Test case for eat function.
        """
        assert eat(0, 0, 0) == [0, 0]
    
    def test_eat_6(self):
        """
        Test case for eat function.
        """
        assert eat(0, 1, 1) == [1, 0]
    
    def test_eat_7(self):
        """
        Test case for eat function.
        """
        assert eat(1, 0, 1) == [1, 0]
    
    def test_eat_8(self):
        """
        Test case for eat function.
        """
        assert eat(1, 1, 0) == [1, 0]
    
    def test_eat_9(self):
        """
        Test case for eat function.
        """
        assert eat(1000, 1000, 1000) == [2000, 0]
    
    def test_eat_10(self):
        """
        Test case for eat function.
        """
        assert eat(1000, 1000, 1) == [1001, 0]

# id_159_Test.kt
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class id_159_Test {
    @Test
    fun test_eat_1() {
        assertEquals(listOf(11, 4), eat(5, 6, 10))
    }
    
    @Test
    fun test_eat_2() {
        assertEquals(listOf(12, 1), eat(4, 8, 9))
    }
    
    @Test
    fun test_eat_3() {
        assertEquals(listOf(11, 0), eat(1, 10, 10))
    }
    
    @Test
    fun test_eat_4() {
        assertEquals(listOf(7, 0), eat(2, 11, 5))
    }
    
    @Test
    fun test_eat_5() {
        assertEquals(listOf(0, 0), eat(0, 0, 0))
    }
    
    @Test
    fun test_eat_6() {
        assertEquals(listOf(1, 0), eat(0, 1, 1))
    }
    
    @Test
    fun test_eat_7() {
        assertEquals(listOf(1, 0), eat(1, 0, 1))
    }
    
    @Test
    fun test_eat_8() {
        assertEquals(listOf(1, 0), eat(1, 1, 0))
    }
    
    @Test
    fun test_eat_9() {
        assertEquals(listOf(2000, 0), eat(1000, 1000, 1000))
    }
    
    @Test
    fun test_eat_10() {
        assertEquals(listOf(1001, 0), eat(1000, 1000, 1))
    }
}

# id_159_Test.m
#import <XCTest/XCTest.h>

@interface id_159_Test : XCTestCase

@end

@implementation id_159_Test

- (void)test_eat_1 {
    NSArray *result = eat(5, 6, 10);
    NSArray *expected = @[@11, @4];
    XCTAssertEqualObjects(result, expected);
}

- (void)test_eat_2 {
    NSArray *result = eat(4, 8, 9);
    NSArray *expected = @[@12, @1];
    XCTAssertEqualObjects(result, expected);
}

- (void)test_eat_3 {
    NSArray *result = eat(1, 10, 10);
    NSArray *expected = @[@11, @0];
    XCTAssertEqualObjects(result, expected);
}

- (void)test_eat_4 {
    NSArray *result = eat(2, 11, 5);
    NSArray *expected = @[@7, @0];
    XCTAssertEqualObjects(result, expected);
}

- (void)test_eat_5 {
    NSArray *result = eat(0, 0, 0);
    NSArray *expected = @[@0, @0];
    XCTAssertEqualObjects(result, expected);
}

- (void)test_eat_6 {
    NSArray *result = eat(0, 1, 1);
    NSArray *expected = @[@1, @0];
    XCTAssertEqualObjects(result, expected);
}

- (void)test_eat_7 {
    NSArray *result = eat(1, 0, 1);
    NSArray *expected = @[@1, @0];
    XCTAssertEqualObjects(result, expected);
}

- (void)test_eat_8 {
    NSArray *result = eat(1, 1, 0);
    NSArray *expected = @[@1, @0];
    XCTAssertEqualObjects(result, expected);
}

- (void)test_eat_9 {
    NSArray *result = eat(1000, 1000, 1000);
    NSArray *expected = @[@2000, @0];
    XCTAssertEqualObjects(result, expected);
}

- (void)test_eat_10 {
    NSArray *result = eat(1000, 1000, 1);
    NSArray *expected = @[@1001, @0];
    XCTAssertEqualObjects(result, expected);
}

@end

# id_159_Test.php
<?php

use PHPUnit\Framework\TestCase;

class id_159_Test extends TestCase
{
    public function test_eat_1()
    {
        $this->assertEquals([11, 4], eat(5, 6, 10));
    }
    
    public function test_eat_2()
    {
        $this->assertEquals([12, 1], eat(4, 8, 9));
    }
    
    public function test_eat_3()
    {
        $this->assertEquals([11, 0], eat(1, 10, 10));
    }
    
    public function test_eat_4()
    {
        $this->assertEquals([7, 0], eat(2, 11, 5));
    }
    
    public function test_eat_5()
    {
        $this->assertEquals([0, 0], eat(0, 0, 0));
    }
    
    public function test_eat_6()
    {
        $this->assertEquals([1, 0], eat(0, 1, 1));
    }
    
    public function test_eat_7()
    {
        $this->assertEquals([1, 0], eat(1, 0, 1));
    }
    
    public function test_eat_8()
    {
        $this->assertEquals([1, 0], eat(1, 1, 0));
    }
    
    public function test_eat_9()
    {
        $this->assertEquals([2000, 0], eat(1000, 1000, 1000));
    }
    
    public function test_eat_10()
    {
        $this->assertEquals([1001, 0], eat(1000, 1000, 1));
    }
}

# id_159_Test.rb
require 'minitest/autorun'
require_relative 'id_159'

class id_159_Test < Minitest::Test
  def test_eat_1
    assert_equal [11, 4], eat(5, 6, 10)
  end
  
  def test_eat_2
    assert_equal [12, 1], eat(4, 8, 9)
  end
  
  def test_eat_3
    assert_equal [11, 0], eat(1, 10, 10)
  end
  
  def test_eat_4
    assert_equal [7, 0], eat(2, 11, 5)
  end
  
  def test_eat_5
    assert_equal [0, 0], eat(0, 0, 0)
  end
  
  def test_eat_6
    assert_equal [1, 0], eat(0, 1, 1)
  end
  
  def test_eat_7
    assert_equal [1, 0], eat(1, 0, 1)
  end
  
  def test_eat_8
    assert_equal [1, 0], eat(1, 1, 0)
  end
  
  def test_eat_9
    assert_equal [2000, 0], eat(1000, 1000, 1000)
  end
  
  def test_eat_10
    assert_equal [1001, 0], eat(1000, 1000, 1)
  end
end

# id_159_Test.swift
import XCTest

class id_159_Test: XCTestCase {
    func test_eat_1() {
        XCTAssertEqual([11, 4], eat(5, 6, 10))
    }
    
    func test_eat_2() {
        XCTAssertEqual([12, 1], eat(4, 8, 9))
    }
    
    func test_eat_3() {
        XCTAssertEqual([11, 0], eat(1, 10, 10))
    }
    
    func test_eat_4() {
        XCTAssertEqual([7, 0], eat(2, 11, 5))
    }
    
    func test_eat_5() {
        XCTAssertEqual([0, 0], eat(0, 0, 0))
    }
    
    func test_eat_6() {
        XCTAssertEqual([1, 0], eat(0, 1, 1))
    }
    
    func test_eat_7() {
        XCTAssertEqual([1, 0], eat(1, 0, 1))
    }
    
    func test_eat_8() {
        XCTAssertEqual([1, 0], eat(1, 1, 0))
    }
    
    func test_eat_9() {
        XCTAssertEqual([2000, 0], eat(1000, 1000, 1000))
    }
    
    func test_eat_10() {
        XCTAssertEqual([1001, 0], eat(1000, 1000, 1))
    }
}

# id_159_Test.ts
import { eat } from './id_159';
import { assert } from 'chai';

describe('eat', () => {
    it('should return [11, 4] when number = 5, need = 6, remaining = 10', () => {
        assert.deepEqual(eat(5, 6, 10), [11, 4]);
    });
    
    it('should return [12, 1] when number = 4, need = 8, remaining = 9', () => {
        assert.deepEqual(eat(4, 8, 9), [12, 1]);
    });
    
    it('should return [11, 0] when number = 1, need = 10, remaining = 10', () => {
        assert.deepEqual(eat(1, 10, 10), [11, 0]);
    });
    
    it('should return [7, 0] when number = 2, need = 11, remaining = 5', () => {
        assert.deepEqual(eat(2, 11, 5), [7, 0]);
    });
    
    it('should return [0, 0] when number = 0, need = 0, remaining = 0', () => {
        assert.deepEqual(eat(0, 0, 0), [0, 0]);
    });
    
    it('should return [1, 0] when number = 0, need = 1, remaining = 1', () => {
        assert.deepEqual(eat(0, 1, 1), [1, 0]);
    });
    
    it('should return [1, 0] when number = 1, need = 0, remaining = 1', () => {
        assert.deepEqual(eat(1, 0, 1), [1, 0]);
    });
    
    it('should return [1, 0] when number = 1, need = 1, remaining = 0', () => {
        assert.deepEqual(eat(1, 1, 0), [1, 0]);
    });
    
    it('should return [2000, 0] when number = 1000, need = 1000, remaining = 1000', () => {
        assert.deepEqual(eat(1000, 1000, 1000), [2000, 0]);
    });
    
    it('should return [1001, 0] when number = 1000, need = 1000, remaining = 1', () => {
        assert.deepEqual(eat(1000, 1000, 1), [1001, 0]);
    });
});

# id_159_Test.vb
Imports Microsoft.VisualStudio.TestTools.UnitTesting

<TestClass()>
Public Class id_159_Test
    <TestMethod()>
    Public Sub test_eat_1()
        Assert.AreEqual({11, 4}, eat(5, 6, 10))
    End Sub
    
    <TestMethod()>
    Public Sub test_eat_2()
        Assert.AreEqual({12, 1}, eat(4, 8, 9))
    End Sub
    
    <TestMethod()>
    Public Sub test_eat_3()
        Assert.AreEqual({11, 0}, eat(1, 10, 10))
    End Sub
    
    <TestMethod()>
    Public Sub test_eat_4()
        Assert.AreEqual({7, 0}, eat(2, 11, 5))
    End Sub