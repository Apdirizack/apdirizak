package SuAalo;

import java.util.Arrays;

public class ASSIGN {


    public static void main(String[] args) {
        int[] iskuday = {1, 2, 2, 3, 4, 4, 5};
        int[] resultArray = removeDuplicates(iskuday);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] removeDuplicates(int[] array) {
        if (array.length == 0) return array;

        Arrays.sort(array);
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[j]) {
                array[++j] = array[i];
            }
        }
        return Arrays.copyOf(array, j + 1);
    }


}
