import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    void test(int expected, int bottomBorder, int topBorder) {
        SQRService service = new SQRService();

        int actual = service.sqrInRange(bottomBorder, topBorder);

        Assertions.assertEquals(expected, actual);

    }
}
