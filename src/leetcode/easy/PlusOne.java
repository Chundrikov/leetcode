package leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *  You are given a large integer represented as an integer array digits,
 *  where each digit[i] is the ith digit of the integer.
 *  The digits are ordered from most significant to least significant in left-to-right order.
 *  The large integer does not contain any leading 0's.
 *  Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int incomingValue = convertArrayToInt(digits);
        int resultValue = incomingValue + 1;
        int [] resultArray = convertIntToArray(resultValue);
        return resultArray;
    }

    /**
     * converting array to integer
     */
    private int convertArrayToInt(int[] digits) {
        // first create Queue
        Queue<Integer> queueFromArray = new LinkedList<>();

        // then move numbers from digits to queue into a loop
        for (int i = 0; i<digits.length; i++) {
            queueFromArray.add(digits[i]);
        }

        int result = 0;
        // then create a number from queue, which is FIFO structure
        while (!queueFromArray.isEmpty()) {
            int digit = queueFromArray.remove();
            int length = queueFromArray.size();
            for (int k = 0; k<length; k++) {
                digit = digit * 10;
            }
            result += digit;
        }
        return result;
    }

    private int[] convertIntToArray(int digit) {

        // we can divide a number into an array by the remainder of the division
        Stack<Integer> stackDigits = new Stack<>();
        while (digit > 0) {
            int miniDigit = digit % 10;
            digit = digit/10;
            stackDigits.push(miniDigit);
        }

        // so now we have stack, and we can go through it and carry it to array
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!stackDigits.isEmpty()) {
            arrayList.add(stackDigits.pop());
        }

        int[] result = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }

        return result;
    }
}

