package week1;

import java.util.Scanner;

import static input.InputUtils.*;

public class HelloInput {
    public static void main(String[] args) {

    /*

    Scanner userInputScanner = new Scanner(System.in); //set up the scanner class object to scan for input in the console
    System.out.println("I'm using the Scanner Method here: \nDo I know you? please tell me your name:"); // be sure to ask the user something, otherwise they wont know what to type in

    String name = userInputScanner.nextLine() ; // get the user input using the next line method
    System.out.println("Heya " + name + " how is it going?!");

     */

    String nameInputUtils = stringInput("I'm using the stringInput method here:\nDo I know you? What's your name:");
    System.out.println("Heya " + nameInputUtils + " how is it going?!");

    int numberOfClasses = positiveIntInput("How many classes are you taking this semester?");
    String units = "classes";
    if (numberOfClasses ==1 ){
        units = "class";
    }

    System.out.println("You are taking " + numberOfClasses + " " + units +" this semester! Nice!");
    System.out.printf("You are taking %d %s this semester! Nice!",numberOfClasses, units);
    }
}