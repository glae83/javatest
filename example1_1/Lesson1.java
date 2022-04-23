package example1_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Lesson1 {

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
         System.out.println("1");
     }
     else
     {System.out.println("false");}

    }
    }

