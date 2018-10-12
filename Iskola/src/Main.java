import java.util.Scanner;
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
        System.out.println("A nap: ");
        Scanner sc=new Scanner(System.in);
        String nap=sc.next();
        
        System.out.println("Az órák száma: ");
        int n=sc.nextInt();
        Ora[] óra = new Ora[n];
        for(int i=0;i<n;i++){
            System.out.println("Az óra kódja:");
            int kód=sc.nextInt();
            System.out.println("Az óra neve: ");
            String név=sc.next();
            System.out.println("Az óra kezdete");
            int kezdet=sc.nextInt();
            
            Ora o=new Ora(kód,név,kezdet);
            
            óra[i]=o;
        }
        
        Órarend orar=new Órarend(nap);
        
        for(int i=0;i<n;i++){
            System.out.println("Az"+i+". órát sikerült hozzáadni.");
            System.out.println(óra[i].toString());
            System.out.println(orar.órátHozzáad(óra[i]));
            
        }
    }
}