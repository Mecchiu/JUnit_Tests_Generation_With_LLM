package scenario2;


import java.util.List;


class Concatenate {
    /**
     * Concatenate list of strings into a single string
     */
    public static String concatenate(List<Object> strings) {
        String result = "";
        for (Object string : strings) {
            result += string.toString();
        }
        return result;
    }

}