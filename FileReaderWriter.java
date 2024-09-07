import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReaderWriter {
    public static void main(String[] args) {
        // File paths for input and output files
        String inputFilePath = "input.txt"; // Change to your input file path
        String outputFilePath = "output.txt"; // Change to your output file path

        try (InputStream inputStream = new FileInputStream(inputFilePath);
             OutputStream outputStream = new FileOutputStream(outputFilePath)) {

            // Read content from the input file and write it to the output file
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File content has been copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
