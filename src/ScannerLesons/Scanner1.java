package ScannerLesons;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input number");
//        int i = scanner.nextInt();
//        int i2 = scanner.nextInt();
//        System.out.println(i / i2);
//
//        System.out.println("enter a string");
//        String s = scanner.nextLine();
//        System.out.println(s);

        Scanner scanner = new Scanner("Privet moi drug\nKat ti\nPoka");

        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
    }
}
