/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stdvarfonksiyonlar;

import static java.lang.Math.sqrt;

/**
 *
 * @author BM
 */
public class StdVarOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dizi[] = {9,7,40,80,55};
        int min = dizi[0];
        int max = dizi[0];
        double ortalama = 0;
        double var = 0;
        double std = 0;
        double degisken=0;
         double expo  = 0;
          double carpim  = 0;
        
        for (int i = 0; i < dizi.length; i++) { //O(n)
            if(max<dizi[i]) max = dizi[i];
            if(min>dizi[i]) min = dizi[i];
            ortalama += dizi[i]; //ortalamayı bulurken bütün elemanları gezeceğimiz için n kadar diziyi dolaşmamız lazım
        }
        
        
        for (int i = 0; i < dizi.length; i++) {
            var = ((dizi[i] - ortalama)*(dizi[i] - ortalama))/dizi.length;
            //varyansı bulurken dizinin sonuna kadar gezeceğimiz için O(n)
        }
       
        
        degisken =  (1/sqrt(2*Math.PI*var));
        System.out.println(degisken);
        for (int i = 0; i < dizi.length; i++) {
          expo   =  Math.exp(-((dizi[i] - ortalama)*(dizi[i] - ortalama))/2*var); 
           
        }
          System.out.println(expo);
         carpim = (degisken * expo);      
        
        std =  sqrt(var);
        
        System.out.println(min);
        System.out.println(max);
        System.out.println(ortalama);
        System.out.println(var);
        System.out.println(std);
        System.out.println(carpim);
        // TODO code application logic here
    }
    
}
