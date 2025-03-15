package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueOperation = "Yes";

        do {
            // Kullanıcıdan ilk sayı alınır.
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            // Geçersiz operatörün kontrolü için bir döngü ekliyoruz
            char operator;
            while (true) {
                // Kullanıcıdan operatör istenir.
                System.out.print("Enter an operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);

                // Geçerli bir operatör olup olmadığını kontrol edilir.
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break; // Geçerli bir operatör girildiğinde döngüden çıkar.
                } else {
                    System.out.println("Invalid operator! Please try again.");
                }
            }

            // Kullanıcıdan ikinci sayı alınır.
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Sonuç değişkeni
            double result = 0;

            // Operatöre seçimine göre işlem yapılır.
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Division cannot be performed!");
                        continue; // Eğer bölme işlemi yapılamazsa, döngüyü tekrar başlatır.
                    }
                    break;
            }

            // Sonucu ekrana yazdırır.
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);

            // Kullanıcıya tekrar işlem yapmak isteyip istemediği sorulur.
            System.out.print("Would you like to perform another operation? (Yes/No): ");
            continueOperation = scanner.next();

        } while (continueOperation.equalsIgnoreCase("Yes"));

        scanner.close();
    }
}
