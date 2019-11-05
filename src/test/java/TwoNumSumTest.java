import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TwoNumSumTest {

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    void basicTests(int[] numbers, int[] expected) {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] actual = TwoNumSum.twoSum(numbers, target);

        assertNotNull(actual, "Result should not be null!");
        assertEquals(2, actual.length, "Result array length should be equal 2!");

        int received = numbers[actual[0]] + numbers[actual[1]];
        assertEquals(target, received);
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3},            new int[]{0, 2}),
                Arguments.of(new int[]{1234, 5678, 9012},   new int[]{1, 2}),
                Arguments.of(new int[]{2, 2, 3},            new int[]{0, 1})
        );
    }

}
