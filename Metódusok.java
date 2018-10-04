/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bandi
 */
public class Metódusok {
    
    public static void main(String[] args) {
        
        //1
        getSorrend(2,1,3);
        //2
        getMin(-2,-3,-4);
        //3
        Sorba(1,2,3,-1);
        //4
        if(Haromszog(2,3,4))
            System.out.println("Képezhetnek háromszöget.");
        else
            System.out.println("Nem képezhetnek háromszöget.");
        //5
        System.out.println("A két megadott év között "+Evek(1800,2000)+" szökőév van.");
        //6
        Dolgozat(5);
        //7
        System.out.println("Az ismételt osztás eredménye: "+Osztás(80,20));
        //8
        if(Prim(11))
            System.out.println("A szám prím.");
        else
            System.out.println("A szám nem prím.");
        //9
        Fibonacci(9);
        //10
        System.out.println("");
        System.out.println("A megadott szám fordítva leírva: "+Fordított(123456789));
        //11
        System.out.println("A megadott szám faktoriálisa: "+Faktoriális(5));
        //12
        Között(15,95,5);
        //13
        System.out.println("");
        System.out.println("A legkisebb Fibonacci szám ami nagyobb a választott számtól: "+Fibonacci_2(9));
        Köb();
        
        
               
        
        
    }
    
    public static void getSorrend(int a, int b, int c)
    {
        int n=a;
            
        if(a>c){
            n=a;
            a=c;
            c=n;
        }
            
        if(a>b){
            n=a;
            a=b;
            b=n;
        }
            
        if(b>c){
            n=b;
            b=c;
            c=n;
        }
        
        System.out.println(a+","+b+","+c);
    }
    
    public static void getMin(double a, double b, double c)
    {
        double min=a;
        double max=0;
        
        if(min>b)
            min=b;
        if(min>c)
            min=c;

        max=min*(-1);
        
        System.out.println("A legkisebb elem: "+min);
        System.out.println("A legnagyobb abszolút elem: "+max);
    }
    
    static void Sorba(int a, int b, int c, int d)
    {
        System.out.println(a+" "+b+" "+c+" "+d);
        if(d>=0)
            System.out.println(a+" "+c+" "+b+" "+d);
        else
            System.out.println(a+" "+b+" "+d+" "+c);
    }
    
    static boolean Haromszog(int a, int b, int c)
    {
        if(a+b>c && a+c>b && b+c>a)
            return true;
        else
            return false;
    }
    
    static int Evek(int a, int b)
    {
        int min=a;
        int max=b;
        int db=0;
        
        if(min>b){
            min=b;
            max=a;
        }
        
        while(min<max){
            if(max%4==0 && max%100!=0)
                db++;
            max--;
        }
        
        return db;
    }
    
    static void Dolgozat(int a){
        
        switch(a){
            case 1:System.out.println("Elégtelen\n");
                    break;
            case 2:System.out.println("Elégséges\n");
                    break;
            case 3:System.out.println("Közepes\n");
                    break;
            case 4:System.out.println("Jó\n");
                    break;
            case 5:System.out.println("Jeles\n");
                    break;
        }
    }
        
        
    static int Osztás(int a, int b){
        int hanyados=0;
        
        while(a>=b){
            hanyados++;
            a=a-b;
        }
            
        return hanyados;
    }    
    
    static boolean Prim(int a)
    {
        int db=0;
        for(int i=1;i<=a;++i)
        {
            if(a%i==0)
                db++;
        }
        if(db==2)
            return true;
        else
            return false;
    }
        
    static void Fibonacci(int n)
    {
        int a=0;
        int b=1;
        System.out.print("Az első "+n+" Fibonacci szám: ");
        
        
        for(int i=0;i<n;i++)
        {
            System.out.print(b+" ");
            b+=a;
            a=b-a;
        }
    }
    
    static int Fordított(int n){
        int új=0;
        
        while (n!=0){
            új=új*10+n%10;
            n=n/10;
        }
        return új;
    }
        
    
    static long Faktoriális(int n){
        long fakt=1;
        
        for(int i=1;i<=n;i++)
            fakt=fakt*i;
        
        return fakt;
    }
    
    static void Között(int n, int m, int k){
        
        for(int i=n;i<=m;i++){
            if(i%k==0)
                System.out.print(i+" ");
        }
    }
    
    static int Fibonacci_2(int n){
        int a=0;
        int b=1;
        
        while(b<=n){
            b+=a;
            a=b-a;
        }
        return b;
    }
    
    static void Köb(){
        int i=0;
        
        while(i!=1000){
            int j=i;
            int uj=0;
            while(j!=0){
                uj=uj+(j%10)*(j%10)*(j%10);
                j=j/10;
            }
            if(i==uj)
                System.out.print(uj+" ");
            i++;
    }
    }
        
        
        
        
        
        
        
        
}
