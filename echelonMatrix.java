/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package echelonmatrix;
//
///**
// *
// * @author BM
// */
//public class EchelonMatrix {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
//}

import java.util.Scanner;

public class EchelonMatrix {

    static int Count;
    public static  double[][] rowSwap(double[][] a)
    {
       
        if (a[0][ 0] == 0)
        {
            Count++;
            double[] primaryRow = new double[a.length];
            for (int i = 0; i < a.length; i++)
            {
                primaryRow[i] = a[0][ i];
            }
            for (int j = 0; j < a.length; j++)
            {
                int i = 1;
                for (i=1; i < a.length; i++)
                {
                    if (a[i][j] != 0)
                    {

                        for (int m = 0; m < primaryRow.length; m++)
                        {
                            a[0][ m] = a[i][m];
                            a[i][ m] = primaryRow[m];
                        }
                        break;
                    }
                }
                if (i != a.length)
                {
                    break;
                }
            }
            
           
        }
        rowOperations(a);
           for (int i =0; i <a.length; i++) {
                for (int j = 0; j <a.length; j++) {
                System.out.print(" " + a[i][j]);
                }
                System.out.println("");
                }
           
           
           return a;
        }
     private static  void rowOperations(double[][] a)
        {
            double Variable = 0;
            for (int i = 0, j = 0; i < a.length - 1; )
            {
                if (j == 0)
                {
                    while (j < a.length && a[i][ j] == 0)
                    {
                        j++;
                    }
                }
                if (j == a.length)
                {
                    i++;
                    j = 0;
                }
                else
                {

                    for (int l = i + 1; l < a.length; l++)
                    {

                        for (int m = 0; m < a.length; m++)
                        {
                            if (m == 0)
                            {
                                Variable = ((1 / a[i][ j]) * a[l][ j]);
                                if ((Variable * a[i][ j] > 0 && a[l][ j] > 0)|| (Variable * a[i][ j] < 0 && a[l][ j] < 0))
                                    Variable = Variable * (-1);

                            }

                            a[l][ m] = Math.round(Variable * a[i][ m] + a[l][ m]);
                        

                        }
                    }
                    i++;
                    j = 0;
                }
            }

        }
       
     
     public static void islem(double[][]a,double[][]b)
     {
         double x1 = 0;
         double x2 = 0;
         double x3 = 0;
         
         x3 = b[2][0]/a[2][2];
         x2 = (b[1][0]-a[1][2]*x3)/a[1][1];
         x1 =(b[0][0]-(a[0][1]*x2+a[0][2]*x3))/a[0][0];
         System.out.println(x3);
         System.out.println(x2);
         System.out.println(x1);
     }
     
 public static double[][] matrix()
 {
      Scanner input = new Scanner(System.in);     
       System.out.println("Enter the number of rows b ");     
    int cc = input.nextInt(); 
    System.out.print("Enter the number of columns b");     
     int yy = input.nextInt();     
     
     double [][]b = new double[cc][yy];
     
      System.out.println( "Enter b " + b.length + " rows and " + b[0].length + " columns: "); 
     for (int i = 0; i < b.length; i++) {
         for (int j = 0; j < b[i].length; j++) {
            b[i][j] = input.nextDouble();
         }
    }
     for (int i = 0; i < b.length; i++) {
         for (int j = 0; j < b[i].length; j++) {
             System.out.println(b[i][j]);
         }
    }
     
     return b;
 }
 

         
public static void main(String [] args){
    Scanner input = new Scanner(System.in);     
    System.out.println("Enter the number of rows ");     
    int x = input.nextInt(); 
    System.out.print("Enter the number of columns ");     
     int y = input.nextInt();     
     
     
    
     double[][]a  =  new double [x][y]; 
     
     double[][] c = new double [x][1];
     
      System.out.println( "Enter " + a.length + " rows and " + a[0].length + " columns: "); 
                for (int f = 0; f < a.length; f++)  
                    for (int g = 0; g < a[f].length; g++) 
                    a[f][g] = input.nextDouble();
                rowSwap(a);
                
            c =   matrix();
            
            System.out.println(a.length);
           
              System.out.println(a[2][2]);
               System.out.println(c[2][0]);
            islem(a,c);
   /////////3  
    
     
     
   
}}
