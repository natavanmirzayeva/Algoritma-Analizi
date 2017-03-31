/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package power;

/**
 *
 * @author BM
 */
public class Power {

    public static int carpim = 1;
    
    /**
     * @param args the command line arguments
     */
    public static int ussAl(int a,int b)
    {
         int sayac = 0;
        for (int i = 0; i < b; i++) {
            carpim = carpim * a;           
            sayac++;
            
        }
        System.out.println(sayac);
        return carpim;
        
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(ussAl(3,62));
    }
    
}
