import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;
public class FileHelperTest {
    @Test
    public void testBuilderFilePath() {
        FileHelper helper = new FileHelper();
        String result = helper.builderFilePath("reports", "summary.txt");
        String expectedPath = "reports" + File.separator + "summary.txt";
        assertEquals(expectedPath, result, "Duong dan khong tuong thich voi OS hien tai");
    }
}