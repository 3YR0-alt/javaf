package com.adse2509.sess08_interfaces_and_nested_classes;

import src.com.adse2509.sess07_inheritance_and_polymorphism.Shape;

/**
 * The {@code Circle} class represents a 2-dimensional circle with its radius. It
 * provides methods to compute its area and perimeter.
 * 
 * @author Administrator
 */
public class Sphere extends Circle implements I3DShape
{
    
    //====================================================
    // Instance Fields
    //====================================================
    protected int radius;
    
    //====================================================
    // Constructors
    //====================================================
    
    public Circle()
    {
        this.radius = 0;
        this.name = "Circle";
    }
    
    public Circle(int radius)
    {
        this.radius = radius;
        this.name = "Circle";
    }
    
    //====================================================
    // Overridden methods
    //====================================================

    
    @Override
    public float calcSurfaceArea()
    {
        return 4 * this.calcArea(); // A = πr²
    }
    
    @Override
    public float calcVolume()
    {
        return 4/3.0f * this.calcArea() * radius; //A = 4/3 (pie)r^3
    }
    
    @Override
    public String toString()
    {
        return String.format(
            """
            %s Details
            -----------------------------------------------------------
            Radius: %d,
            Surface Area: %.2f
            Volume: %.2f
            -----------------------------------------------------------
            """, this.getName(), this.radius,
            this.calcArea(), this.calcVolume()
        );
    }
}