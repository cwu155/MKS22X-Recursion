public class recursion{

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative
    */

    //A lot of this code looks super unnecessary!!!

    public static double sqrt(double n, double tolerance){
      double guess = n/2;
        if (n < 1){
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

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    // public static int fib(int n){
    //
    // }

    /*As Per classwork*/
    // public static ArrayList<Integer> makeAllSums(){
    // }

  //Testing.
  public static void main(String[] args) {
    System.out.println(sqrt(100.0, 0.001));
    System.out.println(sqrt(9, 0.001));
    System.out.println(sqrt(1, 0.001));
  }

}
