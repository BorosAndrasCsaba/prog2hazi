/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bandi
 */
public class tesztLinearEquation {
    
    public static void main(String[] args) {
        
        LinearEquation e1=new LinearEquation(1,2,3,4,5,6);
        LinearEquation e2=new LinearEquation(4,2,4,5,1,2);
        LinearEquation e3=new LinearEquation(9,1,3,5,7,8);
        
        if(e1.isSolvable())
            System.out.println("A feladat megoldásai x="+e1.getX()+" y="+e1.getY());
        else
            System.out.println("This equation has no solutions.");
        
        if(e2.isSolvable())
            System.out.println("A feladat megoldásai x="+e2.getX()+" y="+e2.getY());
        else
            System.out.println("This equation has no solutions.");
        
        if(e3.isSolvable())
            System.out.println("A feladat megoldásai x="+e3.getX()+" y="+e3.getY());
        else
            System.out.println("This equation has no solutions.");
        
    }
    
}
