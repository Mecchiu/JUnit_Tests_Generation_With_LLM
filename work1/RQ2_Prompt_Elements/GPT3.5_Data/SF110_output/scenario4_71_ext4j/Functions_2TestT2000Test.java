// Functions.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;

/**
 * This class contains various utility functions for use in JSP pages.
 */
public class Functions {

    private static final Map<Integer, String> NUMBERS_WORD = new HashMap<Integer, String>();

    private static final String UNDERSCORE = "_";

    private static final String REGEX_UNDERSCORE_ONE_OR_MORE = "_+";

    private static final String REGEX_WHITESPACE_ONE_OR_MORE = "\\s+";

    private static final String[] TO_REPLACE = { "-", ":", ",", "'", "!", "\"", "\\*", "\\(", "\\)", "~", "`" };

    private static final String BLURB_SUFFIX = "...";

    private static final String STRING_SPACE = " ";

    private static final String STRING_DOT = ".";

    private static final String STRING_COMMA = ",";

    private static final String STRING_EMPTY = "";

    private static final String STRING_HTML_CR = "<br />";

    private final static String EOL_LINUX = "\n";

    private final static String EOL_WIN32 = "\r\n";

    private final static String EOL_MAC_LEGACY = "\n\r";

    public static final String LINK_PREFIX = "webtools.link.";

    static {
    }

    /**
     * Returns the year with an offset.
     * @param pOffset the offset
     * @return the year with the offset
     */
    public static int year(int pOffset) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, pOffset);
        return cal.get(Calendar.YEAR);
    }

    /**
     * Converts a character to uppercase.
     * @param c the character to convert
     * @return the uppercase character
     */
    public static char toUpper(char c) {
        return Character.toUpperCase(c);
    }

    /**
     * Returns the character for a digit in a given radix.
     * @param pDigit the digit
     * @param pRadix the radix
     * @return the character for the digit
     */
    public static char forDigit(int pDigit, int pRadix) {
        return Character.forDigit(pDigit, pRadix);
    }

    /**
     * Returns the length of a collection.
     * @param pCollection the collection
     * @return the length of the collection
     * @throws JspTagException if the collection is null
     */
    public static int length(Object pCollection) throws JspTagException {
        if (pCollection == null) {
            throw new JspTagException("Collection is null");
        }
        if (pCollection instanceof Object[]) {
            return ((Object[]) pCollection).length;
        }
        if (pCollection instanceof Iterable<?>) {
            int count = 0;
            for (Object obj : (Iterable<?>) pCollection) {
                count++;
            }
            return count;
        }
        if (pCollection instanceof String) {
            return ((String) pCollection).length();
        }
        throw new JspTagException("Unsupported collection type: " + pCollection.getClass().getName());
    }

    /**
     * Joins an array of strings with a separator.
     * @param pStrings the array of strings
     * @param pSep the separator
     * @return the joined string
     */
    public static String join(String[] pStrings, String pSep) {
        if (pStrings == null || pStrings.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pStrings.length; i++) {
            if (i > 0) {
                sb.append(pSep);
            }
            sb.append(pStrings[i]);
        }
        return sb.toString();
    }

    /**
     * Converts a string to a search engine optimized string.
     * @param pValue the string to convert
     * @return the search engine optimized string
     */
    public static String seo(String pValue) {
        if (pValue == null) {
            return "";
        }
        String seo = pValue.toLowerCase().trim();
        seo = seo.replaceAll(REGEX_UNDERSCORE_ONE_OR_MORE, UNDERSCORE);
        seo = seo.replaceAll(REGEX_WHITESPACE_ONE_OR_MORE, UNDERSCORE);
        for (String replace : TO_REPLACE) {
            seo = seo.replaceAll(replace, STRING_EMPTY);
        }
        return seo;
    }

    /**
     * Rounds a double value to a long value.
     * @param pValue the double value
     * @return the rounded long value
     */
    public static long round(double pValue) {
        return Math.round(pValue);
    }

    /**
     * Strips HTML tags from a string.
     * @param s the string with HTML tags
     * @return the string without HTML tags
     */
    public static String stripHTML(String s) {
        return s.replaceAll("\\<.*?\\>", "");
    }

    /**
     * Returns a blurb of a string with a maximum length.
     * @param s the string
     * @param pMaxLength the maximum length of the blurb
     * @return the blurb of the string
     */
    public static String blurb(String s, int pMaxLength) {
        if (s == null) {
            return "";
        }
        if (s.length() <= pMaxLength) {
            return s;
        }
        return s.substring(0, pMaxLength - BLURB_SUFFIX.length()) + BLURB_SUFFIX;
    }

    /**
     * Returns a blurb of a string with a maximum length and HTML line breaks.
     * @param s the string
     * @param pMaxLength the maximum length of the blurb
     * @return the blurb of the string with HTML line breaks
     */
    public static String blurbHTML(String s, int pMaxLength) {
        if (s == null) {
            return "";
        }
        if (s.length() <= pMaxLength) {
            return s.replaceAll(EOL_LINUX, STRING_HTML_CR);
        }
        String blurb = s.substring(0, pMaxLength - BLURB_SUFFIX.length()) + BLURB_SUFFIX;
        return blurb.replaceAll(EOL_LINUX, STRING_HTML_CR);
    }

    /**
     * Returns the time since a given date in a human-readable format.
     * @param pFrom the date to calculate the time since
     * @return the time since the date in a human-readable format
     */
    public static String since(Date pFrom) {
        if (pFrom == null) {
            return "";
        }
        long diff = new Date().getTime() - pFrom.getTime();
        long seconds = diff / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        if (days > 0) {
            return days + " days ago";
        }
        if (hours > 0) {
            return hours + " hours ago";
        }
        if (minutes > 0) {
            return minutes + " minutes ago";
        }
        return "just now";
    }

    /**
     * Formats a double value with a given pattern.
     * @param pDouble the double value
     * @param pPattern the pattern
     * @return the formatted double value
     */
    public static String decimalFormat(double pDouble, String pPattern) {
        DecimalFormat df = new DecimalFormat(pPattern);
        return df.format(pDouble);
    }

    /**
     * Formats a date with a given pattern.
     * @param pDateTime the date
     * @param pPattern the pattern
     * @return the formatted date
     */
    public static String dateFormat(Date pDateTime, String pPattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pPattern);
        return sdf.format(pDateTime);
    }

    /**
     * Adds 's or ' at the end of a text.
     * @param pText the text
     * @return the text with 's or '
     */
    public static String addS(String pText) {
        if (pText == null) {
            return "";
        }
        if (pText.endsWith("s")) {
            return pText + "'";
        }
        return pText + "'s";
    }

    /**
     * Returns the first pMaxLength characters of a string with "...".
     * @param s the string
     * @param pMaxLength the maximum length of the blurb
     * @return the first pMaxLength characters of the string with "..."
     */
    public static String blurbChar(String s, int pMaxLength) {
        if (s == null) {
            return "";
        }
        if (s.length() <= pMaxLength) {
            return s;
        }
        return s.substring(0, pMaxLength - BLURB_SUFFIX.length()) + BLURB_SUFFIX;
    }

    /**
     * Breaks up a too big word on several lines.
     * @param s the word
     * @param pMaxLength the maximum length of a line
     * @return the word on several lines
     */
    public static String cutWordCR(String s, int pMaxLength) {
        if (s == null) {
            return "";
        }
        if (s.length() <= pMaxLength) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
