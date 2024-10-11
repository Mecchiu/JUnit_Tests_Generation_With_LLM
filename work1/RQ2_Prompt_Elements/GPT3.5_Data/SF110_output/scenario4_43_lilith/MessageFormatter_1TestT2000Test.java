// MessageFormatter.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>Replacement for org.slf4j.helpers.MessageFormatter.</p>
 * <p>
 * In contrast to the mentioned class, the formatting of message pattern and arguments into the actual message
 * is split into three parts:
 * </p>
 * <ol>
 * <li>Counting of placeholders in the message pattern (cheap)</li>
 * <li>Conversion of argument array into an ArgumentResult, containing the arguments converted to String as well as
 * an optional Throwable if available (relatively cheap)</li>
 * <li>Replacement of placeholders in a message pattern with arguments given as String[]. (most expensive)</li>
 * </ol>
 * <p>
 * That way only the first two steps have to be done during event creation while the most expensive part, i.e. the
 * actual construction of the message, is only done on demand.
 * </p>
 */
public class MessageFormatter {

    private static final char DELIM_START = '{';

    private static final char DELIM_STOP = '}';

    private static final char ESCAPE_CHAR = '\\';

    public static final String RECURSION_PREFIX = "[...";

    public static final String RECURSION_SUFFIX = "...]";

    public static final String ERROR_PREFIX = "[!!!";

    public static final String ERROR_SEPARATOR = "=>";

    public static final String ERROR_MSG_SEPARATOR = ":";

    public static final String ERROR_SUFFIX = "!!!]";

    /**
     * Replace placeholders in the given messagePattern with arguments.
     *
     * @param messagePattern the message pattern containing placeholders.
     * @param arguments      the arguments to be used to replace placeholders.
     * @return the formatted message.
     */
    public static String format(String messagePattern, String[] arguments) {
        if (messagePattern == null) {
            return null;
        }
        if (arguments == null || arguments.length == 0) {
            return messagePattern;
        }
        StringBuilder result = new StringBuilder();
        int argIndex = 0;
        int curPos = 0;
        int len = messagePattern.length();
        while (curPos < len) {
            int start = messagePattern.indexOf(DELIM_START, curPos);
            if (start == -1) {
                if (curPos == 0) {
                    return messagePattern;
                }
                result.append(messagePattern.substring(curPos, len));
                return result.toString();
            }
            if (start > 0 && messagePattern.charAt(start - 1) == ESCAPE_CHAR) {
                if (start > 1 && messagePattern.charAt(start - 2) == ESCAPE_CHAR) {
                    result.append(messagePattern.substring(curPos, start - 1));
                    result.append(DELIM_START);
                    curPos = start + 1;
                } else {
                    curPos = start + 1;
                }
            } else {
                result.append(messagePattern.substring(curPos, start));
                int end = messagePattern.indexOf(DELIM_STOP, start);
                if (end == -1) {
                    result.append(messagePattern.substring(start));
                    curPos = len;
                } else {
                    start += 1;
                    String placeholder = messagePattern.substring(start, end);
                    if (placeholder.equals(RECURSION_PREFIX)) {
                        result.append(RECURSION_PREFIX);
                        curPos = end + 1;
                    } else if (placeholder.equals(ERROR_PREFIX)) {
                        result.append(ERROR_PREFIX);
                        curPos = end + 1;
                    } else {
                        int index = -1;
                        try {
                            index = Integer.parseInt(placeholder);
                        } catch (NumberFormatException nfe) {
                            // ignore
                        }
                        if (index != -1 && index < arguments.length) {
                            result.append(arguments[index]);
                        } else {
                            result.append(DELIM_START).append(placeholder).append(DELIM_STOP);
                        }
                        curPos = end + 1;
                    }
                }
            }
        }
        return result.toString();
    }

    /**
     * Counts the number of unescaped placeholders in the given messagePattern.
     *
     * @param messagePattern the message pattern to be analyzed.
     * @return the number of unescaped placeholders.
     */
    public static int countArgumentPlaceholders(String messagePattern) {
        if (messagePattern == null) {
            return 0;
        }
        int len = messagePattern.length();
        int count = 0;
        boolean isEscaped = false;
        for (int i = 0; i < len; i++) {
            char curChar = messagePattern.charAt(i);
            if (curChar == ESCAPE_CHAR) {
                isEscaped = !isEscaped;
            } else if (curChar == DELIM_START && !isEscaped) {
                count++;
                isEscaped = false;
            } else {
                isEscaped = false;
            }
        }
        return count;
    }

