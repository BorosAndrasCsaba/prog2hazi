/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bandi
 */
public class Teszt {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("yellow",true);
        
        triangle.setSide1(1.0);
        triangle.setSide2(1.5);
        triangle.setSide3(1.0);
        
        System.out.println("The area is= "+triangle.getPerimeter());
        System.out.println("The perimeter is= "+triangle.getArea());
        if(triangle.isFilled())
            System.out.println("It is filled and the color is: "+triangle.getColor());
        else
            System.out.println("It isn't filled.");
    }
    
}
