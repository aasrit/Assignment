package Handson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ReadStringWriteString {
    public static void main(String[] args) throws IOException {
        var path="C:\\Users\\amandapa\\project_dir\\date.txt";
        String data=Files.readString(Path.of(path));
        System.out.println(data);
        Files.writeString(Path.of(path)," I am taking Java FullStack training now", StandardOpenOption.APPEND);
    }
}
