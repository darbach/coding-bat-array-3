package edu.cnm.deepdive;

import java.util.HashMap;
import java.util.Map;

public class Array3 {

  /**
   * Consider the leftmost and righmost appearances of some value in an array. We'll say that the
   * "span" is the number of elements between the two inclusive. A single value has a span of 1.
   * Returns the largest span found in the given array. (Efficiency is not a priority.)
   * <p>
   * maxSpan([1, 2, 1, 1, 3]) → 4 maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6 maxSpan([1, 4, 2, 1, 4, 4, 4])
   * → 6
   *
   * @param nums
   * @return
   */
  public int maxSpan(int[] nums) {
    int largest = 0;
    Map<Integer, Integer> firstAppearances = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int key = nums[i];
      firstAppearances.putIfAbsent(key, i);
      int span = i - firstAppearances.get(key) + 1;
      largest = Math.max(largest, span);
    }
    return largest;
  }

}