    /**
     * <p>This method returns a MessageFormatter.ArgumentResult which contains the arguments converted to String
     * as well as an optional Throwable.</p>
     * <p/>
     * <p>If the last argument is a Throwable and is NOT used up by a placeholder in the message pattern it is returned
     * in MessageFormatter.ArgumentResult.getThrowable() and won't be contained in the created String[].<br/>
     * If it is used up getThrowable will return null even if the last argument was a Throwable!</p>
     *
     * @param messagePattern the message pattern that to be checked for placeholders.
     * @param arguments      the argument array to be converted.
     * @return a MessageFormatter.ArgumentResult containing the converted arformatted message and optionally a Throwable.
     */
    public static ArgumentResult evaluateArguments(String messagePattern, Object[] arguments) {
        if (messagePattern == null) {
            return new ArgumentResult(null, null);
        }
        if (arguments == null || arguments.length == 0) {
            return new ArgumentResult(new String[]{messagePattern}, null);
        }
        int count = countArgumentPlaceholders(messagePattern);
        if (count == 0) {
            return new ArgumentResult(new String[]{messagePattern}, null);
        }
        String[] result = new String[count];
        int argIndex = 0;
        int curPos = 0;
        int len = messagePattern.length();
        while (curPos < len && argIndex < count) {
            int start = messagePattern.indexOf(DELIM_START, curPos);
            if (start == -1) {
                if (curPos == 0) {
                    result[argIndex] = messagePattern;
                    return new ArgumentResult(result, null);
                }
                result[argIndex] = messagePattern.substring(curPos, len);
                return new ArgumentResult(result, null);
            }
            if (start > 0 && messagePattern.charAt(start - 1) == ESCAPE_CHAR) {
                if (start > 1 && messagePattern.charAt(start - 2) == ESCAPE_CHAR) {
                    result[argIndex] = messagePattern.substring(curPos, start - 1) + DELIM_START;
                    curPos = start + 1;
                } else {
                    curPos = start + 1;
                }
            } else {
                result[argIndex] = messagePattern.substring(curPos, start);
                int end = messagePattern.indexOf(DELIM_STOP, start);
                if (end == -1) {
                    result[argIndex] = messagePattern.substring(start);
                    curPos = len;
                } else {
                    start += 1;
                    String placeholder = messagePattern.substring(start, end);
                    if (placeholder.equals(RECURSION_PREFIX)) {
                        result[argIndex] = RECURSION_PREFIX;
                        curPos = end + 1;
                    } else if (placeholder.equals(ERROR_PREFIX)) {
                        result[argIndex] = ERROR_PREFIX;
                        curPos = end + 1;
                    } else {
                        int index = -1;
                        try {
                            index = Integer.parseInt(placeholder);
                        } catch (NumberFormatException nfe) {
                            // ignore
                        }
                        if (index != -1 && index < arguments.length) {
                            result[argIndex] = String.valueOf(arguments[index]);
                        } else {
                            result[argIndex] = DELIM_START + placeholder + DELIM_STOP;
                        }
                        curPos = end + 1;
                        argIndex++;
                    }
                }
            }
        }
        Throwable throwable = null;
        if (arguments.length > count && arguments[arguments.length - 1] instanceof Throwable) {
            throwable = (Throwable) arguments[arguments.length - 1];
        }
        return new ArgumentResult(result, throwable);
    }

    public static String deepToString(Object o) {
        StringBuilder result = new StringBuilder();
        recursiveDeepToString(o, result, new HashSet<String>());
        return result.toString();
    }

    /**
     * This method performs a deep toString of the given Object.
     * Primitive arrays are converted using their respective Arrays.toString methods while
     * special handling is implemented for "container types", i.e. Object[], Map and Collection because those could
     * contain themselves.
     * <p/>
     * dejaVu is used in case of those container types to prevent an endless recursion.
     * <p/>
     * It should be noted that neither AbstractMap.toString() nor AbstractCollection.toString() implement such a behavior.
     * They only check if the container is directly contained in itself, but not if a contained