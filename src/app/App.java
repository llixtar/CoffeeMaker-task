package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();

        switch (validation()) {
            case 1 -> coffeeMaker.setCoffee(new Espresso());
            case 2 -> coffeeMaker.setCoffee(new Cappuccino());
            case 3 -> coffeeMaker.setCoffee(new Latte());
        }
        coffeeMaker.makeCoffee();
    }

    private static int validation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                \nChoose a drink:
                1 - Espresso
                2 - Cappuccino
                3 - Latte
                """);

        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
        scanner.close();
        return choice;
    }
}