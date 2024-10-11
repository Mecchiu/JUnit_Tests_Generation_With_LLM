package scenario1;


import java.util.List;


class MatchParens {

    public static String matchParens(List<String> lst) {
        String s1 = lst.get(0);
        String s2 = lst.get(1);
        String s1s2 = s1 + s2;
        String s2s1 = s2 + s1;

        int count = 0;
        boolean flag = true;
        for (int i = 0; i < s1s2.length(); i++) {
            if (s1s2.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                flag = false;
            }
        }
        if (flag && count == 0) {
            return "Yes";
        }
        count = 0;
        for (int i = 0; i < s2s1.length(); i++) {
            if (s2s1.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return "No";
            }
        }
        if (count == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

}