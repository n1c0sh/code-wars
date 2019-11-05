import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.codewars.com/kata/56af1a20509ce5b9b000001e
 */
public class Travel {
    private static Pattern pattern = Pattern.compile("^(\\d{0,4})\\s(.*)\\s(\\w{2}\\s\\d{5})$");

    public static String travel(String r, String zipcode) {
        List<String> streets = new ArrayList<>();
        List<String> buildings = new ArrayList<>();

        for (String str : r.split(",")) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find() && matcher.group(3).equals(zipcode)) {
                buildings.add(matcher.group(1));
                streets.add(matcher.group(2));
            }
        }
        return zipcode + ":" + String.join(",", streets) + "/" + String.join(",", buildings);
    }
}
