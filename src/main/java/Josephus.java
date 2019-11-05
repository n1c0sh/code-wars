import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/5550d638a99ddb113e0000a2
 */
public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        if(items.isEmpty()) {
            return result;
        }

        int deadmeat = 0;

        while(items.size() > 1) {
            deadmeat = (deadmeat + k - 1) % items.size();
            result.add(items.remove(deadmeat));
        }

        result.add(items.remove(0));
        return result;
    }
}
