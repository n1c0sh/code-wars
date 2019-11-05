import java.util.HashMap;
import java.util.Map;

import static java.util.Map.of;

/**
 * https://www.codewars.com/kata/52c31f8e6605bcc646000082
 */
public class TwoNumSum {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numberToIndexMap = new HashMap<>(of(numbers[0], 0));

        for (int index = 1; index < numbers.length; index++) {
            int counterpart = target - numbers[index];
            if (numberToIndexMap.containsKey(counterpart)) {
                return new int[]{numberToIndexMap.get(counterpart), index};
            } else {
                numberToIndexMap.put(numbers[index], index);
            }
        }
        return null;
    }
}
