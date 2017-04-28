package matrix;


public class Matrix {

    /**
     * @param args the command line arguments
     */
  
    
   static  int firstarray[][] = {{1, 2, -2, 0}, {-3, 4, 7, 2}, {6, 0, 3, 1}};
   static int secondarray[][] = {{-1, 3}, {0, 9}, {1, -11}, {4, -5}};
   static int [][] result = new int[firstarray.length][secondarray[0].length];
 
    public static void main(String[] args) {
       
        for (int i = 0; i < firstarray.length; i++) { 
            for (int j = 0; j < secondarray[0].length; j++) { 
                for (int k = 0; k < firstarray[0].length; k++) { 
                    result[i][j] += firstarray[i][k] * secondarray[k][j];
                }
            }
        }
        System.out.println("multiplcation result:");
       int rows = result.length;
       int columns = result[0].length;
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               System.out.printf("%4d " , result[i][j]);
           }
           System.out.println();
       }
    }
    
}
