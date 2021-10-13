/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibs;

import java.util.Scanner;

/**
 *
 * @author njulian
 */
public class Javalibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //varabiles
       String name;
       String state;
       String city;
       String favDogBreed;
       String favColor;
       String bestFreindsName;
       
       int numberOfPets;
       int numOfFreindPets;
       int familyCars;
       
       double personWeight;
       double canLift;
       double randomNumber;
       
       Scanner sc = new Scanner(System.in);
       //input questions
       System.out.println("Enter your name.");
       name = sc.nextLine();
       
       System.out.println("what state are you from?");
       state = sc.nextLine();
       
       System.out.println("what city are you from?");
       city = sc.nextLine();
       
       System.out.println("whats your favorite dog breed?");
       favDogBreed = sc.nextLine();
       
       System.out.println("what your favorite color?");
       favColor = sc.nextLine();
       
       System.out.println("whats your best freinds name?");
       bestFreindsName = sc.nextLine();
       
       System.out.println("How many pets do you have?");
       numberOfPets = sc.nextInt();
       
       System.out.println("how many pets does your freind have?");
       numOfFreindPets = sc.nextInt();
       
       System.out.println("how many cars does your family own?");
       familyCars = sc.nextInt();
       
       System.out.println("How much do you weigh?");
       personWeight = sc.nextDouble();
        
       System.out.println("how much can you lift?");
       canLift = sc.nextDouble();
       
       System.out.println("whats your favorite number?");
       randomNumber = sc.nextDouble();
        
       //story
        System.out.println("");
        
        System.out.println("One day a kid named " + name + " realized"
            + " that a town called " + city + "," + state + "."); 
        
        System.out.println("had a blizzard and all of the " + favDogBreed + 
            " were playing in" + " the snow.");
        
        System.out.println("For some reason the snow was " + favColor);
        System.out.println("and " + bestFreindsName + " was also in the snow"
            + " and was " + favColor + ".");
        
        System.out.println("There was " + (numberOfPets + numOfFreindPets) + " cars outside and "
            + (numberOfPets + numOfFreindPets)+ " of them covered in snow.");
        
        System.out.println("there are " + familyCars + " trees that are covered with snow.");
        
        System.out.println("everyone is working together to try to build " 
                + (personWeight - canLift) + " snowmen. ");
        
        System.out.println(randomNumber + " had noses made from sticks instead of carrots.");
    }
    
}