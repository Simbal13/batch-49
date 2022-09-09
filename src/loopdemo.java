import java.util.Random;
import java.util.Scanner;

public class loopdemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("entre your month");
        int month= sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {System.out.println("31 days");}
        else if (month==2)
        {
            System.out.println("28 days");}
        else if(month==2||month==4||month==6||month==9||month==11)
        {
            System.out.println("30 days");}
        else {
            System.out.println("invalid input");}

        int x=100;if(x>=50&&x<=80) System.out.println("within range");
        else System.out.println("out of range");

       int a=1000;
        if(a%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");


}}}

 //   public static void main(String[] args) {
   //   int month=100;
     // switch (month){
       // case 1,3,5,7,8,10,12:{
         //   System.out.println("31 days");}
        //break;
          //case 2:{
            //  System.out.println("28 days");}
          //break;
         // case 4,6,9,11:{
            //  System.out.println("30 days");}
          //break;
          //default:{
            //  System.out.println("invalid input");}}}}


