/**
 * Created by johnson on 1/4/15.
 */
public class ProjectEulerTwo {
  public static void main(String[] args) {
    int headTerm = 2;
    int tailTerm = 1;
    int sum = 0;

    while (headTerm < 4000000) {
      if ((headTerm % 2) == 0) {
        sum += headTerm;
      }
      //System.out.printf("Head term = %9d, Tail term = %9d, Sum = %9d%n", headTerm, tailTerm, sum);
      int newHeadTerm = headTerm + tailTerm;
      tailTerm = headTerm;
      headTerm = newHeadTerm;
    }

    System.out.println(sum);
  }
}
