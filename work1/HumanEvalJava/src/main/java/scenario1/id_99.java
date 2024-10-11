package scenario1;


class ClosestInteger {

    public static int closestInteger(String value) {
        double d = Double.parseDouble(value);
        if (d > 0) {
            return (int) Math.floor(d + 0.5);
        } else {
            return (int) Math.ceil(d - 0.5);
        }
    }

}