package scenario1;


import java.util.List;


class BelowZero {

    public static Boolean belowZero(List<Object> operations) {
        Double balance = 0.0;
        for (Object operation : operations) {
            if (operation instanceof Double) {
                balance += (Double) operation;
            } else if (operation instanceof Integer) {
                balance += (Integer) operation;
            } else {
                throw new IllegalArgumentException("Invalid operation type");
            }
            if (balance < 0) {
                return true;
            }
        }
        return false;
    }

}