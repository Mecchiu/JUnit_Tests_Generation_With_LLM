// InspirentoUtilities_0Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilities_0Test {
 
    /**
     * Unit test for {@link InspirentoUtilities#tokenize(String)}.
     * @throws Throwable throws Throwable if the tests has some problem
     */
    @Test
     void testTokenize()  throws Throwable {
           assertEquals("null", new String[]{"null", "null"});
           assertEquals("0", new String[]{"0", "0"});
           assertEquals("true", new String[]{"true", "true"});
           assertEquals("false", new String[]{"false", "false"});
           assertEquals("1", new String[]{"1", "1"});
           assertEquals("2", new String[]{"2", "2"});
           assertEquals("3", new String[]{"3", "3"});
           assertEquals("4", new String[]{"4", "4"});
           assertEquals("5", new String[]{"5", "5"});
           assertEquals("'6'", new String[]{"6", "6"});
           assertEquals("6", new String[]{"6", "6"});
           assertEquals("7", new String[]{"7", "7"});
           assertEquals("8", new String[]{"8", "8"});
           assertEquals("9", new String[]{"9", "9"});
           assertEquals("10", new String[]{"10", "10"});
           assertEquals("11", new String[]{"11", "11"});
           assertEquals("12", new String[]{"12", "12"});
           assertEquals("13", new String[]{"13", "13"});
           assertEquals("14", new String[]{"14", "14"});
           assertEquals("15", new String[]{"15", "15"});
           assertEquals("16", new String[]{"16", "16"});
           assertEquals("17", new String[]{"17", "17"});
           assertEquals("18", new String[]{"18", "18"});
           assertEquals("19", new String[]{"19", "19"});
           assertEquals("20", new String[]{"20", "20"});
           assertEquals("21", new String[]{"21", "21"});
           assertEquals("22", new String[]{"22", "22"});
           assertEquals("23", new String[]{"23", "23"});
           assertEquals("24", new String[]{"24", "24"});
           assertEquals("25", new String[]{"25", "25"});
           assertEquals("26", new String[]{"26", "26"});
           assertEquals("27", new String[]{"27", "27"});
           assertEquals("28", new String[]{"28", "28"});
           assertEquals("29", new String[]{"29", "29"});
           assertEquals("30", new String[]{"30", "30"});
           assertEquals("ZERO", new String[]{"ZERO", "ZERO"});
           assertEquals(">0", new String[]{">0", ">0"});
           assertEquals(">1", new String[]{">1", ">1"});
           assertEquals(">2", new String[]{">2", ">2"});
           assertEquals(">3", new String[]{">3", ">3"});
           assertEquals(">4", new String[]{">4", ">4"});
           assertEquals(">5", new String[]{">5", ">5"});
           assertEquals(">6", new String[]{">6", ">6"});
           assertEquals(">7", new String[]{">7", ">7"});
           assertEquals(">8", new String[]{">8", ">8"});
           assertEquals(">9", new String[]{">9", ">9"});
           assertEquals(">10", new String[]{">10", ">10"});
           assertEquals(">11", new String[]{">11", ">11"});
           assertEquals(">12", new String[]{">12", ">12"});
           assertEquals(">13", new String[]{">13", ">13"});
           assertEquals(">14", new String[]{">14", ">14"});
           assertEquals(">15", new String[]{">15", ">15"});
           assertEquals(">16", new String[]{">16", ">16"});
           assertEquals(">17", new String[]{">17", ">17"});
           assertEquals(">18", new String[]{">18", ">18"});
           assertEquals(">19", new String[]{">19", ">19"});
           assertEquals(">20", new String[]{">20", ">20"});
           assertEquals(">21", new String[]{">21", ">21"});
           assertEquals(">22", new String[]{">22", ">22"});
           assertEquals(">23", new String[]{">23", ">23"});
           assertEquals(">24", new String[]{">24", ">24"});
           assertEquals(">25", new String[]{">25", ">25"});
           assertEquals(">26", new String[]{">26", ">26"});
           assertEquals(">27", new String[]{">27", ">27"});
           assertEquals(">28", new String[]{">28", ">28"});
           assertEquals(">29", new String[]{">29", ">29"});
           assertEquals(">30", new String[]{">30", ">30"});
           assertEquals(">0", new String[]{">0", ">0"});
           assertEquals(">1", new String[]{">1", ">1"});
           assertEquals(">2", new String[]{">2", ">2"});
           assertEquals(">3", new String[]{">3", ">3"});
           assertEquals(">4", new String[]{">4", ">4"});
           assertEquals(">5", new String[]{">5", ">5"});
           assertEquals(">6", new String[]{">6", ">6"});
           assertEquals(">7", new String[]{">7", ">7"});
           assertEquals(">8", new String[]{">8", "