import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.codewars.com/kata/55eeddff3f64c954c2000059
 */
public class Consecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> result = new ArrayList<>();

        int prevNumber = s.get(0);
        int consecutiveSum = prevNumber;
        for(int index = 1; index < s.size(); index++) {
            int currentNumber = s.get(index);
            if(prevNumber == currentNumber) {
                consecutiveSum += currentNumber;
            } else {
                result.add(consecutiveSum);
                consecutiveSum = currentNumber;

            }
            prevNumber = currentNumber;
        }
        result.add(consecutiveSum);
        return result;
    }
}
