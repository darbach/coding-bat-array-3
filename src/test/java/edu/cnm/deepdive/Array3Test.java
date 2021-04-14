package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Array3Test {

  private static final Array3 array3 = new Array3();

  @ParameterizedTest(name = "[{index}]Asserting maxSpan({0}) = {1}")
  @MethodSource({"maxSpan"})
  void maxSpan(int[] nums, int expected) {
    assertEquals(expected, array3.maxSpan(nums));
  }

  static Stream<Arguments> maxSpan() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 1, 1, 3}, 4),
        Arguments.of(new int[]{1, 4, 2, 1, 4, 1, 4}, 6),
        Arguments.of(new int[]{1, 4, 2, 1, 4, 4, 4}, 6),
        Arguments.of(new int[]{3, 3, 3}, 3),
        Arguments.of(new int[]{3, 9, 3}, 3),
        Arguments.of(new int[]{3, 9, 9}, 2),
        Arguments.of(new int[]{3, 9}, 1),
        Arguments.of(new int[]{3, 3}, 2),
        Arguments.of(new int[]{}, 0),
        Arguments.of(new int[]{1}, 1)
    );
  }

}