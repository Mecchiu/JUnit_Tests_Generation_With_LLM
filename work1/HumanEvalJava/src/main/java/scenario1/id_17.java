package scenario1;


import java.util.ArrayList;
import java.util.List;


class ParseMusic {

    public static List<Object> parseMusic(String musicString) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < musicString.length(); i++) {
            if (musicString.charAt(i) == 'o') {
                if (i < musicString.length() - 1 && musicString.charAt(i + 1) == '|') {
                    result.add(2);
                    i++;
                } else {
                    result.add(4);
                }
            } else if (musicString.charAt(i) == '.') {
                result.add(1);
                i++;
            }
        }
        return result;
    }

}