import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;
public class FileHelperTest {
    @Test
    public void testBuildFilePath() {
        FileHelper helper = new FileHelper();
        String result = helper.buildFilePath("reports", "summary.txt");
        String expectedPath = "reports" + File.separator + "summary.txt";
        assertEquals(expectedPath, result);
    }
}