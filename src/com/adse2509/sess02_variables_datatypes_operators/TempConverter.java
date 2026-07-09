package com.adse2509.sess02_variables_datatypes_operators;

/**
 * Java program that accepts the temparature in Degrees Celsius and converts 
 * it to Degrees Farenheit.
 * 
 * @author Administrator
 */
public class TempConverter
{

    public static void main(String[] args)
    {
        // TODO: complete the program
        // Formula °C = ( °F - 32) ÷ (9/5).
        
        double fahrenheit = 77;
        double celsius = (fahrenheit - 32) / (9 / 5);
        
        System.out.println("Celsius: " + celsius);
    }
    
}

