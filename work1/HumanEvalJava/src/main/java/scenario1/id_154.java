package scenario1;


class CycpatternCheck {

    public static Boolean cycpatternCheck(String a, String b) {
        int l = b.length();
        String pat = b + b;
        for (int i = 0; i < a.length() - l + 1; i++) {
            for (int j = 0; j < l + 1; j++) {
                if (a.substring(i, i + l).equals(pat.substring(j, j + l))) {
                    return true;
                }
            }
        }
        return false;
    }

}