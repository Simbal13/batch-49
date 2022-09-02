import java.util.Scanner;

public class foorloop {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("guess number");
            int anINT = sc.nextInt();
            if (random == anINT)
            System.out.println("right guess");
            flag = false;


        }

            System.out.println("try again");}}

