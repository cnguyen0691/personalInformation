package com.company;
/*Chau Nguyen
 *April 17, 2019
  Comments */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your firstInitial: " );
        String firstInitial = keyboard.nextLine();
        System.out.print("Enter your lastName: " );
        String lastName = keyboard.nextLine();
        System.out.print("Enter your houseNumber: " );
        String houseNumber = keyboard.nextLine();
        System.out.print("Enter your streetName: " );
        String streetName = keyboard.nextLine();
        System.out.print("Enter your streetType: " );
        String streetType = keyboard.nextLine();
        System.out.print("Enter your city: " );
        String city = keyboard.nextLine();




        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

    }
}