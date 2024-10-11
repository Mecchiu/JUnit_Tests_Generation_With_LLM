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
                    // escaped escape char -> keep one
                    result.append(messagePattern, start, end - 1);
                    start = end + 1;
                } else {
                    // escaped delim char -> remove escape char
                    result.append(messagePattern, start, end - 1);
                    result.append(DELIM_START);
                    start = end + 1;
                }
            } else {
                result.append(messagePattern, start, end);
                int placeholderEnd = messagePattern.indexOf(DELIM_STOP, end);
                if (placeholderEnd != -1) {
                    String placeholder = messagePattern.substring(end + 1, placeholderEnd);
                    if (placeholder.startsWith(RECURSION_PREFIX)) {
                        result.append(RECURSION_PREFIX);
                        result.append(placeholder.substring(RECURSION_PREFIX.length()));
                        result.append(RECURSION_SUFFIX);
                    } else if (placeholder.startsWith(ERROR_PREFIX)) {
                        result.append(ERROR_PREFIX);
                        result.append(placeholder.substring(ERROR_PREFIX.length()));
                        result.append(ERROR_SUFFIX);
                    } else {
                        try {
                            int index = Integer.parseInt(placeholder);
                            if (index < arguments.length) {
                                result.append(arguments[index]);
                            } else {
                                result.append(DELIM_START).append(placeholder).append(DELIM_STOP);
                            }
                        } catch (NumberFormatException nfe) {
                            result.append(DELIM_START).append(placeholder).append(DELIM_STOP);
                        }
                    }
                    start = placeholderEnd + 1;
                } else {
                    result.append(DELIM_START);
                    start = end + 1;
                }
            }
        }
        result.append(messagePattern.substring(start));
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
                    // escaped escape char -> keep one
                    start = end + 1;
                } else {
                    // escaped delim char -> remove escape char
                    start = end + 1;
                }
            } else {
                int placeholderEnd = messagePattern.indexOf(DELIM_STOP, end);
                if (placeholderEnd != -1) {
                    String placeholder = messagePattern.substring(end + 1, placeholderEnd);
                    if (!placeholder.startsWith(RECURSION_PREFIX) && !placeholder.startsWith(ERROR_PREFIX)) {
                        try {
                            Integer.parseInt(placeholder);
                            count++;
                        } catch (NumberFormatException nfe) {
                            // ignore
                        }
                    }
                    start = placeholderEnd + 1;
                } else {
                    start = end + 1;
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
        String[] result = new String[count];
        int argIndex = 0;
        int start = 0;
        int end;
        while ((end = messagePattern.indexOf(DELIM_START, start)) != -1) {
            if (end > 0 && messagePattern.charAt(end - 1) == ESCAPE_CHAR) {
                if (end > 1 && messagePattern.charAt(end - 2) == ESCAPE_CHAR) {
                    // escaped escape char -> keep one
                    start = end + 1;
                } else {
                    // escaped delim char -> remove escape char
                    start = end + 1;
                }
            } else {
                int placeholderEnd = messagePattern.indexOf(DELIM_STOP, end);
                if (placeholderEnd != -1) {
                    String placeholder = messagePattern.substring(end + 1, placeholderEnd);
                    if (!placeholder.startsWith(RECURSION_PREFIX) && !placeholder.startsWith(ERROR_PREFIX)) {
                        try {
                            int index = Integer.parseInt(placeholder);
                            if (index < arguments.length) {
                                Object current = arguments[index];
                                if (current == null) {
                                    result[argIndex] = "null";
                                } else if (current instanceof Throwable) {
                                    result[argIndex] = ERROR_PREFIX + current.getClass().getName() + ERROR_MSG_SEPARATOR + current.getMessage() + ERROR_SUFFIX;
                                } else {
                                    result[argIndex] = current.toString();
                                }
                            } else {
                                result[argIndex] = DELIM_START + placeholder + DELIM_STOP;
                            }
                        } catch (NumberFormatException nfe) {
                            result[argIndex] = DELIM_START + placeholder + DELIM_STOP;
                        }
                        argIndex++;
                    }
                    start = placeholderEnd + 1;
                } else {
                    start = end + 1;
                }
            }
        }
        if (argIndex < count) {
            // we have unused arguments
            Object last = arguments[arguments.length - 1];
            if (last instanceof Throwable) {
                return new ArgumentResult(result, (Throwable) last);
            } else {
                return new ArgumentResult(result, null);
            }
        } else {
            // we used all arguments
            return new ArgumentResult(result, null);
        }
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
     * dejaVu is used in