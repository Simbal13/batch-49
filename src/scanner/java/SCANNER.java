package scanner.java;


import java.io.InputStream;
import java.util.Scanner;

public class SCANNER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre your integer(1-12): ");
        int month = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 2) {
            System.out.println("28days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {


        }
    }}





