package algorithms;

public class MergedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        //Первый шаг - вставка второго списка в 1 (так как он на n эл-тов больше 2)
        if (m>0 && n != 0) {
            for (int i = nums1.length - m; i< nums1.length; i++) {
                nums1[i] = nums2[j];
                j++;
            }
        } else if (m == 0) {
            for (int i = 0; i< nums2.length; i++) {
                nums1[i] = nums2[i];
            }
        }


        //Второй шаг - сортировка пузырьком
        bubbleSort(nums1);
    }

    public int[] bubbleSort(int[] nums1) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i< nums1.length; i++) {
                int tmp = 0;
                if (nums1[i] < nums1[i-1]) {
                    tmp = nums1[i-1];
                    nums1[i-1] = nums1[i];
                    nums1[i] = tmp;
                    needIteration = true;
                }
            }
        }
        return nums1;
    }
}
