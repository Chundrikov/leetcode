package Algorithms;

import java.util.ArrayList;

public class Palindrome {

    public ArrayList<Integer> arrayReversed = new ArrayList<Integer>();
    public ArrayList<Integer> arrayOriginal = new ArrayList<>();

    public boolean isPalindrome(int x) {
        boolean isPallindrome = true;
        if (x<0) {
            isPallindrome = false;
            return isPallindrome;
        }
        // в первом цикле разделить число на массив чисел остатком от деления - это будет реверснутая строка
        while (x > 0) {
            arrayReversed.add(x % 10);
            x /= 10;
        }
        // во втором цикле переводим реверснутую строку обратно, это будет число в виде массива
        for (int i = arrayReversed.size()-1; i >= 0; i--) {
            arrayOriginal.add(arrayReversed.get(i));
        }

        // завести константу

        //проверить на отрицательное число: оно не может быть палиндромом

        // в цикле пройтись по каждому элементу двух массивов и сравнить цифры.
        // Если хоть одно отличается - константу в false;

        for (int k = 0; k < arrayOriginal.size(); k++) {
            if (arrayOriginal.get(k) != arrayReversed.get(k)) {
                isPallindrome = false;
            } else {
                continue;
            }
        }
        return isPallindrome;
    }
}
