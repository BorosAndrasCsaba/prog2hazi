/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bandi
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pont p1 = new Pont(2,3.5);
        Pont p2 = new Pont(4,2);
        Pont p3 = new Pont(7.9,3);
        Pont p4 = new Pont(1,4.4);
        
        
        
        p1.setB(p1.getB()+5);
        System.out.println(p1.getB());
        
        
        p2.setB(p2.getB()+5);
        System.out.println(p2.getB());
        
        p3.setA(p3.getA()-3.4);
        System.out.println(p3.getA());
        
        p4.setA(p4.getA()-3.4);
        System.out.println(p4.getA());
        
    }
    
}
