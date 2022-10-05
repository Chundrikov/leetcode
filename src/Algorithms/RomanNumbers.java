package Algorithms;

import java.util.HashMap;
import java.util.Map;

/*
Given a roman numeral, convert it to an integer.
 */
public class RomanNumbers {


    public int romanToInt(String s) {

        // создаем словарь в виде мапы, где римскому числу соответствует обычное
        Map<String, Integer> romanDictionary = new HashMap<>();
        romanDictionary.put("I", 1);
        romanDictionary.put("V", 5);
        romanDictionary.put("X", 10);
        romanDictionary.put("L", 50);
        romanDictionary.put("C", 100);
        romanDictionary.put("D", 500);
        romanDictionary.put("M", 1000);

        //преобразуем слово в массив символов
        char[] sArray = s.toCharArray();
        int result = 0;
        //делаем цикл
        for (int i = 0; i < sArray.length; i++) {
            //сделаем условия для 4.9.40.90.400 и 900
            //и не забудем вставить проверку на IndexOutOfBound
            boolean exists = sArray.length > i + 1;
            if (exists == true) {
                if (sArray[i] == "I".charAt(0) && sArray[i + 1] == "X".charAt(0)) {
                    result += 9;
                    i++;
                } else if (sArray[i] == "I".charAt(0) && sArray[i + 1] == "V".charAt(0)) {
                    result += 4;
                    i++;
                } else if (sArray[i] == "X".charAt(0) && sArray[i + 1] == "L".charAt(0)) {
                    result += 40;
                    i++;
                } else if (sArray[i] == "X".charAt(0) && sArray[i + 1] == "C".charAt(0)) {
                    result += 90;
                    i++;
                } else if (sArray[i] == "C".charAt(0) && sArray[i + 1] == "D".charAt(0)) {
                    result += 400;
                    i++;
                } else if (sArray[i] == "C".charAt(0) && sArray[i + 1] == "M".charAt(0)) {
                    result += 900;
                    i++;
                } else {
                    int tmp = romanDictionary.get(String.valueOf(sArray[i]));
                    result += tmp;
                }
            } else {
                int tmp = romanDictionary.get(String.valueOf(sArray[i]));
                result += tmp;
            }


        }

        return result;

    }
}
