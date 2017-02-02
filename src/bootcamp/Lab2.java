package bootcamp;

import java.util.Scanner;

public class Lab2 {
    //The application prompts user to input an integer between 1 and 100
    //display the associated result based on the integer added
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String = answer
        System.out.println("Hello and welcome to my GC Lab2.....");
        System.out.println("Please enter a number between 1 and 100 ");
        int userInt = scan.nextInt();

        if ((userInt % 2 == 0) && (userInt < 25)) {
            System.out.println("Your number is Even and less than 25");
        } else if ((userInt % 2 == 0) && (userInt > 25) && (userInt < 60)) {
            System.out.println("Your number is Even ");
        } else if ((userInt % 2 == 0) && (userInt > 25) && (userInt > 60)) {
            System.out.println("Your number is " + userInt + " and also Even");
        } else if ((userInt % 2 == 1) && (userInt > 25) && (userInt > 60)) {
            System.out.println("Your number is " + userInt + " and also Odd");
        } else System.out.println("Your number is Odd");

        //System.out.println("Would you like to continue?");
            //answer = scan.next();//
        System.out.println("Thank you for your participation!");
        System.out.println("Buenos Noches!!");
    }



}





















