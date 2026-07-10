package com.adse2509.sess03_selection_and_iteration;

/**
 *Java program to display a star pattern using nested do...while.
 * @author Administrator
 */
public class StarPatternDoWhile
{
    public static void main(String[] args)
    {
    // Variables to be used in the program
    int row = 1, col;

    // Outer loop: control lines/rows
    do {
        col = 1;

        // Inner loop: control number of "*"s printed
        do {
            System.out.printf("* ");
            col++;
        } while (col <= row);

        System.out.println();
        row++;
    } while (row <= 5);
    }
}
