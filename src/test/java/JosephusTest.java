import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JosephusTest {

    @ParameterizedTest
    @MethodSource("getJosephusArguments")
    void given_valid_input_should_return_permutation(List<Integer> expected, List<Integer> input, Integer step) {
        assertEquals(expected, Josephus.josephusPermutation(input, step));
    }


    private static Stream<Arguments> getJosephusArguments() {
        return Stream.of(
                Arguments.of(of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), new ArrayList<>(of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), 1),
                Arguments.of(of(2, 4, 6, 8, 10, 3, 7, 1, 9, 5), new ArrayList<>(of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), 2),
                Arguments.of(of("e", "s", "W", "o", "C", "d", "r", "a"), new ArrayList<>(of("C", "o", "d", "e", "W", "a", "r", "s")), 4),
                Arguments.of(of(3, 6, 2, 7, 5, 1, 4), new ArrayList<>(of(1, 2, 3, 4, 5, 6, 7)), 3),
                Arguments.of(of(), new ArrayList<>(of()), 3),
                Arguments.of(
                        of(
                                11, 22, 33, 44, 5, 17, 29, 41, 3, 16,
                                30, 43, 7, 21, 36, 50, 15, 32, 48, 14,
                                34, 1, 20, 39, 9, 28, 2, 25, 47, 24, 49,
                                27, 8, 38, 19, 6, 42, 35, 26, 23, 31,
                                40, 4, 18, 12, 13, 46, 37, 45, 10
                        ),
                        new ArrayList<>(of(
                                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                                41, 42, 43, 44, 45, 46, 47, 48, 49, 50
                        )), 11)
        );
    }
}
