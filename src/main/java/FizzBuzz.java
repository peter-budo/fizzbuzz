import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Peter Miklosko
 * Date: 05/12/2011
 * Time: 11:19
 */
public class FizzBuzz {

    private static final Map<Integer, String> NUMBER_TO_STRING_MAP = new HashMap<Integer, String>() {{
        put(3, "Fizz");
        put(5, "Buzz");
    }};

    public String of(int number) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : NUMBER_TO_STRING_MAP.entrySet()) {
            appendValueIfMultipleOfKey(sb, entry, number);
        }
        return sb.toString().isEmpty() ? String.valueOf(number) : sb.toString();
    }

    private void appendValueIfMultipleOfKey(StringBuilder sb, Map.Entry<Integer, String> entry, int number) {
        if (multipleOf(number, entry.getKey())) {
            sb.append(entry.getValue());
        }
    }

    private boolean multipleOf(int number, int d) {
        return number % d == 0;
    }
}
