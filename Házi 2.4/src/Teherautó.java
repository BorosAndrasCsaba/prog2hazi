import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bandi
 */
public class Teherautó extends Autó{
    private int maxSzállíthatóTeher;


    public Teherautó(int maxSzállíthatóTeher, String rendszám, int motorTeljesítmény) {
        super(rendszám, motorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Teherautó)) {
            return false;
        }
        
        Teherautó t=(Teherautó)obj;
        
        return super.equals(t) && this.maxSzállíthatóTeher==t.getMaxSzállíthatóTeher();
    }
    
    

    
    
    
    
    
}
