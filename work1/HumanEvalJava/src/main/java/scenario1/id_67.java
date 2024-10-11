package scenario1;


class FruitDistribution {

    public static int fruitDistribution(String s, int n) {
        int apples = 0;
        int oranges = 0;
        int mangoes = 0;
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("apples")) {
                apples = Integer.parseInt(words[i - 1]);
            }
            if (words[i].equals("oranges")) {
                oranges = Integer.parseInt(words[i - 1]);
            }
        }
        mangoes = n - apples - oranges;
        return mangoes;
    }

}