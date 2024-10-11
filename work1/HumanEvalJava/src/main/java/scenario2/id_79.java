package scenario2;


class DecimalToBinary {
    /**
     * You will be given a number in decimal form and your task is to convert it to
     * binary format. The function should return a string, with each character representing a binary
     * number. Each character in the string will be '0' or '1'.
     *
     * There will be an extra couple of characters 'db' at the beginning and at the end of the string.
     * The extra characters are there to help with the format.
     */
    public static String decimalToBinary(int decimal) {
        String binary = "";
        if (decimal == 0) {
            return "db0db";
        }
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        return "db" + binary + "db";
    }

}