package example1_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;

public class Lesson1 {
    Random random;

    public static void main(String[] args) {
    float a = 80;
    float b = 6;
    float c = 12;
    float d = 10;
    System.out.println(sumM(a,b,c,d));
    int aa = 3;
    int bb = 18;
    System.out.println(trueOrFalse(aa,bb));
    int aaa = -10;
    numberPlusMinus(aaa);
    System.out.println(minusOrPlus(aaa));
    String str = "Antony";
    namePrint(str);
    int year = 2004;
        visokosnyYear(year);
    }
    public static float sumM(float a, float b, float c, float d) {
        return a*(b+(c/d));
    }
    public static boolean trueOrFalse(int aa, int bb){
        return aa+bb >=10 && aa+bb <=20;
    }
    public static void numberPlusMinus(int aaa) {
        if (aaa>0) {
            System.out.println("Plus");
        }
            else {
                System.out.println("Minus");
            }
        }
    public static boolean minusOrPlus(int aaa) {
        return aaa < 0 ;
    }
    public static void namePrint(String str){
        System.out.printf("Hi, %s", str);
        System.out.println();
    }
    public static boolean testNumderOne(int year){
        return (year%4 == 0 || year%100 == 0)&&(year % 400 != 0);
    }
    public static void visokosnyYear(int year){
     if (testNumderOne(year)) {
         System.out.println("true");
         System.out.printf("%6d",year);
         System.out.printf("%6d",year);
         System.out.println();
     }
     else
     {System.out.println("false");}
     int n = 100;
//        for (int i = 1; i < 10; i++) {
//            if (n % i == 0) {
//                System.out.println(i);
//            }
//        }
        for (int i = 0; i < 10; i++) {
            if (i>=3&&i<=5){
                break;
            }
            System.out.printf("%3d",i);
        }
    }
    }

