/**
 * Solves Project Euler Problem Two.
 */
public class ProjectEulerTwo {

  /**
   * Computes sum of even Fibonacci Terms less than 4 million.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfEvenFibonacciTerms(4000000);
    System.out.println(sum);
  }

  /**
   * Compute sum of even Fibonacci terms less than upperBound.
   * @param upperBound The upperBound for summation.
   * @return The sum.
   */
  public static int computeSumOfEvenFibonacciTerms(int upperBound) {
    int headTerm = 2;
    int tailTerm = 1;
    int sum = 0;

    while (headTerm < upperBound) {
      if ((headTerm % 2) == 0) {
        sum += headTerm;
      }
      //System.out.printf("Head term = %9d, Tail term = %9d, Sum = %9d%n", headTerm, tailTerm, sum);
      int newHeadTerm = headTerm + tailTerm;
      tailTerm = headTerm;
      headTerm = newHeadTerm;
    }
    return sum;
  }
}
