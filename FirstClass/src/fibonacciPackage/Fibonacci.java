package fibonacciPackage;

//import mojPierwszyPakiet.*;

public class Fibonacci {
   public int fibRekurencja(int n) {
       return n < 2 ? n : fibRekurencja(n - 1) + fibRekurencja(n - 2);
   }

    public static void main(String[] args) {
      Fibonacci fiboResult = new Fibonacci();


       System.out.println(fiboResult.fibRekurencja(40));
    }
}
