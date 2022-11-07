import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Assign4 {
    public static void main(String[] args) throws IOException {
        var path="C:\\Users\\amandapa\\project_dir\\StudentList.txt";
        String data= Files.readString(Path.of(path));
        System.out.println(data);
        long numberoflines=data.lines().count();
        System.out.println(numberoflines);


    }
}
