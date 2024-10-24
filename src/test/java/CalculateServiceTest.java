import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculateServiceTest {

    @Test
    public void testCalculate() {
        CalculateService calculateService = new CalculateService();

        int result1 = calculateService.calculate(10000, 3000, 20000);
        Assertions.assertEquals(3, result1);

        int result2 = calculateService.calculate(100000, 60000, 150000);
        Assertions.assertEquals(2, result2);

    }
}