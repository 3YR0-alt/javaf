package com.adse2509.sess04_classes_object_and_methods;

/**
 *Class will be used to demonstrate instance to perform basic arithmetic operations in addition,
 * subtraction,multiplication,division,modulus(integer), and exponentiation.
 * @author Administrator
 */
public class SimpleMath
{
    /**
     * Method to add two integers and return their sum as a long.
     * 
     * @param num1 the first integer to be used in the addition.
     * @param num2 the second integer to be used in the addition.
     * 
     * @return the sum of the two integers as a long. 
     */
    public long addNums(int num1, int num2){return num1 + num2;}
    
    /**
     * Method to subtract two integers and return their sum as a int.
     * 
     * @param num1 the first integer to be used in the subtraction.
     * @param num2 the second integer to be used in the subtraction.
     * 
     * @return the sum of the two integers as a int. 
     */
    public long subtractNums(int num1, int num2){return num1 - num2;}
    
    /**
     * Method to multiply two integers and return their product as a long.
     * 
     * @param num1 the first integer to be used in the multiplication.
     * @param num2 the second integer to be used in the multiplication.
     * 
     * @return the sum of the two integers as a long. 
     */
    public long multiplyNums(int num1, int num2){return num1 * num2;}
    
    /**
     * Method to divide two integers and return their sum as a long.
     * 
     * @param num1 the first integer to be used in the division.
     * @param num2 the second integer to be used in the division.
     * 
     * @return the quotient of the two integers as a int. 
     */
    public long divideNums(int num1, int num2){return num1 / num2;}
    {
        if(num2 == 0)
        {
            System.err.println("Sorry,attempted to divide by 'o' which will"
            + "cause errors. \nKindly use a non-zero denominator like '5'.");
        }
    }
    
    /**
     * Method to get the remainder of dividing the numbers as a int.
     * 
     * @param num1 the first integer to be used in the modulus operation.
     * @param num2 the second integer to be used in the modulus operation.
     * 
     * @return the remainder/modulus of dividing the two numbers as a int. 
     */
    public long getModulus(int num1, int num2){return num1 % num2;}
    
    /**
     * Calculates the value of the first number raised to the power of the 
     * second number as a int.
     * 
     * @param num1 the base value.
     * @param num2 the exponent to raise the base value to.
     * 
     * @return the result of {@code num1} raised to the power of {@code num2}
     * as a {@code float} 
     */
    public long getExponent(int num1, int num2){return(float)Math.powExact(num1,
            num2);}
    
    
}
