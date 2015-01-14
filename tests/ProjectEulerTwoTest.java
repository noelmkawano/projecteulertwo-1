import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ProjectEulerTwo class.
 */
public class ProjectEulerTwoTest {

  /**
   * Runs two simple tests of the compute sum method.
   * @throws Exception If problems occur.
   */
  @Test
  public void testComputeSumOfEvenFibonacciTerms() throws Exception {
    assertEquals("Fibonacci less than 10", 10, ProjectEulerTwo.computeSumOfEvenFibonacciTerms(10));
    assertEquals("Fibonacci less than 100", 44, ProjectEulerTwo.computeSumOfEvenFibonacciTerms(44));

  }
}