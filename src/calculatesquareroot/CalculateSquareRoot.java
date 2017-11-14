/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatesquareroot;

import java.util.Scanner;

/**
 *
 * @author Emad
 */
public class CalculateSquareRoot {

    public static void main(String[] args) {
        System.out.println("Enter Your Number  :  ");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        //This method finds out the square root
        findSquareRoot(x);
    }

    /*
     * to calculate root of number we use to take this formula
     *  x=0.5(x0+(s/x0) x0 will 
     */

    public static void findSquareRoot(double number) {

        boolean isPositiveNumber = true; //to check if number is positive or negative
        double xvariable; //this is for x0 in equation before

        //if the number given is a 0
        if (number == 0) {
            System.out.println("Square root of " + number + " = " + 0);
        } //If the number given is a -ve number
        else if (number < 0) {
            number = -number;
            isPositiveNumber = false;
        }

        //Proceeding to find out square root of the number
        double squareRoot = number / 2;
        do {
            xvariable = squareRoot;
            squareRoot = (xvariable + (number / xvariable)) / 2;
        } while ((xvariable - squareRoot) != 0);

        //Displays square root in the case of a positive number
        if (isPositiveNumber) {
            System.out.println("Square roots of " + number + " are ");
            System.out.println("+" + squareRoot);
            System.out.println("-" + squareRoot);
        } //Displays square root in the case of a -ve number
        else {
            System.out.println("Square roots of -" + number + " are ");
            System.out.println("+" + squareRoot + " i");
            System.out.println("-" + squareRoot + " i");
        }
    }
}
