import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculateServiceTest {

    @Test
    public void testCalculate() {
        CalculateService calculateService = new CalculateService();

        int result1 = calculateService.calculate(10000, 3000);
        Assertions.assertEquals(9, result1);

        int result2 = calculateService.calculate(100000, 60000);
        Assertions.assertEquals(7, result2);

        // Другие тесты
        int result3 = calculateService.calculate(15000, 4000);
        Assertions.assertEquals(9, result3);
    }
}