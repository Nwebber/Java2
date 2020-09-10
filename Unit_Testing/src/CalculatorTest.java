import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void addition1Plus1() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.add(1,1));
    }

}
