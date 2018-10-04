/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bandi
 */
public class QuadraticEquation {
    
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public double getDiscriminant()
    {
        return (this.b*this.b)-(4*this.a*this.c);
    }
    
    public double getRoot1()
    {
        if(getDiscriminant()<0)
        {
            return 0;
        }
        else
        {
            return (-b+Math.sqrt(getDiscriminant()))/2*a;
        }
    }
    
     public double getRoot2()
    {
        if(getDiscriminant()<0)
        {
            return 0;
        }
        else
        {
            return (-b-Math.sqrt(getDiscriminant()))/2*a;
        }
    }

    @Override
    public String toString() {
        if(getDiscriminant()>0)
            return "The roots of this equation are: "+getRoot1()+" and "+getRoot2();
        if(getDiscriminant()==0)
            return "The only root of this equation is: "+getRoot1();
        if(getDiscriminant()<0)
            return "This equation has no roots";
        return null;
     
    }
     
     
    
}
