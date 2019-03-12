import java.util.Scanner;

public class TP1 {
    private static double tempToConvert;
    private static double tempConverted;
    private static int choiceConvert;
    private static int choiceConvertAgain = 1;
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        while(choiceConvertAgain == 1) {
            askChoice();
            askTempToConvert();
            if (choiceConvert == 1) {
                celsiusToFahrenheit();
                System.out.println(tempConverted);
            }
            else if (choiceConvert == 2) {
                fahrenheitToCelsius();
                System.out.println(tempConverted);
            }
            askConvertAgain();
        }
    }

    public static void celsiusToFahrenheit() {
        tempConverted = (9.0 / 5.0) * tempToConvert + 32.0;
    }

    public static void fahrenheitToCelsius() {
        tempConverted = (tempToConvert - 32.0) * 5.0 / 9.0;
    }

    public static void askChoice() {
        System.out.println("Type:");
        System.out.println("\t1. Convert C to F");
        System.out.println("\t2. Convert F to C");
        int userEntry = sc.nextInt();
        while (userEntry != 1 && userEntry != 2) {
            System.out.println("Incorrect choice");
            userEntry = sc.nextInt();
        }
        choiceConvert = userEntry;
        sc.nextLine();
    }

    public static void askConvertAgain() {
        System.out.println("Do you want to convert an other temp?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");
        int userEntry = sc.nextInt();
        while (userEntry != 1 & userEntry != 2) {
            System.out.println("Incorrect choice");
            userEntry = sc.nextInt();
        }
        choiceConvertAgain = userEntry;
        sc.nextLine();
    }

    public static void askTempToConvert() {
        System.out.println("Enter the temperature you want to convert: ");
        tempToConvert = sc.nextDouble();
        sc.nextLine();
    }
}
