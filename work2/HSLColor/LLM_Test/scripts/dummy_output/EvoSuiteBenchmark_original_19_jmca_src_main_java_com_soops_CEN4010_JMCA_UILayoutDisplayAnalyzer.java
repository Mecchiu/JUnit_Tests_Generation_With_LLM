package com.soops.CEN4010.JMCA;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UILayoutDisplayAnalyzerTest {

    @Test
    void testAnalyze_deposit() {
        UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
        String result = analyzer.analyze(null);
        assertTrue(result.contains("deposit"));
    }

    @Test
    void testAnalyze_withdraw() {
        UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
        String result = analyzer.analyze(null);
        assertTrue(result.contains("withdraw"));
    }

    @Test
    void testAnalyze_addCD() {
        UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
        String result = analyzer.analyze(null);
        assertTrue(result.contains("addCD"));
    }

    @Test
    void testAnalyze_formDet() {
        UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
        String result = analyzer.analyze(null);
        assertTrue(result.contains("formDet"));
    }

    @Test
    void testAnalyze_checkBookIn() {
        UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
        String result = analyzer.analyze(null);
        assertTrue(result.contains("checkBookIn"));
    }

    @Test
    void testAnalyze_readInput() {
        UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
        String result = analyzer.analyze(null);
        assertTrue(result.contains("readInput"));
    }

    @Test
    void testAnalyze_cohesionLevels() {
        UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
        String result = analyzer.analyze(null);
        assertTrue(result.contains("Functional"));
        assertTrue(result.contains("Sequential"));
        assertTrue(result.contains("Communicational"));
        assertTrue(result.contains("Iterative"));
        assertTrue(result.contains("Conditional"));
        assertTrue(result.contains("Coincidental"));
    }
}
