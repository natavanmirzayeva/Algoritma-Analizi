package fibonacci;


public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    static int Fibonacci(int a) //recursive
    {
        if(a == 0) return 0;
        else if(a == 1) return 1;
        else
        {
            return Fibonacci(a-1)+Fibonacci(a-2);
        }
    }
    
  
    
    public static int FibonacciNonRecursive(int i) //non recursive
    {
        int  fib []= new int[i*i];
        int     j, result = 0;
        if (i < 2) return i;
       
        fib[0] = 0; 
        fib[1] = 1;
        for (j = 2;j<= i;j++){
            fib[j] = fib[j-1] + fib[j-2];
            result = fib[i];
        }
        return result;
    }
    
    
    
    public static void main(String[] args) {
        int fib;
        fib = FibonacciNonRecursive(10);
        System.out.println("Fibonacci result:"+fib);
        
        
      
    }
    
}
