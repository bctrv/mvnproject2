import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.mvnproject2.services.CalcService;

public class CalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/incomedata.csv")
    public void testlowincome(int expected, int income, int expenses, int threshold) {
        CalcService service = new CalcService();

        int actual = service.calculate(income, expenses, threshold);

        System.out.println(expected + "== ? ==" + actual);
    }

}
