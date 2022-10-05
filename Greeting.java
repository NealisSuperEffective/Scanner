import java.util.Scanner;

public class Greeting {
    static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println(("Hello " + name) + "!");

        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        int newAge = age + 10;
        System.out.println("You will be " + newAge + " years old in 10 years.");

        System.out.println("What is your monthly salary?");
        double monthlySalary = keyboard.nextDouble();
        System.out.println("Your annual salary is $" + monthlySalary*12);

        //clear out input stream
        keyboard.nextLine();

        System.out.println("What is your favorite color?");
        String color = keyboard.nextLine();
        System.out.println("Your favorite color is " + color);
    }
}