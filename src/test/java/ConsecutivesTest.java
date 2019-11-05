import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsecutivesTest {

    @ParameterizedTest
    @MethodSource("getSumConsecutivesParams")
    void sumConsecutives(List<Integer> expected, List<Integer> input) {
        assertEquals(expected, Consecutives.sumConsecutives(input));
        assertEquals(expected, Consecutives.sumConsecutives(input));
        assertEquals(expected, Consecutives.sumConsecutives(input));
    }

    private static Stream<Arguments> getSumConsecutivesParams() {
        return Stream.of(
                Arguments.of(of(1, 12, 0, 4, 6, 1), of(1, 4, 4, 4, 0, 4, 3, 3, 1)),
                Arguments.of(of(-10, 14, 12, 0),    of(-5, -5, 7, 7, 12, 0)),
                Arguments.of(of(-10, 14, 12, 8),    of(-5, -5, 7, 7, 12, 2, 2, 2, 2))
        );
    }
}
