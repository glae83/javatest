package example2;

import java.util.Arrays;
import java.util.Random;

public class Lesson2 {
    Random random;
    public static void main(String[] args) {
    byte [] arr = {1,0,1,1,0,1};
oneZiro(arr);
//        System.out.println(Arrays.toString(oneZiro(arr)));

    }
    static void oneZiro(byte [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else
            {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    String [][] str = {{"word1", "word2"},{"word3", "word4", "word5"},{"word6","word7", "word8", "word9"}};
//printWord(str);
//int [][] arr = new int [4][];//    static void printWord(String [] [] str){
//        for (int i = 0; i < str.length; i++) {
//            for (int j = 0; j < str[i].length; j++) {
//                System.out.printf("%10s ",str[i][j]);
//            }
//            System.out.println();
//        }
//    }
//    static void printWord2(int [] [] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%10s ",arr[i][j]);
//            }
//            System.out.println();
//        }
//    }
}
