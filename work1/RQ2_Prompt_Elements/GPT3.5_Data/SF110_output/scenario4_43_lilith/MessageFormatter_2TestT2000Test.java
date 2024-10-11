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
        int start = 0;
        int end;
        while ((end = messagePattern.indexOf(DELIM_START, start)) != -1) {
            if (end > 0 && messagePattern.charAt(end - 1) == ESCAPE_CHAR) {
                if (end > 1 && messagePattern.charAt(end - 2) == ESCAPE_CHAR) {
                    // escaped escape char
                    result.append(messagePattern, start, end - 1);
                    result.append(DELIM_START);
                    start = end + 1;
                } else {
                    // escaped delim start
                    result.append(messagePattern, start, end - 1);
                    result.append(DELIM_START);
                    start = end + 1;
                }
            } else {
                // found unescaped delim start
                result.append(messagePattern, start, end);
                int placeholderEnd = messagePattern.indexOf(DELIM_STOP, end);
                if (placeholderEnd != -1) {
                    // found matching delim stop
                    String placeholder = messagePattern.substring(end + 1, placeholderEnd);
                    if (placeholder.length() > 0 && placeholder.charAt(0) == ESCAPE_CHAR) {
                        // escaped placeholder
                        result.append(DELIM_START);
                        result.append(placeholder);
                        result.append(DELIM_STOP);
                        start = placeholderEnd + 1;
                    } else {
                        // unescaped placeholder
                        if (argIndex < arguments.length) {
                            result.append(arguments[argIndex]);
                            argIndex++;
                        } else {
                            result.append(DELIM_START);
                            result.append(placeholder);
                            result.append(DELIM_STOP);
                        }
                        start = placeholderEnd + 1;
                    }
                } else {
                    // no matching delim stop
                    result.append(DELIM_START);
                    result.append(messagePattern, end + 1, messagePattern.length());
                    start = messagePattern.length();
                }
            }
        }
        if (start < messagePattern.length()) {
            result.append(messagePattern, start, messagePattern.length());
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
        int count = 0;
        int start = 0;
        int end;
        while ((end = messagePattern.indexOf(DELIM_START, start)) != -1) {
            if (end > 0 && messagePattern.charAt(end - 1) == ESCAPE_CHAR) {
                if (end > 1 && messagePattern.charAt(end - 2) == ESCAPE_CHAR) {
                    // escaped escape char
                    start = end + 1;
                } else {
                    // escaped delim start
                    start = end + 1;
                }
            } else {
                // found unescaped delim start
                count++;
                int placeholderEnd = messagePattern.indexOf(DELIM_STOP, end);
                if (placeholderEnd != -1) {
                    // found matching delim stop
                    start = placeholderEnd + 1;
                } else {
                    // no matching delim stop
                    start = messagePattern.length();
                }
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
        int start = 0;
        int end;
        int resultIndex = 0;
        while ((end = messagePattern.indexOf(DELIM_START, start)) != -1) {
            if (end > 0 && messagePattern.charAt(end - 1) == ESCAPE_CHAR) {
                if (end > 1 && messagePattern.charAt(end - 2) == ESCAPE_CHAR) {
                    // escaped escape char
                    result[resultIndex] = messagePattern.substring(start, end - 1) + DELIM_START;
                    resultIndex++;
                    start = end + 1;
                } else {
                    // escaped delim start
                    result[resultIndex] = messagePattern.substring(start, end - 1) + DELIM_START;
                    resultIndex++;
                    start = end + 1;
                }
            } else {
                // found unescaped delim start
                result[resultIndex] = messagePattern.substring(start, end);
                resultIndex++;
                int placeholderEnd = messagePattern.indexOf(DELIM_STOP, end);
                if (placeholderEnd != -1) {
                    // found matching delim stop
                    String placeholder = messagePattern.substring(end + 1, placeholderEnd);
                    if (placeholder.length() > 0 && placeholder.charAt(0) == ESCAPE_CHAR) {
                        // escaped placeholder
                        result[resultIndex] = DELIM_START + placeholder + DELIM_STOP;
                        resultIndex++;
                        start = placeholderEnd + 1;
                    } else {
                        // unescaped placeholder
                        if (argIndex < arguments.length) {
                            Object current = arguments[argIndex];
                            if (current instanceof Throwable && placeholder.endsWith(ERROR_SUFFIX)) {
                                // special handling for Throwable arguments
                                String prefix = placeholder.substring(0, placeholder.length() - ERROR_SUFFIX.length());
                                int separatorIndex = prefix.indexOf(ERROR_SEPARATOR);
                                if (separatorIndex != -1) {
                                    String throwableClassName = prefix.substring(0, separatorIndex);
                                    String message = prefix.substring(separatorIndex + ERROR_SEPARATOR.length());
                                    if (current.getClass().getName().equals(throwableClassName)) {
                                        result[resultIndex] = ERROR_PREFIX + throwableClassName + ERROR_SEPARATOR + message + ERROR_MSG_SEPARATOR + ((Throwable) current).getMessage() + ERROR_SUFFIX;
                                        argIndex++;
                                    } else {
                                        result[resultIndex] = ERROR_PREFIX + placeholder + ERROR_SUFFIX;
                                    }
                                } else {
                                    result[resultIndex] = ERROR_PREFIX + placeholder + ERROR_SUFFIX;
                                }
                            } else {
                                result[resultIndex] = deepToString(current);
                                argIndex++;
                            }
                        } else {
                            result[resultIndex] = DELIM_START + placeholder + DELIM_STOP;
                        }
                        resultIndex++;
                        start = placeholderEnd + 1;
