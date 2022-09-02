import jdk.swing.interop.SwingInterOpUtils;
import scanner.java.SCANNER;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {


        int timeOfArrival =12;
       // if time of arrival is before or =10, then allowed or sit , otherwise send back home
        if(timeOfArrival<=10)
            System.out.println("you can enter"); //simple if
        else {
            System.out.println("you cannot enter");
        }
             System.out.println("end");
        // check if a number is even or odd
        int number =16;
        if(number%2==0){
        System.out.println("number is even");}
        else {
            System.out.println("number is odd");}



        Scanner sc = new Scanner(System.in);
        System.out.println("entre your integer number(1-12):");
       int month = sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println("31 days");}
        else if(month==2){
            System.out.println("28days");}
            else if(month==4||month==6||month==9||month==11){
        }
        }






    }

