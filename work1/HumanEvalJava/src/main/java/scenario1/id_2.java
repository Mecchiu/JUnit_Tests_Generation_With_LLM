package scenario1;


class TruncateNumber {
    public static Double truncateNumber(Double number) {
        // return number - Math.floor(number);
        return Math.round((number - Math.floor(number)) * 1000.0) / 1000.0;
    }

}