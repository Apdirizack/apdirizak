package SuAalo;

import java.util.Arrays;

public class Assignment2 {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3};
            int[] array2 = {2, 3, 4};

            int[] common = findCommonElements(array1, array2);

            System.out.println("Element caadi ah " + Arrays.toString(common));
        }

        public static int[] findCommonElements(int[] array1, int[] array2) {
            Arrays.sort(array1);
            Arrays.sort(array2);

            int i = 0, j = 0, k = 0;
            int[] temp = new int[Math.min(array1.length, array2.length)];

            while (i < array1.length && j < array2.length) {
                if (array1[i] < array2[j]) {
                    i++;
                } else if (array1[i] > array2[j]) {
                    j++;
                } else {
                    temp[k++] = array1[i++];
                    j++;
                }
            }

            int[] commonElements = Arrays.copyOf(temp, k);
            return commonElements;
        }
}
