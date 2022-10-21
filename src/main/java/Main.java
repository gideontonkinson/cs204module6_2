import java.awt.*;
import java.util.Scanner;

public class Main {
    private static Calculator c = new Calculator();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to your calculator");
        while(true) {
            System.out.println("Enter a command");
            String input = sc.nextLine();
            String[] command = input.split(" ");
            int a = 0;
            int b = 0;
            if(command.length > 1) {
                a = Integer.parseInt(command[1]);
            }
            if(command.length > 2) {
                b = Integer.parseInt(command[2]);
            }
            switch (command[0]) {
                case "fibonacci":
                    System.out.println("Answer: " + c.fibonacciNumberFinder(a));
                    break;
                case "add":
                    System.out.println("Answer: " + c.add(a,b));
                    break;
                case "subtract":
                    System.out.println("Answer: " + c.subtract(a,b));
                    break;
                case "multiply":
                    break;
                case "divide":
                    if(b == 0){
                        b = 1;
                    }
                    System.out.println("Answer: " + c.divide(a,b));
                    break;
                case "binary":
                    System.out.println("Answer: " + c.intToBinaryNumber(a));
                    break;
                case "exit":
                    Runtime.getRuntime().exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
