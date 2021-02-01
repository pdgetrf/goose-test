import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {

  // Example test
  // DO NOT CHANGE
  @Test
  public void zeroElement() {
    int inputs[] = {};
    int expect = -1;
    int actual = Problem1.binarySearch(inputs, 9);

    assertEquals(expect, actual);
  }

  // Example test
  // DO NOT CHANGE
  @Test
  public void oneElement() {
    int[] inputs = {9};
    int targetNotExist = 1;
    int expectNotExist = -1;
    int targetExist = 9;
    int expectExist = 0;

    int actual = Problem1.binarySearch(inputs, targetNotExist);
    assertEquals(expectNotExist, actual);

    actual = Problem1.binarySearch(inputs, targetExist);
    assertEquals(expectExist, actual);
  }

  /* add more tests here */
}
