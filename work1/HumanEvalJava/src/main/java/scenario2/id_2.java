package scenario2;


class TruncateNumber {
    /**
     * Given a positive floating point number, it can be decomposed into
     * and integer part (largest integer smaller than given number) and decimals
     * (leftover part always smaller than 1).
     */
    // write a code with solving floating point issue
    public static Double truncateNumber(Double number) {
        // return number - Math.floor(number);
        return Math.round((number - Math.floor(number)) * 1000.0) / 1000.0;
    }


}