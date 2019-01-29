import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        List<String> content = new ArrayList();
        content.add("Istvan Aranyi");

        try {
            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath, content);
            System.out.println(Files.isWritable(filePath));

        } catch (Exception ex) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
