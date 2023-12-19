package algorithms.sort;

public class SelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minimumIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temprorary = array[i];
            array[i] = array[minimumIndex];
            array[minimumIndex] = temprorary;
        }
    }
}
