package scenario1;


import java.util.List;


class Concatenate {

    public static String concatenate(List<Object> strings) {
        String result = "";
        for (Object string : strings) {
            result += string.toString();
        }
        return result;
    }

}