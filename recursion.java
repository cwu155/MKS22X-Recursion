public class recursion{

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative
    */

    //A lot of this code looks super unnecessary!!!

    public static double sqrt(double n, double tolerance){
      double guess = n/2;
        if (n == 0) {
          return 0;
        } else if (n == 1){
          return 1;
        } else {
          return updateGuess(guess, n, tolerance);
        }
      }

    private static double updateGuess(double guess, double n, double tolerance){
      double test = guess * guess;
      if (((Math.abs(test - n)) / n) > tolerance){
        guess = updateGuess(((n / guess + guess) / 2), n, tolerance);
      }
      return guess;
    }

    /*Recursively find the nth fibonacci number in linear time
     *fib(0) = 0; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */

    public static int fib(int n){
      if (n < 1){
        return 0;
      } else if (n == 1 || n == 2){
        return 1;
      } else {
        return currentFib(n-1, n-2);
      }
    }

    public static int currentFib(int first, int second){
      return fib(first) + fib(second);
    }


    /*As Per classwork*/
    // public static ArrayList<Integer> makeAllSums(){
    // }


  //Testing.
  public static void main(String[] args) {
    System.out.println(fib(5));
  }

}
