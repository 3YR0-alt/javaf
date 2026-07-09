package com.adse2509.sess02_variables_datatypes_operators;

/**
 *
 * @author Administrator
 */
public class EnumDemo
{

    public static void main(String[] args)
    {
        //Declare a string representing a game
        String game = "Serious Sam";
        
        System.out.println("=".repeat(70));
        System.out.println("JAVA ENUMERATION TYPES DEMONSTRATION");
        System.out.println("=".repeat(70));
        
        //----------------------------------------------
        //1.Game Difficulty enumeration
        //----------------------------------------------
        GameDifficulty difficulty = GameDifficulty.MEDIUM;
        
        //Display game setting
        System.out.println("\nTHe game "+ game + " is being played on " 
        + difficulty+ "setting.");
        
        //----------------------------------------------
        //2. Payment method enumaration
        //----------------------------------------------
        PaymentMethod payment = PaymentMethod.CASH;
        String customerName = "Nyanjui";
        
        //Display customer's payment method
        System.out.println("\n"+ customerName + " prefers paying via "
        + payment + ".");
        
    }
    
}
