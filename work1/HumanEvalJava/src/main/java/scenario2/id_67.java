package scenario2;


class FruitDistribution {
    /**
     * * In this task, you will be given a string that represents a number of apples and oranges
     * that are distributed in a basket of fruit this basket contains
     * apples, oranges, and mango fruits. Given the string that represents the total number of
     * the oranges and apples and an integer that represent the total number of the fruits
     * in the basket return the number of the mango fruits in the basket.
     */
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