package Arrays;

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {

        System.out.println(sumArray(new int[]{1,2,3,5,4,8}));
    }

    public static void SumArray() { // Сумма всех чисел

        int array[] = {1,2,5,6,8,9};

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        System.out.println(result);

    }


    public static void SumFirstAndLastNum() {
        
        int array[] = {4,5,8,5,2,9,5,2,8,56};
        
        int result = array[0] + array[array.length - 1];

        System.out.println(result);
        
    }

    public static void ClearArray() {

        int array[] = {1,5,5,6,5,4,8,6,4,6,4,8};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = 8;
        }
        System.out.println(Arrays.toString(array));

    }

    public static void FillArray() {

        int array[] = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = 5;
        }
        System.out.println(Arrays.toString(array));

    }

    public static void FillArrayAsc() {

        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

    }

    public static void FillArrayBack() {

        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - 1 - i;
        }

        System.out.println(Arrays.toString(array));

    }

    public static void sumTwoArrays() {


        int array1[] = {1,2,3,4,5,6};
        int array2[] = {4,5,5,2,4,9};

        int result[] = new int[6];

        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] + array2[i];
        }

        System.out.println(Arrays.toString(result));;

    }

    public static void manualPrint() {

        int array[] = {1,2,3,8,4,5,6,8};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }

    public static int sumArray(int array[]) {

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }





}
