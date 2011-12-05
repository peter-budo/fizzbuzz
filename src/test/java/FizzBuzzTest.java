import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: Peter Miklosko
 * Date: 05/12/2011
 * Time: 11:18
 */
public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void returnsFizzWhenNumberMultipleOfThree() throws Exception{
        assertEquals("Fizz", fizzBuzz.of(3));
        assertEquals("Fizz", fizzBuzz.of(12));
    }

    @Test
    public void returnsBuzzWhenNumberMultipleOfFive() throws Exception{
        assertEquals("Buzz", fizzBuzz.of(5));
        assertEquals("Buzz", fizzBuzz.of(25));
    }

    @Test
    public void returnsFizzBuzzWhenMultipleOfThreeAndFive() throws Exception{
        assertEquals("FizzBuzz", fizzBuzz.of(15));
    }

    @Test
    public void returnsNumber() throws Exception{
        assertEquals("1", fizzBuzz.of(1));
        assertEquals("4", fizzBuzz.of(4));
    }
}
