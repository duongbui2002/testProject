package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap a: ");
            int a = scanner.nextInt();
            System.out.println("Nhap b: ");
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
    }
}
