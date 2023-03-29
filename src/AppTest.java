import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void prime() {
        assertEquals(true, App.prime(2));
        assertEquals(true, App.prime(3));
        assertEquals(true, App.prime(5));
        assertEquals(true, App.prime(23));
        assertEquals(false, App.prime(4));
        assertEquals(false, App.prime(10));
    }
    @Test
    public void convertToMinutesAndSeconds() {
        assertEquals("89 minutes, 55 seconds", App.convertToMinutesAndSeconds(5395));
        assertEquals("3 minutes, 20 seconds", App.convertToMinutesAndSeconds(200));
        assertEquals("9 minutes, 10 seconds", App.convertToMinutesAndSeconds(550));
    }
    @Test
    public void convertToBase16Interface() {
        assertEquals("F", App.convertToBase16(15));
        assertEquals("96", App.convertToBase16(150));
        assertEquals("1A4", App.convertToBase16(420));
    }
    @Test
    public void convertInterface() {
        assertEquals("10001110", App.convertToBinary(142));
        assertEquals("1010000", App.convertToBinary(80));
        assertEquals("1110", App.convertToBinary(14));
    }
    @Test
    public void reverse() {
        assertEquals("aloh", App.reverse("hola"));
        assertEquals("trevnoc", App.reverse("convert"));
        assertEquals("ratlusnoc", App.reverse("consultar"));
    }
    @Test
    public void combination() {
        assertEquals(10, App.combination(5,3));
        assertEquals(3, App.combination(3,2));
        assertEquals(36, App.combination(9,2));
    }
    @Test
    public void permutation() {
        assertEquals(30, App.permutation(6,2));
        assertEquals(3, App.permutation(3,2));
        assertEquals(5040, App.permutation(7,6));
    }
    @Test
    public void palindrome() {
        assertEquals(true, App.palindrome("kayak"));
        assertEquals(true, App.palindrome("deified"));
        assertEquals(true, App.palindrome("repaper"));
    }
    @Test
    public void fibonacci() {
        assertEquals("0 1 1 2", App.fibonacci(2));
        assertEquals("0 1 1 2 3 5 8 13 21 34", App.fibonacci(50));
        assertEquals("0 1 1 2 3 5 8 13 21 34 55 89 144", App.fibonacci(200));
    }
    @Test
    public void factorial() {
        assertEquals(5040, App.factorial(7));
        assertEquals(720, App.factorial(6));
        assertEquals(120, App.factorial(5));
    }
    @Test
    public void basicCalculator() {
        assertEquals(9, App.basicCalculator("+",7,2),0.001);
        assertEquals(12, App.basicCalculator("*",6,2),0.001);
        assertEquals(3, App.basicCalculator("/",6,2),0.001);
    }

}
