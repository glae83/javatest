package example3;

import java.util.Random;
import java.util.Scanner;

public class Lesson33 {
    static Random random;
    static Scanner sc;
    public static void main(String[] args) {
        random = new Random();
        sc = new Scanner(System.in);
     int a = random.nextInt(10);
     int b = sc.nextInt();
     String [] str = "apple apricot grape melon".split(" ") ;
     int c = random.nextInt(str.length);


        System.out.println("");
        switch (b){
            case 1:
                chooseNumber(a);
                break;
            case 2:
                break;
            default:
                break;
        }


    }


    static void chooseNumber(int a){
        int k = 0;
    do {
        System.out.printf("Enter number (Random numder %d)",a);
        System.out.println();
        int x = sc.nextInt();
        if (x == a) {
            System.out.println("You are right");
             k = 3;
                    }
        else {
            System.out.println("Could you repeat enter number ");
            k++;
        }
    } while (k!=3);

    }

    static void chooseWord(String [] str, int c){
        String word = sc.next();

        for (int i = 0; i < str[c].length; i++) {

        }

    }
}
