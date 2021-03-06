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

        manipulateFile();
    }
    public static void manipulateFile(){

        try {
            List <String> array = new ArrayList<>();
            array.add("István xoxo");
            Files.write(Paths.get("my-file.txt"), array);
        } catch (Exception ex){
        System.err.println("Unable to write file: my-file.txt");
        }
    }
}
