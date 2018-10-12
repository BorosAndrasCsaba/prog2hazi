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
        Autó[] autó = new Autó[]{
            new Autó("ABC123", 1000),
            new Autó("KZR433", 200),
            new Autó("CBA143", 115),
            new Autó("RME123", 540),
            new Autó("ABC123", 1500),
            new Teherautó(400,"ZKM400", 4000),
            new Teherautó(770,"ZLM540", 3500),
            new Teherautó(100,"TRM400", 2020),
            new Teherautó(400,"PRO400", 4040),
            new Teherautó(400,"KON400", 3456),
            
        };
        
        Teherautó[] teherautó = new Teherautó[]{
            new Teherautó(500,"MAR312", 14000),
            new Teherautó(320,"PIC444", 32000),
            new Teherautó(650,"SER493", 1200),
            new Teherautó(310,"LIB321", 23300),
            new Teherautó(230,"NYA987", 11000),
            new Teherautó(120,"ASD932", 23000),
            new Teherautó(420,"PIS313", 23000),
            new Teherautó(220,"KEN345", 24000),
            new Teherautó(550,"FSD985", 14000),
            new Teherautó(410,"KRM999", 22000),
        };
        
         maxSzállíthatóTeherCsökkenőleg(teherautó);
        System.out.println("\nA legnagyobb nyomatékú autó:"+maxMotorTeljesítmény(autó));
    }
    
    public static void maxSzállíthatóTeherCsökkenőleg(Teherautó [] teher){
        for(int i=0;i<teher.length;i++)
        {
            for(int j=i+1;j<teher.length;j++)
            {
                if(teher[i].getMaxSzállíthatóTeher() < teher[j].getMaxSzállíthatóTeher()){
                    Teherautó t=teher[i];
                    teher[i]=teher[j];
                    teher[j]=t;
                }    
            }
            System.out.println(teher[i]);
        }
    }
    
    public static Autó maxMotorTeljesítmény(Autó [] autó){
        
        int max=0;
        int ind=0;
        
        for(int i=0;i<autó.length-1;i++)
        {
            if(autó[i].getMotorTeljesítmény()>max)
            {
                max=autó[i].getMotorTeljesítmény();
                ind=i;
            }
        }
        return autó[ind];
    }
    
}
