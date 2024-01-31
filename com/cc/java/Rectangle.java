package com.cc.java;

public class Rectangle extends Shape // rechtsklick > Quellaktion > Override 
{
    private double height;
    private double width;

    public Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    
    @Override
    public double area() 
    {
        return 0;
    }
    
}
