public class Factorial {

   public static long factorial(long n) {

       //base case
       if(n == 0) {
           return 1;
       } else {
           return n * factorial(n-1);
       }
    }

    public static void main(String args[]) {

        System.out.println(factorial(20));

    }

}
