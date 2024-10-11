package scenario2;


import java.util.List;


class BelowZero {
    /**
     * You're given a list of deposit and withdrawal operations on a bank account that starts with
     * zero balance. Your task is to detect if at any point the balance of account falls below zero, and
     * at that point function should return True. Otherwise it should return False.
     */
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