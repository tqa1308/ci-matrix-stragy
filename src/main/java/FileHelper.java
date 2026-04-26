import java.io.File;
public class FileHelper {
    public String buildFilePath(String folder, String fileName) {
        return folder + File.separator + fileName;
    }
}