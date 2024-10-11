package scenario2;


import java.util.List;


class StrongestExtension {
    /**
     * You will be given the name of a class (a string) and a list of extensions.
     * The extensions are to be used to load additional classes to the class. The
     * strength of the extension is as follows: Let CAP be the number of the uppercase
     * letters in the extension's name, and let SM be the number of lowercase letters
     * in the extension's name, the strength is given by the fraction CAP - SM.
     * You should find the strongest extension and return a string in this
     * format: ClassName.StrongestExtensionName.
     * If there are two or more extensions with the same strength, you should
     * choose the one that comes first in the list.
     */
    public static String strongestExtension(String className, List<String> extensions) {
        int max = Integer.MIN_VALUE;
        String result = "";
        for (int i = 0; i < extensions.size(); i++) {
            int cap = 0;
            int sm = 0;
            for (int j = 0; j < extensions.get(i).length(); j++) {
                if (Character.isUpperCase(extensions.get(i).charAt(j))) {
                    cap++;
                } else if (Character.isLowerCase(extensions.get(i).charAt(j))) {
                    sm++;
                }
            }
            if (cap - sm > max) {
                max = cap - sm;
                result = className + "." + extensions.get(i);
            }
        }
        return result;
    }

}