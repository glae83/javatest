package example2;

import java.util.Arrays;

public class Lesson22 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int[] arr2 = {1, 5, 8, 5, 7, 6, 9};
        matrix(arr);
        matrix2(arr2);
        int[][] arr3 = new int[5][5];
        matrix3(arr3);
        printMatrix(arr3);
        int[] arr4 = {14, 8, 6, 0, 77, 12, 22};
        int[] arr5 = {14, 8, 1, 0, 0, 22, 1};
        int[] arr6 = {14, 8, 1, 0, 0, 22, 1};
        matrixMaxMin(arr4);
        matrixAverage(arr5);
        matrixShift(arr6, 1);
    }

    static void matrix(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void matrix2(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    static void matrix3(int[][] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (i == j) {
                    arr3[i][j] = 1;
                } else arr3[i][j] = 0;
            }
        }
    }

    static void printMatrix(int[][] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%4d", arr3[i][j]);
            }
            System.out.println();
        }
    }

    static void matrixMaxMin(int[] arr4) {
        int max = arr4[0];
        int min = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] < min) {
                min = arr4[i];
            }
            if (arr4[i] > max) {
                max = arr4[i];
            }
        }
        System.out.println(max + " " + min);
    }

    static void matrixAverage(int[] arr5) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr5.length; i++) {
            sum = sum + arr5[i];
        }
        for (int i = 0; i < arr5.length; i++) {
            if (sum2 == sum - sum2) {
                System.out.println("Midl part matrix is good " + sum / 2);
                break;
            }
            sum2 = sum2 + arr5[i];
        }
    }

    static void matrixShift(int[] arr6, int n) {
        int a;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr6.length - 1; j++) {
                a = arr6[j + 1];
                arr6[j + 1] = arr6[j];
                arr6[j] = a;

            }
        }


        System.out.println(Arrays.toString(arr6));
    }
}
