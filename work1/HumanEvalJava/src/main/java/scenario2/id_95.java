package scenario2;


import java.util.Map;


class CheckDictCase {
    /**
     * * Given a dictionary, return True if all keys are strings in lower
     * case or all keys are strings in upper case, else return False.
     * The function should return False is the given dictionary is empty.
     */
    public static Boolean checkDictCase(Object dict) {
        if (dict instanceof Map) {
            Map m = (Map) dict;
            if (m.size() == 0) {
                return false;
            }
            boolean allLower = true;
            boolean allUpper = true;
            for (Object k : m.keySet()) {
                if (k instanceof String) {
                    String s = (String) k;
                    if (!s.equals(s.toLowerCase())) {
                        allLower = false;
                    }
                    if (!s.equals(s.toUpperCase())) {
                        allUpper = false;
                    }
                } else {
                    return false;
                }
            }
            return allLower || allUpper;
        }
        return false;
    }

}