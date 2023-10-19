import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BinarySearch {

    // Первый вариант - время прохождения 6.9 секунд
    public static String run_V1(List<Map<String, String>> phonebook, String name) {

        if (phonebook.size() < 1) {
            return "Phonebook is empty!";
        }

        // определяем середину списка
        int middle = phonebook.size() / 2;

        // проверяем равно ли слово из середины списка искомому
        if (phonebook.get(middle).get("name").equals(name)) {
            return phonebook.get(middle).get("number");
        }
        // делаем массив строк из имен равный количеству элементов в списке
        String[] arrayOfNames = new String[phonebook.size()];
        // проходим по списку и добавляем элементы по порядку
        for (int i = 0; i < phonebook.size(); i++) {
            arrayOfNames[i] = phonebook.get(i).get("name");
        }

        // ищем индекс искомого слова
        int index = Arrays.binarySearch(arrayOfNames, name);
        if (index >= 0 ) {
            return phonebook.get(index).get("number");
        } else {
            return "Name not found!";
        }
    }

    // вариант с compareTo 6.8 s
     public static String run(List<Map<String, String>> phonebook, String name) {
        if (phonebook.size() < 1) {
            return "Phonebook is empty!";
        }

        // определяем середину списка
        int first = 0;
        int last = phonebook.size() - 1;

        while (first <= last) {

            var middle = (first + last) / 2;
            // проверяем на
            if (phonebook.get(middle).get("name").equals(name)) {
                return phonebook.get(middle).get("number");
            }

            // если в левой части
            if (name.compareTo(phonebook.get(middle).get("name")) < 0) {
                last = middle - 1;
                middle = last/2;
            } else {
                first = middle + 1;
                middle = last - first / 2 + 1;
            }
        }
        return "Name not found!";
    }
}