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
        int [] a=new int[]{3,1,2,2,2,3,4,4,2,5,1,1,1,1};
        
        System.out.println(isConsecutiveFour(a));
    }
    
    public static boolean isConsecutiveFour(int[] values){
        if(values.length<4)
            return false;
        for(int i=0;i<values.length-3;i++){
            if(values[i]==values[i+1] && values[i]==values[i+2] && values[i]==values[i+3])
                return true;
        }
       return false;     
    }
    
}
